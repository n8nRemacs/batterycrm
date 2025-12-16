package com.avito.android.tariff.cpx.levels;

import Cd.C13243a;
import HB0.a;
import HB0.b;
import Y41.p;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
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
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.levels.CpxLevelsFragment;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import java.util.List;
import javax.inject.Inject;
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
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: CpxLevelsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/CpxLevelsFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CpxLevelsFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f297006w0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.levels.f f297007h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f297008i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f297009j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f297010k0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public C49899a f297011l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f297012m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final O0 f297013n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public TextView f297014o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public TextView f297015p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public Chips f297016q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public RecyclerView f297017r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public Button f297018s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public TextView f297019t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public xZ.e f297020u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public View f297021v0;

    /* compiled from: CpxLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/CpxLevelsFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CpxLevelsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.tariff.cpx.levels.CpxLevelsFragment$a$a, reason: collision with other inner class name */
        public static final class C9050a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f297022l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9050a(String str) {
                super(1);
                this.f297022l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("remote_context", this.f297022l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static CpxLevelsFragment a(@Y61.k String str) {
            CpxLevelsFragment cpxLevelsFragment = new CpxLevelsFragment();
            C35966w1.a(cpxLevelsFragment, -1, new C9050a(str));
            return cpxLevelsFragment;
        }

        public a() {
        }
    }

    /* compiled from: CpxLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/levels/CpxLevelsFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) CpxLevelsFragment.this.requireDialog().findViewById(R.id.cpx_levels_container);
        }
    }

    /* compiled from: CpxLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpx.levels.CpxLevelsFragment$onCreateDialog$1", f = "CpxLevelsFragment.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f297024q;

        /* compiled from: CpxLevelsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff.cpx.levels.CpxLevelsFragment$onCreateDialog$1$1", f = "CpxLevelsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f297026q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CpxLevelsFragment f297027r;

            /* compiled from: CpxLevelsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.levels.CpxLevelsFragment$onCreateDialog$1$1$1", f = "CpxLevelsFragment.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpx.levels.CpxLevelsFragment$c$a$a, reason: collision with other inner class name */
            public static final class C9051a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f297028q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CpxLevelsFragment f297029r;

                /* compiled from: CpxLevelsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.levels.CpxLevelsFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C9052a extends H implements Y41.l<HB0.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(HB0.c cVar) throws Resources.NotFoundException {
                        HB0.c cVar2 = cVar;
                        CpxLevelsFragment cpxLevelsFragment = (CpxLevelsFragment) this.receiver;
                        a aVar = CpxLevelsFragment.f297006w0;
                        cpxLevelsFragment.getClass();
                        String str = cVar2.f7000h;
                        if (str != null) {
                            View view = cpxLevelsFragment.f297021v0;
                            if (view != null) {
                                D6.w(view);
                            }
                            xZ.e eVar = cpxLevelsFragment.f297020u0;
                            if (eVar != null) {
                                eVar.d(str);
                            }
                        } else if (cVar2.f7001i) {
                            Button button = cpxLevelsFragment.f297018s0;
                            if (button != null) {
                                D6.w(button);
                            }
                            View view2 = cpxLevelsFragment.f297021v0;
                            if (view2 != null) {
                                D6.H(view2);
                            }
                            xZ.e eVar2 = cpxLevelsFragment.f297020u0;
                            if (eVar2 != null) {
                                eVar2.c();
                            }
                        } else if (cVar2.f7002j) {
                            Button button2 = cpxLevelsFragment.f297018s0;
                            if (button2 != null) {
                                button2.setLoading(true);
                            }
                        } else {
                            com.avito.konveyor.adapter.d dVar = cpxLevelsFragment.f297010k0;
                            if (dVar == null) {
                                dVar = null;
                            }
                            int count = dVar.f338497e.getCount();
                            List<com.avito.conveyor_item.a> list = cVar2.f6998f;
                            FB0.a aVar2 = cVar2.f6997e;
                            if (count > 0) {
                                com.avito.konveyor.adapter.d dVar2 = cpxLevelsFragment.f297010k0;
                                if (dVar2 == null) {
                                    dVar2 = null;
                                }
                                dVar2.l(list, null);
                                cpxLevelsFragment.g5(aVar2 != null ? aVar2.f4597d : null);
                                TextView textView = cpxLevelsFragment.f297019t0;
                                if (textView != null) {
                                    com.avito.android.util.text.j.a(textView, aVar2 != null ? aVar2.f4598e : null, null);
                                }
                            } else {
                                TextView textView2 = cpxLevelsFragment.f297014o0;
                                if (textView2 != null) {
                                    textView2.setText(cVar2.f6994b);
                                }
                                TextView textView3 = cpxLevelsFragment.f297015p0;
                                AttributedText attributedText = cVar2.f6995c;
                                if (textView3 != null) {
                                    com.avito.android.util.text.j.a(textView3, attributedText, null);
                                }
                                if (attributedText != null) {
                                    attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(cpxLevelsFragment, 2));
                                }
                                Chips chips = cpxLevelsFragment.f297016q0;
                                if (chips != null) {
                                    List<com.avito.android.lib.design.chips.h> list2 = cVar2.f6996d;
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
                                com.avito.konveyor.adapter.d dVar3 = cpxLevelsFragment.f297010k0;
                                if (dVar3 == null) {
                                    dVar3 = null;
                                }
                                dVar3.l(list, null);
                                cpxLevelsFragment.g5(aVar2 != null ? aVar2.f4597d : null);
                                TextView textView4 = cpxLevelsFragment.f297019t0;
                                if (textView4 != null) {
                                    com.avito.android.util.text.j.a(textView4, aVar2 != null ? aVar2.f4598e : null, null);
                                }
                                View view3 = cpxLevelsFragment.f297021v0;
                                if (view3 != null) {
                                    D6.w(view3);
                                }
                                xZ.e eVar3 = cpxLevelsFragment.f297020u0;
                                if (eVar3 != null) {
                                    eVar3.b();
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9051a(CpxLevelsFragment cpxLevelsFragment, Continuation<? super C9051a> continuation) {
                    super(2, continuation);
                    this.f297029r = cpxLevelsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C9051a(this.f297029r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9051a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f297028q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CpxLevelsFragment.f297006w0;
                        CpxLevelsFragment cpxLevelsFragment = this.f297029r;
                        n2<HB0.c> state = cpxLevelsFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = cpxLevelsFragment.f297008i0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9052a c9052a = new C9052a(1, cpxLevelsFragment, CpxLevelsFragment.class, "render", "render(Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsState;)V", 0);
                        this.f297028q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9052a, this) == coroutine_suspended) {
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

            /* compiled from: CpxLevelsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.levels.CpxLevelsFragment$onCreateDialog$1$1$2", f = "CpxLevelsFragment.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f297030q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CpxLevelsFragment f297031r;

                /* compiled from: CpxLevelsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.levels.CpxLevelsFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9053a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CpxLevelsFragment f297032b;

                    public C9053a(CpxLevelsFragment cpxLevelsFragment) {
                        this.f297032b = cpxLevelsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        HB0.b bVar = (HB0.b) obj;
                        a aVar = CpxLevelsFragment.f297006w0;
                        CpxLevelsFragment cpxLevelsFragment = this.f297032b;
                        if (bVar instanceof b.C0398b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = cpxLevelsFragment.f297012m0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((b.C0398b) bVar).f6991a, "cpx_levels_request_key", null, 4);
                        } else if (bVar instanceof b.a) {
                            String tag = cpxLevelsFragment.getTag();
                            if (tag == null) {
                                tag = "";
                            }
                            cpxLevelsFragment.getParentFragmentManager().o0(C22777e.b(new Q("tariff_cpx_info_advance_key_deeplink", ((b.a) bVar).f6990a)), tag);
                            cpxLevelsFragment.dismiss();
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
                        return new C42801a(2, this.f297032b, CpxLevelsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CpxLevelsFragment cpxLevelsFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f297031r = cpxLevelsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f297031r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f297030q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CpxLevelsFragment.f297006w0;
                        CpxLevelsFragment cpxLevelsFragment = this.f297031r;
                        InterfaceC43160i<HB0.b> events = cpxLevelsFragment.f5().getEvents();
                        C9053a c9053a = new C9053a(cpxLevelsFragment);
                        this.f297030q = 1;
                        if (events.collect(c9053a, this) == coroutine_suspended) {
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
            public a(CpxLevelsFragment cpxLevelsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f297027r = cpxLevelsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f297027r, continuation);
                aVar.f297026q = obj;
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
                T t12 = (T) this.f297026q;
                CpxLevelsFragment cpxLevelsFragment = this.f297027r;
                C43259k.d(t12, null, null, new C9051a(cpxLevelsFragment, null), 3);
                C43259k.d(t12, null, null, new b(cpxLevelsFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return CpxLevelsFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f297024q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                CpxLevelsFragment cpxLevelsFragment = CpxLevelsFragment.this;
                a aVar = new a(cpxLevelsFragment, null);
                this.f297024q = 1;
                if (C23056p0.b(cpxLevelsFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CpxLevelsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            final CpxLevelsFragment cpxLevelsFragment = (CpxLevelsFragment) this.receiver;
            a aVar = CpxLevelsFragment.f297006w0;
            cpxLevelsFragment.getClass();
            final int i12 = 0;
            cpxLevelsFragment.f297020u0 = new xZ.e((ViewGroup) view2.findViewById(R.id.cpx_levels_container), new View.OnClickListener() { // from class: com.avito.android.tariff.cpx.levels.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    CpxLevelsFragment cpxLevelsFragment2 = cpxLevelsFragment;
                    switch (i12) {
                        case 0:
                            CpxLevelsFragment.a aVar2 = CpxLevelsFragment.f297006w0;
                            cpxLevelsFragment2.f5().accept(a.f.f6989a);
                            break;
                        default:
                            CpxLevelsFragment.a aVar3 = CpxLevelsFragment.f297006w0;
                            cpxLevelsFragment2.f5().accept(a.b.f6985a);
                            break;
                    }
                }
            }, null, 4, null);
            cpxLevelsFragment.f297014o0 = (TextView) view2.findViewById(R.id.cpx_levels_title);
            TextView textView = (TextView) view2.findViewById(R.id.cpx_levels_description);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            cpxLevelsFragment.f297015p0 = textView;
            Chips chips = (Chips) view2.findViewById(R.id.cpx_levels_chips);
            chips.setChipsSelectedListener(new com.avito.android.tariff.cpx.levels.b(cpxLevelsFragment));
            cpxLevelsFragment.f297016q0 = chips;
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.cpx_levels_list);
            com.avito.konveyor.adapter.d dVar = cpxLevelsFragment.f297010k0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            recyclerView.setItemAnimator(null);
            recyclerView.l(new IB0.a(), -1);
            cpxLevelsFragment.f297017r0 = recyclerView;
            Button button = (Button) view2.findViewById(R.id.cpx_levels_button);
            final int i13 = 1;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff.cpx.levels.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    CpxLevelsFragment cpxLevelsFragment2 = cpxLevelsFragment;
                    switch (i13) {
                        case 0:
                            CpxLevelsFragment.a aVar2 = CpxLevelsFragment.f297006w0;
                            cpxLevelsFragment2.f5().accept(a.f.f6989a);
                            break;
                        default:
                            CpxLevelsFragment.a aVar3 = CpxLevelsFragment.f297006w0;
                            cpxLevelsFragment2.f5().accept(a.b.f6985a);
                            break;
                    }
                }
            });
            cpxLevelsFragment.f297018s0 = button;
            ((ViewGroup) view2.findViewById(R.id.cpx_levels_bottom_block)).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(cpxLevelsFragment, 19));
            cpxLevelsFragment.f297019t0 = (TextView) view2.findViewById(R.id.cpx_levels_extra_info);
            cpxLevelsFragment.f297021v0 = view2.findViewById(R.id.cpx_levels_shimmer);
            return G0.f406611a;
        }
    }

    /* compiled from: CpxLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CpxLevelsFragment.f297006w0;
            CpxLevelsFragment.this.f5().accept(new a.C0397a(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f297034l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f297034l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f297034l);
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
            return CpxLevelsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f297036l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f297036l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f297036l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f297037l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f297037l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f297037l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f297038l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f297038l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f297038l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/levels/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.tariff.cpx.levels.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.levels.e invoke() {
            com.avito.android.tariff.cpx.levels.f fVar = CpxLevelsFragment.this.f297007h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.tariff.cpx.levels.e) fVar.get();
        }
    }

    public CpxLevelsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f297013n0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.levels.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @Y61.k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 17);
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
        com.avito.android.tariff.cpx.levels.di.l.a().a((WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), s.b(this), com.avito.android.mnz_common.extensions.d.c(this, "remote_context"), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f297008i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.tariff.cpx.levels.e f5() {
        return (com.avito.android.tariff.cpx.levels.e) this.f297013n0.getValue();
    }

    public final void g5(ButtonAction buttonAction) throws Resources.NotFoundException {
        Boolean boolIsEnabled;
        String style;
        Context context;
        Button button = this.f297018s0;
        if (button != null) {
            if (buttonAction != null && (style = buttonAction.getStyle()) != null) {
                int iD2 = com.avito.android.lib.util.f.d(style);
                Dialog dialog = getDialog();
                if (dialog != null && (context = dialog.getContext()) != null) {
                    button.setAppearance(C35835l0.j(iD2, context));
                }
            }
            button.setEnabled((buttonAction == null || (boolIsEnabled = buttonAction.isEnabled()) == null) ? true : boolIsEnabled.booleanValue());
            com.avito.android.lib.design.button.b.a(button, buttonAction != null ? buttonAction.getTitle() : null, false);
            button.setLoading(false);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f297008i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.cpx_levels_fragment, true, new d(1, this, CpxLevelsFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f297008i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
