package com.avito.android.service_booking_common.blueprints.date;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import qt0.C47440d;

/* compiled from: SbDateItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/e;", "Lcom/avito/android/service_booking_common/blueprints/date/d;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f276350b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f276351c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<C47440d.a> f276352d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<C47440d.a> f276353e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e2 f276354f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e2 f276355g;

    public e(@Y61.k com.avito.android.service_booking_common.blueprints.date.date_list.e eVar, @Y61.k com.avito.android.service_booking_common.blueprints.date.timeslot_list.d dVar) {
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        e2 e2VarB = f2.b(0, 1, bufferOverflow, 1);
        this.f276350b = e2VarB;
        e2 e2VarB2 = f2.b(0, 1, bufferOverflow, 1);
        this.f276351c = e2VarB2;
        this.f276352d = eVar.getF276343b();
        this.f276353e = dVar.getF276401b();
        this.f276354f = e2VarB;
        this.f276355g = e2VarB2;
    }

    @Override // com.avito.android.service_booking_common.blueprints.date.c
    @Y61.k
    public final InterfaceC43160i<C47440d.a> L0() {
        return this.f276352d;
    }

    @Override // com.avito.android.service_booking_common.blueprints.date.c
    @Y61.k
    public final InterfaceC43160i<C47440d.a> O() {
        return this.f276353e;
    }

    @Override // com.avito.android.service_booking_common.blueprints.date.c
    @Y61.k
    /* renamed from: V, reason: from getter */
    public final e2 getF276354f() {
        return this.f276354f;
    }

    @Override // com.avito.android.service_booking_common.blueprints.date.c
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final e2 getF276355g() {
        return this.f276355g;
    }
}
