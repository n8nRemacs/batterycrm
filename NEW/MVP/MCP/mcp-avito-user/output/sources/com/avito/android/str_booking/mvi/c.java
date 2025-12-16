package com.avito.android.str_booking.mvi;

import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrBookingActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.mvi.StrBookingActor$handlePollingUpdates$1$3", f = "StrBookingActor.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrBookingInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f285732q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f285733r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f285734s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f285735t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Continuation<? super c> continuation) {
        super(3, continuation);
        this.f285735t = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        c cVar = new c(this.f285735t, continuation);
        cVar.f285733r = interfaceC43172j;
        cVar.f285734s = th2;
        return cVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f285732q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f285733r;
            this.f285735t.f285718a.c(new NonFatalErrorEvent("Observe StrBooking EventBus Event was failed", this.f285734s, null, null, 12, null));
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            this.f285733r = null;
            this.f285732q = 1;
            if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
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
