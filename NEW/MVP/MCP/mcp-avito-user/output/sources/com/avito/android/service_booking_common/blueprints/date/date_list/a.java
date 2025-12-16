package com.avito.android.service_booking_common.blueprints.date.date_list;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qt0.C47440d;

/* compiled from: SbDateListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/date_list/a;", "LTV0/b;", "Lcom/avito/android/service_booking_common/blueprints/date/date_list/j;", "Lqt0/d$a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<j, C47440d.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f276330a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.j f276331b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f276332c = new g.a<>(R.layout.service_booking_item_date_list, new C8206a());

    /* compiled from: SbDateListBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_common/blueprints/date/date_list/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_common/blueprints/date/date_list/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_common.blueprints.date.date_list.a$a, reason: collision with other inner class name */
    public static final class C8206a extends N implements p<ViewGroup, View, j> {
        public C8206a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f276331b);
        }
    }

    @Inject
    public a(@k e eVar, @k com.avito.android.server_time.j jVar) {
        this.f276330a = eVar;
        this.f276331b = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f276330a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f276332c;
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
