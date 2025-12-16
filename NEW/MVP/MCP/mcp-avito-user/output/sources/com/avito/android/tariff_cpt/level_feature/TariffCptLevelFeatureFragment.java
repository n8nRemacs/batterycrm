package com.avito.android.tariff_cpt.level_feature;

import Cd.C13243a;
import DC0.b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
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
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.tariff_cpt.level_feature.domain.TariffCptLevelFeatureContent;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import iC0.C41267a;
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

/* compiled from: TariffCptLevelFeaturesFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/TariffCptLevelFeatureFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCptLevelFeatureFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_cpt.level_feature.c f298423h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f298424i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f298425j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f298426k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f298427l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final O0 f298428m0;

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final C35968w3 f298429n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public TextView f298430o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public SimpleDraweeView f298431p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public Button f298432q0;

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f298422s0 = {m0.f406844a.e(new Y(TariffCptLevelFeatureFragment.class, "content", "getContent()Lcom/avito/android/tariff_cpt/level_feature/domain/TariffCptLevelFeatureContent;", 0))};

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f298421r0 = new a(null);

    /* compiled from: TariffCptLevelFeaturesFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/TariffCptLevelFeatureFragment$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCptLevelFeaturesFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_cpt/level_feature/TariffCptLevelFeatureFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @k
        public final ViewGroup a() {
            return (ViewGroup) TariffCptLevelFeatureFragment.this.requireDialog().findViewById(R.id.bottom_sheet_background);
        }
    }

    /* compiled from: TariffCptLevelFeaturesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment$onCreateDialog$1", f = "TariffCptLevelFeaturesFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f298434q;

        /* compiled from: TariffCptLevelFeaturesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment$onCreateDialog$1$1", f = "TariffCptLevelFeaturesFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f298436q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TariffCptLevelFeatureFragment f298437r;

            /* compiled from: TariffCptLevelFeaturesFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment$onCreateDialog$1$1$1", f = "TariffCptLevelFeaturesFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment$c$a$a, reason: collision with other inner class name */
            public static final class C9114a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f298438q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCptLevelFeatureFragment f298439r;

                /* compiled from: TariffCptLevelFeaturesFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C9115a extends H implements Y41.l<DC0.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(DC0.c cVar) {
                        Boolean boolIsEnabled;
                        DC0.c cVar2 = cVar;
                        TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = (TariffCptLevelFeatureFragment) this.receiver;
                        a aVar = TariffCptLevelFeatureFragment.f298421r0;
                        tariffCptLevelFeatureFragment.getClass();
                        UniversalImage universalImage = cVar2.f3102c;
                        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.c(tariffCptLevelFeatureFragment.getResources())) : null;
                        if (imageDependsOnThemeOrDefault != null) {
                            D6.H(tariffCptLevelFeatureFragment.f298431p0);
                            SimpleDraweeView simpleDraweeView = tariffCptLevelFeatureFragment.f298431p0;
                            if (simpleDraweeView != null) {
                                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
                            }
                        } else {
                            D6.w(tariffCptLevelFeatureFragment.f298431p0);
                        }
                        TextView textView = tariffCptLevelFeatureFragment.f298430o0;
                        if (textView != null) {
                            com.avito.android.util.text.a aVar2 = tariffCptLevelFeatureFragment.f298427l0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            com.avito.android.util.text.j.a(textView, cVar2.f3101b, aVar2);
                        }
                        Button button = tariffCptLevelFeatureFragment.f298432q0;
                        ButtonAction buttonAction = cVar2.f3103d;
                        if (button != null) {
                            jC0.g.a(button, buttonAction != null ? new C41267a(buttonAction.getTitle(), buttonAction.getDeeplink(), buttonAction.getStyle(), buttonAction.isEnabled()) : null);
                        }
                        Button button2 = tariffCptLevelFeatureFragment.f298432q0;
                        if (button2 != null) {
                            button2.setEnabled((buttonAction == null || (boolIsEnabled = buttonAction.isEnabled()) == null) ? true : boolIsEnabled.booleanValue());
                        }
                        Button button3 = tariffCptLevelFeatureFragment.f298432q0;
                        if (button3 != null) {
                            button3.setLoading(cVar2.f3105f);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9114a(TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment, Continuation<? super C9114a> continuation) {
                    super(2, continuation);
                    this.f298439r = tariffCptLevelFeatureFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C9114a(this.f298439r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9114a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f298438q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCptLevelFeatureFragment.f298421r0;
                        TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = this.f298439r;
                        n2<DC0.c> state = ((com.avito.android.tariff_cpt.level_feature.b) tariffCptLevelFeatureFragment.f298428m0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = tariffCptLevelFeatureFragment.f298424i0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9115a c9115a = new C9115a(1, tariffCptLevelFeatureFragment, TariffCptLevelFeatureFragment.class, "render", "render(Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureState;)V", 0);
                        this.f298438q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9115a, this) == coroutine_suspended) {
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

            /* compiled from: TariffCptLevelFeaturesFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment$onCreateDialog$1$1$2", f = "TariffCptLevelFeaturesFragment.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f298440q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCptLevelFeatureFragment f298441r;

                /* compiled from: TariffCptLevelFeaturesFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9116a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TariffCptLevelFeatureFragment f298442b;

                    public C9116a(TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment) {
                        this.f298442b = tariffCptLevelFeatureFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        DC0.b bVar = (DC0.b) obj;
                        a aVar = TariffCptLevelFeatureFragment.f298421r0;
                        TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = this.f298442b;
                        if (bVar instanceof b.a) {
                            ActivityC22955m activityC22955mL1 = tariffCptLevelFeatureFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.onBackPressed();
                            }
                        } else {
                            if (bVar instanceof b.C0160b) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffCptLevelFeatureFragment.f298426k0;
                                com.avito.android.deeplink_handler.handler.composite.b.a(aVar2 != null ? aVar2 : null, ((b.C0160b) bVar).f3096a);
                                tariffCptLevelFeatureFragment.dismiss();
                            } else if (bVar instanceof b.d) {
                                b.d dVar = (b.d) bVar;
                                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, tariffCptLevelFeatureFragment, com.avito.android.printable_text.b.f(z.l(dVar.f3098a)), null, null, new f.c(dVar.f3098a), 0, ToastBarPosition.f181046d, 942);
                            } else if (bVar instanceof b.c) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = tariffCptLevelFeatureFragment.f298426k0;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                DeepLink deepLink = ((b.c) bVar).f3097a;
                                if (deepLink != null) {
                                    aVar3.r6(null, deepLink, "cpt_level_feature_request_key");
                                }
                            }
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
                        return new C42801a(2, this.f298442b, TariffCptLevelFeatureFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f298441r = tariffCptLevelFeatureFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f298441r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f298440q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCptLevelFeatureFragment.f298421r0;
                        TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = this.f298441r;
                        InterfaceC43160i<DC0.b> events = ((com.avito.android.tariff_cpt.level_feature.b) tariffCptLevelFeatureFragment.f298428m0.getValue()).getEvents();
                        C9116a c9116a = new C9116a(tariffCptLevelFeatureFragment);
                        this.f298440q = 1;
                        if (events.collect(c9116a, this) == coroutine_suspended) {
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
            public a(TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f298437r = tariffCptLevelFeatureFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f298437r, continuation);
                aVar.f298436q = obj;
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
                T t12 = (T) this.f298436q;
                TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = this.f298437r;
                C43259k.d(t12, null, null, new C9114a(tariffCptLevelFeatureFragment, null), 3);
                C43259k.d(t12, null, null, new b(tariffCptLevelFeatureFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return TariffCptLevelFeatureFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f298434q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = TariffCptLevelFeatureFragment.this;
                a aVar = new a(tariffCptLevelFeatureFragment, null);
                this.f298434q = 1;
                if (C23056p0.b(tariffCptLevelFeatureFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TariffCptLevelFeaturesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = (TariffCptLevelFeatureFragment) this.receiver;
            a aVar = TariffCptLevelFeatureFragment.f298421r0;
            tariffCptLevelFeatureFragment.getClass();
            tariffCptLevelFeatureFragment.f298430o0 = (TextView) view2.findViewById(R.id.tariff_cpt_level_feature_description);
            tariffCptLevelFeatureFragment.f298431p0 = (SimpleDraweeView) view2.findViewById(R.id.tariff_cpt_level_feature_image);
            Button button = (Button) view2.findViewById(R.id.tariff_cpt_level_feature_button);
            button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(tariffCptLevelFeatureFragment, 26));
            tariffCptLevelFeatureFragment.f298432q0 = button;
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f298443l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f298443l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f298443l);
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
            return TariffCptLevelFeatureFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f298445l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f298445l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f298445l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f298446l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f298446l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f298446l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f298447l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f298447l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f298447l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCptLevelFeaturesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_cpt/level_feature/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.tariff_cpt.level_feature.b> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_cpt.level_feature.b invoke() {
            com.avito.android.tariff_cpt.level_feature.c cVar = TariffCptLevelFeatureFragment.this.f298423h0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.tariff_cpt.level_feature.b) cVar.get();
        }
    }

    public TariffCptLevelFeatureFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f298428m0 = new O0(m0.f406844a.b(com.avito.android.tariff_cpt.level_feature.b.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f298429n0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 20);
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
        com.avito.android.tariff_cpt.level_feature.di.a.a().a((com.avito.android.tariff_cpt.common.di.d) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), s.b(this), (TariffCptLevelFeatureContent) this.f298429n0.getValue(this, f298422s0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f298424i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f298424i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f298424i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.tariff_cpt_level_feature_fragment, true, new d(1, this, TariffCptLevelFeatureFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.j.b(dVar, false, 4);
        dVar.J(true);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f298424i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
