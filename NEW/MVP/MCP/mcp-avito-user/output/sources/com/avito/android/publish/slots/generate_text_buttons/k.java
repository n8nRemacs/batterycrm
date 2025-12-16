package com.avito.android.publish.slots.generate_text_buttons;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.generate_text_buttons.GenerateTextButtonsSlot;

/* compiled from: GenerateTextButtonsSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final m f244005a;

    public k(m mVar) {
        this.f244005a = mVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        m mVar = this.f244005a;
        return new c((GenerateTextButtonsSlot) slot, mVar.f244006a.get(), mVar.f244007b.get(), mVar.f244008c.get());
    }
}
