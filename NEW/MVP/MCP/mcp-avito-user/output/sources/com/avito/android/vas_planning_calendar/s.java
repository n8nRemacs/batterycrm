package com.avito.android.vas_planning_calendar;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlanCalendarView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "position", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class s extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f322682l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar) {
        super(1);
        this.f322682l = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Integer num2 = num;
        if (num2 != null) {
            x xVar = this.f322682l;
            RecyclerView recyclerView = xVar.f322740f;
            if (recyclerView == null) {
                recyclerView = null;
            }
            ((GridLayoutManager) recyclerView.getLayoutManager()).b2(num2.intValue(), xVar.f322736b.d() / 4);
        }
        return G0.f406611a;
    }
}
