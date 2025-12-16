package com.avito.android.offlinization;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import r40.C47487a;

/* compiled from: OfflinizationInterceptorProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.offlinization.OfflinizationInterceptorProvider$registerSpaceCheck$1$1", f = "OfflinizationInterceptorProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class y extends SuspendLambda implements Y41.p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A f208655q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C47487a f208656r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a12, C47487a c47487a, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f208655q = a12;
        this.f208656r = c47487a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new y(this.f208655q, this.f208656r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((y) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        A a12 = this.f208655q;
        if (this.f208656r.f429579a.getFreeSpace() - 10485760 < 10485760 * 2) {
            a12.f208471e.b();
        }
        return G0.f406611a;
    }
}
