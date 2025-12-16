package com.avito.android.messenger.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.di.InterfaceC32498s0;
import com.avito.android.messenger.service.direct_reply.DirectReplyIntentService;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import ru.avito.messenger.MessengerApi;

/* compiled from: DaggerDirectReplyServiceComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.di.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32481m0 {

    /* compiled from: DaggerDirectReplyServiceComponent.java */
    /* renamed from: com.avito.android.messenger.di.m0$b */
    public static final class b implements InterfaceC32498s0.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC32501t0 f196117a;

        public b() {
        }

        @Override // com.avito.android.messenger.di.InterfaceC32498s0.a
        public final InterfaceC32498s0.a a(InterfaceC32501t0 interfaceC32501t0) {
            this.f196117a = interfaceC32501t0;
            return this;
        }

        @Override // com.avito.android.messenger.di.InterfaceC32498s0.a
        public final InterfaceC32498s0 build() {
            dagger.internal.t.a(InterfaceC32501t0.class, this.f196117a);
            return new c(this.f196117a, null);
        }
    }

    /* compiled from: DaggerDirectReplyServiceComponent.java */
    /* renamed from: com.avito.android.messenger.di.m0$c */
    public static final class c implements InterfaceC32498s0 {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC32501t0 f196118a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<MessengerApi> f196119b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f196120c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f196121d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f196122e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.H> f196123f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.service.direct_reply.h> f196124g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f196125h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.service.direct_reply.c> f196126i;

        /* compiled from: DaggerDirectReplyServiceComponent.java */
        /* renamed from: com.avito.android.messenger.di.m0$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32501t0 f196127a;

            public a(InterfaceC32501t0 interfaceC32501t0) {
                this.f196127a = interfaceC32501t0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f196127a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerDirectReplyServiceComponent.java */
        /* renamed from: com.avito.android.messenger.di.m0$c$b */
        public static final class b implements dagger.internal.u<MessengerApi> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32501t0 f196128a;

            public b(InterfaceC32501t0 interfaceC32501t0) {
                this.f196128a = interfaceC32501t0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196128a.t5();
            }
        }

        /* compiled from: DaggerDirectReplyServiceComponent.java */
        /* renamed from: com.avito.android.messenger.di.m0$c$c, reason: collision with other inner class name */
        public static final class C5773c implements dagger.internal.u<com.avito.android.analytics.H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32501t0 f196129a;

            public C5773c(InterfaceC32501t0 interfaceC32501t0) {
                this.f196129a = interfaceC32501t0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.H hY02 = this.f196129a.y0();
                dagger.internal.t.c(hY02);
                return hY02;
            }
        }

        /* compiled from: DaggerDirectReplyServiceComponent.java */
        /* renamed from: com.avito.android.messenger.di.m0$c$d */
        public static final class d implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32501t0 f196130a;

            public d(InterfaceC32501t0 interfaceC32501t0) {
                this.f196130a = interfaceC32501t0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f196130a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerDirectReplyServiceComponent.java */
        /* renamed from: com.avito.android.messenger.di.m0$c$e */
        public static final class e implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32501t0 f196131a;

            public e(InterfaceC32501t0 interfaceC32501t0) {
                this.f196131a = interfaceC32501t0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f196131a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerDirectReplyServiceComponent.java */
        /* renamed from: com.avito.android.messenger.di.m0$c$f */
        public static final class f implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32501t0 f196132a;

            public f(InterfaceC32501t0 interfaceC32501t0) {
                this.f196132a = interfaceC32501t0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f196132a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        public c(InterfaceC32501t0 interfaceC32501t0, a aVar) {
            this.f196118a = interfaceC32501t0;
            b bVar = new b(interfaceC32501t0);
            f fVar = new f(interfaceC32501t0);
            e eVar = new e(interfaceC32501t0);
            this.f196121d = eVar;
            dagger.internal.u<com.avito.android.messenger.service.direct_reply.h> uVarD = dagger.internal.g.d(new com.avito.android.messenger.service.direct_reply.k(bVar, fVar, eVar, new a(interfaceC32501t0), new C5773c(interfaceC32501t0)));
            this.f196124g = uVarD;
            this.f196126i = dagger.internal.g.d(new com.avito.android.messenger.service.direct_reply.f(uVarD, this.f196121d, new d(interfaceC32501t0)));
        }

        @Override // com.avito.android.messenger.di.InterfaceC32498s0
        public final void a(DirectReplyIntentService directReplyIntentService) {
            directReplyIntentService.f197222b = this.f196126i.get();
            InterfaceC32501t0 interfaceC32501t0 = this.f196118a;
            com.avito.android.notification.m mVarA0 = interfaceC32501t0.A0();
            dagger.internal.t.c(mVarA0);
            directReplyIntentService.f197223c = mVarA0;
            directReplyIntentService.f197224d = interfaceC32501t0.A7();
            directReplyIntentService.f197225e = interfaceC32501t0.Y5();
        }
    }

    public static InterfaceC32498s0.a a() {
        return new b();
    }
}
