package com.avito.android.cv_actualization.view.phone_input;

import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* compiled from: JsxCvActualizationPhoneInputFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment$setupObservers$1", f = "JsxCvActualizationPhoneInputFragment.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131252q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131253r;

    /* compiled from: JsxCvActualizationPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment$setupObservers$1$1", f = "JsxCvActualizationPhoneInputFragment.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f131254q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131255r;

        /* compiled from: JsxCvActualizationPhoneInputFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cv_actualization.view.phone_input.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3909a extends H implements l<tt.c, G0> {
            @Override // Y41.l
            public final G0 invoke(tt.c cVar) {
                G0 g02;
                tt.c cVar2 = cVar;
                JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = (JsxCvActualizationPhoneInputFragment) this.receiver;
                JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
                jsxCvActualizationPhoneInputFragment.getClass();
                PrintableText printableText = cVar2.f439624b;
                if (printableText != null) {
                    ComponentContainer componentContainer = jsxCvActualizationPhoneInputFragment.f131233r0;
                    if (componentContainer == null) {
                        componentContainer = null;
                    }
                    ComponentContainer.n(componentContainer, printableText.k0(jsxCvActualizationPhoneInputFragment.requireContext()), 2);
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    ComponentContainer componentContainer2 = jsxCvActualizationPhoneInputFragment.f131233r0;
                    if (componentContainer2 == null) {
                        componentContainer2 = null;
                    }
                    componentContainer2.k();
                }
                Boolean bool = cVar2.f439625c;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        Input input = jsxCvActualizationPhoneInputFragment.f131234s0;
                        if (input == null) {
                            input = null;
                        }
                        input.v();
                        Input input2 = jsxCvActualizationPhoneInputFragment.f131234s0;
                        if (input2 == null) {
                            input2 = null;
                        }
                        input2.q();
                    } else {
                        View view = jsxCvActualizationPhoneInputFragment.f131231p0;
                        if (view == null) {
                            view = null;
                        }
                        K2.d(view, true);
                    }
                }
                if (cVar2.f439626d) {
                    View view2 = jsxCvActualizationPhoneInputFragment.f131236u0;
                    D6.H(view2 != null ? view2 : null);
                } else {
                    View view3 = jsxCvActualizationPhoneInputFragment.f131236u0;
                    D6.w(view3 != null ? view3 : null);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f131255r = jsxCvActualizationPhoneInputFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new a(this.f131255r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f131254q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
                JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131255r;
                n2<tt.c> state = jsxCvActualizationPhoneInputFragment.q5().getState();
                ScreenPerformanceTracker screenPerformanceTracker = jsxCvActualizationPhoneInputFragment.f131230o0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C3909a c3909a = new C3909a(1, jsxCvActualizationPhoneInputFragment, JsxCvActualizationPhoneInputFragment.class, "renderState", "renderState(Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputState;)V", 0);
                this.f131254q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3909a, this) == coroutine_suspended) {
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
    public c(JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f131253r = jsxCvActualizationPhoneInputFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new c(this.f131253r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f131252q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131253r;
            a aVar = new a(jsxCvActualizationPhoneInputFragment, null);
            this.f131252q = 1;
            if (C23056p0.b(jsxCvActualizationPhoneInputFragment, state, aVar, this) == coroutine_suspended) {
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
