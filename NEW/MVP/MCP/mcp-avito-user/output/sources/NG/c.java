package nG;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendEsiaDataScreenApi_Module_ProvideSendEsiaDataScreenApiFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC44249a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414966a;

    public c(f fVar) {
        this.f414966a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414966a.get();
        C44250b.f414965a.getClass();
        InterfaceC44249a interfaceC44249a = (InterfaceC44249a) r02.create(InterfaceC44249a.class);
        t.d(interfaceC44249a);
        return interfaceC44249a;
    }
}
