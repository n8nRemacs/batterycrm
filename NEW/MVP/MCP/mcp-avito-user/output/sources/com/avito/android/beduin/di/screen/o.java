package com.avito.android.beduin.di.screen;

import com.avito.android.analytics.screens.E;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.analytics.screens.tracker.b0;
import com.avito.android.beduin.di.InterfaceC28862y;
import com.avito.android.beduin.di.screen.a;
import com.avito.android.beduin.ui.screen.BeduinScreenRootFragment;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;
import oi.InterfaceC44779a;

/* compiled from: DaggerBeduinScreenComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class o {

    /* compiled from: DaggerBeduinScreenComponent.java */
    public static final class b implements com.avito.android.beduin.di.screen.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC44779a> f103973a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35745a5> f103974b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.beduin.data.d> f103975c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.beduin.domain.screen.a> f103976d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.beduin.ui.screen.fragment.f> f103977e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Z> f103978f;

        /* compiled from: DaggerBeduinScreenComponent.java */
        public static final class a implements u<InterfaceC44779a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28862y f103979a;

            public a(InterfaceC28862y interfaceC28862y) {
                this.f103979a = interfaceC28862y;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44779a interfaceC44779aL5 = this.f103979a.l5();
                t.c(interfaceC44779aL5);
                return interfaceC44779aL5;
            }
        }

        /* compiled from: DaggerBeduinScreenComponent.java */
        /* renamed from: com.avito.android.beduin.di.screen.o$b$b, reason: collision with other inner class name */
        public static final class C3114b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28862y f103980a;

            public C3114b(InterfaceC28862y interfaceC28862y) {
                this.f103980a = interfaceC28862y;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f103980a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public b(InterfaceC28862y interfaceC28862y, a aVar) {
            u<com.avito.android.beduin.data.d> uVarD = dagger.internal.g.d(new com.avito.android.beduin.data.e(new a(interfaceC28862y), new C3114b(interfaceC28862y)));
            this.f103975c = uVarD;
            this.f103976d = dagger.internal.g.d(new com.avito.android.beduin.domain.screen.d(uVarD));
            this.f103977e = dagger.internal.g.d(com.avito.android.beduin.ui.screen.fragment.h.a());
            this.f103978f = dagger.internal.g.d(new b0(E.a()));
        }

        @Override // com.avito.android.beduin.di.screen.a
        public final void Bi(BeduinScreenRootFragment beduinScreenRootFragment) {
            beduinScreenRootFragment.f104073n0 = this.f103977e.get();
            beduinScreenRootFragment.f104074o0 = new com.avito.android.beduin.ui.screen.g(this.f103976d.get());
            beduinScreenRootFragment.f104075p0 = this.f103978f.get();
        }

        @Override // com.avito.android.beduin.di.screen.c
        public final com.avito.android.beduin.domain.screen.a nc() {
            return this.f103976d.get();
        }
    }

    /* compiled from: DaggerBeduinScreenComponent.java */
    public static final class c implements a.InterfaceC3113a {
        public c() {
        }

        @Override // com.avito.android.beduin.di.screen.a.InterfaceC3113a
        public final com.avito.android.beduin.di.screen.a a(InterfaceC28862y interfaceC28862y) {
            return new b(interfaceC28862y, null);
        }
    }

    public static a.InterfaceC3113a a() {
        return new c();
    }
}
