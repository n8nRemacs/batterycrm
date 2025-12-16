package com.avito.android.messenger.di;

import android.app.Application;
import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.InterfaceC31091j1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.C28589r0;
import com.avito.android.app.work.SendPendingMessagesWorker;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.C32017f;
import com.avito.android.messenger.conversation.mvi.data.C32023l;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32079k0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.messenger.di.s2;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.di.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32493q0 {

    /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
    /* renamed from: com.avito.android.messenger.di.q0$b */
    public static final class b implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        public t2 f196224a;

        public b() {
        }

        @Override // com.avito.android.messenger.di.s2.a
        public final s2.a a(t2 t2Var) {
            this.f196224a = t2Var;
            return this;
        }

        @Override // com.avito.android.messenger.di.s2.a
        public final s2 build() {
            dagger.internal.t.a(t2.class, this.f196224a);
            return new c(this.f196224a, null);
        }
    }

    /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
    /* renamed from: com.avito.android.messenger.di.q0$c */
    public static final class c implements s2 {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32079k0> f196225A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32069f0> f196226B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.mvi.sync.z0> f196227C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f196228D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<C31667x> f196229E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.H> f196230F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.app.task.P0> f196231G;

        /* renamed from: a, reason: collision with root package name */
        public final t2 f196232a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.w0> f196233b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47842z> f196234c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<MessengerDatabase> f196235d;

        /* renamed from: e, reason: collision with root package name */
        public final S1 f196236e;

        /* renamed from: f, reason: collision with root package name */
        public final T1 f196237f;

        /* renamed from: g, reason: collision with root package name */
        public final U1 f196238g;

        /* renamed from: h, reason: collision with root package name */
        public final N1 f196239h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32019h> f196240i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32021j> f196241j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<Context> f196242k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f196243l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<C30277e1> f196244m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f196245n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32012a> f196246o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32024m> f196247p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.messenger.A> f196248q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32095t> f196249r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32098u0> f196250s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<Application> f196251t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31091j1> f196252u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.b> f196253v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32200a> f196254w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.B> f196255x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.sync.G> f196256y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_upload.T> f196257z;

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196258a;

            public a(t2 t2Var) {
                this.f196258a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f196258a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$b */
        public static final class b implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196259a;

            public b(t2 t2Var) {
                this.f196259a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f196259a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$c, reason: collision with other inner class name */
        public static final class C5776c implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196260a;

            public C5776c(t2 t2Var) {
                this.f196260a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196260a.g();
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$d */
        public static final class d implements dagger.internal.u<InterfaceC32095t> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196261a;

            public d(t2 t2Var) {
                this.f196261a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196261a.jb();
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$e */
        public static final class e implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.sync.G> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196262a;

            public e(t2 t2Var) {
                this.f196262a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.sync.G gTg = this.f196262a.Tg();
                dagger.internal.t.c(gTg);
                return gTg;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$f */
        public static final class f implements dagger.internal.u<InterfaceC32019h> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196263a;

            public f(t2 t2Var) {
                this.f196263a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196263a.p1();
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$g */
        public static final class g implements dagger.internal.u<com.avito.android.messenger.channels.mvi.sync.z0> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196264a;

            public g(t2 t2Var) {
                this.f196264a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.channels.mvi.sync.z0 z0VarC2 = this.f196264a.C2();
                dagger.internal.t.c(z0VarC2);
                return z0VarC2;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$h */
        public static final class h implements dagger.internal.u<ru.avito.messenger.A> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196265a;

            public h(t2 t2Var) {
                this.f196265a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ru.avito.messenger.A aD2 = this.f196265a.D2();
                dagger.internal.t.c(aD2);
                return aD2;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$i */
        public static final class i implements dagger.internal.u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196266a;

            public i(t2 t2Var) {
                this.f196266a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196266a.d0();
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$j */
        public static final class j implements dagger.internal.u<MessengerDatabase> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196267a;

            public j(t2 t2Var) {
                this.f196267a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerDatabase messengerDatabaseW0 = this.f196267a.W0();
                dagger.internal.t.c(messengerDatabaseW0);
                return messengerDatabaseW0;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$k */
        public static final class k implements dagger.internal.u<com.avito.android.messenger.B> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196268a;

            public k(t2 t2Var) {
                this.f196268a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.B bL1 = this.f196268a.L1();
                dagger.internal.t.c(bL1);
                return bL1;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$l */
        public static final class l implements dagger.internal.u<C31667x> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196269a;

            public l(t2 t2Var) {
                this.f196269a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196269a.y2();
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$m */
        public static final class m implements dagger.internal.u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196270a;

            public m(t2 t2Var) {
                this.f196270a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196270a.C();
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$n */
        public static final class n implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_upload.T> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196271a;

            public n(t2 t2Var) {
                this.f196271a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.file_upload.T tEb = this.f196271a.Eb();
                dagger.internal.t.c(tEb);
                return tEb;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$o */
        public static final class o implements dagger.internal.u<InterfaceC32200a> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196272a;

            public o(t2 t2Var) {
                this.f196272a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32200a interfaceC32200aB5 = this.f196272a.B5();
                dagger.internal.t.c(interfaceC32200aB5);
                return interfaceC32200aB5;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$p */
        public static final class p implements dagger.internal.u<InterfaceC31091j1> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196273a;

            public p(t2 t2Var) {
                this.f196273a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196273a.A7();
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$q */
        public static final class q implements dagger.internal.u<InterfaceC32069f0> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196274a;

            public q(t2 t2Var) {
                this.f196274a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32069f0 interfaceC32069f0Vg = this.f196274a.vg();
                dagger.internal.t.c(interfaceC32069f0Vg);
                return interfaceC32069f0Vg;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$r */
        public static final class r implements dagger.internal.u<InterfaceC32079k0> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196275a;

            public r(t2 t2Var) {
                this.f196275a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32079k0 interfaceC32079k0Hh = this.f196275a.Hh();
                dagger.internal.t.c(interfaceC32079k0Hh);
                return interfaceC32079k0Hh;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$s */
        public static final class s implements dagger.internal.u<com.avito.android.analytics.H> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196276a;

            public s(t2 t2Var) {
                this.f196276a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.H hY02 = this.f196276a.y0();
                dagger.internal.t.c(hY02);
                return hY02;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$t */
        public static final class t implements dagger.internal.u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196277a;

            public t(t2 t2Var) {
                this.f196277a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f196277a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$u */
        public static final class u implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196278a;

            public u(t2 t2Var) {
                this.f196278a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f196278a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$v */
        public static final class v implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196279a;

            public v(t2 t2Var) {
                this.f196279a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f196279a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$w */
        public static final class w implements dagger.internal.u<com.avito.android.messenger.w0> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196280a;

            public w(t2 t2Var) {
                this.f196280a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.w0 w0VarK0 = this.f196280a.k0();
                dagger.internal.t.c(w0VarK0);
                return w0VarK0;
            }
        }

        /* compiled from: DaggerSendPendingMessagesWorkerComponent.java */
        /* renamed from: com.avito.android.messenger.di.q0$c$x */
        public static final class x implements dagger.internal.u<InterfaceC32098u0> {

            /* renamed from: a, reason: collision with root package name */
            public final t2 f196281a;

            public x(t2 t2Var) {
                this.f196281a = t2Var;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196281a.Xk();
            }
        }

        public c(t2 t2Var, a aVar) {
            this.f196232a = t2Var;
            this.f196233b = new w(t2Var);
            this.f196234c = new i(t2Var);
            j jVar = new j(t2Var);
            this.f196235d = jVar;
            this.f196236e = new S1(jVar);
            this.f196237f = new T1(jVar);
            this.f196238g = new U1(jVar);
            this.f196239h = new N1(jVar);
            this.f196241j = dagger.internal.B.a(new C32023l(new f(t2Var)));
            C5776c c5776c = new C5776c(t2Var);
            u uVar = new u(t2Var);
            this.f196243l = uVar;
            m mVar = new m(t2Var);
            this.f196244m = mVar;
            a aVar2 = new a(t2Var);
            this.f196245n = aVar2;
            dagger.internal.u<InterfaceC32012a> uVarA = dagger.internal.B.a(new C32017f(c5776c, mVar, aVar2, this.f196235d, uVar));
            this.f196246o = uVarA;
            dagger.internal.u<InterfaceC32024m> uVarA2 = dagger.internal.B.a(new com.avito.android.messenger.conversation.mvi.data.e0(this.f196236e, this.f196237f, this.f196238g, this.f196239h, this.f196241j, uVarA));
            this.f196247p = uVarA2;
            h hVar = new h(t2Var);
            d dVar = new d(t2Var);
            x xVar = new x(t2Var);
            com.avito.android.F1 f12 = new com.avito.android.F1(new b(t2Var), new p(t2Var));
            t tVar = new t(t2Var);
            o oVar = new o(t2Var);
            k kVar = new k(t2Var);
            e eVar = new e(t2Var);
            n nVar = new n(t2Var);
            r rVar = new r(t2Var);
            q qVar = new q(t2Var);
            g gVar = new g(t2Var);
            dagger.internal.u<InterfaceC47842z> uVar2 = this.f196234c;
            dagger.internal.u<InterfaceC35745a5> uVar3 = this.f196243l;
            dagger.internal.u<C30277e1> uVar4 = this.f196244m;
            dagger.internal.u<InterfaceC28373a> uVar5 = this.f196245n;
            C28589r0 c28589r0 = new C28589r0(uVar2, hVar, dVar, xVar, f12, tVar, oVar, kVar, eVar, uVar3, nVar, rVar, qVar, uVarA2, uVar4, gVar, uVar5);
            v vVar = new v(t2Var);
            this.f196231G = dagger.internal.B.a(new com.avito.android.H1(this.f196233b, uVar2, uVarA2, c28589r0, vVar, new com.avito.android.G1(uVar5, vVar), new l(t2Var), uVar3, uVar4, uVar5, new s(t2Var)));
        }

        @Override // com.avito.android.messenger.di.s2
        public final void a(SendPendingMessagesWorker sendPendingMessagesWorker) {
            t2 t2Var = this.f196232a;
            com.avito.android.messenger.w0 w0VarK0 = t2Var.k0();
            dagger.internal.t.c(w0VarK0);
            sendPendingMessagesWorker.f91751b = w0VarK0;
            InterfaceC35745a5 interfaceC35745a5D = t2Var.d();
            dagger.internal.t.c(interfaceC35745a5D);
            sendPendingMessagesWorker.f91752c = interfaceC35745a5D;
            MessengerDatabase messengerDatabaseW0 = t2Var.W0();
            dagger.internal.t.c(messengerDatabaseW0);
            L1.f195669a.getClass();
            com.avito.android.persistence.messenger.Y0 y0A = messengerDatabaseW0.A();
            dagger.internal.t.d(y0A);
            sendPendingMessagesWorker.f91753d = y0A;
            sendPendingMessagesWorker.f91754e = dagger.internal.g.a(this.f196231G);
        }
    }

    public static s2.a a() {
        return new b();
    }
}
