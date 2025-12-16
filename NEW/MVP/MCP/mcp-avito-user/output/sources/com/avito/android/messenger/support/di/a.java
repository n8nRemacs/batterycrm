package com.avito.android.messenger.support.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.messenger.support.SupportChatFormFragment;
import com.avito.android.messenger.support.di.b;
import com.avito.android.messenger.support.i;
import com.avito.android.messenger.support.j;
import com.avito.android.messenger.support.k;
import com.avito.android.messenger.support.m;
import com.avito.android.remote.i1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;

/* compiled from: DaggerSupportChatFormComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSupportChatFormComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f197361a;

        /* renamed from: b, reason: collision with root package name */
        public SupportChatFormFragment f197362b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f197363c;

        /* renamed from: d, reason: collision with root package name */
        public com.avito.android.messenger.support.di.c f197364d;

        public b() {
        }

        @Override // com.avito.android.messenger.support.di.b.a
        public final b.a a(com.avito.android.messenger.support.di.c cVar) {
            this.f197364d = cVar;
            return this;
        }

        @Override // com.avito.android.messenger.support.di.b.a
        public final b.a b(Resources resources) {
            this.f197363c = resources;
            return this;
        }

        @Override // com.avito.android.messenger.support.di.b.a
        public final com.avito.android.messenger.support.di.b build() {
            t.a(Integer.class, this.f197361a);
            t.a(Fragment.class, this.f197362b);
            t.a(Resources.class, this.f197363c);
            t.a(com.avito.android.messenger.support.di.c.class, this.f197364d);
            return new c(this.f197364d, this.f197361a, this.f197362b, this.f197363c, null);
        }

        @Override // com.avito.android.messenger.support.di.b.a
        public final b.a c(int i12) {
            this.f197361a = Integer.valueOf(i12);
            return this;
        }

        @Override // com.avito.android.messenger.support.di.b.a
        public final b.a d(SupportChatFormFragment supportChatFormFragment) {
            this.f197362b = supportChatFormFragment;
            return this;
        }
    }

    /* compiled from: DaggerSupportChatFormComponent.java */
    public static final class c implements com.avito.android.messenger.support.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final Fragment f197365a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.messenger.support.di.c f197366b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f197367c;

        /* renamed from: d, reason: collision with root package name */
        public final u<i1> f197368d;

        /* renamed from: e, reason: collision with root package name */
        public final u<F0> f197369e;

        /* renamed from: f, reason: collision with root package name */
        public final u<A> f197370f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35863o4> f197371g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC35741a1> f197372h;

        /* renamed from: i, reason: collision with root package name */
        public final m f197373i;

        /* renamed from: j, reason: collision with root package name */
        public final u<N> f197374j;

        /* compiled from: DaggerSupportChatFormComponent.java */
        /* renamed from: com.avito.android.messenger.support.di.a$c$a, reason: collision with other inner class name */
        public static final class C5812a implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.support.di.c f197375a;

            public C5812a(com.avito.android.messenger.support.di.c cVar) {
                this.f197375a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f197375a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerSupportChatFormComponent.java */
        public static final class b implements u<A> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.support.di.c f197376a;

            public b(com.avito.android.messenger.support.di.c cVar) {
                this.f197376a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A aD2 = this.f197376a.D2();
                t.c(aD2);
                return aD2;
            }
        }

        /* compiled from: DaggerSupportChatFormComponent.java */
        /* renamed from: com.avito.android.messenger.support.di.a$c$c, reason: collision with other inner class name */
        public static final class C5813c implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.support.di.c f197377a;

            public C5813c(com.avito.android.messenger.support.di.c cVar) {
                this.f197377a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f197377a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerSupportChatFormComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.support.di.c f197378a;

            public d(com.avito.android.messenger.support.di.c cVar) {
                this.f197378a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f197378a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSupportChatFormComponent.java */
        public static final class e implements u<i1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.support.di.c f197379a;

            public e(com.avito.android.messenger.support.di.c cVar) {
                this.f197379a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                i1 i1VarS8 = this.f197379a.S8();
                t.c(i1VarS8);
                return i1VarS8;
            }
        }

        /* compiled from: DaggerSupportChatFormComponent.java */
        public static final class f implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.support.di.c f197380a;

            public f(com.avito.android.messenger.support.di.c cVar) {
                this.f197380a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f197380a.B0();
            }
        }

        public c(com.avito.android.messenger.support.di.c cVar, Integer num, Fragment fragment, Resources resources, C5811a c5811a) {
            this.f197365a = fragment;
            this.f197366b = cVar;
            this.f197373i = new m(l.a(num), new d(cVar), new i(new e(cVar), new f(cVar), new b(cVar), new C5813c(cVar)), new C5812a(cVar));
            q.b bVarA = q.a(1);
            bVarA.a(k.class, this.f197373i);
            this.f197374j = B.a(new P(bVarA.b()));
        }

        @Override // com.avito.android.messenger.support.di.b
        public final void a(SupportChatFormFragment supportChatFormFragment) {
            N n12 = this.f197374j.get();
            com.avito.android.messenger.support.di.d.f197381a.getClass();
            supportChatFormFragment.f197349n0 = (j) new P0(this.f197365a, n12).a(k.class);
            com.avito.android.messenger.support.di.c cVar = this.f197366b;
            supportChatFormFragment.f197350o0 = cVar.j1();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            supportChatFormFragment.f197351p0 = interfaceC28373aA;
            InterfaceC32572u interfaceC32572uX0 = cVar.x0();
            t.c(interfaceC32572uX0);
            supportChatFormFragment.f197352q0 = interfaceC32572uX0;
        }
    }

    public static b.a a() {
        return new b();
    }
}
