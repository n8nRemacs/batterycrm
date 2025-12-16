package com.avito.android.publish.slots.check_verification;

import com.avito.android.publish.analytics.C33525k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.check_verification_slot.CheckVerificationSlot;

/* compiled from: CheckVerificationSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final g f243176a;

    public e(g gVar) {
        this.f243176a = gVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        g gVar = this.f243176a;
        return new c((CheckVerificationSlot) slot, (h) gVar.f243177a.get(), (C33525k) gVar.f243178b.get());
    }
}
