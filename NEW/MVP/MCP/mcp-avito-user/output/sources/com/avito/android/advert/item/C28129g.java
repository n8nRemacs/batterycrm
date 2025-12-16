package com.avito.android.advert.item;

import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.advert.item.commercials.AdvertSerpCommercialBanner;
import com.avito.android.advert.item.multi_item.AdvertDetailsMultiItemItem;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.AdvertDetailsSafeDealPaymentBlockItem;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.blocks.AdvertDetailsBlockItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDetailsBlock;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertDetailsBlocksPresenter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/g;", "Lcom/avito/android/advert/item/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28129g implements InterfaceC27811a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFastOpenParams f75640a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsMultiItemState f75641b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.multi_item.b f75642c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.blocks.b f75643d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f75644e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.sellersubscription.p f75645f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.recomendations.j f75646g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.a f75647h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.commercials.f f75648i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.trust_factors.f f75649j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final h2 f75650k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C43238h f75651l;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public I1 f75653n;

    /* renamed from: q, reason: collision with root package name */
    public int f75656q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f75657r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f75659t;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.e2 f75652m = kotlinx.coroutines.flow.f2.b(0, 1, null, 5);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ArrayList f75654o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public ArrayList f75655p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public int f75658s = -1;

    @Inject
    public C28129g(@Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @Y61.l AdvertDetailsMultiItemState advertDetailsMultiItemState, @Y61.k com.avito.android.advert.item.multi_item.b bVar, @Y61.k com.avito.android.advert_core.blocks.b bVar2, @Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert.item.sellersubscription.p pVar, @Y61.k com.avito.android.serp.adapter.recomendations.j jVar2, @Y61.k com.avito.android.advert.item.similars.a aVar, @Y61.k com.avito.android.advert.item.commercials.f fVar, @Y61.k com.avito.android.advert.item.safedeal.trust_factors.f fVar2, @Y61.k h2 h2Var, @Y61.k com.avito.android.util.R0 r02) {
        AdvertDetailsMultiItemState.ParamsState paramsState;
        AdvertDetailsMultiItemState.ParamsItemState paramsItemState;
        this.f75640a = advertDetailsFastOpenParams;
        this.f75641b = advertDetailsMultiItemState;
        this.f75642c = bVar;
        this.f75643d = bVar2;
        this.f75644e = jVar;
        this.f75645f = pVar;
        this.f75646g = jVar2;
        this.f75647h = aVar;
        this.f75648i = fVar;
        this.f75649j = fVar2;
        this.f75650k = h2Var;
        this.f75651l = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((kotlinx.coroutines.V0) kotlinx.coroutines.t1.b(), r02.d()));
        if (advertDetailsMultiItemState == null || (paramsState = advertDetailsMultiItemState.f85869c) == null || (paramsItemState = paramsState.f85875c) == null) {
            return;
        }
        bVar.f77727a = paramsItemState;
    }

    public final void D() {
        ArrayList arrayList = this.f75654o;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((AdvertDetailsBlockItem) it.next()).f83011b == AdvertDetailsBlockId.COMPLEMENTARY_ITEMS) {
                break;
            } else {
                i12++;
            }
        }
        if (this.f75655p.isEmpty() || i12 <= -1) {
            return;
        }
        this.f75655p.clear();
        arrayList.set(i12, AdvertDetailsBlockItem.a((AdvertDetailsBlockItem) arrayList.get(i12), C42784z0.f406748b));
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    @Y61.k
    public final Bundle H() {
        D();
        Bundle bundle = new Bundle();
        com.avito.android.util.G.e("advertBlocks", bundle, this.f75654o);
        bundle.putInt("prevColumns", this.f75656q);
        bundle.putBoolean("multiItemStateConsumed", this.f75657r);
        com.avito.android.util.G.c(bundle, "expandable_section_state", this.f75646g.l1());
        com.avito.android.util.G.c(bundle, "complementaryBlocks", this.f75647h.d0());
        com.avito.android.util.G.c(bundle, "commercialsBlocks", this.f75648i.d0());
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void O(int i12, long j12) {
        AdvertDetailsGalleryItem next;
        ArrayList arrayList = this.f75654o;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h((Iterable) ((AdvertDetailsBlockItem) it.next()).f83012c, arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = 0;
                break;
            }
            next = it2.next();
            PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) next;
            if ((persistableSpannedItem instanceof AdvertDetailsGalleryItem) && ((AdvertDetailsGalleryItem) persistableSpannedItem).f85013l == j12) {
                break;
            }
        }
        AdvertDetailsGalleryItem advertDetailsGalleryItem = next instanceof AdvertDetailsGalleryItem ? next : null;
        if (advertDetailsGalleryItem == null) {
            return;
        }
        advertDetailsGalleryItem.f85012k = i12;
    }

    @Override // com.avito.android.advert.item.Q
    @Y61.k
    public final ArrayList a() {
        ArrayList arrayList = this.f75654o;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h((Iterable) ((AdvertDetailsBlockItem) it.next()).f83012c, arrayList2);
        }
        return C42745f0.B(arrayList2, SellerSubscriptionItem.class);
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void b(@Y61.k Bundle bundle) {
        this.f75656q = bundle.getInt("prevColumns", 0);
        boolean z12 = bundle.getBoolean("multiItemStateConsumed", false);
        this.f75657r = z12;
        if (z12) {
            this.f75642c.f77727a = null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("advertBlocks");
        if (parcelableArrayList != null) {
            ArrayList arrayList = this.f75654o;
            arrayList.clear();
            arrayList.addAll(parcelableArrayList);
        }
        Kundle kundleA = com.avito.android.util.G.a(bundle, "expandable_section_state");
        if (kundleA != null) {
            this.f75646g.f0(kundleA);
        }
        Kundle kundleA2 = com.avito.android.util.G.a(bundle, "complementaryBlocks");
        if (kundleA2 != null) {
            this.f75647h.f0(kundleA2);
        }
        Kundle kundleA3 = com.avito.android.util.G.a(bundle, "commercialsBlocks");
        if (kundleA3 != null) {
            this.f75648i.f0(kundleA3);
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void c(@Y61.k PaymentBlockItemState paymentBlockItemState) {
        AdvertDetailsBlockId advertDetailsBlockId = AdvertDetailsBlockId.SAFE_DEAL_PAYMENT_BLOCK;
        ArrayList arrayList = this.f75654o;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((AdvertDetailsBlockItem) it.next()).f83011b == advertDetailsBlockId) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            AdvertDetailsBlockItem advertDetailsBlockItem = (AdvertDetailsBlockItem) arrayList.get(i12);
            Iterable<PersistableSpannedItem> iterable = (Iterable) advertDetailsBlockItem.f83012c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            PersistableSpannedItem persistableSpannedItem = null;
            for (PersistableSpannedItem persistableSpannedItemB : iterable) {
                if (persistableSpannedItemB instanceof AdvertDetailsSafeDealPaymentBlockItem) {
                    persistableSpannedItemB = AdvertDetailsSafeDealPaymentBlockItem.b((AdvertDetailsSafeDealPaymentBlockItem) persistableSpannedItemB, 0, paymentBlockItemState, 31);
                    persistableSpannedItem = persistableSpannedItemB;
                }
                arrayList2.add(persistableSpannedItemB);
            }
            arrayList.set(i12, AdvertDetailsBlockItem.a(advertDetailsBlockItem, arrayList2));
            I1 i13 = this.f75653n;
            if (i13 != null) {
                i13.k0(persistableSpannedItem);
            }
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void clearItems() {
        this.f75654o.clear();
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void d(@Y61.k List<? extends TrustFactorsComponent> list, boolean z12) {
        Object next;
        ArrayList arrayList = this.f75654o;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((AdvertDetailsBlockItem) it.next()).f83011b == AdvertDetailsBlockId.SAFE_DEAL) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            return;
        }
        Iterator it2 = ((Iterable) ((AdvertDetailsBlockItem) arrayList.get(i12)).f83012c).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((PersistableSpannedItem) next) instanceof AdvertDetailsGapItem) {
                    break;
                }
            }
        }
        PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) next;
        ArrayList arrayListA = com.avito.android.advert.item.safedeal.trust_factors.g.a(this.f75649j, list);
        if (persistableSpannedItem != null) {
            arrayListA = C42745f0.h0(arrayListA, Collections.singletonList(persistableSpannedItem));
        }
        arrayList.set(i12, AdvertDetailsBlockItem.a((AdvertDetailsBlockItem) arrayList.get(i12), arrayListA));
        i(this.f75658s, z12);
    }

    @Override // com.avito.android.advert.item.Q
    public final void e(@Y61.k PersistableSpannedItem persistableSpannedItem) {
        ArrayList arrayList = this.f75654o;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        loop0: while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            Iterable iterable = (Iterable) ((AdvertDetailsBlockItem) it.next()).f83012c;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.L.f(((PersistableSpannedItem) it2.next()).getF173942b(), persistableSpannedItem.getF173942b())) {
                        break loop0;
                    }
                }
            }
            i12++;
        }
        if (i12 < 0) {
            return;
        }
        AdvertDetailsBlockItem advertDetailsBlockItem = (AdvertDetailsBlockItem) arrayList.get(i12);
        Iterable<PersistableSpannedItem> iterable2 = (Iterable) advertDetailsBlockItem.f83012c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable2, 10));
        for (PersistableSpannedItem persistableSpannedItem2 : iterable2) {
            if (kotlin.jvm.internal.L.f(persistableSpannedItem.getF173942b(), persistableSpannedItem2.getF173942b())) {
                persistableSpannedItem2 = persistableSpannedItem;
            }
            arrayList2.add(persistableSpannedItem2);
        }
        arrayList.set(i12, AdvertDetailsBlockItem.a(advertDetailsBlockItem, arrayList2));
        I1 i13 = this.f75653n;
        if (i13 != null) {
            i13.i0(persistableSpannedItem);
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC27811a
    public final void e0() {
        kotlinx.coroutines.Q0.d(this.f75651l.f411905b);
        D();
        I1 i12 = this.f75653n;
        if (i12 != null) {
            i12.J();
        }
        this.f75653n = null;
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void f(@Y61.k String str) {
        AdvertDetailsBlockId advertDetailsBlockId = AdvertDetailsBlockId.SAFE_DEAL;
        ArrayList arrayList = this.f75654o;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((AdvertDetailsBlockItem) it.next()).f83011b == advertDetailsBlockId) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            AdvertDetailsBlockItem advertDetailsBlockItem = (AdvertDetailsBlockItem) arrayList.get(i12);
            Iterable<PersistableSpannedItem> iterable = (Iterable) advertDetailsBlockItem.f83012c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            TrustFactorsItem trustFactorsItemS3 = null;
            for (PersistableSpannedItem persistableSpannedItem : iterable) {
                if (persistableSpannedItem instanceof TrustFactorsItem) {
                    TrustFactorsItem trustFactorsItem = (TrustFactorsItem) persistableSpannedItem;
                    if (kotlin.jvm.internal.L.f(trustFactorsItem.getF173942b(), str)) {
                        trustFactorsItemS3 = trustFactorsItem.S3(null);
                        persistableSpannedItem = trustFactorsItemS3;
                    }
                }
                arrayList2.add(persistableSpannedItem);
            }
            arrayList.set(i12, AdvertDetailsBlockItem.a(advertDetailsBlockItem, arrayList2));
            I1 i13 = this.f75653n;
            if (i13 != null) {
                i13.i0(trustFactorsItemS3);
            }
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void h(@Y61.k AdvertDetailsWithMeta advertDetailsWithMeta) {
        AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
        this.f75659t = advertDetails.getAdvertisingDisabled();
        if (advertDetails.getRenderByBeduin()) {
            return;
        }
        ArrayList arrayList = this.f75654o;
        boolean zIsEmpty = arrayList.isEmpty();
        com.avito.android.advert.item.similars.j jVar = this.f75644e;
        if (zIsEmpty) {
            this.f75656q = jVar.a();
            C28131g1.f75660a.getClass();
            AdvertDetailsFastOpenParams advertDetailsFastOpenParams = this.f75640a;
            AdvertDetailsStyle advertDetailsStyleA = C28131g1.a(advertDetailsFastOpenParams, advertDetails);
            List<AdvertDetailsBlock> blocks = advertDetails.getBlocks();
            if (blocks == null) {
                blocks = C42784z0.f406748b;
            }
            arrayList.addAll(this.f75643d.a(blocks, advertDetailsWithMeta, advertDetailsStyleA));
            this.f75658s = j().size();
            i(j().size(), true);
            String categoryId = advertDetails.getCategoryId();
            AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
            this.f75650k.d(categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null).c(C28131g1.a(advertDetailsFastOpenParams, advertDetails)).a(j()).b();
        } else {
            int iA2 = jVar.a();
            if (this.f75656q != iA2) {
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AdvertDetailsBlockItem advertDetailsBlockItem = (AdvertDetailsBlockItem) it.next();
                    Iterable<Parcelable> iterable = (Iterable) advertDetailsBlockItem.f83012c;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(iterable, 10));
                    for (Parcelable parcelableK5 : iterable) {
                        if ((parcelableK5 instanceof BlockItem) && (parcelableK5 instanceof com.avito.android.serp.adapter.l1) && ((com.avito.android.serp.adapter.l1) parcelableK5).getF78302f() == SerpViewType.f268585e) {
                            parcelableK5 = ((BlockItem) parcelableK5).K5(iA2);
                        }
                        arrayList3.add(parcelableK5);
                    }
                    arrayList2.add(AdvertDetailsBlockItem.a(advertDetailsBlockItem, arrayList3));
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.clear();
                    arrayList.addAll(arrayList2);
                }
                this.f75656q = iA2;
            }
            this.f75647h.e();
        }
        this.f75645f.b(this);
        this.f75652m.K5(kotlin.G0.f406611a);
    }

    public final void i(int i12, boolean z12) {
        I1 i13;
        ArrayList arrayListJ = j();
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListJ, 10));
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a commercialSerpItem = (PersistableSpannedItem) it.next();
            if (commercialSerpItem instanceof AdvertSerpCommercialBanner) {
                commercialSerpItem = ((AdvertSerpCommercialBanner) commercialSerpItem).getCommercialSerpItem();
            }
            arrayList.add(commercialSerpItem);
        }
        I1 i14 = this.f75653n;
        if (i14 != null) {
            i14.A(i12, arrayList, z12);
        }
        AdvertDetailsMultiItemState advertDetailsMultiItemState = this.f75641b;
        if (advertDetailsMultiItemState == null || this.f75657r) {
            return;
        }
        this.f75657r = true;
        Iterator it2 = arrayList.iterator();
        int i15 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i15 = -1;
                break;
            } else if (((com.avito.android.serp.adapter.i1) it2.next()) instanceof AdvertDetailsMultiItemItem) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 < 0 || (i13 = this.f75653n) == null) {
            return;
        }
        AdvertDetailsMultiItemState.ParamsState paramsState = advertDetailsMultiItemState.f85869c;
        i13.O(i15, paramsState != null ? paramsState.f85874b : 0);
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f75654o;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h((Iterable) ((AdvertDetailsBlockItem) it.next()).f83012c, arrayList2);
        }
        return arrayList2;
    }

    @Override // com.avito.android.advert.item.InterfaceC27811a
    public final void k(@Y61.l I1 i12) {
        this.f75653n = i12;
        C43175k.K(new C43197r1(new C28123e(2, this, C28129g.class, "bindComplementarySection", "bindComplementarySection(Lcom/avito/android/advert/item/similars/ComplementarySection;)V", 4), C43175k.Y(this.f75652m, new C27815b(null, this))), this.f75651l);
    }
}
