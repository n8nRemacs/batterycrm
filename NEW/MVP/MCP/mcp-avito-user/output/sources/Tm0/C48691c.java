package tm0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RemoteTogglesFetcherApi_Module_ProvideRemoteTogglesFetcherApiFactory.java */
@e
@y
@x
/* renamed from: tm0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48691c implements h<InterfaceC48689a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f439409a;

    public C48691c(f fVar) {
        this.f439409a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439409a.get();
        C48690b.f439408a.getClass();
        InterfaceC48689a interfaceC48689a = (InterfaceC48689a) r02.create(InterfaceC48689a.class);
        t.d(interfaceC48689a);
        return interfaceC48689a;
    }
}
