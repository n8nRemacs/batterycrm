package com.avito.android.favorite_sellers.adapter.seller;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.favorite_sellers.adapter.seller.SellerItemViewImpl;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Y1;
import vC.C49192a;

/* compiled from: SellerItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/seller/d;", "Lcom/avito/android/favorite_sellers/adapter/seller/c;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y1<vC.b> f155755b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final I30.d f155756c;

    /* compiled from: SellerItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155757a;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155757a = iArr;
        }
    }

    @Inject
    public d(@k Y1<vC.b> y12, @k I30.d dVar) {
        this.f155755b = y12;
        this.f155756c = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SellerItemViewImpl.NewItemsIndicatorState newItemsIndicatorState;
        h hVar = (h) eVar;
        SellerItem sellerItem = (SellerItem) aVar;
        boolean zB2 = this.f155756c.b();
        Image image = sellerItem.f155723f;
        if (image == null) {
            image = null;
        }
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        int i13 = a.f155757a[sellerItem.f155724g.ordinal()];
        boolean z12 = true;
        if (i13 == 1) {
            hVar.Dd(aVarB);
        } else if (i13 == 2) {
            hVar.G9(aVarB);
        }
        hVar.setTitle(sellerItem.f155721d);
        boolean z13 = sellerItem.f155726i;
        hVar.vI(z13 ? 2 : 1, sellerItem.f155722e);
        if (!z13 && sellerItem.f155728k) {
            z12 = false;
        }
        hVar.Gd(z12);
        Boolean bool = sellerItem.f155730m;
        Boolean bool2 = Boolean.TRUE;
        boolean zF2 = L.f(bool, bool2);
        Boolean bool3 = sellerItem.f155732o;
        if (zF2 && zB2 && L.f(bool3, bool2)) {
            newItemsIndicatorState = SellerItemViewImpl.NewItemsIndicatorState.f155743b;
        } else {
            Boolean bool4 = sellerItem.f155730m;
            newItemsIndicatorState = (!((bool4 != null ? bool4.booleanValue() : false) && zB2) && L.f(bool3, bool2)) ? SellerItemViewImpl.NewItemsIndicatorState.f155744c : SellerItemViewImpl.NewItemsIndicatorState.f155745d;
        }
        hVar.qh(newItemsIndicatorState);
        DeepLink deepLink = sellerItem.f155727j;
        if (deepLink instanceof NoMatchLink) {
            deepLink = null;
        }
        hVar.a(deepLink != null ? new e(this, new C49192a(deepLink)) : null);
        hVar.ef(new f(this, sellerItem));
    }
}
