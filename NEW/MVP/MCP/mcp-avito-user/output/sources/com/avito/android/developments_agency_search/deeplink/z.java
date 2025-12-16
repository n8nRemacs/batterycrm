package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import com.avito.android.remote.model.TypedResult;
import fx.C40489a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RealtyAgencySearchLotsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lfx/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLotsLinkHandler$doHandleSuspend$2", f = "RealtyAgencySearchLotsLinkHandler.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class z extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C40489a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f136486q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f136487r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a12, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f136487r = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new z(this.f136487r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C40489a>> continuation) {
        return ((z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f136486q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14939a interfaceC14939a = this.f136487r.f136350l;
            this.f136486q = 1;
            obj = interfaceC14939a.e(this);
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
