package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrInsuranceInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_insurance.screen.mvi.StrInsuranceInteractor$invoke$3", f = "StrInsuranceInteractor.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class p extends SuspendLambda implements Y41.q<InterfaceC43172j<? super P2<? super G0>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f288772q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f288773r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f288774s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f288775t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation<? super p> continuation) {
        super(3, continuation);
        this.f288775t = qVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super P2<? super G0>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        p pVar = new p(this.f288775t, continuation);
        pVar.f288773r = interfaceC43172j;
        pVar.f288774s = th2;
        return pVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f288772q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f288773r;
            P2.a aVar = new P2.a(this.f288775t.f288778c.a(this.f288774s));
            this.f288773r = null;
            this.f288772q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
