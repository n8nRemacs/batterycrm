package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
abstract class L extends J {

    /* renamed from: q, reason: collision with root package name */
    public static final WeakReference f348873q = new WeakReference(null);

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f348874p;

    public L(byte[] bArr) {
        super(bArr);
        this.f348874p = f348873q;
    }

    @Override // com.google.android.gms.common.J
    public final byte[] g4() {
        byte[] bArrH4;
        synchronized (this) {
            try {
                bArrH4 = (byte[]) this.f348874p.get();
                if (bArrH4 == null) {
                    bArrH4 = h4();
                    this.f348874p = new WeakReference(bArrH4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrH4;
    }

    public abstract byte[] h4();
}
