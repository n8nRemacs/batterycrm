package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.analytics.event.K;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageGalleryItemModel;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.C34880w;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "galleryPosition", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f269687l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f269688m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f269689n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269690o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, AdvertItem advertItem, C c12, SerpConstructorAdvertItem serpConstructorAdvertItem) {
        super(1);
        this.f269687l = zVar;
        this.f269688m = advertItem;
        this.f269689n = c12;
        this.f269690o = serpConstructorAdvertItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel;
        ConstructorAdvertGalleryItemModel next;
        DimmedImage image;
        Integer num2 = num;
        z zVar = this.f269687l;
        InterfaceC47690b interfaceC47690b = zVar.f269713b.get();
        AdvertItem advertItem = this.f269688m;
        int size = 0;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269690o;
        List<ConstructorAdvertGalleryItemModel> galleryItemsList = serpConstructorAdvertItem.getGalleryItemsList();
        if (galleryItemsList == null || (constructorAdvertGalleryItemModel = (ConstructorAdvertGalleryItemModel) C42745f0.K(iIntValue, galleryItemsList)) == null) {
            List<ConstructorAdvertGalleryItemModel> galleryItemsList2 = serpConstructorAdvertItem.getGalleryItemsList();
            if (galleryItemsList2 != null) {
                Iterator it = galleryItemsList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it.next();
                    if (((ConstructorAdvertGalleryItemModel) next) instanceof ImageGalleryItemModel) {
                        break;
                    }
                }
                constructorAdvertGalleryItemModel = next;
            } else {
                constructorAdvertGalleryItemModel = null;
            }
        }
        Image image2 = ((constructorAdvertGalleryItemModel instanceof ImageGalleryItemModel ? (ImageGalleryItemModel) constructorAdvertGalleryItemModel : null) == null || (image = ((ImageGalleryItemModel) constructorAdvertGalleryItemModel).getImage()) == null) ? null : image.getImage();
        InterfaceC47691c.a.a(interfaceC47690b, advertItem.f268396O, C34880w.a(advertItem.f268428d, advertItem.f268440i, advertItem.f268446l, image2 == null ? null : ImageKt.toSingleImage(this.f269689n.O(com.avito.android.image_loader.b.b(image2))), advertItem.f268420a0, num2, zVar.f269723l), 8);
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            String f75565j = serpConstructorAdvertItem.getF85304c();
            int i12 = iIntValue2 + 1;
            List<ConstructorAdvertGalleryItemModel> galleryItemsList3 = serpConstructorAdvertItem.getGalleryItemsList();
            if (galleryItemsList3 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : galleryItemsList3) {
                    if (obj instanceof ImageGalleryItemModel) {
                        arrayList.add(obj);
                    }
                }
                size = arrayList.size();
            }
            zVar.f269716e.c(new K(f75565j, i12, size));
        }
        Y41.l<String, G0> itemClickListener = serpConstructorAdvertItem.getItemClickListener();
        if (itemClickListener != null) {
            itemClickListener.invoke(serpConstructorAdvertItem.getF85304c());
        }
        return G0.f406611a;
    }
}
