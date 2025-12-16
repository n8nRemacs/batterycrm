package com.avito.android.service_booking_calendar.flexible.header;

import Y41.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.service_booking_calendar.flexible.header.a;
import kotlin.G0;

/* compiled from: CalendarHeaderStateRenderer_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class f implements a.e {

    /* renamed from: a, reason: collision with root package name */
    public final e f275907a;

    public f(e eVar) {
        this.f275907a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.service_booking_calendar.flexible.header.a.e
    public final a a(View view, l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar) {
        e eVar = this.f275907a;
        return new a(view, lVar, eVar.f275897a.get(), eVar.f275898b.get(), (com.avito.konveyor.adapter.a) eVar.f275899c.get(), eVar.f275900d.get(), (com.avito.konveyor.adapter.a) eVar.f275901e.get(), eVar.f275902f.get(), eVar.f275903g.get(), (RecyclerView.t) eVar.f275904h.get(), eVar.f275905i.get(), eVar.f275906j.get());
    }
}
