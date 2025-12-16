package com.yandex.runtime.image;

/* loaded from: classes8.dex */
public class Frame {
    private final long duration;
    private final ImageProvider image;

    public Frame(ImageProvider imageProvider, long j12) {
        this.image = imageProvider;
        this.duration = j12;
    }

    public long getDuration() {
        return this.duration;
    }

    public ImageProvider getImage() {
        return this.image;
    }
}
