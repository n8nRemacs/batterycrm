package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrBookingCalendarInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarDates$1", f = "StrBookingCalendarInteractor.kt", i = {}, l = {234, 233}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<Object>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286607q;

    public u() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        L.l();
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<Object>> interfaceC43172j, Continuation<? super G0> continuation) {
        L.l();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286607q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f286607q = 1;
            throw null;
        }
        if (i12 == 1) {
            C42729a0.b(obj);
            this.f286607q = 2;
            throw null;
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return G0.f406611a;
    }
}
