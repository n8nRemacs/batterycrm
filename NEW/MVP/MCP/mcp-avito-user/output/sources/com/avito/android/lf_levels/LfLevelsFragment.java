package com.avito.android.lf_levels;

import Cd.C13243a;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lf_levels.LfLevelsFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
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
import tR.C48597a;
import wR.InterfaceC49553a;
import wR.b;
import z1.AbstractC50339a;

/* compiled from: LfLevelsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lf_levels/LfLevelsFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LfLevelsFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f175291w0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.lf_levels.e f175292h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f175293i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f175294j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f175295k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f175296l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final O0 f175297m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public AR.a f175298n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public TextView f175299o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public TextView f175300p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public Chips f175301q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public RecyclerView f175302r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public Button f175303s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public TextView f175304t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public xZ.e f175305u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public View f175306v0;

    /* compiled from: LfLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lf_levels/LfLevelsFragment$a;", "", "<init>", "()V", "", "KEY_REMOTE_CONTEXT", "Ljava/lang/String;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: LfLevelsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lf_levels.LfLevelsFragment$a$a, reason: collision with other inner class name */
        public static final class C5168a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f175307l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5168a(String str) {
                super(1);
                this.f175307l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("key_remote_context", this.f175307l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static LfLevelsFragment a(@Y61.k String str) {
            LfLevelsFragment lfLevelsFragment = new LfLevelsFragment();
            C35966w1.a(lfLevelsFragment, -1, new C5168a(str));
            return lfLevelsFragment;
        }

        public a() {
        }
    }

    /* compiled from: LfLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lf_levels/LfLevelsFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) LfLevelsFragment.this.requireDialog().findViewById(R.id.lf_levels_container);
        }
    }

    /* compiled from: LfLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lf_levels.LfLevelsFragment$onCreateDialog$1", f = "LfLevelsFragment.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f175309q;

        /* compiled from: LfLevelsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.lf_levels.LfLevelsFragment$onCreateDialog$1$1", f = "LfLevelsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f175311q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ LfLevelsFragment f175312r;

            /* compiled from: LfLevelsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.lf_levels.LfLevelsFragment$onCreateDialog$1$1$1", f = "LfLevelsFragment.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.lf_levels.LfLevelsFragment$c$a$a, reason: collision with other inner class name */
            public static final class C5169a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f175313q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ LfLevelsFragment f175314r;

                /* compiled from: LfLevelsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.lf_levels.LfLevelsFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C5170a extends H implements Y41.l<wR.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(wR.c cVar) throws Resources.NotFoundException {
                        wR.c cVar2 = cVar;
                        LfLevelsFragment lfLevelsFragment = (LfLevelsFragment) this.receiver;
                        a aVar = LfLevelsFragment.f175291w0;
                        lfLevelsFragment.getClass();
                        String str = cVar2.f441452h;
                        if (str != null) {
                            Button button = lfLevelsFragment.f175303s0;
                            if (button != null) {
                                D6.w(button);
                            }
                            xZ.e eVar = lfLevelsFragment.f175305u0;
                            if (eVar != null) {
                                eVar.d(str);
                            }
                        } else if (cVar2.f441453i) {
                            Button button2 = lfLevelsFragment.f175303s0;
                            if (button2 != null) {
                                D6.w(button2);
                            }
                            xZ.e eVar2 = lfLevelsFragment.f175305u0;
                            if (eVar2 != null) {
                                eVar2.c();
                            }
                        } else if (cVar2.f441454j) {
                            Button button3 = lfLevelsFragment.f175303s0;
                            if (button3 != null) {
                                button3.setLoading(true);
                            }
                        } else {
                            com.avito.konveyor.adapter.d dVar = lfLevelsFragment.f175294j0;
                            if (dVar == null) {
                                dVar = null;
                            }
                            int count = dVar.f338497e.getCount();
                            List<com.avito.conveyor_item.a> list = cVar2.f441450f;
                            C48597a c48597a = cVar2.f441449e;
                            if (count > 0) {
                                com.avito.konveyor.adapter.d dVar2 = lfLevelsFragment.f175294j0;
                                if (dVar2 == null) {
                                    dVar2 = null;
                                }
                                dVar2.l(list, null);
                                lfLevelsFragment.g5(c48597a != null ? c48597a.f439254d : null);
                                TextView textView = lfLevelsFragment.f175304t0;
                                if (textView != null) {
                                    AttributedText attributedText = c48597a != null ? c48597a.f439255e : null;
                                    com.avito.android.util.text.a aVar2 = lfLevelsFragment.f175296l0;
                                    com.avito.android.util.text.j.a(textView, attributedText, aVar2 != null ? aVar2 : null);
                                }
                            } else {
                                TextView textView2 = lfLevelsFragment.f175299o0;
                                if (textView2 != null) {
                                    textView2.setText(cVar2.f441446b);
                                }
                                TextView textView3 = lfLevelsFragment.f175300p0;
                                AttributedText attributedText2 = cVar2.f441447c;
                                if (textView3 != null) {
                                    com.avito.android.util.text.a aVar3 = lfLevelsFragment.f175296l0;
                                    if (aVar3 == null) {
                                        aVar3 = null;
                                    }
                                    com.avito.android.util.text.j.a(textView3, attributedText2, aVar3);
                                }
                                if (attributedText2 != null) {
                                    attributedText2.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(lfLevelsFragment, 15));
                                }
                                Chips chips = lfLevelsFragment.f175301q0;
                                if (chips != null) {
                                    List<com.avito.android.lib.design.chips.h> list2 = cVar2.f441448d;
                                    if (list2.size() == 1) {
                                        D6.w(lfLevelsFragment.f175301q0);
                                    } else {
                                        chips.setData(list2);
                                        if (c48597a != null) {
                                            chips.q(c48597a, true);
                                        }
                                    }
                                }
                                com.avito.konveyor.adapter.d dVar3 = lfLevelsFragment.f175294j0;
                                if (dVar3 == null) {
                                    dVar3 = null;
                                }
                                dVar3.l(list, null);
                                lfLevelsFragment.g5(c48597a != null ? c48597a.f439254d : null);
                                Button button4 = lfLevelsFragment.f175303s0;
                                if (button4 != null) {
                                    D6.H(button4);
                                }
                                TextView textView4 = lfLevelsFragment.f175304t0;
                                if (textView4 != null) {
                                    AttributedText attributedText3 = c48597a != null ? c48597a.f439255e : null;
                                    com.avito.android.util.text.a aVar4 = lfLevelsFragment.f175296l0;
                                    com.avito.android.util.text.j.a(textView4, attributedText3, aVar4 != null ? aVar4 : null);
                                }
                                xZ.e eVar3 = lfLevelsFragment.f175305u0;
                                if (eVar3 != null) {
                                    eVar3.b();
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5169a(LfLevelsFragment lfLevelsFragment, Continuation<? super C5169a> continuation) {
                    super(2, continuation);
                    this.f175314r = lfLevelsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5169a(this.f175314r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5169a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f175313q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = LfLevelsFragment.f175291w0;
                        LfLevelsFragment lfLevelsFragment = this.f175314r;
                        n2<wR.c> state = lfLevelsFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = lfLevelsFragment.f175293i0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C5170a c5170a = new C5170a(1, lfLevelsFragment, LfLevelsFragment.class, "render", "render(Lcom/avito/android/lf_levels/mvi/entity/LfLevelsState;)V", 0);
                        this.f175313q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5170a, this) == coroutine_suspended) {
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

            /* compiled from: LfLevelsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.lf_levels.LfLevelsFragment$onCreateDialog$1$1$2", f = "LfLevelsFragment.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f175315q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ LfLevelsFragment f175316r;

                /* compiled from: LfLevelsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.lf_levels.LfLevelsFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C5171a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LfLevelsFragment f175317b;

                    public C5171a(LfLevelsFragment lfLevelsFragment) {
                        this.f175317b = lfLevelsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        wR.b bVar = (wR.b) obj;
                        a aVar = LfLevelsFragment.f175291w0;
                        LfLevelsFragment lfLevelsFragment = this.f175317b;
                        if (bVar instanceof b.a) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = lfLevelsFragment.f175295k0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((b.a) bVar).f441443a, null, null, 6);
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
                        return new C42801a(2, this.f175317b, LfLevelsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/lf_levels/mvi/entity/LfLevelsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(LfLevelsFragment lfLevelsFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f175316r = lfLevelsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f175316r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f175315q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = LfLevelsFragment.f175291w0;
                        LfLevelsFragment lfLevelsFragment = this.f175316r;
                        InterfaceC43160i<wR.b> events = lfLevelsFragment.f5().getEvents();
                        C5171a c5171a = new C5171a(lfLevelsFragment);
                        this.f175315q = 1;
                        if (events.collect(c5171a, this) == coroutine_suspended) {
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
            public a(LfLevelsFragment lfLevelsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f175312r = lfLevelsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f175312r, continuation);
                aVar.f175311q = obj;
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
                T t12 = (T) this.f175311q;
                LfLevelsFragment lfLevelsFragment = this.f175312r;
                C43259k.d(t12, null, null, new C5169a(lfLevelsFragment, null), 3);
                C43259k.d(t12, null, null, new b(lfLevelsFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return LfLevelsFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f175309q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                LfLevelsFragment lfLevelsFragment = LfLevelsFragment.this;
                a aVar = new a(lfLevelsFragment, null);
                this.f175309q = 1;
                if (C23056p0.b(lfLevelsFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LfLevelsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            final LfLevelsFragment lfLevelsFragment = (LfLevelsFragment) this.receiver;
            a aVar = LfLevelsFragment.f175291w0;
            lfLevelsFragment.getClass();
            lfLevelsFragment.f175306v0 = view2.findViewById(R.id.lf_levels_shimmer);
            final int i12 = 0;
            lfLevelsFragment.f175305u0 = new xZ.e((ViewGroup) view2.findViewById(R.id.lf_levels_container), new View.OnClickListener() { // from class: com.avito.android.lf_levels.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    LfLevelsFragment lfLevelsFragment2 = lfLevelsFragment;
                    switch (i12) {
                        case 0:
                            LfLevelsFragment.a aVar2 = LfLevelsFragment.f175291w0;
                            lfLevelsFragment2.f5().accept(InterfaceC49553a.f.f441442a);
                            break;
                        default:
                            LfLevelsFragment.a aVar3 = LfLevelsFragment.f175291w0;
                            lfLevelsFragment2.f5().accept(InterfaceC49553a.b.f441438a);
                            break;
                    }
                }
            }, lfLevelsFragment.f175306v0);
            lfLevelsFragment.f175299o0 = (TextView) view2.findViewById(R.id.lf_levels_title);
            lfLevelsFragment.f175300p0 = (TextView) view2.findViewById(R.id.lf_levels_description);
            Chips chips = (Chips) view2.findViewById(R.id.lf_levels_chips);
            chips.setChipsSelectedListener(new com.avito.android.lf_levels.b(lfLevelsFragment));
            lfLevelsFragment.f175301q0 = chips;
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.lf_levels_list);
            com.avito.konveyor.adapter.d dVar = lfLevelsFragment.f175294j0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            recyclerView.setItemAnimator(null);
            recyclerView.l(new AR.b(), -1);
            lfLevelsFragment.f175302r0 = recyclerView;
            Button button = (Button) view2.findViewById(R.id.lf_levels_button);
            final int i13 = 1;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.lf_levels.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    LfLevelsFragment lfLevelsFragment2 = lfLevelsFragment;
                    switch (i13) {
                        case 0:
                            LfLevelsFragment.a aVar2 = LfLevelsFragment.f175291w0;
                            lfLevelsFragment2.f5().accept(InterfaceC49553a.f.f441442a);
                            break;
                        default:
                            LfLevelsFragment.a aVar3 = LfLevelsFragment.f175291w0;
                            lfLevelsFragment2.f5().accept(InterfaceC49553a.b.f441438a);
                            break;
                    }
                }
            });
            lfLevelsFragment.f175303s0 = button;
            ((ViewGroup) view2.findViewById(R.id.lf_levels_bottom_block)).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(lfLevelsFragment, 12));
            lfLevelsFragment.f175304t0 = (TextView) view2.findViewById(R.id.lf_levels_extra_info);
            return G0.f406611a;
        }
    }

    /* compiled from: LfLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = LfLevelsFragment.f175291w0;
            LfLevelsFragment.this.f5().accept(new InterfaceC49553a.C12819a(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f175319l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f175319l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f175319l);
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
            return LfLevelsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f175321l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f175321l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f175321l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f175322l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f175322l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f175322l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f175323l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f175323l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f175323l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LfLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lf_levels/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/lf_levels/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.lf_levels.d> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.lf_levels.d invoke() {
            com.avito.android.lf_levels.e eVar = LfLevelsFragment.this.f175292h0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.lf_levels.d) eVar.get();
        }
    }

    public LfLevelsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f175297m0 = new O0(m0.f406844a.b(com.avito.android.lf_levels.d.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @Y61.k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 11);
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
        com.avito.android.lf_levels.di.a.a().a((com.avito.android.lf_levels.di.c) C29972i.a(C29972i.b(this), com.avito.android.lf_levels.di.c.class), cv.c.b(this), s.b(this), com.avito.android.mnz_common.extensions.d.c(this, "key_remote_context"), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f175293i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.lf_levels.d f5() {
        return (com.avito.android.lf_levels.d) this.f175297m0.getValue();
    }

    public final void g5(ButtonAction buttonAction) throws Resources.NotFoundException {
        Boolean boolIsEnabled;
        String style;
        Context context;
        Button button = this.f175303s0;
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
        ScreenPerformanceTracker screenPerformanceTracker = this.f175293i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.lf_levels_fragment, true, new d(1, this, LfLevelsFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f175293i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
