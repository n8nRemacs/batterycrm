package MH0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbStatusBlockEventsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f10544a;

    public e(u uVar) {
        this.f10544a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC28373a) this.f10544a.get());
    }
}
