package com.avito.android.vas_union.ui.items.vas_performance_select;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VasUnionV2PerformanceSelectItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_select/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_union/ui/items/vas_performance_select/j;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f323367b;

    /* renamed from: c, reason: collision with root package name */
    public final SelectorCardGroup f323368c;

    /* renamed from: d, reason: collision with root package name */
    public final int f323369d;

    /* renamed from: e, reason: collision with root package name */
    public final int f323370e;

    /* renamed from: f, reason: collision with root package name */
    public final int f323371f;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f323367b = aVar;
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) view.findViewById(R.id.vas_union_v2_performance_selector_group);
        selectorCardGroup.setContentBinderFactory(new b(aVar));
        this.f323368c = selectorCardGroup;
        this.f323369d = y6.b(12);
        this.f323370e = y6.b(-4);
        this.f323371f = y6.b(8);
    }

    @Override // com.avito.android.vas_union.ui.items.vas_performance_select.j
    public final void aV(@Y61.k List<c.a> list, @Y61.k c.a aVar, @Y61.k l<? super c.a, G0> lVar) {
        SelectorCardGroup selectorCardGroup = this.f323368c;
        selectorCardGroup.setSelectedListener(null);
        selectorCardGroup.setData(list);
        selectorCardGroup.d(aVar, true);
        SelectorCardGroup.c(selectorCardGroup, aVar);
        selectorCardGroup.setSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.vas_union.ui.items.vas_performance_select.j
    public final void tP(boolean z12) {
        int i12 = z12 ? this.f323371f : this.f323369d;
        SelectorCardGroup selectorCardGroup = this.f323368c;
        selectorCardGroup.setChildSpacing(i12);
        D6.c(selectorCardGroup, null, Integer.valueOf(z12 ? this.f323370e : 0), null, null, 13);
    }

    /* compiled from: VasUnionV2PerformanceSelectItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_union/ui/items/vas_performance_select/k$a", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SelectorCardGroup.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<c.a, G0> f323372a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super c.a, G0> lVar) {
            this.f323372a = lVar;
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void b(@Y61.k r rVar) {
            this.f323372a.invoke(rVar);
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void a(@Y61.k r rVar) {
        }
    }
}
