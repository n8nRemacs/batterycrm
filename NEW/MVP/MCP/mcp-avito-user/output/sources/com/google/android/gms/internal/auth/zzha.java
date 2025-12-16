package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzha {

    /* renamed from: e, reason: collision with root package name */
    public static final zzha f350166e = new zzha(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f350167a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f350168b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f350169c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f350170d;

    public zzha(int i12, int[] iArr, Object[] objArr, boolean z12) {
        this.f350167a = i12;
        this.f350168b = iArr;
        this.f350169c = objArr;
        this.f350170d = z12;
    }

    public static zzha a() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    public static zzha zza() {
        return f350166e;
    }

    public final void b(int i12, Object obj) {
        if (!this.f350170d) {
            throw new UnsupportedOperationException();
        }
        c(this.f350167a + 1);
        int[] iArr = this.f350168b;
        int i13 = this.f350167a;
        iArr[i13] = i12;
        this.f350169c[i13] = obj;
        this.f350167a = i13 + 1;
    }

    public final void c(int i12) {
        int[] iArr = this.f350168b;
        if (i12 > iArr.length) {
            int i13 = this.f350167a;
            int i14 = (i13 / 2) + i13;
            if (i14 >= i12) {
                i12 = i14;
            }
            if (i12 < 8) {
                i12 = 8;
            }
            this.f350168b = Arrays.copyOf(iArr, i12);
            this.f350169c = Arrays.copyOf(this.f350169c, i12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        int i12 = this.f350167a;
        if (i12 == zzhaVar.f350167a) {
            int[] iArr = this.f350168b;
            int[] iArr2 = zzhaVar.f350168b;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    Object[] objArr = this.f350169c;
                    Object[] objArr2 = zzhaVar.f350169c;
                    int i14 = this.f350167a;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (objArr[i15].equals(objArr2[i15])) {
                        }
                    }
                    return true;
                }
                if (iArr[i13] != iArr2[i13]) {
                    break;
                }
                i13++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f350167a;
        int i13 = i12 + 527;
        int[] iArr = this.f350168b;
        int iHashCode = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i13 * 31) + i14;
        Object[] objArr = this.f350169c;
        int i17 = this.f350167a;
        for (int i18 = 0; i18 < i17; i18++) {
            iHashCode = (iHashCode * 31) + objArr[i18].hashCode();
        }
        return (i16 * 31) + iHashCode;
    }

    public final void zzf() {
        if (this.f350170d) {
            this.f350170d = false;
        }
    }

    public zzha() {
        this(0, new int[8], new Object[8], true);
    }
}
