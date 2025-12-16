package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.foundation.lazy.grid.InterfaceC20662b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SelectorCardGrid.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/r;", "Landroidx/compose/foundation/lazy/grid/b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements InterfaceC20662b {
    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20662b
    @Y61.k
    public final List<Integer> a(@Y61.k androidx.compose.ui.unit.d dVar, int i12, int i13) {
        int i14 = i12 - i13;
        int i15 = i14 / 2;
        return C42745f0.U(Integer.valueOf(i15), Integer.valueOf(i14 - i15));
    }
}
