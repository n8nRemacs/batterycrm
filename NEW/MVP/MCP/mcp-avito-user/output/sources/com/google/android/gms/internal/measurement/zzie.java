package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.H;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
class zzie extends zzif {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f350847d;

    public zzie(byte[] bArr) {
        bArr.getClass();
        this.f350847d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final String b(Charset charset) {
        return new String(this.f350847d, h(), zzb(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final void d(zzhv zzhvVar) {
        zzhvVar.zza(this.f350847d, h(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public byte e(int i12) {
        return this.f350847d[i12];
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhu) || zzb() != ((zzhu) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzie)) {
            return obj.equals(this);
        }
        zzie zzieVar = (zzie) obj;
        int i12 = this.f350838b;
        int i13 = zzieVar.f350838b;
        if (i12 != 0 && i13 != 0 && i12 != i13) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb > zzieVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + iZzb + zzb());
        }
        if (iZzb > zzieVar.zzb()) {
            throw new IllegalArgumentException(H.j(iZzb, zzieVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        int iH2 = h() + iZzb;
        int iH3 = h();
        int iH4 = zzieVar.h();
        while (iH3 < iH2) {
            if (this.f350847d[iH3] != zzieVar.f350847d[iH4]) {
                return false;
            }
            iH3++;
            iH4++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final int g(int i12, int i13) {
        int iH2 = h();
        Charset charset = zzjh.f350896a;
        for (int i14 = iH2; i14 < iH2 + i13; i14++) {
            i12 = (i12 * 31) + this.f350847d[i14];
        }
        return i12;
    }

    public int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public byte zza(int i12) {
        return this.f350847d[i12];
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public int zzb() {
        return this.f350847d.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final boolean zzd() {
        int iH2 = h();
        return zzmp.f351004a.a(iH2, zzb() + iH2, this.f350847d) == 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final zzhu zza(int i12, int i13) {
        int iA2 = zzhu.a(0, i13, zzb());
        return iA2 == 0 ? zzhu.zza : new zzhy(this.f350847d, h(), iA2);
    }
}
