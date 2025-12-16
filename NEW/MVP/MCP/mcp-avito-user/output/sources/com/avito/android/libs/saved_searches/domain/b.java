package com.avito.android.libs.saved_searches.domain;

import TV.e;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.search.map.AreaKt;
import com.avito.android.saved_searches.model.SearchSubscription;
import com.avito.android.saved_searches.model.SubscriptionResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: SearchSubscriptionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/saved_searches/model/SubscriptionResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.libs.saved_searches.domain.SearchSubscriptionInteractorImpl$addSearchSubscription$2", f = "SearchSubscriptionInteractor.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<SubscriptionResult>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f181446q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f181447r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchParams f181448s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PresentationType f181449t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Area f181450u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f181451v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f181452w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f181453x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f181454y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Boolean f181455z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, SearchParams searchParams, PresentationType presentationType, Area area, Map<String, String> map, String str, String str2, boolean z12, Boolean bool, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f181447r = cVar;
        this.f181448s = searchParams;
        this.f181449t = presentationType;
        this.f181450u = area;
        this.f181451v = map;
        this.f181452w = str;
        this.f181453x = str2;
        this.f181454y = z12;
        this.f181455z = bool;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f181447r, this.f181448s, this.f181449t, this.f181450u, this.f181451v, this.f181452w, this.f181453x, this.f181454y, this.f181455z, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<SubscriptionResult>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Map<String, String> map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f181446q;
        c cVar = this.f181447r;
        if (i12 == 0) {
            C42729a0.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(cVar.f181459d, this.f181448s, null, true, this.f181449t, 2, null));
            Area area = this.f181450u;
            if (area != null && (map = AreaKt.toMap(area)) != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.putAll(this.f181451v);
            String drawId = this.f181448s.getDrawId();
            this.f181446q = 1;
            obj = cVar.f181460e.b(linkedHashMap, drawId, this.f181452w, this.f181453x, this.f181454y, this.f181455z, this);
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
        SearchSubscription searchSubscription = (SearchSubscription) ((TypedResult.Success) typedResult).getResult();
        cVar.f181456a.p(searchSubscription);
        cVar.f181457b.i(new e.a(searchSubscription.f258373b));
        return new TypedResult.Success(new SubscriptionResult(searchSubscription.f258373b, searchSubscription.f258382k, null, 4, null));
    }
}
