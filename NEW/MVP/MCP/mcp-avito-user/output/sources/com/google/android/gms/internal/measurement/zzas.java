package com.google.android.gms.internal.measurement;

import AK.c;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzas implements zzaq, Iterable<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    public final String f350567b;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f350567b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.f350567b.equals(((zzas) obj).f350567b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f350567b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return c.s(new StringBuilder("\""), this.f350567b, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0180 A[PHI: r0 r2 r7 r16
  0x0180: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v9 java.lang.String) binds: [B:104:0x017e, B:100:0x016c] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:104:0x017e, B:100:0x016c] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v6 java.lang.String) binds: [B:104:0x017e, B:100:0x016c] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r16v5 java.lang.String) = (r16v4 java.lang.String), (r16v6 java.lang.String) binds: [B:104:0x017e, B:100:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad A[PHI: r0 r2 r3 r7 r16 r17
  0x01ad: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v6 java.lang.String) binds: [B:112:0x01ab, B:108:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x01ad: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:112:0x01ab, B:108:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x01ad: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:112:0x01ab, B:108:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x01ad: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:112:0x01ab, B:108:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x01ad: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v3 java.lang.String) binds: [B:112:0x01ab, B:108:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x01ad: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v4 java.lang.String) binds: [B:112:0x01ab, B:108:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    @Override // com.google.android.gms.internal.measurement.zzaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r22, com.google.android.gms.internal.measurement.zzh r23, java.util.List<com.google.android.gms.internal.measurement.zzaq> r24) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.f350567b);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.f350567b.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        String str = this.f350567b;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.f350567b;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }
}
