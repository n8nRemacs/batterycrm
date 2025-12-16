package com.avito.android.vas_discount.v2.ui;

import Y41.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.vas_discount.v2.ui.VasDiscountV2DialogFragment;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VasDiscountV2DialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class d extends H implements l<qL0.c, G0> {
    @Override // Y41.l
    public final G0 invoke(qL0.c cVar) {
        qL0.c cVar2 = cVar;
        VasDiscountV2DialogFragment vasDiscountV2DialogFragment = (VasDiscountV2DialogFragment) this.receiver;
        VasDiscountV2DialogFragment.a aVar = VasDiscountV2DialogFragment.f319825s0;
        vasDiscountV2DialogFragment.getClass();
        if (cVar2.f429204d) {
            RecyclerView recyclerView = vasDiscountV2DialogFragment.f319835q0;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            com.avito.android.progress_overlay.l lVar = vasDiscountV2DialogFragment.f319836r0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (cVar2.f429203c != null) {
            RecyclerView recyclerView2 = vasDiscountV2DialogFragment.f319835q0;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            com.avito.android.progress_overlay.l lVar2 = vasDiscountV2DialogFragment.f319836r0;
            (lVar2 != null ? lVar2 : null).a("");
        } else {
            RecyclerView recyclerView3 = vasDiscountV2DialogFragment.f319835q0;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
            com.avito.android.progress_overlay.l lVar3 = vasDiscountV2DialogFragment.f319836r0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.j();
            com.avito.konveyor.adapter.a aVar2 = vasDiscountV2DialogFragment.f319832n0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.c(new UV0.c(cVar2.f429202b));
            j jVar = vasDiscountV2DialogFragment.f319833o0;
            (jVar != null ? jVar : null).notifyDataSetChanged();
        }
        return G0.f406611a;
    }
}
