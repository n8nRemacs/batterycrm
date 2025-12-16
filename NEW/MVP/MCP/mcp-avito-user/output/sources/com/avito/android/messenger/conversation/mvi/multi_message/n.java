package com.avito.android.messenger.conversation.mvi.multi_message;

import F20.a;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.view.N0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.messenger.analytics.i0;
import com.avito.android.messenger.conversation.mvi.common.a;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.multi_message.m;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.multi_message_send.deeplink.MultiMessageBannerCloseDeeplink;
import com.avito.android.multi_message_send.deeplink.MultiMessageModalScreenDeeplink;
import com.avito.android.mvi.b;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import com.avito.android.util.rx3.A;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.rx3.y;

/* compiled from: MultiMessagePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m;", "Lcom/avito/android/messenger/conversation/mvi/common/d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "f", "g", "h", "i", "j", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n extends AbstractC32892c<m.b> implements m, com.avito.android.messenger.conversation.mvi.common.d {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f193719h0 = 0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.multi_message_send.domain.a f193720V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.multi_message_send.domain.g f193721W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.multi_message_send.domain.n f193722X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.common.a f193723Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.multi_message.j f193724Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.multi_message.a f193725a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f193726b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f193727c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final u3.l<MultiMessageSendTestGroup> f193728d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final D<G0> f193729e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f193730f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC5627a.b f193731g0;

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "it", "Lio/reactivex/rxjava3/core/w;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            String id2;
            Long lZ02;
            InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
            int i12 = n.f193719h0;
            n.this.getClass();
            com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
            b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
            Channel channel = dVar != null ? dVar.f207035a : (T) null;
            if (!c5631a.f190239d && channel != null) {
                ChannelContext context = channel.getContext();
                ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
                if (item != null && (id2 = item.getId()) != null && (lZ02 = C43066x.z0(id2)) != null) {
                    long jLongValue = lZ02.longValue();
                    LocalMessage lastMessage = channel.getLastMessage();
                    boolean z12 = true;
                    if (lastMessage == null || !lastMessage.isFailed()) {
                        LocalMessage lastMessage2 = channel.getLastMessage();
                        String remoteId = lastMessage2 != null ? lastMessage2.getRemoteId() : null;
                        if (remoteId != null && !C43066x.K(remoteId)) {
                            z12 = false;
                        }
                    }
                    LocalMessage lastMessage3 = channel.getLastMessage();
                    MessageBody body = lastMessage3 != null ? lastMessage3.getBody() : null;
                    MessageBody.Text.Regular regular = body instanceof MessageBody.Text.Regular ? (MessageBody.Text.Regular) body : null;
                    String text = regular != null ? regular.getText() : null;
                    String channelId = channel.getChannelId();
                    String str = (text == null || z12) ? null : text;
                    LocalMessage lastMessage4 = channel.getLastMessage();
                    iVar = new i(jLongValue, channelId, str, lastMessage4 != null ? lastMessage4.getLocalId() : null);
                }
            }
            return A.a(iVar);
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;", "it", "", "test", "(Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return n.this.f193724Z.b(((i) obj).f193739a);
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;", "it", "", "test", "(Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.r {
        public c() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            String str = ((i) obj).f193741c;
            if (str == null) {
                str = "";
            }
            int i12 = n.f193719h0;
            n nVar = n.this;
            nVar.getClass();
            if (C43066x.K(str)) {
                return false;
            }
            return nVar.f193720V.a(str);
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "LF20/a;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            i iVar = (i) obj;
            return z.K0(y.b(n.this.f193721W.a(iVar.f193739a)), z.F0(2000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b), o.f193746b).d0(new p(iVar));
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;", "LF20/a;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Q q12 = (Q) obj;
            i iVar = (i) q12.f406619b;
            F20.a aVar = (F20.a) q12.f406620c;
            n nVar = n.this;
            InterfaceC28373a interfaceC28373a = nVar.f193727c0;
            StringBuilder sb2 = new StringBuilder("messenger.massquestion.group.");
            u3.l<MultiMessageSendTestGroup> lVar = nVar.f193728d0;
            sb2.append(lVar.f439745a.f439749b.name());
            interfaceC28373a.c(new y.a(sb2.toString(), 0L, 2, null));
            lVar.b();
            MultiMessageSendTestGroup multiMessageSendTestGroup = lVar.f439745a.f439749b;
            multiMessageSendTestGroup.getClass();
            if (multiMessageSendTestGroup == MultiMessageSendTestGroup.f206463e || multiMessageSendTestGroup == MultiMessageSendTestGroup.f206464f) {
                nVar.le().s(nVar.new j(iVar, aVar));
            }
            nVar.f193730f0.e();
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<m.b> {
        public f() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final m.b d(m.b bVar) {
            m.b bVar2 = bVar;
            int i12 = n.f193719h0;
            n nVar = n.this;
            nVar.getClass();
            m.b.C5728b c5728b = bVar2 instanceof m.b.C5728b ? (m.b.C5728b) bVar2 : null;
            if (c5728b != null) {
                m.a aVar = c5728b.f193718b;
                nVar.f193724Z.a(aVar.f193711a);
                if (aVar.f193715e instanceof MultiMessageBannerCloseDeeplink) {
                    C43259k.d(N0.a(nVar), null, null, new q(nVar, c5728b, null), 3);
                }
            }
            return m.b.a.f193716a;
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$g;", "", "<init>", "()V", "", "DELAY_BEFORE_CHECK_OTHER_ACTION_VISIBILITY_MILLSEC", "J", "", "MULTI_MESSAGE_GROUP_ANALYTICS_TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g {
        public /* synthetic */ g(C42822w c42822w) {
            this();
        }

        public g() {
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.o<m.b> {
        public h() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final m.b d(m.b bVar) {
            m.b bVar2 = bVar;
            int i12 = n.f193719h0;
            n nVar = n.this;
            nVar.getClass();
            m.b.C5728b c5728b = bVar2 instanceof m.b.C5728b ? (m.b.C5728b) bVar2 : null;
            if (c5728b != null) {
                m.a aVar = c5728b.f193718b;
                String str = aVar.f193713c;
                if (!C43066x.K(str)) {
                    nVar.f193729e0.postValue(G0.f406611a);
                    DeepLink deepLink = aVar.f193714d;
                    boolean z12 = deepLink instanceof MultiMessageModalScreenDeeplink;
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = nVar.f193726b0;
                    if (z12) {
                        Bundle bundleM = com.avito.android.actions_sheet.a.m("MESSAGE_TEXT_KEY", str);
                        bundleM.putString("CHANNEL_ID_KEY", aVar.f193712b);
                        b.a.a(aVar2, deepLink, null, bundleM, 2);
                    } else {
                        b.a.a(aVar2, deepLink, null, null, 6);
                    }
                }
            }
            return m.b.a.f193716a;
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$i;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i {

        /* renamed from: a, reason: collision with root package name */
        public final long f193739a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f193740b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f193741c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f193742d;

        public i(long j12, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
            this.f193739a = j12;
            this.f193740b = str;
            this.f193741c = str2;
            this.f193742d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f193739a == iVar.f193739a && L.f(this.f193740b, iVar.f193740b) && L.f(this.f193741c, iVar.f193741c) && L.f(this.f193742d, iVar.f193742d);
        }

        public final int hashCode() {
            int iD2 = H.d(Long.hashCode(this.f193739a) * 31, 31, this.f193740b);
            String str = this.f193741c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f193742d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiMessageState(itemId=");
            sb2.append(this.f193739a);
            sb2.append(", channelId=");
            sb2.append(this.f193740b);
            sb2.append(", lastMessage=");
            sb2.append(this.f193741c);
            sb2.append(", lastMessageId=");
            return C22026a.c(sb2, this.f193742d, ')');
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/n$j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class j extends com.avito.android.mvi.rx3.with_monolithic_state.o<m.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final i f193743d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final F20.a f193744e;

        public j(@Y61.k i iVar, @Y61.k F20.a aVar) {
            super(null, null, 3, null);
            this.f193743d = iVar;
            this.f193744e = aVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final m.b d(m.b bVar) {
            i iVar = this.f193743d;
            String str = iVar.f193741c;
            if (str == null || C43066x.K(str)) {
                return m.b.a.f193716a;
            }
            n nVar = n.this;
            nVar.f193723Y.f(nVar.f193731g0);
            com.avito.android.messenger.conversation.mvi.multi_message.a aVar = nVar.f193725a0;
            F20.a aVar2 = this.f193744e;
            com.avito.android.messenger.conversation.mvi.multi_message.composable.i iVarA = aVar.a(aVar2);
            nVar.f193727c0.c(new i0(iVar.f193740b));
            a.C0272a c0272a = aVar2.f4489e;
            return new m.b.C5728b(iVarA, new m.a(iVar.f193739a, iVar.f193740b, iVar.f193741c, c0272a.f4492b, aVar2.f4490f));
        }
    }

    static {
        new g(null);
    }

    @Inject
    public n(@Y61.k com.avito.android.multi_message_send.domain.a aVar, @Y61.k com.avito.android.multi_message_send.domain.g gVar, @Y61.k com.avito.android.multi_message_send.domain.n nVar, @Y61.k com.avito.android.messenger.conversation.mvi.common.a aVar2, @Y61.k com.avito.android.messenger.conversation.mvi.multi_message.j jVar, @Y61.k com.avito.android.messenger.conversation.mvi.multi_message.a aVar3, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar4, @Y61.k InterfaceC28373a interfaceC28373a, @x20.d @Y61.k u3.l<MultiMessageSendTestGroup> lVar, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("MultiMessagePresenter", m.b.a.f193716a, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f193720V = aVar;
        this.f193721W = gVar;
        this.f193722X = nVar;
        this.f193723Y = aVar2;
        this.f193724Z = jVar;
        this.f193725a0 = aVar3;
        this.f193726b0 = aVar4;
        this.f193727c0 = interfaceC28373a;
        this.f193728d0 = lVar;
        this.f193729e0 = new D<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f193730f0 = cVar;
        this.f193731g0 = a.InterfaceC5627a.b.f190148a;
        aVar2.c(this);
        if (lVar.f439745a.f439749b.a()) {
            cVar.b(new C41933a0(interfaceC31987a.M0().j0(interfaceC35745a5.c()), new a()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L).N(new b()).N(new s(this)).N(new c()).T(new d(), Integer.MAX_VALUE).N(new s(this)).t0(new e()));
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.m
    public final void Fb() {
        le().s(new h());
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.m
    /* renamed from: G0, reason: from getter */
    public final D getF193729e0() {
        return this.f193729e0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.d
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L Ga() {
        return this.f207139Q.d0(r.f193755b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f193730f0.e();
        this.f193723Y.b(this);
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.m
    public final void s1() {
        le().s(new f());
    }
}
