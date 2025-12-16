package jG;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RegistrationSelfEmploymentRedirectScreenApi_Module_ProvideRegistrationSelfEmploymentRedirectScreenApiFactory.java */
@e
@y
@x
/* renamed from: jG.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42252c implements h<InterfaceC42250a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f405532a;

    public C42252c(f fVar) {
        this.f405532a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f405532a.get();
        C42251b.f405531a.getClass();
        InterfaceC42250a interfaceC42250a = (InterfaceC42250a) r02.create(InterfaceC42250a.class);
        t.d(interfaceC42250a);
        return interfaceC42250a;
    }
}
