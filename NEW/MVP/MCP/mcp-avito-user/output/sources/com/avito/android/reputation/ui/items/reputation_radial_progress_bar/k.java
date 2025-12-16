package com.avito.android.reputation.ui.items.reputation_radial_progress_bar;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import kotlin.Metadata;

/* compiled from: ReputationRadialProgressBarComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/k;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/n;", "Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/a;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends AbstractC36333c<n, a> {
    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, n nVar) {
        int iB2;
        a aVar = (a) view;
        n nVar2 = nVar;
        Integer num = nVar2.f255034a;
        aVar.setThreshold(num != null ? num.intValue() : 40);
        int i12 = nVar2.f255035b;
        if (i12 == 0) {
            i12 = 1;
        }
        aVar.setScore(i12);
        Integer num2 = nVar2.f255036c;
        if (num2 != null) {
            iB2 = y6.b(num2.intValue());
        } else {
            a.f254998x.getClass();
            iB2 = a.f255000z;
        }
        aVar.setProgressBarWidth(iB2);
        com.avito.beduin.v2.theme.r rVar = nVar2.f255037d;
        aVar.setLeftColor(rVar != null ? s(rVar) : aVar.getGreen200());
        com.avito.beduin.v2.theme.r rVar2 = nVar2.f255038e;
        aVar.setRightColor(rVar2 != null ? s(rVar2) : aVar.getGreen600());
        com.avito.beduin.v2.theme.r rVar3 = nVar2.f255039f;
        aVar.setBackgroundLeftColor(rVar3 != null ? s(rVar3) : aVar.getWarmGray4());
        com.avito.beduin.v2.theme.r rVar4 = nVar2.f255040g;
        aVar.setBackgroundRightColor(rVar4 != null ? s(rVar4) : aVar.getWarmGray4());
        aVar.setThresholdHeight(y6.b(nVar2.f255041h));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new a(viewGroup.getContext(), null, 0, 6, null);
    }
}
