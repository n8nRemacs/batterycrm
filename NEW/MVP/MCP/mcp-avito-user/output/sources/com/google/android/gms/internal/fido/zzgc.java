package com.google.android.gms.internal.fido;

import I41.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgc extends zzge {

    /* renamed from: e, reason: collision with root package name */
    public final char[] f350395e;

    public zzgc(zzgb zzgbVar) {
        super(zzgbVar, (Character) null);
        this.f350395e = new char[512];
        char[] cArr = zzgbVar.f350388b;
        zzbm.zzc(cArr.length == 16);
        for (int i12 = 0; i12 < 256; i12++) {
            char[] cArr2 = this.f350395e;
            cArr2[i12] = cArr[i12 >>> 4];
            cArr2[i12 | 256] = cArr[i12 & 15];
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    public final void a(StringBuilder sb2, byte[] bArr, int i12) {
        zzbm.zze(0, i12, bArr.length);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = bArr[i13] & 255;
            char[] cArr = this.f350395e;
            sb2.append(cArr[i14]);
            sb2.append(cArr[i14 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final zzgf c(zzgb zzgbVar, @a Character ch2) {
        return new zzgc(zzgbVar);
    }
}
