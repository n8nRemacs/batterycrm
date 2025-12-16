package tf0;

import com.avito.android.category_parameters.j;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.profile_info.ProfileInfoSlot;

/* compiled from: ProfileInfoSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* renamed from: tf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48662c implements InterfaceC48661b {

    /* renamed from: a, reason: collision with root package name */
    public final C48663d f439376a;

    public C48662c(C48663d c48663d) {
        this.f439376a = c48663d;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new C48660a((ProfileInfoSlot) slot, (InterfaceC33544d) this.f439376a.f439377a.get());
    }
}
