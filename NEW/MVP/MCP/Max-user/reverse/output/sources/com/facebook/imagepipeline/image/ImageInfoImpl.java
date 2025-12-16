package com.facebook.imagepipeline.image;

import defpackage.ksc;
import defpackage.pe7;
import java.util.Map;

/* loaded from: classes.dex */
public class ImageInfoImpl implements pe7 {
    private final Map<String, Object> extras;
    private final int height;
    private final ksc qualityInfo;
    private final int sizeInBytes;
    private final int width;

    public ImageInfoImpl(int i, int i2, int i3, ksc kscVar, Map<String, Object> map) {
        this.width = i;
        this.height = i2;
        this.sizeInBytes = i3;
        this.qualityInfo = kscVar;
        this.extras = map;
    }

    @Override // defpackage.pe7, com.facebook.fresco.middleware.HasExtraData
    public Map<String, Object> getExtras() {
        return this.extras;
    }

    @Override // defpackage.pe7
    public int getHeight() {
        return this.height;
    }

    public ksc getQualityInfo() {
        return this.qualityInfo;
    }

    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    @Override // defpackage.pe7
    public int getWidth() {
        return this.width;
    }
}
