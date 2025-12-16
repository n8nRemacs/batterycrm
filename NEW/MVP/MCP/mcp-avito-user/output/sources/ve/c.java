package Ve;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoResellerContactsApi_Module_ProvideAutoResellerContactsApiFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<InterfaceC15669a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f17335a;

    public c(f fVar) {
        this.f17335a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f17335a.get();
        b.f17334a.getClass();
        InterfaceC15669a interfaceC15669a = (InterfaceC15669a) r02.create(InterfaceC15669a.class);
        t.d(interfaceC15669a);
        return interfaceC15669a;
    }
}
