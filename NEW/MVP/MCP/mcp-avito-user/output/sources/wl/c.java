package Wl;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarSelectApi_Module_ProvideCalendarSelectApiFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC15773a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f18029a;

    public c(f fVar) {
        this.f18029a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f18029a.get();
        b.f18028a.getClass();
        InterfaceC15773a interfaceC15773a = (InterfaceC15773a) r02.create(InterfaceC15773a.class);
        t.d(interfaceC15773a);
        return interfaceC15773a;
    }
}
