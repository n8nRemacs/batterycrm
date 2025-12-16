package com.google.android.gms.internal.fido;

import AK.c;
import I41.a;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgb {

    /* renamed from: a, reason: collision with root package name */
    public final String f350387a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f350388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350389c;

    /* renamed from: d, reason: collision with root package name */
    public final int f350390d;

    /* renamed from: e, reason: collision with root package name */
    public final int f350391e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350392f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f350393g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f350394h;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i12 = 0; i12 < cArr.length; i12++) {
            char c12 = cArr[i12];
            boolean z12 = true;
            zzbm.zzd(c12 < 128, "Non-ASCII character: %s", c12);
            if (bArr[c12] != -1) {
                z12 = false;
            }
            zzbm.zzd(z12, "Duplicate character: %s", c12);
            bArr[c12] = (byte) i12;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.f350394h == zzgbVar.f350394h && Arrays.equals(this.f350388b, zzgbVar.f350388b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f350388b) + (true != this.f350394h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f350387a;
    }

    public final boolean zzc(char c12) {
        byte[] bArr = this.f350393g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public zzgb(String str, char[] cArr, byte[] bArr, boolean z12) {
        this.f350387a = str;
        cArr.getClass();
        this.f350388b = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzgh.zzb(length, RoundingMode.UNNECESSARY);
            this.f350390d = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i12 = 1 << (3 - iNumberOfTrailingZeros);
            this.f350391e = i12;
            this.f350392f = iZzb >> iNumberOfTrailingZeros;
            this.f350389c = length - 1;
            this.f350393g = bArr;
            boolean[] zArr = new boolean[i12];
            for (int i13 = 0; i13 < this.f350392f; i13++) {
                zArr[zzgh.zza(i13 * 8, this.f350390d, RoundingMode.CEILING)] = true;
            }
            this.f350394h = z12;
        } catch (ArithmeticException e12) {
            throw new IllegalArgumentException(c.g(cArr.length, "Illegal alphabet length "), e12);
        }
    }
}
