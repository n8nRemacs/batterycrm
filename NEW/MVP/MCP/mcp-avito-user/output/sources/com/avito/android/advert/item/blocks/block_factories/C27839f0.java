package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28075x0;
import com.avito.android.advert_core.blocks.AdvertDetailsBlockItem;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsContactBarBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/f0;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27839f0 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28075x0 f73557a;

    @Inject
    public C27839f0(@Y61.k InterfaceC28075x0 interfaceC28075x0) {
        this.f73557a = interfaceC28075x0;
    }

    public static boolean d(a.b bVar) {
        Iterable iterable = (Iterable) bVar.f83016d;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((AdvertDetailsBlockItem) it.next()).f83011b == AdvertDetailsBlockId.CONTACT_BAR) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        return C42745f0.V(this.f73557a.a(bVar.f83013a.f82645b, bVar.f83014b));
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // com.avito.android.advert_core.blocks.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(@Y61.k com.avito.android.advert_core.blocks.a.b r9) {
        /*
            r8 = this;
            com.avito.android.remote.model.AdvertDetailsBlock r0 = r9.f83015c
            java.util.Map r0 = r0.getRawParams()
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r2 = "position"
            java.lang.Object r0 = r0.get(r2)
            com.avito.android.remote.model.RawParams r0 = (com.avito.android.remote.model.RawParams) r0
            goto L13
        L12:
            r0 = r1
        L13:
            boolean r2 = r0 instanceof com.avito.android.remote.model.RawParams.StringRawParams
            if (r2 == 0) goto L1a
            com.avito.android.remote.model.RawParams$StringRawParams r0 = (com.avito.android.remote.model.RawParams.StringRawParams) r0
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.getValue()
            goto L23
        L22:
            r0 = r1
        L23:
            java.lang.String r2 = "atTheTop"
            boolean r0 = kotlin.jvm.internal.L.f(r0, r2)
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r9.f83016d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.avito.android.advert_core.blocks.AdvertDetailsBlockItem r3 = (com.avito.android.advert_core.blocks.AdvertDetailsBlockItem) r3
            com.avito.android.remote.model.AdvertDetailsBlockId r3 = r3.f83011b
            com.avito.android.remote.model.AdvertDetailsBlockId r4 = com.avito.android.remote.model.AdvertDetailsBlockId.SAFE_DEAL
            if (r3 != r4) goto L33
            goto L48
        L47:
            r2 = r1
        L48:
            com.avito.android.advert_core.blocks.AdvertDetailsBlockItem r2 = (com.avito.android.advert_core.blocks.AdvertDetailsBlockItem) r2
            r0 = 1
            r3 = 0
            if (r2 != 0) goto L50
            goto Lbd
        L50:
            java.lang.Object r2 = r2.f83012c
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r4.next()
            boolean r7 = r6 instanceof com.avito.android.advert.item.safedeal.trust_factors.button.TrustFactorsButtonItem
            if (r7 == 0) goto L5e
            r5.add(r6)
            goto L5e
        L70:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L78
        L76:
            r4 = r3
            goto L93
        L78:
            java.util.Iterator r4 = r5.iterator()
        L7c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r4.next()
            com.avito.android.advert.item.safedeal.trust_factors.button.TrustFactorsButtonItem r5 = (com.avito.android.advert.item.safedeal.trust_factors.button.TrustFactorsButtonItem) r5
            java.lang.String r5 = r5.f79045b
            java.lang.String r6 = "buyButton"
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
            if (r5 == 0) goto L7c
            r4 = r0
        L93:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L9b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Laa
            java.lang.Object r5 = r2.next()
            boolean r6 = r5 instanceof com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.CombinedButtonsItem
            if (r6 == 0) goto L9b
            goto Lab
        Laa:
            r5 = r1
        Lab:
            boolean r2 = r5 instanceof com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.CombinedButtonsItem
            if (r2 != 0) goto Lb0
            goto Lb1
        Lb0:
            r1 = r5
        Lb1:
            com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.CombinedButtonsItem r1 = (com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.CombinedButtonsItem) r1
            if (r1 == 0) goto Lb7
            r1 = r0
            goto Lb8
        Lb7:
            r1 = r3
        Lb8:
            if (r4 != 0) goto Lc4
            if (r1 == 0) goto Lbd
            goto Lc4
        Lbd:
            boolean r9 = d(r9)
            if (r9 == 0) goto Lc4
            goto Lca
        Lc4:
            r0 = r3
            goto Lca
        Lc6:
            boolean r0 = d(r9)
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.block_factories.C27839f0.c(com.avito.android.advert_core.blocks.a$b):boolean");
    }
}
