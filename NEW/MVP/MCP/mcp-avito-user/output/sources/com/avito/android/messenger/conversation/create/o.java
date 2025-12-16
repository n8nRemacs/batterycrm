package com.avito.android.messenger.conversation.create;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.I;
import j.k0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: CreateChannelPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/create/o;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "a", "b", "c", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o extends AbstractC32892c<CreateChannelPresenter.State> implements CreateChannelPresenter {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.create.c f189591V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final MessengerSuccessRateTracker f189592W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final D f189593X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D f189594Y;

    /* compiled from: CreateChannelPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/create/o$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<CreateChannelPresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f189595d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.l<ChannelActivityArguments.Create, G0> f189596e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Y41.l lVar, boolean z12) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f189595d = z12;
            this.f189596e = lVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<CreateChannelPresenter.State> b(CreateChannelPresenter.State state) {
            CreateChannelPresenter.State state2 = state;
            return state2 instanceof CreateChannelPresenter.State.Waiting.Auth ? this.f189595d ? I.q(new CreateChannelPresenter.State.Waiting.CreateChannel(((CreateChannelPresenter.State.Waiting.Auth) state2).f189518b)).h(new n(this, state2)) : I.q(CreateChannelPresenter.State.Error.AuthRequired.f189513b) : I.q(state2);
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/create/o$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<CreateChannelPresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.create.c f189597d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ChannelActivityArguments.Create f189598e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f189599f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f189600g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final MessengerSuccessRateTracker f189601h;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k com.avito.android.messenger.conversation.create.c cVar, @Y61.k ChannelActivityArguments.Create create, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k MessengerSuccessRateTracker messengerSuccessRateTracker) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f189597d = cVar;
            this.f189598e = create;
            this.f189599f = aVar;
            this.f189600g = aVar2;
            this.f189601h = messengerSuccessRateTracker;
        }

        public static final void d(b bVar, ChannelActivityArguments.Create create, MessengerSuccessRateTracker.Result result) {
            MessengerStatsdEventFactory.Companion.ChannelType channelType;
            bVar.getClass();
            if (create instanceof ChannelActivityArguments.Create.ByItem) {
                channelType = MessengerStatsdEventFactory.Companion.ChannelType.f187055c;
            } else if (create instanceof ChannelActivityArguments.Create.ByOpponentUser) {
                channelType = MessengerStatsdEventFactory.Companion.ChannelType.f187056d;
            } else {
                if (!(create instanceof ChannelActivityArguments.Create.WithAvito)) {
                    throw new NoWhenBranchMatchedException();
                }
                channelType = MessengerStatsdEventFactory.Companion.ChannelType.f187057e;
            }
            bVar.f189601h.c(channelType, result);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<CreateChannelPresenter.State> b(CreateChannelPresenter.State state) {
            CreateChannelPresenter.State state2 = state;
            if (!(state2 instanceof CreateChannelPresenter.State.Empty ? true : state2 instanceof CreateChannelPresenter.State.Waiting)) {
                return I.q(state2);
            }
            boolean z12 = state2 instanceof CreateChannelPresenter.State.Waiting.CreateChannel;
            ChannelActivityArguments.Create create = this.f189598e;
            return (z12 || !L.f(state2.getF189520b(), create)) ? this.f189597d.j(create).r(new p(this)) : I.q(state2);
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/create/o$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.mvi.rx3.with_monolithic_state.p<CreateChannelPresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f189602d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.l<ChannelActivityArguments.Create, G0> f189603e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k Y41.l lVar, boolean z12) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f189602d = z12;
            this.f189603e = lVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<CreateChannelPresenter.State> b(CreateChannelPresenter.State state) {
            CreateChannelPresenter.State state2 = state;
            return state2 instanceof CreateChannelPresenter.State.Waiting.PhoneVerification ? this.f189602d ? I.q(new CreateChannelPresenter.State.Waiting.CreateChannel(((CreateChannelPresenter.State.Waiting.PhoneVerification) state2).f189520b)).h(new q(this, state2)) : I.q(CreateChannelPresenter.State.Error.PhoneVerificationRequired.f189516b) : I.q(state2);
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/create/o$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<CreateChannelPresenter.State> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ChannelActivityArguments.Create f189604d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.l<ChannelActivityArguments.Create, G0> f189605e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k ChannelActivityArguments.Create create, @Y61.k Y41.l<? super ChannelActivityArguments.Create, G0> lVar) {
            super(null, null, 3, null);
            this.f189604d = create;
            this.f189605e = lVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final CreateChannelPresenter.State d(CreateChannelPresenter.State state) {
            CreateChannelPresenter.State state2 = state;
            if (!(state2 instanceof CreateChannelPresenter.State.Error)) {
                return state2;
            }
            i iVar = (i) this.f189605e;
            ChannelActivityArguments.Create create = this.f189604d;
            iVar.invoke(create);
            return new CreateChannelPresenter.State.Waiting.CreateChannel(create);
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = o.this.f189593X;
            G0 g02 = G0.f406611a;
            d12.postValue(g02);
            return g02;
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = o.this.f189594Y;
            G0 g02 = G0.f406611a;
            d12.postValue(g02);
            return g02;
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<ChannelActivityArguments.Create, G0> {
        @Override // Y41.l
        public final G0 invoke(ChannelActivityArguments.Create create) {
            ((o) this.receiver).j(create);
            return G0.f406611a;
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<ChannelActivityArguments.Create, G0> {
        @Override // Y41.l
        public final G0 invoke(ChannelActivityArguments.Create create) {
            ((o) this.receiver).j(create);
            return G0.f406611a;
        }
    }

    /* compiled from: CreateChannelPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends H implements Y41.l<ChannelActivityArguments.Create, G0> {
        @Override // Y41.l
        public final G0 invoke(ChannelActivityArguments.Create create) {
            ((o) this.receiver).j(create);
            return G0.f406611a;
        }
    }

    @Inject
    public o(@Y61.k com.avito.android.messenger.conversation.create.c cVar, @Y61.k MessengerSuccessRateTracker messengerSuccessRateTracker, @Y61.k CreateChannelPresenter.State state, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("CreateChannelPresenter", state, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f189591V = cVar;
        this.f189592W = messengerSuccessRateTracker;
        this.f189593X = new D();
        this.f189594Y = new D();
    }

    @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter
    /* renamed from: A4, reason: from getter */
    public final D getF189594Y() {
        return this.f189594Y;
    }

    @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter
    public final void A5(boolean z12) {
        le().s(new c(new h(1, this, o.class, "createChannel", "createChannel(Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;)V", 0), z12));
    }

    @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter
    public final void G8(@Y61.k ChannelActivityArguments.Create create) {
        le().s(new d(create, new i(1, this, o.class, "createChannel", "createChannel(Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;)V", 0)));
    }

    @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter
    public final void ie(boolean z12) {
        le().s(new a(new g(1, this, o.class, "createChannel", "createChannel(Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;)V", 0), z12));
    }

    @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter
    public final void j(@Y61.k ChannelActivityArguments.Create create) {
        le().s(new b(this.f189591V, create, new e(), new f(), this.f189592W));
    }

    @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter
    /* renamed from: m9, reason: from getter */
    public final D getF189593X() {
        return this.f189593X;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        V2.f318762a.i(this.f207131E, "Cleared", null);
        super.onCleared();
    }
}
