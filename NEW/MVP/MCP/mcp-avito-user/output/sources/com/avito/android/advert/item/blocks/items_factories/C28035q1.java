package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsExpertBlockFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/q1;", "Lcom/avito/android/advert/item/blocks/items_factories/p1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.q1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28035q1 implements InterfaceC28028p1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74007a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C29640d f74008b;

    @Inject
    public C28035q1(@Y61.k C29640d c29640d, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74007a = jVar;
        this.f74008b = c29640d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28028p1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.comfortable_deal.ExpertBlockItem a(@Y61.k com.avito.android.remote.model.AdvertDetails r18) {
        /*
            r17 = this;
            r0 = r17
            com.avito.android.d r1 = r0.f74008b
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.C29640d.f132175X
            r3 = 39
            r2 = r2[r3]
            com.avito.android.A0$a r1 = r1.f132188M
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 != 0) goto L21
            return r2
        L21:
            com.avito.android.remote.model.ComfortableDealExpertBlock r1 = r18.getComfortableDealExpertBlock()
            if (r1 == 0) goto L9f
            com.avito.android.remote.model.AdvertActions r3 = r18.getContacts()
            if (r3 == 0) goto L5c
            java.util.List r3 = r3.getActions()
            if (r3 == 0) goto L5c
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L3b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof com.avito.android.remote.model.AdvertAction.Messenger
            if (r5 == 0) goto L3b
            goto L4b
        L4a:
            r4 = r2
        L4b:
            boolean r3 = r4 instanceof com.avito.android.remote.model.AdvertAction.Messenger
            if (r3 != 0) goto L50
            goto L51
        L50:
            r2 = r4
        L51:
            com.avito.android.remote.model.AdvertAction$Messenger r2 = (com.avito.android.remote.model.AdvertAction.Messenger) r2
            if (r2 == 0) goto L5c
            com.avito.android.deep_linking.links.DeepLink r2 = r2.getDeepLink()
            if (r2 == 0) goto L5c
            goto L61
        L5c:
            com.avito.android.deep_linking.links.NoMatchLink r2 = new com.avito.android.deep_linking.links.NoMatchLink
            r2.<init>()
        L61:
            java.lang.String r10 = r1.getTitle()
            com.avito.android.remote.model.ExpertBlock r11 = r1.getExpertBlock()
            java.util.List r12 = r1.getBenefits()
            com.avito.android.remote.model.ButtonInfo r13 = new com.avito.android.remote.model.ButtonInfo
            com.avito.android.remote.model.ButtonInfo r3 = r1.getButtonInfo()
            com.avito.android.deep_linking.links.DeepLink r3 = r3.getDeepLink()
            if (r3 != 0) goto L7a
            goto L7b
        L7a:
            r2 = r3
        L7b:
            com.avito.android.remote.model.ButtonInfo r3 = r1.getButtonInfo()
            java.lang.String r3 = r3.getText()
            r13.<init>(r2, r3)
            com.avito.android.remote.model.BottomSheetContent r14 = r1.getBottomSheetContent()
            com.avito.android.advert.item.similars.j r1 = r0.f74007a
            int r9 = r1.getSpanCount()
            com.avito.android.advert.item.comfortable_deal.ExpertBlockItem r2 = new com.avito.android.advert.item.comfortable_deal.ExpertBlockItem
            r7 = 0
            r8 = 0
            r4 = 0
            r6 = 0
            r15 = 15
            r16 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.C28035q1.a(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert.item.comfortable_deal.ExpertBlockItem");
    }
}
