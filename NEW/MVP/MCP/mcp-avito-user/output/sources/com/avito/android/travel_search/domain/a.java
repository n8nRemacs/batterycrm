package com.avito.android.travel_search.domain;

import Y41.p;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31047g;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
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
import kotlinx.coroutines.rx3.Q;
import sF0.InterfaceC48043a;
import tF0.C48548a;

/* compiled from: TravelSearchFiltersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/domain/a;", "Lcom/avito/android/inline_filters/b;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements InterfaceC30995b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48043a f303090a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f303091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f303092c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31047g f303093d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f303094e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f303095f;

    /* compiled from: TravelSearchFiltersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/search/InlineFilters;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/search/InlineFilters;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.travel_search.domain.TravelSearchFiltersInteractor$load$1", f = "TravelSearchFiltersInteractor.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.travel_search.domain.a$a, reason: collision with other inner class name */
    public static final class C9276a extends SuspendLambda implements p<T, Continuation<? super InlineFilters>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303096q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f303098s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f303099t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9276a(Map<String, String> map, Map<String, String> map2, Continuation<? super C9276a> continuation) {
            super(2, continuation);
            this.f303098s = map;
            this.f303099t = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new C9276a(this.f303098s, this.f303099t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super InlineFilters> continuation) {
            return ((C9276a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f303096q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC48043a interfaceC48043a = aVar.f303090a;
                LinkedHashMap linkedHashMapK = P0.k(this.f303098s, this.f303099t);
                this.f303096q = 1;
                obj = interfaceC48043a.a(linkedHashMapK, this);
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
            if (typedResult instanceof TypedResult.Success) {
                return aVar.f303092c.a((C48548a) ((TypedResult.Success) typedResult).getResult());
            }
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            throw C35936s.a(error.getError(), error.getCause());
        }
    }

    @Inject
    public a(@Y61.k InterfaceC48043a interfaceC48043a, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k c cVar, @Y61.k InterfaceC31047g interfaceC31047g, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k R0 r02) {
        this.f303090a = interfaceC48043a;
        this.f303091b = searchParamsConverter;
        this.f303092c = cVar;
        this.f303093d = interfaceC31047g;
        this.f303094e = interfaceC35745a5;
        this.f303095f = r02;
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final z a(@Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str, @Y61.l Filter filter, @Y61.l Filter filter2, @Y61.l Map map, @Y61.k Filter filter3, @Y61.l ItemsSearchLink itemsSearchLink) {
        return U.f403867b;
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final z<InlineFilters> b(@Y61.k SearchParams searchParams, @Y61.k Map<String, String> map, @Y61.l PresentationType presentationType, @Y61.l Map<String, String> map2, @Y61.l List<String> list, @Y61.l String str) {
        return Q.a(this.f303095f.a(), new C9276a(SearchParamsConverter.DefaultImpls.convertToMap$default(this.f303091b, searchParams, null, false, null, 14, null), this.f303093d.a(map), null)).F();
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final z c(@Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l String str) {
        return d(Collections.singletonList(new kotlin.Q(filter, inlineFilterValue)), searchParams, presentationType, (8 & 8) != 0 ? null : null, null, (8 & 32) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final I0 d(@Y61.k List list, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l List list2, @Y61.l String str) {
        kotlin.Q q12;
        Filter.Config config;
        Filter.Displaying displaying;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            Filter.FilterMapping mapping = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.Q q13 = (kotlin.Q) it.next();
            Filter filter = (Filter) q13.f406619b;
            InlineFilterValue inlineFilterValue = (InlineFilterValue) q13.f406620c;
            String id2 = filter.getId();
            if (id2 == null) {
                id2 = "";
            }
            Filter.Widget widget = filter.getWidget();
            if ((widget != null ? widget.getType() : null) == WidgetType.Calendar) {
                Filter.Widget widget2 = filter.getWidget();
                String format = widget2 != null ? widget2.getFormat() : null;
                Filter.Widget widget3 = filter.getWidget();
                if (widget3 != null && (config = widget3.getConfig()) != null && (displaying = config.getDisplaying()) != null) {
                    mapping = displaying.getMapping();
                }
                q12 = new kotlin.Q(format, mapping);
            } else {
                q12 = new kotlin.Q(null, null);
            }
            String str2 = (String) q12.f406619b;
            Filter.FilterMapping filterMapping = (Filter.FilterMapping) q12.f406620c;
            if (id2.length() > 0) {
                linkedHashMap.putAll(inlineFilterValue.queryMap(id2, str2, filterMapping));
            }
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f303094e;
        return (searchParams == null || linkedHashMap.isEmpty()) ? z.c0(new InlineFilters(null, null)).j0(interfaceC35745a5.e()) : b(searchParams, linkedHashMap, (8 & 4) != 0 ? null : presentationType, null, (8 & 16) != 0 ? null : list2, (8 & 32) != 0 ? null : str).j0(interfaceC35745a5.e());
    }
}
