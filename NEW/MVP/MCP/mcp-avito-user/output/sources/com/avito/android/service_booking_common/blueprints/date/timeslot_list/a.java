package com.avito.android.service_booking_common.blueprints.date.timeslot_list;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.service_booking_common.di.F;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qt0.C47440d;

/* compiled from: SbTimeslotListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/a;", "LTV0/b;", "Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/i;", "Lqt0/d$a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<i, C47440d.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f276387a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<Long> f276388b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f276389c = new g.a<>(R.layout.service_booking_item_timeslot_list, new C8207a());

    /* compiled from: SbTimeslotListBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_common.blueprints.date.timeslot_list.a$a, reason: collision with other inner class name */
    public static final class C8207a extends N implements p<ViewGroup, View, i> {
        public C8207a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, a.this.f276388b);
        }
    }

    @Inject
    public a(@k d dVar, @F @k InterfaceC35945t1<Long> interfaceC35945t1) {
        this.f276387a = dVar;
        this.f276388b = interfaceC35945t1;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f276387a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f276389c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof C47440d.a;
    }
}
