package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDescriptionBlockFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/c;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27826c implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f73530a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.P0 f73531b;

    /* compiled from: AdvertDescriptionBlockFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.blocks.block_factories.c$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AdvertDetailsStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle = AdvertDetailsStyle.f84409c;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle2 = AdvertDetailsStyle.f84409c;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle3 = AdvertDetailsStyle.f84409c;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public C27826c(@Y61.k InterfaceC28240u interfaceC28240u, @Y61.k com.avito.android.advert.item.blocks.items_factories.P0 p02) {
        this.f73530a = interfaceC28240u;
        this.f73531b = p02;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.serp.adapter.PersistableSpannedItem> a(@Y61.k com.avito.android.advert_core.blocks.a.b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.avito.android.advert_details.AdvertDetailsStyle r2 = r1.f83014b
            int r2 = r2.ordinal()
            r3 = 2132024070(0x7f141b06, float:1.9686606E38)
            r4 = 2130975150(0x7f0419ae, float:1.7559143E38)
            com.avito.android.advert.u r5 = r0.f73530a
            com.avito.android.advert.item.blocks.items_factories.P0 r6 = r0.f73531b
            r7 = 1
            r8 = 0
            com.avito.android.advert_core.advert.AdvertDetailsWithMeta r1 = r1.f83013a
            if (r2 == 0) goto L4e
            if (r2 == r7) goto L29
            r9 = 2
            if (r2 == r9) goto L4e
            r9 = 3
            if (r2 != r9) goto L23
            goto L4e
        L23:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L29:
            java.lang.String r2 = r5.r()
            com.avito.android.remote.model.AdvertDetails r5 = r1.f82645b
            boolean r5 = r5.isGigItem()
            if (r5 == 0) goto L37
            r4 = r8
            goto L3b
        L37:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L3b:
            com.avito.android.remote.model.AdvertDetails r5 = r1.f82645b
            boolean r5 = r5.isGigItem()
            if (r5 == 0) goto L48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L49
        L48:
            r3 = r8
        L49:
            com.avito.android.advert.item.description_header.AdvertDetailsDescriptionHeaderItem r2 = r6.a(r8, r4, r3, r2)
            goto L80
        L4e:
            java.lang.String r2 = r5.g()
            com.avito.android.remote.model.AdvertDetails r5 = r1.f82645b
            boolean r5 = r5.isGigItem()
            com.avito.android.remote.model.AdvertDetails r9 = r1.f82645b
            if (r5 == 0) goto L5e
            r4 = r8
            goto L70
        L5e:
            boolean r5 = r9.isRestyle()
            if (r5 == 0) goto L69
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L70
        L69:
            r4 = 2130975163(0x7f0419bb, float:1.755917E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L70:
            boolean r5 = r9.isGigItem()
            if (r5 == 0) goto L7b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L7c
        L7b:
            r3 = r8
        L7c:
            com.avito.android.advert.item.description_header.AdvertDetailsDescriptionHeaderItem r2 = r6.a(r8, r4, r3, r2)
        L80:
            com.avito.android.remote.model.AdvertDetails r3 = r1.f82645b
            java.lang.String r10 = r3.getDescription()
            com.avito.android.advert_core.advert.AdvertDetailsMeta r3 = r1.f82646c
            if (r3 == 0) goto L8e
            com.avito.android.html_formatter.HtmlCharSequence r3 = r3.f82644b
            r11 = r3
            goto L8f
        L8e:
            r11 = r8
        L8f:
            com.avito.android.remote.model.AdvertDetails r1 = r1.f82645b
            boolean r13 = r1.isRestyle()
            boolean r14 = r1.isHotel()
            boolean r15 = r1.isGigItem()
            boolean r3 = r1.isActive()
            r12 = r3 ^ 1
            com.avito.android.remote.description_parameters.DescriptionParameters r1 = r1.getDescriptionParameters()
            if (r1 == 0) goto Lb0
            java.lang.Integer r1 = r1.getCollapsedLinesCount()
            r16 = r1
            goto Lb2
        Lb0:
            r16 = r8
        Lb2:
            r17 = 0
            com.avito.android.advert.item.blocks.items_factories.P0 r9 = r0.f73531b
            com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem r1 = r9.b(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != 0) goto Lbd
            goto Lc5
        Lbd:
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.util.List r8 = kotlin.collections.C42745f0.U(r1)
        Lc5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.block_factories.C27826c.a(com.avito.android.advert_core.blocks.a$b):java.util.List");
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
