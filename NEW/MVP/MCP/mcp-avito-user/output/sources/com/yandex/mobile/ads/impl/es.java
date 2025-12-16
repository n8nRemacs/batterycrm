package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class es implements is {

    /* renamed from: a, reason: collision with root package name */
    private final List<fb1.a> f385089a;

    /* renamed from: b, reason: collision with root package name */
    private final x91[] f385090b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f385091c;

    /* renamed from: d, reason: collision with root package name */
    private int f385092d;

    /* renamed from: e, reason: collision with root package name */
    private int f385093e;

    /* renamed from: f, reason: collision with root package name */
    private long f385094f = -9223372036854775807L;

    public es(List<fb1.a> list) {
        this.f385089a = list;
        this.f385090b = new x91[list.size()];
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f385091c = false;
        this.f385094f = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
        if (this.f385091c) {
            if (this.f385094f != -9223372036854775807L) {
                for (x91 x91Var : this.f385090b) {
                    x91Var.a(this.f385094f, 1, this.f385093e, 0, null);
                }
            }
            this.f385091c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        for (int i12 = 0; i12 < this.f385090b.length; i12++) {
            fb1.a aVar = this.f385089a.get(i12);
            dVar.a();
            x91 x91VarA = tuVar.a(dVar.c(), 3);
            x91VarA.a(new vw.a().c(dVar.b()).f("application/dvbsubs").a(Collections.singletonList(aVar.f385258b)).e(aVar.f385257a).a());
            this.f385090b[i12] = x91VarA;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if ((i12 & 4) == 0) {
            return;
        }
        this.f385091c = true;
        if (j12 != -9223372036854775807L) {
            this.f385094f = j12;
        }
        this.f385093e = 0;
        this.f385092d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(pr0 pr0Var) {
        boolean z12;
        boolean z13;
        if (this.f385091c) {
            if (this.f385092d == 2) {
                if (pr0Var.a() == 0) {
                    z13 = false;
                } else {
                    if (pr0Var.t() != 32) {
                        this.f385091c = false;
                    }
                    this.f385092d--;
                    z13 = this.f385091c;
                }
                if (!z13) {
                    return;
                }
            }
            if (this.f385092d == 1) {
                if (pr0Var.a() == 0) {
                    z12 = false;
                } else {
                    if (pr0Var.t() != 0) {
                        this.f385091c = false;
                    }
                    this.f385092d--;
                    z12 = this.f385091c;
                }
                if (!z12) {
                    return;
                }
            }
            int iD2 = pr0Var.d();
            int iA2 = pr0Var.a();
            for (x91 x91Var : this.f385090b) {
                pr0Var.e(iD2);
                x91Var.a(iA2, pr0Var);
            }
            this.f385093e += iA2;
        }
    }
}
