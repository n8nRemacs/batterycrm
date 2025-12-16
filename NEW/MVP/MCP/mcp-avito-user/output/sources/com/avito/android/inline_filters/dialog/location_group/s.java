package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationGroupFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "filter", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "selectedValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class s extends kotlin.jvm.internal.N implements Y41.p<Filter, InlineFilterValue, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31013b f171838l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C31013b c31013b) {
        super(2);
        this.f171838l = c31013b;
    }

    @Override // Y41.p
    public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
        SearchParams searchParams;
        PresentationType presentationType;
        String str;
        SearchParams searchParams2;
        Filter filter2 = filter;
        InlineFilterValue inlineFilterValue2 = inlineFilterValue;
        C31013b c31013b = this.f171838l;
        CN.f fVar = c31013b.f171795k;
        if (fVar != null) {
            ItemsSearchLink itemsSearchLink = c31013b.f171781D;
            if (itemsSearchLink == null || (searchParams2 = itemsSearchLink.f133403b) == null) {
                searchParams2 = c31013b.f171779B;
            }
            fVar.o(searchParams2, filter2, inlineFilterValue2);
        }
        ItemsSearchLink itemsSearchLink2 = c31013b.f171781D;
        if (itemsSearchLink2 == null || (searchParams = itemsSearchLink2.f133403b) == null) {
            searchParams = c31013b.f171779B;
        }
        SearchParams searchParams3 = searchParams;
        if (itemsSearchLink2 == null || (presentationType = itemsSearchLink2.f133413l) == null) {
            presentationType = c31013b.f171796l;
        }
        PresentationType presentationType2 = presentationType;
        if (itemsSearchLink2 == null || (str = itemsSearchLink2.f133404c) == null) {
            str = c31013b.f171797m;
        }
        c31013b.g(filter2, inlineFilterValue2, searchParams3, presentationType2, str);
        return G0.f406611a;
    }
}
