package com.google.android.play.core.splitinstall.internal;

import java.security.cert.X509Certificate;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class e0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f358755c;

    public e0(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f358755c = bArr;
    }

    @Override // com.google.android.play.core.splitinstall.internal.f0, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f358755c;
    }
}
