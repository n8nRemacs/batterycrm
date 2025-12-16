package com.yandex.mobile.ads.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.x21;
import java.io.EOFException;

/* loaded from: classes8.dex */
public final class v7 implements ru {

    /* renamed from: d, reason: collision with root package name */
    private final pr0 f390807d;

    /* renamed from: e, reason: collision with root package name */
    private final or0 f390808e;

    /* renamed from: f, reason: collision with root package name */
    private tu f390809f;

    /* renamed from: g, reason: collision with root package name */
    private long f390810g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f390813j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f390814k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f390815l;

    /* renamed from: a, reason: collision with root package name */
    private final int f390804a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final w7 f390805b = new w7();

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f390806c = new pr0(2048);

    /* renamed from: i, reason: collision with root package name */
    private int f390812i = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f390811h = -1;

    public v7() {
        pr0 pr0Var = new pr0(10);
        this.f390807d = pr0Var;
        this.f390808e = new or0(pr0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ru[] a() {
        return new ru[]{new v7()};
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        to toVar = (to) suVar;
        int iA2 = a(toVar);
        int i12 = iA2;
        int i13 = 0;
        int i14 = 0;
        do {
            toVar.b(this.f390807d.c(), 0, 2, false);
            this.f390807d.e(0);
            if ((this.f390807d.z() & 65526) == 65520) {
                i13++;
                if (i13 >= 4 && i14 > 188) {
                    return true;
                }
                toVar.b(this.f390807d.c(), 0, 4, false);
                this.f390808e.c(14);
                int iB2 = this.f390808e.b(13);
                if (iB2 <= 6) {
                    i12++;
                    toVar.c();
                    toVar.a(false, i12);
                } else {
                    toVar.a(false, iB2 - 6);
                    i14 += iB2;
                }
            } else {
                i12++;
                toVar.c();
                toVar.a(false, i12);
            }
            i13 = 0;
            i14 = 0;
        } while (i12 - iA2 < 8192);
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f390809f = tuVar;
        this.f390805b.a(tuVar, new fb1.d(BeduinInputModel.MIN_TEXT_VERSION, 0, 1));
        tuVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        this.f390814k = false;
        this.f390805b.a();
        this.f390810g = j13;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) throws tr0 {
        db.b(this.f390809f);
        to toVar = (to) suVar;
        long jA2 = toVar.a();
        int i12 = this.f390804a;
        if (((i12 & 2) != 0 || ((i12 & 1) != 0 && jA2 != -1)) && !this.f390813j) {
            this.f390812i = -1;
            toVar.c();
            if (toVar.getPosition() == 0) {
                a(toVar);
            }
            long j12 = 0;
            int i13 = 0;
            while (true) {
                try {
                    if (!toVar.b(this.f390807d.c(), 0, 2, true)) {
                        break;
                    }
                    this.f390807d.e(0);
                    if ((this.f390807d.z() & 65526) != 65520) {
                        i13 = 0;
                        break;
                    }
                    if (!toVar.b(this.f390807d.c(), 0, 4, true)) {
                        break;
                    }
                    this.f390808e.c(14);
                    int iB2 = this.f390808e.b(13);
                    if (iB2 > 6) {
                        j12 += iB2;
                        i13++;
                        if (i13 != 1000 && toVar.a(true, iB2 - 6)) {
                        }
                    } else {
                        this.f390813j = true;
                        throw tr0.a("Malformed ADTS stream", (Exception) null);
                    }
                } catch (EOFException unused) {
                }
            }
            toVar.c();
            if (i13 > 0) {
                this.f390812i = (int) (j12 / i13);
            } else {
                this.f390812i = -1;
            }
            this.f390813j = true;
        }
        int i14 = toVar.read(this.f390806c.c(), 0, 2048);
        boolean z12 = i14 == -1;
        if (!this.f390815l) {
            boolean z13 = (this.f390804a & 1) != 0 && this.f390812i > 0;
            if (!z13 || this.f390805b.c() != -9223372036854775807L || z12) {
                if (z13 && this.f390805b.c() != -9223372036854775807L) {
                    this.f390809f.a(new ml((int) ((this.f390812i * 8000000) / this.f390805b.c()), this.f390812i, jA2, this.f390811h, (this.f390804a & 2) != 0));
                } else {
                    this.f390809f.a(new x21.b(-9223372036854775807L, 0L));
                }
                this.f390815l = true;
            }
        }
        if (z12) {
            return -1;
        }
        this.f390806c.e(0);
        this.f390806c.d(i14);
        if (!this.f390814k) {
            this.f390805b.a(4, this.f390810g);
            this.f390814k = true;
        }
        this.f390805b.a(this.f390806c);
        return 0;
    }

    private int a(to toVar) {
        int i12 = 0;
        while (true) {
            toVar.b(this.f390807d.c(), 0, 10, false);
            this.f390807d.e(0);
            if (this.f390807d.w() != 4801587) {
                break;
            }
            this.f390807d.f(3);
            int iS2 = this.f390807d.s();
            i12 += iS2 + 10;
            toVar.a(false, iS2);
        }
        toVar.c();
        toVar.a(false, i12);
        if (this.f390811h == -1) {
            this.f390811h = i12;
        }
        return i12;
    }
}
