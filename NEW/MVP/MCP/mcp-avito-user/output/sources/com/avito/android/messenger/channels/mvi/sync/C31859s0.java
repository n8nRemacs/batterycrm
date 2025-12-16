package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41970m1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LocallyDeletedChannelsSyncAgent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/s0;", "Lcom/avito/android/messenger/channels/mvi/sync/r0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.s0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31859s0 implements InterfaceC31857r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f188547a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31700h f188548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f188549c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ChannelSyncAgent f188550d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Throwable> f188551e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f188552f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188553g;

    /* compiled from: LocallyDeletedChannelsSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestReviewResultKt.INFO_TYPE, "Lru/avito/messenger/MessengerUserHashInfo;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.s0$a */
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f188554b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ru.avito.messenger.o0.b((MessengerUserHashInfo) obj);
        }
    }

    /* compiled from: LocallyDeletedChannelsSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "", "", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.s0$b */
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
            return C31859s0.this.f188548b.c(messengerUserHashInfo).d0(new C31861t0(messengerUserHashInfo));
        }
    }

    /* compiled from: LocallyDeletedChannelsSyncAgent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Q;", "", "", "Lru/avito/messenger/MessengerUserHashInfo;", "Lj41/e;", "<name for destructuring parameter 0>", "<name for destructuring parameter 1>", "", "test", "(Lkotlin/Q;Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.s0$c */
    public static final class c<T1, T2> implements l41.d {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T1, T2> f188556a = new c<>();

        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            List list = (List) ((kotlin.Q) obj).f406619b;
            List list2 = (List) ((kotlin.Q) obj2).f406619b;
            return (list.isEmpty() && list2.isEmpty()) || !(list.isEmpty() || list2.isEmpty() || !kotlin.jvm.internal.L.f(C42745f0.Q(list), C42745f0.Q(list2)));
        }
    }

    /* compiled from: LocallyDeletedChannelsSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00000\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "", "Lru/avito/messenger/MessengerUserHashInfo;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.s0$d */
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            List list = (List) q12.f406619b;
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) q12.f406620c;
            return io.reactivex.rxjava3.core.z.g0((!list.isEmpty() ? io.reactivex.rxjava3.core.z.c0(C42745f0.Q(list)) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b).z(5100L, TimeUnit.MILLISECONDS, C31859s0.this.f188549c.c()).d0(new C31863u0(messengerUserHashInfo)), new C41970m1(io.reactivex.rxjava3.core.z.X(list)).d0(new C31865v0(messengerUserHashInfo)));
        }
    }

    /* compiled from: LocallyDeletedChannelsSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00000\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lru/avito/messenger/MessengerUserHashInfo;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.s0$e */
    public static final class e<T, R> implements l41.o {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            String str = (String) q12.f406619b;
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) q12.f406620c;
            C31859s0 c31859s0 = C31859s0.this;
            return new io.reactivex.rxjava3.internal.operators.mixed.a(c31859s0.f188550d.c(str, messengerUserHashInfo).l(new C31867w0(c31859s0)).r(), io.reactivex.rxjava3.core.z.c0(new kotlin.Q(str, messengerUserHashInfo)));
        }
    }

    /* compiled from: LocallyDeletedChannelsSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00000\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lru/avito/messenger/MessengerUserHashInfo;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.s0$f */
    public static final class f<T, R> implements l41.o {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            String str = (String) q12.f406619b;
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) q12.f406620c;
            return new io.reactivex.rxjava3.internal.operators.mixed.a(C31859s0.this.f188548b.b(str, messengerUserHashInfo).r(), io.reactivex.rxjava3.core.z.c0(new kotlin.Q(str, messengerUserHashInfo)));
        }
    }

    /* compiled from: LocallyDeletedChannelsSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lru/avito/messenger/MessengerUserHashInfo;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.s0$g */
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f188560b = new g<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            V2.f318762a.c("LocallyDeletedChannelsSyncAgent", androidx.camera.camera2.internal.G.g(new StringBuilder("Channel locally delete status updated userId="), ((MessengerUserHashInfo) q12.f406620c).f430682d, " channelId=", (String) q12.f406619b), null);
        }
    }

    @Inject
    public C31859s0(@Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC31700h interfaceC31700h, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ChannelSyncAgent channelSyncAgent) {
        this.f188547a = w0Var;
        this.f188548b = interfaceC31700h;
        this.f188549c = interfaceC35745a5;
        this.f188550d = channelSyncAgent;
        com.jakewharton.rxrelay3.c<Throwable> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f188551e = cVar;
        this.f188552f = cVar;
        this.f188553g = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f188553g;
        cVar.e();
        io.reactivex.rxjava3.core.z zVarT = this.f188547a.g().j0(this.f188549c.a()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).N(a.f188554b).y0(new b()).B(c.f188556a).y0(new d()).T(new e(), Integer.MAX_VALUE).T(new f(), Integer.MAX_VALUE);
        l41.g gVar = g.f188560b;
        h hVar = new l41.g() { // from class: com.avito.android.messenger.channels.mvi.sync.s0.h
            @Override // l41.g
            public final void accept(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        };
        zVarT.getClass();
        cVar.b(zVarT.v0(gVar, hVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Throwable> q() {
        return this.f188552f;
    }
}
