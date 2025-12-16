package ie;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthorizationApi_Module_ProvideAuthorizationApiFactory.java */
@e
@y
@x
/* renamed from: ie.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41391c implements h<InterfaceC41389a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f398609a;

    public C41391c(f fVar) {
        this.f398609a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398609a.get();
        C41390b.f398608a.getClass();
        InterfaceC41389a interfaceC41389a = (InterfaceC41389a) r02.create(InterfaceC41389a.class);
        t.d(interfaceC41389a);
        return interfaceC41389a;
    }
}
