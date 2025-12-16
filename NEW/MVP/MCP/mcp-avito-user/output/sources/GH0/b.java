package GH0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneProtectionModule_ProvidePhonesCardBlueprint$_avito_user_advert_implFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<com.avito.android.phone_protection_info.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f6406a;

    /* renamed from: b, reason: collision with root package name */
    public final u f6407b;

    public b(a aVar, u uVar) {
        this.f6406a = aVar;
        this.f6407b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.phone_protection_info.item.e eVar = (com.avito.android.phone_protection_info.item.e) this.f6407b.get();
        this.f6406a.getClass();
        return new com.avito.android.phone_protection_info.item.a(eVar);
    }
}
