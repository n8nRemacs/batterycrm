package com.avito.android.multigeo_flow.deeplink;

import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: JobMultiGeoAddDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multigeo_flow.deeplink.JobMultiGeoAddDeeplinkHandler$doHandle$1", f = "JobMultiGeoAddDeeplinkHandler.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.multigeo_flow.deeplink.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32879a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206820q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32881c f206821r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32879a(C32881c c32881c, Continuation<? super C32879a> continuation) {
        super(2, continuation);
        this.f206821r = c32881c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32879a(this.f206821r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C32879a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206820q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f206820q = 1;
            C32881c c32881c = this.f206821r;
            Object objCollect = ((AbstractC43168f) kotlinx.coroutines.rx3.y.a(c32881c.f206823f.d9())).collect(new C32880b(c32881c), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = G0.f406611a;
            }
            if (objCollect == coroutine_suspended) {
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
