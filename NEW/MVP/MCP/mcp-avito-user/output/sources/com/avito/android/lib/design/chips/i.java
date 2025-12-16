package com.avito.android.lib.design.chips;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class i extends H implements Y41.p<Integer, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(Integer num, Boolean bool) {
        h hVarJ;
        Chips.c cVar;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        Chips chips = (Chips) this.receiver;
        RecyclerView.Adapter adapter = chips.f178693s.getAdapter();
        t tVar = adapter instanceof t ? (t) adapter : null;
        if (tVar != null) {
            tVar.notifyItemChanged(iIntValue);
            if (zBooleanValue && (hVarJ = tVar.j(iIntValue)) != null && (cVar = chips.chipsSelectedListener) != null) {
                cVar.b(hVarJ);
            }
        }
        return G0.f406611a;
    }
}
