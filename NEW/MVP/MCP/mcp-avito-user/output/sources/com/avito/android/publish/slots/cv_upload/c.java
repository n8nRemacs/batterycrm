package com.avito.android.publish.slots.cv_upload;

import Bx0.InterfaceC13200a;
import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.cv_upload.CvUploadSlot;
import dagger.internal.e;

/* compiled from: CvUploadWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f243393a;

    public c(d dVar) {
        this.f243393a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        d dVar = this.f243393a;
        return new a((CvUploadSlot) slot, dVar.f243394a.get(), (InterfaceC13200a) dVar.f243395b.get());
    }
}
