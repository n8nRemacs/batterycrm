package com.avito.android.vas_union.ui.items.tabs;

import Y41.l;
import Y61.k;
import com.avito.android.vas_union.ui.items.tabs.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionV2TabsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/tabs/f;", "Lcom/avito/android/vas_union/ui/items/tabs/d;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<c.a, G0> f323253b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@com.avito.android.vas_union.di.i @k l<? super c.a, G0> lVar) {
        this.f323253b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        List<c.a> list = cVar.f323247c;
        List<c.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.avito.android.lib.design.tab_group.b(((c.a) it.next()).f323249b, null, false, 6, null));
        }
        Iterator<c.a> it2 = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            } else if (it2.next().f323250c) {
                break;
            } else {
                i13++;
            }
        }
        hVar.y6(arrayList, i13, new e(cVar, this));
    }
}
