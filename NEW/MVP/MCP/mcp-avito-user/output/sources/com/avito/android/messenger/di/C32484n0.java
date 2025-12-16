package com.avito.android.messenger.di;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.C32017f;
import com.avito.android.messenger.conversation.mvi.data.C32023l;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.sync.C32263g;
import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.messenger.conversation.mvi.sync.IncompleteMessageLoadingWorker;
import com.avito.android.messenger.di.B0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerIncompleteMessageLoaderComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.di.n0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32484n0 {

    /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
    /* renamed from: com.avito.android.messenger.di.n0$b */
    public static final class b implements B0.a {

        /* renamed from: a, reason: collision with root package name */
        public C0 f196137a;

        public b() {
        }

        @Override // com.avito.android.messenger.di.B0.a
        public final B0.a a(C0 c02) {
            this.f196137a = c02;
            return this;
        }

        @Override // com.avito.android.messenger.di.B0.a
        public final B0 build() {
            dagger.internal.t.a(C0.class, this.f196137a);
            return new c(this.f196137a, null);
        }
    }

    /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
    /* renamed from: com.avito.android.messenger.di.n0$c */
    public static final class c implements B0 {

        /* renamed from: a, reason: collision with root package name */
        public final C0 f196138a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<MessengerDatabase> f196139b;

        /* renamed from: c, reason: collision with root package name */
        public final S1 f196140c;

        /* renamed from: d, reason: collision with root package name */
        public final T1 f196141d;

        /* renamed from: e, reason: collision with root package name */
        public final U1 f196142e;

        /* renamed from: f, reason: collision with root package name */
        public final N1 f196143f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32019h> f196144g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32021j> f196145h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Context> f196146i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f196147j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<C30277e1> f196148k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f196149l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32012a> f196150m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32024m> f196151n;

        /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
        /* renamed from: com.avito.android.messenger.di.n0$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final C0 f196152a;

            public a(C0 c02) {
                this.f196152a = c02;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f196152a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
        /* renamed from: com.avito.android.messenger.di.n0$c$b */
        public static final class b implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final C0 f196153a;

            public b(C0 c02) {
                this.f196153a = c02;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196153a.g();
            }
        }

        /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
        /* renamed from: com.avito.android.messenger.di.n0$c$c, reason: collision with other inner class name */
        public static final class C5774c implements dagger.internal.u<InterfaceC32019h> {

            /* renamed from: a, reason: collision with root package name */
            public final C0 f196154a;

            public C5774c(C0 c02) {
                this.f196154a = c02;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196154a.p1();
            }
        }

        /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
        /* renamed from: com.avito.android.messenger.di.n0$c$d */
        public static final class d implements dagger.internal.u<MessengerDatabase> {

            /* renamed from: a, reason: collision with root package name */
            public final C0 f196155a;

            public d(C0 c02) {
                this.f196155a = c02;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerDatabase messengerDatabaseW0 = this.f196155a.W0();
                dagger.internal.t.c(messengerDatabaseW0);
                return messengerDatabaseW0;
            }
        }

        /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
        /* renamed from: com.avito.android.messenger.di.n0$c$e */
        public static final class e implements dagger.internal.u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final C0 f196156a;

            public e(C0 c02) {
                this.f196156a = c02;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196156a.C();
            }
        }

        /* compiled from: DaggerIncompleteMessageLoaderComponent.java */
        /* renamed from: com.avito.android.messenger.di.n0$c$f */
        public static final class f implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final C0 f196157a;

            public f(C0 c02) {
                this.f196157a = c02;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f196157a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(C0 c02, a aVar) {
            this.f196138a = c02;
            d dVar = new d(c02);
            this.f196139b = dVar;
            this.f196140c = new S1(dVar);
            this.f196141d = new T1(dVar);
            this.f196142e = new U1(dVar);
            this.f196143f = new N1(dVar);
            this.f196145h = dagger.internal.B.a(new C32023l(new C5774c(c02)));
            dagger.internal.u<InterfaceC32012a> uVarA = dagger.internal.B.a(new C32017f(new b(c02), new e(c02), new a(c02), this.f196139b, new f(c02)));
            this.f196150m = uVarA;
            this.f196151n = dagger.internal.B.a(new com.avito.android.messenger.conversation.mvi.data.e0(this.f196140c, this.f196141d, this.f196142e, this.f196143f, this.f196145h, uVarA));
        }

        @Override // com.avito.android.messenger.di.B0
        public final void a(IncompleteMessageLoadingWorker incompleteMessageLoadingWorker) {
            InterfaceC32024m interfaceC32024m = this.f196151n.get();
            C0 c02 = this.f196138a;
            InterfaceC47842z interfaceC47842zD0 = c02.d0();
            com.avito.android.messenger.B bL1 = c02.L1();
            dagger.internal.t.c(bL1);
            InterfaceC35745a5 interfaceC35745a5D = c02.d();
            dagger.internal.t.c(interfaceC35745a5D);
            int i12 = D0.f195617a;
            C32275m c32275m = new C32275m(interfaceC47842zD0, bL1, interfaceC35745a5D);
            InterfaceC35745a5 interfaceC35745a5D2 = c02.d();
            dagger.internal.t.c(interfaceC35745a5D2);
            incompleteMessageLoadingWorker.f194601a = new C32263g(interfaceC32024m, c32275m, interfaceC35745a5D2);
        }
    }

    public static B0.a a() {
        return new b();
    }
}
