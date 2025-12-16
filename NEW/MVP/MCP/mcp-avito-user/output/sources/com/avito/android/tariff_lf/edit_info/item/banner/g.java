package com.avito.android.tariff_lf.edit_info.item.banner;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffUpsellBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f298899l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f298900m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, h hVar) {
        super(0);
        this.f298899l = cVar;
        this.f298900m = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink = this.f298899l.f298892b.getDeeplink();
        if (deeplink != null) {
            this.f298900m.f298901b.accept(deeplink);
        }
        return G0.f406611a;
    }
}
