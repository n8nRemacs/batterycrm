package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes8.dex */
public final class hx0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final bx0 f386231a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final List<m70> f386232b;

    /* renamed from: c, reason: collision with root package name */
    private final int f386233c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final dt f386234d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final ry0 f386235e;

    /* renamed from: f, reason: collision with root package name */
    private final int f386236f;

    /* renamed from: g, reason: collision with root package name */
    private final int f386237g;

    /* renamed from: h, reason: collision with root package name */
    private final int f386238h;

    /* renamed from: i, reason: collision with root package name */
    private int f386239i;

    /* JADX WARN: Multi-variable type inference failed */
    public hx0(@Y61.k bx0 bx0Var, @Y61.k List<? extends m70> list, int i12, @Y61.l dt dtVar, @Y61.k ry0 ry0Var, int i13, int i14, int i15) {
        this.f386231a = bx0Var;
        this.f386232b = list;
        this.f386233c = i12;
        this.f386234d = dtVar;
        this.f386235e = ry0Var;
        this.f386236f = i13;
        this.f386237g = i14;
        this.f386238h = i15;
    }

    public static hx0 a(hx0 hx0Var, int i12, dt dtVar, ry0 ry0Var, int i13) {
        if ((i13 & 1) != 0) {
            i12 = hx0Var.f386233c;
        }
        int i14 = i12;
        if ((i13 & 2) != 0) {
            dtVar = hx0Var.f386234d;
        }
        dt dtVar2 = dtVar;
        if ((i13 & 4) != 0) {
            ry0Var = hx0Var.f386235e;
        }
        ry0 ry0Var2 = ry0Var;
        int i15 = (i13 & 8) != 0 ? hx0Var.f386236f : 0;
        int i16 = (i13 & 16) != 0 ? hx0Var.f386237g : 0;
        int i17 = (i13 & 32) != 0 ? hx0Var.f386238h : 0;
        hx0Var.getClass();
        return new hx0(hx0Var.f386231a, hx0Var.f386232b, i14, dtVar2, ry0Var2, i15, i16, i17);
    }

    @Y61.k
    public final bx0 b() {
        return this.f386231a;
    }

    public final int c() {
        return this.f386236f;
    }

    @Y61.l
    public final dt d() {
        return this.f386234d;
    }

    public final int e() {
        return this.f386237g;
    }

    @Y61.k
    public final ry0 f() {
        return this.f386235e;
    }

    public final int g() {
        return this.f386238h;
    }

    public final int h() {
        return this.f386237g;
    }

    @Y61.k
    public final ry0 i() {
        return this.f386235e;
    }

    @Y61.k
    public final bx0 a() {
        return this.f386231a;
    }

    @Y61.k
    public final iz0 a(@Y61.k ry0 ry0Var) {
        if (this.f386233c < this.f386232b.size()) {
            this.f386239i++;
            dt dtVar = this.f386234d;
            if (dtVar != null) {
                if (dtVar.h().a(ry0Var.h())) {
                    if (this.f386239i != 1) {
                        StringBuilder sbA = Cif.a("network interceptor ");
                        sbA.append(this.f386232b.get(this.f386233c - 1));
                        sbA.append(" must call proceed() exactly once");
                        throw new IllegalStateException(sbA.toString().toString());
                    }
                } else {
                    StringBuilder sbA2 = Cif.a("network interceptor ");
                    sbA2.append(this.f386232b.get(this.f386233c - 1));
                    sbA2.append(" must retain the same host and port");
                    throw new IllegalStateException(sbA2.toString().toString());
                }
            }
            hx0 hx0VarA = a(this, this.f386233c + 1, null, ry0Var, 58);
            m70 m70Var = this.f386232b.get(this.f386233c);
            iz0 iz0VarA = m70Var.a(hx0VarA);
            if (iz0VarA != null) {
                if (this.f386234d != null && this.f386233c + 1 < this.f386232b.size() && hx0VarA.f386239i != 1) {
                    throw new IllegalStateException(("network interceptor " + m70Var + " must call proceed() exactly once").toString());
                }
                if (iz0VarA.a() != null) {
                    return iz0VarA;
                }
                throw new IllegalStateException(("interceptor " + m70Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + m70Var + " returned null");
        }
        throw new IllegalStateException("Check failed.");
    }
}
