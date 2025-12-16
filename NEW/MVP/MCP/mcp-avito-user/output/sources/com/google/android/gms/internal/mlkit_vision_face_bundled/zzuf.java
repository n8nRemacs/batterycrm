package com.google.android.gms.internal.mlkit_vision_face_bundled;

import AK.c;
import androidx.compose.foundation.H;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzuf extends zzui {

    /* renamed from: d, reason: collision with root package name */
    public final int f354027d;

    public zzuf(byte[] bArr, int i12) {
        super(bArr);
        zzul.g(0, i12, bArr.length);
        this.f354027d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzui, com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final byte a(int i12) {
        return this.f354028c[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzui, com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final byte zza(int i12) {
        int i13 = this.f354027d;
        if (((i13 - (i12 + 1)) | i12) >= 0) {
            return this.f354028c[i12];
        }
        if (i12 < 0) {
            throw new ArrayIndexOutOfBoundsException(c.g(i12, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(H.j(i12, i13, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzui, com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
    public final int zzd() {
        return this.f354027d;
    }
}
