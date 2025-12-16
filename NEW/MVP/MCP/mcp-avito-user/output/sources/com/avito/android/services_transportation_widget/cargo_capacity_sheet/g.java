package com.avito.android.services_transportation_widget.cargo_capacity_sheet;

import Av0.C13086b;
import Av0.C13089e;
import Y41.l;
import android.view.View;
import androidx.recyclerview.widget.C23418i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.C43259k;

/* compiled from: ServiceTransportationCardSelectSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class g extends H implements l<View, G0> {
    @Override // Y41.l
    public final G0 invoke(View view) {
        j jVar = (j) this.receiver;
        C13089e c13089e = jVar.f280493I;
        c13089e.setHasStableIds(true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardSelectRecycler);
        jVar.f280491G = recyclerView;
        if (recyclerView != null) {
            jVar.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = jVar.f280491G;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c13089e);
        }
        RecyclerView recyclerView3 = jVar.f280491G;
        if (recyclerView3 != null) {
            recyclerView3.l(new C13086b(), -1);
        }
        RecyclerView recyclerView4 = jVar.f280491G;
        if (recyclerView4 != null) {
            C23418i c23418i = new C23418i();
            c23418i.f53727g = false;
            recyclerView4.setItemAnimator(c23418i);
        }
        e eVar = jVar.f280490F;
        eVar.getClass();
        C43259k.d(eVar.f280483f, null, null, new d(eVar, null), 3);
        return G0.f406611a;
    }
}
