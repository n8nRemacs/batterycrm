package com.avito.android.advert.item.complementary;

import Y41.p;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.section.chips.SectionChip;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComplementaryBottomSheetView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<SectionChip> f74587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f74588m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<SectionChip> list, f fVar) {
        super(2);
        this.f74587l = list;
        this.f74588m = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        bool.getClass();
        ItemChipable itemChipable = hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null;
        if (itemChipable != null) {
            List<SectionChip> list = this.f74587l;
            int size = list.size();
            int i12 = itemChipable.f178762b;
            if (i12 < size) {
                this.f74588m.f74591c.m(list.get(i12).f264617b);
            }
        }
        return G0.f406611a;
    }
}
