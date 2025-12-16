package so;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckoutApi_Module_ProvideCheckoutApiFactory.java */
@e
@y
@x
/* renamed from: so.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C48390c implements h<InterfaceC48388a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f438852a;

    public C48390c(f fVar) {
        this.f438852a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f438852a.get();
        C48389b.f438851a.getClass();
        InterfaceC48388a interfaceC48388a = (InterfaceC48388a) r02.create(InterfaceC48388a.class);
        t.d(interfaceC48388a);
        return interfaceC48388a;
    }
}
