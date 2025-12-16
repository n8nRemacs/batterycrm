package com.avito.android.publish.slots.final_state_suggest;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestSlot;
import dagger.internal.e;

/* compiled from: FinalStateSuggestSlotWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f243908a;

    public c(d dVar) {
        this.f243908a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        FinalStateSuggestSlot finalStateSuggestSlot = (FinalStateSuggestSlot) slot;
        d dVar = this.f243908a;
        return new a(finalStateSuggestSlot, dVar.f243909a.get(), dVar.f243910b.get(), dVar.f243911c.get(), dVar.f243912d.get(), dVar.f243913e.get(), dVar.f243914f.get(), dVar.f243915g.get());
    }
}
