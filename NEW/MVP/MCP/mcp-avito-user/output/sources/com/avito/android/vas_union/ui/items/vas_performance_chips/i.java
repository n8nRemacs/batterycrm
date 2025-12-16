package com.avito.android.vas_union.ui.items.vas_performance_chips;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasUnionV2PerformanceChipsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_chips/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_union/ui/items/vas_performance_chips/h;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f323313b;

    /* compiled from: VasUnionV2PerformanceChipsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "selected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<Integer, G0> f323314l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Integer, G0> lVar) {
            super(2);
            this.f323314l = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
            com.avito.android.lib.design.chips.h hVar2 = hVar;
            boolean zBooleanValue = bool.booleanValue();
            ItemChipable itemChipable = hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null;
            if (itemChipable != null && zBooleanValue) {
                this.f323314l.invoke(Integer.valueOf(itemChipable.f178762b));
            }
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        Chips chips = (Chips) view.findViewById(R.id.vas_union_v2_performance_chips_item);
        this.f323313b = chips;
        g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
        Context context = view.getContext();
        bVar.getClass();
        chips.setStyle(g.b.c(R.style.Re23_Chips_Large, context));
    }

    @Override // com.avito.android.vas_union.ui.items.vas_performance_chips.h
    public final void I5(@k l lVar, @k List list) {
        this.f323313b.setState(new ChipsState(0, ChipsState.DisplayType.f178757c, null, list, new a(lVar), 5, null));
    }
}
