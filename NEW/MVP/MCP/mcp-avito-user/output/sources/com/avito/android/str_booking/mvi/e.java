package com.avito.android.str_booking.mvi;

import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.mvi.StrBookingActor$handlePollingUpdates$lambda$2$$inlined$flatMapLatest$1", f = "StrBookingActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrBookingInternalAction>, com.avito.android.str_booking.domain.polling.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f285743q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f285744r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f285745s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f285746t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, Continuation continuation) {
        super(3, continuation);
        this.f285746t = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, com.avito.android.str_booking.domain.polling.a aVar, Continuation<? super G0> continuation) {
        e eVar = new e(this.f285746t, continuation);
        eVar.f285744r = interfaceC43172j;
        eVar.f285745s = aVar;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f285743q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f285744r;
            InterfaceC43160i interfaceC43160iC = a.c(this.f285746t);
            this.f285743q = 1;
            if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
