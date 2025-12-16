package n70;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalSelectionsApi_Module_ProvidePersonalSelectionsApiFactory.java */
@e
@y
@x
/* renamed from: n70.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44209c implements h<InterfaceC44207a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414906a;

    public C44209c(f fVar) {
        this.f414906a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414906a.get();
        C44208b.f414905a.getClass();
        InterfaceC44207a interfaceC44207a = (InterfaceC44207a) r02.create(InterfaceC44207a.class);
        t.d(interfaceC44207a);
        return interfaceC44207a;
    }
}
