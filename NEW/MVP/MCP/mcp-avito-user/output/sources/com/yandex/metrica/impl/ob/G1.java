package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes7.dex */
public class G1 {

    public class a implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378161a;

        public a(G1 g12, C39267yd c39267yd) {
            this.f378161a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            this.f378161a.getClass();
            return false;
        }
    }

    public class b implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378162a;

        public b(G1 g12, C39267yd c39267yd) {
            this.f378162a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            return this.f378162a.a(context) && this.f378162a.c(context);
        }
    }

    public class c implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378163a;

        public c(G1 g12, C39267yd c39267yd) {
            this.f378163a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            return this.f378163a.c(context);
        }
    }

    public class d implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378164a;

        public d(G1 g12, C39267yd c39267yd) {
            this.f378164a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            this.f378164a.getClass();
            return false;
        }
    }

    public class e implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378165a;

        public e(G1 g12, C39267yd c39267yd) {
            this.f378165a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            if (!this.f378165a.a(context)) {
                return false;
            }
            this.f378165a.getClass();
            return false;
        }
    }

    public class f implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378166a;

        public f(G1 g12, C39267yd c39267yd) {
            this.f378166a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            this.f378166a.getClass();
            return false;
        }
    }

    public class g implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378167a;

        public g(G1 g12, C39267yd c39267yd) {
            this.f378167a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            this.f378167a.getClass();
            return false;
        }
    }

    public class h implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378168a;

        public h(G1 g12, C39267yd c39267yd) {
            this.f378168a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            return this.f378168a.a(context);
        }
    }

    public class i implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f378169a;

        public i(G1 g12, C39267yd c39267yd) {
            this.f378169a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            return this.f378169a.a(context);
        }
    }

    @j.N
    public InterfaceC39291zd a(@j.N C39267yd c39267yd) {
        return new i(this, c39267yd);
    }

    @j.N
    public InterfaceC39291zd b(@j.N C39267yd c39267yd) {
        return new h(this, c39267yd);
    }

    @j.N
    public InterfaceC39291zd c(@j.N C39267yd c39267yd) {
        return new g(this, c39267yd);
    }

    @j.N
    public InterfaceC39291zd d(@j.N C39267yd c39267yd) {
        return A2.a(29) ? new a(this, c39267yd) : A2.a(23) ? new b(this, c39267yd) : new c(this, c39267yd);
    }

    @j.N
    public InterfaceC39291zd e(@j.N C39267yd c39267yd) {
        return A2.a(29) ? new d(this, c39267yd) : A2.a(23) ? new e(this, c39267yd) : new f(this, c39267yd);
    }
}
