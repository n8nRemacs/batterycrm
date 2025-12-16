package org.webrtc;

/* loaded from: classes9.dex */
class Histogram {
    private final long handle;

    private Histogram(long j12) {
        this.handle = j12;
    }

    public static Histogram createCounts(String str, int i12, int i13, int i14) {
        return new Histogram(nativeCreateCounts(str, i12, i13, i14));
    }

    public static Histogram createEnumeration(String str, int i12) {
        return new Histogram(nativeCreateEnumeration(str, i12));
    }

    private static native void nativeAddSample(long j12, int i12);

    private static native long nativeCreateCounts(String str, int i12, int i13, int i14);

    private static native long nativeCreateEnumeration(String str, int i12);

    public void addSample(int i12) {
        nativeAddSample(this.handle, i12);
    }
}
