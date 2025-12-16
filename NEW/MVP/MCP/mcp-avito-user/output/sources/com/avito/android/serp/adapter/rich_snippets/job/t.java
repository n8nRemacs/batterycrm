package com.avito.android.serp.adapter.rich_snippets.job;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.serp.adapter.C34880w;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: AdvertXlRichJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class t extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f270848l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f270849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, AdvertXlItem advertXlItem) {
        super(0);
        this.f270848l = xVar;
        this.f270849m = advertXlItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DimmedImage dimmedImage;
        x xVar = this.f270848l;
        InterfaceC47690b interfaceC47690b = xVar.f270859b.get();
        AdvertXlItem advertXlItem = this.f270849m;
        DeepLink deepLink = advertXlItem.f268748A;
        List<DimmedImage> list = advertXlItem.f268779d;
        InterfaceC47691c.a.a(interfaceC47690b, deepLink, C34880w.a(advertXlItem.f268793k, advertXlItem.f268808t, advertXlItem.f268811w, (list == null || (dimmedImage = (DimmedImage) C42745f0.G(list)) == null) ? null : dimmedImage.getImage(), advertXlItem.f268776b0, null, xVar.f270867j), 8);
        return G0.f406611a;
    }
}
