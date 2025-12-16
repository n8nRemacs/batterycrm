package com.avito.android.messenger.channels.mvi.sync;

import IY.a;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.di.InterfaceC32447j0;
import com.avito.android.messenger.di.InterfaceC32450k0;
import com.avito.android.persistence.messenger.C33126v0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.N4;
import com.avito.android.util.W4;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelsResponse;
import ru.avito.messenger.api.entity.GetChannelFilters;

/* compiled from: ChannelSyncAgent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/d;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent;", "Lcom/avito/android/util/N4;", "Lcom/avito/android/messenger/channels/mvi/sync/L;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31829d implements ChannelSyncAgent, N4, L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f188429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f188430b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.A f188431c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f188432d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.r f188433e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.Y f188434f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f188435g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f188436h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final MessengerStatsdEventFactory f188437i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f188438j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mvi.rx3.locks.j<IY.a> f188439k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f188440l;

    /* renamed from: m, reason: collision with root package name */
    public final int f188441m;

    /* renamed from: n, reason: collision with root package name */
    public final int f188442n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final L f188443o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final WY.a f188444p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.sync.K f188445q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W4 f188446r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C31852o0 f188447s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C31834f0 f188448t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final J f188449u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C31856q0 f188450v;

    /* compiled from: ChannelSyncAgent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/d$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.d$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Channel> f188451a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C33126v0 f188452b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f188453c;

        public a(@Y61.k List<Channel> list, @Y61.k C33126v0 c33126v0, boolean z12) {
            this.f188451a = list;
            this.f188452b = c33126v0;
            this.f188453c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f188451a, aVar.f188451a) && kotlin.jvm.internal.L.f(this.f188452b, aVar.f188452b) && this.f188453c == aVar.f188453c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f188453c) + ((this.f188452b.hashCode() + (this.f188451a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChatsAndListTagsV5(chats=");
            sb2.append(this.f188451a);
            sb2.append(", chatListTags=");
            sb2.append(this.f188452b);
            sb2.append(", hasMore=");
            return androidx.appcompat.app.r.x(sb2, this.f188453c, ')');
        }
    }

    /* compiled from: ChannelSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "channel", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lru/avito/messenger/api/entity/Channel;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.d$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f188455c;

        public b(MessengerUserHashInfo messengerUserHashInfo) {
            this.f188455c = messengerUserHashInfo;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Channel channel = (Channel) obj;
            return C31829d.this.f188448t.b(this.f188455c, channel).h(io.reactivex.rxjava3.core.I.q(channel.getChannelId()));
        }
    }

    /* compiled from: ChannelSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "channel", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lru/avito/messenger/api/entity/Channel;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.d$c */
    public static final class c<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f188457c;

        public c(MessengerUserHashInfo messengerUserHashInfo) {
            this.f188457c = messengerUserHashInfo;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return C31829d.this.f188448t.b(this.f188457c, (Channel) obj);
        }
    }

    /* compiled from: ChannelSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/ChannelsResponse;", "channelsResponse", "Lcom/avito/android/messenger/channels/mvi/sync/d$a;", "apply", "(Lru/avito/messenger/api/entity/ChannelsResponse;)Lcom/avito/android/messenger/channels/mvi/sync/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.d$d, reason: collision with other inner class name */
    public static final class C5555d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C33126v0 f188458b;

        public C5555d(C33126v0 c33126v0) {
            this.f188458b = c33126v0;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ChannelsResponse channelsResponse = (ChannelsResponse) obj;
            return new a(channelsResponse.getChannels(), this.f188458b, channelsResponse.getHasMore());
        }
    }

    /* compiled from: ChannelSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "it", "", "Lcom/avito/android/messenger/channels/mvi/sync/d$a;", "apply", "([Ljava/lang/Object;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.d$e */
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f188459b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add(obj2);
            }
            return arrayList;
        }
    }

    /* compiled from: ChannelSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/messenger/channels/mvi/sync/d$a;", "chatsAndListTagsResponse", "Lio/reactivex/rxjava3/core/O;", "", "Lcom/avito/android/persistence/messenger/v0;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.d$f */
    public static final class f<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f188461c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f188462d;

        public f(MessengerUserHashInfo messengerUserHashInfo, Boolean bool) {
            this.f188461c = messengerUserHashInfo;
            this.f188462d = bool;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo;
            C31829d c31829d;
            List list = (List) obj;
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                C42745f0.h(((a) it.next()).f188451a, arrayList);
            }
            Set setP0 = C42745f0.P0(arrayList);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(setP0, 10));
            Iterator<T> it2 = setP0.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                messengerUserHashInfo = this.f188461c;
                c31829d = C31829d.this;
                if (!zHasNext) {
                    break;
                }
                arrayList2.add(c31829d.f188432d.c(messengerUserHashInfo, (Channel) it2.next()));
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((a) it3.next()).f188452b);
            }
            com.avito.android.messenger.channels.mvi.data.r rVar = c31829d.f188433e;
            Boolean bool = this.f188462d;
            return rVar.h(messengerUserHashInfo, arrayList3, arrayList2, bool).q(c31829d.f188440l).B(kotlin.G0.f406611a).n(new C31843k(list, c31829d, messengerUserHashInfo, bool));
        }
    }

    /* compiled from: ChannelSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "channelsTimestamps", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.d$g */
    public static final class g<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f188464c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SortedSet<String> f188465d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SortedSet<String> f188466e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Boolean f188467f;

        public g(MessengerUserHashInfo messengerUserHashInfo, SortedSet<String> sortedSet, SortedSet<String> sortedSet2, Boolean bool) {
            this.f188464c = messengerUserHashInfo;
            this.f188465d = sortedSet;
            this.f188466e = sortedSet2;
            this.f188467f = bool;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            Long l12 = (Long) C42745f0.S(list);
            Long lValueOf = Long.valueOf(l12 != null ? l12.longValue() : 0L);
            C31829d c31829d = C31829d.this;
            int i12 = c31829d.f188442n;
            SortedSet<String> sortedSet = this.f188465d;
            SortedSet<String> sortedSet2 = this.f188466e;
            io.reactivex.rxjava3.internal.operators.single.S s5 = c31829d.f188431c.c(this.f188464c, lValueOf, i12, new GetChannelFilters(sortedSet, sortedSet2, this.f188467f, null, 8, null)).r(new C31853p(c31829d)).s(c31829d.f188440l);
            sortedSet.toString();
            sortedSet2.toString();
            c31829d.f188446r.getClass();
            return s5.n(new C31851o(C31829d.this, this.f188464c, list, sortedSet, sortedSet2, this.f188467f));
        }
    }

    public C31829d() {
        throw null;
    }

    @Inject
    public C31829d(@Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k ru.avito.messenger.A a12, @Y61.k com.avito.android.messenger.B b12, @Y61.k com.avito.android.messenger.channels.mvi.data.r rVar, @Y61.k com.avito.android.messenger.channels.mvi.data.Y y12, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.server_time.h hVar, @Y61.k MessengerStatsdEventFactory messengerStatsdEventFactory, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k L l12, @Y61.k WY.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.sync.K k12, @InterfaceC32447j0 @Y61.k com.avito.android.mvi.rx3.locks.j<IY.a> jVar, @InterfaceC32450k0 @Y61.k io.reactivex.rxjava3.core.H h12) {
        this.f188429a = w0Var;
        this.f188430b = interfaceC47842z;
        this.f188431c = a12;
        this.f188432d = b12;
        this.f188433e = rVar;
        this.f188434f = y12;
        this.f188435g = interfaceC35745a5;
        this.f188436h = hVar;
        this.f188437i = messengerStatsdEventFactory;
        this.f188438j = interfaceC28373a;
        this.f188439k = jVar;
        this.f188440l = h12;
        this.f188441m = 30;
        this.f188442n = 10;
        this.f188443o = l12;
        this.f188444p = aVar;
        this.f188445q = k12;
        this.f188446r = new W4("ChannelSyncAgent");
        new io.reactivex.rxjava3.disposables.c();
        C31852o0 c31852o0 = new C31852o0(interfaceC47842z, rVar, y12, interfaceC35745a5, jVar, h12);
        this.f188447s = c31852o0;
        C31834f0 c31834f0 = new C31834f0(interfaceC35745a5, rVar, a12, b12, new C31848m0(hVar, c30277e1, b12));
        this.f188448t = c31834f0;
        this.f188449u = new J(w0Var, interfaceC47842z, interfaceC35745a5, jVar, h12, c31852o0, c31834f0, k12, c30277e1);
        this.f188450v = new C31856q0(rVar, jVar, h12);
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent
    @Y61.k
    public final io.reactivex.rxjava3.core.I<String> a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        io.reactivex.rxjava3.core.I iT2 = this.f188439k.t(this.f188431c.a(messengerUserHashInfo, str, str2, str3, str4).s(this.f188435g.c()).n(new C31855q(this, messengerUserHashInfo)), "createChat", Collections.singleton(a.C0466a.f8191a), this.f188440l);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        this.f188446r.getClass();
        return iT2;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.A
    public final void b() {
        this.f188449u.b();
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31850n0
    @Y61.k
    public final AbstractC41768a c(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        AbstractC41768a abstractC41768aC = this.f188447s.c(str, messengerUserHashInfo);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        this.f188446r.getClass();
        return abstractC41768aC;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31850n0
    @Y61.k
    public final AbstractC41768a d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        AbstractC41768a abstractC41768aD = this.f188447s.d(messengerUserHashInfo, str, str2, str3);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        this.f188446r.getClass();
        return abstractC41768aD;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31854p0
    @Y61.k
    public final AbstractC41768a e(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        AbstractC41768a abstractC41768aE = this.f188450v.e(str, messengerUserHashInfo);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        this.f188446r.getClass();
        return abstractC41768aE;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent
    @Y61.k
    public final io.reactivex.rxjava3.core.I f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.core.I<T> iT2 = this.f188439k.t(this.f188430b.f(str, messengerUserHashInfo).s(this.f188435g.c()).n(new C31855q(this, messengerUserHashInfo)), "createChat", Collections.singleton(a.C0466a.f8191a), this.f188440l);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        this.f188446r.getClass();
        return iT2;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent
    @Y61.k
    public final io.reactivex.rxjava3.core.I<String> g(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        C42026y c42026yN = this.f188430b.k(messengerUserHashInfo, str, str2, str3).s(this.f188435g.c()).n(new b(messengerUserHashInfo));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        this.f188446r.getClass();
        return this.f188439k.t(c42026yN, "createAvitoChat", Collections.singleton(a.C0466a.f8191a), this.f188440l);
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChannelSyncAgent.c> h(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k SortedSet<String> sortedSet, @Y61.k SortedSet<String> sortedSet2, @Y61.l Boolean bool) {
        C42026y c42026yN = this.f188433e.l(messengerUserHashInfo, sortedSet, sortedSet2, bool).n(new g(messengerUserHashInfo, sortedSet, sortedSet2, bool));
        sortedSet.toString();
        sortedSet2.toString();
        this.f188446r.getClass();
        return this.f188439k.t(c42026yN, "syncNextPageV5", Collections.singleton(new a.c(sortedSet, sortedSet2)), this.f188440l);
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent
    @Y61.k
    public final AbstractC41768a i(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        AbstractC41768a abstractC41768aO = this.f188431c.b(str, messengerUserHashInfo).s(this.f188435g.c()).o(new c(messengerUserHashInfo));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        this.f188446r.getClass();
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(str));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188439k.t(abstractC41768aO.B(kotlin.G0.f406611a), "syncChat", setSingleton, this.f188440l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.SortedSet<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.TreeSet] */
    @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<C33126v0, ChannelSyncAgent.c>> j(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Collection<C33126v0> collection, @Y61.l Boolean bool) {
        Collection collectionM;
        Collection<C33126v0> collection2 = collection;
        ArrayList arrayList = new ArrayList(C42745f0.q(collection2, 10));
        Iterator it = collection2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            W4 w42 = this.f188446r;
            io.reactivex.rxjava3.core.H h12 = this.f188440l;
            if (!zHasNext) {
                C42026y c42026yN = io.reactivex.rxjava3.core.I.H(arrayList, e.f188459b).n(new f(messengerUserHashInfo, bool));
                String str = messengerUserHashInfo.f430682d;
                Objects.toString(collection);
                w42.getClass();
                return this.f188439k.t(c42026yN, "syncLatestChatsV5`", Collections.singleton(a.C0466a.f8191a), h12);
            }
            C33126v0 c33126v0 = (C33126v0) it.next();
            if (messengerUserHashInfo.f430681c instanceof MessengerUserType.Employee.Company) {
                collectionM = b1.m(new String[0]);
                collectionM.addAll(c33126v0.f215553b);
                collectionM.add("s");
            } else {
                collectionM = c33126v0.f215553b;
            }
            SortedSet<String> sortedSet = c33126v0.f215552a;
            Iterator it2 = it;
            GetChannelFilters getChannelFilters = new GetChannelFilters(sortedSet, collectionM, bool, null, 8, null);
            io.reactivex.rxjava3.internal.operators.single.S s5 = this.f188431c.c(messengerUserHashInfo, null, this.f188441m, getChannelFilters).r(new C31853p(this)).s(h12);
            sortedSet.toString();
            collectionM.toString();
            w42.getClass();
            arrayList.add(s5.r(new C5555d(c33126v0)));
            it = it2;
        }
    }
}
