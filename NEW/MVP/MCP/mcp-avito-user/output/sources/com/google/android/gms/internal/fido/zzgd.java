package com.google.android.gms.internal.fido;

import I41.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgd extends zzge {
    public zzgd(zzgb zzgbVar, @a Character ch2) {
        super(zzgbVar, ch2);
        zzbm.zzc(zzgbVar.f350388b.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    public final void a(StringBuilder sb2, byte[] bArr, int i12) {
        int i13 = 0;
        zzbm.zze(0, i12, bArr.length);
        for (int i14 = i12; i14 >= 3; i14 -= 3) {
            int i15 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16) | (bArr[i13 + 2] & 255);
            zzgb zzgbVar = this.f350396b;
            sb2.append(zzgbVar.f350388b[i15 >>> 18]);
            char[] cArr = zzgbVar.f350388b;
            sb2.append(cArr[(i15 >>> 12) & 63]);
            sb2.append(cArr[(i15 >>> 6) & 63]);
            sb2.append(cArr[i15 & 63]);
            i13 += 3;
        }
        if (i13 < i12) {
            d(sb2, bArr, i13, i12 - i13);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final zzgf c(zzgb zzgbVar, @a Character ch2) {
        return new zzgd(zzgbVar, ch2);
    }

    public zzgd(String str, String str2) {
        this(new zzgb(str, str2.toCharArray()), (Character) '=');
    }
}
