package com.avito.android.reputation.ui.items.reputation_progress_bar;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import kotlin.Metadata;

/* compiled from: ReputationProgressBarComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_progress_bar/q;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/reputation/ui/items/reputation_progress_bar/t;", "Lcom/avito/android/reputation/ui/items/reputation_progress_bar/a;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q extends AbstractC36333c<t, C34407a> {
    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, t tVar) {
        int iS2;
        C34407a c34407a = (C34407a) view;
        t tVar2 = tVar;
        Integer num = tVar2.f254976a;
        c34407a.setThreshold(num != null ? num.intValue() : 40);
        com.avito.beduin.v2.theme.r rVar = tVar2.f254979d;
        c34407a.setLeftColor(rVar != null ? s(rVar) : c34407a.getGreen200());
        com.avito.beduin.v2.theme.r rVar2 = tVar2.f254980e;
        c34407a.setRightColor(rVar2 != null ? s(rVar2) : c34407a.getGreen600());
        int i12 = tVar2.f254977b;
        if (i12 == 0) {
            i12 = 1;
        }
        c34407a.setScore(i12);
        c34407a.setTrackHeight(y6.a(tVar2.f254978c));
        com.avito.beduin.v2.theme.r rVar3 = tVar2.f254981f;
        c34407a.setTrackColor(rVar3 != null ? s(rVar3) : c34407a.getWarmGray4());
        Integer num2 = tVar2.f254982g;
        c34407a.setFutureScore(num2 != null ? num2.intValue() : -1);
        c34407a.setFutureScoreCircleRadius(y6.b(tVar2.f254983h));
        com.avito.beduin.v2.theme.r rVar4 = tVar2.f254984i;
        c34407a.setFutureScoreCircleColor(rVar4 != null ? Integer.valueOf(s(rVar4)) : null);
        c34407a.setDeltaStripWidth(y6.b(tVar2.f254985j));
        com.avito.beduin.v2.theme.r rVar5 = tVar2.f254986k;
        if (rVar5 != null) {
            iS2 = s(rVar5);
        } else {
            C34407a.f254913L.getClass();
            iS2 = C34407a.f254922U;
        }
        c34407a.setDeltaColor(iS2);
        com.avito.beduin.v2.theme.r rVar6 = tVar2.f254987l;
        c34407a.setDeltaBackgroundColor(rVar6 != null ? s(rVar6) : c34407a.getDeltaBackgroundColorDefault());
        c34407a.setShowScale(tVar2.f254988m);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new C34407a(viewGroup.getContext(), null, 0, 6, null);
    }
}
