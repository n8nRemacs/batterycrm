package bf0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import u3.l;

/* compiled from: ContactMethodSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final k f57339a;

    public h(k kVar) {
        this.f57339a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        ContactMethodSlot contactMethodSlot = (ContactMethodSlot) slot;
        k kVar = this.f57339a;
        return new C25645d(kVar.f57359a.get(), contactMethodSlot, (InterfaceC25642a) kVar.f57360b.get(), kVar.f57361c.get(), kVar.f57362d.get(), (InterfaceC28373a) kVar.f57363e.get(), kVar.f57364f.get(), (OL.a) kVar.f57365g.get(), (l) kVar.f57366h.get());
    }
}
