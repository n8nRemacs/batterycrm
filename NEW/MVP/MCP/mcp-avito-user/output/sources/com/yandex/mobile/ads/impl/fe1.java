package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.ri1;
import com.yandex.mobile.ads.impl.si1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class fe1 implements si1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f385292a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ff1<?> f385293b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final EnumC39381y1 f385294c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final pi1 f385295d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private j6 f385296e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private qc0 f385297f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private p2 f385298g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f385299h;

    public fe1(@Y61.k Context context, @Y61.k ff1<?> ff1Var, @Y61.k EnumC39381y1 enumC39381y1, @Y61.k pi1 pi1Var) {
        this.f385292a = context;
        this.f385293b = ff1Var;
        this.f385294c = enumC39381y1;
        this.f385295d = pi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void b() {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.d();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void c() {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.h();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void d() {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.g();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void e() {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.i();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void f() {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.c();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void j() {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.b();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void k() {
        j6 j6Var = this.f385296e;
        if (j6Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                j6Var.a();
                this.f385296e = null;
                this.f385297f = null;
                this.f385298g = null;
                this.f385299h = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void m() {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.a();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void n() {
        p2 p2Var = this.f385298g;
        if (p2Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                p2Var.a();
            } catch (Exception unused) {
            }
        }
    }

    public static final void a(fe1 fe1Var, zd1 zd1Var) {
        fe1Var.getClass();
        fe1Var.f385295d.a(zd1Var.b(), "verificationNotExecuted", Collections.singletonMap("[REASON]", String.valueOf(yd1.a(zd1Var.a()))));
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k cg1 cg1Var) {
        si1.a.a(cg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k View view, @Y61.k List<df1> list) {
        k();
        this.f385299h = false;
        ff1<?> ff1Var = this.f385293b;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        try {
            Context context = this.f385292a;
            tq0 tq0VarA = new uq0(context, new ee1(this)).a(ff1Var.e().d());
            if (tq0VarA != null) {
                j6 j6VarB = tq0VarA.b();
                j6VarB.a(view);
                this.f385296e = j6VarB;
                this.f385297f = tq0VarA.c();
                this.f385298g = tq0VarA.a();
            }
        } catch (Exception unused) {
        }
        j6 j6Var = this.f385296e;
        if (j6Var != null) {
            for (df1 df1Var : list) {
                View viewC = df1Var.c();
                if (viewC != null) {
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                    try {
                        j6Var.a(viewC, iq0.a(df1Var.b()), df1Var.a());
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        j6 j6Var2 = this.f385296e;
        if (j6Var2 != null) {
            try {
                if (!this.f385299h) {
                    j6Var2.b();
                }
            } catch (Exception unused3) {
            }
        }
        ff1<?> ff1Var2 = this.f385293b;
        p2 p2Var = this.f385298g;
        if (p2Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                p2Var.a(wq0.a(ff1Var2.a(), this.f385294c));
            } catch (Exception unused4) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void h() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void i() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k String str) {
        m();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(long j12) {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.a(j12 / 1000);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k ri1.a aVar) {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (!this.f385299h) {
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        qc0Var.e();
                    } else if (iOrdinal == 1) {
                        qc0Var.f();
                    } else if (iOrdinal == 2) {
                        qc0Var.j();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(float f12) {
        qc0 qc0Var = this.f385297f;
        if (qc0Var != null) {
            try {
                if (this.f385299h) {
                    return;
                }
                qc0Var.b(f12);
            } catch (Exception unused) {
            }
        }
    }
}
