package com.avito.android.publish.slots.contact_info;

import com.avito.android.account.G;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.P;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlot;
import com.avito.android.util.S3;

/* compiled from: ContactInfoSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final m f243259a;

    public k(m mVar) {
        this.f243259a = mVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        ContactInfoSlot contactInfoSlot = (ContactInfoSlot) slot;
        m mVar = this.f243259a;
        P p12 = mVar.f243260a.get();
        InterfaceC33544d interfaceC33544d = mVar.f243261b.get();
        InterfaceC34401z0 interfaceC34401z0 = mVar.f243262c.get();
        com.avito.android.remote.error.f fVar = mVar.f243263d.get();
        G g12 = mVar.f243264e.get();
        mVar.f243265f.getClass();
        return new d(contactInfoSlot, p12, interfaceC33544d, interfaceC34401z0, fVar, g12, S3.a(), mVar.f243266g.get(), mVar.f243267h.get(), mVar.f243268i.get(), mVar.f243269j.get(), (a) mVar.f243270k.get());
    }
}
