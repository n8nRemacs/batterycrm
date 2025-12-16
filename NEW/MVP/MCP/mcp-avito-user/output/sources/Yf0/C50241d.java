package yf0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlot;

/* compiled from: UserVerificationSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* renamed from: yf0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50241d implements InterfaceC50240c {

    /* renamed from: a, reason: collision with root package name */
    public final C50242e f443433a;

    public C50241d(C50242e c50242e) {
        this.f443433a = c50242e;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new C50239b((UserVerificationSlot) slot, this.f443433a.f443434a.get());
    }
}
