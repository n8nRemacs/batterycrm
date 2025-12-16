package com.avito.android.crm_candidates.view.dialogs;

import Fc1.D3;
import Y61.k;
import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Enrichment;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.util.I5;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmResultsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/dialogs/h;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f129989E = 0;

    /* compiled from: JobCrmResultsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.adapter.d f129990l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.konveyor.adapter.d dVar) {
            super(0);
            this.f129990l = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f129990l.l(C42784z0.f406748b, null);
            return G0.f406611a;
        }
    }

    public h(@k Context context, @k Enrichment enrichment, @k com.avito.konveyor.adapter.d dVar) {
        super(context, 0, 2, null);
        setContentView(R.layout.job_employers_crm_candidates_enrichment_fragment);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        I5.a((TextView) findViewById(R.id.enrichment_title), enrichment.f129998b, false);
        DockingBadge dockingBadge = (DockingBadge) findViewById(R.id.overview_text);
        String str = enrichment.f130000d;
        if (str != null) {
            dockingBadge.setText(str);
        }
        DockingBadgeType.Predefined predefined = enrichment.f130001e;
        if (predefined != null) {
            DockingBadgeEdgeType dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
            DockingBadgeEdgeType dockingBadgeEdgeType2 = DockingBadgeEdgeType.Pipka;
            int i12 = DockingBadge.f179108i;
            dockingBadge.d(predefined, DockingBadgeSize.MEDIUM, dockingBadgeEdgeType, dockingBadgeEdgeType2);
        }
        I5.a((TextView) findViewById(R.id.enrichment_description), enrichment.f129999c, false);
        I5.a((TextView) findViewById(R.id.properties_title), enrichment.f130002f, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.properties_list);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(dVar);
        ArrayList arrayList = enrichment.f130003g;
        if (arrayList != null) {
            dVar.l(arrayList, null);
        }
        R(new a(dVar));
        setOnCancelListener(new D3(dVar, 4));
    }
}
