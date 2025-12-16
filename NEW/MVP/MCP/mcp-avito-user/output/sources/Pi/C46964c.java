package pI;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationApi_Module_ProvideLocationApiFactory.java */
@e
@y
@x
/* renamed from: pI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C46964c implements h<InterfaceC46962a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f428486a;

    public C46964c(f fVar) {
        this.f428486a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f428486a.get();
        C46963b.f428485a.getClass();
        InterfaceC46962a interfaceC46962a = (InterfaceC46962a) r02.create(InterfaceC46962a.class);
        t.d(interfaceC46962a);
        return interfaceC46962a;
    }
}
