package sO;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemMapApi_Module_ProvideItemMapApiFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<InterfaceC48083a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f437638a;

    public c(f fVar) {
        this.f437638a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f437638a.get();
        C48084b.f437637a.getClass();
        InterfaceC48083a interfaceC48083a = (InterfaceC48083a) r02.create(InterfaceC48083a.class);
        t.d(interfaceC48083a);
        return interfaceC48083a;
    }
}
