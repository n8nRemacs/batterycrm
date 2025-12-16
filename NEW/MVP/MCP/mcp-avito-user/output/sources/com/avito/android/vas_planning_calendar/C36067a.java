package com.avito.android.vas_planning_calendar;

import androidx.fragment.app.ActivityC22955m;
import kotlin.Metadata;

/* compiled from: PlanCalendarFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.vas_planning_calendar.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36067a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanCalendarFragment f322600b;

    public C36067a(PlanCalendarFragment planCalendarFragment) {
        this.f322600b = planCalendarFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ActivityC22955m activityC22955mL1 = this.f322600b.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
