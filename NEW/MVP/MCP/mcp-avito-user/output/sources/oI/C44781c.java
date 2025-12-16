package oi;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinApi_Module_ProvideBeduinApiFactory.java */
@e
@y
@x
/* renamed from: oi.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44781c implements h<InterfaceC44779a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f419996a;

    public C44781c(f fVar) {
        this.f419996a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f419996a.get();
        C44780b.f419995a.getClass();
        InterfaceC44779a interfaceC44779a = (InterfaceC44779a) r02.create(InterfaceC44779a.class);
        t.d(interfaceC44779a);
        return interfaceC44779a;
    }
}
