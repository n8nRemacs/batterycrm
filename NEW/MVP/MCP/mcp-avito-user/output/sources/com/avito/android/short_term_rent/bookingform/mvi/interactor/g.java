package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormApiInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.interactor.BookingFormApiInteractorImpl$reLoadFormContent$2", f = "BookingFormApiInteractor.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BookingFormInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281895q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f281896r;

    public g() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        g gVar = new g(3, continuation);
        gVar.f281896r = interfaceC43172j;
        return gVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281895q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f281896r;
            BookingFormInternalAction.Progress.Hide hide = BookingFormInternalAction.Progress.Hide.f281808b;
            this.f281895q = 1;
            if (interfaceC43172j.emit(hide, this) == coroutine_suspended) {
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
