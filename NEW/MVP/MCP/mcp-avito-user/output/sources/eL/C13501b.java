package El;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wE.InterfaceC49490a;

/* compiled from: FeedsGlobalModule_ProvideBlueprintFactory.java */
@e
@y
@x
/* renamed from: El.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13501b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49490a> f4222a;

    /* renamed from: b, reason: collision with root package name */
    public final C13502c f4223b;

    public C13501b(Provider provider, C13502c c13502c) {
        this.f4222a = provider;
        this.f4223b = c13502c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49490a interfaceC49490a = this.f4222a.get();
        com.avito.android.feeds_global.h hVar = (com.avito.android.feeds_global.h) this.f4223b.get();
        C13500a.f4221a.getClass();
        return interfaceC49490a.a(hVar);
    }
}
