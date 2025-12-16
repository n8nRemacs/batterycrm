package com.avito.android.messenger.conversation.mvi.send;

import Ag.CallableC13028a;
import Cq0.C13343b;
import Hq0.C14020b;
import aZ.C19844b;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.platform.C22491k0;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.MessengerQuickRepliesWithTitleTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.feedback_adverts.c;
import com.avito.android.messenger.analytics.C31645a;
import com.avito.android.messenger.analytics.C31650f;
import com.avito.android.messenger.analytics.C31653i;
import com.avito.android.messenger.analytics.MessageType;
import com.avito.android.messenger.analytics.d0;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a;
import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.messenger.di.r2;
import com.avito.android.messenger.input.MessageInput;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.observable.C41990t1;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessagePresenter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:%\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006,"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "Lkotlin/G0;", "updateDraftInDb", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class D extends AbstractC32892c<SendMessagePresenter.State> implements SendMessagePresenter {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f194183A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f194184B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<kotlin.G0> f194185C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<PrintableText> f194186D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String[]> f194187E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<kotlin.G0> f194188F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<kotlin.G0> f194189G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<kotlin.G0> f194190H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<SendMessagePresenter.RecordingVideoFileReference> f194191I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<kotlin.G0> f194192J0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32232q f194193V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f194194W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.a f194195X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f194196Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f194197Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final Resources f194198a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f194199b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.video.m f194200c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final String f194201d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32208e f194202e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.P f194203f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f194204g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.x0 f194205h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.sync.Q0 f194206i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.u f194207j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.voice.s0 f194208k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f194209l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32188a f194210m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final WY.a f194211n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f194212o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f194213p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final JY.a f194214q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Long> f194215r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<kotlin.G0> f194216s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194217t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194218u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194219v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<kotlin.Q<String, Long>> f194220w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f194221x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<c.a> f194222y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<MessageBody.Location> f194223z0;

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$A;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class A extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public A() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            return SendMessagePresenter.State.a(state, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, true, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 6);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$B;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class B extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Map<Onboarding, OnboardingState> f194224d;

        public B(@Y61.k Map map) {
            super("OnboardingStatesChangedMutator(newOnboardingStates=" + map + ')', null, 2, null);
            this.f194224d = map;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            return !kotlin.jvm.internal.L.f(state2.f194442v, this.f194224d) ? SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, this.f194224d, null, null, null, null, null, null, null, null, null, false, null, null, -1048577, 7) : state2;
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$C;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class C extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f194225d;

        public C(@Y61.k String str) {
            super(C22491k0.a(')', "PhotosSelectedMutator(operationId = ", str), null, 2, null);
            this.f194225d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            MessengerUserHashInfo messengerUserHashInfo = state2.f194422b;
            if (messengerUserHashInfo == null || messengerUserHashInfo.f430682d.length() <= 0) {
                messengerUserHashInfo = null;
            }
            if (messengerUserHashInfo == null) {
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            D d12 = D.this;
            return new io.reactivex.rxjava3.internal.operators.maybe.T(new io.reactivex.rxjava3.internal.operators.maybe.r((io.reactivex.rxjava3.internal.operators.maybe.B) d12.f194193V.a(messengerUserHashInfo, this.f194225d, state2.f194414C).i(new T(d12)).m(U.f194454b), new V(d12))).r().h(io.reactivex.rxjava3.core.I.q(SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -402784257, 7)));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$D;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$D, reason: collision with other inner class name */
    public final class C5750D extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public C5750D() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            String str;
            SendMessagePresenter.State state2 = state;
            boolean z12 = state2.f194433m;
            D d12 = D.this;
            SendMessagePresenter.ContextItemInfo contextItemInfo = state2.f194424d;
            if (contextItemInfo != null && (str = contextItemInfo.f194405b) != null) {
                d12.f194199b0.c(new C31653i(d12.f194201d0, str, !z12));
            }
            if (z12) {
                d12.f194223z0.postValue(state2.f194440t);
            } else {
                d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_sending_location_is_not_available));
            }
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$E;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class E extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f194228d;

        public E(@Y61.k String str) {
            super(AK.c.k("SendMessageClickMutator(text = '", str, "', templates=null)"), null, 2, null);
            this.f194228d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            D d12 = D.this;
            C30277e1 c30277e1 = d12.f194204g0;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[93];
            MessengerUserHashInfo messengerUserHashInfo = null;
            Long lValueOf = ((Boolean) c30277e1.f144974N0.a().invoke()).booleanValue() ? Long.valueOf(d12.f194213p0.now()) : null;
            MessengerUserHashInfo messengerUserHashInfo2 = state2.f194422b;
            if (messengerUserHashInfo2 != null && messengerUserHashInfo2.f430682d.length() > 0) {
                messengerUserHashInfo = messengerUserHashInfo2;
            }
            if (messengerUserHashInfo != null) {
                String str = this.f194228d;
                if (!C43066x.K(str)) {
                    d12.f194199b0.c(new d0.b(d12.f194201d0, MessageType.f186199c, false));
                    return new io.reactivex.rxjava3.internal.operators.completable.v(d12.f194193V.g(messengerUserHashInfo, C43066x.A0(str).toString(), state2.f194414C, lValueOf).i(new W(d12))).r().h(new io.reactivex.rxjava3.internal.operators.single.G(new CallableC13028a(20, this, state2)));
                }
            }
            return io.reactivex.rxjava3.core.I.q(state2);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$F;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class F extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f194230d;

        public F(boolean z12) {
            super(null, null, 3, null);
            this.f194230d = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            D d12 = D.this;
            d12.f194202e0.D4(Onboarding.f194328g);
            boolean z12 = this.f194230d;
            String str = d12.f194201d0;
            InterfaceC28373a interfaceC28373a = d12.f194199b0;
            if (z12) {
                interfaceC28373a.c(new com.avito.android.messenger.analytics.W(str));
            }
            interfaceC28373a.c(new com.avito.android.messenger.analytics.X(str));
            d12.f194189G0.postValue(kotlin.G0.f406611a);
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$G;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class G extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f194232d;

        public G(@Y61.k String str) {
            super(C22491k0.a(')', "TextChangedByUserMutator(text=", str), null, 2, null);
            this.f194232d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            if (!C43066x.K(this.f194232d) && !state2.f194441u) {
                if (kotlin.jvm.internal.L.f(state2.f194445y, Boolean.TRUE)) {
                    D d12 = D.this;
                    d12.f194199b0.c(new com.avito.android.messenger.analytics.j0(d12.f194201d0));
                    return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, true, null, null, null, null, null, null, null, null, null, null, false, null, null, -2621441, 7);
                }
            }
            return !state2.f194443w ? SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -2097153, 7) : state2;
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$H;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class H extends C32891b<SendMessagePresenter.State> {
        public H() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(SendMessagePresenter.State state) {
            MessengerUserHashInfo messengerUserHashInfo;
            String str;
            SendMessagePresenter.State state2 = state;
            if (!state2.f194444x && state2.f194443w && (messengerUserHashInfo = state2.f194422b) != null && !C43066x.K(messengerUserHashInfo.f430682d)) {
                List<String> list = state2.f194423c;
                if (!list.isEmpty()) {
                    D d12 = D.this;
                    kotlin.Q<String, Long> q12 = d12.f194220w0.f364266b.get();
                    if (q12 == null || (str = q12.f406619b) == null) {
                        str = "";
                    }
                    boolean zK2 = C43066x.K(str);
                    String str2 = d12.f194201d0;
                    com.avito.android.messenger.channels.mvi.data.P p12 = d12.f194203f0;
                    io.reactivex.rxjava3.internal.operators.completable.I iC2 = !zK2 ? p12.c(messengerUserHashInfo, str2, (String) C42745f0.E(list), str) : p12.a(str2, messengerUserHashInfo);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    return iC2.h(io.reactivex.rxjava3.core.I.q(g02)).v(g02);
                }
            }
            return io.reactivex.rxjava3.core.I.q(kotlin.G0.f406611a);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$I;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class I extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Map<String, VideoInfo> f194235d;

        public I(@Y61.k Map<String, VideoInfo> map) {
            super(null, "videoInfoById=(" + map.size() + ")[...]", 1, null);
            this.f194235d = map;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            if (state2.f194414C == null) {
                return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, this.f194235d, null, false, null, null, -1073741825, 7);
            }
            D d12 = D.this;
            Map<String, VideoInfo> map = this.f194235d;
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, D.oe(d12, state2, null, map, null, 5), null, map, null, false, null, null, -1342177281, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$K;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class K extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {
        public K() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            SendMessagePresenter.VoiceRecorderState voiceRecorderState = state2.f194418G;
            if (!(voiceRecorderState instanceof SendMessagePresenter.VoiceRecorderState.RecordingInProgress)) {
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            D d12 = D.this;
            d12.f194217t0.e();
            File file = ((SendMessagePresenter.VoiceRecorderState.RecordingInProgress) voiceRecorderState).f194450b;
            return new io.reactivex.rxjava3.internal.operators.completable.T(d12.f194208k0.b(), new C14020b(14, state2, file), null).t(new C32207d0(d12, file, state2));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$a, reason: case insensitive filesystem */
    public final class C32190a extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f194242d;

        public C32190a(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, null, 3, null);
            this.f194242d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            D d12 = D.this;
            InterfaceC32024m interfaceC32024m = d12.f194196Y;
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = this.f194242d;
            return interfaceC32024m.i(dVar.getF191618b().f191747b, dVar.getF191618b().f191748c, dVar.getF191618b().f191746a).S().r(new com.avito.android.messenger.conversation.mvi.send.C(state2, this, state2, d12)).u(new androidx.room.rxjava3.b(state2, 11));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$b, reason: case insensitive filesystem */
    public final class C32191b extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public C32191b() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            String str;
            SendMessagePresenter.State state2 = state;
            MessengerUserHashInfo messengerUserHashInfo = state2.f194422b;
            if (messengerUserHashInfo != null && (str = messengerUserHashInfo.f430682d) != null) {
                D d12 = D.this;
                d12.f194199b0.c(new C31650f(d12.f194201d0, str));
            }
            return state2.f194437q == MessageInput.AttachButtonState.f196375b ? SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, true, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 7) : state2;
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$c, reason: case insensitive filesystem */
    public final class C32192c extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttachMenuItem.File f194245d;

        public C32192c(@Y61.k AttachMenuItem.File file) {
            super(null, null, 3, null);
            this.f194245d = file;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            String str;
            SendMessagePresenter.State state2 = state;
            SendMessagePresenter.ContextItemInfo contextItemInfo = state2.f194424d;
            D d12 = D.this;
            if (contextItemInfo != null && (str = contextItemInfo.f194405b) != null) {
                d12.f194199b0.c(new C31645a(str, d12.f194201d0));
            }
            d12.f194202e0.D4(Onboarding.f194323b);
            d12.f194187E0.postValue(d12.f194195X.a(this.f194245d));
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public d() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            D.this.f194202e0.D4(Onboarding.f194324c);
            return SendMessagePresenter.State.a(state, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, Boolean.FALSE, null, null, null, null, null, false, null, null, -67108865, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$e, reason: case insensitive filesystem */
    public final class C32193e extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public C32193e() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            boolean z12 = state2.f194427g;
            D d12 = D.this;
            if (z12) {
                d12.f194221x0.postValue(d12.f194197Z.a());
            } else {
                d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_sending_image_is_not_available));
            }
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$f, reason: case insensitive filesystem */
    public final class C32194f extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public C32194f() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            MessageInput.AttachButtonState attachButtonState = MessageInput.AttachButtonState.f196375b;
            MessageInput.AttachButtonState attachButtonState2 = state2.f194437q;
            D d12 = D.this;
            if (attachButtonState2 == attachButtonState) {
                SendMessagePresenter.ContextItemInfo contextItemInfo = state2.f194424d;
                d12.f194222y0.postValue(new c.a(contextItemInfo != null ? contextItemInfo.f194405b : null, d12.f194201d0));
            } else {
                d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_sending_item_is_not_available));
            }
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$g, reason: case insensitive filesystem */
    public final class C32195g extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public C32195g() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            return SendMessagePresenter.State.a(state, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$h, reason: case insensitive filesystem */
    public final class C32196h extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {
        public C32196h() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            SendMessagePresenter.VoiceRecorderState voiceRecorderState = state2.f194418G;
            boolean z12 = voiceRecorderState instanceof SendMessagePresenter.VoiceRecorderState.RecordingInProgress;
            D d12 = D.this;
            if (z12) {
                d12.ne();
                return d12.f194208k0.b().r().h(D.me(state2, d12, ((SendMessagePresenter.VoiceRecorderState.RecordingInProgress) voiceRecorderState).f194450b, "CancelRecordingMutator"));
            }
            if (!(voiceRecorderState instanceof SendMessagePresenter.VoiceRecorderState.ReachedMaxDuration)) {
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            d12.ne();
            return D.me(state2, d12, ((SendMessagePresenter.VoiceRecorderState.ReachedMaxDuration) voiceRecorderState).f194449c, "CancelRecordingMutator");
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$i, reason: case insensitive filesystem */
    public final class C32197i extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f194251d;

        public C32197i(@Y61.l String str) {
            super(C22491k0.a(')', "CategoryIdUpdateMutator(categoryId=", str), null, 2, null);
            this.f194251d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            String str = this.f194251d;
            boolean zF2 = kotlin.jvm.internal.L.f(str, "111");
            boolean z12 = false;
            boolean z13 = state2.f194442v.get(Onboarding.f194325d) == OnboardingState.f194342b;
            if (kotlin.jvm.internal.L.f(str, "114") && !z13) {
                z12 = true;
            }
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, Boolean.valueOf(zF2), Boolean.valueOf(z12), null, null, null, null, null, false, null, null, -100663297, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$j, reason: case insensitive filesystem */
    public final class C32198j extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public C32198j() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            SendMessagePresenter.IncidentWarning incidentWarning = state2.f194421J;
            return incidentWarning != null ? SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, new SendMessagePresenter.IncidentWarning(incidentWarning.f194407b, incidentWarning.f194408c, false), -1, 3) : state2;
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$k;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.D$k, reason: case insensitive filesystem */
    public final class C32199k extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public C32199k() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            return SendMessagePresenter.State.a(state, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -402653185, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$l;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class l extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC31987a.C5631a f194252d;

        public l(@Y61.k InterfaceC31987a.C5631a c5631a) {
            super("ContextInteractorStateChangedMutator(contextInteractorState=" + c5631a + ')', null, 2, null);
            this.f194252d = c5631a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x02c5 A[PHI: r3
  0x02c5: PHI (r3v18 com.avito.android.remote.model.messenger.message.MessageBody$Location) = 
  (r3v12 com.avito.android.remote.model.messenger.message.MessageBody$Location)
  (r3v19 com.avito.android.remote.model.messenger.message.MessageBody$Location)
 binds: [B:229:0x02d9, B:218:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter.State d(com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter.State r42) {
            /*
                Method dump skipped, instructions count: 830
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.send.D.l.d(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$m;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class m extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f194254d;

        public m(@Y61.k String str) {
            super(AK.c.k("DraftUpdatedMutator(newDraftText=\"", str, "\")"), null, 2, null);
            this.f194254d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            if (kotlin.jvm.internal.L.f(this.f194254d, state2.f194426f)) {
                return state2;
            }
            String str = this.f194254d;
            Boolean bool = state2.f194445y;
            return SendMessagePresenter.State.a(state2, null, null, null, null, str, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, Boolean.valueOf(bool != null ? bool.booleanValue() : str.length() == 0), null, null, null, null, null, null, null, null, false, null, null, -8388625, 7);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$n;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class n extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public n() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            return !state2.f194444x ? SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -4194305, 7) : state2;
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$o;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class o extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Uri f194255d;

        public o(@Y61.k Uri uri) {
            super(null, null, 3, null);
            this.f194255d = uri;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            AttachMenuItem.File file;
            Long maxSizeBytes;
            SendMessagePresenter.State state2 = state;
            AttachMenu attachMenu = state2.f194438r;
            long jLongValue = (attachMenu == null || (file = attachMenu.getFile()) == null || (maxSizeBytes = file.getMaxSizeBytes()) == null) ? 26214400L : maxSizeBytes.longValue();
            D d12 = D.this;
            return d12.f194195X.c(this.f194255d, jLongValue).i(new com.avito.android.messenger.conversation.mvi.send.E(d12)).k(new com.avito.android.messenger.conversation.mvi.send.F(d12)).n(new com.avito.android.messenger.conversation.mvi.send.J(state2, d12, this)).v(SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -402653185, 7));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$p;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class p extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final C19844b f194257d;

        public p(@Y61.k C19844b c19844b) {
            super(null, "warning = " + c19844b, 1, null);
            this.f194257d = c19844b;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            C19844b c19844b = this.f194257d;
            return SendMessagePresenter.State.a(state, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, new SendMessagePresenter.IncidentWarning(c19844b.getBlockInputField(), c19844b.getText(), true), -1, 3);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$q;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class q extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final FeedbackAdvertItem f194258d;

        public q(@Y61.k FeedbackAdvertItem feedbackAdvertItem) {
            super(C22026a.c(new StringBuilder("ItemSelectedMutator(itemId = "), feedbackAdvertItem.f253445b, ')'), null, 2, null);
            this.f194258d = feedbackAdvertItem;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            MessengerUserHashInfo messengerUserHashInfo = state2.f194422b;
            if (messengerUserHashInfo == null || messengerUserHashInfo.f430682d.length() <= 0) {
                messengerUserHashInfo = null;
            }
            if (messengerUserHashInfo == null) {
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            D d12 = D.this;
            d12.f194199b0.c(new d0.b(d12.f194201d0, MessageType.f186200d, false));
            return new io.reactivex.rxjava3.internal.operators.completable.v(d12.f194193V.b(messengerUserHashInfo, this.f194258d, state2.f194414C).i(new com.avito.android.messenger.conversation.mvi.send.K(d12))).r().h(io.reactivex.rxjava3.core.I.q(SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -402784257, 7)));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$r;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class r extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessageBody.Location f194260d;

        public r(@Y61.k MessageBody.Location location) {
            super("LocationSelectedMutator(sharedLocation = " + location + ')', null, 2, null);
            this.f194260d = location;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            MessengerUserHashInfo messengerUserHashInfo = state2.f194422b;
            if (messengerUserHashInfo == null || messengerUserHashInfo.f430682d.length() <= 0) {
                messengerUserHashInfo = null;
            }
            if (messengerUserHashInfo == null) {
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            D d12 = D.this;
            d12.f194199b0.c(new d0.b(d12.f194201d0, MessageType.f186202f, false));
            return new io.reactivex.rxjava3.internal.operators.completable.v(d12.f194193V.d(messengerUserHashInfo, this.f194260d, state2.f194414C).i(new L(d12))).r().h(io.reactivex.rxjava3.core.I.q(SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -402784257, 7)));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$s;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class s extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f194262d;

        public s(boolean z12) {
            super(null, null, 3, null);
            this.f194262d = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            boolean z12 = state2.f194434n;
            boolean z13 = this.f194262d;
            return z13 != z12 ? SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, z13, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -4097, 7) : state2;
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$t;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class t extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public t() {
            super("OnAttachVideoClick", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            if (state2.f194429i) {
                return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, true, null, null, -131073, 6);
            }
            D d12 = D.this;
            d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_sending_video_is_not_available));
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 6);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$u;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class u extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {
        public u() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            boolean z12 = state2.f194429i;
            D d12 = D.this;
            if (z12) {
                d12.f194188F0.postValue(kotlin.G0.f406611a);
            } else {
                d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_sending_video_is_not_available));
            }
            return SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 6);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$v;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class v extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {
        public v() {
            super("OnRecordVideoClickMutator", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            D d12 = D.this;
            if (d12.f194207j0.b("android.permission.CAMERA")) {
                return new io.reactivex.rxjava3.internal.operators.completable.v(d12.f194209l0.a().n(new N(d12))).r().B(SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 6));
            }
            d12.f194192J0.postValue(kotlin.G0.f406611a);
            return io.reactivex.rxjava3.core.I.q(SendMessagePresenter.State.a(state2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, -131073, 6));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$w;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class w extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {
        public w() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) throws Resources.NotFoundException {
            SendMessagePresenter.State state2 = state;
            D d12 = D.this;
            boolean zB2 = d12.f194207j0.b("android.permission.RECORD_AUDIO");
            if (!state2.f194430j) {
                d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_sending_voice_is_not_available));
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            if (!zB2) {
                d12.f194190H0.postValue(kotlin.G0.f406611a);
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            if (!(state2.f194418G instanceof SendMessagePresenter.VoiceRecorderState.Empty)) {
                return io.reactivex.rxjava3.core.I.q(state2);
            }
            d12.ne();
            d12.f194215r0.accept(0L);
            return d12.f194209l0.t("voice_" + System.currentTimeMillis() + ".mp4").n(new O(d12, state2)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(5, d12, state2));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$x;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class x extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {
        public x() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            SendMessagePresenter.State state2 = state;
            SendMessagePresenter.VoiceRecorderState voiceRecorderState = state2.f194418G;
            boolean z12 = voiceRecorderState instanceof SendMessagePresenter.VoiceRecorderState.RecordingInProgress;
            D d12 = D.this;
            if (!z12) {
                if (!(voiceRecorderState instanceof SendMessagePresenter.VoiceRecorderState.ReachedMaxDuration)) {
                    return io.reactivex.rxjava3.core.I.q(state2);
                }
                d12.ne();
                SendMessagePresenter.VoiceRecorderState.ReachedMaxDuration reachedMaxDuration = (SendMessagePresenter.VoiceRecorderState.ReachedMaxDuration) voiceRecorderState;
                return d(C41823n.f402260b, reachedMaxDuration.f194449c, state2, reachedMaxDuration.f194448b);
            }
            Long l12 = d12.f194215r0.f364266b.get();
            if (l12 == null) {
                l12 = 0L;
            }
            long jLongValue = l12.longValue();
            d12.ne();
            return d(d12.f194208k0.b(), ((SendMessagePresenter.VoiceRecorderState.RecordingInProgress) voiceRecorderState).f194450b, state2, jLongValue);
        }

        public final io.reactivex.rxjava3.internal.operators.single.V d(AbstractC41768a abstractC41768a, File file, SendMessagePresenter.State state, long j12) {
            AbstractC41768a abstractC41768aO;
            MessengerUserHashInfo messengerUserHashInfo = state.f194422b;
            D d12 = D.this;
            if (messengerUserHashInfo == null || C43066x.K(messengerUserHashInfo.f430682d)) {
                StringBuilder sb2 = new StringBuilder("Voice  message not sent since currentUserId=");
                sb2.append(messengerUserHashInfo != null ? messengerUserHashInfo.f430682d : null);
                abstractC41768aO = AbstractC41768a.o(new IllegalStateException(sb2.toString()));
            } else {
                abstractC41768aO = new io.reactivex.rxjava3.internal.operators.completable.v(d12.f194193V.c(messengerUserHashInfo, new MessageBody.Voice(null, null), file.getPath(), file.getName(), 1000 * j12, state.f194414C).k(new P(d12)).i(new Q(d12)));
            }
            return new io.reactivex.rxjava3.internal.operators.completable.T(abstractC41768a.g(abstractC41768aO), new C13343b(state, 7), null).t(new S(d12, file, state));
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$y;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class y extends com.avito.android.mvi.rx3.with_monolithic_state.o<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessageSuggestsView.SuggestItem f194268d;

        public y(@Y61.k MessageSuggestsView.SuggestItem suggestItem) {
            super("OnSuggestClicked(suggest=" + suggestItem + ')', null, 2, null);
            this.f194268d = suggestItem;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final SendMessagePresenter.State d(SendMessagePresenter.State state) {
            return SendMessagePresenter.State.a(state, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, false, this.f194268d, null, -1, 5);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$z;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class z extends C32890a<SendMessagePresenter.State> {
        public z() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(SendMessagePresenter.State state) {
            AttachMenuItem.Support support;
            String message;
            AttachMenu attachMenu = state.f194438r;
            if (attachMenu == null || (support = attachMenu.getSupport()) == null || (message = support.getMessage()) == null) {
                return;
            }
            D.this.f194186D0.postValue(com.avito.android.printable_text.b.f(message.concat(" ")));
        }
    }

    @Inject
    public D(@Y61.k InterfaceC32232q interfaceC32232q, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.a aVar, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k Resources resources, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.messenger.conversation.mvi.video.m mVar, @InterfaceC32438g0 @Y61.k String str, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k SendMessagePresenter.State state, @Y61.k InterfaceC32208e interfaceC32208e, @Y61.k OpenedFrom openedFrom, @Y61.k com.avito.android.messenger.channels.mvi.data.P p12, @Y61.k C30277e1 c30277e1, @r2 boolean z12, @Y61.k com.avito.android.messenger.conversation.mvi.messages.x0 x0Var, @Y61.k com.avito.android.messenger.conversation.mvi.sync.Q0 q02, @Y61.k com.avito.android.permissions.u uVar, @Y61.k com.avito.android.messenger.conversation.mvi.voice.s0 s0Var, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k InterfaceC32188a interfaceC32188a, @Y61.k u3.g<MessengerQuickRepliesWithTitleTestGroup> gVar, @Y61.k WY.a aVar2, @Y61.k com.avito.android.util.R0 r02, @Y61.k C30277e1 c30277e12, @Y61.k com.avito.android.server_time.f fVar, @Y61.k JY.a aVar3) {
        super("SendMessagePresenter", state, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f194193V = interfaceC32232q;
        this.f194194W = interfaceC31987a;
        this.f194195X = aVar;
        this.f194196Y = interfaceC32024m;
        this.f194197Z = interfaceC35863o4;
        this.f194198a0 = resources;
        this.f194199b0 = interfaceC28373a;
        this.f194200c0 = mVar;
        this.f194201d0 = str;
        this.f194202e0 = interfaceC32208e;
        this.f194203f0 = p12;
        this.f194204g0 = c30277e1;
        this.f194205h0 = x0Var;
        this.f194206i0 = q02;
        this.f194207j0 = uVar;
        this.f194208k0 = s0Var;
        this.f194209l0 = nVar;
        this.f194210m0 = interfaceC32188a;
        this.f194211n0 = aVar2;
        this.f194212o0 = r02;
        this.f194213p0 = fVar;
        this.f194214q0 = aVar3;
        com.jakewharton.rxrelay3.b<Long> bVarN0 = com.jakewharton.rxrelay3.b.N0(0L);
        this.f194215r0 = bVarN0;
        com.jakewharton.rxrelay3.c<kotlin.G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f194216s0 = cVar;
        this.f194217t0 = new io.reactivex.rxjava3.disposables.c();
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f194218u0 = cVar2;
        io.reactivex.rxjava3.disposables.c cVar3 = new io.reactivex.rxjava3.disposables.c();
        this.f194219v0 = cVar3;
        com.jakewharton.rxrelay3.b<kotlin.Q<String, Long>> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f194220w0 = bVar;
        this.f194221x0 = new com.avito.android.util.architecture_components.D<>();
        this.f194222y0 = new com.avito.android.util.architecture_components.D<>();
        this.f194223z0 = new com.avito.android.util.architecture_components.D<>();
        this.f194183A0 = new com.avito.android.util.architecture_components.D<>();
        this.f194184B0 = new com.avito.android.util.architecture_components.D<>();
        this.f194185C0 = new com.avito.android.util.architecture_components.D<>();
        this.f194186D0 = new com.avito.android.util.architecture_components.D<>();
        this.f194187E0 = new com.avito.android.util.architecture_components.D<>();
        this.f194188F0 = new com.avito.android.util.architecture_components.D<>();
        this.f194189G0 = new com.avito.android.util.architecture_components.D<>();
        this.f194190H0 = new com.avito.android.util.architecture_components.D<>();
        this.f194191I0 = new com.avito.android.util.architecture_components.D<>();
        new com.avito.android.util.architecture_components.D();
        this.f194192J0 = new com.avito.android.util.architecture_components.D<>();
        InterfaceC35745a5 interfaceC35745a52 = this.f207133K;
        io.reactivex.rxjava3.internal.operators.observable.W wN2 = bVar.j0(interfaceC35745a52.a()).N(H0.f194278b);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar3.b(new io.reactivex.rxjava3.internal.operators.mixed.v(wN2.C0(2000L, timeUnit, interfaceC35745a52.c()).j0(interfaceC35745a52.a()).I0(this.f207139Q, I0.f194280b).N(J0.f194284b), new K0(this)).u());
        cVar3.b(interfaceC31987a.M0().j0(this.f207133K.a()).t0(new C32234r0(this)));
        io.reactivex.rxjava3.core.z zVarT = interfaceC31987a.M0().j0(this.f207133K.a()).T(C32240u0.f194558b, Integer.MAX_VALUE);
        zVarT.getClass();
        io.reactivex.rxjava3.core.z<R> zVarY0 = zVarT.D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new C32244w0(this));
        C32238t0 c32238t0 = new C32238t0(this);
        zVarY0.getClass();
        cVar3.b(new io.reactivex.rxjava3.internal.operators.observable.N0(zVarY0, c32238t0).d0(new C32246x0()).m0(new C32248y0()).t0(new C32250z0(this)));
        if (openedFrom == OpenedFrom.f189128b) {
            cVar3.b(interfaceC32208e.M0().j0(this.f207133K.a()).t0(new A0(this)));
        }
        if (z12) {
            cVar3.b(this.f207139Q.j0(this.f207133K.a()).N(E0.f194272b).S().x(new F0(this), new G0(this)));
        }
        io.reactivex.rxjava3.core.z<StateT> zVar = this.f207139Q;
        InterfaceC35745a5 interfaceC35745a53 = this.f207133K;
        cVar3.b(zVar.j0(interfaceC35745a53.a()).n0(1000L, timeUnit, interfaceC35745a53.c()).S().x(new C32223l0(this), C32225m0.f194530b));
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = interfaceC31987a.M0().j0(this.f207133K.a());
        C32231p0 c32231p0 = new C32231p0(this);
        final V2 v22 = V2.f318762a;
        l41.g<? super Throwable> gVar2 = new l41.g() { // from class: com.avito.android.messenger.conversation.mvi.send.q0
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        };
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar3.b(i0J0.v0(c32231p0, gVar2, interfaceC43543a));
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar2 = nVarArr[75];
        if (((Boolean) c30277e12.f145044v0.a().invoke()).booleanValue()) {
            C41990t1 c41990t1Z0 = com.avito.android.util.rx3.arrow.b.a(kotlinx.coroutines.rx3.K.a(r02.a(), new C32217i0(this, null)).d0(new C32219j0(this))).z0(1L);
            io.reactivex.rxjava3.core.z<InterfaceC31987a.C5631a> zVarM0 = interfaceC31987a.M0();
            InterfaceC35745a5 interfaceC35745a54 = this.f207133K;
            cVar3.b(io.reactivex.rxjava3.core.z.k(c41990t1Z0, zVarM0.j0(interfaceC35745a54.a()).N(C32221k0.f194526b).z0(1L), C32211f0.f194509b).x0(interfaceC35745a54.a()).v0(new C32213g0(this), new C32215h0(this), interfaceC43543a));
        }
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar3 = nVarArr[43];
        if (((Boolean) c30277e1.f144979Q.a().invoke()).booleanValue() && c30277e1.x().invoke().booleanValue()) {
            cVar2.b(bVarN0.N(C32227n0.f194533b).t0(new C32229o0(this)));
        }
        cVar3.b(q02.M0().j0(this.f207133K.a()).v0(new L0(this), new l41.g() { // from class: com.avito.android.messenger.conversation.mvi.send.M0
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        if (aVar3.l()) {
            MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup = gVar.f439742a.f439749b;
            messengerQuickRepliesWithTitleTestGroup.getClass();
            if (messengerQuickRepliesWithTitleTestGroup == MessengerQuickRepliesWithTitleTestGroup.f67878e) {
                hu.akarnokd.rxjava3.schedulers.c cVar4 = new hu.akarnokd.rxjava3.schedulers.c(this.f207133K.a());
                cVar3.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar4, 0)));
                io.reactivex.rxjava3.core.z<T> zVarR0 = cVar.j0(cVar4).r0(kotlin.G0.f406611a);
                zVarR0.getClass();
                cVar3.b(new io.reactivex.rxjava3.internal.operators.mixed.x(zVarR0.D0(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b), new B0(this)).j0(cVar4).x0(cVar4).v0(new C0(this), new D0(this), interfaceC43543a));
            }
        }
    }

    public static final io.reactivex.rxjava3.internal.operators.single.U me(SendMessagePresenter.State state, D d12, File file, String str) {
        d12.getClass();
        return d12.f194209l0.j(file.getPath()).r(new C32209e0(state, d12, file, str)).u(new com.avito.android.messenger.blacklist.mvi.v(d12, str, state, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QuoteViewData oe(D d12, SendMessagePresenter.State state, Quote quote, Map map, List list, int i12) {
        Object next;
        if ((i12 & 1) != 0) {
            quote = null;
        }
        if ((i12 & 2) != 0) {
            map = null;
        }
        if ((i12 & 4) != 0) {
            list = null;
        }
        d12.getClass();
        if (quote == null && (quote = state.f194414C) == null) {
            return null;
        }
        if (list == null) {
            list = state.f194416E;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((User) next).getId(), quote.getFromId())) {
                break;
            }
        }
        User user = (User) next;
        String name = user != null ? user.getName() : null;
        if (name == null) {
            name = "";
        }
        if (map == null) {
            map = state.f194417F;
        }
        return d12.f194205h0.a(name, quote, map);
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_PAUSE)
    private final void updateDraftInDb() {
        le().s(new H());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void C70(@Y61.k Uri uri) {
        le().s(new o(uri));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void CE() {
        le().s(new z());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void De(@Y61.k MessageSuggestsView.SuggestItem suggestItem) {
        le().s(new y(suggestItem));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: F60, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194187E0() {
        return this.f194187E0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: Fq, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194192J0() {
        return this.f194192J0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: Fy, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194191I0() {
        return this.f194191I0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: Gu, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194183A0() {
        return this.f194183A0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void Hs(@Y61.k String str) {
        le().s(new C(str));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void Ju() {
        le().s(new n(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void P60(@Y61.k Uri uri) {
        le().s(new J(this, uri, true, null, 4, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void QR() {
        le().s(new w());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void Rr(@Y61.k AttachMenuItem.File file) {
        le().s(new C32192c(file));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void Rx() {
        le().s(new C32198j(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void TW() {
        if (this.f194204g0.w().invoke().booleanValue()) {
            le().s(new t());
        } else {
            le().s(new u());
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void VW() {
        le().s(new C32196h());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void Vx() {
        le().s(new C32196h());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: WG, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194188F0() {
        return this.f194188F0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void XI() {
        le().s(new C32199k(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void XT() {
        le().s(new u());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void XW() {
        le().s(new C32193e());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void ZA() {
        le().s(new x());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void Zy(@Y61.k Uri uri, @Y61.k String str) {
        le().s(new J(uri, false, str));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: bF, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194185C0() {
        return this.f194185C0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void bN(@Y61.k FeedbackAdvertItem feedbackAdvertItem) {
        le().s(new q(feedbackAdvertItem));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void eq() {
        le().s(new C32195g(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void gv(@Y61.k MessageBody.Location location) {
        le().s(new r(location));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void gw(@Y61.k String str) {
        le().s(new E(str));
        this.f194185C0.postValue(kotlin.G0.f406611a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void hD() {
        le().s(new v());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void hF() {
        le().s(new A("OnVideoChooserDialogDismissed", null, 2, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: lP, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194186D0() {
        return this.f194186D0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void mK() {
        le().s(new C32194f());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void mn() {
        le().s(new C5750D());
    }

    public final void ne() {
        this.f194217t0.e();
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f194219v0.dispose();
        this.f194217t0.e();
        this.f194218u0.e();
        this.f194208k0.s();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void pQ() {
        this.f194216s0.accept(kotlin.G0.f406611a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: qj, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194221x0() {
        return this.f194221x0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: rZ, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194190H0() {
        return this.f194190H0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void sW(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        le().s(new C32190a(dVar));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: ss, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194222y0() {
        return this.f194222y0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void su() {
        le().s(new C32191b());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: sx, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194223z0() {
        return this.f194223z0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void tD(boolean z12) {
        le().s(new F(z12));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void tQ(@Y61.k String str) {
        this.f194220w0.accept(new kotlin.Q<>(str, Long.valueOf(this.f194213p0.now())));
        le().s(new G(str));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: uZ, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194189G0() {
        return this.f194189G0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void vD(@Y61.k a.c cVar) {
        this.f194186D0.postValue(com.avito.android.printable_text.b.f(cVar.f194078d));
        this.f194199b0.c(new com.avito.android.messenger.analytics.Y(this.f194201d0, cVar.f194076b));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    public final void xV() {
        le().s(new d());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter
    /* renamed from: zx, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF194184B0() {
        return this.f194184B0;
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/D$J;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class J extends com.avito.android.mvi.rx3.with_monolithic_state.p<SendMessagePresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Uri f194237d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f194238e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f194239f;

        public J(@Y61.k Uri uri, boolean z12, @Y61.l String str) {
            super(null, null, 3, null);
            this.f194237d = uri;
            this.f194238e = z12;
            this.f194239f = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<SendMessagePresenter.State> b(SendMessagePresenter.State state) {
            AttachMenuItem.Video video;
            Long maxDurationSec;
            AttachMenuItem.Video video2;
            Long maxSizeBytes;
            SendMessagePresenter.State state2 = state;
            D d12 = D.this;
            d12.f194200c0.a("prepare.start");
            AttachMenu attachMenu = state2.f194438r;
            return d12.f194195X.b(this.f194237d, this.f194238e, (attachMenu == null || (video2 = attachMenu.getVideo()) == null || (maxSizeBytes = video2.getMaxSizeBytes()) == null) ? 524288000L : maxSizeBytes.longValue(), (attachMenu == null || (video = attachMenu.getVideo()) == null || (maxDurationSec = video.getMaxDurationSec()) == null) ? 180L : maxDurationSec.longValue(), this.f194239f).i(new X(d12, this)).k(new Y(d12)).n(new C32205c0(state2, d12, this)).v(state2);
        }

        public /* synthetic */ J(D d12, Uri uri, boolean z12, String str, int i12, C42822w c42822w) {
            this(uri, z12, (i12 & 4) != 0 ? null : str);
        }
    }
}
