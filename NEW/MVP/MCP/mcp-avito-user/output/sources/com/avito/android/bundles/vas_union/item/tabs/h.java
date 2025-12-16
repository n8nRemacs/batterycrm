package com.avito.android.bundles.vas_union.item.tabs;

import com.avito.android.lib.deprecated_design.tab.CommonTab;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TabsItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/tabs/h;", "Lcom/avito/android/bundles/vas_union/item/tabs/f;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    public j f108677b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<CommonTab> f108678c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f108679d;

    @Inject
    public h() {
        com.jakewharton.rxrelay3.c<CommonTab> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f108678c = cVar;
        this.f108679d = cVar;
    }

    @Override // com.avito.android.bundles.vas_union.item.tabs.f
    public final void Ba() {
        j jVar = this.f108677b;
        if (jVar == null) {
            jVar = null;
        }
        jVar.Ba();
    }

    @Override // com.avito.android.bundles.vas_union.item.tabs.f
    @Y61.k
    /* renamed from: Ca, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF108679d() {
        return this.f108679d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        this.f108677b = jVar;
        jVar.u4(cVar.f108668b);
        jVar.d8(cVar.f108669c);
        jVar.N1(new g(cVar, this));
    }
}
