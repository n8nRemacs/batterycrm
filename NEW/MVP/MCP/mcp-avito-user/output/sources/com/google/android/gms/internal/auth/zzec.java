package com.google.android.gms.internal.auth;

import androidx.compose.foundation.H;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
class zzec extends zzeb {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f350086c;

    public zzec(byte[] bArr) {
        bArr.getClass();
        this.f350086c = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte a(int i12) {
        return this.f350086c[i12];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final int b(int i12, int i13) {
        Charset charset = zzfa.f350106a;
        for (int i14 = 0; i14 < i13; i14++) {
            i12 = (i12 * 31) + this.f350086c[i14];
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final String d(Charset charset) {
        return new String(this.f350086c, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzef) || zzd() != ((zzef) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzec)) {
            return obj.equals(this);
        }
        zzec zzecVar = (zzec) obj;
        int i12 = this.f350087b;
        int i13 = zzecVar.f350087b;
        if (i12 != 0 && i13 != 0 && i12 != i13) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzecVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzecVar.zzd()) {
            throw new IllegalArgumentException(H.j(iZzd, zzecVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < iZzd) {
            if (this.f350086c[i14] != zzecVar.f350086c[i15]) {
                return false;
            }
            i14++;
            i15++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zza(int i12) {
        return this.f350086c[i12];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int zzd() {
        return this.f350086c.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final zzef zzf(int i12, int i13) {
        int iE2 = zzef.e(0, i13, zzd());
        return iE2 == 0 ? zzef.zzb : new zzdz(this.f350086c, iE2);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean zzh() {
        return zzhn.f350181a.a(0, zzd(), this.f350086c) == 0;
    }
}
