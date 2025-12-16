package com.google.android.gms.internal.fido;

import androidx.compose.foundation.H;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
class zzgu extends zzgt {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f350408c;

    public zzgu(byte[] bArr) {
        bArr.getClass();
        this.f350408c = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte a(int i12) {
        return this.f350408c[i12];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public void b(int i12, byte[] bArr) {
        System.arraycopy(this.f350408c, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final int d(int i12, int i13) {
        int iG2 = g();
        byte[] bArr = zzhc.zzd;
        for (int i14 = iG2; i14 < iG2 + i13; i14++) {
            i12 = (i12 * 31) + this.f350408c[i14];
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgx) || zzd() != ((zzgx) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgu)) {
            return obj.equals(this);
        }
        zzgu zzguVar = (zzgu) obj;
        int i12 = this.f350409b;
        int i13 = zzguVar.f350409b;
        if (i12 != 0 && i13 != 0 && i12 != i13) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzguVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzguVar.zzd()) {
            throw new IllegalArgumentException(H.j(iZzd, zzguVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        int iG2 = g() + iZzd;
        int iG3 = g();
        int iG4 = zzguVar.g();
        while (iG3 < iG2) {
            if (this.f350408c[iG3] != zzguVar.f350408c[iG4]) {
                return false;
            }
            iG3++;
            iG4++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte zza(int i12) {
        return this.f350408c[i12];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int zzd() {
        return this.f350408c.length;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final zzgx zzg(int i12, int i13) {
        int iE2 = zzgx.e(i12, i13, zzd());
        if (iE2 == 0) {
            return zzgx.zzb;
        }
        return new zzgr(this.f350408c, g() + i12, iE2);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final InputStream zzh() {
        return new ByteArrayInputStream(this.f350408c, g(), zzd());
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.f350408c, g(), zzd()).asReadOnlyBuffer();
    }
}
