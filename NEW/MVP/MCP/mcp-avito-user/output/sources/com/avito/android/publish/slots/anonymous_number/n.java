package com.avito.android.publish.slots.anonymous_number;

import Pd0.v;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.anonymous_number.AnonymousNumberSlot;

/* compiled from: AnonymousNumberSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final p f243057a;

    public n(p pVar) {
        this.f243057a = pVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        AnonymousNumberSlot anonymousNumberSlot = (AnonymousNumberSlot) slot;
        p pVar = this.f243057a;
        return new l(anonymousNumberSlot, pVar.f243058a.get(), pVar.f243059b.get(), pVar.f243060c.get(), pVar.f243061d.get(), pVar.f243062e.get(), pVar.f243063f.get(), pVar.f243064g.get(), pVar.f243065h.get(), pVar.f243066i.get(), pVar.f243067j.get(), (v) pVar.f243068k.get(), pVar.f243069l.get());
    }
}
