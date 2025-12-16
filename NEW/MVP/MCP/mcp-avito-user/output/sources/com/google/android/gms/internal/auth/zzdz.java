package com.google.android.gms.internal.auth;

import AK.c;
import androidx.compose.foundation.H;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdz extends zzec {

    /* renamed from: d, reason: collision with root package name */
    public final int f350085d;

    public zzdz(byte[] bArr, int i12) {
        super(bArr);
        zzef.e(0, i12, bArr.length);
        this.f350085d = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte a(int i12) {
        return this.f350086c[i12];
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i12) {
        int i13 = this.f350085d;
        if (((i13 - (i12 + 1)) | i12) >= 0) {
            return this.f350086c[i12];
        }
        if (i12 < 0) {
            throw new ArrayIndexOutOfBoundsException(c.g(i12, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(H.j(i12, i13, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.f350085d;
    }
}
