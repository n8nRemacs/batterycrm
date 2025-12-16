package com.avito.android.publish.slots.delivery_return_policy_block;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy_block.DeliveryReturnPolicyBlockSlot;
import dagger.internal.e;

/* compiled from: DeliveryReturnPolicyBlockSlotWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f243550a;

    public c(d dVar) {
        this.f243550a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        this.f243550a.getClass();
        return new a((DeliveryReturnPolicyBlockSlot) slot);
    }
}
