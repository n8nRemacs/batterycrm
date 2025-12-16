package com.avito.android.code_check.code_confirm;

import Jo.C14226c;
import Jo.C14227d;
import Jo.InterfaceC14224a;
import Jo.InterfaceC14225b;
import Ko.InterfaceC14336b;
import Ro.InterfaceC15066a;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.avito.android.code_check.phone_request.mvi.entity.PhoneRequestInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43221z1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: CodeConfirmViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/code_confirm/A;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "LJo/d;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A extends M0 implements com.avito.android.arch.mvi.android.k<Object, C14227d, Object> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final R0 f118616E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> f118617J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC14224a, CodeConfirmInternalAction, C14226c, InterfaceC14225b> f118618K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final n2<C14227d> f118619L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m f118620M;

    /* compiled from: CodeConfirmViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.code_confirm.CodeConfirmViewModel$accept$1", f = "CodeConfirmViewModel.kt", i = {}, l = {54, 55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f118621q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f118622r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ A f118623s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, A a12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118622r = obj;
            this.f118623s = a12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f118622r, this.f118623s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f118621q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f118622r;
                boolean z12 = obj2 instanceof InterfaceC15066a;
                A a12 = this.f118623s;
                if (z12) {
                    com.avito.android.arch.mvi.c<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> cVar = a12.f118617J;
                    this.f118621q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC14224a) {
                    com.avito.android.arch.mvi.c<InterfaceC14224a, CodeConfirmInternalAction, C14226c, InterfaceC14225b> cVar2 = a12.f118618K;
                    this.f118621q = 2;
                    if (cVar2.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CodeConfirmViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.r<Ro.c, C14226c, InterfaceC14336b, Continuation<? super C14227d>, Object>, SuspendFunction {
        @Override // Y41.r
        public final Object invoke(Ro.c cVar, C14226c c14226c, InterfaceC14336b interfaceC14336b, Continuation<? super C14227d> continuation) {
            ((C) this.receiver).getClass();
            return C.a(cVar, c14226c, interfaceC14336b);
        }
    }

    @Inject
    public A(@Y61.k com.avito.android.code_check.phone_request.mvi.k kVar, @Y61.k com.avito.android.code_check.code_confirm.mvi.k kVar2, @Y61.k com.avito.android.code_check.code_confirm.timer.mvi.e eVar, @Y61.k C c12, @Y61.k R0 r02) {
        this.f118616E = r02;
        com.avito.android.arch.mvi.c<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> cVarB = com.avito.android.arch.mvi.q.b(kVar, null, null, 3);
        this.f118617J = cVarB;
        com.avito.android.arch.mvi.c cVarB2 = com.avito.android.arch.mvi.q.b(eVar, null, null, 3);
        com.avito.android.arch.mvi.c<InterfaceC14224a, CodeConfirmInternalAction, C14226c, InterfaceC14225b> cVarB3 = com.avito.android.arch.mvi.q.b(kVar2, null, null, 3);
        this.f118618K = cVarB3;
        C43221z1 c43221z1K = C43175k.k(cVarB, cVarB3, cVarB2, new b(4, c12, C.class, "mapToViewState", "mapToViewState(Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestState;Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmState;Lcom/avito/android/code_check/code_confirm/timer/mvi/entity/TimerState;)Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmViewState;", 4));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        Ro.c cVar = cVarB.f91929r.get();
        C14226c c14226c = cVarB3.f91929r.get();
        InterfaceC14336b interfaceC14336b = (InterfaceC14336b) cVarB2.f91929r.get();
        c12.getClass();
        this.f118619L = C43175k.U(c43221z1K, aVarA, i2Var, C.a(cVar, c14226c, interfaceC14336b));
        this.f118620M = C43175k.N(cVarB.f91928q, cVarB3.f91928q);
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(N0.a(this), this.f118616E.b(), null, new a(obj, this, null), 2);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return this.f118620M;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C14227d> getState() {
        return this.f118619L;
    }
}
