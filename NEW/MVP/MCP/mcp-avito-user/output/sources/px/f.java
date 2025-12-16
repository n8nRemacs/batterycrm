package PX;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationItemsModule_ProvideMandatoryVerificationUploaderItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.android.mandatory_verification.items.uploader.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13109a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f13110b;

    public f(u uVar, Provider provider) {
        this.f13109a = uVar;
        this.f13110b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mandatory_verification.items.uploader.f fVar = (com.avito.android.mandatory_verification.items.uploader.f) this.f13109a.get();
        com.avito.android.util.text.a aVar = this.f13110b.get();
        b.f13104a.getClass();
        return new com.avito.android.mandatory_verification.items.uploader.d(fVar, aVar);
    }
}
