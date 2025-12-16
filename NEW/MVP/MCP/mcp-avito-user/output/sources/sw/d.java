package sw;

import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAgencySearchApi_Module_ProvideDevelopmentsAgencySearchApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<InterfaceC48423a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f438919a;

    public d(f fVar) {
        this.f438919a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f438919a.get();
        C48425c.f438918a.getClass();
        InterfaceC48423a interfaceC48423a = (InterfaceC48423a) r02.create(InterfaceC48423a.class);
        t.d(interfaceC48423a);
        return interfaceC48423a;
    }
}
