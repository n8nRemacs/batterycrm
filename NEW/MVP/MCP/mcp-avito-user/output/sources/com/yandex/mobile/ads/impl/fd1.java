package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes8.dex */
public final class fd1 implements yy0<ed1> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final md1 f385285a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wg1 f385286b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a4 f385287c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final yy0<ed1> f385288d;

    public fd1(@j.N Context context, @j.N md1 md1Var, @j.N a4 a4Var, @j.N cd1 cd1Var, @j.N pd1 pd1Var) {
        this.f385285a = md1Var;
        this.f385287c = a4Var;
        this.f385288d = pd1Var;
        this.f385286b = new wg1(context, cd1Var);
    }

    public static void a(fd1 fd1Var) {
        fd1Var.getClass();
        fd1Var.f385287c.a(z3.f392171k, new kd1("success", null), fd1Var.f385285a);
    }

    public static void a(fd1 fd1Var, ye1 ye1Var) {
        fd1Var.getClass();
        fd1Var.f385287c.a(z3.f392171k, new kd1("error", ye1Var), fd1Var.f385285a);
    }

    public class a implements yy0<List<ne1>> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ed1 f385289a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final yy0<ed1> f385290b;

        public a(ed1 ed1Var, @j.N yy0<ed1> yy0Var) {
            this.f385289a = ed1Var;
            this.f385290b = yy0Var;
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N List<ne1> list) {
            fd1.a(fd1.this);
            this.f385290b.a((yy0<ed1>) new ed1(new zc1(this.f385289a.b().a(), list), this.f385289a.a()));
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N ye1 ye1Var) {
            fd1.a(fd1.this, ye1Var);
            this.f385290b.a(ye1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N ed1 ed1Var) {
        ed1 ed1Var2 = ed1Var;
        this.f385286b.a(ed1Var2.b().b(), new a(ed1Var2, this.f385288d));
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N ye1 ye1Var) {
        this.f385287c.a(z3.f392171k, new kd1("error", ye1Var), this.f385285a);
        this.f385288d.a(ye1Var);
    }
}
