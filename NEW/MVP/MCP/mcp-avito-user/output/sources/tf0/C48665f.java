package tf0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserInfoModule_ProvideUserInfoBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: tf0.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48665f implements h<com.avito.android.publish.slots.profile_info.item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.profile_info.item.d> f439379a;

    /* renamed from: b, reason: collision with root package name */
    public final u f439380b;

    public C48665f(u uVar, Provider provider) {
        this.f439379a = provider;
        this.f439380b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.profile_info.item.d dVar = this.f439379a.get();
        ir.d dVar2 = (ir.d) this.f439380b.get();
        C48664e.f439378a.getClass();
        return new com.avito.android.publish.slots.profile_info.item.b(dVar, dVar2);
    }
}
