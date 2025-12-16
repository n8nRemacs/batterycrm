package com.avito.android.messenger.conversation.mvi.context;

import androidx.view.AbstractC22991Y;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.conversation.mvi.send.Onboarding;
import com.avito.android.messenger.conversation.mvi.send.OnboardingState;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.UserLastActivity;

/* compiled from: ChannelContextPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/W;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "Lcom/avito/android/messenger/conversation/mvi/context/V;", "Lcom/avito/android/messenger/conversation/mvi/context/g0;", "a", "b", "c", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class W extends AbstractC32892c<d0.c> implements V, g0 {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f190208V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32208e f190209W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final ChannelIacInteractor f190210X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<UserLastActivity> f190211Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f190212Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f190213a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.analytics.b f190214b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f190215c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.statsd.F f190216d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final JY.a f190217e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f190218f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C31667x f190219g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f190220h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f190221i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f190222j0;

    /* compiled from: ChannelContextPresenter.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/W$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC31987a.C5631a f190223a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ChannelIacInteractor.State f190224b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Map<Onboarding, OnboardingState> f190225c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k InterfaceC31987a.C5631a c5631a, @Y61.k ChannelIacInteractor.State state, @Y61.k Map<Onboarding, ? extends OnboardingState> map) {
            this.f190223a = c5631a;
            this.f190224b = state;
            this.f190225c = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f190223a, aVar.f190223a) && kotlin.jvm.internal.L.f(this.f190224b, aVar.f190224b) && kotlin.jvm.internal.L.f(this.f190225c, aVar.f190225c);
        }

        public final int hashCode() {
            return this.f190225c.hashCode() + ((this.f190224b.hashCode() + (this.f190223a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CombineState(channelContextState=");
            sb2.append(this.f190223a);
            sb2.append(", channelIacState=");
            sb2.append(this.f190224b);
            sb2.append(", onBoardingStates=");
            return androidx.appcompat.app.r.w(sb2, this.f190225c, ')');
        }
    }

    /* compiled from: ChannelContextPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/W$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<d0.c> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final a f190226d;

        public b(@Y61.k a aVar) {
            super(null, "multiState = " + aVar, 1, null);
            this.f190226d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x017e  */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.messenger.conversation.mvi.context.d0.c d(com.avito.android.messenger.conversation.mvi.context.d0.c r68) {
            /*
                Method dump skipped, instructions count: 1155
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.context.W.b.d(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ChannelContextPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/W$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32891b<d0.c> {
        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(d0.c cVar) {
            return new io.reactivex.rxjava3.internal.operators.single.G(new X(cVar, W.this, 0));
        }
    }

    /* compiled from: ChannelContextPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/W$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends C32891b<d0.c> {
        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(d0.c cVar) {
            return new io.reactivex.rxjava3.internal.operators.single.G(new X(cVar, W.this, 1));
        }
    }

    @Inject
    public W(@Y61.k d0.c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k InterfaceC32208e interfaceC32208e, @Y61.k ChannelIacInteractor channelIacInteractor, @Y61.k InterfaceC35945t1<UserLastActivity> interfaceC35945t1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.messenger.conversation.analytics.b bVar, @Y61.k com.avito.android.server_time.f fVar, @Y61.k com.avito.android.analytics.statsd.F f12, @Y61.k JY.a aVar, @Y61.k C30277e1 c30277e1) {
        super("ChannelContextPresenter", cVar, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f190208V = interfaceC31987a;
        this.f190209W = interfaceC32208e;
        this.f190210X = channelIacInteractor;
        this.f190211Y = interfaceC35945t1;
        this.f190212Z = interfaceC28373a;
        this.f190213a0 = xVar;
        this.f190214b0 = bVar;
        this.f190215c0 = fVar;
        this.f190216d0 = f12;
        this.f190217e0 = aVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f190218f0 = cVar2;
        this.f190219g0 = new C31667x(interfaceC28373a, c30277e1);
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[90];
        this.f190220h0 = ((Boolean) c30277e1.f144968K0.a().invoke()).booleanValue();
        new com.avito.android.util.architecture_components.D();
        this.f190221i0 = new com.avito.android.util.architecture_components.D<>();
        new com.avito.android.util.architecture_components.D();
        new com.avito.android.util.architecture_components.D();
        new com.avito.android.util.architecture_components.D();
        this.f190222j0 = new com.avito.android.util.architecture_components.D<>();
        cVar2.b(interfaceC31987a.I1().j0(this.f207133K.c()).t0(new a0(this)));
        cVar2.b(io.reactivex.rxjava3.core.z.j(interfaceC31987a.M0(), channelIacInteractor.M0(), interfaceC32208e.M0(), new Y()).x0(this.f207133K.c()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new Z(this)));
    }

    public static final void me(W w12, Channel channel) {
        w12.getClass();
        if (channel.getDisplayInfo().getRating() == null) {
            return;
        }
        w12.f190212Z.c(new y.a(w12.f190216d0.a(NotificationsSettings.Section.SECTION_MESSENGER, "channelShowRating", "{{%app_ver%}}").f91030a, 1L));
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.V
    public final void B3() {
        le().s(new c());
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.g0
    public final void K3() {
        this.f190208V.K3();
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.g0
    @Y61.k
    public final AbstractC22991Y<String> M6() {
        return this.f190208V.M6();
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.g0
    @Y61.k
    public final AbstractC22991Y<String> Q3() {
        return this.f190208V.Q3();
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.V
    public final void Va() {
        le().s(new d());
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.V
    /* renamed from: e3, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF190221i0() {
        return this.f190221i0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.V
    public final void na() {
        this.f190209W.D4(Onboarding.f194329h);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f190218f0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.V
    public final void w7() {
        this.f190209W.D4(Onboarding.f194330i);
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.V
    public final void z8() {
        this.f190209W.D4(Onboarding.f194325d);
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.V
    /* renamed from: zb, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF190222j0() {
        return this.f190222j0;
    }
}
