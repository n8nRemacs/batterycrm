package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
class zzcz extends zzcy {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f352402c;

    public zzcz(byte[] bArr) {
        bArr.getClass();
        this.f352402c = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte a(int i12) {
        return this.f352402c[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public void d(int i12, int i13, int i14, byte[] bArr) {
        System.arraycopy(this.f352402c, i12, bArr, i13, i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb) || zzd() != ((zzdb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcz)) {
            return obj.equals(this);
        }
        zzcz zzczVar = (zzcz) obj;
        int i12 = this.f352404b;
        int i13 = zzczVar.f352404b;
        if (i12 == 0 || i13 == 0 || i12 == i13) {
            return v(zzczVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int h(int i12, int i13, int i14) {
        int iW2 = w() + i13;
        Charset charset = zzel.f352447a;
        for (int i15 = iW2; i15 < iW2 + i14; i15++) {
            i12 = (i12 * 31) + this.f352402c[i15];
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int i(int i12, int i13, int i14) {
        int iW2 = w() + i13;
        return zzhe.f352550a.a(i12, iW2, i14 + iW2, this.f352402c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final String l(Charset charset) {
        return new String(this.f352402c, w(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void r(zzcr zzcrVar) {
        ((zzdg) zzcrVar).zzc(this.f352402c, w(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcy
    public final boolean v(zzdb zzdbVar, int i12, int i13) {
        if (i13 > zzdbVar.zzd()) {
            int iZzd = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i13);
            sb2.append(iZzd);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i14 = i12 + i13;
        if (i14 > zzdbVar.zzd()) {
            int iZzd2 = zzdbVar.zzd();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i12);
            sb3.append(", ");
            sb3.append(i13);
            sb3.append(", ");
            sb3.append(iZzd2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (!(zzdbVar instanceof zzcz)) {
            return zzdbVar.zzk(i12, i14).equals(zzk(0, i13));
        }
        zzcz zzczVar = (zzcz) zzdbVar;
        int iW2 = w() + i13;
        int iW3 = w();
        int iW4 = zzczVar.w() + i12;
        while (iW3 < iW2) {
            if (this.f352402c[iW3] != zzczVar.f352402c[iW4]) {
                return false;
            }
            iW3++;
            iW4++;
        }
        return true;
    }

    public int w() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte zza(int i12) {
        return this.f352402c[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public int zzd() {
        return this.f352402c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i12, int i13) {
        int iS2 = zzdb.s(i12, i13, zzd());
        if (iS2 == 0) {
            return zzdb.zzb;
        }
        return new zzcw(this.f352402c, w() + i12, iS2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int iW2 = w();
        return zzhe.f352550a.a(0, iW2, zzd() + iW2, this.f352402c) == 0;
    }
}
