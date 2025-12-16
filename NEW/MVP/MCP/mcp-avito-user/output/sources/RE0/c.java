package Re0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlot;
import dagger.internal.e;

/* compiled from: AgeRangeSlotWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f14533a;

    public c(d dVar) {
        this.f14533a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new C15034a((AgeRangeSlot) slot, this.f14533a.f14534a.get());
    }
}
