package gf0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlot;

/* compiled from: DeliveryReturnPolicySlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f f396689a;

    public e(f fVar) {
        this.f396689a = fVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        f fVar = this.f396689a;
        return new C40674b((DeliveryReturnPolicySlot) slot, fVar.f396690a.get(), fVar.f396691b.get());
    }
}
