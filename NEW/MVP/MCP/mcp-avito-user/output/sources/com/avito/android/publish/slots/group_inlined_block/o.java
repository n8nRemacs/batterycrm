package com.avito.android.publish.slots.group_inlined_block;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.group_inlined_block_slot.GroupInlinedBlockSlot;

/* compiled from: GroupInlinedBlockSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final p f244055a;

    public o(p pVar) {
        this.f244055a = pVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        GroupInlinedBlockSlot groupInlinedBlockSlot = (GroupInlinedBlockSlot) slot;
        p pVar = this.f244055a;
        return new m(groupInlinedBlockSlot, pVar.f244056a.get(), pVar.f244057b.get(), pVar.f244058c.get(), pVar.f244059d.get(), pVar.f244060e.get());
    }
}
