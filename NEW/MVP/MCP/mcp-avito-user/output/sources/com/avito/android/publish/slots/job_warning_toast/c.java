package com.avito.android.publish.slots.job_warning_toast;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.job_warning_toast.JobToastSlot;

/* compiled from: JobToastSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final e f244463a;

    public c(e eVar) {
        this.f244463a = eVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        this.f244463a.getClass();
        return new a((JobToastSlot) slot);
    }
}
