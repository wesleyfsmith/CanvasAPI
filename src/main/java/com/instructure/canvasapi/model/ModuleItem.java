package com.instructure.canvasapi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Brady Larson on 10/15/13.
 *
 * Copyright (c) 2014 Instructure. All rights reserved.
 */
public class ModuleItem extends CanvasModel<ModuleItem> {

    /**
     * {
     // the unique identifier for the module item
     id: 768,

     // the position of this item in the module (1-based)
     position: 1,

     // the title of this item
     title: "Square Roots: Irrational numbers or boxy vegetables?",

     // 0-based indent level; module items may be indented to show a hierarchy
     indent: 0,

     // the type of object referred to
     // one of "File", "Page", "Discussion", "Assignment", "Quiz", "SubHeader",
     // "ExternalUrl", "ExternalTool"
     type: "Assignment",

     // link to the item in Canvas
     html_url: "https://canvas.example.edu/courses/222/modules/items/768",

     // (Optional) link to the Canvas API object, if applicable
     url: "https://canvas.example.edu/api/v1/courses/222/assignments/987",

     // Completion requirement for this module item
     completion_requirement: {
     // one of "must_view", "must_submit", "must_contribute", "min_score"
     type: "min_score",

     // minimum score required to complete (only present when type == 'min_score')
     min_score: 10,

     // whether the calling user has met this requirement
     // (Optional; present only if the caller is a student)
     completed: true
     }
     }
     */
    private long id;
    private int position;
    private String title;
    private int indent;
    private String type;
    private String html_url;
    private String url;
    private CompletionRequirement completion_requirement;
    public class CompletionRequirement implements Serializable {

        private static final long serialVersionUID = 1L;
        private String type;
        private int min_score;
        private boolean completed;

        public int getMin_score() {
            return min_score;
        }
        public void setMin_score(int min_score) {
            this.min_score = min_score;
        }
        public boolean isCompleted() {
            return completed;
        }
        public void setCompleted(boolean completed) {
            this.completed = completed;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
    }

    @Override
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getIndent() {
        return indent;
    }
    public void setIndent(int indent) {
        this.indent = indent;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getHtml_url() {
        return html_url;
    }
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public CompletionRequirement getCompletionRequirement() {
        return completion_requirement;
    }
    public void setCompletionRequirement(CompletionRequirement completionRequirement) {
        this.completion_requirement = completionRequirement;
    }

    public ModuleItem() {}

    ///////////////////////////////////////////////////////////////////////////
    // Required Overrides
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public Date getComparisonDate() {
        return null;
    }

    @Override
    public String getComparisonString() {
        return title;
    }
}

