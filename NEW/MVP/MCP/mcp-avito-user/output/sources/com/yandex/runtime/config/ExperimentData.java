package com.yandex.runtime.config;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes8.dex */
public class ExperimentData implements Serializable {
    private int testId;
    private int userBucket;
    private int userGroup;

    public ExperimentData(int i12, int i13, int i14) {
        this.testId = i12;
        this.userGroup = i13;
        this.userBucket = i14;
    }

    public int getTestId() {
        return this.testId;
    }

    public int getUserBucket() {
        return this.userBucket;
    }

    public int getUserGroup() {
        return this.userGroup;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.testId = archive.add(this.testId);
        this.userGroup = archive.add(this.userGroup);
        this.userBucket = archive.add(this.userBucket);
    }

    public ExperimentData() {
    }
}
