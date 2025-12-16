package com.avito.android.serp.adapter.rich_snippets.service;

import Er0.C13523a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.C34880w;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "galleryPosition", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f271255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f271257n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(AdvertXlItem advertXlItem, v vVar, O o12) {
        super(1);
        this.f271255l = o12;
        this.f271256m = advertXlItem;
        this.f271257n = vVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Integer num2 = num;
        O o12 = this.f271255l;
        InterfaceC47690b interfaceC47690b = o12.f271283b.get();
        if (interfaceC47690b != null) {
            AdvertXlItem advertXlItem = this.f271256m;
            DeepLink deepLink = advertXlItem.f268748A;
            int iIntValue = num2 != null ? num2.intValue() : 0;
            ArrayList arrayList = new ArrayList();
            List<ConstructorAdvertGalleryItemModel> list = advertXlItem.f268781e;
            if (list != null) {
                ArrayList arrayListB = C13523a.b(list);
                if (arrayListB != null) {
                    arrayList.addAll(arrayListB);
                }
            } else {
                List<DimmedImage> list2 = advertXlItem.f268779d;
                if (list2 != null) {
                    List<DimmedImage> list3 = list2;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((DimmedImage) it.next()).getImage());
                    }
                    arrayList.addAll(arrayList2);
                }
            }
            InterfaceC47691c.a.a(interfaceC47690b, deepLink, C34880w.a(advertXlItem.f268793k, advertXlItem.f268808t, advertXlItem.f268811w, arrayList.isEmpty() ? null : ImageKt.toSingleImage(this.f271257n.O(com.avito.android.image_loader.b.b((Image) arrayList.get(iIntValue)))), advertXlItem.f268776b0, num2, o12.f271289h), 8);
        }
        return G0.f406611a;
    }
}
