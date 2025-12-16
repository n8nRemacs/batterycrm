package com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.V;
import com.akita.compose.foundation.p;
import com.avito.android.R;
import com.avito.android.lib.compose.design.shared.stepsbar.StepsBarView;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: DealProgressView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/deal_progress/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/deal_progress/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f137309b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final StepsBarView f137310c;

    public g(@k View view) {
        super(view);
        this.f137309b = view.getContext();
        StepsBarView stepsBarView = (StepsBarView) view.findViewById(R.id.stages);
        StepsBarView.j(stepsBarView, null, h.f137311a, 13);
        stepsBarView.setVisibleStepsCount(2);
        this.f137310c = stepsBarView;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress.f
    public final void U70(@l Float f12) {
        this.f137310c.setCurrentStepProgressValue(f12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress.f
    public final void eP(@k UniversalColor universalColor) {
        StepsBarView.j(this.f137310c, new p(V.b(C48063a.f437606a.a(this.f137309b, universalColor)), null), null, 14);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress.f
    public final void t4(@k List<com.avito.android.lib.compose.design.shared.stepsbar.b> list) {
        StepsBarView stepsBarView = this.f137310c;
        stepsBarView.setSteps(list);
        D6.G(stepsBarView, !list.isEmpty());
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress.f
    public final void wv(int i12) {
        this.f137310c.setStepPosition(i12);
    }
}
