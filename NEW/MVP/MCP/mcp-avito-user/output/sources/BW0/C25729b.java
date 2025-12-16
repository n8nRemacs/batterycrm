package bw0;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.short_term_rent.bookingform.page.d;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PageDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbw0/b;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C25729b extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.page.e f57545a;

    @Inject
    public C25729b(@k com.avito.android.short_term_rent.bookingform.page.e eVar) {
        this.f57545a = eVar;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF80137b() == aVar4.getF80137b() && aVar3.getClass() == aVar4.getClass();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof com.avito.android.short_term_rent.bookingform.page.c) || !(aVar4 instanceof com.avito.android.short_term_rent.bookingform.page.c)) {
            return null;
        }
        this.f57545a.getClass();
        ArrayList arrayList = new ArrayList();
        List<TV0.a> list = ((com.avito.android.short_term_rent.bookingform.page.c) aVar3).f282037c;
        List<TV0.a> list2 = ((com.avito.android.short_term_rent.bookingform.page.c) aVar4).f282037c;
        if (!L.f(list, list2)) {
            arrayList.add(new d.a(list2));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
