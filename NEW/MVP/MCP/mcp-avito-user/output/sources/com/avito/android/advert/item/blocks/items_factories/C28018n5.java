package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertVideoCallRequestItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/n5;", "Lcom/avito/android/advert/item/blocks/items_factories/m5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.n5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28018n5 implements InterfaceC28011m5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73995a;

    @Inject
    public C28018n5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73995a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28011m5
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem a(@Y61.k com.avito.android.remote.model.AdvertDetails r12, @Y61.k com.avito.android.advert_details.AdvertDetailsStyle r13) {
        /*
            r11 = this;
            com.avito.android.deep_linking.links.DeepLink r5 = r12.getVideoCallRequestLink()
            if (r5 != 0) goto L8
            r12 = 0
            return r12
        L8:
            com.avito.android.remote.safedeal.SafeDeal r0 = r12.getSafeDeal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L4f
            java.util.List r0 = r0.getComponents()
            if (r0 == 0) goto L4f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L26
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L26
            goto L4f
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r0.next()
            com.avito.android.remote.safedeal.SafeDeal$Component r3 = (com.avito.android.remote.safedeal.SafeDeal.Component) r3
            boolean r4 = r3 instanceof com.avito.android.remote.safedeal.SafeDeal.Component.Button
            if (r4 == 0) goto L49
            r4 = r3
            com.avito.android.remote.safedeal.SafeDeal$Component$Button r4 = (com.avito.android.remote.safedeal.SafeDeal.Component.Button) r4
            java.lang.Boolean r4 = r4.getIsFloating()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.L.f(r4, r6)
            if (r4 != 0) goto L4d
        L49:
            boolean r3 = r3 instanceof com.avito.android.remote.safedeal.SafeDeal.Component.CombinedButtons
            if (r3 == 0) goto L2a
        L4d:
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            com.avito.android.service_booking.remote.model.ServiceBooking r3 = r12.getServiceBooking()
            if (r3 == 0) goto L5e
            boolean r3 = r12.isRedesign()
            if (r3 == 0) goto L5e
            r3 = r1
            goto L5f
        L5e:
            r3 = r2
        L5f:
            if (r0 != 0) goto L70
            if (r3 != 0) goto L70
            com.avito.android.advert.advert_details_style.b r13 = com.avito.android.advert.advert_details_style.c.a(r13)
            com.avito.android.advert.advert_details_style.b$b r13 = r13.f68638g
            boolean r13 = r13.f68645a
            if (r13 == 0) goto L6e
            goto L70
        L6e:
            r7 = r2
            goto L71
        L70:
            r7 = r1
        L71:
            com.avito.android.advert.item.similars.j r13 = r11.f73995a
            int r4 = r13.a()
            com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem$Type r6 = com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem.Type.f80683b
            boolean r8 = r12.isRedesign()
            com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem r12 = new com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem
            r9 = 3
            r10 = 0
            r1 = 0
            r3 = 0
            r0 = r12
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.C28018n5.a(com.avito.android.remote.model.AdvertDetails, com.avito.android.advert_details.AdvertDetailsStyle):com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem");
    }
}
