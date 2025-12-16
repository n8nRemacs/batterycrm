package com.avito.android.vas_planning_calendar;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlanCalendarFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/Date;", "kotlin.jvm.PlatformType", "selectedDate", "Lkotlin/G0;", "invoke", "(Ljava/util/Date;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.vas_planning_calendar.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36069c extends N implements Y41.l<Date, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PlanCalendarFragment f322602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36069c(PlanCalendarFragment planCalendarFragment) {
        super(1);
        this.f322602l = planCalendarFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Date date) {
        Date date2 = date;
        if (date2 != null) {
            PlanCalendarFragment planCalendarFragment = this.f322602l;
            planCalendarFragment.getClass();
            Intent intentPutExtra = new Intent().putExtra("extra_date", date2);
            ActivityC22955m activityC22955mL1 = planCalendarFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.setResult(-1, intentPutExtra);
            }
            ActivityC22955m activityC22955mL12 = planCalendarFragment.l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.finish();
            }
        }
        return G0.f406611a;
    }
}
