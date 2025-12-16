package com.avito.android.service_booking_settings.work_hours;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingWorkHoursStateRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursStateRendererKt$launchWithLifecycle$2", f = "ServiceBookingWorkHoursStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class s extends SuspendLambda implements Y41.p<Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f278135q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f278136r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(Y41.l<Object, G0> lVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f278136r = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f278136r, continuation);
        sVar.f278135q = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<? super G0> continuation) {
        return ((s) create(obj, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f278136r.invoke(this.f278135q);
        return G0.f406611a;
    }
}
