package com.avito.android.advert.item.other_categories;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OtherCategoriesItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ OtherCategoriesItem f77846l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f77847m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OtherCategoriesItem otherCategoriesItem, e eVar) {
        super(0);
        this.f77846l = otherCategoriesItem;
        this.f77847m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f77846l.f77837g;
        if (deepLink != null) {
            b.a.a(this.f77847m.f77848b, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
