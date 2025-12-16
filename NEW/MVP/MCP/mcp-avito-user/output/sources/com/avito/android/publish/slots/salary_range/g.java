package com.avito.android.publish.slots.salary_range;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.salary_range.SalaryRangeSlot;

/* compiled from: SalaryRangeSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final i f244781a;

    public g(i iVar) {
        this.f244781a = iVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        SalaryRangeSlot salaryRangeSlot = (SalaryRangeSlot) slot;
        i iVar = this.f244781a;
        return new e(salaryRangeSlot, iVar.f244782a.get(), iVar.f244783b.get(), (b) iVar.f244784c.get(), iVar.f244785d.get());
    }
}
