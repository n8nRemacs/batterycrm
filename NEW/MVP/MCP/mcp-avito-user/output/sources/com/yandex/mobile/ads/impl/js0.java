package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.vm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes8.dex */
public final class js0 extends d41 {

    /* renamed from: m, reason: collision with root package name */
    private final pr0 f386954m = new pr0();

    /* renamed from: n, reason: collision with root package name */
    private final pr0 f386955n = new pr0();

    /* renamed from: o, reason: collision with root package name */
    private final a f386956o = new a();

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private Inflater f386957p;

    @Override // com.yandex.mobile.ads.impl.d41
    public final t71 a(byte[] bArr, int i12, boolean z12) {
        this.f386954m.a(i12, bArr);
        pr0 pr0Var = this.f386954m;
        if (pr0Var.a() > 0 && pr0Var.g() == 120) {
            if (this.f386957p == null) {
                this.f386957p = new Inflater();
            }
            if (pc1.a(pr0Var, this.f386955n, this.f386957p)) {
                pr0Var.a(this.f386955n.e(), this.f386955n.c());
            }
        }
        this.f386956o.b();
        ArrayList arrayList = new ArrayList();
        while (this.f386954m.a() >= 3) {
            pr0 pr0Var2 = this.f386954m;
            a aVar = this.f386956o;
            int iE2 = pr0Var2.e();
            int iT2 = pr0Var2.t();
            int iZ2 = pr0Var2.z();
            int iD2 = pr0Var2.d() + iZ2;
            vm vmVarA = null;
            if (iD2 > iE2) {
                pr0Var2.e(iE2);
            } else {
                if (iT2 != 128) {
                    switch (iT2) {
                        case 20:
                            a.a(aVar, pr0Var2, iZ2);
                            break;
                        case 21:
                            a.b(aVar, pr0Var2, iZ2);
                            break;
                        case 22:
                            a.c(aVar, pr0Var2, iZ2);
                            break;
                    }
                } else {
                    vmVarA = aVar.a();
                    aVar.b();
                }
                pr0Var2.e(iD2);
            }
            if (vmVarA != null) {
                arrayList.add(vmVarA);
            }
        }
        return new ks0(Collections.unmodifiableList(arrayList));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final pr0 f386958a = new pr0();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f386959b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f386960c;

        /* renamed from: d, reason: collision with root package name */
        private int f386961d;

        /* renamed from: e, reason: collision with root package name */
        private int f386962e;

        /* renamed from: f, reason: collision with root package name */
        private int f386963f;

        /* renamed from: g, reason: collision with root package name */
        private int f386964g;

        /* renamed from: h, reason: collision with root package name */
        private int f386965h;

        /* renamed from: i, reason: collision with root package name */
        private int f386966i;

        public static void a(a aVar, pr0 pr0Var, int i12) {
            aVar.getClass();
            if (i12 % 5 != 2) {
                return;
            }
            pr0Var.f(2);
            Arrays.fill(aVar.f386959b, 0);
            int i13 = i12 / 5;
            for (int i14 = 0; i14 < i13; i14++) {
                int iT2 = pr0Var.t();
                int iT3 = pr0Var.t();
                int iT4 = pr0Var.t();
                int iT5 = pr0Var.t();
                int iT6 = pr0Var.t();
                double d12 = iT3;
                double d13 = iT4 - 128;
                int i15 = (int) ((1.402d * d13) + d12);
                double d14 = iT5 - 128;
                int i16 = (int) ((d12 - (0.34414d * d14)) - (d13 * 0.71414d));
                int i17 = (int) ((d14 * 1.772d) + d12);
                int[] iArr = aVar.f386959b;
                int i18 = pc1.f388768a;
                iArr[iT2] = (Math.max(0, Math.min(i16, 255)) << 8) | (iT6 << 24) | (Math.max(0, Math.min(i15, 255)) << 16) | Math.max(0, Math.min(i17, 255));
            }
            aVar.f386960c = true;
        }

        public static void b(a aVar, pr0 pr0Var, int i12) {
            int iW2;
            aVar.getClass();
            if (i12 < 4) {
                return;
            }
            pr0Var.f(3);
            int i13 = i12 - 4;
            if ((pr0Var.t() & 128) != 0) {
                if (i13 < 7 || (iW2 = pr0Var.w()) < 4) {
                    return;
                }
                aVar.f386965h = pr0Var.z();
                aVar.f386966i = pr0Var.z();
                aVar.f386958a.c(iW2 - 4);
                i13 = i12 - 11;
            }
            int iD2 = aVar.f386958a.d();
            int iE2 = aVar.f386958a.e();
            if (iD2 >= iE2 || i13 <= 0) {
                return;
            }
            int iMin = Math.min(i13, iE2 - iD2);
            pr0Var.a(aVar.f386958a.c(), iD2, iMin);
            aVar.f386958a.e(iD2 + iMin);
        }

        public static void c(a aVar, pr0 pr0Var, int i12) {
            aVar.getClass();
            if (i12 < 19) {
                return;
            }
            aVar.f386961d = pr0Var.z();
            aVar.f386962e = pr0Var.z();
            pr0Var.f(11);
            aVar.f386963f = pr0Var.z();
            aVar.f386964g = pr0Var.z();
        }

        public final void b() {
            this.f386961d = 0;
            this.f386962e = 0;
            this.f386963f = 0;
            this.f386964g = 0;
            this.f386965h = 0;
            this.f386966i = 0;
            this.f386958a.c(0);
            this.f386960c = false;
        }

        @j.P
        public final vm a() {
            int iT2;
            if (this.f386961d == 0 || this.f386962e == 0 || this.f386965h == 0 || this.f386966i == 0 || this.f386958a.e() == 0 || this.f386958a.d() != this.f386958a.e() || !this.f386960c) {
                return null;
            }
            this.f386958a.e(0);
            int i12 = this.f386965h * this.f386966i;
            int[] iArr = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int iT3 = this.f386958a.t();
                if (iT3 != 0) {
                    iT2 = i13 + 1;
                    iArr[i13] = this.f386959b[iT3];
                } else {
                    int iT4 = this.f386958a.t();
                    if (iT4 != 0) {
                        iT2 = ((iT4 & 64) == 0 ? iT4 & 63 : ((iT4 & 63) << 8) | this.f386958a.t()) + i13;
                        Arrays.fill(iArr, i13, iT2, (iT4 & 128) == 0 ? 0 : this.f386959b[this.f386958a.t()]);
                    }
                }
                i13 = iT2;
            }
            return new vm.a().a(Bitmap.createBitmap(iArr, this.f386965h, this.f386966i, Bitmap.Config.ARGB_8888)).b(this.f386963f / this.f386961d).b(0).a(0, this.f386964g / this.f386962e).a(0).d(this.f386965h / this.f386961d).a(this.f386966i / this.f386962e).a();
        }
    }
}
