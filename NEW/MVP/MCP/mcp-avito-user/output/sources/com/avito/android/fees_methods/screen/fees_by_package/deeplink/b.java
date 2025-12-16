package com.avito.android.fees_methods.screen.fees_by_package.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: FeesApplyByPackageDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LDE/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.fees_methods.screen.fees_by_package.deeplink.FeesApplyByPackageDeeplinkHandler$doHandleSuspend$2", f = "FeesApplyByPackageDeeplinkHandler.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<DE.a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f157965q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f157966r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FeesApplyByPackageV2Link f157967s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, FeesApplyByPackageV2Link feesApplyByPackageV2Link, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f157966r = cVar;
        this.f157967s = feesApplyByPackageV2Link;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f157966r, this.f157967s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<DE.a>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f157965q;
        if (i12 == 0) {
            C42729a0.b(obj);
            AE.a aVar = this.f157966r.f157968g;
            String str = this.f157967s.f157940b;
            this.f157965q = 1;
            obj = aVar.a(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
