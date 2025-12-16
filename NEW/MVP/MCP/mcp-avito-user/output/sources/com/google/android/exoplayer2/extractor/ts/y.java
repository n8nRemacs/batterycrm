package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.O;
import com.google.android.exoplayer2.util.U;

/* compiled from: SectionReader.java */
/* loaded from: classes6.dex */
public final class y implements D {

    /* renamed from: a, reason: collision with root package name */
    public final x f345334a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345335b = new com.google.android.exoplayer2.util.F(32);

    /* renamed from: c, reason: collision with root package name */
    public int f345336c;

    /* renamed from: d, reason: collision with root package name */
    public int f345337d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f345338e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345339f;

    public y(x xVar) {
        this.f345334a = xVar;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.D
    public final void a() {
        this.f345339f = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.D
    public final void b(O o12, com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        this.f345334a.b(o12, lVar, eVar);
        this.f345339f = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.D
    public final void c(int i12, com.google.android.exoplayer2.util.F f12) {
        boolean z12 = (i12 & 1) != 0;
        int iR2 = z12 ? f12.f348071b + f12.r() : -1;
        if (this.f345339f) {
            if (!z12) {
                return;
            }
            this.f345339f = false;
            f12.B(iR2);
            this.f345337d = 0;
        }
        while (f12.a() > 0) {
            int i13 = this.f345337d;
            com.google.android.exoplayer2.util.F f13 = this.f345335b;
            if (i13 < 3) {
                if (i13 == 0) {
                    int iR3 = f12.r();
                    f12.B(f12.f348071b - 1);
                    if (iR3 == 255) {
                        this.f345339f = true;
                        return;
                    }
                }
                int iMin = Math.min(f12.a(), 3 - this.f345337d);
                f12.c(this.f345337d, iMin, f13.f348070a);
                int i14 = this.f345337d + iMin;
                this.f345337d = i14;
                if (i14 == 3) {
                    f13.B(0);
                    f13.A(3);
                    f13.C(1);
                    int iR4 = f13.r();
                    int iR5 = f13.r();
                    this.f345338e = (iR4 & 128) != 0;
                    int i15 = (((iR4 & 15) << 8) | iR5) + 3;
                    this.f345336c = i15;
                    byte[] bArr = f13.f348070a;
                    if (bArr.length < i15) {
                        f13.b(Math.min(4098, Math.max(i15, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(f12.a(), this.f345336c - this.f345337d);
                f12.c(this.f345337d, iMin2, f13.f348070a);
                int i16 = this.f345337d + iMin2;
                this.f345337d = i16;
                int i17 = this.f345336c;
                if (i16 != i17) {
                    continue;
                } else {
                    if (this.f345338e) {
                        byte[] bArr2 = f13.f348070a;
                        int i18 = U.f348106a;
                        int i19 = -1;
                        for (int i22 = 0; i22 < i17; i22++) {
                            i19 = U.f348117l[((i19 >>> 24) ^ (bArr2[i22] & 255)) & 255] ^ (i19 << 8);
                        }
                        if (i19 != 0) {
                            this.f345339f = true;
                            return;
                        }
                        f13.A(this.f345336c - 4);
                    } else {
                        f13.A(i17);
                    }
                    f13.B(0);
                    this.f345334a.c(f13);
                    this.f345337d = 0;
                }
            }
        }
    }
}
