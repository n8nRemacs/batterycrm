package PX;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.header.a> f13116a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.benefits.a> f13117b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.accountVerification.a> f13118c;

    /* renamed from: d, reason: collision with root package name */
    public final u f13119d;

    public l(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f13116a = provider;
        this.f13117b = provider2;
        this.f13118c = provider3;
        this.f13119d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.mandatory_verification.items.header.a aVar = this.f13116a.get();
        com.avito.android.mandatory_verification.items.benefits.a aVar2 = this.f13117b.get();
        com.avito.android.mandatory_verification.items.accountVerification.a aVar3 = this.f13118c.get();
        com.avito.android.mandatory_verification.items.uploader.b bVar = (com.avito.android.mandatory_verification.items.uploader.b) this.f13119d.get();
        i.f13113a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(bVar);
        return c10493a.a();
    }
}
