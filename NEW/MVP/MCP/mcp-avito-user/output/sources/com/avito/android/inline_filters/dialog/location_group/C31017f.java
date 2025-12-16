package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.suggest_locations.analytics.FromBlock;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationGroupFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.location_group.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31017f extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31013b f171822l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31017f(C31013b c31013b) {
        super(1);
        this.f171822l = c31013b;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        SearchParams searchParams;
        int iIntValue = num.intValue();
        C31013b c31013b = this.f171822l;
        ItemsSearchLink itemsSearchLink = c31013b.f171781D;
        if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
            searchParams = c31013b.f171779B;
        }
        CN.f fVar = c31013b.f171795k;
        if (fVar != null) {
            String categoryId = searchParams != null ? searchParams.getCategoryId() : null;
            String locationId = searchParams != null ? searchParams.getLocationId() : null;
            FromBlock fromBlock = FromBlock.f292253c;
            fVar.h(Integer.valueOf(iIntValue), categoryId, locationId);
        }
        return G0.f406611a;
    }
}
