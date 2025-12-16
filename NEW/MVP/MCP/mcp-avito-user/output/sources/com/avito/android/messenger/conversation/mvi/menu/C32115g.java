package com.avito.android.messenger.conversation.mvi.menu;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.C22491k0;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.T;
import com.avito.android.messenger.analytics.f0;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.M0;
import j.k0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import nJ.C44275j;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelMenuInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/g;", "Lcom/avito/android/messenger/conversation/mvi/menu/a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "a", "b", "c", "d", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.menu.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32115g extends AbstractC32892c<InterfaceC32109a.AbstractC5655a> implements InterfaceC32109a {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f191429V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.blacklist_reasons.y f191430W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191431X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final ChannelSyncAgent f191432Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31700h f191433Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f191434a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<AbstractC23662a<Throwable, G0>> f191435b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<AbstractC23662a<Throwable, G0>> f191436c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<AbstractC23662a<Throwable, G0>> f191437d0;

    /* compiled from: ChannelMenuInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/g$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.g$a */
    public final class a extends C32891b<InterfaceC32109a.AbstractC5655a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f191438d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k String str) {
            super(null, "channelId = ".concat(str), 1, 0 == true ? 1 : 0);
            this.f191438d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(InterfaceC32109a.AbstractC5655a abstractC5655a) {
            InterfaceC32109a.AbstractC5655a abstractC5655a2 = abstractC5655a;
            if (abstractC5655a2.getF191422a().f430682d.length() <= 0) {
                return I.q(G0.f406611a);
            }
            C32115g c32115g = C32115g.this;
            return c32115g.f191433Z.f(this.f191438d, abstractC5655a2.getF191422a()).B(G0.f406611a).k(new C32114f(c32115g)).u(new androidx.room.rxjava3.b(c32115g, 7));
        }
    }

    /* compiled from: ChannelMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/g$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.g$b */
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32109a.AbstractC5655a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f191440d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Channel f191441e;

        public b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l Channel channel) {
            StringBuilder sb2 = new StringBuilder("NewChannelContextStateMutator(");
            sb2.append(messengerUserHashInfo.f430682d);
            sb2.append(", ");
            super(C22026a.c(sb2, channel != null ? channel.getChannelId() : null, ')'), null, 2, null);
            this.f191440d = messengerUserHashInfo;
            this.f191441e = channel;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC32109a.AbstractC5655a d(InterfaceC32109a.AbstractC5655a abstractC5655a) {
            InterfaceC32109a.AbstractC5655a abstractC5655a2 = abstractC5655a;
            InterfaceC32109a.AbstractC5655a.C5656a c5656a = InterfaceC32109a.AbstractC5655a.C5656a.f191420a;
            boolean zEquals = abstractC5655a2.equals(c5656a);
            Channel channel = this.f191441e;
            MessengerUserHashInfo messengerUserHashInfo = this.f191440d;
            if (zEquals) {
                return (C43066x.K(messengerUserHashInfo.f430682d) || channel == null) ? abstractC5655a2 : new InterfaceC32109a.AbstractC5655a.b(messengerUserHashInfo, channel);
            }
            if (!(abstractC5655a2 instanceof InterfaceC32109a.AbstractC5655a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (C43066x.K(messengerUserHashInfo.f430682d) || channel == null) {
                return c5656a;
            }
            InterfaceC32109a.AbstractC5655a.b bVar = (InterfaceC32109a.AbstractC5655a.b) abstractC5655a2;
            if (L.f(bVar.f191422a, messengerUserHashInfo)) {
                Channel channel2 = bVar.f191423b;
                if (L.f(channel2.getChannelId(), channel.getChannelId()) && channel2.getUpdated() >= channel.getUpdated() && L.f(channel2.getContext(), channel.getContext())) {
                    return bVar;
                }
            }
            return new InterfaceC32109a.AbstractC5655a.b(messengerUserHashInfo, channel);
        }
    }

    /* compiled from: ChannelMenuInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/g$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.g$c */
    public final class c extends C32890a<InterfaceC32109a.AbstractC5655a> {
        public c() {
            super("TrackCallUserMenuAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(InterfaceC32109a.AbstractC5655a abstractC5655a) {
            InterfaceC32109a.AbstractC5655a abstractC5655a2 = abstractC5655a;
            boolean z12 = abstractC5655a2 instanceof InterfaceC32109a.AbstractC5655a.b;
            C32115g c32115g = C32115g.this;
            if (z12) {
                ChannelContext context = ((InterfaceC32109a.AbstractC5655a.b) abstractC5655a2).f191423b.getContext();
                ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
                c32115g.f191431X.c(new C44275j(item != null ? item.getId() : null));
            } else if (abstractC5655a2.equals(InterfaceC32109a.AbstractC5655a.C5656a.f191420a)) {
                V2.f318762a.j(c32115g.f207131E, "ChannelMenuGsmClickedEvent wasn't tracked – channel wasn't loaded", null);
            }
        }
    }

    /* compiled from: ChannelMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/g$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.g$d */
    public final class d extends C32890a<InterfaceC32109a.AbstractC5655a> {
        public d() {
            super("TrackMenuOpenedAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(InterfaceC32109a.AbstractC5655a abstractC5655a) {
            InterfaceC32109a.AbstractC5655a abstractC5655a2 = abstractC5655a;
            boolean z12 = abstractC5655a2 instanceof InterfaceC32109a.AbstractC5655a.b;
            C32115g c32115g = C32115g.this;
            if (z12) {
                ChannelContext context = ((InterfaceC32109a.AbstractC5655a.b) abstractC5655a2).f191423b.getContext();
                ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
                c32115g.f191431X.c(new f0(c32115g.f191429V, item != null ? item.getId() : null, item != null ? item.getUserId() : null));
            } else if (abstractC5655a2.equals(InterfaceC32109a.AbstractC5655a.C5656a.f191420a)) {
                V2.f318762a.j(c32115g.f207131E, "ShowChatMenuEvent wasn't tracked – channel wasn't loaded", null);
            }
        }
    }

    /* compiled from: ChannelMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/g$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.g$e */
    public final class e extends C32890a<InterfaceC32109a.AbstractC5655a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f191444d;

        public e(@Y61.k String str) {
            super(C22491k0.a(')', "TrackProfileOpenedAction(", str), null, 2, null);
            this.f191444d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(InterfaceC32109a.AbstractC5655a abstractC5655a) {
            InterfaceC32109a.AbstractC5655a abstractC5655a2 = abstractC5655a;
            boolean z12 = abstractC5655a2 instanceof InterfaceC32109a.AbstractC5655a.b;
            C32115g c32115g = C32115g.this;
            if (!z12) {
                if (abstractC5655a2.equals(InterfaceC32109a.AbstractC5655a.C5656a.f191420a)) {
                    V2.f318762a.j(c32115g.f207131E, "OpenUserProfileEvent wasn't tracked – channel wasn't loaded", null);
                }
            } else {
                ChannelContext context = ((InterfaceC32109a.AbstractC5655a.b) abstractC5655a2).f191423b.getContext();
                ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
                c32115g.f191431X.c(new T(c32115g.f191429V, this.f191444d, item != null ? item.getId() : null, item != null ? item.getUserId() : null, "messenger_chat_menu"));
            }
        }
    }

    /* compiled from: ChannelMenuInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/g$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.g$f */
    public final class f extends C32891b<InterfaceC32109a.AbstractC5655a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f191446d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f191447e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f191448f;

        /* JADX WARN: Multi-variable type inference failed */
        public f(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
            super("UserBlockedReaction(" + str + ", " + str2 + ')', null, 2, 0 == true ? 1 : 0);
            this.f191446d = str;
            this.f191447e = str2;
            this.f191448f = str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        
            if (kotlin.jvm.internal.L.f(r0 != null ? r0.getId() : null, r2) != false) goto L39;
         */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.reactivex.rxjava3.core.I b(com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a.AbstractC5655a r7) {
            /*
                r6 = this;
                com.avito.android.messenger.conversation.mvi.menu.a$a r7 = (com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a.AbstractC5655a) r7
                com.avito.android.remote.model.messenger.Channel r0 = r7.getF191423b()
                if (r0 != 0) goto L10
                kotlin.G0 r7 = kotlin.G0.f406611a
                io.reactivex.rxjava3.internal.operators.single.M r7 = io.reactivex.rxjava3.core.I.q(r7)
                goto Ldf
            L10:
                java.lang.String r1 = r6.f191446d
                boolean r2 = kotlin.text.C43066x.K(r1)
                if (r2 != 0) goto Ld9
                com.avito.android.remote.model.messenger.Channel r2 = r7.getF191423b()
                if (r2 == 0) goto Ld9
                java.util.List r2 = r2.getUsers()
                if (r2 == 0) goto Ld9
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                boolean r3 = r2 instanceof java.util.Collection
                if (r3 == 0) goto L35
                r3 = r2
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L35
                goto Ld9
            L35:
                java.util.Iterator r2 = r2.iterator()
            L39:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Ld9
                java.lang.Object r3 = r2.next()
                com.avito.android.remote.model.User r3 = (com.avito.android.remote.model.User) r3
                java.lang.String r3 = r3.getId()
                boolean r3 = kotlin.jvm.internal.L.f(r3, r1)
                if (r3 == 0) goto L39
                java.lang.String r2 = r6.f191447e
                boolean r3 = kotlin.text.C43066x.K(r2)
                com.avito.android.messenger.conversation.mvi.menu.g r4 = com.avito.android.messenger.conversation.mvi.menu.C32115g.this
                r5 = 0
                if (r3 != 0) goto L62
                java.lang.String r3 = r4.f191429V
                boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
                if (r2 != 0) goto L88
            L62:
                java.lang.String r2 = r6.f191448f
                if (r2 == 0) goto Ld9
                boolean r3 = kotlin.text.C43066x.K(r2)
                if (r3 == 0) goto L6e
                goto Ld9
            L6e:
                com.avito.android.remote.model.messenger.context.ChannelContext r0 = r0.getContext()
                boolean r3 = r0 instanceof com.avito.android.remote.model.messenger.context.ChannelContext.Item
                if (r3 == 0) goto L79
                com.avito.android.remote.model.messenger.context.ChannelContext$Item r0 = (com.avito.android.remote.model.messenger.context.ChannelContext.Item) r0
                goto L7a
            L79:
                r0 = r5
            L7a:
                if (r0 == 0) goto L81
                java.lang.String r0 = r0.getId()
                goto L82
            L81:
                r0 = r5
            L82:
                boolean r0 = kotlin.jvm.internal.L.f(r0, r2)
                if (r0 == 0) goto Ld9
            L88:
                ru.avito.messenger.MessengerUserHashInfo r0 = r7.getF191422a()
                java.lang.String r0 = r0.f430682d
                boolean r0 = kotlin.text.C43066x.K(r0)
                if (r0 != 0) goto Lc7
                boolean r0 = kotlin.text.C43066x.K(r1)
                if (r0 != 0) goto Lc7
                com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent r0 = r4.f191432Y
                ru.avito.messenger.MessengerUserHashInfo r2 = r7.getF191422a()
                com.avito.android.remote.model.messenger.Channel r7 = r7.getF191423b()
                if (r7 == 0) goto Lb8
                com.avito.android.remote.model.messenger.context.ChannelContext r7 = r7.getContext()
                boolean r3 = r7 instanceof com.avito.android.remote.model.messenger.context.ChannelContext.Item
                if (r3 == 0) goto Lb1
                com.avito.android.remote.model.messenger.context.ChannelContext$Item r7 = (com.avito.android.remote.model.messenger.context.ChannelContext.Item) r7
                goto Lb2
            Lb1:
                r7 = r5
            Lb2:
                if (r7 == 0) goto Lb8
                java.lang.String r5 = r7.getId()
            Lb8:
                if (r5 != 0) goto Lbc
                java.lang.String r5 = ""
            Lbc:
                java.lang.String r7 = r4.f191429V
                io.reactivex.rxjava3.core.a r7 = r0.d(r2, r1, r7, r5)
                io.reactivex.rxjava3.internal.operators.completable.I r7 = r7.r()
                goto Lc9
            Lc7:
                io.reactivex.rxjava3.internal.operators.completable.n r7 = io.reactivex.rxjava3.internal.operators.completable.C41823n.f402260b
            Lc9:
                kotlin.G0 r0 = kotlin.G0.f406611a
                io.reactivex.rxjava3.internal.operators.completable.T r7 = r7.B(r0)
                com.avito.android.messenger.conversation.mvi.menu.h r0 = new com.avito.android.messenger.conversation.mvi.menu.h
                r0.<init>(r4)
                io.reactivex.rxjava3.internal.operators.single.O r7 = r7.r(r0)
                goto Ldf
            Ld9:
                kotlin.G0 r7 = kotlin.G0.f406611a
                io.reactivex.rxjava3.internal.operators.single.M r7 = io.reactivex.rxjava3.core.I.q(r7)
            Ldf:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.menu.C32115g.f.b(java.lang.Object):io.reactivex.rxjava3.core.I");
        }
    }

    @k0
    public C32115g() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C32115g(@InterfaceC32438g0 @Y61.k String str, @Y61.k com.avito.android.messenger.blacklist_reasons.y yVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k ChannelSyncAgent channelSyncAgent, @Y61.k InterfaceC31700h interfaceC31700h) {
        super("ChannelMenuInteractor", InterfaceC32109a.AbstractC5655a.C5656a.f191420a, interfaceC35745a5, null, new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 232, null);
        this.f191429V = str;
        this.f191430W = yVar;
        this.f191431X = interfaceC28373a;
        this.f191432Y = channelSyncAgent;
        this.f191433Z = interfaceC31700h;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f191434a0 = cVar;
        this.f191435b0 = C31685o.m();
        this.f191436c0 = C31685o.m();
        this.f191437d0 = C31685o.m();
        cVar.b(interfaceC31987a.M0().j0(interfaceC35745a5.c()).d0(C32110b.f191424b).t0(new C32111c(this)));
        M0 m02 = new M0(this.f207139Q.j0(interfaceC35745a5.c()).d0(i.f191451b).D(io.reactivex.rxjava3.internal.functions.a.f401991a));
        cVar.b(m02.y0(new C32112d(this)).t0(new C32113e(this)));
        cVar.b(m02.N0());
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a
    public final io.reactivex.rxjava3.core.z D0() {
        return this.f191436c0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a
    public final io.reactivex.rxjava3.core.z D1() {
        return this.f191437d0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a
    public final void Q2() {
        le().s(new d());
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a
    public final void Q8() {
        le().s(new c());
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a
    public final io.reactivex.rxjava3.core.z Z() {
        return this.f191435b0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a
    public final void i9(@Y61.k String str) {
        le().s(new e(str));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f191430W.w0();
        this.f191434a0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a
    public final void q1(@Y61.k String str) {
        le().s(new a(str));
    }
}
