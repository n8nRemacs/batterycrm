package Uy;

import Vy.C15726a;
import Vy.C15728c;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import fz.InterfaceC40498a;

/* compiled from: EmployeeModeModule_ProvideEmployeeModeEnvironmentProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<InterfaceC40498a> {

    /* renamed from: a, reason: collision with root package name */
    public final C15728c f16807a;

    public e(C15728c c15728c) {
        this.f16807a = c15728c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C15726a c15726a = (C15726a) this.f16807a.get();
        C15586c.f16805a.getClass();
        return c15726a;
    }
}
