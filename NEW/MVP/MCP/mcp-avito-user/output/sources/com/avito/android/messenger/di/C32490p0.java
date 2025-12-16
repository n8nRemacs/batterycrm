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
import com.avito.android.messenger.di.k2;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: DaggerOpenErrorTrackerComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.di.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32490p0 {

    /* compiled from: DaggerOpenErrorTrackerComponent.java */
    /* renamed from: com.avito.android.messenger.di.p0$b */
    public static final class b implements k2.a {

        /* renamed from: a, reason: collision with root package name */
        public l2 f196172a;

        public b() {
        }
    }

    /* compiled from: DaggerOpenErrorTrackerComponent.java */
    /* renamed from: com.avito.android.messenger.di.p0$c */
    public static final class c implements k2 {

        /* renamed from: a, reason: collision with root package name */
        public final l2 f196173a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<MessengerDatabase> f196174b;

        /* renamed from: c, reason: collision with root package name */
        public final S1 f196175c;

        /* renamed from: d, reason: collision with root package name */
        public final T1 f196176d;

        /* renamed from: e, reason: collision with root package name */
        public final U1 f196177e;

        /* renamed from: f, reason: collision with root package name */
        public final N1 f196178f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32019h> f196179g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32021j> f196180h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Context> f196181i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f196182j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<C30277e1> f196183k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f196184l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32012a> f196185m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32024m> f196186n;

        /* compiled from: DaggerOpenErrorTrackerComponent.java */
        /* renamed from: com.avito.android.messenger.di.p0$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final l2 f196187a;

            public a(l2 l2Var) {
                this.f196187a = l2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f196187a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerOpenErrorTrackerComponent.java */
        /* renamed from: com.avito.android.messenger.di.p0$c$b */
        public static final class b implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final l2 f196188a;

            public b(l2 l2Var) {
                this.f196188a = l2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196188a.g();
            }
        }

        /* compiled from: DaggerOpenErrorTrackerComponent.java */
        /* renamed from: com.avito.android.messenger.di.p0$c$c, reason: collision with other inner class name */
        public static final class C5775c implements dagger.internal.u<InterfaceC32019h> {

            /* renamed from: a, reason: collision with root package name */
            public final l2 f196189a;

            public C5775c(l2 l2Var) {
                this.f196189a = l2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196189a.p1();
            }
        }

        /* compiled from: DaggerOpenErrorTrackerComponent.java */
        /* renamed from: com.avito.android.messenger.di.p0$c$d */
        public static final class d implements dagger.internal.u<MessengerDatabase> {

            /* renamed from: a, reason: collision with root package name */
            public final l2 f196190a;

            public d(l2 l2Var) {
                this.f196190a = l2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerDatabase messengerDatabaseW0 = this.f196190a.W0();
                dagger.internal.t.c(messengerDatabaseW0);
                return messengerDatabaseW0;
            }
        }

        /* compiled from: DaggerOpenErrorTrackerComponent.java */
        /* renamed from: com.avito.android.messenger.di.p0$c$e */
        public static final class e implements dagger.internal.u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final l2 f196191a;

            public e(l2 l2Var) {
                this.f196191a = l2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196191a.C();
            }
        }

        /* compiled from: DaggerOpenErrorTrackerComponent.java */
        /* renamed from: com.avito.android.messenger.di.p0$c$f */
        public static final class f implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final l2 f196192a;

            public f(l2 l2Var) {
                this.f196192a = l2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f196192a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(l2 l2Var, a aVar) {
            this.f196173a = l2Var;
            d dVar = new d(l2Var);
            this.f196174b = dVar;
            this.f196175c = new S1(dVar);
            this.f196176d = new T1(dVar);
            this.f196177e = new U1(dVar);
            this.f196178f = new N1(dVar);
            this.f196180h = dagger.internal.B.a(new C32023l(new C5775c(l2Var)));
            dagger.internal.u<InterfaceC32012a> uVarA = dagger.internal.B.a(new C32017f(new b(l2Var), new e(l2Var), new a(l2Var), this.f196174b, new f(l2Var)));
            this.f196185m = uVarA;
            this.f196186n = dagger.internal.B.a(new com.avito.android.messenger.conversation.mvi.data.e0(this.f196175c, this.f196176d, this.f196177e, this.f196178f, this.f196180h, uVarA));
        }
    }
}
