package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzga extends zzdb {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f352506h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: c, reason: collision with root package name */
    public final int f352507c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdb f352508d;

    /* renamed from: e, reason: collision with root package name */
    public final zzdb f352509e;

    /* renamed from: f, reason: collision with root package name */
    public final int f352510f;

    /* renamed from: g, reason: collision with root package name */
    public final int f352511g;

    public zzga(zzdb zzdbVar, zzdb zzdbVar2) {
        this.f352508d = zzdbVar;
        this.f352509e = zzdbVar2;
        int iZzd = zzdbVar.zzd();
        this.f352510f = iZzd;
        this.f352507c = zzdbVar2.zzd() + iZzd;
        this.f352511g = Math.max(zzdbVar.e(), zzdbVar2.e()) + 1;
    }

    public static int v(int i12) {
        int[] iArr = f352506h;
        if (i12 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte a(int i12) {
        int i13 = this.f352510f;
        return i12 < i13 ? this.f352508d.a(i12) : this.f352509e.a(i12 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void d(int i12, int i13, int i14, byte[] bArr) {
        int i15 = i12 + i14;
        zzdb zzdbVar = this.f352508d;
        int i16 = this.f352510f;
        if (i15 <= i16) {
            zzdbVar.d(i12, i13, i14, bArr);
            return;
        }
        zzdb zzdbVar2 = this.f352509e;
        if (i12 >= i16) {
            zzdbVar2.d(i12 - i16, i13, i14, bArr);
            return;
        }
        int i17 = i16 - i12;
        zzdbVar.d(i12, i13, i17, bArr);
        zzdbVar2.d(0, i13 + i17, i14 - i17, bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int e() {
        return this.f352511g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        int iZzd = zzdbVar.zzd();
        int i12 = this.f352507c;
        if (i12 != iZzd) {
            return false;
        }
        if (i12 == 0) {
            return true;
        }
        int i13 = this.f352404b;
        int i14 = zzdbVar.f352404b;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        zzfz zzfzVar = new zzfz(this, null);
        zzcy next = zzfzVar.next();
        zzfz zzfzVar2 = new zzfz(zzdbVar, null);
        zzcy next2 = zzfzVar2.next();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int iZzd2 = next.zzd() - i15;
            int iZzd3 = next2.zzd() - i16;
            int iMin = Math.min(iZzd2, iZzd3);
            if (!(i15 == 0 ? next.v(next2, i16, iMin) : next2.v(next, i15, iMin))) {
                return false;
            }
            i17 += iMin;
            if (i17 >= i12) {
                if (i17 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd2) {
                next = zzfzVar.next();
                i15 = 0;
            } else {
                i15 += iMin;
                next = next;
            }
            if (iMin == iZzd3) {
                next2 = zzfzVar2.next();
                i16 = 0;
            } else {
                i16 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean g() {
        return this.f352507c >= v(this.f352511g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int h(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        zzdb zzdbVar = this.f352508d;
        int i16 = this.f352510f;
        if (i15 <= i16) {
            return zzdbVar.h(i12, i13, i14);
        }
        zzdb zzdbVar2 = this.f352509e;
        if (i13 >= i16) {
            return zzdbVar2.h(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return zzdbVar2.h(zzdbVar.h(i12, i13, i17), 0, i14 - i17);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int i(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        zzdb zzdbVar = this.f352508d;
        int i16 = this.f352510f;
        if (i15 <= i16) {
            return zzdbVar.i(i12, i13, i14);
        }
        zzdb zzdbVar2 = this.f352509e;
        if (i13 >= i16) {
            return zzdbVar2.i(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return zzdbVar2.i(zzdbVar.i(i12, i13, i17), 0, i14 - i17);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfx(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final String l(Charset charset) {
        return new String(zzy(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void r(zzcr zzcrVar) {
        this.f352508d.r(zzcrVar);
        this.f352509e.r(zzcrVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza(int i12) {
        zzdb.t(i12, this.f352507c);
        return a(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzd() {
        return this.f352507c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i12, int i13) {
        int i14 = this.f352507c;
        int iS2 = zzdb.s(i12, i13, i14);
        if (iS2 == 0) {
            return zzdb.zzb;
        }
        if (iS2 == i14) {
            return this;
        }
        zzdb zzdbVar = this.f352508d;
        int i15 = this.f352510f;
        if (i13 <= i15) {
            return zzdbVar.zzk(i12, i13);
        }
        zzdb zzdbVar2 = this.f352509e;
        return i12 >= i15 ? zzdbVar2.zzk(i12 - i15, i13 - i15) : new zzga(zzdbVar.zzk(i12, zzdbVar.zzd()), zzdbVar2.zzk(0, i13 - i15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int i12 = this.f352508d.i(0, 0, this.f352510f);
        zzdb zzdbVar = this.f352509e;
        return zzdbVar.i(i12, 0, zzdbVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    /* renamed from: zzq */
    public final zzcx iterator() {
        return new zzfx(this);
    }

    public /* synthetic */ zzga(zzdb zzdbVar, zzdb zzdbVar2, zzfx zzfxVar) {
        this(zzdbVar, zzdbVar2);
    }
}
