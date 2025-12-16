package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.C34880w;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: AdvertXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "galleryPosition", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f271087l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271088m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271089n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271090o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(AdvertXlItem advertXlItem, AdvertXlItem advertXlItem2, InterfaceC34800x interfaceC34800x, Z z12) {
        super(1);
        this.f271087l = z12;
        this.f271088m = advertXlItem;
        this.f271089n = interfaceC34800x;
        this.f271090o = advertXlItem2;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Integer num2 = num;
        Z z12 = this.f271087l;
        InterfaceC47690b interfaceC47690b = z12.f271109c.get();
        AdvertXlItem advertXlItem = this.f271088m;
        DeepLink deepLink = advertXlItem.f268748A;
        int iIntValue = 0;
        if (!advertXlItem.f268768U && num2 != null) {
            iIntValue = num2.intValue();
        }
        AdvertXlItem advertXlItem2 = this.f271090o;
        List<DimmedImage> list = advertXlItem2.f268779d;
        InterfaceC47691c.a.a(interfaceC47690b, deepLink, C34880w.a(advertXlItem.f268793k, advertXlItem.f268808t, advertXlItem.f268811w, (list == null || list.isEmpty()) ? null : ImageKt.toSingleImage(this.f271089n.O(com.avito.android.image_loader.b.a(advertXlItem2.f268779d.get(iIntValue)))), advertXlItem.f268776b0, num2, z12.f271118l), 8);
        if (num2 != null) {
            int iIntValue2 = num2.intValue() + 1;
            List<DimmedImage> list2 = advertXlItem.f268779d;
            z12.f271112f.c(new com.avito.android.analytics.event.K(advertXlItem2.f268777c, iIntValue2, list2 != null ? list2.size() : 1));
        }
        return G0.f406611a;
    }
}
