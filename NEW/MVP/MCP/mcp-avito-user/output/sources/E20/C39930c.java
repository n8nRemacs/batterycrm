package e20;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageInviteApi_Module_ProvideMortgageInviteApiFactory.java */
@e
@y
@x
/* renamed from: e20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39930c implements h<InterfaceC39928a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f394929a;

    public C39930c(f fVar) {
        this.f394929a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f394929a.get();
        C39929b.f394928a.getClass();
        InterfaceC39928a interfaceC39928a = (InterfaceC39928a) r02.create(InterfaceC39928a.class);
        t.d(interfaceC39928a);
        return interfaceC39928a;
    }
}
