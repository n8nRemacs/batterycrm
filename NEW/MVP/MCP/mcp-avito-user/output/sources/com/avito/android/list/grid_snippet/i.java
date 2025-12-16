package com.avito.android.list.grid_snippet;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GridSnippetsBlockView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/grid_snippet/i;", "Lcom/avito/android/list/grid_snippet/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f181571b;

    public i(@k View view, @k com.avito.android.list.grid_snippet.item.a aVar) throws BlueprintCollisionException {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view;
        int i12 = view.getContext().getResources().getConfiguration().orientation;
        int i13 = 2;
        if (i12 != 1 && i12 == 2) {
            i13 = 4;
        }
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(i13));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f181571b = hVar;
        recyclerView.setAdapter(new j(hVar, aVarA));
        recyclerView.l(new com.avito.android.list.grid_snippet.item.g(i13, D6.i(8, view.getContext()), D6.i(20, view.getContext())), -1);
    }

    @Override // com.avito.android.list.grid_snippet.h
    public final void B(@k List<com.avito.android.list.grid_snippet.item.c> list) {
        this.f181571b.f338510e = new UV0.c(list);
    }
}
