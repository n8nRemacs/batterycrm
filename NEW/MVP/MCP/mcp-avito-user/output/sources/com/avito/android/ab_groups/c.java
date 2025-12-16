package com.avito.android.ab_groups;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import q3.C47189a;

/* compiled from: AbExperimentsActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class c extends H implements Y41.l<C47189a, G0> {
    public final void f(@Y61.k C47189a c47189a) {
        AbExperimentsActivity abExperimentsActivity = (AbExperimentsActivity) this.receiver;
        int i12 = AbExperimentsActivity.f67644v;
        View viewInflate = abExperimentsActivity.getLayoutInflater().inflate(R.layout.ab_groups_dialog, (ViewGroup) null);
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, abExperimentsActivity, new h(viewInflate));
        com.avito.android.lib.util.g.a(aVarC);
        abExperimentsActivity.f67653u = aVarC;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.ab_groups_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new x(new i(abExperimentsActivity, c47189a), c47189a.a()));
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(C47189a c47189a) {
        f(c47189a);
        return G0.f406611a;
    }
}
