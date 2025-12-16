package com.avito.android.reputation.ui.items.reputation_pie_chart;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: ReputationPieChartComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_pie_chart/e;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/reputation/ui/items/reputation_pie_chart/h;", "Lcom/avito/android/reputation/ui/items/reputation_pie_chart/a;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends AbstractC36333c<h, a> {
    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, h hVar) {
        a aVar = (a) view;
        h hVar2 = hVar;
        r rVar = hVar2.f254907b;
        aVar.setColor(rVar != null ? s(rVar) : C35835l0.d(R.attr.gray20, aVar.getContext()));
        aVar.setPercent(hVar2.f254906a);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new a(viewGroup.getContext(), null, 0, 6, null);
    }
}
