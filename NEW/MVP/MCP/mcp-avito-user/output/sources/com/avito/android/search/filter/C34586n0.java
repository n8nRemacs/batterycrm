package com.avito.android.search.filter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.adapter.category_group.C34537a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/a;", "backNavigation", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/adapter/category_group/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34586n0 extends kotlin.jvm.internal.N implements Y41.l<C34537a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34586n0(C34574h0 c34574h0) {
        super(1);
        this.f263736l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C34537a c34537a) {
        C34537a c34537a2 = c34537a;
        DeepLink deepLink = c34537a2.f262051a;
        if (deepLink instanceof ItemsSearchLink) {
            C34574h0 c34574h0 = this.f263736l;
            FiltersInteractor filtersInteractor = c34574h0.f263329a;
            SearchParams searchParamsH = filtersInteractor.h(filtersInteractor.f(), ((ItemsSearchLink) deepLink).f133403b, c34537a2.f262052b);
            io.reactivex.rxjava3.internal.observers.y yVar = c34574h0.f263317O;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            c34574h0.f263317O = C34574h0.z(c34574h0, searchParamsH, null, 2);
        }
        return kotlin.G0.f406611a;
    }
}
