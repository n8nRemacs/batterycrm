package com.avito.android.vas_planning_calendar;

import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlanCalendarView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/recyclerview/widget/o$e;", "kotlin.jvm.PlatformType", "diff", "Lkotlin/G0;", "invoke", "(Landroidx/recyclerview/widget/o$e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class u extends N implements Y41.l<C23424o.e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f322684l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar) {
        super(1);
        this.f322684l = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(C23424o.e eVar) {
        C23424o.e eVar2 = eVar;
        if (eVar2 != null) {
            RecyclerView recyclerView = this.f322684l.f322740f;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                eVar2.b(adapter);
            }
        }
        return G0.f406611a;
    }
}
