package br;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitorAnalyticsApi_Module_ProvideCompetitorAnalyticsApiFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC25696a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f57492a;

    public c(f fVar) {
        this.f57492a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57492a.get();
        b.f57491a.getClass();
        InterfaceC25696a interfaceC25696a = (InterfaceC25696a) r02.create(InterfaceC25696a.class);
        t.d(interfaceC25696a);
        return interfaceC25696a;
    }
}
