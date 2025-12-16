package com.avito.android.vas_planning.item.date_time;

import com.avito.android.vas_planning.model.VasPlanningItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanningDateTimePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/item/date_time/i;", "Lcom/avito/android/vas_planning/item/date_time/d;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f322381b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning.b f322382c;

    @Inject
    public i(@Y61.k a aVar, @Y61.k com.avito.android.vas_planning.b bVar) {
        this.f322381b = aVar;
        this.f322382c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        VasPlanningItem.VasPlanningDateTime vasPlanningDateTime = (VasPlanningItem.VasPlanningDateTime) aVar;
        kVar.Lo(vasPlanningDateTime);
        kVar.UF(new e(this, vasPlanningDateTime));
        kVar.pL(new f(this, vasPlanningDateTime));
        kVar.xA(new g(this, vasPlanningDateTime));
        kVar.L30(new h(this, vasPlanningDateTime));
    }
}
