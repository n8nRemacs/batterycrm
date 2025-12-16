package com.avito.android.search.filter;

import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.link.apply.FiltersApplyLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FiltersPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/link/apply/FiltersApplyLink;", "link", "Lkotlin/G0;", "accept", "(Lcom/avito/android/search/filter/link/apply/FiltersApplyLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34601v0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263808b;

    public C34601v0(C34574h0 c34574h0) {
        this.f263808b = c34574h0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        FiltersApplyLink filtersApplyLink = (FiltersApplyLink) obj;
        List<FiltersApplyLink.FilterValue> list = filtersApplyLink.f263390b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (FiltersApplyLink.FilterValue filterValue : list) {
            arrayList.add(new FiltersInteractor.ParameterValue(filterValue.getId(), filterValue.getValue()));
        }
        this.f263808b.f263329a.i(arrayList, filtersApplyLink.f263391c);
    }
}
