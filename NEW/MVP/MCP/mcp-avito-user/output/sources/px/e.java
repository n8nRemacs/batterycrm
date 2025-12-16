package PX;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationItemsModule_ProvideMandatoryVerificationHeaderItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<com.avito.android.mandatory_verification.items.header.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13107a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f13108b;

    public e(u uVar, Provider provider) {
        this.f13107a = uVar;
        this.f13108b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mandatory_verification.items.header.e eVar = (com.avito.android.mandatory_verification.items.header.e) this.f13107a.get();
        com.avito.android.util.text.a aVar = this.f13108b.get();
        b.f13104a.getClass();
        return new com.avito.android.mandatory_verification.items.header.c(eVar, aVar);
    }
}
