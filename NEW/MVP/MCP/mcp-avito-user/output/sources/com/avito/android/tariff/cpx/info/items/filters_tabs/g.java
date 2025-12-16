package com.avito.android.tariff.cpx.info.items.filters_tabs;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoFiltersTabsItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/filters_tabs/g;", "Lcom/avito/android/tariff/cpx/info/items/filters_tabs/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f296493b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super String, G0> lVar) {
        this.f296493b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        ArrayList arrayList = bVar.f296486b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(((a) it.next()).f296483a), null, false, 6, null));
        }
        Iterator it2 = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            } else if (((a) it2.next()).f296485c) {
                break;
            } else {
                i13++;
            }
        }
        iVar.P0(i13, arrayList2);
        iVar.X1(new f(bVar, this));
    }
}
