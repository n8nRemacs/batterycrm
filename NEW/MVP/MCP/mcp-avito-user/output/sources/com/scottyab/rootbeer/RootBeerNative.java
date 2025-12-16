package com.scottyab.rootbeer;

/* loaded from: classes7.dex */
public class RootBeerNative {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f366280a;

    static {
        try {
            System.loadLibrary("toolChecker");
            f366280a = true;
        } catch (UnsatisfiedLinkError e12) {
            B11.a.a(e12);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z12);
}
