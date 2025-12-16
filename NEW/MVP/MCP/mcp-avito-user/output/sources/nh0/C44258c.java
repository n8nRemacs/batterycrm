package nH0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiUrgencyEventsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: nH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44258c implements h<C44257b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f414982a;

    public C44258c(u uVar) {
        this.f414982a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44257b((InterfaceC28373a) this.f414982a.get());
    }
}
