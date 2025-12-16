package QL0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VisualVasDiffUtil.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQL0/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<TV0.a> f13683a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f13684b;

    public a(@k ArrayList arrayList, @k List list) {
        this.f13683a = list;
        this.f13684b = arrayList;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        TV0.a aVar = this.f13683a.get(i12);
        TV0.a aVar2 = (TV0.a) this.f13684b.get(i13);
        if ((aVar instanceof com.avito.android.vas_performance.screens.visual.item.item.a) && (aVar2 instanceof com.avito.android.vas_performance.screens.visual.item.item.a)) {
            return L.f(aVar, aVar2);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        TV0.a aVar = this.f13683a.get(i12);
        TV0.a aVar2 = (TV0.a) this.f13684b.get(i13);
        return ((aVar instanceof com.avito.android.vas_performance.screens.visual.item.item.a) && (aVar2 instanceof com.avito.android.vas_performance.screens.visual.item.item.a)) ? L.f(((com.avito.android.vas_performance.screens.visual.item.item.a) aVar).f321050c, ((com.avito.android.vas_performance.screens.visual.item.item.a) aVar2).f321050c) : aVar.getF287650b() == aVar2.getF287650b();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f13684b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f13683a.size();
    }
}
