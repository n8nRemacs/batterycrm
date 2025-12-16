package com.avito.android.publish.slots.information_with_user_id;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationWithUserIdSlot;

/* compiled from: InformationWithUserIdSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final e f244330a;

    public c(e eVar) {
        this.f244330a = eVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        e eVar = this.f244330a;
        return new a((InformationWithUserIdSlot) slot, eVar.f244331a.get(), eVar.f244332b.get());
    }
}
