package Uy;

import az.C24197b;
import az.C24198c;
import az.InterfaceC24196a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmployeeModeModule_ProvideEmployeeAccountManagerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<InterfaceC24196a> {

    /* renamed from: a, reason: collision with root package name */
    public final C24198c f16806a;

    public d(C24198c c24198c) {
        this.f16806a = c24198c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C24197b c24197b = (C24197b) this.f16806a.get();
        C15586c.f16805a.getClass();
        return c24197b;
    }
}
