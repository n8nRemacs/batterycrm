package com.avito.android.code_check.code_confirm.mvi;

import Jo.C14226c;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import hD.C40806a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CodeConfirmActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.code_check.code_confirm.mvi.CodeConfirmActor$modifyInput$1", f = "CodeConfirmActor.kt", i = {0}, l = {41, 44}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CodeConfirmInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f118698q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f118699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C14226c f118700s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f118701t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f118702u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C14226c c14226c, e eVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f118700s = c14226c;
        this.f118701t = eVar;
        this.f118702u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f118700s, this.f118701t, this.f118702u, continuation);
        bVar.f118699r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CodeConfirmInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f118698q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f118699r;
            if (this.f118700s.f9148b != null) {
                CodeConfirmInternalAction.ClearValidationError clearValidationError = CodeConfirmInternalAction.ClearValidationError.f118713b;
                this.f118699r = interfaceC43172j;
                this.f118698q = 1;
                if (interfaceC43172j.emit(clearValidationError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f118699r;
            C42729a0.b(obj);
        }
        e eVar = this.f118701t;
        Integer numA = eVar.f118711b.G5().a();
        if (numA != null) {
            int iIntValue = numA.intValue();
            String str = this.f118702u;
            if (str.length() >= iIntValue) {
                C40806a c40806a = eVar.f118712c;
                c40806a.getClass();
                kotlin.reflect.n<Object> nVar = C40806a.f397105l[1];
                if (((Boolean) c40806a.f397107c.a().invoke()).booleanValue()) {
                    C43152f0 c43152f0C = eVar.c(str);
                    this.f118699r = null;
                    this.f118698q = 2;
                    if (C43175k.u(this, c43152f0C, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
        return G0.f406611a;
    }
}
