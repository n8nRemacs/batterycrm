package com.avito.android.messenger.conversation.mvi.in_app_calls;

import XL.a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import arrow.core.X0;
import arrow.core.Y0;
import arrow.core.Z0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.calltracking.remote.model.RecallFromGsmContext;
import com.avito.android.deep_linking.links.ChannelCallLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_dialer_models.abstract_module.IacItemInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacPeerInfo;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeRecallLink;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.deeplink.ChannelIacCallLink;
import com.avito.android.messenger.deeplink.IacSellerChannelCallLinkV2;
import com.avito.android.mvi.b;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.ChatAvatar;
import com.avito.android.remote.model.messenger.PublicProfile;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import nJ.C44282q;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelIacInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "c", "d", "e", "f", "g", "h", "i", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC32892c<ChannelIacInteractor.State> implements ChannelIacInteractor {

    /* renamed from: V, reason: collision with root package name */
    @k
    public final XL.a f191351V;

    /* renamed from: W, reason: collision with root package name */
    @k
    public final LL.b f191352W;

    /* renamed from: X, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f191353X;

    /* renamed from: Y, reason: collision with root package name */
    @k
    public final InterfaceC28373a f191354Y;

    /* renamed from: Z, reason: collision with root package name */
    @k
    public final E f191355Z;

    /* renamed from: a0, reason: collision with root package name */
    @k
    public final W1 f191356a0;

    /* renamed from: b0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f191357b0;

    /* renamed from: c0, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<Boolean> f191358c0;

    /* renamed from: d0, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<G0> f191359d0;

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "channelContext", "Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$d;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.in_app_calls.a$a, reason: collision with other inner class name */
    public static final class C5654a<T, R> implements o {
        public C5654a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo;
            T next;
            T next2;
            T next3;
            String id2;
            DeepLink deepLink;
            DeepLink deepLink2;
            ChatAvatar avatar;
            InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
            a aVar = a.this;
            aVar.getClass();
            com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
            b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
            Channel channel = dVar != null ? dVar.f207035a : (T) null;
            if (c5631a.f190239d || channel == null) {
                Y0.f56266a.getClass();
                return X0.f56264b;
            }
            Iterator<T> it = channel.getUsers().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                messengerUserHashInfo = c5631a.f190236a;
                if (!zHasNext) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (!L.f(((User) next).getId(), messengerUserHashInfo.f430682d)) {
                    break;
                }
            }
            User user = next;
            ChannelContext context = channel.getContext();
            ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
            boolean zF2 = L.f(item != null ? item.getUserId() : null, messengerUserHashInfo.f430682d);
            Iterator<T> it2 = channel.getContext().getMenu().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = (T) null;
                    break;
                }
                next2 = it2.next();
                if (((ChannelMenuAction) next2).getDeepLink() instanceof ChannelCallLink) {
                    break;
                }
            }
            ChannelMenuAction channelMenuAction = next2;
            DeepLink deepLink3 = channelMenuAction != null ? channelMenuAction.getDeepLink() : null;
            Iterator<T> it3 = channel.getContext().getMenu().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = (T) null;
                    break;
                }
                next3 = it3.next();
                if (((ChannelMenuAction) next3).getDeepLink() instanceof ChannelIacCallLink) {
                    break;
                }
            }
            ChannelMenuAction channelMenuAction2 = next3;
            DeepLink deepLink4 = channelMenuAction2 != null ? channelMenuAction2.getDeepLink() : null;
            ChannelIacCallLink channelIacCallLink = deepLink4 instanceof ChannelIacCallLink ? (ChannelIacCallLink) deepLink4 : null;
            String id3 = item != null ? item.getId() : null;
            if (user == null || (id2 = user.getId()) == null) {
                id2 = "";
            }
            RecallFromGsmContext recallFromGsmContext = new RecallFromGsmContext(id3, id2, aVar.f191355Z.a(), channel.getChannelId());
            if (user == null || item == null) {
                if (user == null) {
                    Y0.f56266a.getClass();
                    return X0.f56264b;
                }
                if (deepLink3 == null) {
                    deepLink = channelIacCallLink != null ? channelIacCallLink.f195318d : null;
                } else {
                    deepLink = deepLink3;
                }
                return Z0.b(new d(recallFromGsmContext, deepLink, null, channelIacCallLink, channel.getChannelId(), false));
            }
            String name = user.getName();
            String str = name == null ? "" : name;
            PublicProfile publicProfile = user.getPublicProfile();
            IacCallContext iacCallContext = new IacCallContext("messenger_chat_menu", new IacPeerInfo((publicProfile == null || (avatar = publicProfile.getAvatar()) == null) ? null : avatar.getImage(), user.getId(), str, "", C42784z0.f406748b), new IacItemInfo(item.getId(), null, item.getTitle(), item.getPrice(), item.getImage(), null, 32, null), null, null);
            if (deepLink3 == null) {
                deepLink2 = channelIacCallLink != null ? channelIacCallLink.f195318d : null;
            } else {
                deepLink2 = deepLink3;
            }
            return Z0.b(new d(recallFromGsmContext, deepLink2, iacCallContext, channelIacCallLink, channel.getChannelId(), zF2));
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$d;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.this.le().s(new g((d) obj));
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32890a<ChannelIacInteractor.State> {
        public c() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(ChannelIacInteractor.State state) {
            ChannelIacInteractor.State state2 = state;
            ChannelIacInteractor.State.Content content = state2 instanceof ChannelIacInteractor.State.Content ? (ChannelIacInteractor.State.Content) state2 : null;
            if (content != null) {
                a aVar = a.this;
                ChannelIacCallLink channelIacCallLink = content.f191343d;
                if (channelIacCallLink != null) {
                    aVar.le().s(a.this.new f(channelIacCallLink.f195316b, false, null, channelIacCallLink.f195318d, null));
                } else {
                    aVar.le().s(((ChannelIacInteractor.State.Content) state2).f191346g ? a.this.new f("seller_messenger_chat", false, null, null, null) : a.this.new f("messenger_chat_menu", false, null, null, null));
                }
            }
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$d;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final IacCallContext f191363a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f191364b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f191365c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ChannelIacCallLink f191366d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f191367e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final RecallFromGsmContext f191368f;

        public d(@l RecallFromGsmContext recallFromGsmContext, @l DeepLink deepLink, @l IacCallContext iacCallContext, @l ChannelIacCallLink channelIacCallLink, @k String str, boolean z12) {
            this.f191363a = iacCallContext;
            this.f191364b = z12;
            this.f191365c = deepLink;
            this.f191366d = channelIacCallLink;
            this.f191367e = str;
            this.f191368f = recallFromGsmContext;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f191363a, dVar.f191363a) && this.f191364b == dVar.f191364b && L.f(this.f191365c, dVar.f191365c) && L.f(this.f191366d, dVar.f191366d) && L.f(this.f191367e, dVar.f191367e) && L.f(this.f191368f, dVar.f191368f);
        }

        public final int hashCode() {
            IacCallContext iacCallContext = this.f191363a;
            int i12 = r.i((iacCallContext == null ? 0 : iacCallContext.hashCode()) * 31, 31, this.f191364b);
            DeepLink deepLink = this.f191365c;
            int iHashCode = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            ChannelIacCallLink channelIacCallLink = this.f191366d;
            int iD2 = H.d((iHashCode + (channelIacCallLink == null ? 0 : channelIacCallLink.hashCode())) * 31, 31, this.f191367e);
            RecallFromGsmContext recallFromGsmContext = this.f191368f;
            return iD2 + (recallFromGsmContext != null ? recallFromGsmContext.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ChannelContextState(callContext=" + this.f191363a + ", isCurrentUserItem=" + this.f191364b + ", gsmCallLink=" + this.f191365c + ", iacCallLink=" + this.f191366d + ", channelId=" + this.f191367e + ", recallFromGsmMessageContext=" + this.f191368f + ')';
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends C32891b<ChannelIacInteractor.State> {
        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(ChannelIacInteractor.State state) {
            return new G(new com.avito.android.messenger.conversation.mvi.in_app_calls.b(state, a.this, 0));
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends C32890a<ChannelIacInteractor.State> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f191370d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191371e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Boolean f191372f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DeepLink f191373g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final IacMakeRecallLink f191374h;

        public f(@k String str, boolean z12, @l Boolean bool, @l DeepLink deepLink, @l IacMakeRecallLink iacMakeRecallLink) {
            super(null, null, 3, null);
            this.f191370d = str;
            this.f191371e = z12;
            this.f191372f = bool;
            this.f191373g = deepLink;
            this.f191374h = iacMakeRecallLink;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(ChannelIacInteractor.State state) {
            int i12 = 1;
            ChannelIacInteractor.State state2 = state;
            DeepLink f191348c = this.f191373g;
            if (f191348c == null) {
                f191348c = state2.getF191348c();
            }
            IacCallContext f191347b = state2.getF191347b();
            String str = this.f191370d;
            a aVar = a.this;
            if (f191347b == null) {
                a.me(aVar, f191348c, str, null);
                G0 g02 = G0.f406611a;
                return;
            }
            IacCallContext iacCallContextA = IacCallContext.a(f191347b, str, null, 30);
            IacMakeRecallLink iacMakeRecallLink = this.f191374h;
            String str2 = iacMakeRecallLink != null ? iacMakeRecallLink.f168713b : null;
            aVar.getClass();
            boolean zF2 = L.f(iacCallContextA.f166824b, "deeplink_call_back");
            XL.a aVar2 = aVar.f191351V;
            aVar.f191357b0.b(A1.g(new C42017o(((!zF2 || str2 == null) ? aVar2.c(iacCallContextA, f191348c) : a.C1329a.a(aVar2, str2, aVar2.a(), "deeplink_call_back", f191348c, 16)).u(new C32102w0(i12)).j(new com.avito.android.messenger.conversation.mvi.in_app_calls.d(aVar)).s(aVar.f207133K.e()).r(new com.avito.android.messenger.conversation.mvi.in_app_calls.e(f191348c, this, aVar)), new C31684n(aVar, i12)), new com.avito.android.messenger.conversation.mvi.in_app_calls.f(f191348c, this, aVar), null, 2));
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends com.avito.android.mvi.rx3.with_monolithic_state.o<ChannelIacInteractor.State> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f191376d;

        public g(@k d dVar) {
            super(null, "channelState=" + dVar, 1, null);
            this.f191376d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final ChannelIacInteractor.State d(ChannelIacInteractor.State state) {
            ChannelIacInteractor.State state2 = state;
            boolean z12 = state2 instanceof ChannelIacInteractor.State.Content;
            d dVar = this.f191376d;
            if (z12) {
                IacCallContext iacCallContext = dVar.f191363a;
                return new ChannelIacInteractor.State.Content(dVar.f191368f, dVar.f191365c, iacCallContext, dVar.f191366d, dVar.f191367e, dVar.f191364b);
            }
            if (!(state2 instanceof ChannelIacInteractor.State.Empty)) {
                throw new NoWhenBranchMatchedException();
            }
            IacCallContext iacCallContext2 = dVar.f191363a;
            return new ChannelIacInteractor.State.Content(dVar.f191368f, dVar.f191365c, iacCallContext2, dVar.f191366d, dVar.f191367e, dVar.f191364b);
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends C32890a<ChannelIacInteractor.State> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final MessengerReallContactMethodLink f191377d;

        public h(@k MessengerReallContactMethodLink messengerReallContactMethodLink) {
            super(null, null, 3, null);
            this.f191377d = messengerReallContactMethodLink;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(ChannelIacInteractor.State state) {
            ChannelIacInteractor.State state2 = state;
            RecallFromGsmContext f191350e = state2.getF191350e();
            IacCallContext f191347b = state2.getF191347b();
            IacCallContext iacCallContextA = f191347b != null ? IacCallContext.a(f191347b, "gsm_messenger_bubble_callback", null, 30) : null;
            DeepLink f191348c = state2.getF191348c();
            MessengerReallContactMethodLink.f113765d.getClass();
            a.this.ne(this.f191377d, C22777e.b(new Q("RecallFromGsmContext", f191350e), new Q("IacCallContext", iacCallContextA), new Q("gsmCallLink", f191348c)));
        }
    }

    /* compiled from: ChannelIacInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/a$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class i extends C32891b<ChannelIacInteractor.State> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f191379d;

        /* JADX WARN: Multi-variable type inference failed */
        public i(@k DeepLink deepLink) {
            super(null, "deepLink=" + deepLink, 1, 0 == true ? 1 : 0);
            this.f191379d = deepLink;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(ChannelIacInteractor.State state) {
            a aVar = a.this;
            return new G(new com.avito.android.messenger.conversation.mvi.in_app_calls.b(this, aVar, 1)).z(aVar.f207133K.e());
        }
    }

    @Inject
    public a(@k InterfaceC31987a interfaceC31987a, @k XL.a aVar, @k LL.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k InterfaceC28373a interfaceC28373a, @k E e12, @k W1 w12, @k InterfaceC35745a5 interfaceC35745a5) {
        super("IacChannelInteractor", new ChannelIacInteractor.State.Empty(null, null, null, null, 15, null), interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f191351V = aVar;
        this.f191352W = bVar;
        this.f191353X = aVar2;
        this.f191354Y = interfaceC28373a;
        this.f191355Z = e12;
        this.f191356a0 = w12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f191357b0 = cVar;
        this.f191358c0 = C31685o.m();
        this.f191359d0 = C31685o.m();
        cVar.b(com.avito.android.util.rx3.arrow.b.a(interfaceC31987a.M0().j0(interfaceC35745a5.c()).d0(new C5654a())).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new b()));
    }

    public static final void me(a aVar, DeepLink deepLink, String str, IacCanCallResult iacCanCallResult) {
        DeepLink callbackDeepLink;
        aVar.getClass();
        G0 g02 = null;
        if (deepLink != null) {
            aVar.ne(deepLink, null);
            g02 = G0.f406611a;
        } else {
            IacCanCallResult.CanNot canNot = iacCanCallResult instanceof IacCanCallResult.CanNot ? (IacCanCallResult.CanNot) iacCanCallResult : null;
            if (canNot != null && (callbackDeepLink = canNot.getCallbackDeepLink()) != null) {
                aVar.ne(callbackDeepLink, null);
                g02 = G0.f406611a;
            }
        }
        if (g02 == null) {
            aVar.f191359d0.accept(G0.f406611a);
            aVar.f191354Y.c(new C44282q(str));
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final z Hc() {
        return this.f191358c0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final void U6(@k MessengerReallContactMethodLink messengerReallContactMethodLink) {
        le().s(new h(messengerReallContactMethodLink));
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final void Ub() {
        le().s(new e());
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final void Z3(@k DeepLink deepLink) {
        le().s(new i(deepLink));
    }

    public final void ne(DeepLink deepLink, Bundle bundle) {
        if (deepLink instanceof ChannelCallLink) {
            ChannelCallLink channelCallLink = (ChannelCallLink) deepLink;
            deepLink = new ChannelCallLink(channelCallLink.f133092b, channelCallLink.f133093c, this.f191356a0.f189243f);
        }
        b.a.a(this.f191353X, deepLink, null, bundle, 2);
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final z o7() {
        return this.f191359d0;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f191357b0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final void t6() {
        le().s(new c());
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final void z3(@k ChannelIacCallLink channelIacCallLink) {
        le().s(new f(channelIacCallLink.f195316b, false, null, channelIacCallLink.f195318d, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor
    public final void zc(@k IacSellerChannelCallLinkV2 iacSellerChannelCallLinkV2) {
        le().s(new f("seller_messenger_chat", iacSellerChannelCallLinkV2.f195350b, Boolean.valueOf(iacSellerChannelCallLinkV2.f195352d), null, null));
    }
}
