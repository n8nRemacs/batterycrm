package Gy;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmailApi_Module_ProvideEmailApiFactory.java */
@e
@y
@x
/* renamed from: Gy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C13930c implements h<InterfaceC13928a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f6805a;

    public C13930c(f fVar) {
        this.f6805a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f6805a.get();
        C13929b.f6804a.getClass();
        InterfaceC13928a interfaceC13928a = (InterfaceC13928a) r02.create(InterfaceC13928a.class);
        t.d(interfaceC13928a);
        return interfaceC13928a;
    }
}
