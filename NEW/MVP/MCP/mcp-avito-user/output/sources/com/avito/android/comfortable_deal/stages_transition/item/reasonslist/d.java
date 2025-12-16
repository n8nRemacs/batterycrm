package com.avito.android.comfortable_deal.stages_transition.item.reasonslist;

import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReasonsListPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/d;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/f;", "Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<f, c> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        List<com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.c> list = ((c) aVar).f122913b;
        if (list.isEmpty()) {
            fVar.IC();
        } else {
            fVar.nM(list);
        }
    }
}
