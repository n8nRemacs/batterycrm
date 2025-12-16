package com.avito.android.messenger.conversation.create;

import Zd.InterfaceC19542a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.AuthSource;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.X1;
import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import com.avito.android.messenger.conversation.create.di.a;
import com.avito.android.messenger.conversation.create.phone_verification.MessengerPhoneVerificationActivity;
import io.reactivex.rxjava3.internal.operators.observable.M;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CreateChannelFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class CreateChannelFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f189497n0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public CreateChannelPresenter f189498f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f189499g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f189500h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f189501i0;

    /* renamed from: j0, reason: collision with root package name */
    public ChannelActivityArguments.Create f189502j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public s f189503k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f189504l0 = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public t f189505m0;

    /* compiled from: CreateChannelFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelFragment$a;", "", "<init>", "()V", "", "CREATE_CHANNEL_PARAMS", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/q", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC23040h0 {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            CreateChannelFragment createChannelFragment = CreateChannelFragment.this;
            InterfaceC19542a interfaceC19542a = createChannelFragment.f189499g0;
            if (interfaceC19542a == null) {
                interfaceC19542a = null;
            }
            createChannelFragment.startActivityForResult(interfaceC19542a.a(AuthSource.f92714m), 1);
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/q", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC23040h0 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            CreateChannelFragment createChannelFragment = CreateChannelFragment.this;
            Context context = createChannelFragment.getContext();
            if (context != null) {
                createChannelFragment.startActivityForResult(new Intent(context, (Class<?>) MessengerPhoneVerificationActivity.class), 2);
            }
        }
    }

    /* compiled from: CreateChannelFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            CreateChannelFragment createChannelFragment = CreateChannelFragment.this;
            CreateChannelPresenter createChannelPresenter = createChannelFragment.f189498f0;
            if (createChannelPresenter == null) {
                createChannelPresenter = null;
            }
            ChannelActivityArguments.Create create = createChannelFragment.f189502j0;
            createChannelPresenter.G8(create != null ? create : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        CreateChannelPresenter createChannelPresenter;
        if (i12 != 1) {
            if (i12 == 2 && (createChannelPresenter = this.f189498f0) != null) {
                createChannelPresenter.A5(i13 == -1);
                return;
            }
            return;
        }
        boolean z12 = i13 == -1;
        CreateChannelPresenter createChannelPresenter2 = this.f189498f0;
        if (createChannelPresenter2 != null) {
            createChannelPresenter2.ie(z12);
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.setResult(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f189503k0 = (s) getParentFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        ChannelActivityArguments.Create create = arguments != null ? (ChannelActivityArguments.Create) arguments.getParcelable("create_channel_params") : null;
        if (create == null) {
            throw new IllegalStateException(ChannelActivityArguments.Create.class.getSimpleName().concat(" must be passed"));
        }
        this.f189502j0 = create;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.messenger_fragment_create_channel, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        t tVar = this.f189505m0;
        if (tVar != null) {
            tVar.f189623b.removeCallbacks(tVar.f189627f);
        }
        this.f189505m0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f189503k0 = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f189501i0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("CreateChannelFragment");
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f189501i0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("CreateChannelFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        CreateChannelPresenter createChannelPresenter;
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && !activityC22955mL1.isChangingConfigurations() && (createChannelPresenter = this.f189498f0) != null) {
            bundle.putParcelable("presenter", createChannelPresenter.l9());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        CreateChannelPresenter createChannelPresenter = this.f189498f0;
        if (createChannelPresenter == null) {
            createChannelPresenter = null;
        }
        createChannelPresenter.m9().observe(getViewLifecycleOwner(), new b());
        CreateChannelPresenter createChannelPresenter2 = this.f189498f0;
        if (createChannelPresenter2 == null) {
            createChannelPresenter2 = null;
        }
        createChannelPresenter2.A4().observe(getViewLifecycleOwner(), new c());
        final t tVar = this.f189505m0;
        if (tVar == null) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        M m12 = tVar.f189628g;
        m12.getClass();
        io.reactivex.rxjava3.disposables.d dVarT0 = m12.C0(200L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).t0(new d());
        io.reactivex.rxjava3.disposables.c cVar = this.f189504l0;
        cVar.b(dVarT0);
        CreateChannelPresenter createChannelPresenter3 = this.f189498f0;
        cVar.b((createChannelPresenter3 != null ? createChannelPresenter3 : null).M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new l41.g() { // from class: com.avito.android.messenger.conversation.create.CreateChannelFragment.e
            @Override // l41.g
            public final void accept(Object obj) {
                MessengerStatsdEventFactory.Companion.ChannelType channelType;
                CreateChannelPresenter.State state = (CreateChannelPresenter.State) obj;
                t tVar2 = tVar;
                if (state.equals(tVar2.f189625d)) {
                    return;
                }
                boolean z12 = state instanceof CreateChannelPresenter.State.Empty ? true : state instanceof CreateChannelPresenter.State.Waiting.CreateChannel;
                View view = tVar2.f189623b;
                com.avito.android.inline_filters.dialog.group.item.double_input.e eVar = tVar2.f189627f;
                if (z12) {
                    view.postDelayed(eVar, 600L);
                } else {
                    boolean z13 = state instanceof CreateChannelPresenter.State.Waiting.Auth ? true : state instanceof CreateChannelPresenter.State.Waiting.PhoneVerification;
                    X1 x12 = tVar2.f189626e;
                    if (z13) {
                        view.removeCallbacks(eVar);
                        x12.j();
                    } else {
                        boolean z14 = state instanceof CreateChannelPresenter.State.Created;
                        s sVar = tVar2.f189622a;
                        if (z14) {
                            view.removeCallbacks(eVar);
                            CreateChannelPresenter.State.Created created = (CreateChannelPresenter.State.Created) state;
                            ChannelActivityArguments.Create create = created.f189510b;
                            ChannelActivityArguments.Create.ByItem byItem = create instanceof ChannelActivityArguments.Create.ByItem ? (ChannelActivityArguments.Create.ByItem) create : null;
                            boolean z15 = byItem != null ? byItem.f188886e : false;
                            String str = byItem != null ? byItem.f188888g : null;
                            Long f188896e = create.getF188896e();
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
                            sVar.M(created.f189511c, z15, str, new ChannelActivityArguments.PerformanceParams(f188896e, channelType));
                        } else {
                            if (!(state instanceof CreateChannelPresenter.State.Error)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            view.removeCallbacks(eVar);
                            CreateChannelPresenter.State.Error error = (CreateChannelPresenter.State.Error) state;
                            if (error.equals(CreateChannelPresenter.State.Error.AuthRequired.f189513b)) {
                                sVar.p(41);
                            } else if (error.equals(CreateChannelPresenter.State.Error.PhoneVerificationRequired.f189516b)) {
                                sVar.p(60);
                            } else if (error.equals(CreateChannelPresenter.State.Error.Forbidden.f189514b)) {
                                sVar.p(43);
                            } else {
                                boolean zEquals = error.equals(CreateChannelPresenter.State.Error.Network.f189515b);
                                Context context = tVar2.f189624c;
                                if (zEquals) {
                                    x12.a(context.getString(R.string.connection_problem));
                                } else {
                                    if (!error.equals(CreateChannelPresenter.State.Error.Unknown.f189517b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    x12.a(context.getString(R.string.something_went_wrong));
                                }
                            }
                        }
                    }
                }
                G0 g02 = G0.f406611a;
                tVar2.f189625d = state;
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f189504l0.e();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        CreateChannelPresenter.State state;
        if (bundle == null || (state = (CreateChannelPresenter.State) bundle.getParcelable("presenter")) == null) {
            state = CreateChannelPresenter.State.Empty.f189512b;
        }
        a.InterfaceC5590a interfaceC5590aA = com.avito.android.messenger.conversation.create.di.e.a();
        interfaceC5590aA.c((com.avito.android.messenger.conversation.create.di.b) C29972i.a(C29972i.b(this), com.avito.android.messenger.conversation.create.di.b.class));
        interfaceC5590aA.b(state);
        interfaceC5590aA.a(this);
        interfaceC5590aA.build().a(this);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC31873b(this, 2));
        s sVar = this.f189503k0;
        InterfaceC28373a interfaceC28373a = this.f189500h0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        this.f189505m0 = new t(sVar, view, interfaceC28373a);
        if ((state instanceof CreateChannelPresenter.State.Empty) || (state instanceof CreateChannelPresenter.State.Waiting.CreateChannel)) {
            CreateChannelPresenter createChannelPresenter = this.f189498f0;
            if (createChannelPresenter == null) {
                createChannelPresenter = null;
            }
            ChannelActivityArguments.Create create = this.f189502j0;
            createChannelPresenter.j(create != null ? create : null);
        }
    }
}
