package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAboutDeveloperBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/e;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27834e implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28070w1 f73542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.U0 f73543b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.R0 f73544c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.blocks.h f73545d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73546e;

    @Inject
    public C27834e(@Y61.k C28070w1 c28070w1, @Y61.k com.avito.android.advert.item.blocks.items_factories.U0 u02, @Y61.k com.avito.android.advert.item.blocks.items_factories.R0 r02, @Y61.k com.avito.android.advert_core.blocks.h hVar, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73542a = c28070w1;
        this.f73543b = u02;
        this.f73544c = r02;
        this.f73545d = hVar;
        this.f73546e = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.serp.adapter.PersistableSpannedItem> a(@Y61.k com.avito.android.advert_core.blocks.a.b r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = 0
            r2 = 1
            r3 = r26
            com.avito.android.advert_core.advert.AdvertDetailsWithMeta r3 = r3.f83013a
            com.avito.android.remote.model.AdvertDetails r4 = r3.f82645b
            com.avito.android.remote.model.Developer r4 = r4.getDeveloperV2()
            if (r4 == 0) goto Lb2
            com.avito.android.advert.item.blocks.items_factories.U0 r4 = r0.f73543b
            com.avito.android.remote.model.AdvertDetails r3 = r3.f82645b
            com.avito.android.advert.item.developer.trust.DeveloperTrustItem r4 = r4.a(r3)
            com.avito.android.remote.model.Developer r5 = r3.getDeveloperV2()
            r6 = 0
            if (r5 == 0) goto L24
            com.avito.android.remote.model.DeveloperCard r5 = r5.getTrustCard()
            goto L25
        L24:
            r5 = r6
        L25:
            com.avito.android.advert_core.blocks.h r7 = r0.f73545d
            if (r5 != 0) goto L3e
            com.avito.android.remote.model.Developer r5 = r3.getDeveloperV2()
            if (r5 == 0) goto L34
            com.avito.android.remote.model.DeveloperCard r5 = r5.getFoundationCard()
            goto L35
        L34:
            r5 = r6
        L35:
            if (r5 != 0) goto L3e
            r5 = 10
            com.avito.android.advert_core.gap.AdvertDetailsGapItem r5 = r7.a(r5)
            goto L3f
        L3e:
            r5 = r6
        L3f:
            com.avito.android.remote.model.Developer r8 = r3.getDeveloperV2()
            if (r8 == 0) goto L4b
            java.util.List r8 = r8.getParams()
            r10 = r8
            goto L4c
        L4b:
            r10 = r6
        L4c:
            boolean r8 = r3.isActive()
            r11 = r8 ^ 1
            com.avito.android.advert_core.advert.AdvertDetailsFlatViewType r14 = com.avito.android.advert_core.advert.AdvertDetailsFlatViewType.f82421c
            boolean r8 = r3.isRestyle()
            if (r8 != 0) goto L63
            boolean r8 = r3.isRealtyRedesign()
            if (r8 == 0) goto L61
            goto L63
        L61:
            r15 = r1
            goto L64
        L63:
            r15 = r2
        L64:
            com.avito.android.advert.item.similars.j r8 = r0.f73546e
            int r16 = r8.a()
            boolean r20 = r3.hasModelCardLink()
            r22 = 0
            r23 = 0
            com.avito.android.advert.item.blocks.items_factories.w1 r9 = r0.f73542a
            r12 = 0
            r13 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r24 = 14592(0x3900, float:2.0448E-41)
            com.avito.android.advert.item.blocks.items_factories.w1$a r8 = com.avito.android.advert.item.blocks.items_factories.C28070w1.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r9 = 22
            com.avito.android.advert_core.gap.AdvertDetailsGapItem r7 = r7.a(r9)
            com.avito.android.advert.item.blocks.items_factories.R0 r9 = r0.f73544c
            com.avito.android.advert.item.developer.button.DeveloperButtonItem r3 = r9.a(r3)
            if (r8 == 0) goto L95
            com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem r9 = r8.f74053a
            goto L96
        L95:
            r9 = r6
        L96:
            if (r8 == 0) goto L9a
            com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem r6 = r8.f74054b
        L9a:
            r8 = 6
            com.avito.android.serp.adapter.PersistableSpannedItem[] r8 = new com.avito.android.serp.adapter.PersistableSpannedItem[r8]
            r8[r1] = r4
            r8[r2] = r5
            r1 = 2
            r8[r1] = r9
            r1 = 3
            r8[r1] = r6
            r1 = 4
            r8[r1] = r7
            r1 = 5
            r8[r1] = r3
            java.util.ArrayList r1 = kotlin.collections.C42756l.B(r8)
            return r1
        Lb2:
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.block_factories.C27834e.a(com.avito.android.advert_core.blocks.a$b):java.util.List");
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
