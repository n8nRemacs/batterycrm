package com.avito.android.section.chips;

import Y41.l;
import Y41.p;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SectionChipsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f264629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<String, G0> f264630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Chips f264631n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f264632o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, l lVar, Chips chips, ArrayList arrayList) {
        super(2);
        this.f264629l = eVar;
        this.f264630m = lVar;
        this.f264631n = chips;
        this.f264632o = arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        bool.getClass();
        ItemChipable itemChipable = hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null;
        if (itemChipable != null) {
            e eVar = this.f264629l;
            int size = eVar.f264635d.size();
            l<String, G0> lVar = this.f264630m;
            int i12 = itemChipable.f178762b;
            if (i12 < size) {
                ((g) lVar).invoke(((SectionChip) eVar.f264635d.get(i12)).f264617b);
            }
            ArrayList<ItemChipable> arrayList = this.f264632o;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (ItemChipable itemChipable2 : arrayList) {
                arrayList2.add(ItemChipable.a(itemChipable2, itemChipable2.f178762b == i12, null, 495));
            }
            ChipsState.DisplayType displayType = ChipsState.DisplayType.f178758d;
            Chips chips = this.f264631n;
            chips.setState(new ChipsState(0, displayType, null, arrayList2, new d(eVar, lVar, chips, arrayList2), 1, null));
            chips.invalidate();
        }
        return G0.f406611a;
    }
}
