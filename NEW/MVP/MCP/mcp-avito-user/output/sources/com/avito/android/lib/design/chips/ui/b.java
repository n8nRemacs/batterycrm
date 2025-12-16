package com.avito.android.lib.design.chips.ui;

import Y41.l;
import Y41.p;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.chips.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class b extends H implements p<Integer, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(Integer num, Boolean bool) {
        h hVarJ;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        Chips chips = (Chips) this.receiver;
        int i12 = Chips.f178782K0;
        RecyclerView.Adapter adapter = chips.getAdapter();
        f fVar = adapter instanceof f ? (f) adapter : null;
        if (fVar != null && zBooleanValue && (hVarJ = fVar.j(iIntValue)) != null) {
            d dVar = chips.f178787J0;
            dVar.getClass();
            l<Boolean, G0> lVarL = hVarJ.L();
            if (lVarL != null) {
                lVarL.invoke(Boolean.FALSE);
            }
            p<h, Boolean, G0> pVar = dVar.f178790a.getF178786I0().f178755e;
            if (pVar != null) {
                pVar.invoke(hVarJ, Boolean.FALSE);
            }
        }
        return G0.f406611a;
    }
}
