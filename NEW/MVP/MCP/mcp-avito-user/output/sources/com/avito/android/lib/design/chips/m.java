package com.avito.android.lib.design.chips;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class m extends H implements Y41.p<Boolean, Integer, G0> {
    @Override // Y41.p
    public final G0 invoke(Boolean bool, Integer num) {
        h hVarJ;
        Chips.b bVar;
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        Chips chips = (Chips) this.receiver;
        RecyclerView.Adapter adapter = chips.f178693s.getAdapter();
        t tVar = adapter instanceof t ? (t) adapter : null;
        if (tVar != null && (hVarJ = tVar.j(iIntValue)) != null && (bVar = chips.chipsSelectConditionListener) != null) {
            bVar.c(hVarJ, zBooleanValue);
        }
        return G0.f406611a;
    }
}
