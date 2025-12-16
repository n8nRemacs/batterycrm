package com.avito.android.trx_promo_goods.screens.configure;

import MF0.c;
import MF0.e;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.mnz_common.extensions.i;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_goods.screens.configure.TrxPromoGoodsConfigureFragment;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import w50.InterfaceC49447a;

/* compiled from: TrxPromoGoodsConfigureFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.TrxPromoGoodsConfigureFragment$observeViewModel$1", f = "TrxPromoGoodsConfigureFragment.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f303363q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TrxPromoGoodsConfigureFragment f303364r;

    /* compiled from: TrxPromoGoodsConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.TrxPromoGoodsConfigureFragment$observeViewModel$1$1", f = "TrxPromoGoodsConfigureFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f303365q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TrxPromoGoodsConfigureFragment f303366r;

        /* compiled from: TrxPromoGoodsConfigureFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.TrxPromoGoodsConfigureFragment$observeViewModel$1$1$1", f = "TrxPromoGoodsConfigureFragment.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.trx_promo_goods.screens.configure.c$a$a, reason: collision with other inner class name */
        public static final class C9278a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f303367q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsConfigureFragment f303368r;

            /* compiled from: TrxPromoGoodsConfigureFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.trx_promo_goods.screens.configure.c$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C9279a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TrxPromoGoodsConfigureFragment f303369b;

                public C9279a(TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment) {
                    this.f303369b = trxPromoGoodsConfigureFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    MF0.c cVar = (MF0.c) obj;
                    TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                    TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303369b;
                    if (cVar instanceof c.C0669c) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = trxPromoGoodsConfigureFragment.f303341r0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        c.C0669c c0669c = (c.C0669c) cVar;
                        DeepLink deepLink = c0669c.f10507a;
                        Q q12 = new Q("trx_promo_goods_key_configure_apply_commission", c0669c.f10508b);
                        String str = c0669c.f10509c;
                        aVar2.r6(C22777e.b(q12, new Q("trx_promo_goods_key_configure_apply_date", str), new Q("trx_promo_goods_key_date_picker_start_date", str)), deepLink, "trx_promo_goods_request_key");
                    } else if (cVar instanceof c.a) {
                        TrxPromoGoodsConfigureFragment.d dVar = trxPromoGoodsConfigureFragment.f303335G0;
                        dVar.d(false);
                        ActivityC22955m activityC22955mL1 = trxPromoGoodsConfigureFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                        }
                        dVar.d(true);
                    } else if (cVar instanceof c.b) {
                        ((InterfaceC49447a) trxPromoGoodsConfigureFragment.requireActivity()).r1();
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
                    return new C42801a(2, this.f303369b, TrxPromoGoodsConfigureFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9278a(TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment, Continuation<? super C9278a> continuation) {
                super(2, continuation);
                this.f303368r = trxPromoGoodsConfigureFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C9278a(this.f303368r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C9278a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f303367q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                    TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303368r;
                    InterfaceC43160i<MF0.c> events = trxPromoGoodsConfigureFragment.q5().getEvents();
                    C9279a c9279a = new C9279a(trxPromoGoodsConfigureFragment);
                    this.f303367q = 1;
                    if (events.collect(c9279a, this) == coroutine_suspended) {
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

        /* compiled from: TrxPromoGoodsConfigureFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.TrxPromoGoodsConfigureFragment$observeViewModel$1$1$2", f = "TrxPromoGoodsConfigureFragment.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f303370q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsConfigureFragment f303371r;

            /* compiled from: TrxPromoGoodsConfigureFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMF0/d;", "it", "LMF0/e;", "invoke", "(LMF0/d;)LMF0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.trx_promo_goods.screens.configure.c$a$b$a, reason: collision with other inner class name */
            public static final class C9280a extends N implements Y41.l<MF0.d, MF0.e> {

                /* renamed from: l, reason: collision with root package name */
                public static final C9280a f303372l = new C9280a();

                public C9280a() {
                    super(1);
                }

                @Override // Y41.l
                public final MF0.e invoke(MF0.d dVar) {
                    return dVar.f10522l;
                }
            }

            /* compiled from: TrxPromoGoodsConfigureFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.trx_promo_goods.screens.configure.c$a$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C9281b extends H implements Y41.l<MF0.d, G0> {
                public final void f(@k MF0.d dVar) {
                    int i12 = 0;
                    TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = (TrxPromoGoodsConfigureFragment) this.receiver;
                    TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                    trxPromoGoodsConfigureFragment.getClass();
                    Toolbar toolbar = trxPromoGoodsConfigureFragment.f303346w0;
                    if (toolbar == null) {
                        toolbar = null;
                    }
                    MF0.e eVar = dVar.f10522l;
                    toolbar.setNavigationIcon(eVar.getF10534c());
                    if (eVar instanceof e.d) {
                        xZ.e eVar2 = trxPromoGoodsConfigureFragment.f303344u0;
                        if (eVar2 == null) {
                            eVar2 = null;
                        }
                        eVar2.c();
                        ViewGroup viewGroup = trxPromoGoodsConfigureFragment.f303329A0;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        D6.w(viewGroup);
                        ProgressBarRe23 progressBarRe23 = trxPromoGoodsConfigureFragment.f303347x0;
                        if (progressBarRe23 == null) {
                            progressBarRe23 = null;
                        }
                        D6.w(progressBarRe23);
                        Button button = trxPromoGoodsConfigureFragment.f303348y0;
                        D6.w(button != null ? button : null);
                        return;
                    }
                    if (eVar instanceof e.c) {
                        xZ.e eVar3 = trxPromoGoodsConfigureFragment.f303344u0;
                        if (eVar3 == null) {
                            eVar3 = null;
                        }
                        eVar3.d(((e.c) eVar).f10533e);
                        ViewGroup viewGroup2 = trxPromoGoodsConfigureFragment.f303329A0;
                        if (viewGroup2 == null) {
                            viewGroup2 = null;
                        }
                        D6.w(viewGroup2);
                        ProgressBarRe23 progressBarRe232 = trxPromoGoodsConfigureFragment.f303347x0;
                        if (progressBarRe232 == null) {
                            progressBarRe232 = null;
                        }
                        D6.w(progressBarRe232);
                        Button button2 = trxPromoGoodsConfigureFragment.f303348y0;
                        D6.w(button2 != null ? button2 : null);
                        return;
                    }
                    if (eVar instanceof e.b) {
                        xZ.e eVar4 = trxPromoGoodsConfigureFragment.f303344u0;
                        if (eVar4 == null) {
                            eVar4 = null;
                        }
                        eVar4.b();
                        Float progress = eVar.getF10535d().getProgress();
                        if (progress != null) {
                            float fFloatValue = progress.floatValue();
                            ProgressBarRe23 progressBarRe233 = trxPromoGoodsConfigureFragment.f303347x0;
                            if (progressBarRe233 == null) {
                                progressBarRe233 = null;
                            }
                            progressBarRe233.setProgress(fFloatValue);
                        }
                        ProgressBarRe23 progressBarRe234 = trxPromoGoodsConfigureFragment.f303347x0;
                        if (progressBarRe234 == null) {
                            progressBarRe234 = null;
                        }
                        D6.G(progressBarRe234, eVar.getF10535d().getProgress() != null);
                        Button button3 = trxPromoGoodsConfigureFragment.f303348y0;
                        if (button3 == null) {
                            button3 = null;
                        }
                        i.a(button3, eVar.getF10535d().getButton());
                        com.avito.konveyor.adapter.d dVar2 = trxPromoGoodsConfigureFragment.f303340q0;
                        if (dVar2 == null) {
                            dVar2 = null;
                        }
                        e.b bVar = (e.b) eVar;
                        dVar2.l(bVar.f10527e, new com.avito.android.trx_promo_goods.screens.configure.a(trxPromoGoodsConfigureFragment, i12));
                        ViewGroup viewGroup3 = trxPromoGoodsConfigureFragment.f303329A0;
                        if (viewGroup3 == null) {
                            viewGroup3 = null;
                        }
                        ButtonAction buttonAction = bVar.f10529g;
                        ButtonAction buttonAction2 = bVar.f10528f;
                        if (buttonAction2 == null && buttonAction == null) {
                            i12 = 8;
                        }
                        viewGroup3.setVisibility(i12);
                        Button button4 = trxPromoGoodsConfigureFragment.f303330B0;
                        if (button4 == null) {
                            button4 = null;
                        }
                        i.a(button4, buttonAction2);
                        Button button5 = trxPromoGoodsConfigureFragment.f303331C0;
                        if (button5 == null) {
                            button5 = null;
                        }
                        i.a(button5, buttonAction);
                        AttributedText attributedText = bVar.f10530h;
                        if (attributedText != null) {
                            attributedText.setOnDeepLinkClickListener(new d(trxPromoGoodsConfigureFragment.f303333E0));
                        }
                        TextView textView = trxPromoGoodsConfigureFragment.f303332D0;
                        if (textView == null) {
                            textView = null;
                        }
                        com.avito.android.util.text.a aVar2 = trxPromoGoodsConfigureFragment.f303343t0;
                        j.a(textView, attributedText, aVar2 != null ? aVar2 : null);
                    }
                }

                @Override // Y41.l
                public final /* bridge */ /* synthetic */ G0 invoke(MF0.d dVar) {
                    f(dVar);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f303371r = trxPromoGoodsConfigureFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f303371r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f303370q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                    TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303371r;
                    InterfaceC43160i interfaceC43160iS = C43175k.s(trxPromoGoodsConfigureFragment.q5().getState(), C9280a.f303372l);
                    ScreenPerformanceTracker screenPerformanceTracker = trxPromoGoodsConfigureFragment.f303339p0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C9281b c9281b = new C9281b(1, trxPromoGoodsConfigureFragment, TrxPromoGoodsConfigureFragment.class, "render", "render(Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureState;)V", 0);
                    this.f303370q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iS, screenPerformanceTracker, c9281b, this) == coroutine_suspended) {
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
        public a(TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f303366r = trxPromoGoodsConfigureFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f303366r, continuation);
            aVar.f303365q = obj;
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
            T t12 = (T) this.f303365q;
            TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303366r;
            C43259k.d(t12, null, null, new C9278a(trxPromoGoodsConfigureFragment, null), 3);
            C43259k.d(t12, null, null, new b(trxPromoGoodsConfigureFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f303364r = trxPromoGoodsConfigureFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f303364r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f303363q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303364r;
            a aVar = new a(trxPromoGoodsConfigureFragment, null);
            this.f303363q = 1;
            if (C23056p0.b(trxPromoGoodsConfigureFragment, state, aVar, this) == coroutine_suspended) {
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
