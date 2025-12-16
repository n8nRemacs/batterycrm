package LN;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarPickerItemsDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLN/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<TV0.a> f9939a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<TV0.a> f9940b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends TV0.a> list, @k List<? extends TV0.a> list2) {
        this.f9939a = list;
        this.f9940b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        TV0.a aVar = this.f9939a.get(i12);
        TV0.a aVar2 = this.f9940b.get(i13);
        if ((aVar instanceof com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a) && (aVar2 instanceof com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a)) {
            com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a aVar3 = (com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a) aVar;
            com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a aVar4 = (com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a) aVar2;
            return aVar3.f171219d == aVar4.f171219d && L.f(aVar3.f171218c, aVar4.f171218c);
        }
        if ((aVar instanceof com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.a) && (aVar2 instanceof com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.a)) {
            return ((com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.a) aVar).f171237d == ((com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.a) aVar2).f171237d;
        }
        if ((aVar instanceof com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.a) && (aVar2 instanceof com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.a)) {
            return L.f(((com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.a) aVar).f171247c, ((com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.a) aVar2).f171247c);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return this.f9939a.get(i12).getF171235b() == this.f9940b.get(i13).getF171235b();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f9940b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f9939a.size();
    }
}
