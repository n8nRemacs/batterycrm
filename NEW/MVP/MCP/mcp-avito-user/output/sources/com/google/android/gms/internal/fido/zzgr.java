package com.google.android.gms.internal.fido;

import AK.c;
import androidx.compose.foundation.H;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgr extends zzgu {

    /* renamed from: d, reason: collision with root package name */
    public final int f350406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f350407e;

    public zzgr(byte[] bArr, int i12, int i13) {
        super(bArr);
        zzgx.e(i12, i12 + i13, bArr.length);
        this.f350406d = i12;
        this.f350407e = i13;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte a(int i12) {
        return this.f350408c[this.f350406d + i12];
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final void b(int i12, byte[] bArr) {
        System.arraycopy(this.f350408c, this.f350406d, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final int g() {
        return this.f350406d;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zza(int i12) {
        int i13 = this.f350407e;
        if (((i13 - (i12 + 1)) | i12) >= 0) {
            return this.f350408c[this.f350406d + i12];
        }
        if (i12 < 0) {
            throw new ArrayIndexOutOfBoundsException(c.g(i12, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(H.j(i12, i13, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int zzd() {
        return this.f350407e;
    }
}
