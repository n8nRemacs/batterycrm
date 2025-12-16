package com.avito.android.sx_address.new_address.mvi;

import com.avito.android.sx_address.new_address.mvi.B;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxNewAddressMviActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.new_address.mvi.SxNewAddressMviActor$handle$2", f = "SxNewAddressMviActor.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class n extends SuspendLambda implements Y41.q<InterfaceC43172j<? super B>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293813q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f293814r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f293815s;

    public n() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super B> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        n nVar = new n(3, continuation);
        nVar.f293814r = interfaceC43172j;
        nVar.f293815s = th2;
        return nVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293813q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f293814r;
            B.l lVar = new B.l(this.f293815s);
            this.f293814r = null;
            this.f293813q = 1;
            if (interfaceC43172j.emit(lVar, this) == coroutine_suspended) {
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
