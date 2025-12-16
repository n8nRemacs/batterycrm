package com.avito.android.service_booking.mvi.step;

import Hs0.InterfaceC14030a;
import android.view.View;
import com.avito.android.service_booking.mvi.step.C34912f;
import java.util.Map;
import java.util.Set;
import kotlin.G0;

/* compiled from: ServiceBookingMviStepRenderer_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class M implements C34912f.a {

    /* renamed from: a, reason: collision with root package name */
    public final L f274447a;

    public M(L l12) {
        this.f274447a = l12;
    }

    @Override // com.avito.android.service_booking.mvi.step.C34912f.a
    public final C34912f a(View view, Y41.l<? super InterfaceC14030a, G0> lVar, String str, cU.s sVar) {
        L l12 = this.f274447a;
        C34912f c34912f = new C34912f(view, lVar, sVar, (com.avito.konveyor.adapter.j) l12.f274441a.get(), l12.f274442b.get(), (C34907a) l12.f274443c.get(), l12.f274444d.get(), (Map) l12.f274445e.f393949a);
        c34912f.f274645g = (Set) l12.f274446f.get();
        return c34912f;
    }
}
