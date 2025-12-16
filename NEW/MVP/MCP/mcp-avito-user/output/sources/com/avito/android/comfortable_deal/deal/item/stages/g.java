package com.avito.android.comfortable_deal.deal.item.stages;

import Y61.k;
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

/* compiled from: StagesView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/stages/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/stages/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f121532b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final StepsBarView f121533c;

    public g(@k View view) {
        super(view);
        this.f121532b = view.getContext();
        StepsBarView stepsBarView = (StepsBarView) view.findViewById(R.id.stages);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        StepsBarView.j(stepsBarView, null, com.akita.compose.theme.re23.b.f63984b.f63933j0, 13);
        stepsBarView.setVisibleStepsCount(3);
        stepsBarView.setLastStepHasProgressDone(true);
        stepsBarView.setLastInfoEndAlignment(true);
        this.f121533c = stepsBarView;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.stages.f
    public final void Xg(int i12) {
        this.f121533c.setStepPosition(i12);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.stages.f
    public final void fz(@k UniversalColor universalColor) {
        StepsBarView.j(this.f121533c, new p(V.b(C48063a.f437606a.a(this.f121532b, universalColor)), null), null, 14);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.stages.f
    public final void t4(@k List<com.avito.android.lib.compose.design.shared.stepsbar.b> list) {
        StepsBarView stepsBarView = this.f121533c;
        stepsBarView.setSteps(list);
        D6.G(stepsBarView, !list.isEmpty());
    }
}
