package com.avito.android.mall.suggests;

import Y61.k;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SuggestParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.suggest.SuggestResponse;
import com.avito.android.search.m;
import com.avito.android.search.p;
import com.avito.android.util.InterfaceC35745a5;
import h31.e;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.F;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: MallSuggestsInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/suggests/b;", "Lcom/avito/android/search/m;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<V0> f184346a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SuggestParamsConverter f184347b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f184348c;

    /* compiled from: MallSuggestsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestResponse;", "it", "Lcom/avito/android/search/o;", "apply", "(Lcom/avito/android/remote/model/search/suggest/SuggestResponse;)Lcom/avito/android/search/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f184349b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            SuggestResponse suggestResponse = (SuggestResponse) obj;
            return new com.avito.android.search.o(new p(suggestResponse.getXSgt()), C42745f0.C(suggestResponse.getResult()));
        }
    }

    /* compiled from: MallSuggestsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "it", "", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mall.suggests.b$b, reason: collision with other inner class name */
    public static final class C5407b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C5407b<T, R> f184350b = new C5407b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Boolean.valueOf(((TypedResult) obj) instanceof TypedResult.Success);
        }
    }

    /* compiled from: MallSuggestsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f184351b = new c<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    @Inject
    public b(@k e<V0> eVar, @k SuggestParamsConverter suggestParamsConverter, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f184346a = eVar;
        this.f184347b = suggestParamsConverter;
        this.f184348c = interfaceC35745a5;
    }

    @Override // com.avito.android.search.m
    @k
    public final z<Boolean> a(@k String str) {
        return this.f184346a.get().b(str).d0(C5407b.f184350b).m0(c.f184351b);
    }

    @Override // com.avito.android.search.m
    @k
    public final z c(@k String str, @k Map map, boolean z12) {
        return new F(new com.avito.android.mall.suggests.a(z12, this, str, map, SuggestParamsConverter.DefaultImpls.convertToMap$default(this.f184347b, new SearchParams(null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 1, null), null, 2, null), 0)).x0(this.f184348c.a()).d0(a.f184349b);
    }
}
