package com.avito.android.libs.saved_searches.domain;

import Go0.InterfaceC13902a;
import TV.e;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.saved_searches.model.SavedSearchData;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: SearchSubscriptionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/saved_searches/model/SavedSearchData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.libs.saved_searches.domain.SearchSubscriptionInteractorImpl$getSearchSubscriptionForm$2", f = "SearchSubscriptionInteractor.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<SavedSearchData>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f181464q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f181465r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SavedSearchParams f181466s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, SavedSearchParams savedSearchParams, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f181465r = cVar;
        this.f181466s = savedSearchParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f181465r, this.f181466s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<SavedSearchData>> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws InterruptedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f181464q;
        c cVar = this.f181465r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC13902a interfaceC13902a = cVar.f181460e;
            SavedSearchParams savedSearchParams = this.f181466s;
            String str = savedSearchParams.f181443b;
            Map<String, String> mapC = savedSearchParams.f181444c;
            if (mapC == null) {
                mapC = P0.c();
            }
            this.f181464q = 1;
            obj = interfaceC13902a.c(str, null, mapC, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Error;
        if (z12) {
            Thread.sleep(800L);
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            if (z12) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        SavedSearchData savedSearchData = (SavedSearchData) ((TypedResult.Success) typedResult).getResult();
        String subscriptionId = savedSearchData.getSubscriptionId();
        cVar.f181457b.i(subscriptionId != null ? new e.a(subscriptionId) : new e.b(null));
        return new TypedResult.Success(savedSearchData);
    }
}
