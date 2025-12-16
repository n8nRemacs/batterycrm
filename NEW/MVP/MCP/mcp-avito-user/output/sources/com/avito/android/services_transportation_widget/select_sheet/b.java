package com.avito.android.services_transportation_widget.select_sheet;

import Y41.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ServiceTransportationSelectSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class b extends H implements l<View, G0> {
    @Override // Y41.l
    public final G0 invoke(View view) {
        d dVar = (d) this.receiver;
        a aVar = dVar.f280689G;
        aVar.setHasStableIds(true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.selectItemsRecycler);
        dVar.f280688F = recyclerView;
        if (recyclerView != null) {
            dVar.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = dVar.f280688F;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(aVar);
        }
        aVar.f280682d = dVar.f280687E;
        return G0.f406611a;
    }
}
