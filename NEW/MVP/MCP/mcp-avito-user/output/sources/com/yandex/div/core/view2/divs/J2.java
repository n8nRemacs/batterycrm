package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: ReleasingViewPool.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/J2;", "Landroidx/recyclerview/widget/RecyclerView$t;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class J2 extends RecyclerView.t {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.divs.widgets.D f368112c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f368113d = new LinkedHashSet();

    public J2(@Y61.k com.yandex.div.core.view2.divs.widgets.D d12) {
        this.f368112c = d12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void a() {
        super.a();
        LinkedHashSet linkedHashSet = this.f368113d;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            com.yandex.div.core.view2.divs.widgets.x.a(this.f368112c, ((RecyclerView.C) it.next()).itemView);
        }
        linkedHashSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    @Y61.l
    public final RecyclerView.C b(int i12) {
        RecyclerView.C cB2 = super.b(i12);
        if (cB2 == null) {
            return null;
        }
        this.f368113d.remove(cB2);
        return cB2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void d(@Y61.l RecyclerView.C c12) {
        super.d(c12);
        this.f368113d.add(c12);
    }
}
