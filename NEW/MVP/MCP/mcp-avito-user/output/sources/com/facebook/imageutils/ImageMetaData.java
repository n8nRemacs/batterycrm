package com.facebook.imageutils;

import I41.h;
import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe
/* loaded from: classes15.dex */
public class ImageMetaData {

    /* renamed from: a, reason: collision with root package name */
    @h
    public final Pair<Integer, Integer> f340819a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final ColorSpace f340820b;

    public ImageMetaData(int i12, int i13, @h ColorSpace colorSpace) {
        this.f340819a = (i12 == -1 || i13 == -1) ? null : new Pair<>(Integer.valueOf(i12), Integer.valueOf(i13));
        this.f340820b = colorSpace;
    }

    @h
    public ColorSpace getColorSpace() {
        return this.f340820b;
    }

    @h
    public Pair<Integer, Integer> getDimensions() {
        return this.f340819a;
    }
}
