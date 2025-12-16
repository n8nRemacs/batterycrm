package Xe0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import dagger.internal.e;

/* compiled from: CarBodyConditionSlotWrapperFactory_Impl.java */
@e
/* renamed from: Xe0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C16997c implements InterfaceC16996b {

    /* renamed from: a, reason: collision with root package name */
    public final C16998d f18996a;

    public C16997c(C16998d c16998d) {
        this.f18996a = c16998d;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new C16995a((CarBodyConditionSlot) slot, this.f18996a.f18997a.get());
    }
}
