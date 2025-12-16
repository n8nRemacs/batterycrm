package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class xp0 {

    /* renamed from: a, reason: collision with root package name */
    private final yp0 f391787a = new yp0();

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f391788b = new pr0(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    private int f391789c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f391790d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f391791e;

    public final boolean a(to toVar) throws InterruptedIOException {
        int i12;
        int i13;
        int i14;
        if (this.f391791e) {
            this.f391791e = false;
            this.f391788b.c(0);
        }
        while (true) {
            if (this.f391791e) {
                return true;
            }
            if (this.f391789c < 0) {
                if (!this.f391787a.a(toVar, -1L) || !this.f391787a.a(toVar, true)) {
                    break;
                }
                yp0 yp0Var = this.f391787a;
                int i15 = yp0Var.f392051d;
                if ((yp0Var.f392048a & 1) == 1 && this.f391788b.e() == 0) {
                    this.f391790d = 0;
                    int i16 = 0;
                    do {
                        int i17 = this.f391790d;
                        yp0 yp0Var2 = this.f391787a;
                        if (i17 >= yp0Var2.f392050c) {
                            break;
                        }
                        int[] iArr = yp0Var2.f392053f;
                        this.f391790d = i17 + 1;
                        i14 = iArr[i17];
                        i16 += i14;
                    } while (i14 == 255);
                    i15 += i16;
                    i13 = this.f391790d;
                } else {
                    i13 = 0;
                }
                try {
                    toVar.a(i15);
                    this.f391789c = i13;
                } catch (EOFException unused) {
                }
            }
            int i18 = this.f391789c;
            this.f391790d = 0;
            int i19 = 0;
            do {
                int i22 = this.f391790d;
                int i23 = i18 + i22;
                yp0 yp0Var3 = this.f391787a;
                if (i23 >= yp0Var3.f392050c) {
                    break;
                }
                int[] iArr2 = yp0Var3.f392053f;
                this.f391790d = i22 + 1;
                i12 = iArr2[i23];
                i19 += i12;
            } while (i12 == 255);
            int i24 = this.f391789c + this.f391790d;
            if (i19 > 0) {
                pr0 pr0Var = this.f391788b;
                pr0Var.a(pr0Var.e() + i19);
                try {
                    toVar.a(this.f391788b.c(), this.f391788b.e(), i19, false);
                    pr0 pr0Var2 = this.f391788b;
                    pr0Var2.d(pr0Var2.e() + i19);
                    this.f391791e = this.f391787a.f392053f[i24 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i24 == this.f391787a.f392050c) {
                i24 = -1;
            }
            this.f391789c = i24;
        }
        return false;
    }

    public final pr0 b() {
        return this.f391788b;
    }

    public final void c() {
        yp0 yp0Var = this.f391787a;
        yp0Var.f392048a = 0;
        yp0Var.f392049b = 0L;
        yp0Var.f392050c = 0;
        yp0Var.f392051d = 0;
        yp0Var.f392052e = 0;
        this.f391788b.c(0);
        this.f391789c = -1;
        this.f391791e = false;
    }

    public final void d() {
        if (this.f391788b.c().length == 65025) {
            return;
        }
        pr0 pr0Var = this.f391788b;
        pr0Var.a(this.f391788b.e(), Arrays.copyOf(pr0Var.c(), Math.max(65025, this.f391788b.e())));
    }

    public final yp0 a() {
        return this.f391787a;
    }
}
