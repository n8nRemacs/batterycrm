package com.avito.android.inline_filters;

import com.avito.android.B2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceTypeKt;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class J extends kotlin.jvm.internal.N implements Y41.p<DeepLink, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Filter f170998l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f170999m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f171000n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Filter filter, z zVar, String str) {
        super(2);
        this.f170998l = filter;
        this.f170999m = zVar;
        this.f171000n = str;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, Boolean bool) {
        SearchParams searchParams;
        Filter.Config config;
        DeepLink deepLink2 = deepLink;
        bool.getClass();
        Filter.Widget widget = this.f170998l.getWidget();
        boolean zF2 = (widget == null || (config = widget.getConfig()) == null) ? false : kotlin.jvm.internal.L.f(config.getFollowCategoryDeeplink(), Boolean.TRUE);
        z zVar = this.f170999m;
        if (zF2) {
            b.a.a(zVar.f172408b, deepLink2, null, null, 6);
        } else {
            ItemsSearchLink itemsSearchLink = deepLink2 instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink2 : null;
            if (SerpSpaceTypeKt.orDefault(S.b(zVar.f172427u)) != SerpSpaceTypeKt.orDefault(itemsSearchLink != null ? itemsSearchLink.f133416o : null)) {
                b.a.a(zVar.f172408b, deepLink2, null, null, 6);
            } else {
                if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
                    searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
                }
                PresentationType presentationType = itemsSearchLink != null ? itemsSearchLink.f133413l : null;
                B2 b22 = zVar.f172421o;
                b22.getClass();
                kotlin.reflect.n<Object> nVar = B2.f67184X[28];
                if (!((Boolean) b22.f67188D.a().invoke()).booleanValue()) {
                    presentationType = null;
                }
                zVar.f172406W = new I(presentationType, searchParams, this.f171000n);
                zVar.f172432z = true;
                zVar.f172394K.accept(Boolean.TRUE);
                io.reactivex.rxjava3.disposables.c cVar = zVar.f172390G;
                cVar.e();
                cVar.b(zVar.f172407a.b(searchParams, P0.c(), (8 & 4) != 0 ? null : presentationType, null, (8 & 16) != 0 ? null : null, (8 & 32) != 0 ? null : this.f171000n).j0(zVar.f172414h.e()).v0(new B(zVar), new C(zVar), io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        return G0.f406611a;
    }
}
