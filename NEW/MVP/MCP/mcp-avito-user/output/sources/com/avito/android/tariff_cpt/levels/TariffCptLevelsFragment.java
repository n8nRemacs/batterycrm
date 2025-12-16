package com.avito.android.tariff_cpt.levels;

import Cd.C13243a;
import FC0.a;
import FC0.b;
import Y41.p;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.levels.di.b;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import iC0.C41267a;
import java.util.List;
import javax.inject.Inject;
import kC0.C42568a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: TariffCptLevelsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/TariffCptLevelsFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCptLevelsFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f298504x0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_cpt.levels.f f298505h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f298506i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f298507j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f298508k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f298509l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final O0 f298510m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public C42568a f298511n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public TextView f298512o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public TextView f298513p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public Chips f298514q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public RecyclerView f298515r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public ViewGroup f298516s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public Button f298517t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public TextView f298518u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.progress_overlay.l f298519v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public ShimmerLayout f298520w0;

    /* compiled from: TariffCptLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/TariffCptLevelsFragment$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: TariffCptLevelsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$a$a, reason: collision with other inner class name */
        public static final class C9122a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f298521l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9122a(String str) {
                super(1);
                this.f298521l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("tariff_cpt_extra_remote_context", this.f298521l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static TariffCptLevelsFragment a(@Y61.k String str) {
            TariffCptLevelsFragment tariffCptLevelsFragment = new TariffCptLevelsFragment();
            C35966w1.a(tariffCptLevelsFragment, -1, new C9122a(str));
            return tariffCptLevelsFragment;
        }

        public a() {
        }
    }

    /* compiled from: TariffCptLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_cpt/levels/TariffCptLevelsFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) TariffCptLevelsFragment.this.requireDialog().findViewById(R.id.tariff_cpt_levels_container);
        }
    }

    /* compiled from: TariffCptLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$onCreateDialog$1", f = "TariffCptLevelsFragment.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f298523q;

        /* compiled from: TariffCptLevelsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$onCreateDialog$1$1", f = "TariffCptLevelsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f298525q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TariffCptLevelsFragment f298526r;

            /* compiled from: TariffCptLevelsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$onCreateDialog$1$1$1", f = "TariffCptLevelsFragment.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$c$a$a, reason: collision with other inner class name */
            public static final class C9123a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f298527q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCptLevelsFragment f298528r;

                /* compiled from: TariffCptLevelsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C9124a extends H implements Y41.l<FC0.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(FC0.c cVar) throws Resources.NotFoundException {
                        FC0.c cVar2 = cVar;
                        TariffCptLevelsFragment tariffCptLevelsFragment = (TariffCptLevelsFragment) this.receiver;
                        a aVar = TariffCptLevelsFragment.f298504x0;
                        tariffCptLevelsFragment.getClass();
                        Throwable th2 = cVar2.f4634h;
                        if (th2 != null) {
                            ViewGroup viewGroup = tariffCptLevelsFragment.f298516s0;
                            if (viewGroup != null) {
                                D6.w(viewGroup);
                            }
                            com.avito.android.progress_overlay.l lVar = tariffCptLevelsFragment.f298519v0;
                            if (lVar != null) {
                                lVar.a(z.l(th2));
                            }
                            ShimmerLayout shimmerLayout = tariffCptLevelsFragment.f298520w0;
                            if (shimmerLayout != null) {
                                D6.w(shimmerLayout);
                            }
                        } else {
                            if (cVar2.f4635i) {
                                ViewGroup viewGroup2 = tariffCptLevelsFragment.f298516s0;
                                if (viewGroup2 != null) {
                                    D6.w(viewGroup2);
                                }
                                com.avito.android.progress_overlay.l lVar2 = tariffCptLevelsFragment.f298519v0;
                                if (lVar2 != null) {
                                    lVar2.k(null);
                                }
                                ShimmerLayout shimmerLayout2 = tariffCptLevelsFragment.f298520w0;
                                if (shimmerLayout2 != null) {
                                    D6.H(shimmerLayout2);
                                }
                            } else if (cVar2.f4636j) {
                                Button button = tariffCptLevelsFragment.f298517t0;
                                if (button != null) {
                                    button.setLoading(true);
                                }
                            } else {
                                com.avito.konveyor.adapter.d dVar = tariffCptLevelsFragment.f298507j0;
                                if (dVar == null) {
                                    dVar = null;
                                }
                                int count = dVar.f338497e.getCount();
                                List<com.avito.conveyor_item.a> list = cVar2.f4632f;
                                EC0.a aVar2 = cVar2.f4631e;
                                if (count > 0) {
                                    com.avito.konveyor.adapter.d dVar2 = tariffCptLevelsFragment.f298507j0;
                                    if (dVar2 == null) {
                                        dVar2 = null;
                                    }
                                    dVar2.l(list, null);
                                    tariffCptLevelsFragment.g5(aVar2 != null ? aVar2.f3878d : null);
                                    TextView textView = tariffCptLevelsFragment.f298518u0;
                                    if (textView != null) {
                                        AttributedText attributedText = aVar2 != null ? aVar2.f3879e : null;
                                        com.avito.android.util.text.a aVar3 = tariffCptLevelsFragment.f298509l0;
                                        com.avito.android.util.text.j.a(textView, attributedText, aVar3 != null ? aVar3 : null);
                                    }
                                } else {
                                    TextView textView2 = tariffCptLevelsFragment.f298512o0;
                                    if (textView2 != null) {
                                        textView2.setText(cVar2.f4628b);
                                    }
                                    TextView textView3 = tariffCptLevelsFragment.f298513p0;
                                    AttributedText attributedText2 = cVar2.f4629c;
                                    if (textView3 != null) {
                                        com.avito.android.util.text.a aVar4 = tariffCptLevelsFragment.f298509l0;
                                        if (aVar4 == null) {
                                            aVar4 = null;
                                        }
                                        com.avito.android.util.text.j.a(textView3, attributedText2, aVar4);
                                    }
                                    if (attributedText2 != null) {
                                        attributedText2.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(tariffCptLevelsFragment, 3));
                                    }
                                    Chips chips = tariffCptLevelsFragment.f298514q0;
                                    if (chips != null) {
                                        List<com.avito.android.lib.design.chips.h> list2 = cVar2.f4630d;
                                        if (list2.isEmpty()) {
                                            D6.w(chips);
                                        } else {
                                            chips.setData(list2);
                                            if (aVar2 != null) {
                                                chips.q(aVar2, true);
                                            }
                                            D6.H(chips);
                                        }
                                    }
                                    com.avito.konveyor.adapter.d dVar3 = tariffCptLevelsFragment.f298507j0;
                                    if (dVar3 == null) {
                                        dVar3 = null;
                                    }
                                    dVar3.l(list, null);
                                    tariffCptLevelsFragment.g5(aVar2 != null ? aVar2.f3878d : null);
                                    TextView textView4 = tariffCptLevelsFragment.f298518u0;
                                    if (textView4 != null) {
                                        AttributedText attributedText3 = aVar2 != null ? aVar2.f3879e : null;
                                        com.avito.android.util.text.a aVar5 = tariffCptLevelsFragment.f298509l0;
                                        com.avito.android.util.text.j.a(textView4, attributedText3, aVar5 != null ? aVar5 : null);
                                    }
                                    ViewGroup viewGroup3 = tariffCptLevelsFragment.f298516s0;
                                    if (viewGroup3 != null) {
                                        D6.H(viewGroup3);
                                    }
                                    ShimmerLayout shimmerLayout3 = tariffCptLevelsFragment.f298520w0;
                                    if (shimmerLayout3 != null) {
                                        D6.w(shimmerLayout3);
                                    }
                                    com.avito.android.progress_overlay.l lVar3 = tariffCptLevelsFragment.f298519v0;
                                    if (lVar3 != null) {
                                        lVar3.j();
                                    }
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9123a(TariffCptLevelsFragment tariffCptLevelsFragment, Continuation<? super C9123a> continuation) {
                    super(2, continuation);
                    this.f298528r = tariffCptLevelsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C9123a(this.f298528r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9123a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f298527q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCptLevelsFragment.f298504x0;
                        TariffCptLevelsFragment tariffCptLevelsFragment = this.f298528r;
                        n2<FC0.c> state = tariffCptLevelsFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = tariffCptLevelsFragment.f298506i0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9124a c9124a = new C9124a(1, tariffCptLevelsFragment, TariffCptLevelsFragment.class, "render", "render(Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsState;)V", 0);
                        this.f298527q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9124a, this) == coroutine_suspended) {
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

            /* compiled from: TariffCptLevelsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$onCreateDialog$1$1$2", f = "TariffCptLevelsFragment.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f298529q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCptLevelsFragment f298530r;

                /* compiled from: TariffCptLevelsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9125a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TariffCptLevelsFragment f298531b;

                    public C9125a(TariffCptLevelsFragment tariffCptLevelsFragment) {
                        this.f298531b = tariffCptLevelsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        FC0.b bVar = (FC0.b) obj;
                        a aVar = TariffCptLevelsFragment.f298504x0;
                        TariffCptLevelsFragment tariffCptLevelsFragment = this.f298531b;
                        if (bVar instanceof b.C0283b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffCptLevelsFragment.f298508k0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            DeepLink deepLink = ((b.C0283b) bVar).f4625a;
                            if (deepLink != null) {
                                aVar2.r6(null, deepLink, "tariff_cpt_levels_request_key");
                            }
                        } else if (bVar instanceof b.a) {
                            String tag = tariffCptLevelsFragment.getTag();
                            if (tag == null) {
                                tag = "";
                            }
                            tariffCptLevelsFragment.getParentFragmentManager().o0(C22777e.b(new Q("tariff_cpt_levels_deeplink_key", ((b.a) bVar).f4624a)), tag);
                            tariffCptLevelsFragment.dismiss();
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
                        return new C42801a(2, this.f298531b, TariffCptLevelsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TariffCptLevelsFragment tariffCptLevelsFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f298530r = tariffCptLevelsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f298530r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f298529q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCptLevelsFragment.f298504x0;
                        TariffCptLevelsFragment tariffCptLevelsFragment = this.f298530r;
                        InterfaceC43160i<FC0.b> events = tariffCptLevelsFragment.f5().getEvents();
                        C9125a c9125a = new C9125a(tariffCptLevelsFragment);
                        this.f298529q = 1;
                        if (events.collect(c9125a, this) == coroutine_suspended) {
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
            public a(TariffCptLevelsFragment tariffCptLevelsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f298526r = tariffCptLevelsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f298526r, continuation);
                aVar.f298525q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f298525q;
                TariffCptLevelsFragment tariffCptLevelsFragment = this.f298526r;
                C43259k.d(t12, null, null, new C9123a(tariffCptLevelsFragment, null), 3);
                C43259k.d(t12, null, null, new b(tariffCptLevelsFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return TariffCptLevelsFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f298523q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                TariffCptLevelsFragment tariffCptLevelsFragment = TariffCptLevelsFragment.this;
                a aVar = new a(tariffCptLevelsFragment, null);
                this.f298523q = 1;
                if (C23056p0.b(tariffCptLevelsFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TariffCptLevelsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        public final void f(@Y61.k View view) {
            TariffCptLevelsFragment tariffCptLevelsFragment = (TariffCptLevelsFragment) this.receiver;
            a aVar = TariffCptLevelsFragment.f298504x0;
            tariffCptLevelsFragment.getClass();
            com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.tariff_cpt_levels_container), R.id.tariff_cpt_levels_content, null, R.layout.tariff_cpt_network_problem_view, 0, 4, null);
            lVar.f231600j = new com.avito.android.tariff_cpt.levels.a(tariffCptLevelsFragment);
            tariffCptLevelsFragment.f298519v0 = lVar;
            tariffCptLevelsFragment.f298512o0 = (TextView) view.findViewById(R.id.tariff_cpt_levels_title);
            tariffCptLevelsFragment.f298513p0 = (TextView) view.findViewById(R.id.tariff_cpt_levels_description);
            Chips chips = (Chips) view.findViewById(R.id.tariff_cpt_levels_chips);
            chips.setChipsSelectedListener(new com.avito.android.tariff_cpt.levels.b(tariffCptLevelsFragment));
            tariffCptLevelsFragment.f298514q0 = chips;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tariff_cpt_levels_list);
            com.avito.konveyor.adapter.d dVar = tariffCptLevelsFragment.f298507j0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            recyclerView.setItemAnimator(null);
            recyclerView.l(new GC0.a(), -1);
            ScreenPerformanceTracker screenPerformanceTracker = tariffCptLevelsFragment.f298506i0;
            (screenPerformanceTracker != null ? screenPerformanceTracker : null).b(recyclerView);
            tariffCptLevelsFragment.f298515r0 = recyclerView;
            Button button = (Button) view.findViewById(R.id.tariff_cpt_levels_button);
            button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(tariffCptLevelsFragment, 27));
            tariffCptLevelsFragment.f298517t0 = button;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.tariff_cpt_levels_bottom_block);
            viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(tariffCptLevelsFragment, 22));
            tariffCptLevelsFragment.f298516s0 = viewGroup;
            tariffCptLevelsFragment.f298518u0 = (TextView) view.findViewById(R.id.tariff_cpt_levels_extra_info);
            tariffCptLevelsFragment.f298520w0 = (ShimmerLayout) view.findViewById(R.id.tariff_cpt_levels_shimmer);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCptLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffCptLevelsFragment.f298504x0;
            TariffCptLevelsFragment.this.f5().accept(new a.C0282a(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f298533l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f298533l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f298533l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TariffCptLevelsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f298535l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f298535l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f298535l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f298536l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f298536l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f298536l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f298537l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f298537l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f298537l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCptLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_cpt/levels/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.tariff_cpt.levels.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_cpt.levels.e invoke() {
            com.avito.android.tariff_cpt.levels.f fVar = TariffCptLevelsFragment.this.f298505h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.tariff_cpt.levels.e) fVar.get();
        }
    }

    public TariffCptLevelsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f298510m0 = new O0(m0.f406844a.b(com.avito.android.tariff_cpt.levels.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @Y61.k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 21);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @Y61.k
    public final a.i c5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new b(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.tariff_cpt.levels.di.a.a();
        com.avito.android.tariff_cpt.common.di.d dVar = (com.avito.android.tariff_cpt.common.di.d) C29972i.a(C29972i.b(this), Object.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarB = s.b(this);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("tariff_cpt_extra_remote_context") : null;
        if (string == null) {
            throw new IllegalArgumentException("tariff_cpt_extra_remote_context".concat(" - param must be not null"));
        }
        aVarA.a(dVar, interfaceC39417aB, rVarB, string, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f298506i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f298506i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    public final com.avito.android.tariff_cpt.levels.e f5() {
        return (com.avito.android.tariff_cpt.levels.e) this.f298510m0.getValue();
    }

    public final void g5(C41267a c41267a) throws Resources.NotFoundException {
        Boolean bool;
        Button button = this.f298517t0;
        if (button != null) {
            Context context = button.getContext();
            String str = c41267a != null ? c41267a.f398438c : null;
            Integer numValueOf = str != null ? Integer.valueOf(C35835l0.j(com.avito.android.lib.util.f.d(str), context)) : null;
            if (numValueOf != null) {
                button.setAppearance(numValueOf.intValue());
            }
            button.setEnabled((c41267a == null || (bool = c41267a.f398439d) == null) ? true : bool.booleanValue());
            com.avito.android.lib.design.button.b.a(button, c41267a != null ? c41267a.f398436a : null, false);
            button.setLoading(false);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f298506i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.tariff_cpt_levels_fragment, true, new d(1, this, TariffCptLevelsFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f298506i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
