package com.avito.android.sbc.autodispatcheslist;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchesListView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/h;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f259110a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f259111b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f259112c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final i f259113d;

    public h(@k View view, @k com.avito.konveyor.adapter.d dVar, @l Boolean bool, @k Y41.a<G0> aVar) {
        this.f259110a = view;
        this.f259111b = dVar;
        this.f259112c = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sbc_auto_dispatches_list);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        i iVar = new i(linearLayoutManager, aVar);
        this.f259113d = iVar;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(dVar);
        recyclerView.o(iVar);
        recyclerView.setTag(L.f(bool, Boolean.TRUE) ? "active" : "inactive");
    }
}
