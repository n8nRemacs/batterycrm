package com.google.android.gms.common;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class K extends J {

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f348872p;

    public K(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f348872p = bArr;
    }

    @Override // com.google.android.gms.common.J
    public final byte[] g4() {
        return this.f348872p;
    }
}
