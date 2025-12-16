package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49101b;

/* compiled from: AdvertDetailsSellerProfilePresenter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/e;", "Lcom/avito/android/advert_details_items/sellerprofile/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_details_items.sellerprofile.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28275e implements InterfaceC28273c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28280j f85613b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<AutoMediaMotoWaterTestGroup> f85614c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f85615d;

    @Inject
    public C28275e(@Y61.k InterfaceC28280j interfaceC28280j, @oD.k @Y61.k u3.l<AutoMediaMotoWaterTestGroup> lVar, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f85613b = interfaceC28280j;
        this.f85614c = lVar;
        this.f85615d = interfaceC49101b;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC28278h interfaceC28278h = (InterfaceC28278h) eVar;
        AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem = (AdvertDetailsSellerProfileItem) aVar;
        AutoMediaMotoWaterTestGroup autoMediaMotoWaterTestGroup = this.f85614c.f439745a.f439749b;
        autoMediaMotoWaterTestGroup.getClass();
        if (autoMediaMotoWaterTestGroup != AutoMediaMotoWaterTestGroup.f157650c) {
            if (kotlin.jvm.internal.L.f(advertDetailsSellerProfileItem.f85538h, Boolean.TRUE)) {
                interfaceC28278h.j8(new C28274d(this));
            }
        }
        InterfaceC28280j interfaceC28280j = this.f85613b;
        interfaceC28280j.J(interfaceC28278h);
        interfaceC28280j.N(advertDetailsSellerProfileItem);
        if (this.f85615d.c()) {
            interfaceC28278h.k3(28);
        }
    }
}
