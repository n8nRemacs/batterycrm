package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.df;

/* loaded from: classes8.dex */
public final class tk1 {
    public static ps0 a(@j.N Context context, @j.N String str) {
        return new ps0(context, str, new a());
    }

    public static class b<T> implements df.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final yy0<T> f390221a;

        public b(yy0<T> yy0Var) {
            this.f390221a = yy0Var;
        }

        @Override // com.yandex.mobile.ads.impl.kz0.b
        public final void a(T t12) {
            yy0<T> yy0Var = this.f390221a;
            if (yy0Var != null) {
                yy0Var.a((yy0<T>) t12);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kz0.a
        public final void a(@j.N ok1 ok1Var) {
            ye1 ye1VarB;
            if (this.f390221a != null) {
                if (ok1Var instanceof ms) {
                    ye1VarB = ye1.a((ms) ok1Var);
                } else if (ok1Var instanceof rr0) {
                    ye1VarB = ye1.a();
                } else {
                    zo0 zo0Var = ok1Var.f388568a;
                    if (zo0Var == null) {
                        ye1VarB = ye1.a(ok1Var.getMessage());
                    } else if (zo0Var.f392315a >= 500) {
                        ye1VarB = ye1.b();
                    } else {
                        StringBuilder sbZ = androidx.appcompat.app.r.z(AK.c.i(zo0Var.f392315a, ".", new StringBuilder("Network Error.  Code: ")), " Data: \n");
                        sbZ.append(new String(zo0Var.f392316b));
                        ye1VarB = ye1.b(sbZ.toString());
                    }
                }
                this.f390221a.a(ye1VarB);
            }
        }
    }

    public static class a implements df.a<zo0> {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private final yy0<zo0> f390220a = null;

        @Override // com.yandex.mobile.ads.impl.kz0.b
        public final void a(Object obj) {
            zo0 zo0Var = (zo0) obj;
            yy0<zo0> yy0Var = this.f390220a;
            if (yy0Var != null) {
                yy0Var.a((yy0<zo0>) zo0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kz0.a
        public final void a(@j.N ok1 ok1Var) {
            ye1 ye1VarB;
            if (this.f390220a != null) {
                if (ok1Var.f388568a == null) {
                    ye1VarB = ye1.a(ok1Var.getMessage());
                } else {
                    ye1VarB = ye1.b("Ping error");
                }
                this.f390220a.a(ye1VarB);
            }
        }
    }
}
