package com.avito.android.cv_actualization.view.phone_input;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tt.AbstractC48714b;
import ut.C49108a;

/* compiled from: JsxCvActualizationPhoneInputFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment$setupObservers$2", f = "JsxCvActualizationPhoneInputFragment.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131256q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131257r;

    /* compiled from: JsxCvActualizationPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment$setupObservers$2$1", f = "JsxCvActualizationPhoneInputFragment.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f131258q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131259r;

        /* compiled from: JsxCvActualizationPhoneInputFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cv_actualization.view.phone_input.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3910a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131260b;

            public C3910a(JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment) {
                this.f131260b = jsxCvActualizationPhoneInputFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                AbstractC48714b abstractC48714b = (AbstractC48714b) obj;
                JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
                JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131260b;
                boolean zF2 = L.f(abstractC48714b, AbstractC48714b.a.f439619a);
                InterfaceC42726C interfaceC42726C = jsxCvActualizationPhoneInputFragment.f131238w0;
                if (zF2) {
                    ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).finish();
                } else if (abstractC48714b instanceof AbstractC48714b.C12690b) {
                    AbstractC48714b.C12690b c12690b = (AbstractC48714b.C12690b) abstractC48714b;
                    ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).X0(c12690b.f439620a, c12690b.f439621b);
                } else if (abstractC48714b instanceof AbstractC48714b.c) {
                    String str = ((AbstractC48714b.c) abstractC48714b).f439622a;
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    View view = jsxCvActualizationPhoneInputFragment.f131231p0;
                    if (view == null) {
                        view = null;
                    }
                    com.avito.android.component.toast.c.b(cVar, view, com.avito.android.printable_text.b.f(str), null, null, null, null, 0, null, null, false, false, null, null, 4094);
                } else {
                    if (!L.f(abstractC48714b, AbstractC48714b.d.f439623a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).a1();
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
                return new C42801a(2, this.f131260b, JsxCvActualizationPhoneInputFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f131259r = jsxCvActualizationPhoneInputFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f131259r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f131258q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
                JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131259r;
                C49108a c49108aQ5 = jsxCvActualizationPhoneInputFragment.q5();
                C3910a c3910a = new C3910a(jsxCvActualizationPhoneInputFragment);
                this.f131258q = 1;
                if (c49108aQ5.ke(c3910a, this) == coroutine_suspended) {
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
    public d(JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f131257r = jsxCvActualizationPhoneInputFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f131257r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f131256q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131257r;
            a aVar = new a(jsxCvActualizationPhoneInputFragment, null);
            this.f131256q = 1;
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
