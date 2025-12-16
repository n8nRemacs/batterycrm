package com.avito.android.vas_planning_calendar.view.konveyor.items.day;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DayItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/b;", "LTV0/b;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/e;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<e, com.avito.android.vas_planning_calendar.view.konveyor.items.day.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f322706a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f322707b = new g.a<>(R.layout.plan_calendar_day_item, a.f322708l);

    /* compiled from: DayItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f322708l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f322706a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f322706a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f322707b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.vas_planning_calendar.view.konveyor.items.day.a;
    }
}
