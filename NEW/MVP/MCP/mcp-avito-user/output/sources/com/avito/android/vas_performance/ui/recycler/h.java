package com.avito.android.vas_performance.ui.recycler;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VisualVasDiffUtil.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/recycler/h;", "Landroidx/recyclerview/widget/o$b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<TV0.a> f321913a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<TV0.a> f321914b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k List<? extends TV0.a> list, @k List<? extends TV0.a> list2) {
        this.f321913a = list;
        this.f321914b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        TV0.a aVar = this.f321913a.get(i12);
        TV0.a aVar2 = this.f321914b.get(i13);
        return ((aVar instanceof com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) && (aVar2 instanceof com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) && ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) aVar).f321823i != ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) aVar2).f321823i) ? false : true;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        List<TV0.a> list = this.f321913a;
        TV0.a aVar = list.get(i12);
        List<TV0.a> list2 = this.f321914b;
        TV0.a aVar2 = list2.get(i13);
        return ((aVar instanceof com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) && (aVar2 instanceof com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a)) ? L.f(((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) aVar).f321817c, ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) aVar2).f321817c) : list.get(i12).getF124032b() == list2.get(i13).getF124032b();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f321914b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f321913a.size();
    }
}
