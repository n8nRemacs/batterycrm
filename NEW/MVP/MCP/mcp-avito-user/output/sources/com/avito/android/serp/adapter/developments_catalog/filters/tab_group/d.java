package com.avito.android.serp.adapter.developments_catalog.filters.tab_group;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: FiltersTabGroupPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tab_group/d;", "Lcom/avito/android/serp/adapter/developments_catalog/filters/tab_group/c;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f269862b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f269863c;

    /* compiled from: FiltersTabGroupPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tab_group/d$a;", "", "<init>", "()V", "", "MAX_DISPLAYABLE_COUNT", "I", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(@k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k h31.e eVar) {
        this.f269862b = eVar;
        this.f269863c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        FiltersTabGroupItem filtersTabGroupItem = (FiltersTabGroupItem) aVar;
        List<Tab> list = filtersTabGroupItem.f269851d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i13 = 0;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            b.a.c cVar = null;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            Tab tab = (Tab) obj;
            if (tab.isSelected()) {
                i13 = i14;
            }
            if (tab.getCount() != null) {
                Integer count = tab.getCount();
                cVar = new b.a.c(count != null ? count.intValue() : 0, null, 1000, 2, null);
            }
            arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(tab.getTitle()), cVar, false, 4, null));
            i14 = i15;
        }
        l0.f fVar = new l0.f();
        fVar.f406840b = i13;
        gVar.DE(new com.avito.android.lib.design.tab_group.d(arrayList, fVar.f406840b, new e(fVar, new f(this, i12, filtersTabGroupItem))));
        gVar.setVisibility(!arrayList.isEmpty());
    }
}
