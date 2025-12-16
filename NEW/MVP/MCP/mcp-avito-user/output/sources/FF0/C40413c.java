package ff0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlot;
import dagger.internal.e;

/* compiled from: DeliveryCncTogglesSlotWrapperFactory_Impl.java */
@e
/* renamed from: ff0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40413c implements InterfaceC40412b {

    /* renamed from: a, reason: collision with root package name */
    public final d f396030a;

    public C40413c(d dVar) {
        this.f396030a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        d dVar = this.f396030a;
        return new C40411a((DeliveryCncTogglesSlot) slot, dVar.f396031a.get(), dVar.f396032b.get(), dVar.f396033c.get());
    }
}
