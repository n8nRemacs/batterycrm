package com.avito.android.messenger.channels.mvi.list_feature;

import HY.c;
import HY.d;
import HY.g;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.arch.mvi.utils.n;
import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.messenger.analytics.C31649e;
import com.avito.android.messenger.analytics.InterfaceC31662s;
import com.avito.android.messenger.analytics.graphite_counter.ChatListLoadingResult;
import com.avito.android.messenger.analytics.graphite_counter.ChatListRefreshResult;
import com.avito.android.messenger.channels.analytics.UseCaseScenario;
import com.avito.android.messenger.channels.mvi.di.InterfaceC31734b;
import com.avito.android.messenger.channels.mvi.di.InterfaceC31735c;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31766d;
import com.avito.android.messenger.channels.mvi.list_feature.W;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.persistence.messenger.C33126v0;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.X2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43194q0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43200s1;
import kotlinx.coroutines.flow.C43206u1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a;", "Lcom/avito/android/arch/mvi/a;", "LHY/c;", "LHY/d;", "LHY/h;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31772a implements com.avito.android.arch.mvi.a<HY.c, HY.d, HY.h> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final W f187921a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.M f187922b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ChannelSyncAgent f187923c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.sync.G0 f187924d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.service.p f187925e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f187926f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.timer.a<ChatListLoadingResult> f187927g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.timer.a<ChatListRefreshResult> f187928h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.analytics.i f187929i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final CY.k f187930j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.analytics.d f187931k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f187932l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31766d f187933m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f187934n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C33126v0 f187935o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final C33126v0 f187936p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.interactor.A f187937q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f187938r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f187939s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.filter.j f187940t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.action_banner.g f187941u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.action_banner.a f187942v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31662s f187943w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.o f187944x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.o f187945y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f187946z;

    /* compiled from: ChannelsListActor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "", "a", "b", "c", "d", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$a;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$b;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$c;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$a, reason: collision with other inner class name */
    public interface InterfaceC5527a {

        /* compiled from: ChannelsListActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$a;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$a$a, reason: collision with other inner class name */
        public static final class C5528a implements InterfaceC5527a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5528a f187947a = new C5528a();
        }

        /* compiled from: ChannelsListActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$b;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$a$b */
        public static final class b implements InterfaceC5527a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f187948a = new b();
        }

        /* compiled from: ChannelsListActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$c;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$a$c */
        public static final class c implements InterfaceC5527a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f187949a = new c();
        }

        /* compiled from: ChannelsListActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$a$d;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$a$d */
        public static final class d implements InterfaceC5527a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f187950a = new d();
        }
    }

    /* compiled from: ChannelsListActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$b;", "", "a", "b", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$b$a;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$b */
    public interface b {

        /* compiled from: ChannelsListActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$b$a;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C5529a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final long f187951a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f187952b;

            public C5529a(long j12, boolean z12) {
                this.f187951a = j12;
                this.f187952b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5529a)) {
                    return false;
                }
                C5529a c5529a = (C5529a) obj;
                return this.f187951a == c5529a.f187951a && this.f187952b == c5529a.f187952b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f187952b) + (Long.hashCode(this.f187951a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InitialLoading(loadingId=");
                sb2.append(this.f187951a);
                sb2.append(", isRetry=");
                return androidx.appcompat.app.r.x(sb2, this.f187952b, ')');
            }
        }

        /* compiled from: ChannelsListActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/a$b$b;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5530b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final long f187953a;

            public C5530b(long j12) {
                this.f187953a = j12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5530b) && this.f187953a == ((C5530b) obj).f187953a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f187953a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.u(new StringBuilder("Refresh(loadingId="), this.f187953a, ')');
            }
        }
    }

    @Inject
    public C31772a(@Y61.k W w12, @Y61.k com.avito.android.messenger.channels.mvi.data.M m12, @Y61.k ChannelSyncAgent channelSyncAgent, @Y61.k com.avito.android.messenger.channels.mvi.sync.G0 g02, @Y61.k com.avito.android.messenger.service.p pVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.analytics.timer.a<ChatListLoadingResult> aVar2, @Y61.k com.avito.android.analytics.timer.a<ChatListRefreshResult> aVar3, @Y61.k com.avito.android.messenger.channels.analytics.i iVar, @Y61.k CY.k kVar, @Y61.k com.avito.android.messenger.channels.analytics.d dVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC31766d interfaceC31766d, @Y61.k com.avito.android.util.R0 r02, @Y61.k C33126v0 c33126v0, @Y61.l @I41.h C33126v0 c33126v02, @Y61.k com.avito.android.messenger.channels.mvi.interactor.A a12, @Y61.k C30277e1 c30277e1, @InterfaceC31735c @Y61.l String str, @InterfaceC31734b @Y61.l Boolean bool, @Y61.k com.avito.android.messenger.channels.filter.j jVar, @Y61.k com.avito.android.messenger.channels.action_banner.g gVar, @Y61.k com.avito.android.messenger.channels.action_banner.a aVar4, @Y61.k InterfaceC31662s interfaceC31662s) {
        this.f187921a = w12;
        this.f187922b = m12;
        this.f187923c = channelSyncAgent;
        this.f187924d = g02;
        this.f187925e = pVar;
        this.f187926f = aVar;
        this.f187927g = aVar2;
        this.f187928h = aVar3;
        this.f187929i = iVar;
        this.f187930j = kVar;
        this.f187931k = dVar;
        this.f187932l = interfaceC28373a;
        this.f187933m = interfaceC31766d;
        this.f187934n = r02;
        this.f187935o = c33126v0;
        this.f187936p = c33126v02;
        this.f187937q = a12;
        this.f187938r = c30277e1;
        this.f187939s = str;
        this.f187940t = jVar;
        this.f187941u = gVar;
        this.f187942v = aVar4;
        this.f187943w = interfaceC31662s;
        n.a aVar5 = com.avito.android.arch.mvi.utils.n.f92111a;
        HY.m.f7248m.getClass();
        HY.m mVar = HY.m.f7249n;
        aVar5.getClass();
        this.f187944x = new com.avito.android.arch.mvi.utils.o(mVar);
        HY.j.f7245b.getClass();
        this.f187945y = new com.avito.android.arch.mvi.utils.o(HY.j.f7246c);
        this.f187946z = new AtomicLong(0L);
        if (kotlin.jvm.internal.L.f(str, ChannelsLink.b.a.f133106b.f133105a) || kotlin.jvm.internal.L.f(bool, Boolean.TRUE)) {
            jVar.e(true);
            if (!kotlin.jvm.internal.L.f(bool, Boolean.TRUE) || str == null) {
                return;
            }
            interfaceC28373a.c(new C31649e(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean c(C31772a c31772a, List list, String str) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((Channel) ((kotlin.Q) next).f406619b).getChannelId(), str)) {
                break;
            }
        }
        return next != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[Catch: all -> 0x00f3, TryCatch #2 {all -> 0x00f3, blocks: (B:31:0x00e2, B:33:0x00e8, B:43:0x011d, B:37:0x00f5, B:39:0x00f9, B:41:0x0109, B:42:0x0114, B:44:0x0145, B:45:0x014a), top: B:65:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5 A[Catch: all -> 0x00f3, TryCatch #2 {all -> 0x00f3, blocks: (B:31:0x00e2, B:33:0x00e8, B:43:0x011d, B:37:0x00f5, B:39:0x00f9, B:41:0x0109, B:42:0x0114, B:44:0x0145, B:45:0x014a), top: B:65:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.messenger.channels.mvi.list_feature.C31772a r26, com.avito.android.arch.mvi.utils.l r27, ru.avito.messenger.MessengerUserHashInfo r28, boolean r29, com.avito.android.messenger.channels.analytics.UseCaseScenario r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31772a.d(com.avito.android.messenger.channels.mvi.list_feature.a, com.avito.android.arch.mvi.utils.l, ru.avito.messenger.MessengerUserHashInfo, boolean, com.avito.android.messenger.channels.analytics.UseCaseScenario, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final InterfaceC43160i e(C31772a c31772a, HY.g gVar) {
        if (!(gVar instanceof g.b)) {
            if (!(gVar instanceof g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g.a aVar = (g.a) gVar;
            if (aVar instanceof g.a.C0418a) {
                return C43175k.G(new C31786h(c31772a.f187945y, aVar, null, c31772a));
            }
            throw new NoWhenBranchMatchedException();
        }
        g.b bVar = (g.b) gVar;
        boolean z12 = bVar instanceof g.b.h;
        com.avito.android.arch.mvi.utils.o oVar = c31772a.f187944x;
        if (z12) {
            g.b.h hVar = (g.b.h) bVar;
            return C43175k.N(C43175k.G(new C31802p(oVar, hVar, null, hVar, c31772a)));
        }
        if (bVar instanceof g.b.i) {
            return C43175k.G(new C31782f(bVar, bVar, oVar, c31772a, null));
        }
        if (bVar instanceof g.b.c) {
            return C43175k.G(new C31804q(bVar, bVar, oVar, c31772a, null));
        }
        if (bVar instanceof g.b.d) {
            return C43175k.G(new r(bVar, bVar, oVar, c31772a, null));
        }
        if (bVar instanceof g.b.l) {
            return C43175k.G(new C31807s(bVar, bVar, oVar, c31772a, null));
        }
        if (bVar instanceof g.b.a) {
            return C43175k.G(new C31809t(bVar, bVar, oVar, c31772a, null));
        }
        if (bVar instanceof g.b.j) {
            return C43175k.G(new C31811u(bVar, bVar, oVar, c31772a, null));
        }
        if (bVar instanceof g.b.f) {
            return C43175k.G(new C31813v(oVar, bVar, null, c31772a));
        }
        if (bVar instanceof g.b.k) {
            return C43175k.G(new C31815w(oVar, bVar, null, c31772a));
        }
        if (bVar instanceof g.b.e) {
            g.b.e eVar = (g.b.e) bVar;
            return C43175k.C(new A(eVar, c31772a, null), com.avito.android.arch.mvi.utils.h.d(new C43210w(eVar), 1000L));
        }
        if (bVar instanceof g.b.C0419b) {
            return C43175k.G(new C31817x(oVar, bVar, null, bVar));
        }
        if (bVar instanceof g.b.C0420g) {
            return C43175k.G(new C31784g(oVar, bVar, null, c31772a));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(com.avito.android.messenger.channels.mvi.list_feature.C31772a r4, com.avito.android.arch.mvi.utils.l r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.messenger.channels.mvi.list_feature.T
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.messenger.channels.mvi.list_feature.T r0 = (com.avito.android.messenger.channels.mvi.list_feature.T) r0
            int r1 = r0.f187840t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f187840t = r1
            goto L1b
        L16:
            com.avito.android.messenger.channels.mvi.list_feature.T r0 = new com.avito.android.messenger.channels.mvi.list_feature.T
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f187838r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f187840t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            com.avito.android.arch.mvi.utils.l r5 = r0.f187837q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L50
        L2e:
            r4 = move-exception
            goto L62
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.C42729a0.b(r6)
            com.avito.android.messenger.channels.action_banner.g r4 = r4.f187941u     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Throwable -> L2e
            HY.j r6 = (HY.j) r6     // Catch: java.lang.Throwable -> L2e
            com.avito.android.messenger.channels.action_banner.d r6 = r6.f7247a     // Catch: java.lang.Throwable -> L2e
            r0.f187837q = r5     // Catch: java.lang.Throwable -> L2e
            r0.f187840t = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r4.a(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r6 != r1) goto L50
            goto L88
        L50:
            com.avito.android.messenger.channels.action_banner.d r6 = (com.avito.android.messenger.channels.action_banner.d) r6     // Catch: java.lang.Throwable -> L2e
            HY.j r4 = new HY.j     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            r5.setValue(r4)     // Catch: java.lang.Throwable -> L2e
            kotlin.G0 r4 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2e
            com.avito.android.arch.mvi.utils.c$c r5 = new com.avito.android.arch.mvi.utils.c$c     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            goto L6e
        L62:
            kotlin.coroutines.CoroutineContext r5 = r0.getF411447c()
            kotlinx.coroutines.Q0.e(r5)
            com.avito.android.arch.mvi.utils.c$b r5 = new com.avito.android.arch.mvi.utils.c$b
            r5.<init>(r4)
        L6e:
            boolean r4 = r5 instanceof com.avito.android.arch.mvi.utils.c.C2712c
            if (r4 == 0) goto L73
            goto L86
        L73:
            boolean r4 = r5 instanceof com.avito.android.arch.mvi.utils.c.b
            if (r4 == 0) goto L89
            com.avito.android.arch.mvi.utils.c$b r5 = (com.avito.android.arch.mvi.utils.c.b) r5
            A r4 = r5.f92027b
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            com.avito.android.util.X2 r5 = com.avito.android.util.X2.f318778a
            java.lang.String r6 = "ChannelsListActor"
            java.lang.String r0 = "switchBannerToNext() failed"
            r5.j(r6, r0, r4)
        L86:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L88:
            return r1
        L89:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31772a.f(com.avito.android.messenger.channels.mvi.list_feature.a, com.avito.android.arch.mvi.utils.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(com.avito.android.arch.mvi.utils.l lVar, Y41.p pVar, Continuation continuation) {
        MessengerUserHashInfo messengerUserHashInfo = ((HY.m) lVar.getValue()).f7250a;
        if (messengerUserHashInfo == null || !ru.avito.messenger.o0.b(messengerUserHashInfo)) {
            return null;
        }
        return pVar.invoke(messengerUserHashInfo, continuation);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        C43152f0 c43152f0;
        C43152f0 c43152f02;
        Continuation continuation;
        InterfaceC43160i interfaceC43160iD;
        W w12 = this.f187921a;
        w12.getClass();
        n2 n2Var = this.f187944x.f92113b;
        InterfaceC43160i interfaceC43160i = this.f187945y.f92113b;
        C43152f0 c43152f0D = W.d(new R0(new C43206u1(new C43197r1(new S0(2, null), n2Var), new X0(w12, null))), "privateListState");
        C43152f0 c43152f0D2 = W.d(new P0(new C43197r1(new Q0(2, null), interfaceC43160i), w12), "privateBannerState");
        C31814v0 c31814v0 = new C31814v0(C43175k.Y(C43175k.r(new C31812u0(n2Var)), new C31810t0(w12, null)));
        com.avito.android.messenger.w0 w0Var = w12.f187864a;
        K0 k02 = new K0(W.d(new L0(C43175k.r(kotlinx.coroutines.rx3.y.a(w0Var.g()))), "User Id"));
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(C43175k.r(new V0(n2Var, w12)), new U0(w12, null));
        kotlinx.coroutines.flow.X x12 = new kotlinx.coroutines.flow.X(W.d(C43175k.G(new A0(C43175k.r(new C31822z0(C43175k.q(B0.f187696l, new C31820y0(n2Var, w12)), w12)), null, w12)), "privateState (for requesting users' last activity)"), new C0(w12, null));
        InterfaceC47842z interfaceC47842z = w12.f187865b;
        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(new C31779d0(kotlinx.coroutines.rx3.y.a(interfaceC47842z.C(X81.b.class))), new C31781e0(kotlinx.coroutines.rx3.y.a(interfaceC47842z.C(X81.a.class))));
        e.a aVar2 = kotlin.time.e.f410651c;
        DurationUnit durationUnit = DurationUnit.f410633e;
        C43152f0 c43152f0D3 = W.d(new C31783f0(com.avito.android.arch.mvi.utils.h.f(mVarN, kotlin.time.g.h(500L, durationUnit))), "blacklist events");
        C43152f0 c43152f0D4 = W.d(new O0(com.avito.android.arch.mvi.utils.h.f(C43175k.N(new M0(kotlinx.coroutines.rx3.y.a(interfaceC47842z.C(X81.m.class))), new N0(kotlinx.coroutines.rx3.y.a(interfaceC47842z.C(X81.r.class)))), kotlin.time.g.h(2000L, durationUnit))), "pin events");
        C43152f0 c43152f0D5 = W.d(new W0(kotlinx.coroutines.rx3.y.a(interfaceC47842z.C(X81.k.class))), "MessagesUnmarkedAsSpamInChat events");
        C43152f0 c43152f0D6 = W.d(new T0(kotlinx.coroutines.rx3.y.a(interfaceC47842z.A())), "client.allReconnects");
        C43152f0 c43152f0D7 = W.d(new I0(C43175k.N(new C43197r1(new J0(w12, null), new G0(com.avito.android.arch.mvi.utils.h.c(n2Var), w12)), new H0(C43175k.t(kotlinx.coroutines.rx3.y.a(w0Var.b()), 1)))), "logouts");
        C43152f0 c43152f0D8 = W.d(C43175k.G(new C31818x0(kotlinx.coroutines.rx3.y.a(w12.f187869f.d9()), null)), "deeplinkHandler.observeTerminalResult()");
        com.avito.android.messenger.channels.mvi.interactor.A a12 = w12.f187874k;
        C43152f0 c43152f0D9 = W.d(new F0(kotlinx.coroutines.rx3.y.a(a12.r())), "locallyDeletedChannelsInteractor.locallyDeletedChannelsSetStream");
        C43152f0 c43152f0D10 = W.d(new D0(kotlinx.coroutines.rx3.y.a(a12.s())), "locallyDeletedChannelsInteractor.lastLocallyDeletedChannelStream");
        C43152f0 c43152f0D11 = W.d(new E0(kotlinx.coroutines.rx3.y.a(a12.q())), "locallyDeletedChannelsInteractor.deleteChannelErrorStream");
        C30277e1 c30277e1 = w12.f187871h;
        c30277e1.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar = nVarArr[61];
        boolean zBooleanValue = ((Boolean) c30277e1.f145018i0.a().invoke()).booleanValue();
        com.avito.android.util.R0 r02 = w12.f187868e;
        if (zBooleanValue) {
            kotlin.reflect.n<Object> nVar2 = nVarArr[71];
            if (!((Boolean) c30277e1.f145036r0.a().invoke()).booleanValue()) {
                c43152f0 = c43152f0D5;
                c43152f02 = c43152f0D7;
                continuation = null;
                interfaceC43160iD = W.d(new C31799n0(C43175k.Y(C43175k.r(new C31787h0(new C31797m0(new C43194q0(new C31805q0(2, null), n2Var), w12))), new C31806r0(w12, null))), "subscribeToChannelTags");
                return C43175k.I(this.f187934n.c(), C43175k.C(new N(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(new C43197r1(new I(2, null), C43175k.G(new C31821z(C43175k.N(c43197r1, C43175k.I(r02.c(), C43175k.N(c43152f0D, c43152f0D2, c31814v0, k02, lVarY, x12, c43152f0D3, c43152f0D4, c43152f0, c43152f0D6, c43152f02, c43152f0D8, c43152f0D9, c43152f0D10, c43152f0D11, interfaceC43160iD, C43175k.G(new C31777c0(C43175k.t(w12.f187875l.b(), 1), continuation))))), null))), M.f187773l)));
            }
            c43152f0 = c43152f0D5;
            c43152f02 = c43152f0D7;
            interfaceC43160iD = W.d(C43175k.I(r02.a(), new C31795l0(new C43206u1(C43175k.G(new C31801o0(C43175k.N(C43175k.r(new C31785g0(new C31791j0(new C43200s1(new W.a(null, false, null, null, 15, null), new C31789i0(n2Var, w12), new C31808s0(3, null))))), new C31793k0(kotlinx.coroutines.rx3.y.a(interfaceC47842z.C(X81.c.class)))), null, w12)), new C31803p0(3, null)))), "subscribeToChannelTags");
        } else {
            interfaceC43160iD = C43175k.w();
            c43152f0 = c43152f0D5;
            c43152f02 = c43152f0D7;
        }
        continuation = null;
        return C43175k.I(this.f187934n.c(), C43175k.C(new N(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(new C43197r1(new I(2, null), C43175k.G(new C31821z(C43175k.N(c43197r1, C43175k.I(r02.c(), C43175k.N(c43152f0D, c43152f0D2, c31814v0, k02, lVarY, x12, c43152f0D3, c43152f0D4, c43152f0, c43152f0D6, c43152f02, c43152f0D8, c43152f0D9, c43152f0D10, c43152f0D11, interfaceC43160iD, C43175k.G(new C31777c0(C43175k.t(w12.f187875l.b(), 1), continuation))))), null))), M.f187773l)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<HY.d> b(HY.c cVar, HY.h hVar) {
        return g(cVar);
    }

    @Y61.k
    public final InterfaceC43160i g(@Y61.k HY.c cVar) {
        InterfaceC43160i c43210w;
        boolean z12 = cVar instanceof c.e;
        C30277e1 c30277e1 = this.f187938r;
        com.avito.android.arch.mvi.utils.o oVar = this.f187944x;
        com.avito.android.arch.mvi.utils.o oVar2 = this.f187945y;
        if (z12) {
            c.e eVar = (c.e) cVar;
            if (eVar instanceof c.e.b) {
                return C43175k.G(new C31788i(oVar, eVar, null, this, eVar));
            }
            if (eVar instanceof c.e.d) {
                InterfaceC43160i interfaceC43160iW = C43175k.w();
                X2.f318778a.d("ChannelsListActor", eVar + " is a CompositeChannelsListAction and can't be processed directly");
                return interfaceC43160iW;
            }
            if (eVar instanceof c.e.f) {
                c30277e1.getClass();
                kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[71];
                if (!((Boolean) c30277e1.f145036r0.a().invoke()).booleanValue()) {
                    return C43175k.G(new C31790j(oVar, eVar, null));
                }
                c43210w = new C43207v(new HY.d[0]);
            } else {
                if (eVar instanceof c.e.C0414c) {
                    return C43175k.G(new C31792k(oVar, eVar, null, this));
                }
                if (eVar instanceof c.e.C0415e) {
                    return C43175k.G(new C31794l(oVar2, eVar, null, this));
                }
                if (!kotlin.jvm.internal.L.f(eVar, c.e.a.f7166a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(d.a.f7171a);
            }
        } else if (cVar instanceof c.b) {
            c.b bVar = (c.b) cVar;
            if (bVar instanceof c.b.C0411b) {
                c.b.C0411b c0411b = (c.b.C0411b) bVar;
                c43210w = new C43210w(new d.b(c0411b.f7145a, c0411b.f7146b, c0411b.f7147c));
            } else if (bVar instanceof c.b.e) {
                c43210w = new C43210w(new d.j(((c.b.e) bVar).f7152a));
            } else {
                if (bVar instanceof c.b.k) {
                    return C43175k.G(new C31819y(oVar, bVar, null, bVar, this));
                }
                if (bVar instanceof c.b.d) {
                    c30277e1.getClass();
                    kotlin.reflect.n<Object> nVar2 = C30277e1.f144946d1[47];
                    if (!((Boolean) c30277e1.f144987U.a().invoke()).booleanValue()) {
                        return C43175k.h(new D(bVar, this, null));
                    }
                    c.b.d dVar = (c.b.d) bVar;
                    c43210w = new C43210w(new d.k(dVar.f7150a, dVar.f7151b));
                } else {
                    if (bVar instanceof c.b.h) {
                        return C43175k.G(new E(bVar, this, null));
                    }
                    if (bVar instanceof c.b.j) {
                        return C43175k.G(new K((c.b.j) bVar, this, null));
                    }
                    if (bVar instanceof c.b.i) {
                        return C43175k.h(new F(bVar, this, null));
                    }
                    if (kotlin.jvm.internal.L.f(bVar, c.b.f.f7153a)) {
                        c43210w = new C43210w(d.C0416d.f7176a);
                    } else {
                        if (kotlin.jvm.internal.L.f(bVar, c.b.g.f7154a)) {
                            return C43175k.G(new G(this, null));
                        }
                        if (!kotlin.jvm.internal.L.f(bVar, c.b.a.f7144a)) {
                            if (bVar instanceof c.b.C0412c) {
                                return C43175k.G(new H(bVar, this, null));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        c43210w = new C43210w(d.e.f7177a);
                    }
                }
            }
        } else {
            if (!(cVar instanceof c.d)) {
                if (cVar instanceof c.InterfaceC0413c) {
                    c.InterfaceC0413c interfaceC0413c = (c.InterfaceC0413c) cVar;
                    if (kotlin.jvm.internal.L.f(interfaceC0413c, c.InterfaceC0413c.a.f7162a)) {
                        return C43175k.h(new J(this, null));
                    }
                    if (interfaceC0413c instanceof c.InterfaceC0413c.b) {
                        return C43175k.G(new C31798n(oVar2, interfaceC0413c, null, this));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!(cVar instanceof c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c.a aVar = (c.a) cVar;
                if (aVar instanceof c.a.C0410a) {
                    return C43175k.h(new C31780e(oVar2, aVar, null, this));
                }
                if (aVar instanceof c.a.b) {
                    return C43175k.G(new C31800o(oVar2, aVar, null, this));
                }
                throw new NoWhenBranchMatchedException();
            }
            c.d dVar2 = (c.d) cVar;
            if (!kotlin.jvm.internal.L.f(dVar2, c.d.a.f7164a)) {
                if (dVar2 instanceof c.d.b) {
                    return C43175k.G(new C31796m(oVar2, dVar2, null, this));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(d.i.f7181a);
            this.f187932l.c(new BannerEvent.a("notifications", NotificationsSettings.Section.SECTION_MESSENGER, "top", "click"));
        }
        return c43210w;
    }

    public final Object h(com.avito.android.arch.mvi.utils.l lVar, UseCaseScenario useCaseScenario, SuspendLambda suspendLambda) {
        return i(lVar, new S(this, useCaseScenario, lVar, null), suspendLambda);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d A[Catch: all -> 0x00ec, TRY_ENTER, TryCatch #2 {all -> 0x00ec, blocks: (B:50:0x0118, B:59:0x015d, B:60:0x0162, B:35:0x00cd, B:39:0x00e6, B:40:0x00eb), top: B:87:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.avito.android.arch.mvi.utils.l r23, ru.avito.messenger.MessengerUserHashInfo r24, com.avito.android.messenger.channels.mvi.list_feature.C31772a.b r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31772a.j(com.avito.android.arch.mvi.utils.l, ru.avito.messenger.MessengerUserHashInfo, com.avito.android.messenger.channels.mvi.list_feature.a$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
