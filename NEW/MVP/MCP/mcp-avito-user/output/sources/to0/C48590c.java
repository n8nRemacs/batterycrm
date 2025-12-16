package tO0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VirtualDealRoomReferenceCategoryApi_Module_ProvideVirtualDealRoomReferenceCategoryApiFactory.java */
@e
@y
@x
/* renamed from: tO0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48590c implements h<InterfaceC48588a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f439241a;

    public C48590c(f fVar) {
        this.f439241a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439241a.get();
        C48589b.f439240a.getClass();
        InterfaceC48588a interfaceC48588a = (InterfaceC48588a) r02.create(InterfaceC48588a.class);
        t.d(interfaceC48588a);
        return interfaceC48588a;
    }
}
