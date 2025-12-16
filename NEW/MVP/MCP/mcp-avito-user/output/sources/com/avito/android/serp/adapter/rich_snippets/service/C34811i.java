package com.avito.android.serp.adapter.rich_snippets.service;

import Er0.C13523a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.C34880w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "galleryPosition", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34811i extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f271323l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271324m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f271325n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271326o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34811i(AdvertItem advertItem, AdvertItem advertItem2, s sVar, v vVar) {
        super(1);
        this.f271323l = sVar;
        this.f271324m = advertItem;
        this.f271325n = vVar;
        this.f271326o = advertItem2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, java.lang.Object] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        DimmedImage dimmedImage;
        Integer num2 = num;
        s sVar = this.f271323l;
        InterfaceC47690b interfaceC47690b = sVar.f271371b.get();
        if (interfaceC47690b != null) {
            AdvertItem advertItem = this.f271324m;
            DeepLink deepLink = advertItem.f268396O;
            int iIntValue = num2 != null ? num2.intValue() : 0;
            ArrayList arrayList = new ArrayList();
            List<ConstructorAdvertGalleryItemModel> list = advertItem.f268406T;
            List<DimmedImage> list2 = advertItem.f268404S;
            if (list != null) {
                ArrayList arrayListB = C13523a.b(list);
                if (arrayListB != null) {
                    arrayList.addAll(arrayListB);
                }
            } else if (list2 != null) {
                List<DimmedImage> list3 = list2;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((DimmedImage) it.next()).getImage());
                }
                arrayList.addAll(arrayList2);
            }
            if (list2 == null && list == null && (dimmedImage = advertItem.f268368A) != null) {
                arrayList.add(dimmedImage.getImage());
            }
            InterfaceC47691c.a.a(interfaceC47690b, deepLink, C34880w.a(advertItem.f268428d, advertItem.f268440i, advertItem.f268446l, arrayList.isEmpty() ? null : ImageKt.toSingleImage(this.f271325n.O(com.avito.android.image_loader.b.b((Image) arrayList.get(iIntValue)))), advertItem.f268420a0, num2, sVar.f271378i), 8);
        }
        AdvertItem advertItem2 = this.f271326o;
        ?? r02 = advertItem2.f268421a1;
        if (r02 != 0) {
            r02.invoke(advertItem2.f268425c);
        }
        return G0.f406611a;
    }
}
