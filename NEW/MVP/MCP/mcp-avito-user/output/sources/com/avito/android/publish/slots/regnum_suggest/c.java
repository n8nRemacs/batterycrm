package com.avito.android.publish.slots.regnum_suggest;

import AK0.l;
import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.regnum_suggest.RegnumSuggestSlot;
import lD.C43617a;

/* compiled from: RegnumSuggestSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final e f244741a;

    public c(e eVar) {
        this.f244741a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        RegnumSuggestSlot regnumSuggestSlot = (RegnumSuggestSlot) slot;
        e eVar = this.f244741a;
        return new a(regnumSuggestSlot, eVar.f244742a.get(), (l) eVar.f244743b.get(), eVar.f244744c.get(), eVar.f244745d.get(), (C43617a) eVar.f244746e.get());
    }
}
