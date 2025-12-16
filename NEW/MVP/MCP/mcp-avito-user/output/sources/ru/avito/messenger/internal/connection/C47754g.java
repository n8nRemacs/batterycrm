package ru.avito.messenger.internal.connection;

import Oq.InterfaceC14725a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41946e1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.M0;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import java.util.concurrent.TimeUnit;
import k91.AbstractC42547e;
import k91.C42545c;
import k91.C42552j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m91.InterfaceC43936c;
import ru.avito.messenger.C0;
import ru.avito.messenger.C47740g0;
import ru.avito.messenger.D0;
import ru.avito.messenger.InterfaceC47734d0;
import ru.avito.messenger.InterfaceC47832o;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.api.entity.MessengerResponse;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.messenger.internal.state_machine.g;
import ru.avito.messenger.r0;
import ru.avito.messenger.u0;
import ru.avito.websocket.InterfaceC47843a;
import ru.avito.websocket.u;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lru/avito/messenger/internal/connection/g;", "Lru/avito/messenger/internal/connection/d;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.internal.connection.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47754g implements InterfaceC47751d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.internal.state_machine.g<InterfaceC47751d.b> f431306a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47843a f431307b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MessengerApi f431308c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ru.avito.websocket.A<MessengerResponse> f431309d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u0 f431310e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43936c f431311f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f431312g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.j0 f431313h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47734d0 f431314i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y81.d f431315j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14725a f431316k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f431317l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f431318m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final D0 f431319n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final r0 f431320o;

    /* renamed from: p, reason: collision with root package name */
    public final long f431321p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f431322q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C47740g0 f431323r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f431324s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.W f431325t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final l0 f431326u;

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$a;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$a */
    public static final class a implements g.a<InterfaceC47751d.b> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f431327a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlin.jvm.internal.N f431328b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final kotlin.jvm.internal.N f431329c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f431330d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z12, @Y61.k Y41.l<? super Boolean, G0> lVar, @Y61.k Y41.a<G0> aVar, boolean z13) {
            this.f431327a = z12;
            this.f431328b = (kotlin.jvm.internal.N) lVar;
            this.f431329c = (kotlin.jvm.internal.N) aVar;
            this.f431330d = z13;
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            InterfaceC47751d.b bVar2 = bVar;
            if (bVar2 instanceof InterfaceC47751d.b.c) {
                return io.reactivex.rxjava3.core.I.q(bVar2).h(new C47752e(this, bVar2));
            }
            if (bVar2 instanceof InterfaceC47751d.b.AbstractC12404b.C12405b ? true : bVar2 instanceof InterfaceC47751d.b.AbstractC12404b.a ? true : bVar2 instanceof InterfaceC47751d.b.a) {
                return io.reactivex.rxjava3.core.I.q(bVar2).h(new C47753f(this));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$b;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$b */
    public static final class b implements g.a<InterfaceC47751d.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f431331a;

        public b(@Y61.k Y41.a aVar) {
            this.f431331a = aVar;
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            InterfaceC47751d.b bVar2 = bVar;
            if (bVar2 instanceof InterfaceC47751d.b.c) {
                InterfaceC47751d.b.c cVar = (InterfaceC47751d.b.c) bVar2;
                return io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.c(true, cVar.f431298b, cVar.f431299c)).h(new C47755h(this));
            }
            if (bVar2 instanceof InterfaceC47751d.b.AbstractC12404b ? true : bVar2 instanceof InterfaceC47751d.b.a) {
                return io.reactivex.rxjava3.core.I.q(bVar2);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$c;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$c */
    public final class c implements g.a<InterfaceC47751d.b> {
        public c() {
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            InterfaceC47751d.b bVar2 = bVar;
            if (bVar2 instanceof InterfaceC47751d.b.a ? true : bVar2 instanceof InterfaceC47751d.b.AbstractC12404b) {
                return C47754g.this.f431307b.c("Closed by client").B(new InterfaceC47751d.b.c(true, null, bVar2.getF431299c(), 2, null)).u(new androidx.room.rxjava3.b(bVar2, 25));
            }
            if (bVar2 instanceof InterfaceC47751d.b.c) {
                return io.reactivex.rxjava3.core.I.q(bVar2);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$d;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$d */
    public final class d implements g.a<InterfaceC47751d.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f431333a;

        public d(@Y61.k String str) {
            this.f431333a = str;
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            InterfaceC47751d.b bVar2 = bVar;
            boolean z12 = bVar2 instanceof InterfaceC47751d.b.a;
            String str = this.f431333a;
            if (z12) {
                return io.reactivex.rxjava3.core.I.q(InterfaceC47751d.b.a.c((InterfaceC47751d.b.a) bVar2, null, false, str, 15));
            }
            C47754g.this.f431311f.b("new sequenceId skipped: " + str + ", state was = " + bVar2);
            return io.reactivex.rxjava3.core.I.q(bVar2);
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$e;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$e */
    public final class e implements g.a<InterfaceC47751d.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f431335a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f431336b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f431337c;

        public e(@Y61.k String str, boolean z12, boolean z13) {
            this.f431335a = str;
            this.f431336b = z12;
            this.f431337c = z13;
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            io.reactivex.rxjava3.core.I iQ2;
            String f431299c;
            InterfaceC47751d.b bVar2 = bVar;
            boolean z12 = bVar2 instanceof InterfaceC47751d.b.c;
            boolean z13 = this.f431337c;
            C47754g c47754g = C47754g.this;
            if (z12) {
                f431299c = z13 ? null : ((InterfaceC47751d.b.c) bVar2).f431299c;
                iQ2 = c47754g.f431307b.a(f431299c).r(new C47756i(f431299c));
            } else {
                if (!(bVar2 instanceof InterfaceC47751d.b.AbstractC12404b ? true : bVar2 instanceof InterfaceC47751d.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f431336b) {
                    f431299c = z13 ? null : bVar2.getF431299c();
                    iQ2 = c47754g.f431307b.c("Forced reconnect").r().h(c47754g.f431307b.a(f431299c)).r(new C47757j(f431299c));
                } else {
                    iQ2 = io.reactivex.rxjava3.core.I.q(bVar2);
                }
            }
            return iQ2.t(new C47758k(c47754g, this, bVar2));
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$f;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$f */
    public static final class f implements g.a<InterfaceC47751d.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC47751d.b f431339a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C47765s f431340b;

        public f(@Y61.k InterfaceC47751d.b bVar, @Y61.k C47765s c47765s) {
            this.f431339a = bVar;
            this.f431340b = c47765s;
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            InterfaceC47751d.b bVar2 = bVar;
            return (bVar2.getF431297a() && bVar2 == this.f431339a) ? io.reactivex.rxjava3.core.I.q(bVar2).h(new C47759l(this)) : io.reactivex.rxjava3.core.I.q(bVar2);
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$g;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$g, reason: collision with other inner class name */
    public final class C12406g implements g.a<InterfaceC47751d.b> {
        public C12406g() {
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            InterfaceC47751d.b bVar2 = bVar;
            if (bVar2 instanceof InterfaceC47751d.b.AbstractC12404b.C12405b) {
                return io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.AbstractC12404b.a(((InterfaceC47751d.b.AbstractC12404b.C12405b) bVar2).f431296b));
            }
            if (bVar2 instanceof InterfaceC47751d.b.AbstractC12404b.a) {
                return io.reactivex.rxjava3.core.I.q(bVar2);
            }
            if (bVar2 instanceof InterfaceC47751d.b.c) {
                InterfaceC47751d.b.c cVar = (InterfaceC47751d.b.c) bVar2;
                return cVar.f431297a ? io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.AbstractC12404b.a(cVar.f431299c)) : C47754g.this.f431307b.c("Closed by client").r().B(bVar2);
            }
            if (bVar2 instanceof InterfaceC47751d.b.a) {
                return io.reactivex.rxjava3.core.I.q(bVar2);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$h;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$h */
    public final class h implements g.a<InterfaceC47751d.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final u.c f431342a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f431343b;

        public h(@Y61.k u.c cVar, @Y61.k String str) {
            this.f431342a = cVar;
            this.f431343b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
        @Override // ru.avito.messenger.internal.state_machine.g.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.reactivex.rxjava3.core.I<ru.avito.messenger.internal.connection.InterfaceC47751d.b> apply(ru.avito.messenger.internal.connection.InterfaceC47751d.b r12) {
            /*
                r11 = this;
                ru.avito.messenger.internal.connection.d$b r12 = (ru.avito.messenger.internal.connection.InterfaceC47751d.b) r12
                boolean r0 = r12 instanceof ru.avito.messenger.internal.connection.InterfaceC47751d.b.AbstractC12404b
                if (r0 == 0) goto L8
                r0 = 1
                goto La
            L8:
                boolean r0 = r12 instanceof ru.avito.messenger.internal.connection.InterfaceC47751d.b.a
            La:
                if (r0 == 0) goto L74
                ru.avito.websocket.u$c r0 = r11.f431342a
                java.lang.Throwable r1 = r0.f431956c
                boolean r2 = r1 instanceof java.io.IOException
                if (r2 == 0) goto L1d
                k91.f$d r1 = new k91.f$d
                java.lang.Throwable r0 = r0.f431956c
                r1.<init>(r0)
            L1b:
                r2 = r1
                goto L5b
            L1d:
                r2 = -32043(0xffffffffffff82d5, float:NaN)
                int r3 = r0.f431954a
                if (r3 == r2) goto L55
                r2 = -32041(0xffffffffffff82d7, float:NaN)
                if (r3 == r2) goto L4f
                r2 = 401(0x191, float:5.62E-43)
                if (r3 == r2) goto L4f
                r2 = 403(0x193, float:5.65E-43)
                if (r3 == r2) goto L55
                r2 = 1000(0x3e8, float:1.401E-42)
                if (r3 == r2) goto L48
                r2 = 3401(0xd49, float:4.766E-42)
                if (r3 == r2) goto L4f
                r2 = 3403(0xd4b, float:4.769E-42)
                if (r3 == r2) goto L55
                k91.f$f r2 = new k91.f$f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r0 = r0.f431955b
                r2.<init>(r3, r0, r1)
                r1 = r2
                goto L1b
            L48:
                k91.f$a r0 = new k91.f$a
                r0.<init>()
            L4d:
                r1 = r0
                goto L1b
            L4f:
                k91.f$e r0 = new k91.f$e
                r0.<init>(r3, r1)
                goto L4d
            L55:
                k91.f$c r0 = new k91.f$c
                r0.<init>(r1)
                goto L4d
            L5b:
                ru.avito.messenger.internal.connection.g r0 = ru.avito.messenger.internal.connection.C47754g.this
                java.lang.String r6 = r12.getF431299c()
                boolean r9 = r0.f431324s
                ru.avito.messenger.d0 r10 = r0.f431314i
                ru.avito.messenger.j0 r3 = r0.f431313h
                java.lang.String r4 = r11.f431343b
                java.lang.String r5 = "socket_disconnect"
                Oq.a r7 = r0.f431316k
                ru.avito.messenger.g0 r8 = r0.f431323r
                io.reactivex.rxjava3.core.I r12 = ru.avito.messenger.internal.connection.j0.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                goto L7c
            L74:
                boolean r0 = r12 instanceof ru.avito.messenger.internal.connection.InterfaceC47751d.b.c
                if (r0 == 0) goto L7d
                io.reactivex.rxjava3.internal.operators.single.M r12 = io.reactivex.rxjava3.core.I.q(r12)
            L7c:
                return r12
            L7d:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.avito.messenger.internal.connection.C47754g.h.apply(java.lang.Object):io.reactivex.rxjava3.core.I");
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @j.k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/g$i;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.g$i */
    public final class i implements g.a<InterfaceC47751d.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C42552j f431345a;

        public i(@Y61.k C42552j c42552j) {
            this.f431345a = c42552j;
        }

        @Override // ru.avito.messenger.internal.state_machine.g.a
        public final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> apply(InterfaceC47751d.b bVar) {
            io.reactivex.rxjava3.core.I<InterfaceC47751d.b> iQ2;
            Y81.a aVar;
            InterfaceC47751d.b bVar2 = bVar;
            boolean z12 = bVar2.getF431299c() != null;
            String f431299c = bVar2.getF431299c();
            C42552j c42552j = this.f431345a;
            if (f431299c == null) {
                f431299c = c42552j.getSequenceId();
            }
            String str = f431299c;
            boolean z13 = bVar2 instanceof InterfaceC47751d.b.AbstractC12404b.a;
            C47754g c47754g = C47754g.this;
            InterfaceC47843a interfaceC47843a = c47754g.f431307b;
            if (z13) {
                iQ2 = io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.a(this.f431345a, z12, interfaceC47843a.d(), 0L, str, 8, null));
            } else if (bVar2 instanceof InterfaceC47751d.b.c) {
                iQ2 = bVar2.getF431297a() ? io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.a(this.f431345a, z12, interfaceC47843a.d(), 0L, str, 8, null)) : interfaceC47843a.c("Inconsistent state detected").r().B(bVar2);
            } else if (bVar2 instanceof InterfaceC47751d.b.AbstractC12404b.C12405b) {
                iQ2 = io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.a(this.f431345a, z12, interfaceC47843a.d(), 0L, str, 8, null));
            } else {
                if (!(bVar2 instanceof InterfaceC47751d.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iQ2 = io.reactivex.rxjava3.core.I.q(InterfaceC47751d.b.a.c((InterfaceC47751d.b.a) bVar2, c42552j, z12, str, 12));
            }
            C42545c config = c42552j.getConfig();
            if (config != null) {
                Long timeToModifyMessage = config.getTimeToModifyMessage();
                aVar = new Y81.a(timeToModifyMessage != null ? timeToModifyMessage.longValue() : MessengerTimestamp.INSTANCE.fromMillis(3600000L));
            } else {
                aVar = null;
            }
            c47754g.f431311f.b("Session with config: " + aVar);
            return aVar != null ? c47754g.f431315j.b(aVar).k(new com.avito.android.verification.links.tinkoff_finish.g(c47754g, 3)).l(new C47760m(c47754g)).r().h(iQ2) : iQ2;
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.connection.g$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C47754g c47754g = C47754g.this;
            c47754g.f431306a.a(c47754g.new e("", true, false));
            return G0.f406611a;
        }
    }

    public C47754g() {
        throw null;
    }

    public C47754g(final ru.avito.messenger.internal.state_machine.g gVar, InterfaceC47843a interfaceC47843a, MessengerApi messengerApi, ru.avito.websocket.A a12, u0 u0Var, InterfaceC43936c interfaceC43936c, InterfaceC35745a5 interfaceC35745a5, ru.avito.messenger.j0 j0Var, InterfaceC47734d0 interfaceC47734d0, Y81.d dVar, InterfaceC14725a interfaceC14725a, InterfaceC28373a interfaceC28373a, boolean z12, D0 d02, r0 r0Var, long j12, boolean z13, C47740g0 c47740g0, boolean z14, InterfaceC47748a interfaceC47748a, C0 c02, InterfaceC47832o interfaceC47832o, long j13, int i12, C42822w c42822w) {
        long millis = (i12 & 4194304) != 0 ? TimeUnit.SECONDS.toMillis(15L) : j13;
        this.f431306a = gVar;
        this.f431307b = interfaceC47843a;
        this.f431308c = messengerApi;
        this.f431309d = a12;
        this.f431310e = u0Var;
        this.f431311f = interfaceC43936c;
        this.f431312g = interfaceC35745a5;
        this.f431313h = j0Var;
        this.f431314i = interfaceC47734d0;
        this.f431315j = dVar;
        this.f431316k = interfaceC14725a;
        this.f431317l = interfaceC28373a;
        this.f431318m = z12;
        this.f431319n = d02;
        this.f431320o = r0Var;
        this.f431321p = j12;
        this.f431322q = z13;
        this.f431323r = c47740g0;
        this.f431324s = z14;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        this.f431325t = interfaceC47748a.a(false).N(r.f431375b);
        this.f431326u = new l0(interfaceC28373a);
        gVar.start();
        cVar.b(c().j0(cVar2).k0(AbstractC42547e.class).t0(new Z(this)));
        cVar.b(new C41946e1(c().j0(cVar2).k0(AbstractC42547e.class).d0(C47770x.f431385b), new com.avito.android.messenger.conversation.mvi.sync.D0(this, 1)).s0());
        if (!z14) {
            cVar.b(d02.a().j0(cVar2).q0(1L).N(d0.f431300b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new e0(this)));
        }
        I0 i0J0 = gVar.M0().j0(interfaceC35745a5.c());
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        cVar.b(new io.reactivex.rxjava3.internal.operators.mixed.w(i0J0.D(oVar), new M(millis, this)).t0(new l41.g() { // from class: ru.avito.messenger.internal.connection.N
            @Override // l41.g
            public final void accept(Object obj) {
                gVar.a((g.a) obj);
            }
        }));
        M0 m02 = new M0(io.reactivex.rxjava3.core.z.j(r0Var.a(), z14 ? io.reactivex.rxjava3.core.z.k(c02.a(), d02.a().N(f0.f431305b).D(oVar), new P()).y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()) : c02.a().d0(g0.f431348b), interfaceC47832o.a(), new Q()).j0(cVar2).D(oVar).K(new O(this)));
        cVar.b(io.reactivex.rxjava3.core.z.k(interfaceC47843a.M0().j0(cVar2).q0(1L).D(b0.f431281b), m02, new a0()).t0(new c0(this)));
        C47750c.f431282c.getClass();
        cVar.b(m02.o0(C47750c.f431283d, S.f431265b).y0(new X(this)).t0(new l41.g() { // from class: ru.avito.messenger.internal.connection.Y
            @Override // l41.g
            public final void accept(Object obj) {
                gVar.a((g.a) obj);
            }
        }));
        cVar.b(m02.y0(new C47768v(this)).t0(new l41.g() { // from class: ru.avito.messenger.internal.connection.w
            @Override // l41.g
            public final void accept(Object obj) {
                gVar.a((g.a) obj);
            }
        }));
        cVar.b(m02.N0());
    }

    @Override // ru.avito.messenger.internal.connection.InterfaceC47751d
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InterfaceC47751d.b> M0() {
        return this.f431306a.M0();
    }

    @Override // ru.avito.messenger.internal.connection.InterfaceC47751d
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O a() {
        return this.f431320o.a().P(Boolean.TRUE).n(new C47764q(this.f431321p, this)).r(new i0(this));
    }

    @Override // ru.avito.messenger.internal.connection.InterfaceC47751d
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O b() {
        return this.f431320o.a().P(Boolean.TRUE).n(new C47764q(this.f431321p, this)).r(new h0(this));
    }

    @Override // ru.avito.messenger.internal.connection.InterfaceC47751d
    @Y61.k
    public final T0 c() {
        return this.f431307b.b(this.f431309d).p0();
    }

    @Override // ru.avito.messenger.internal.connection.InterfaceC47751d
    public final void connect() {
        this.f431311f.a("ConnectionHolder", "Connect!", null);
        this.f431306a.a(new b(new j()));
    }
}
