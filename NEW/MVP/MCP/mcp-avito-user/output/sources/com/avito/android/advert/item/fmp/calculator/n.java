package com.avito.android.advert.item.fmp.calculator;

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

/* compiled from: AdvertDetailsFmpCalculatorView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class n extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f75527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Chips f75528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f75529n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, Chips chips, ArrayList arrayList) {
        super(2);
        this.f75527l = mVar;
        this.f75528m = chips;
        this.f75529n = arrayList;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        bool.getClass();
        ItemChipable itemChipable = hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null;
        if (itemChipable != null) {
            m mVar = this.f75527l;
            Y41.l<? super Integer, G0> lVar = mVar.f75513j;
            int i12 = itemChipable.f178762b;
            if (lVar != null) {
                ((f) lVar).invoke(Integer.valueOf(i12));
            }
            ArrayList<ItemChipable> arrayList = this.f75529n;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (ItemChipable itemChipable2 : arrayList) {
                arrayList2.add(ItemChipable.a(itemChipable2, itemChipable2.f178762b == i12, null, 495));
            }
            ChipsState.DisplayType displayType = ChipsState.DisplayType.f178758d;
            Chips chips = this.f75528m;
            chips.setState(new ChipsState(0, displayType, null, arrayList2, new n(mVar, chips, arrayList2), 1, null));
        }
        return G0.f406611a;
    }
}
