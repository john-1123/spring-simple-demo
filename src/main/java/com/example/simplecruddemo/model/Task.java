package com.example.simplecruddemo.model;

import javax.persistence.*;

@Entity
@Table(name = "task_table")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer taskSeq;
    @Column(name = "task_name")
    String taskName;
    @Column(name = "description")
    String description;

    public Integer getTaskSeq() {
        return taskSeq;
    }

    public void setTaskSeq(Integer taskSeq) {
        this.taskSeq = taskSeq;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskSeq=" + taskSeq +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
