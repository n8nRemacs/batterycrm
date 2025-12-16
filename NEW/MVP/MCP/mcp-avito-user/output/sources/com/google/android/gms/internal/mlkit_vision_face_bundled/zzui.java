package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.compose.foundation.H;
import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
class zzui extends zzuh {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f354028c;

    public zzui(byte[] bArr) {
        bArr.getClass();
        this.f354028c = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public byte a(int i12) {
        return this.f354028c[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final int b(int i12, int i13) {
        Charset charset = zzvt.f354067a;
        for (int i14 = 0; i14 < i13; i14++) {
            i12 = (i12 * 31) + this.f354028c[i14];
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final String d(Charset charset) {
        return new String(this.f354028c, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final void e(zzub zzubVar) {
        ((zzuq) zzubVar).zzc(this.f354028c, 0, zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzul) || zzd() != ((zzul) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzui)) {
            return obj.equals(this);
        }
        zzui zzuiVar = (zzui) obj;
        int i12 = this.f354029b;
        int i13 = zzuiVar.f354029b;
        if (i12 != 0 && i13 != 0 && i12 != i13) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzuiVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzuiVar.zzd()) {
            throw new IllegalArgumentException(H.j(iZzd, zzuiVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < iZzd) {
            if (this.f354028c[i14] != zzuiVar.f354028c[i15]) {
                return false;
            }
            i14++;
            i15++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public byte zza(int i12) {
        return this.f354028c[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public int zzd() {
        return this.f354028c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final zzul zzf(int i12, int i13) {
        int iG2 = zzul.g(0, i13, zzd());
        return iG2 == 0 ? zzul.zzb : new zzuf(this.f354028c, iG2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final boolean zzi() {
        return zzyl.f354154a.a(0, zzd(), this.f354028c) == 0;
    }
}
