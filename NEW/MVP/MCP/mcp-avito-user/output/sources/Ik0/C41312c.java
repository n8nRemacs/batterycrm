package iK0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserViewedApi_Module_ProvideUserViewedApiFactory.java */
@e
@y
@x
/* renamed from: iK0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41312c implements h<InterfaceC41310a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f398503a;

    public C41312c(f fVar) {
        this.f398503a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398503a.get();
        C41311b.f398502a.getClass();
        InterfaceC41310a interfaceC41310a = (InterfaceC41310a) r02.create(InterfaceC41310a.class);
        t.d(interfaceC41310a);
        return interfaceC41310a;
    }
}
