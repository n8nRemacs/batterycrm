package com.avito.android.tariff.cpx.level.feature;

import Cd.C13243a;
import EB0.b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
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
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.tariff.cpx.level.feature.domain.TariffCpxLevelFeatureContent;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
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
import kotlin.jvm.internal.H;
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

/* compiled from: TariffCpxLevelFeatureFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/TariffCpxLevelFeatureFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCpxLevelFeatureFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.level.feature.d f296926h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f296927i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f296928j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f296929k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f296930l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final C35968w3 f296931m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public TextView f296932n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public SimpleDraweeView f296933o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public Button f296934p0;

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f296925r0 = {m0.f406844a.e(new Y(TariffCpxLevelFeatureFragment.class, "content", "getContent()Lcom/avito/android/tariff/cpx/level/feature/domain/TariffCpxLevelFeatureContent;", 0))};

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f296924q0 = new a(null);

    /* compiled from: TariffCpxLevelFeatureFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/TariffCpxLevelFeatureFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxLevelFeatureFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/level/feature/TariffCpxLevelFeatureFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @k
        public final ViewGroup a() {
            return (ViewGroup) TariffCpxLevelFeatureFragment.this.requireDialog().findViewById(R.id.bottom_sheet_background);
        }
    }

    /* compiled from: TariffCpxLevelFeatureFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment$onCreateDialog$1", f = "TariffCpxLevelFeatureFragment.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f296936q;

        /* compiled from: TariffCpxLevelFeatureFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment$onCreateDialog$1$1", f = "TariffCpxLevelFeatureFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f296938q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TariffCpxLevelFeatureFragment f296939r;

            /* compiled from: TariffCpxLevelFeatureFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment$onCreateDialog$1$1$1", f = "TariffCpxLevelFeatureFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment$c$a$a, reason: collision with other inner class name */
            public static final class C9042a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f296940q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCpxLevelFeatureFragment f296941r;

                /* compiled from: TariffCpxLevelFeatureFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C9043a extends H implements Y41.l<EB0.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(EB0.c cVar) throws Resources.NotFoundException {
                        DeepLink deeplink;
                        Button button;
                        String style;
                        Context context;
                        Boolean boolIsEnabled;
                        EB0.c cVar2 = cVar;
                        TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = (TariffCpxLevelFeatureFragment) this.receiver;
                        Button button2 = tariffCpxLevelFeatureFragment.f296934p0;
                        if (button2 != null) {
                            button2.setLoading(cVar2.f3874f);
                        }
                        UniversalImage universalImage = cVar2.f3871c;
                        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.c(tariffCpxLevelFeatureFragment.getResources())) : null;
                        if (imageDependsOnThemeOrDefault != null) {
                            D6.H(tariffCpxLevelFeatureFragment.f296933o0);
                            SimpleDraweeView simpleDraweeView = tariffCpxLevelFeatureFragment.f296933o0;
                            if (simpleDraweeView != null) {
                                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
                            }
                        } else {
                            D6.w(tariffCpxLevelFeatureFragment.f296933o0);
                        }
                        TextView textView = tariffCpxLevelFeatureFragment.f296932n0;
                        if (textView != null) {
                            com.avito.android.util.text.j.a(textView, cVar2.f3870b, null);
                        }
                        Button button3 = tariffCpxLevelFeatureFragment.f296934p0;
                        ButtonAction buttonAction = cVar2.f3872d;
                        if (button3 != null) {
                            com.avito.android.lib.design.button.b.a(button3, buttonAction != null ? buttonAction.getTitle() : null, false);
                        }
                        if (buttonAction != null && (boolIsEnabled = buttonAction.isEnabled()) != null) {
                            boolean zBooleanValue = boolIsEnabled.booleanValue();
                            Button button4 = tariffCpxLevelFeatureFragment.f296934p0;
                            if (button4 != null) {
                                button4.setEnabled(zBooleanValue);
                            }
                        }
                        if (buttonAction != null && (style = buttonAction.getStyle()) != null) {
                            int iD2 = com.avito.android.lib.util.f.d(style);
                            Dialog dialog = tariffCpxLevelFeatureFragment.getDialog();
                            if (dialog != null && (context = dialog.getContext()) != null) {
                                int iJ2 = C35835l0.j(iD2, context);
                                Button button5 = tariffCpxLevelFeatureFragment.f296934p0;
                                if (button5 != null) {
                                    button5.setAppearance(iJ2);
                                }
                            }
                        }
                        if (buttonAction != null && (deeplink = buttonAction.getDeeplink()) != null && (button = tariffCpxLevelFeatureFragment.f296934p0) != null) {
                            button.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(1, tariffCpxLevelFeatureFragment, deeplink));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9042a(TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment, Continuation<? super C9042a> continuation) {
                    super(2, continuation);
                    this.f296941r = tariffCpxLevelFeatureFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C9042a(this.f296941r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9042a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f296940q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCpxLevelFeatureFragment.f296924q0;
                        TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = this.f296941r;
                        n2<EB0.c> state = ((com.avito.android.tariff.cpx.level.feature.c) tariffCpxLevelFeatureFragment.f296927i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = tariffCpxLevelFeatureFragment.f296928j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9043a c9043a = new C9043a(1, tariffCpxLevelFeatureFragment, TariffCpxLevelFeatureFragment.class, "render", "render(Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureState;)V", 0);
                        this.f296940q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9043a, this) == coroutine_suspended) {
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

            /* compiled from: TariffCpxLevelFeatureFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment$onCreateDialog$1$1$2", f = "TariffCpxLevelFeatureFragment.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f296942q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCpxLevelFeatureFragment f296943r;

                /* compiled from: TariffCpxLevelFeatureFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9044a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TariffCpxLevelFeatureFragment f296944b;

                    public C9044a(TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment) {
                        this.f296944b = tariffCpxLevelFeatureFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        EB0.b bVar = (EB0.b) obj;
                        a aVar = TariffCpxLevelFeatureFragment.f296924q0;
                        TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = this.f296944b;
                        if (bVar instanceof b.a) {
                            ActivityC22955m activityC22955mL1 = tariffCpxLevelFeatureFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.onBackPressed();
                            }
                        } else if (bVar instanceof b.C0222b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffCpxLevelFeatureFragment.f296930l0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((b.C0222b) bVar).f3865a, null, null, 6);
                            tariffCpxLevelFeatureFragment.dismiss();
                        } else if (bVar instanceof b.d) {
                            b.d dVar = (b.d) bVar;
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, tariffCpxLevelFeatureFragment, com.avito.android.printable_text.b.f(dVar.f3867a.getF244063c()), null, null, new f.c(dVar.f3867a), 0, ToastBarPosition.f181046d, 942);
                        } else if (bVar instanceof b.c) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = tariffCpxLevelFeatureFragment.f296930l0;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            b.a.a(aVar3, ((b.c) bVar).f3866a, "cpx_level_feature_request_key", null, 4);
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
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f296944b, TariffCpxLevelFeatureFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f296943r = tariffCpxLevelFeatureFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f296943r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f296942q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCpxLevelFeatureFragment.f296924q0;
                        TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = this.f296943r;
                        InterfaceC43160i<EB0.b> events = ((com.avito.android.tariff.cpx.level.feature.c) tariffCpxLevelFeatureFragment.f296927i0.getValue()).getEvents();
                        C9044a c9044a = new C9044a(tariffCpxLevelFeatureFragment);
                        this.f296942q = 1;
                        if (events.collect(c9044a, this) == coroutine_suspended) {
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
            public a(TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f296939r = tariffCpxLevelFeatureFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f296939r, continuation);
                aVar.f296938q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f296938q;
                TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = this.f296939r;
                C43259k.d(t12, null, null, new C9042a(tariffCpxLevelFeatureFragment, null), 3);
                C43259k.d(t12, null, null, new b(tariffCpxLevelFeatureFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return TariffCpxLevelFeatureFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f296936q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = TariffCpxLevelFeatureFragment.this;
                a aVar = new a(tariffCpxLevelFeatureFragment, null);
                this.f296936q = 1;
                if (C23056p0.b(tariffCpxLevelFeatureFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TariffCpxLevelFeatureFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = (TariffCpxLevelFeatureFragment) this.receiver;
            a aVar = TariffCpxLevelFeatureFragment.f296924q0;
            tariffCpxLevelFeatureFragment.getClass();
            tariffCpxLevelFeatureFragment.f296932n0 = (TextView) view2.findViewById(R.id.tariff_cpx_level_feature_description);
            tariffCpxLevelFeatureFragment.f296933o0 = (SimpleDraweeView) view2.findViewById(R.id.tariff_cpx_level_feature_image);
            tariffCpxLevelFeatureFragment.f296934p0 = (Button) view2.findViewById(R.id.tariff_cpx_level_feature_button);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f296945l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f296945l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f296945l);
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
            return TariffCpxLevelFeatureFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f296947l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f296947l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f296947l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296948l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296948l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f296948l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296949l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296949l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f296949l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCpxLevelFeatureFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/level/feature/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.tariff.cpx.level.feature.c> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.level.feature.c invoke() {
            com.avito.android.tariff.cpx.level.feature.d dVar = TariffCpxLevelFeatureFragment.this.f296926h0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.tariff.cpx.level.feature.c) dVar.get();
        }
    }

    public TariffCpxLevelFeatureFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f296927i0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.level.feature.c.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f296931m0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 16);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.i c5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new b(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff.cpx.level.feature.di.a.a().a(s.b(this), (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), (TariffCpxLevelFeatureContent) this.f296931m0.getValue(this, f296925r0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f296928j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f296928j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.tariff_cpx_level_feature_fragment, true, new d(1, this, TariffCpxLevelFeatureFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.j.b(dVar, false, 4);
        dVar.J(true);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296928j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
