package cZ;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import iP.InterfaceC41329a;
import javax.inject.Provider;

/* compiled from: JobCandidatesEntryPointStatusInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41329a> f57933a;

    public d(Provider<InterfaceC41329a> provider) {
        this.f57933a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.a(w.a(this.f57933a)));
    }
}
