package com.avito.android.advert_core.blocks;

import Y61.k;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.BottomOffsetProviderItem;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertDetailsBlock;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: AdvertDetailsCompositeBlocksFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/blocks/e;", "Lcom/avito/android/advert_core/blocks/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<AdvertDetailsBlockId, a> f83019a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f83020b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f83021c;

    @Inject
    public e(@k Map<AdvertDetailsBlockId, a> map, @k h hVar, @k g gVar) {
        this.f83019a = map;
        this.f83020b = hVar;
        this.f83021c = gVar;
    }

    @Override // com.avito.android.advert_core.blocks.b
    @k
    public final ArrayList a(@k List list, @k AdvertDetailsWithMeta advertDetailsWithMeta, @k AdvertDetailsStyle advertDetailsStyle) {
        h hVar;
        List<PersistableSpannedItem> listB;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            hVar = this.f83020b;
            if (!zHasNext) {
                break;
            }
            AdvertDetailsBlock advertDetailsBlock = (AdvertDetailsBlock) it.next();
            AdvertDetailsBlockId id2 = advertDetailsBlock.getId();
            if (id2 != null) {
                a.b bVar = new a.b(advertDetailsWithMeta, advertDetailsStyle, advertDetailsBlock, arrayList);
                a aVar = this.f83019a.get(id2);
                if (aVar != null && (listB = aVar.b(bVar)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Integer offset = advertDetailsBlock.getOffset();
                    Integer addHeadingSeparatorWithOffset = advertDetailsBlock.getAddHeadingSeparatorWithOffset();
                    Integer addTrailingSeparatorWithOffset = advertDetailsBlock.getAddTrailingSeparatorWithOffset();
                    g gVar = this.f83021c;
                    if (addHeadingSeparatorWithOffset != null) {
                        arrayList2.add(gVar.a(y6.b(addHeadingSeparatorWithOffset.intValue())));
                    }
                    if (offset != null) {
                        arrayList2.add(hVar.a(offset.intValue()));
                    }
                    arrayList2.addAll(listB);
                    if (addTrailingSeparatorWithOffset != null) {
                        arrayList2.add(gVar.a(y6.b(addTrailingSeparatorWithOffset.intValue())));
                    }
                    arrayList.add(new AdvertDetailsBlockItem(id2, arrayList2));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AdvertDetailsBlockItem advertDetailsBlockItem = (AdvertDetailsBlockItem) C42745f0.Q(arrayList);
            Collection collection = (Collection) ((AdvertDetailsBlockItem) C42745f0.Q(arrayList)).f83012c;
            new BottomOffsetProviderItem.b();
            C43025h.a aVar2 = new C43025h.a(C43033p.i(C43033p.p(new C42770s0(arrayList), d.f83018l), c.f83017l));
            int iR2 = 0;
            while (aVar2.hasNext()) {
                iR2 += ((BottomOffsetProviderItem) aVar2.next()).r2();
            }
            if (iR2 < 64) {
                iR2 = 64;
            }
            AdvertDetailsBlockItem advertDetailsBlockItemA = AdvertDetailsBlockItem.a(advertDetailsBlockItem, C42745f0.i0(hVar.a(iR2 + 32), collection));
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(advertDetailsBlockItemA);
        }
        return arrayList;
    }
}
