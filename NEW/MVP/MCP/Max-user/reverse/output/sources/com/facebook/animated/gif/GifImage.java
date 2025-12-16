package com.facebook.animated.gif;

import android.graphics.Bitmap;
import defpackage.fz4;
import defpackage.ie7;
import defpackage.nca;
import defpackage.ye;
import java.nio.ByteBuffer;

@fz4
/* loaded from: classes.dex */
public class GifImage {
    public static volatile boolean b;
    public Bitmap.Config a = null;

    @fz4
    private long mNativeContext;

    @fz4
    public GifImage() {
    }

    public static GifImage a(ByteBuffer byteBuffer, ie7 ie7Var) {
        c();
        byteBuffer.rewind();
        ie7Var.getClass();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromDirectByteBuffer.a = ie7Var.b;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage b(long j, int i, ie7 ie7Var) {
        c();
        if (!(j != 0)) {
            throw new IllegalArgumentException();
        }
        ie7Var.getClass();
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromNativeMemory.a = ie7Var.b;
        return gifImageNativeCreateFromNativeMemory;
    }

    public static synchronized void c() {
        if (!b) {
            b = true;
            nca.b("gifimage");
        }
    }

    @fz4
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @fz4
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @fz4
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @fz4
    private native void nativeDispose();

    @fz4
    private native void nativeFinalize();

    @fz4
    private native int nativeGetDuration();

    @fz4
    private native GifFrame nativeGetFrame(int i);

    @fz4
    private native int nativeGetFrameCount();

    @fz4
    private native int[] nativeGetFrameDurations();

    @fz4
    private native int nativeGetHeight();

    @fz4
    private native int nativeGetLoopCount();

    @fz4
    private native int nativeGetSizeInBytes();

    @fz4
    private native int nativeGetWidth();

    @fz4
    private native boolean nativeIsAnimated();

    public final GifFrame d(int i) {
        return nativeGetFrame(i);
    }

    public final int e() {
        return nativeGetFrameCount();
    }

    public final int[] f() {
        return nativeGetFrameDurations();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final ye g(int i) {
        int i2;
        GifFrame gifFrameNativeGetFrame = nativeGetFrame(i);
        try {
            int iE = gifFrameNativeGetFrame.e();
            int iF = gifFrameNativeGetFrame.f();
            int iD = gifFrameNativeGetFrame.d();
            int iC = gifFrameNativeGetFrame.c();
            int iB = gifFrameNativeGetFrame.b();
            if (iB == 0 || iB == 1) {
                i2 = 1;
            } else {
                int i3 = 2;
                if (iB != 2) {
                    i3 = 3;
                    if (iB == 3) {
                    }
                    i2 = 1;
                }
                i2 = i3;
            }
            return new ye(iE, iF, iD, iC, i2);
        } finally {
            gifFrameNativeGetFrame.a();
        }
    }

    public final int h() {
        return nativeGetHeight();
    }

    public final int i() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    public final int j() {
        return nativeGetSizeInBytes();
    }

    public final int k() {
        return nativeGetWidth();
    }

    @fz4
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
