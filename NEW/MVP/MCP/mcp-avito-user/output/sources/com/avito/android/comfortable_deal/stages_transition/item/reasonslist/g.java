package com.avito.android.comfortable_deal.stages_transition.item.reasonslist;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.konveyor.adapter.j;
import fq.InterfaceC40463a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ReasonsListView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f122920b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public j f122921c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f122922d;

    public g(@k View view, @k l<? super InterfaceC40463a, G0> lVar) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.reasons_recycler);
        this.f122920b = recyclerView;
        com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di.a.a().a(lVar).a(this);
        j jVar = this.f122921c;
        jVar = jVar == null ? null : jVar;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        recyclerView.setHasFixedSize(true);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.reasonslist.f
    @SuppressLint({"NotifyDataSetChanged"})
    public final void IC() {
        D6.w(this.f122920b);
        com.avito.konveyor.adapter.a aVar = this.f122922d;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c(new UV0.c(C42784z0.f406748b));
        j jVar = this.f122921c;
        (jVar != null ? jVar : null).notifyDataSetChanged();
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.reasonslist.f
    @SuppressLint({"NotifyDataSetChanged"})
    public final void nM(@k List<com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.c> list) {
        D6.H(this.f122920b);
        com.avito.konveyor.adapter.a aVar = this.f122922d;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
        j jVar = this.f122921c;
        (jVar != null ? jVar : null).notifyDataSetChanged();
    }
}
