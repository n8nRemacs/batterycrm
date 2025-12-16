package ef0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery.CptUnswitchableDeliverySlot;
import dagger.internal.e;

/* compiled from: CptUnswitchableDeliverySlotWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements InterfaceC40101b {

    /* renamed from: a, reason: collision with root package name */
    public final d f395312a;

    public c(d dVar) {
        this.f395312a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        d dVar = this.f395312a;
        return new C40100a((CptUnswitchableDeliverySlot) slot, dVar.f395313a.get(), dVar.f395314b.get());
    }
}
