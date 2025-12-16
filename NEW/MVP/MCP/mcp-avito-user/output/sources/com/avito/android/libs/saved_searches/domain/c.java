package com.avito.android.libs.saved_searches.domain;

import Go0.InterfaceC13902a;
import TV.e;
import com.avito.android.analytics.event.C28449x0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.saved_searches.model.SubscriptionResult;
import com.avito.android.util.R0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: SearchSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/libs/saved_searches/domain/c;", "Lcom/avito/android/libs/saved_searches/domain/a;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.libs.saved_searches.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.db.n f181456a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TV.c f181457b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f181458c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f181459d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13902a f181460e;

    /* compiled from: SearchSubscriptionInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/saved_searches/model/SubscriptionResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.libs.saved_searches.domain.SearchSubscriptionInteractorImpl$deleteSearchSubscription$2", f = "SearchSubscriptionInteractor.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<SubscriptionResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f181461q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f181463s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f181463s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new a(this.f181463s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<SubscriptionResult>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f181461q;
            String str = this.f181463s;
            c cVar = c.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC13902a interfaceC13902a = cVar.f181460e;
                this.f181461q = 1;
                obj = interfaceC13902a.d(str, this);
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
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return typedResult;
                }
                throw new NoWhenBranchMatchedException();
            }
            SubscriptionResult subscriptionResult = (SubscriptionResult) ((TypedResult.Success) typedResult).getResult();
            cVar.f181456a.k(str);
            C28449x0 c28449x0 = new C28449x0(cVar.f181456a.q());
            TV.c cVar2 = cVar.f181457b;
            cVar2.e(c28449x0);
            cVar2.i(new e.b(str));
            return new TypedResult.Success(subscriptionResult);
        }
    }

    @Inject
    public c(@Y61.k h31.e<InterfaceC13902a> eVar, @Y61.k com.avito.android.db.n nVar, @Y61.k TV.c cVar, @Y61.k R0 r02, @Y61.k SearchParamsConverter searchParamsConverter) {
        this.f181456a = nVar;
        this.f181457b = cVar;
        this.f181458c = r02;
        this.f181459d = searchParamsConverter;
        this.f181460e = eVar.get();
    }

    @Override // com.avito.android.libs.saved_searches.domain.a
    @Y61.l
    public final Object a(@Y61.k SearchParams searchParams, @Y61.l Area area, @Y61.l String str, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.k Map map, boolean z12, @Y61.l Boolean bool, @Y61.k Continuation continuation) {
        return C43259k.g(this.f181458c.a(), new b(this, searchParams, presentationType, area, map, str, str2, z12, bool, null), continuation);
    }

    @Override // com.avito.android.libs.saved_searches.domain.a
    @Y61.l
    public final Object b(@Y61.k SavedSearchParams savedSearchParams, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f181458c.a(), new e(this, savedSearchParams, null), suspendLambda);
    }

    @Override // com.avito.android.libs.saved_searches.domain.a
    @Y61.l
    public final Object c(@Y61.k String str, @Y61.k Continuation<? super TypedResult<SubscriptionResult>> continuation) {
        return C43259k.g(this.f181458c.a(), new a(str, null), continuation);
    }
}
