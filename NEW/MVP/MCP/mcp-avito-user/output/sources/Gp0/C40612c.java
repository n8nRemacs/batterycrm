package gP0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPinCreationApi_Module_ProvideWalletPinCreationApiFactory.java */
@e
@y
@x
/* renamed from: gP0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40612c implements h<InterfaceC40610a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f396478a;

    public C40612c(f fVar) {
        this.f396478a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f396478a.get();
        C40611b.f396477a.getClass();
        InterfaceC40610a interfaceC40610a = (InterfaceC40610a) r02.create(InterfaceC40610a.class);
        t.d(interfaceC40610a);
        return interfaceC40610a;
    }
}
