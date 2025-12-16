package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen;

import Cd.r;
import Y41.p;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenOneTimeEvent;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenArgument;
import com.avito.android.ui.fragments.BaseFragment;
import cv.InterfaceC39417a;
import fv.C40482a;
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
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: IacFinishedFallbackScreenFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/IacFinishedFallbackScreenFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacFinishedFallbackScreenFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f166522u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f166523n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f166524o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public b.a f166525p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.view.a f166526q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f166527r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f166528s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f166529t0;

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/IacFinishedFallbackScreenFragment$a;", "", "<init>", "()V", "", "CLOSING_ACTION_INTERCEPTOR_LINK_REQUEST_KEY", "Ljava/lang/String;", "KEY_ARG", "TAG", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<IacFinishedFallbackScreenArgument> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final IacFinishedFallbackScreenArgument invoke() {
            IacFinishedFallbackScreenArgument iacFinishedFallbackScreenArgument;
            a aVar = IacFinishedFallbackScreenFragment.f166522u0;
            Bundle arguments = IacFinishedFallbackScreenFragment.this.getArguments();
            aVar.getClass();
            if (arguments != null) {
                iacFinishedFallbackScreenArgument = (IacFinishedFallbackScreenArgument) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("screen_argument", IacFinishedFallbackScreenArgument.class) : arguments.getParcelable("screen_argument"));
            } else {
                iacFinishedFallbackScreenArgument = null;
            }
            if (iacFinishedFallbackScreenArgument != null) {
                return iacFinishedFallbackScreenArgument;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedFallbackScreenFragment.f166522u0;
            IacFinishedFallbackScreenFragment.this.q5().accept(IacFinishedFallbackScreenAction.OnBackOrCloseClicked.INSTANCE);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedFallbackScreenFragment.f166522u0;
            IacFinishedFallbackScreenFragment.this.q5().accept(IacFinishedFallbackScreenAction.OnRecallByGsmClicked.INSTANCE);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedFallbackScreenFragment.f166522u0;
            IacFinishedFallbackScreenFragment.this.q5().accept(IacFinishedFallbackScreenAction.OnRecallByIacClicked.INSTANCE);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedFallbackScreenFragment.f166522u0;
            IacFinishedFallbackScreenFragment.this.q5().accept(IacFinishedFallbackScreenAction.OnMessengerClicked.INSTANCE);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment$onViewCreated$1", f = "IacFinishedFallbackScreenFragment.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f166535q;

        /* compiled from: IacFinishedFallbackScreenFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment$onViewCreated$1$1", f = "IacFinishedFallbackScreenFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f166537q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ IacFinishedFallbackScreenFragment f166538r;

            /* compiled from: IacFinishedFallbackScreenFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment$onViewCreated$1$1$1", f = "IacFinishedFallbackScreenFragment.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment$g$a$a, reason: collision with other inner class name */
            public static final class C4944a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f166539q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ IacFinishedFallbackScreenFragment f166540r;

                /* compiled from: IacFinishedFallbackScreenFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment$g$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C4945a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ IacFinishedFallbackScreenFragment f166541b;

                    public C4945a(IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment) {
                        this.f166541b = iacFinishedFallbackScreenFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        IacFinishedFallbackScreenOneTimeEvent iacFinishedFallbackScreenOneTimeEvent = (IacFinishedFallbackScreenOneTimeEvent) obj;
                        a aVar = IacFinishedFallbackScreenFragment.f166522u0;
                        IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment = this.f166541b;
                        if (iacFinishedFallbackScreenOneTimeEvent instanceof IacFinishedFallbackScreenOneTimeEvent.CloseScreenImmediately) {
                            ActivityC22955m activityC22955mL1 = iacFinishedFallbackScreenFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.finish();
                            }
                        } else if (iacFinishedFallbackScreenOneTimeEvent instanceof IacFinishedFallbackScreenOneTimeEvent.HandleDeeplink) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = iacFinishedFallbackScreenFragment.f166524o0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((IacFinishedFallbackScreenOneTimeEvent.HandleDeeplink) iacFinishedFallbackScreenOneTimeEvent).getLink().unwrap(), null, null, 6);
                        } else if (iacFinishedFallbackScreenOneTimeEvent instanceof IacFinishedFallbackScreenOneTimeEvent.HandleGsmLink) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = iacFinishedFallbackScreenFragment.f166524o0;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            IacFinishedFallbackScreenOneTimeEvent.HandleGsmLink handleGsmLink = (IacFinishedFallbackScreenOneTimeEvent.HandleGsmLink) iacFinishedFallbackScreenOneTimeEvent;
                            DeepLink deepLinkUnwrap = handleGsmLink.getLink().unwrap();
                            PhoneRequestDeepLinkAnalyticsData.IacGsmFallback analyticsData = handleGsmLink.getAnalyticsData();
                            b.a.a(aVar3, deepLinkUnwrap, null, analyticsData != null ? PhoneRequestDeepLinkAnalyticsData.a.a(PhoneRequestDeepLinkAnalyticsData.f92253b, analyticsData) : null, 2);
                        } else if (iacFinishedFallbackScreenOneTimeEvent instanceof IacFinishedFallbackScreenOneTimeEvent.OnBootstrap) {
                            if (!iacFinishedFallbackScreenFragment.f166528s0) {
                                iacFinishedFallbackScreenFragment.f166528s0 = true;
                                iacFinishedFallbackScreenFragment.q5().accept(IacFinishedFallbackScreenAction.OnScreenCreated.INSTANCE);
                            }
                        } else if (iacFinishedFallbackScreenOneTimeEvent instanceof IacFinishedFallbackScreenOneTimeEvent.OnNeedToEmitClosingAction) {
                            iacFinishedFallbackScreenFragment.q5().accept(IacFinishedFallbackScreenAction.OnBackOrCloseClicked.INSTANCE);
                        } else if (iacFinishedFallbackScreenOneTimeEvent instanceof IacFinishedFallbackScreenOneTimeEvent.HandleClosingActionInterceptorLink) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar4 = iacFinishedFallbackScreenFragment.f166524o0;
                            if (aVar4 == null) {
                                aVar4 = null;
                            }
                            b.a.a(aVar4, ((IacFinishedFallbackScreenOneTimeEvent.HandleClosingActionInterceptorLink) iacFinishedFallbackScreenOneTimeEvent).getLink().unwrap(), "ClosingActionInterceptorLinkRequestKey", null, 4);
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f166541b, IacFinishedFallbackScreenFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4944a(IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment, Continuation<? super C4944a> continuation) {
                    super(2, continuation);
                    this.f166540r = iacFinishedFallbackScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4944a(this.f166540r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4944a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f166539q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = IacFinishedFallbackScreenFragment.f166522u0;
                        IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment = this.f166540r;
                        InterfaceC43160i<IacFinishedFallbackScreenOneTimeEvent> events = iacFinishedFallbackScreenFragment.q5().getEvents();
                        C4945a c4945a = new C4945a(iacFinishedFallbackScreenFragment);
                        this.f166539q = 1;
                        if (events.collect(c4945a, this) == coroutine_suspended) {
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

            /* compiled from: IacFinishedFallbackScreenFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment$onViewCreated$1$1$2", f = "IacFinishedFallbackScreenFragment.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f166542q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ IacFinishedFallbackScreenFragment f166543r;

                /* compiled from: IacFinishedFallbackScreenFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment$g$a$b$a, reason: collision with other inner class name */
                public static final class C4946a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ IacFinishedFallbackScreenFragment f166544b;

                    public C4946a(IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment) {
                        this.f166544b = iacFinishedFallbackScreenFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        if (L.f(((C43501a) obj).f413260a.f134521b, "ClosingActionInterceptorLinkRequestKey")) {
                            a aVar = IacFinishedFallbackScreenFragment.f166522u0;
                            this.f166544b.q5().accept(IacFinishedFallbackScreenAction.OnResultForClosingActionInterceptorLinkObserved.INSTANCE);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f166543r = iacFinishedFallbackScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f166543r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f166542q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment = this.f166543r;
                        com.avito.android.deeplink_handler.handler.composite.a aVar = iacFinishedFallbackScreenFragment.f166524o0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        InterfaceC43160i<C43501a> interfaceC43160iA = C40482a.a(aVar);
                        C4946a c4946a = new C4946a(iacFinishedFallbackScreenFragment);
                        this.f166542q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c4946a, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f166538r = iacFinishedFallbackScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f166538r, continuation);
                aVar.f166537q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f166537q;
                IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment = this.f166538r;
                C43259k.d(t12, null, null, new C4944a(iacFinishedFallbackScreenFragment, null), 3);
                C43259k.d(t12, null, null, new b(iacFinishedFallbackScreenFragment, null), 3);
                return G0.f406611a;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return IacFinishedFallbackScreenFragment.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f166535q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment = IacFinishedFallbackScreenFragment.this;
                a aVar = new a(iacFinishedFallbackScreenFragment, null);
                this.f166535q = 1;
                if (C23056p0.b(iacFinishedFallbackScreenFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f166546m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.l lVar) {
            super(0);
            this.f166546m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(IacFinishedFallbackScreenFragment.this, this.f166546m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return IacFinishedFallbackScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f166548l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f166548l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f166548l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f166549l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f166549l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f166549l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f166550l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f166550l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f166550l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: IacFinishedFallbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/b;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<C23060r0, com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.b> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.b invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            b.a aVar = IacFinishedFallbackScreenFragment.this.f166525p0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public IacFinishedFallbackScreenFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f166527r0 = new O0(m0.f406844a.b(com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.b.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f166529t0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d("IacFinishedCallScreenFragment", "New instance of finished call screen was created with argument: " + ((IacFinishedFallbackScreenArgument) this.f166529t0.getValue()), null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f166523n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.view.a aVar = this.f166526q0;
        return (aVar != null ? aVar : null).a(requireContext(), q5().getState(), new c(), new d(), new e(), new f());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f166523n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new g(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.a.a();
        com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c cVar = (com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        aVarA.a(this, requireActivity(), getResources(), s.c(this), (IacFinishedFallbackScreenArgument) this.f166529t0.getValue(), cVar, interfaceC39417aB).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f166523n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.b q5() {
        return (com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.b) this.f166527r0.getValue();
    }
}
