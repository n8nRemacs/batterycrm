package com.avito.android.body_condition;

import Mj.InterfaceC14496a;
import TV0.g;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CarBodyConditionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/body_condition/e;", "LTV0/b;", "Lcom/avito/android/body_condition/g;", "Lcom/avito/android/body_condition/CarBodyConditionItem;", "_avito_body-condition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.b<g, CarBodyConditionItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.blueprints.publish.car_body_condition.a f106810a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<i> f106811b;

    public e(@Y61.k com.avito.android.blueprints.publish.car_body_condition.a aVar, @Y61.k InterfaceC14496a interfaceC14496a) {
        this.f106810a = aVar;
        this.f106811b = new g.a<>(R.layout.car_body_condition_view, new d(interfaceC14496a));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106810a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<i> b() {
        return this.f106811b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CarBodyConditionItem;
    }
}
