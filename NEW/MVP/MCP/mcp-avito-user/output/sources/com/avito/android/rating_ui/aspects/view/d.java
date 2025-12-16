package com.avito.android.rating_ui.aspects.view;

import Y41.l;
import Y41.p;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.chips.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;

/* compiled from: RatingAspectsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class d extends H implements p<Integer, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(Integer num, Boolean bool) {
        h hVar;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        RatingAspectsView ratingAspectsView = (RatingAspectsView) this.receiver;
        int i12 = RatingAspectsView.f249894J0;
        RecyclerView.Adapter adapter = ratingAspectsView.getAdapter();
        a aVar = adapter instanceof a ? (a) adapter : null;
        if (aVar != null && zBooleanValue && (hVar = (h) C42745f0.K(iIntValue, aVar.f249902f)) != null) {
            ratingAspectsView.f249898I0.getClass();
            l<Boolean, G0> lVarL = hVar.L();
            if (lVarL != null) {
                lVarL.invoke(Boolean.TRUE);
            }
        }
        return G0.f406611a;
    }
}
