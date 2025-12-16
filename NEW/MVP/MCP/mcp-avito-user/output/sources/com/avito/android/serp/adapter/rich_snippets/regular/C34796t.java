package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.VideoGalleryItemModel;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.C34880w;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "galleryPosition", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34796t extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34797u f271207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271208m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271209n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f271210o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34796t(C34797u c34797u, AdvertItem advertItem, InterfaceC34800x interfaceC34800x, ArrayList arrayList) {
        super(1);
        this.f271207l = c34797u;
        this.f271208m = advertItem;
        this.f271209n = interfaceC34800x;
        this.f271210o = arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, java.lang.Object] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int size;
        VideoGalleryItemModel videoGalleryItemModel;
        Integer num2 = num;
        C34797u c34797u = this.f271207l;
        InterfaceC47690b interfaceC47690b = c34797u.f271211b.get();
        ArrayList arrayList = this.f271210o;
        AdvertItem advertItem = this.f271208m;
        if (interfaceC47690b != null) {
            DeepLink deepLink = advertItem.f268396O;
            List<ConstructorAdvertGalleryItemModel> list = advertItem.f268406T;
            int size2 = 0;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof VideoGalleryItemModel) {
                        arrayList2.add(obj);
                    }
                }
                size = arrayList2.size();
            } else {
                size = 0;
            }
            InterfaceC34800x interfaceC34800x = this.f271209n;
            Image singleImage = null;
            if (size <= 0 || num2 == null || num2.intValue() >= size) {
                int iIntValue = (advertItem.f268439h0 || num2 == null) ? 0 : num2.intValue() - size;
                if (!arrayList.isEmpty()) {
                    singleImage = ImageKt.toSingleImage(interfaceC34800x.O(com.avito.android.image_loader.b.b((Image) arrayList.get(iIntValue))));
                }
            } else {
                int iIntValue2 = num2.intValue();
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof VideoGalleryItemModel) {
                            arrayList3.add(obj2);
                        }
                    }
                    videoGalleryItemModel = (VideoGalleryItemModel) C42745f0.K(iIntValue2, arrayList3);
                } else {
                    videoGalleryItemModel = null;
                }
                if (videoGalleryItemModel != null) {
                    singleImage = ImageKt.toSingleImage(interfaceC34800x.O(com.avito.android.image_loader.b.b(videoGalleryItemModel.getThumbnail())));
                }
            }
            Image image = singleImage;
            if (list != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof VideoGalleryItemModel) {
                        arrayList4.add(obj3);
                    }
                }
                size2 = arrayList4.size();
            }
            InterfaceC47691c.a.a(interfaceC47690b, deepLink, C34880w.a(advertItem.f268428d, advertItem.f268440i, advertItem.f268446l, image, advertItem.f268420a0, (size2 <= 0 || num2 == null || num2.intValue() <= size2) ? num2 : Integer.valueOf(num2.intValue() + size2), c34797u.f271220k), 8);
        }
        if (num2 != null) {
            c34797u.f271214e.c(new com.avito.android.analytics.event.K(advertItem.f268425c, num2.intValue() + 1, arrayList.size()));
        }
        ?? r12 = advertItem.f268421a1;
        if (r12 != 0) {
            r12.invoke(advertItem.f268425c);
        }
        return G0.f406611a;
    }
}
