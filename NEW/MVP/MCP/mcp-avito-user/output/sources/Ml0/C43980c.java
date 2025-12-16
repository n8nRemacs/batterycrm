package mL0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DiscountApi_Module_ProvideDiscountApiFactory.java */
@e
@y
@x
/* renamed from: mL0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43980c implements h<InterfaceC43978a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414479a;

    public C43980c(f fVar) {
        this.f414479a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414479a.get();
        C43979b.f414478a.getClass();
        InterfaceC43978a interfaceC43978a = (InterfaceC43978a) r02.create(InterfaceC43978a.class);
        t.d(interfaceC43978a);
        return interfaceC43978a;
    }
}
