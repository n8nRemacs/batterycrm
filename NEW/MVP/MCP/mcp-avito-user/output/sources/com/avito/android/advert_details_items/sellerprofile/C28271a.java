package com.avito.android.advert_details_items.sellerprofile;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSellerProfileBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/sellerprofile/h;", "Lcom/avito/android/advert_details_items/sellerprofile/AdvertDetailsSellerProfileItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_details_items.sellerprofile.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28271a implements TV0.b<InterfaceC28278h, AdvertDetailsSellerProfileItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28273c f85601a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<C28279i> f85602b = new g.a<>(R.layout.advert_details_seller_profile, C2546a.f85603l);

    /* compiled from: AdvertDetailsSellerProfileBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/sellerprofile/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/sellerprofile/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.sellerprofile.a$a, reason: collision with other inner class name */
    public static final class C2546a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C28279i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2546a f85603l = new C2546a();

        public C2546a() {
            super(2);
        }

        @Override // Y41.p
        public final C28279i invoke(ViewGroup viewGroup, View view) {
            return new C28279i(view);
        }
    }

    @Inject
    public C28271a(@Y61.k InterfaceC28273c interfaceC28273c) {
        this.f85601a = interfaceC28273c;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f85601a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C28279i> b() {
        return this.f85602b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsSellerProfileItem;
    }
}
