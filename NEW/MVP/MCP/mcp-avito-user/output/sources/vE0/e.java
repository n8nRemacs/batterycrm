package Ve0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.contact.GroupContactSlot;

/* compiled from: GroupContactSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f f17343a;

    public e(f fVar) {
        this.f17343a = fVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        f fVar = this.f17343a;
        return new c((GroupContactSlot) slot, fVar.f17344a.get(), (C15670a) fVar.f17345b.get());
    }
}
