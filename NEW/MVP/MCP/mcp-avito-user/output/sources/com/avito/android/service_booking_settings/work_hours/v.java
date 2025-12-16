package com.avito.android.service_booking_settings.work_hours;

import android.view.View;
import com.avito.android.service_booking_settings.work_hours.h;

/* compiled from: ServiceBookingWorkHoursStateRenderer_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class v implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final u f278141a;

    public v(u uVar) {
        this.f278141a = uVar;
    }

    @Override // com.avito.android.service_booking_settings.work_hours.h.a
    public final h a(View view, e eVar) {
        u uVar = this.f278141a;
        return new h(view, eVar, uVar.f278137a.get(), (com.avito.konveyor.adapter.a) uVar.f278138b.get(), uVar.f278139c.get(), uVar.f278140d.get());
    }
}
