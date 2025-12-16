package com.avito.android.service_booking.mvi.step;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ServiceBookingMviStepRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.mvi.step.ServiceBookingMviStepRendererKt$launchWithLifecycle$2", f = "ServiceBookingMviStepRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class J extends SuspendLambda implements Y41.p<Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f274439q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f274440r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(Y41.l<Object, G0> lVar, Continuation<? super J> continuation) {
        super(2, continuation);
        this.f274440r = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        J j12 = new J(this.f274440r, continuation);
        j12.f274439q = obj;
        return j12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<? super G0> continuation) {
        return ((J) create(obj, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f274440r.invoke(this.f274439q);
        return G0.f406611a;
    }
}
