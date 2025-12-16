package com.adjust.sdk.sig;

import android.content.Context;

/* loaded from: classes10.dex */
class NativeLibHelper implements a {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e12) {
            e12.getMessage();
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i12);

    public final void a() {
        nOnResume();
    }

    public final byte[] a(Context context, Object obj, byte[] bArr, int i12) {
        return nSign(context, obj, bArr, i12);
    }
}
