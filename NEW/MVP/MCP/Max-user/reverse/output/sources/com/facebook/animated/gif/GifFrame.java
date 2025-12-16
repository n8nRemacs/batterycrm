package com.facebook.animated.gif;

import android.graphics.Bitmap;
import defpackage.fz4;

/* loaded from: classes.dex */
public class GifFrame {

    @fz4
    private long mNativeContext;

    @fz4
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @fz4
    private native void nativeDispose();

    @fz4
    private native void nativeFinalize();

    @fz4
    private native int nativeGetDisposalMode();

    @fz4
    private native int nativeGetDurationMs();

    @fz4
    private native int nativeGetHeight();

    @fz4
    private native int nativeGetTransparentPixelColor();

    @fz4
    private native int nativeGetWidth();

    @fz4
    private native int nativeGetXOffset();

    @fz4
    private native int nativeGetYOffset();

    @fz4
    private native boolean nativeHasTransparency();

    @fz4
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public final void a() {
        nativeDispose();
    }

    public final int b() {
        return nativeGetDisposalMode();
    }

    public final int c() {
        return nativeGetHeight();
    }

    public final int d() {
        return nativeGetWidth();
    }

    public final int e() {
        return nativeGetXOffset();
    }

    public final int f() {
        return nativeGetYOffset();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final void g(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
