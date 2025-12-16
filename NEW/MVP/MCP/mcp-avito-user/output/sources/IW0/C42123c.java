package iw0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShortTermRentApi_Module_ProvideShortTermRentApiFactory.java */
@e
@y
@x
/* renamed from: iw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42123c implements h<InterfaceC42121a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f405392a;

    public C42123c(f fVar) {
        this.f405392a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f405392a.get();
        C42122b.f405391a.getClass();
        InterfaceC42121a interfaceC42121a = (InterfaceC42121a) r02.create(InterfaceC42121a.class);
        t.d(interfaceC42121a);
        return interfaceC42121a;
    }
}
