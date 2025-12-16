package com.avito.android.home.tabs_item;

import Y61.k;
import com.avito.android.home.tabs_item.c;
import com.avito.android.remote.model.HomeTabItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SectionTabsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/tabs_item/e;", "Lcom/avito/android/home/tabs_item/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f162484b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f162485c = f2.b(0, 1, BufferOverflow.f410778c, 1);

    public e(@k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f162484b = gVar;
    }

    @Override // com.avito.android.home.tabs_item.c
    @k
    public final InterfaceC43160i<c.a> A() {
        return C43175k.a(this.f162485c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        com.avito.android.serp.adapter.home_section_tab.a aVar2 = (com.avito.android.serp.adapter.home_section_tab.a) aVar;
        l0.f fVar2 = new l0.f();
        ?? r12 = aVar2.f270159b;
        Iterator it = r12.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (L.f(((HomeTabItem) it.next()).getFeedId(), aVar2.f270160c)) {
                break;
            } else {
                i13++;
            }
        }
        fVar2.f406840b = i13;
        Iterable iterable = (Iterable) r12;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(((HomeTabItem) it2.next()).getTitle()), null, false, 6, null));
        }
        fVar.w10(new com.avito.android.lib.design.tab_group.d(arrayList, fVar2.f406840b, new d(fVar2, aVar2, this, i12)));
    }
}
