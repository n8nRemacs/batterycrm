package com.avito.android.vas_planning_calendar;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlanCalendarView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "retryAction", "Lkotlin/G0;", "invoke", "(Ljava/lang/Runnable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class p extends N implements Y41.l<Runnable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f322679l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar) {
        super(1);
        this.f322679l = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (runnable2 != null) {
            com.avito.android.progress_overlay.l lVar = this.f322679l.f322738d;
            lVar.a("");
            lVar.f231600j = new o(runnable2);
        }
        return G0.f406611a;
    }
}
