package com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FeaturedTabsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/tabs/i;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/tabs/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.android.serp.c implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TabGroup f272928b;

    public i(@k View view) {
        super(view);
        this.f272928b = (TabGroup) view.findViewById(R.id.tabs);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs.h
    public final void y6(@k List<? extends FeaturedNavigation> list, int i12, @k l<? super Integer, G0> lVar) {
        List<? extends FeaturedNavigation> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(((FeaturedNavigation) it.next()).getF272877b()), null, false, 6, null));
        }
        this.f272928b.setState(new com.avito.android.lib.design.tab_group.d(arrayList, i12, lVar));
    }
}
