package com.avito.android.vas_planning_calendar.data;

import dM0.C39601a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCalendarDataConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/data/d;", "Lcom/avito/android/vas_planning_calendar/data/c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f322604a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f322606c = new SimpleDateFormat("LLLL", Locale.getDefault());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f322607d = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f322608e = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f322609f = new SimpleDateFormat("d", Locale.getDefault());

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Date f322605b = C39601a.a().getTime();

    public d(@Y61.k h hVar) {
        this.f322604a = hVar;
    }
}
