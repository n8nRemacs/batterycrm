package gO0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VirtualDealRoomInviteApi_Module_ProvideVirtualDealRoomInviteApiFactory.java */
@e
@y
@x
/* renamed from: gO0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40608c implements h<InterfaceC40606a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f396476a;

    public C40608c(f fVar) {
        this.f396476a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f396476a.get();
        C40607b.f396475a.getClass();
        InterfaceC40606a interfaceC40606a = (InterfaceC40606a) r02.create(InterfaceC40606a.class);
        t.d(interfaceC40606a);
        return interfaceC40606a;
    }
}
