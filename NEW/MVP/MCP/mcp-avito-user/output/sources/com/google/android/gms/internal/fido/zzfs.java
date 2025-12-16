package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzfs extends zzft implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f350377c;

    public zzfs(byte[] bArr) {
        bArr.getClass();
        this.f350377c = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final boolean a(zzft zzftVar) {
        int length = zzftVar.b().length;
        byte[] bArr = this.f350377c;
        if (bArr.length != length) {
            return false;
        }
        boolean z12 = true;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            z12 &= bArr[i12] == zzftVar.b()[i12];
        }
        return z12;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] b() {
        return this.f350377c;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zza() {
        byte[] bArr = this.f350377c;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzbo.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i12 = bArr[0] & 255;
        int i13 = bArr[1] & 255;
        int i14 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i12 | (i13 << 8) | (i14 << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zzb() {
        return this.f350377c.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zzd() {
        return (byte[]) this.f350377c.clone();
    }
}
