package com.avito.android.messenger.map.sharing.di;

import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.geo.j;
import com.avito.android.location.find.p;
import com.avito.android.location.find.x;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.messenger.map.sharing.I;
import com.avito.android.messenger.map.sharing.SharingMapFragment;
import com.avito.android.messenger.map.sharing.di.b;
import com.avito.android.messenger.map.sharing.v;
import com.avito.android.messenger.map.sharing.w;
import com.avito.android.messenger.map.sharing.z;
import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.G;
import com.avito.android.permissions.r;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import lW.C43692b;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerSharingMapFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSharingMapFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.messenger.map.sharing.di.b.a
        public final com.avito.android.messenger.map.sharing.di.b a(SharingMapFragment sharingMapFragment, SharingMapFragment sharingMapFragment2, ActivityC22955m activityC22955m, MessageBody.Location location, String str, String str2, String str3, com.avito.android.messenger.map.sharing.di.c cVar) {
            sharingMapFragment.getClass();
            return new c(cVar, sharingMapFragment, sharingMapFragment2, activityC22955m, location, str, str2, str3, null);
        }
    }

    /* compiled from: DaggerSharingMapFragmentComponent.java */
    public static final class c implements com.avito.android.messenger.map.sharing.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final SharingMapFragment f196720a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.messenger.map.sharing.di.c f196721b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f196722c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC47842z> f196723d;

        /* renamed from: e, reason: collision with root package name */
        public final v f196724e;

        /* renamed from: f, reason: collision with root package name */
        public final l f196725f;

        /* renamed from: g, reason: collision with root package name */
        public final l f196726g;

        /* renamed from: h, reason: collision with root package name */
        public final l f196727h;

        /* renamed from: i, reason: collision with root package name */
        public final I f196728i;

        /* renamed from: j, reason: collision with root package name */
        public final u<N> f196729j;

        /* renamed from: k, reason: collision with root package name */
        public final u<F0> f196730k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C30277e1> f196731l;

        /* renamed from: m, reason: collision with root package name */
        public final C47743i f196732m;

        /* compiled from: DaggerSharingMapFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.map.sharing.di.a$c$a, reason: collision with other inner class name */
        public static final class C5788a implements u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.sharing.di.c f196733a;

            public C5788a(com.avito.android.messenger.map.sharing.di.c cVar) {
                this.f196733a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196733a.d0();
            }
        }

        /* compiled from: DaggerSharingMapFragmentComponent.java */
        public static final class b implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.sharing.di.c f196734a;

            public b(com.avito.android.messenger.map.sharing.di.c cVar) {
                this.f196734a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196734a.C();
            }
        }

        /* compiled from: DaggerSharingMapFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.map.sharing.di.a$c$c, reason: collision with other inner class name */
        public static final class C5789c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.sharing.di.c f196735a;

            public C5789c(com.avito.android.messenger.map.sharing.di.c cVar) {
                this.f196735a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f196735a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSharingMapFragmentComponent.java */
        public static final class d implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.sharing.di.c f196736a;

            public d(com.avito.android.messenger.map.sharing.di.c cVar) {
                this.f196736a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196736a.B0();
            }
        }

        public c(com.avito.android.messenger.map.sharing.di.c cVar, SharingMapFragment sharingMapFragment, Fragment fragment, Activity activity, MessageBody.Location location, String str, String str2, String str3, C5787a c5787a) {
            this.f196720a = sharingMapFragment;
            this.f196721b = cVar;
            this.f196722c = new C5789c(cVar);
            this.f196724e = new v(new C5788a(cVar));
            this.f196725f = l.a(str);
            this.f196726g = l.a(str2);
            this.f196727h = l.a(str3);
            this.f196728i = new I(this.f196722c, this.f196724e, this.f196725f, this.f196726g, this.f196727h, l.a(location));
            q.b bVarA = q.a(1);
            bVarA.a(z.class, this.f196728i);
            this.f196729j = B.a(new P(bVarA.b()));
            this.f196732m = new C47743i(new d(cVar), new b(cVar));
        }

        @Override // com.avito.android.messenger.map.sharing.di.b
        public final void a(SharingMapFragment sharingMapFragment) {
            N n12 = this.f196729j.get();
            int i12 = com.avito.android.messenger.map.sharing.di.d.f196737a;
            sharingMapFragment.f196694n0 = (w) new P0(this.f196720a, n12).a(z.class);
            com.avito.android.messenger.map.sharing.di.c cVar = this.f196721b;
            sharingMapFragment.f196695o0 = cVar.j1();
            sharingMapFragment.f196696p0 = cVar.X0();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            sharingMapFragment.f196697q0 = interfaceC28373aA;
            j jVarC0 = cVar.c0();
            t.c(jVarC0);
            com.avito.android.location.find.e eVar = new com.avito.android.location.find.e(new com.avito.android.location.find.c(jVarC0));
            j jVarC02 = cVar.c0();
            t.c(jVarC02);
            sharingMapFragment.f196698r0 = new p(eVar, new x(new com.avito.android.location.find.u(jVarC02)));
            G gN2 = cVar.N();
            com.avito.android.permissions.z zVarA = cVar.A();
            t.c(zVarA);
            sharingMapFragment.f196699s0 = new C33035e(new r(gN2, zVarA));
            InterfaceC28373a interfaceC28373aA2 = cVar.a();
            t.c(interfaceC28373aA2);
            com.avito.android.server_time.f fVarL = cVar.l();
            t.c(fVarL);
            sharingMapFragment.f196700t0 = new C43692b(interfaceC28373aA2, fVarL);
            sharingMapFragment.f196701u0 = cVar.h();
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            sharingMapFragment.f196702v0 = interfaceC35745a5D;
            InterfaceC32572u interfaceC32572uX0 = cVar.x0();
            t.c(interfaceC32572uX0);
            sharingMapFragment.f196703w0 = interfaceC32572uX0;
            sharingMapFragment.f196704x0 = this.f196732m;
        }
    }

    public static b.a a() {
        return new b();
    }
}
