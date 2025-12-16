package com.avito.android.vas_planning_calendar.data;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PlanCalendarResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/data/j;", "Lcom/avito/android/vas_planning_calendar/data/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f322617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f322618b;

    @Inject
    public j(@Y61.k Resources resources) {
        this.f322617a = resources.getString(R.string.unknown_error);
        this.f322618b = resources.getString(R.string.plan_calendar_default_title);
    }

    @Override // com.avito.android.vas_planning_calendar.data.a
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF322617a() {
        return this.f322617a;
    }

    @Override // com.avito.android.vas_planning_calendar.data.a
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF322618b() {
        return this.f322618b;
    }
}
