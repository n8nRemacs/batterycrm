package aP0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletApi_Module_ProvideWalletApiFactory.java */
@e
@y
@x
/* renamed from: aP0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19804c implements h<InterfaceC19802a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f20895a;

    public C19804c(f fVar) {
        this.f20895a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f20895a.get();
        C19803b.f20894a.getClass();
        InterfaceC19802a interfaceC19802a = (InterfaceC19802a) r02.create(InterfaceC19802a.class);
        t.d(interfaceC19802a);
        return interfaceC19802a;
    }
}
