package eM0;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlanCalendarItemsDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeM0/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40022a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<TV0.a> f395142a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<TV0.a> f395143b;

    /* JADX WARN: Multi-variable type inference failed */
    public C40022a(@k List<? extends TV0.a> list, @k List<? extends TV0.a> list2) {
        this.f395142a = list;
        this.f395143b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        TV0.a aVar = this.f395142a.get(i12);
        TV0.a aVar2 = this.f395143b.get(i13);
        if ((aVar instanceof com.avito.android.vas_planning_calendar.view.konveyor.items.day.a) && (aVar2 instanceof com.avito.android.vas_planning_calendar.view.konveyor.items.day.a)) {
            com.avito.android.vas_planning_calendar.view.konveyor.items.day.a aVar3 = (com.avito.android.vas_planning_calendar.view.konveyor.items.day.a) aVar;
            com.avito.android.vas_planning_calendar.view.konveyor.items.day.a aVar4 = (com.avito.android.vas_planning_calendar.view.konveyor.items.day.a) aVar2;
            return aVar3.f322704d == aVar4.f322704d && L.f(aVar3.f322703c, aVar4.f322703c);
        }
        if ((aVar instanceof com.avito.android.vas_planning_calendar.view.konveyor.items.empty.a) && (aVar2 instanceof com.avito.android.vas_planning_calendar.view.konveyor.items.empty.a)) {
            return ((com.avito.android.vas_planning_calendar.view.konveyor.items.empty.a) aVar).f322717c == ((com.avito.android.vas_planning_calendar.view.konveyor.items.empty.a) aVar2).f322717c;
        }
        if ((aVar instanceof com.avito.android.vas_planning_calendar.view.konveyor.items.month.a) && (aVar2 instanceof com.avito.android.vas_planning_calendar.view.konveyor.items.month.a)) {
            return L.f(((com.avito.android.vas_planning_calendar.view.konveyor.items.month.a) aVar).f322726c, ((com.avito.android.vas_planning_calendar.view.konveyor.items.month.a) aVar2).f322726c);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return this.f395142a.get(i12).getF79005b() == this.f395143b.get(i13).getF79005b();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f395143b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f395142a.size();
    }
}
