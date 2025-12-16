package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$initialLoadParameters$5", f = "StrCalendarParametersInteractor.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286972q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f286973r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f286974s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f286975t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Continuation<? super j> continuation) {
        super(3, continuation);
        this.f286975t = bVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        j jVar = new j(this.f286975t, continuation);
        jVar.f286973r = interfaceC43172j;
        jVar.f286974s = th2;
        return jVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286972q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f286973r;
            Throwable th2 = this.f286974s;
            V2.f318762a.f(th2);
            StrCalendarParametersInternalAction.ContentError contentError = new StrCalendarParametersInternalAction.ContentError(this.f286975t.f286869b.a(th2));
            this.f286973r = null;
            this.f286972q = 1;
            if (interfaceC43172j.emit(contentError, this) == coroutine_suspended) {
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
