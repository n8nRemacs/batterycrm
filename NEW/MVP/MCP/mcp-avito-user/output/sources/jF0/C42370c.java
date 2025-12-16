package jf0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import dagger.internal.e;

/* compiled from: DeliveryTogglesSlotWrapperFactory_Impl.java */
@e
/* renamed from: jf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42370c implements InterfaceC42369b {

    /* renamed from: a, reason: collision with root package name */
    public final C42371d f405756a;

    public C42370c(C42371d c42371d) {
        this.f405756a = c42371d;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        C42371d c42371d = this.f405756a;
        return new C42368a((DeliveryTogglesSlot) slot, c42371d.f405757a.get(), c42371d.f405758b.get(), c42371d.f405759c.get());
    }
}
