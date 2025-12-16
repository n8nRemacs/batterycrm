package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: RendererCapabilities.java */
/* loaded from: classes6.dex */
public interface i0 {

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    static int e(int i12, int i13, int i14) {
        return i12 | i13 | i14 | 128;
    }

    @SuppressLint({"WrongConstant"})
    static int g(int i12) {
        return i12 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int h(int i12) {
        return i12 & 128;
    }

    int f();

    String getName();

    int m();

    int y(I i12);
}
