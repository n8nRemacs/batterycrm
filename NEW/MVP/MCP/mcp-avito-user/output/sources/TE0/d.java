package Te0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.additional_options.GroupAdditionalOptionsSlot;

/* compiled from: GroupAdditionalOptionBlockSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final e f15777a;

    public d(e eVar) {
        this.f15777a = eVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new C15357b((GroupAdditionalOptionsSlot) slot, this.f15777a.f15778a.get());
    }
}
