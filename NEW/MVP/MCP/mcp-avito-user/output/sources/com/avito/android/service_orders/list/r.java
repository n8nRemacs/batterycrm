package com.avito.android.service_orders.list;

import android.view.View;
import com.avito.android.service_orders.list.l;

/* compiled from: ServiceOrdersListViewImpl_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class r implements l.e {

    /* renamed from: a, reason: collision with root package name */
    public final q f279432a;

    public r(q qVar) {
        this.f279432a = qVar;
    }

    @Override // com.avito.android.service_orders.list.l.e
    public final l a(View view, com.avito.android.service_orders.mvi.h hVar, ServiceOrdersListFragment serviceOrdersListFragment) {
        q qVar = this.f279432a;
        return new l(view, hVar, serviceOrdersListFragment, qVar.f279424a.get(), qVar.f279425b.get(), qVar.f279426c.get(), (com.avito.konveyor.adapter.j) qVar.f279427d.get(), qVar.f279428e.get(), qVar.f279429f.get(), (com.avito.android.service_booking_utils.ux_feedback.a) qVar.f279430g.get(), qVar.f279431h.get());
    }
}
