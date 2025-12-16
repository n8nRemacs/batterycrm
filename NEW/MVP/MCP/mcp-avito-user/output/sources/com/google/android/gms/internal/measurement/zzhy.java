package com.google.android.gms.internal.measurement;

import AK.c;
import androidx.compose.foundation.H;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzhy extends zzie {

    /* renamed from: e, reason: collision with root package name */
    public final int f350842e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350843f;

    public zzhy(byte[] bArr, int i12, int i13) {
        super(bArr);
        zzhu.a(i12, i12 + i13, bArr.length);
        this.f350842e = i12;
        this.f350843f = i13;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, com.google.android.gms.internal.measurement.zzhu
    public final byte e(int i12) {
        return this.f350847d[this.f350842e + i12];
    }

    @Override // com.google.android.gms.internal.measurement.zzie
    public final int h() {
        return this.f350842e;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, com.google.android.gms.internal.measurement.zzhu
    public final byte zza(int i12) {
        int iZzb = zzb();
        if (((iZzb - (i12 + 1)) | i12) >= 0) {
            return this.f350847d[this.f350842e + i12];
        }
        if (i12 < 0) {
            throw new ArrayIndexOutOfBoundsException(c.g(i12, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(H.j(i12, iZzb, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.measurement.zzie, com.google.android.gms.internal.measurement.zzhu
    public final int zzb() {
        return this.f350843f;
    }
}
