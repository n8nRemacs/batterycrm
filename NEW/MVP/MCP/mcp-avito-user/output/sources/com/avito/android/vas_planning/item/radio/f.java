package com.avito.android.vas_planning.item.radio;

import Y61.k;
import com.avito.android.vas_planning.model.VasPlanningItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanningRadioPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/item/radio/f;", "Lcom/avito/android/vas_planning/item/radio/d;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f322398b;

    @Inject
    public f(@k a aVar) {
        this.f322398b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem = (VasPlanningItem.VasPlanningRadioItem) aVar;
        hVar.Nq(vasPlanningRadioItem);
        hVar.kK(new e(this, vasPlanningRadioItem));
    }
}
