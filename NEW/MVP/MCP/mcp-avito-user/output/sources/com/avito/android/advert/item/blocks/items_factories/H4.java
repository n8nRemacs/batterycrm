package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.service_transportation_info.advert_details.AdvertDetailsServicesTransportInfoItem;
import com.avito.android.service_transportation_info.model.TransportInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;

/* compiled from: AdvertDetailsServicesTransportInfoItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/H4;", "Lcom/avito/android/advert/item/blocks/items_factories/G4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H4 implements G4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73765a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43617a f73766b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C28070w1 f73767c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73768d;

    @Inject
    public H4(@Y61.k com.avito.android.B2 b22, @Y61.k C43617a c43617a, @Y61.k C28070w1 c28070w1, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73765a = b22;
        this.f73766b = c43617a;
        this.f73767c = c28070w1;
        this.f73768d = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.G4
    @Y61.l
    public final AdvertDetailsServicesTransportInfoItem a(@Y61.k AdvertDetails advertDetails) {
        TransportInfo transportInfo;
        com.avito.android.B2 b22 = this.f73765a;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.B2.f67184X[41];
        if (!((Boolean) b22.f67198N.a().invoke()).booleanValue() || (transportInfo = advertDetails.getTransportInfo()) == null) {
            return null;
        }
        String id2 = advertDetails.getId();
        String xHash = advertDetails.getXHash();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsServicesTransportInfoItem(transportInfo, id2, xHash, "ITEM_SERVICES_TRANSPORT_INFO", this.f73768d.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    @Override // com.avito.android.advert.item.blocks.items_factories.G4
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.blocks.items_factories.C28070w1.a b(@Y61.k com.avito.android.remote.model.AdvertDetails r19) {
        /*
            r18 = this;
            r0 = r18
            com.avito.android.B2 r1 = r0.f73765a
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.B2.f67184X
            r3 = 41
            r2 = r2[r3]
            com.avito.android.A0$a r1 = r1.f67198N
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L96
            com.avito.android.service_transportation_info.model.TransportInfo r1 = r19.getTransportInfo()
            if (r1 == 0) goto L96
            java.util.List r3 = r1.d()
            boolean r2 = r19.isActive()
            r4 = 1
            r5 = r2 ^ 1
            com.avito.android.remote.model.text.AttributedText r12 = new com.avito.android.remote.model.text.AttributedText
            java.lang.String r7 = r1.getTitle()
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
            r11 = 0
            r9 = 0
            r10 = 4
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            com.avito.android.remote.model.ExpandItemsButton r6 = r1.getExpandParamsButton()
            com.avito.android.advert_core.advert.AdvertDetailsFlatViewType r7 = com.avito.android.advert_core.advert.AdvertDetailsFlatViewType.f82420b
            boolean r1 = r19.isRestyle()
            r2 = 0
            if (r1 != 0) goto L55
            boolean r1 = r19.isRealtyRedesign()
            if (r1 == 0) goto L53
            goto L55
        L53:
            r8 = r2
            goto L56
        L55:
            r8 = r4
        L56:
            com.avito.android.advert.item.similars.j r1 = r0.f73768d
            int r9 = r1.a()
            boolean r13 = r19.hasModelCardLink()
            boolean r1 = r19.isAutoFlatsRedesign()
            if (r1 == 0) goto L83
            lD.a r1 = r0.f73766b
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r10 = lD.C43617a.f413588V
            r10 = r10[r4]
            com.avito.android.A0$a r1 = r1.f413611c
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L83
            r14 = r4
            goto L84
        L83:
            r14 = r2
        L84:
            r15 = 0
            r16 = 0
            com.avito.android.advert.item.blocks.items_factories.w1 r2 = r0.f73767c
            r10 = 0
            r11 = 0
            r1 = 0
            r17 = 12544(0x3100, float:1.7578E-41)
            r4 = r5
            r5 = r12
            r12 = r1
            com.avito.android.advert.item.blocks.items_factories.w1$a r1 = com.avito.android.advert.item.blocks.items_factories.C28070w1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L96:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.H4.b(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert.item.blocks.items_factories.w1$a");
    }
}
