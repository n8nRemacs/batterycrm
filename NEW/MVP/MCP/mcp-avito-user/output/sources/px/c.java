package PX;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MandatoryVerificationItemsModule_ProvideMandatoryVerificationAccountVerificationItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<com.avito.android.mandatory_verification.items.accountVerification.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13105a;

    public c(u uVar) {
        this.f13105a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mandatory_verification.items.accountVerification.e eVar = (com.avito.android.mandatory_verification.items.accountVerification.e) this.f13105a.get();
        b.f13104a.getClass();
        return new com.avito.android.mandatory_verification.items.accountVerification.c(eVar);
    }
}
