package rL;

import com.avito.android.iac_dialer_watcher.impl_module.db.InAppCallsDatabase;
import com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InAppCallsDatabaseModule_ProvideIacLogsDaoFactory.java */
@e
@y
@x
/* renamed from: rL.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47560c implements h<InterfaceC30891a> {

    /* renamed from: a, reason: collision with root package name */
    public final C47558a f429757a;

    /* renamed from: b, reason: collision with root package name */
    public final C47559b f429758b;

    public C47560c(C47558a c47558a, C47559b c47559b) {
        this.f429757a = c47558a;
        this.f429758b = c47559b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InAppCallsDatabase inAppCallsDatabase = (InAppCallsDatabase) this.f429758b.get();
        this.f429757a.getClass();
        InterfaceC30891a interfaceC30891aU = inAppCallsDatabase.u();
        t.d(interfaceC30891aU);
        return interfaceC30891aU;
    }
}
