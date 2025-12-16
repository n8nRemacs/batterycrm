package mP0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletSecuritySettingsApi_Module_ProvideWalletSecuritySettingsApiFactory.java */
@e
@y
@x
/* renamed from: mP0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44000c implements h<InterfaceC43998a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414494a;

    public C44000c(f fVar) {
        this.f414494a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414494a.get();
        C43999b.f414493a.getClass();
        InterfaceC43998a interfaceC43998a = (InterfaceC43998a) r02.create(InterfaceC43998a.class);
        t.d(interfaceC43998a);
        return interfaceC43998a;
    }
}
