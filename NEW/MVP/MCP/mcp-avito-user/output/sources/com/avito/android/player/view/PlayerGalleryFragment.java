package com.avito.android.player.view;

import Cd.C13243a;
import D80.a;
import D80.b;
import Y41.p;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.image_loader.From;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.di.j;
import com.avito.android.player.mvi.entity.PlayerMviState;
import com.avito.android.player.router.PlayerArguments;
import com.avito.android.player.tracker.PlayerFragmentScreen;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kr.C43490a;
import z1.AbstractC50339a;

/* compiled from: PlayerGalleryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/player/view/PlayerGalleryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/player/view/i;", "LE80/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PlayerGalleryFragment extends BaseFragment implements com.avito.android.ui.fragments.c, com.avito.android.player.view.i, E80.a, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public boolean f220266A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f220267B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f220268C0;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public Boolean f220269D0;

    /* renamed from: E0, reason: collision with root package name */
    @l
    public Boolean f220270E0;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public E80.b f220271F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f220272G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f220273H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final b f220274I0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public k f220275n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f220276o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f220277p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f220278q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.connection_quality.connectivity.a f220279r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f220280s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public View f220281t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public StyledPlayerView f220282u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public InterfaceC36534o f220283v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public FrameLayout f220284w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public SimpleDraweeView f220285x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public Button f220286y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public ImageButton f220287z0;

    /* renamed from: K0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f220265K0 = {m0.f406844a.e(new Y(PlayerGalleryFragment.class, "openParams", "getOpenParams()Lcom/avito/android/player/router/PlayerArguments;", 0))};

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public static final a f220264J0 = new a(null);

    /* compiled from: PlayerGalleryFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/player/view/PlayerGalleryFragment$a;", "", "<init>", "()V", "", "IS_FRAGMENT_VISIBLE", "Ljava/lang/String;", "IS_THUMBNAIL_VISIBLE", "KEY_STATE", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PlayerGalleryFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/player/view/PlayerGalleryFragment$b", "Lcom/google/android/exoplayer2/analytics/b;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.google.android.exoplayer2.analytics.b {
        public b() {
        }

        @Override // com.google.android.exoplayer2.analytics.b
        public final void ZT(@Y61.k b.C10568b c10568b, int i12) {
            a aVar = PlayerGalleryFragment.f220264J0;
            PlayerGalleryFragment.this.r5().accept(new a.d(i12));
        }
    }

    /* compiled from: PlayerGalleryFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.player.view.PlayerGalleryFragment$onViewCreated$6", f = "PlayerGalleryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f220289q;

        /* compiled from: PlayerGalleryFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.player.view.PlayerGalleryFragment$onViewCreated$6$1", f = "PlayerGalleryFragment.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220291q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PlayerGalleryFragment f220292r;

            /* compiled from: PlayerGalleryFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.player.view.PlayerGalleryFragment$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C6623a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PlayerGalleryFragment f220293b;

                public C6623a(PlayerGalleryFragment playerGalleryFragment) {
                    this.f220293b = playerGalleryFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    E80.b bVar;
                    StyledPlayerView styledPlayerView;
                    d0 player;
                    int i12 = 1;
                    D80.b bVar2 = (D80.b) obj;
                    a aVar = PlayerGalleryFragment.f220264J0;
                    PlayerGalleryFragment playerGalleryFragment = this.f220293b;
                    if (bVar2 instanceof b.a) {
                        ActivityC22955m activityC22955mL1 = playerGalleryFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.finish();
                        }
                    } else if (bVar2 instanceof b.d) {
                        InterfaceC36534o interfaceC36534o = ((b.d) bVar2).f2973a;
                        interfaceC36534o.y(playerGalleryFragment.f220274I0);
                        StyledPlayerView styledPlayerView2 = playerGalleryFragment.f220282u0;
                        if (styledPlayerView2 != null) {
                            com.avito.android.player.view.g gVar = new com.avito.android.player.view.g(interfaceC36534o, playerGalleryFragment, styledPlayerView2);
                            gVar.setVolume(0.0f);
                            styledPlayerView2.setControllerShowTimeoutMs(-1);
                            styledPlayerView2.setControllerHideOnTouch(false);
                            Boolean bool = playerGalleryFragment.q5().f220224k;
                            gVar.setPlayWhenReady(bool != null ? bool.booleanValue() : false);
                            Integer num = playerGalleryFragment.q5().f220221h;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                StyledPlayerView styledPlayerView3 = playerGalleryFragment.f220282u0;
                                if (styledPlayerView3 != null) {
                                    styledPlayerView3.setResizeMode(iIntValue);
                                }
                            }
                            styledPlayerView2.setPlayer(gVar);
                            styledPlayerView2.f();
                            styledPlayerView2.setOnClickListener(new com.avito.android.player.view.a(styledPlayerView2, i12));
                            styledPlayerView2.setKeepScreenOn(true);
                        }
                        playerGalleryFragment.f220283v0 = interfaceC36534o;
                    } else if (bVar2 instanceof b.C0151b) {
                        if (!playerGalleryFragment.f220268C0 && L.f(playerGalleryFragment.f220269D0, Boolean.TRUE) && (styledPlayerView = playerGalleryFragment.f220282u0) != null && (player = styledPlayerView.getPlayer()) != null) {
                            player.play();
                        }
                    } else if ((bVar2 instanceof b.c) && (bVar = playerGalleryFragment.f220271F0) != null) {
                        bVar.f3793c.invoke();
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f220293b, PlayerGalleryFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/player/mvi/entity/PlayerOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerGalleryFragment playerGalleryFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f220292r = playerGalleryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f220292r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220291q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = PlayerGalleryFragment.f220264J0;
                    PlayerGalleryFragment playerGalleryFragment = this.f220292r;
                    InterfaceC43160i<D80.b> events = playerGalleryFragment.r5().getEvents();
                    C6623a c6623a = new C6623a(playerGalleryFragment);
                    this.f220291q = 1;
                    if (events.collect(c6623a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: PlayerGalleryFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.player.view.PlayerGalleryFragment$onViewCreated$6$2", f = "PlayerGalleryFragment.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220294q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PlayerGalleryFragment f220295r;

            /* compiled from: PlayerGalleryFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerMviState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/player/mvi/entity/PlayerMviState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a extends N implements Y41.l<PlayerMviState, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ PlayerGalleryFragment f220296l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(PlayerGalleryFragment playerGalleryFragment) {
                    super(1);
                    this.f220296l = playerGalleryFragment;
                }

                @Override // Y41.l
                public final G0 invoke(PlayerMviState playerMviState) {
                    PlayerMviState playerMviState2 = playerMviState;
                    a aVar = PlayerGalleryFragment.f220264J0;
                    PlayerGalleryFragment playerGalleryFragment = this.f220296l;
                    if (!(playerMviState2 instanceof PlayerMviState.Loading)) {
                        if (playerMviState2 instanceof PlayerMviState.Loaded) {
                            Boolean bool = playerGalleryFragment.q5().f220224k;
                            if (bool != null) {
                                boolean zBooleanValue = bool.booleanValue();
                                if (playerGalleryFragment.f220269D0 == null) {
                                    playerGalleryFragment.f220269D0 = bool;
                                    G0 g02 = G0.f406611a;
                                }
                                if (L.f(playerGalleryFragment.f220270E0, Boolean.TRUE) || (playerGalleryFragment.f220270E0 == null && !zBooleanValue)) {
                                    playerGalleryFragment.u5();
                                } else {
                                    playerGalleryFragment.s5();
                                }
                            }
                        } else if (playerMviState2 instanceof PlayerMviState.Error) {
                            playerGalleryFragment.f220272G0 = true;
                            C43490a.a(playerGalleryFragment.requireContext(), new ToastBarState(com.avito.android.printable_text.b.f(playerGalleryFragment.getResources().getString(R.string.player_video_playback_toast_bar_error)), null, null, null, null, null, null, 0, false, false, null, null, 4094, null), null, 28);
                            playerGalleryFragment.u5();
                        } else {
                            L.f(playerMviState2, PlayerMviState.Initial.f220184b);
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PlayerGalleryFragment playerGalleryFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f220295r = playerGalleryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f220295r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220294q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = PlayerGalleryFragment.f220264J0;
                    PlayerGalleryFragment playerGalleryFragment = this.f220295r;
                    n2<PlayerMviState> state = playerGalleryFragment.r5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = playerGalleryFragment.f220277p0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    a aVar2 = new a(playerGalleryFragment);
                    this.f220294q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, aVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = PlayerGalleryFragment.this.new c(continuation);
            cVar.f220289q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f220289q;
            PlayerGalleryFragment playerGalleryFragment = PlayerGalleryFragment.this;
            C43259k.d(t12, null, null, new a(playerGalleryFragment, null), 3);
            C43259k.d(t12, null, null, new b(playerGalleryFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f220297l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f220297l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f220297l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PlayerGalleryFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f220299l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f220299l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f220299l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220300l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220300l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f220300l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220301l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220301l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f220301l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PlayerGalleryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/player/view/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/player/view/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<j> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            k kVar = PlayerGalleryFragment.this.f220275n0;
            if (kVar == null) {
                kVar = null;
            }
            return (j) kVar.get();
        }
    }

    public PlayerGalleryFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f220276o0 = new O0(m0.f406844a.b(j.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f220280s0 = new C35968w3(this);
        this.f220266A0 = true;
        this.f220273H0 = true;
        this.f220274I0 = new b();
    }

    @Override // E80.a
    public final void B2(@Y61.k E80.b bVar) {
        Y41.a<G0> aVar;
        Y41.a<G0> aVar2;
        this.f220271F0 = bVar;
        Boolean bool = this.f220269D0;
        Boolean bool2 = Boolean.TRUE;
        if (L.f(bool, bool2)) {
            if (L.f(this.f220270E0, bool2)) {
                E80.b bVar2 = this.f220271F0;
                if (bVar2 == null || (aVar2 = bVar2.f3791a) == null) {
                    return;
                }
                aVar2.invoke();
                return;
            }
            E80.b bVar3 = this.f220271F0;
            if (bVar3 == null || (aVar = bVar3.f3792b) == null) {
                return;
            }
            aVar.invoke();
        }
    }

    @Override // E80.a
    public final void C3() {
        d0 player;
        d0 player2;
        d0 player3;
        StyledPlayerView styledPlayerView = this.f220282u0;
        if ((styledPlayerView == null || (player3 = styledPlayerView.getPlayer()) == null) ? false : player3.k()) {
            j jVarR5 = r5();
            StyledPlayerView styledPlayerView2 = this.f220282u0;
            Double dB2 = null;
            Double dValueOf = (styledPlayerView2 == null || (player2 = styledPlayerView2.getPlayer()) == null) ? null : Double.valueOf(player2.getCurrentPosition() / 1000.0d);
            StyledPlayerView styledPlayerView3 = this.f220282u0;
            if (styledPlayerView3 != null && (player = styledPlayerView3.getPlayer()) != null) {
                dB2 = J80.g.b(player);
            }
            jVarR5.accept(new a.C0150a(dValueOf, dB2));
        }
    }

    @Override // E80.a
    public final void F1() {
        d0 player;
        d0 player2;
        this.f220269D0 = Boolean.TRUE;
        this.f220273H0 = false;
        if (this.f220267B0) {
            StyledPlayerView styledPlayerView = this.f220282u0;
            if (styledPlayerView != null && (player2 = styledPlayerView.getPlayer()) != null) {
                player2.play();
            }
            this.f220267B0 = false;
        } else {
            StyledPlayerView styledPlayerView2 = this.f220282u0;
            if (styledPlayerView2 != null && (player = styledPlayerView2.getPlayer()) != null) {
                player.pause();
            }
        }
        FrameLayout frameLayout = this.f220284w0;
        if (frameLayout != null) {
            if (D6.y(frameLayout)) {
                E80.b bVar = this.f220271F0;
                if (bVar != null) {
                    bVar.f3791a.invoke();
                    return;
                }
                return;
            }
            E80.b bVar2 = this.f220271F0;
            if (bVar2 != null) {
                bVar2.f3792b.invoke();
            }
        }
    }

    @Override // E80.a
    public final void M4() {
        d0 player;
        d0 player2;
        this.f220269D0 = Boolean.FALSE;
        StyledPlayerView styledPlayerView = this.f220282u0;
        if ((styledPlayerView == null || (player2 = styledPlayerView.getPlayer()) == null) ? false : player2.k()) {
            this.f220267B0 = true;
            StyledPlayerView styledPlayerView2 = this.f220282u0;
            if (styledPlayerView2 == null || (player = styledPlayerView2.getPlayer()) == null) {
                return;
            }
            player.pause();
            G0 g02 = G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f220277p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.player_gallery_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        StyledPlayerView styledPlayerView = this.f220282u0;
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
        InterfaceC36534o interfaceC36534o = this.f220283v0;
        if (interfaceC36534o != null) {
            interfaceC36534o.L(this.f220274I0);
        }
        this.f220282u0 = null;
        Context context = getContext();
        if (context != null) {
            J80.a.b(context);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f220268C0 = true;
        r5().accept(a.i.f2969a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        d0 player;
        d0 player2;
        super.onResume();
        Context context = getContext();
        if (context != null) {
            J80.a.a(context);
        }
        StyledPlayerView styledPlayerView = this.f220282u0;
        if (!((styledPlayerView == null || (player2 = styledPlayerView.getPlayer()) == null) ? false : player2.k()) || L.f(this.f220269D0, Boolean.TRUE)) {
            return;
        }
        this.f220273H0 = false;
        StyledPlayerView styledPlayerView2 = this.f220282u0;
        if (styledPlayerView2 == null || (player = styledPlayerView2.getPlayer()) == null) {
            return;
        }
        player.pause();
        G0 g02 = G0.f406611a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j jVarR5 = r5();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("player_state", jVarR5.f220314O.H());
        bundle2.putParcelable("player_analytics_state", jVarR5.f220313N.getF220045d());
        bundle.putBundle("player_state", bundle2);
        Boolean bool = this.f220269D0;
        if (bool != null) {
            bundle.putBoolean("is_player_visible", bool.booleanValue());
        }
        Boolean bool2 = this.f220270E0;
        if (bool2 != null) {
            bundle.putBoolean("is_thumbnail_visible", bool2.booleanValue());
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f220281t0 = view;
        this.f220282u0 = (StyledPlayerView) view.findViewById(R.id.player_view);
        this.f220284w0 = (FrameLayout) view.findViewById(R.id.player_thumbnail_container);
        this.f220286y0 = (Button) view.findViewById(R.id.thumbnail_play_button);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.player_thumbnail);
        if (simpleDraweeView != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(com.avito.android.image_loader.b.b(q5().f220223j));
            aVarA.f169501s = d.a.a(new com.avito.android.image_loader.e().a(requireContext()), requireContext(), null, From.f169442b, null, 24);
            aVarA.f169495m = ImageRequest.SourcePlace.f169479d;
            PlayerAnalyticsParameters playerAnalyticsParameters = q5().f220222i;
            aVarA.f169498p = playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null;
            aVarA.f169497o = new com.avito.android.player.view.f(this);
            aVarA.c();
        } else {
            simpleDraweeView = null;
        }
        this.f220285x0 = simpleDraweeView;
        if (bundle != null) {
            this.f220269D0 = Boolean.valueOf(bundle.getBoolean("is_player_visible"));
        }
        if (bundle != null) {
            this.f220270E0 = Boolean.valueOf(bundle.getBoolean("is_thumbnail_visible"));
        }
        D6.H(view.findViewById(R.id.control_view));
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.exo_mute);
        imageButton.setOnClickListener(new com.avito.android.player.view.e(this, 0));
        this.f220287z0 = imageButton;
        Boolean bool = q5().f220224k;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (this.f220269D0 == null) {
                this.f220269D0 = bool;
                G0 g02 = G0.f406611a;
            }
            if (L.f(this.f220270E0, Boolean.TRUE) || (this.f220270E0 == null && !zBooleanValue)) {
                u5();
            } else {
                t5();
            }
        }
        if (this.f220269D0 != null) {
            this.f220268C0 = !r12.booleanValue();
        }
        E80.b bVar = this.f220271F0;
        if (bVar != null) {
            bVar.f3793c.invoke();
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f220277p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        PlayerArguments playerArgumentsQ5 = q5();
        Bundle bundle2 = bundle != null ? bundle.getBundle("player_state") : null;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        j.a aVarA = com.avito.android.player.di.c.a();
        aVarA.d((com.avito.android.player.di.g) C29972i.a(C29972i.b(this), com.avito.android.player.di.g.class));
        aVarA.a((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class));
        aVarA.g(playerArgumentsQ5);
        aVarA.b(getResources());
        aVarA.j(PlayerFragmentScreen.f220232d);
        aVarA.c(s.c(this));
        aVarA.i(this);
        aVarA.e(requireContext());
        j.f220312P.getClass();
        aVarA.h(bundle2 != null ? (ExoPlayerController.State) bundle2.getParcelable("player_state") : null);
        aVarA.f(bundle2 != null ? (PlayerAnalyticsInteractor.State) bundle2.getParcelable("player_analytics_state") : null);
        aVarA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f220277p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f220277p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f220277p0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).B(new G80.a(), this);
    }

    public final PlayerArguments q5() {
        return (PlayerArguments) this.f220280s0.getValue(this, f220265K0[0]);
    }

    public final j r5() {
        return (j) this.f220276o0.getValue();
    }

    public final void s5() {
        Y41.a<G0> aVar;
        this.f220270E0 = Boolean.FALSE;
        StyledPlayerView styledPlayerView = this.f220282u0;
        if (styledPlayerView != null) {
            D6.H(styledPlayerView);
        }
        D6.w(this.f220284w0);
        E80.b bVar = this.f220271F0;
        if (bVar != null && (aVar = bVar.f3792b) != null) {
            aVar.invoke();
        }
        this.f220268C0 = false;
    }

    public final void t5() {
        E80.b bVar;
        FrameLayout frameLayout = this.f220284w0;
        if (frameLayout != null) {
            D6.H(frameLayout);
        }
        StyledPlayerView styledPlayerView = this.f220282u0;
        if (styledPlayerView != null) {
            D6.w(styledPlayerView);
        }
        Button button = this.f220286y0;
        if (button != null) {
            button.setLoading(true);
            button.setOnClickListener(null);
        }
        if (!L.f(q5().f220224k, Boolean.TRUE) || (bVar = this.f220271F0) == null) {
            return;
        }
        bVar.f3792b.invoke();
    }

    public final void u5() {
        this.f220270E0 = Boolean.TRUE;
        E80.b bVar = this.f220271F0;
        if (bVar != null) {
            bVar.f3791a.invoke();
        }
        FrameLayout frameLayout = this.f220284w0;
        if (frameLayout != null) {
            D6.H(frameLayout);
        }
        StyledPlayerView styledPlayerView = this.f220282u0;
        if (styledPlayerView != null) {
            D6.w(styledPlayerView);
        }
        com.avito.android.player.view.e eVar = new com.avito.android.player.view.e(this, 1);
        Button button = this.f220286y0;
        if (button != null) {
            D6.H(button);
            button.setLoading(false);
            button.setOnClickListener(eVar);
        }
        SimpleDraweeView simpleDraweeView = this.f220285x0;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(eVar);
        }
    }
}
