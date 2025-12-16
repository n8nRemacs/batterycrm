package com.avito.android.inline_filters;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.SearchParams;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "resetSearchArea", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class H extends kotlin.jvm.internal.N implements Y41.p<DeepLink, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f170987l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(z zVar) {
        super(2);
        this.f170987l = zVar;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, Boolean bool) {
        DeepLink deepLink2 = deepLink;
        Boolean bool2 = bool;
        bool2.booleanValue();
        ItemsSearchLink itemsSearchLink = deepLink2 instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink2 : null;
        SearchParams searchParams = itemsSearchLink != null ? itemsSearchLink.f133403b : null;
        String str = itemsSearchLink != null ? itemsSearchLink.f133404c : null;
        z zVar = this.f170987l;
        zVar.z1(searchParams, str);
        zVar.f172392I.accept(new kotlin.Q<>(deepLink2, bool2));
        return G0.f406611a;
    }
}
