package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.z01;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final gx0 f385493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final r7 f385494b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final bx0 f385495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final zs f385496d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private z01.b f385497e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private z01 f385498f;

    /* renamed from: g, reason: collision with root package name */
    private int f385499g;

    /* renamed from: h, reason: collision with root package name */
    private int f385500h;

    /* renamed from: i, reason: collision with root package name */
    private int f385501i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    private w01 f385502j;

    public ft(@Y61.k gx0 gx0Var, @Y61.k r7 r7Var, @Y61.k bx0 bx0Var, @Y61.k zs zsVar) {
        this.f385493a = gx0Var;
        this.f385494b = r7Var;
        this.f385495c = bx0Var;
        this.f385496d = zsVar;
    }

    @Y61.k
    public final r7 a() {
        return this.f385494b;
    }

    public final boolean b() {
        z01 z01Var;
        cx0 cx0VarD;
        int i12 = this.f385499g;
        if (i12 == 0 && this.f385500h == 0 && this.f385501i == 0) {
            return false;
        }
        if (this.f385502j != null) {
            return true;
        }
        w01 w01VarK = null;
        if (i12 <= 1 && this.f385500h <= 1 && this.f385501i <= 0 && (cx0VarD = this.f385495c.d()) != null) {
            synchronized (cx0VarD) {
                if (cx0VarD.e() == 0 && qc1.a(cx0VarD.k().a().k(), this.f385494b.k())) {
                    w01VarK = cx0VarD.k();
                }
            }
        }
        if (w01VarK != null) {
            this.f385502j = w01VarK;
            return true;
        }
        z01.b bVar = this.f385497e;
        if ((bVar == null || !bVar.b()) && (z01Var = this.f385498f) != null) {
            return z01Var.a();
        }
        return true;
    }

    @Y61.k
    public final et a(@Y61.k bq0 bq0Var, @Y61.k hx0 hx0Var) {
        try {
            return a(hx0Var.c(), hx0Var.e(), hx0Var.g(), bq0Var.v(), !kotlin.jvm.internal.L.f(hx0Var.f().f(), "GET")).a(bq0Var, hx0Var);
        } catch (y01 e12) {
            a(e12.b());
            throw e12;
        } catch (IOException e13) {
            a(e13);
            throw new y01(e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.yandex.mobile.ads.impl.cx0 a(int r14, int r15, int r16, boolean r17, boolean r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ft.a(int, int, int, boolean, boolean):com.yandex.mobile.ads.impl.cx0");
    }

    public final void a(@Y61.k IOException iOException) {
        this.f385502j = null;
        if ((iOException instanceof f71) && ((f71) iOException).f385214a == xs.f391803f) {
            this.f385499g++;
        } else if (iOException instanceof hl) {
            this.f385500h++;
        } else {
            this.f385501i++;
        }
    }

    public final boolean a(@Y61.k s10 s10Var) {
        s10 s10VarK = this.f385494b.k();
        return s10Var.i() == s10VarK.i() && kotlin.jvm.internal.L.f(s10Var.g(), s10VarK.g());
    }
}
