package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.e6;
import com.yandex.mobile.ads.impl.f6;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.h6;
import com.yandex.mobile.ads.impl.l50;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.re1;
import com.yandex.mobile.ads.impl.v40;
import com.yandex.mobile.ads.impl.yk;
import com.yandex.mobile.ads.impl.z60;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final v40 f392480a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final e f392481b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final d f392482c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final f6 f392483d;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final h6 f392484e;

    /* renamed from: f, reason: collision with root package name */
    @N
    private final h6 f392485f;

    /* renamed from: g, reason: collision with root package name */
    @N
    private final h6 f392486g;

    /* renamed from: h, reason: collision with root package name */
    @N
    private final re1 f392487h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private e6 f392488i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private z60 f392489j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f392490k;

    public class a implements h6 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void a() {
            b.this.e();
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void b() {
            b.c(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void c() {
            b.f(b.this);
        }

        public /* synthetic */ a(b bVar, int i12) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.instream.b$b, reason: collision with other inner class name */
    public class C10989b implements h6 {
        private C10989b() {
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void a() {
            b.g(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void b() {
            b.c(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void c() {
            b.g(b.this);
        }

        public /* synthetic */ C10989b(b bVar, int i12) {
            this();
        }
    }

    public class c implements h6 {
        private c() {
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void a() {
            b.this.f392490k = false;
            b.e(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void b() {
            boolean z12 = b.this.f392490k;
            b.this.f392490k = false;
            if (z12) {
                b.c(b.this);
            } else if (b.this.f392489j != null) {
                ((g60) b.this.f392489j).c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.h6
        public final void c() {
            b.e(b.this);
        }

        public /* synthetic */ c(b bVar, int i12) {
            this();
        }
    }

    public b(@N Context context, @N o60 o60Var, @N v40 v40Var, @N l50 l50Var, @N e eVar) {
        this.f392480a = v40Var;
        this.f392481b = eVar;
        re1 re1Var = new re1();
        this.f392487h = re1Var;
        d dVar = new d(eVar, this);
        this.f392482c = dVar;
        this.f392483d = new f6(context, o60Var, v40Var, l50Var, eVar, dVar, re1Var);
        int i12 = 0;
        this.f392484e = new c(this, i12);
        this.f392485f = new a(this, i12);
        this.f392486g = new C10989b(this, i12);
    }

    public final void c() {
        e6 e6Var = this.f392488i;
        if (e6Var != null) {
            e6Var.d();
        }
        this.f392480a.b();
    }

    public final void e() {
        z60 z60Var = this.f392489j;
        if (z60Var != null) {
            ((g60) z60Var).e();
        }
        this.f392481b.h();
        this.f392480a.b();
    }

    public final void f() {
        if (this.f392488i != null) {
            this.f392482c.c();
            e6 e6Var = this.f392488i;
            if (e6Var != null) {
                e6Var.h();
                return;
            }
            return;
        }
        e6 e6VarC = this.f392483d.c();
        this.f392488i = e6VarC;
        if (e6VarC != null) {
            e6VarC.a(this.f392484e);
            this.f392482c.c();
            this.f392490k = true;
            this.f392488i.f();
            return;
        }
        e6 e6VarA = this.f392483d.a();
        this.f392488i = e6VarA;
        e6VarA.a(this.f392485f);
        this.f392488i.f();
    }

    public final void g() {
        this.f392481b.a(this.f392482c);
        this.f392482c.d();
    }

    public final void h() {
        if (this.f392488i != null) {
            z60 z60Var = this.f392489j;
            if (z60Var != null) {
                ((g60) z60Var).c();
                return;
            }
            return;
        }
        e6 e6VarC = this.f392483d.c();
        this.f392488i = e6VarC;
        if (e6VarC != null) {
            e6VarC.a(this.f392484e);
            this.f392490k = false;
            this.f392488i.f();
        } else {
            z60 z60Var2 = this.f392489j;
            if (z60Var2 != null) {
                ((g60) z60Var2).c();
            }
        }
    }

    public final void i() {
        e6 e6Var = this.f392488i;
        if (e6Var != null) {
            e6Var.g();
        }
    }

    public final void j() {
        this.f392482c.f();
        e6 e6Var = this.f392488i;
        if (e6Var != null) {
            e6Var.e();
        }
    }

    public final void a(@P g60 g60Var) {
        this.f392489j = g60Var;
    }

    public final void b() {
        e6 e6Var = this.f392488i;
        if (e6Var != null) {
            e6Var.g();
            return;
        }
        z60 z60Var = this.f392489j;
        if (z60Var != null) {
            ((g60) z60Var).d();
        }
        this.f392481b.h();
        this.f392480a.b();
    }

    public final void d() {
        c();
        this.f392481b.h();
        this.f392482c.b();
    }

    public static void g(b bVar) {
        z60 z60Var = bVar.f392489j;
        if (z60Var != null) {
            ((g60) z60Var).d();
        }
        bVar.f392481b.h();
        bVar.f392480a.b();
    }

    public final void a(@P yk ykVar) {
        this.f392487h.a(ykVar);
    }

    public static void c(b bVar) {
        e6 e6Var = bVar.f392488i;
        if (e6Var != null) {
            e6Var.h();
        }
    }

    public final void a() {
        this.f392482c.a();
    }

    public static void e(b bVar) {
        e6 e6VarA = bVar.f392483d.a();
        bVar.f392488i = e6VarA;
        e6VarA.a(bVar.f392485f);
        bVar.f392488i.f();
    }

    public static void f(b bVar) {
        e6 e6VarB = bVar.f392483d.b();
        bVar.f392488i = e6VarB;
        if (e6VarB != null) {
            e6VarB.a(bVar.f392486g);
            bVar.f392488i.f();
            return;
        }
        z60 z60Var = bVar.f392489j;
        if (z60Var != null) {
            ((g60) z60Var).d();
        }
        bVar.f392481b.h();
        bVar.f392480a.b();
    }
}
