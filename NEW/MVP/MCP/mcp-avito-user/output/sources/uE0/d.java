package Ue0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.car_body_condition.GroupBodyConditionBlockSlot;

/* compiled from: GroupBodyConditionBlockSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final e f16533a;

    public d(e eVar) {
        this.f16533a = eVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new b((GroupBodyConditionBlockSlot) slot, this.f16533a.f16534a.get());
    }
}
