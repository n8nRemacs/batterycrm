package com.avito.android.authorization.gorelkin.di;

import Cd.D;
import Cd.F;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.M0;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.gorelkin.di.b;
import com.avito.android.authorization.gorelkin.h;
import com.avito.android.authorization.gorelkin.k;
import com.avito.android.authorization.gorelkin.m;
import com.avito.android.authorization.gorelkin.n;
import com.avito.android.authorization.gorelkin.q;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.service.short_task.j;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L4;
import com.avito.android.util.N3;
import com.avito.android.util.O3;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerParsingPermissionComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerParsingPermissionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.gorelkin.di.b.a
        public final com.avito.android.authorization.gorelkin.di.b a(com.avito.android.authorization.gorelkin.di.c cVar, S0 s02, ParsingPermissionFragment parsingPermissionFragment) {
            return new c(cVar, s02, parsingPermissionFragment, null);
        }
    }

    /* compiled from: DaggerParsingPermissionComponent.java */
    public static final class c implements com.avito.android.authorization.gorelkin.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.gorelkin.di.c f93899a;

        /* renamed from: b, reason: collision with root package name */
        public final l f93900b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC34258d> f93901c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f93902d;

        /* renamed from: e, reason: collision with root package name */
        public final u<j> f93903e;

        /* renamed from: f, reason: collision with root package name */
        public final u<h> f93904f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Resources> f93905g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC35741a1> f93906h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C50648b> f93907i;

        /* renamed from: j, reason: collision with root package name */
        public final u<M0> f93908j;

        /* renamed from: k, reason: collision with root package name */
        public final u<D> f93909k;

        /* renamed from: l, reason: collision with root package name */
        public final u<m> f93910l;

        /* compiled from: DaggerParsingPermissionComponent.java */
        /* renamed from: com.avito.android.authorization.gorelkin.di.a$c$a, reason: collision with other inner class name */
        public static final class C2779a implements u<InterfaceC34258d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.gorelkin.di.c f93911a;

            public C2779a(com.avito.android.authorization.gorelkin.di.c cVar) {
                this.f93911a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34258d interfaceC34258dQ0 = this.f93911a.Q0();
                t.c(interfaceC34258dQ0);
                return interfaceC34258dQ0;
            }
        }

        /* compiled from: DaggerParsingPermissionComponent.java */
        public static final class b implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.gorelkin.di.c f93912a;

            public b(com.avito.android.authorization.gorelkin.di.c cVar) {
                this.f93912a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f93912a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerParsingPermissionComponent.java */
        /* renamed from: com.avito.android.authorization.gorelkin.di.a$c$c, reason: collision with other inner class name */
        public static final class C2780c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.gorelkin.di.c f93913a;

            public C2780c(com.avito.android.authorization.gorelkin.di.c cVar) {
                this.f93913a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f93913a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerParsingPermissionComponent.java */
        public static final class d implements u<j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.gorelkin.di.c f93914a;

            public d(com.avito.android.authorization.gorelkin.di.c cVar) {
                this.f93914a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                j jVarA2 = this.f93914a.A2();
                t.c(jVarA2);
                return jVarA2;
            }
        }

        public c(com.avito.android.authorization.gorelkin.di.c cVar, S0 s02, Fragment fragment, C2778a c2778a) {
            this.f93899a = cVar;
            this.f93900b = l.a(s02);
            C2779a c2779a = new C2779a(cVar);
            C2780c c2780c = new C2780c(cVar);
            this.f93902d = c2780c;
            this.f93904f = g.d(new k(c2779a, c2780c, new Yd.c(new d(cVar))));
            u<Resources> uVarD = g.d(new e(l.a(fragment)));
            this.f93905g = uVarD;
            u<C50648b> uVarA = B.a(new C50650d(new b(cVar), uVarD));
            this.f93907i = uVarA;
            this.f93908j = g.d(new q(uVarA, this.f93904f, this.f93902d, this.f93905g));
            q.b bVarA = dagger.internal.q.a(1);
            bVarA.a(n.class, this.f93908j);
            u<D> uVarA2 = B.a(new F(bVarA.b()));
            this.f93909k = uVarA2;
            this.f93910l = g.d(new f(this.f93900b, uVarA2));
        }

        @Override // com.avito.android.authorization.gorelkin.di.b
        public final void a(ParsingPermissionFragment parsingPermissionFragment) {
            parsingPermissionFragment.f93872n0 = this.f93910l.get();
            com.avito.android.authorization.gorelkin.di.c cVar = this.f93899a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            parsingPermissionFragment.f93873o0 = interfaceC28373aA;
            parsingPermissionFragment.f93874p0 = cVar.g0();
            cVar.R();
            O3 o32 = O3.f318703a;
            int i12 = N3.f318692a;
            parsingPermissionFragment.f93875q0 = new L4(false, true);
        }
    }

    public static b.a a() {
        return new b();
    }
}
