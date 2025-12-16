package com.avito.android.serp.adapter.advert_xl;

import Er0.C13523a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.C34880w;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f268844l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268845m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f268846n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268847o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AdvertXlItem advertXlItem, AdvertXlItem advertXlItem2, u uVar, x xVar) {
        super(0);
        this.f268844l = uVar;
        this.f268845m = advertXlItem;
        this.f268846n = xVar;
        this.f268847o = advertXlItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DimmedImage dimmedImage;
        u uVar = this.f268844l;
        InterfaceC47690b interfaceC47690b = uVar.f268868c.get();
        AdvertXlItem advertXlItem = this.f268845m;
        DeepLink deepLink = advertXlItem.f268748A;
        AdvertXlItem advertXlItem2 = this.f268847o;
        List<ConstructorAdvertGalleryItemModel> list = advertXlItem2.f268781e;
        Image image = null;
        if (list != null) {
            ArrayList arrayListB = C13523a.b(list);
            if (arrayListB != null) {
                image = (Image) C42745f0.G(arrayListB);
            }
        } else {
            List<DimmedImage> list2 = advertXlItem2.f268779d;
            if (list2 != null && (dimmedImage = (DimmedImage) C42745f0.G(list2)) != null) {
                image = dimmedImage.getImage();
            }
        }
        InterfaceC47691c.a.a(interfaceC47690b, deepLink, C34880w.a(advertXlItem.f268793k, advertXlItem.f268808t, advertXlItem.f268811w, ImageKt.toSingleImage(this.f268846n.O(com.avito.android.image_loader.b.b(image))), advertXlItem.f268776b0, null, uVar.f268877l), 8);
        return G0.f406611a;
    }
}
