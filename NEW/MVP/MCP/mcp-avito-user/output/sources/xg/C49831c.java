package xG;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftCancelApi_Module_ProvideShiftCancelApiFactory.java */
@e
@y
@x
/* renamed from: xG.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49831c implements h<InterfaceC49829a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f442310a;

    public C49831c(f fVar) {
        this.f442310a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f442310a.get();
        C49830b.f442309a.getClass();
        InterfaceC49829a interfaceC49829a = (InterfaceC49829a) r02.create(InterfaceC49829a.class);
        t.d(interfaceC49829a);
        return interfaceC49829a;
    }
}
