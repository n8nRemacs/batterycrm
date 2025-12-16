package com.avito.android.serp.adapter.map_banner;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: MapBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f270296l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MapBannerItem f270297m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, MapBannerItem mapBannerItem) {
        super(0);
        this.f270296l = gVar;
        this.f270297m = mapBannerItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f270297m.f270287e;
        g gVar = this.f270296l;
        if (deepLink != null) {
            InterfaceC47691c.a.a(gVar.f270298b.get(), deepLink, null, 14);
        }
        return G0.f406611a;
    }
}
