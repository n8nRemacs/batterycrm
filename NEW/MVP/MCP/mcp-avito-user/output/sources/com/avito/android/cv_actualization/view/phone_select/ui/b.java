package com.avito.android.cv_actualization.view.phone_select.ui;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment;
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
import vt.AbstractC49379b;
import wt.C49680a;

/* compiled from: JsxCvActualizationPhoneSelectFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment$setupObservers$2", f = "JsxCvActualizationPhoneSelectFragment.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131398q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JsxCvActualizationPhoneSelectFragment f131399r;

    /* compiled from: JsxCvActualizationPhoneSelectFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment$setupObservers$2$1", f = "JsxCvActualizationPhoneSelectFragment.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f131400q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JsxCvActualizationPhoneSelectFragment f131401r;

        /* compiled from: JsxCvActualizationPhoneSelectFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cv_actualization.view.phone_select.ui.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3918a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JsxCvActualizationPhoneSelectFragment f131402b;

            public C3918a(JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment) {
                this.f131402b = jsxCvActualizationPhoneSelectFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                AbstractC49379b abstractC49379b = (AbstractC49379b) obj;
                JsxCvActualizationPhoneSelectFragment.a aVar = JsxCvActualizationPhoneSelectFragment.f131373y0;
                boolean z12 = abstractC49379b instanceof AbstractC49379b.c;
                InterfaceC42726C interfaceC42726C = this.f131402b.f131382u0;
                if (z12) {
                    ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).c(!((AbstractC49379b.c) abstractC49379b).f441031a);
                } else if (L.f(abstractC49379b, AbstractC49379b.a.f441029a)) {
                    ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).finish();
                } else {
                    if (!(abstractC49379b instanceof AbstractC49379b.C12797b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).o0(((AbstractC49379b.C12797b) abstractC49379b).f441030a);
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
                return new C42801a(2, this.f131402b, JsxCvActualizationPhoneSelectFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f131401r = jsxCvActualizationPhoneSelectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f131401r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f131400q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment = this.f131401r;
                C49680a c49680a = (C49680a) jsxCvActualizationPhoneSelectFragment.f131381t0.getValue();
                C3918a c3918a = new C3918a(jsxCvActualizationPhoneSelectFragment);
                this.f131400q = 1;
                if (c49680a.ke(c3918a, this) == coroutine_suspended) {
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
    public b(JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f131399r = jsxCvActualizationPhoneSelectFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f131399r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f131398q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment = this.f131399r;
            a aVar = new a(jsxCvActualizationPhoneSelectFragment, null);
            this.f131398q = 1;
            if (C23056p0.b(jsxCvActualizationPhoneSelectFragment, state, aVar, this) == coroutine_suspended) {
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
