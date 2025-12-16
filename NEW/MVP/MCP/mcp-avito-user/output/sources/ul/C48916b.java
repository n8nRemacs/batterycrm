package uL;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mM.InterfaceC43981a;

/* compiled from: IacCrashRegisterWatcherListener_Factory.java */
@e
@y
@x
/* renamed from: uL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48916b implements h<C48915a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43981a> f439910a;

    public C48916b(Provider<InterfaceC43981a> provider) {
        this.f439910a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48915a(this.f439910a.get());
    }
}
