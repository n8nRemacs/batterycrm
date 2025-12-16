package com.avito.android.service_booking_common.blueprints.any_specialist;

import Y61.k;
import android.view.View;
import com.avito.android.service_booking_calendar.flexible.header.toolbar.g;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import qt0.C47438b;

/* compiled from: SbAnySpecialistItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/any_specialist/d;", "Lcom/avito/android/service_booking_common/blueprints/any_specialist/c;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f276240b = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        C47438b c47438b = (C47438b) aVar;
        I5.a(fVar.f276243c, c47438b.f429398e, false);
        boolean z12 = c47438b.f429396c;
        View view = fVar.f276242b;
        if (z12) {
            view.setOnClickListener(new g(1, this, c47438b));
            view.setClickable(true);
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    @Override // com.avito.android.service_booking_common.blueprints.any_specialist.c
    @k
    /* renamed from: f, reason: from getter */
    public final e2 getF276240b() {
        return this.f276240b;
    }
}
