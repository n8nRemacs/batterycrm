package u70;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneProtectionInfoApi_Module_ProvidePhoneProtectionInfoApiFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<InterfaceC48811a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f439806a;

    public c(f fVar) {
        this.f439806a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439806a.get();
        b.f439805a.getClass();
        InterfaceC48811a interfaceC48811a = (InterfaceC48811a) r02.create(InterfaceC48811a.class);
        t.d(interfaceC48811a);
        return interfaceC48811a;
    }
}
