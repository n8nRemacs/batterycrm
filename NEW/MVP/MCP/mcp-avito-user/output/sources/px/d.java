package PX;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MandatoryVerificationItemsModule_ProvideMandatoryVerificationBenefitsItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<com.avito.android.mandatory_verification.items.benefits.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13106a;

    public d(u uVar) {
        this.f13106a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mandatory_verification.items.benefits.d dVar = (com.avito.android.mandatory_verification.items.benefits.d) this.f13106a.get();
        b.f13104a.getClass();
        return new com.avito.android.mandatory_verification.items.benefits.b(dVar);
    }
}
