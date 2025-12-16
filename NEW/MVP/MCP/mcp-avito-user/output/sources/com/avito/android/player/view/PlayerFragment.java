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
import android.widget.ImageView;
import android.widget.TextView;
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
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.di.f;
import com.avito.android.player.mvi.entity.PlayerMviState;
import com.avito.android.player.router.PlayerArguments;
import com.avito.android.player.tracker.PlayerScreen;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35968w3;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import java.lang.ref.WeakReference;
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
import z1.AbstractC50339a;

/* compiled from: PlayerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/player/view/PlayerFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/player/view/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PlayerFragment extends TabBaseFragment implements com.avito.android.ui.fragments.c, com.avito.android.player.view.i, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @l
    public ViewGroup f220236A0;

    /* renamed from: B0, reason: collision with root package name */
    @l
    public com.avito.android.progress_overlay.l f220237B0;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public InterfaceC36534o f220238C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final b f220239D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f220240E0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public k f220241t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f220242u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f220243v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f220244w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f220245x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public ImageView f220246y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public StyledPlayerView f220247z0;

    /* renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f220235G0 = {m0.f406844a.e(new Y(PlayerFragment.class, "openParams", "getOpenParams()Lcom/avito/android/player/router/PlayerArguments;", 0))};

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f220234F0 = new a(null);

    /* compiled from: PlayerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/player/view/PlayerFragment$a;", "", "<init>", "()V", "", "KEY_STATE", "Ljava/lang/String;", "TAG", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PlayerFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/player/view/PlayerFragment$b", "Lcom/google/android/exoplayer2/analytics/b;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.google.android.exoplayer2.analytics.b {
        public b() {
        }

        @Override // com.google.android.exoplayer2.analytics.b
        public final void ZT(@Y61.k b.C10568b c10568b, int i12) {
            a aVar = PlayerFragment.f220234F0;
            PlayerFragment.this.E5().accept(new a.d(i12));
        }
    }

    /* compiled from: PlayerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Bundle, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            a aVar = PlayerFragment.f220234F0;
            com.avito.android.player.view.j jVarE5 = PlayerFragment.this.E5();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("player_state", jVarE5.f220314O.H());
            bundle2.putParcelable("player_analytics_state", jVarE5.f220313N.getF220045d());
            bundle.putBundle("player_state", bundle2);
            return G0.f406611a;
        }
    }

    /* compiled from: PlayerFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.player.view.PlayerFragment$onViewCreated$4", f = "PlayerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f220250q;

        /* compiled from: PlayerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.player.view.PlayerFragment$onViewCreated$4$1", f = "PlayerFragment.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220252q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f220253r;

            /* compiled from: PlayerFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.player.view.PlayerFragment$d$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C6622a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PlayerFragment f220254b;

                public C6622a(PlayerFragment playerFragment) {
                    this.f220254b = playerFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    D80.b bVar = (D80.b) obj;
                    a aVar = PlayerFragment.f220234F0;
                    PlayerFragment playerFragment = this.f220254b;
                    if (bVar instanceof b.a) {
                        ActivityC22955m activityC22955mL1 = playerFragment.l1();
                        if (activityC22955mL1 != null) {
                            if (activityC22955mL1 instanceof PlayerActivity) {
                                activityC22955mL1.finish();
                            } else {
                                playerFragment.r5();
                            }
                        }
                    } else if (bVar instanceof b.d) {
                        InterfaceC36534o interfaceC36534o = ((b.d) bVar).f2973a;
                        interfaceC36534o.y(playerFragment.f220239D0);
                        StyledPlayerView styledPlayerView = playerFragment.f220247z0;
                        if (styledPlayerView != null) {
                            styledPlayerView.setPlayer(new com.avito.android.player.view.c(interfaceC36534o, playerFragment));
                        }
                        playerFragment.f220238C0 = interfaceC36534o;
                        WeakReference weakReference = new WeakReference(playerFragment);
                        StyledPlayerView styledPlayerView2 = playerFragment.f220247z0;
                        if (styledPlayerView2 != null) {
                            styledPlayerView2.setControllerVisibilityListener(new com.avito.android.offlinization.ui.a(weakReference, 6));
                        }
                        StyledPlayerView styledPlayerView3 = playerFragment.f220247z0;
                        if (styledPlayerView3 != null) {
                            styledPlayerView3.f();
                        }
                    } else if (!(bVar instanceof b.C0151b)) {
                        boolean z12 = bVar instanceof b.c;
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
                    return new C42801a(2, this.f220254b, PlayerFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/player/mvi/entity/PlayerOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f220253r = playerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f220253r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220252q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = PlayerFragment.f220234F0;
                    PlayerFragment playerFragment = this.f220253r;
                    InterfaceC43160i<D80.b> events = playerFragment.E5().getEvents();
                    C6622a c6622a = new C6622a(playerFragment);
                    this.f220252q = 1;
                    if (events.collect(c6622a, this) == coroutine_suspended) {
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

        /* compiled from: PlayerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.player.view.PlayerFragment$onViewCreated$4$2", f = "PlayerFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220255q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f220256r;

            /* compiled from: PlayerFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerMviState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/player/mvi/entity/PlayerMviState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a extends N implements Y41.l<PlayerMviState, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ PlayerFragment f220257l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(PlayerFragment playerFragment) {
                    super(1);
                    this.f220257l = playerFragment;
                }

                @Override // Y41.l
                public final G0 invoke(PlayerMviState playerMviState) {
                    PlayerMviState playerMviState2 = playerMviState;
                    a aVar = PlayerFragment.f220234F0;
                    PlayerFragment playerFragment = this.f220257l;
                    if (playerMviState2 instanceof PlayerMviState.Loading) {
                        ViewGroup viewGroup = playerFragment.f220236A0;
                        if (viewGroup != null) {
                            viewGroup.setBackgroundColor(0);
                        }
                        com.avito.android.progress_overlay.l lVar = playerFragment.f220237B0;
                        if (lVar != null) {
                            lVar.k(null);
                        }
                        StyledPlayerView styledPlayerView = playerFragment.f220247z0;
                        if (styledPlayerView != null) {
                            styledPlayerView.f();
                            styledPlayerView.setControllerHideOnTouch(true);
                        }
                    } else if (playerMviState2 instanceof PlayerMviState.Loaded) {
                        ViewGroup viewGroup2 = playerFragment.f220236A0;
                        if (viewGroup2 != null) {
                            viewGroup2.setBackgroundColor(0);
                        }
                        com.avito.android.progress_overlay.l lVar2 = playerFragment.f220237B0;
                        if (lVar2 != null) {
                            lVar2.j();
                        }
                        StyledPlayerView styledPlayerView2 = playerFragment.f220247z0;
                        if (styledPlayerView2 != null) {
                            styledPlayerView2.setControllerHideOnTouch(true);
                        }
                    } else if (playerMviState2 instanceof PlayerMviState.Error) {
                        PlayerMviState.Error error = (PlayerMviState.Error) playerMviState2;
                        ViewGroup viewGroup3 = playerFragment.f220236A0;
                        if (viewGroup3 != null) {
                            viewGroup3.setBackgroundColor(androidx.core.content.d.getColor(playerFragment.requireContext(), R.color.player_error_bg));
                            int color = androidx.core.content.d.getColor(playerFragment.requireContext(), R.color.player_text_color);
                            View viewFindViewById = viewGroup3.findViewById(R.id.error_image);
                            if (viewFindViewById != null) {
                                viewFindViewById.setVisibility(8);
                            }
                            TextView textView = (TextView) viewGroup3.findViewById(R.id.error_text);
                            if (textView != null) {
                                textView.setTextColor(color);
                            }
                        }
                        com.avito.android.progress_overlay.l lVar3 = playerFragment.f220237B0;
                        if (lVar3 != null) {
                            lVar3.a(error.f220183b);
                        }
                        StyledPlayerView styledPlayerView3 = playerFragment.f220247z0;
                        if (styledPlayerView3 != null) {
                            styledPlayerView3.f();
                            styledPlayerView3.setControllerHideOnTouch(false);
                        }
                    } else {
                        L.f(playerMviState2, PlayerMviState.Initial.f220184b);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PlayerFragment playerFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f220256r = playerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f220256r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220255q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = PlayerFragment.f220234F0;
                    PlayerFragment playerFragment = this.f220256r;
                    n2<PlayerMviState> state = playerFragment.E5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = playerFragment.f220243v0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    a aVar2 = new a(playerFragment);
                    this.f220255q = 1;
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

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = PlayerFragment.this.new d(continuation);
            dVar.f220250q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f220250q;
            PlayerFragment playerFragment = PlayerFragment.this;
            C43259k.d(t12, null, null, new a(playerFragment, null), 3);
            C43259k.d(t12, null, null, new b(playerFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f220258l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f220258l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f220258l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PlayerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f220260l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f220260l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f220260l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220261l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220261l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f220261l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220262l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220262l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f220262l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PlayerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/player/view/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/player/view/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.player.view.j> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.player.view.j invoke() {
            k kVar = PlayerFragment.this.f220241t0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.player.view.j) kVar.get();
        }
    }

    public PlayerFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f220242u0 = new O0(m0.f406844a.b(com.avito.android.player.view.j.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f220245x0 = new C35968w3(this);
        this.f220239D0 = new b();
        this.f220240E0 = new NavigationState(false, null, 2, null);
    }

    public final PlayerArguments D5() {
        return (PlayerArguments) this.f220245x0.getValue(this, f220235G0[0]);
    }

    public final com.avito.android.player.view.j E5() {
        return (com.avito.android.player.view.j) this.f220242u0.getValue();
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f220243v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.player_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ImageView imageView = this.f220246y0;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        this.f220246y0 = null;
        StyledPlayerView styledPlayerView = this.f220247z0;
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
        InterfaceC36534o interfaceC36534o = this.f220238C0;
        if (interfaceC36534o != null) {
            interfaceC36534o.L(this.f220239D0);
        }
        this.f220247z0 = null;
        this.f220236A0 = null;
        com.avito.android.progress_overlay.l lVar = this.f220237B0;
        if (lVar != null) {
            lVar.h(null);
        }
        this.f220237B0 = null;
        Context context = getContext();
        if (context != null) {
            J80.a.b(context);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        E5().accept(a.i.f2969a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        StyledPlayerView styledPlayerView = this.f220247z0;
        if (styledPlayerView != null) {
            styledPlayerView.setSystemUiVisibility(4871);
        }
        Context context = getContext();
        if (context != null) {
            J80.a.a(context);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f220247z0 = (StyledPlayerView) view.findViewById(R.id.player_view);
        this.f220246y0 = (ImageView) view.findViewById(R.id.close_button);
        Integer num = D5().f220221h;
        if (num != null) {
            int iIntValue = num.intValue();
            StyledPlayerView styledPlayerView = this.f220247z0;
            if (styledPlayerView != null) {
                styledPlayerView.setResizeMode(iIntValue);
            }
        }
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) view).findViewById(R.id.loading_container);
        this.f220236A0 = viewGroup;
        InterfaceC28373a interfaceC28373a = this.f220244w0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 10, null);
        lVar.f231600j = new com.avito.android.player.view.b(this);
        this.f220237B0 = lVar;
        StyledPlayerView styledPlayerView2 = this.f220247z0;
        if (styledPlayerView2 != null) {
            styledPlayerView2.setOnClickListener(new com.avito.android.player.view.a(styledPlayerView2, 0));
            styledPlayerView2.setKeepScreenOn(true);
        }
        ImageView imageView = this.f220246y0;
        if (imageView != null) {
            imageView.setOnClickListener(new com.avito.android.order.feature.c(this, 26));
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f220243v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new d(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle bundleT5 = t5(bundle);
        Bundle bundle2 = bundleT5 != null ? bundleT5.getBundle("player_state") : null;
        PlayerArguments playerArgumentsD5 = D5();
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        f.a aVarA = com.avito.android.player.di.b.a();
        aVarA.d((com.avito.android.player.di.g) C29972i.a(C29972i.b(this), com.avito.android.player.di.g.class));
        aVarA.a((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class));
        aVarA.g(playerArgumentsD5);
        aVarA.b(getResources());
        aVarA.j(PlayerScreen.f220233d);
        aVarA.c(s.c(this));
        aVarA.i(this);
        aVarA.e(requireContext());
        com.avito.android.player.view.j.f220312P.getClass();
        aVarA.h(bundle2 != null ? (ExoPlayerController.State) bundle2.getParcelable("player_state") : null);
        aVarA.f(bundle2 != null ? (PlayerAnalyticsInteractor.State) bundle2.getParcelable("player_analytics_state") : null);
        aVarA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f220243v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f220243v0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f220243v0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).B(new G80.a(), this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF153164y0() {
        return this.f220240E0;
    }
}
