package com.avito.android.inline_filters;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "filter", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "selectedValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class G extends kotlin.jvm.internal.N implements Y41.p<Filter, InlineFilterValue, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f170983l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchParams f170984m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PresentationType f170985n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f170986o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(z zVar, SearchParams searchParams, PresentationType presentationType, String str) {
        super(2);
        this.f170983l = zVar;
        this.f170984m = searchParams;
        this.f170985n = presentationType;
        this.f170986o = str;
    }

    @Override // Y41.p
    public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
        Filter filter2 = filter;
        InlineFilterValue inlineFilterValue2 = inlineFilterValue;
        z zVar = this.f170983l;
        zVar.getClass();
        if (inlineFilterValue2.isEmpty()) {
            zVar.f172415i.k();
        }
        if (!kotlin.jvm.internal.L.f(filter2.getValue(), inlineFilterValue2)) {
            zVar.e(filter2, inlineFilterValue2, this.f170984m, this.f170985n, this.f170986o);
        }
        zVar.f172398O = null;
        return G0.f406611a;
    }
}
