package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import Qw.InterfaceC14939a;
import Rw.C15086a;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: DealCabinetInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LRw/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetInteractorImpl$setArchived$2", f = "DealCabinetInteractor.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C15086a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137146q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f137147r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f137148s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f137147r = lVar;
        this.f137148s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f137147r, this.f137148s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C15086a>> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137146q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14939a interfaceC14939a = this.f137147r.f137126b;
            this.f137146q = 1;
            obj = interfaceC14939a.a(this.f137148s, false, this);
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
