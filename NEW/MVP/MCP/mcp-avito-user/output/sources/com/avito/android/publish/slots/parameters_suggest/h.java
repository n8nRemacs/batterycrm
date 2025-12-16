package com.avito.android.publish.slots.parameters_suggest;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.parameters_suggest.ParametersSuggestByAddressSlot;

/* compiled from: ParametersSuggestByAddressSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final i f244686a;

    public h(i iVar) {
        this.f244686a = iVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        ParametersSuggestByAddressSlot parametersSuggestByAddressSlot = (ParametersSuggestByAddressSlot) slot;
        i iVar = this.f244686a;
        return new f(parametersSuggestByAddressSlot, iVar.f244687a.get(), iVar.f244688b.get(), iVar.f244689c.get(), iVar.f244690d.get(), iVar.f244691e.get(), iVar.f244692f.get(), iVar.f244693g.get(), iVar.f244694h.get());
    }
}
