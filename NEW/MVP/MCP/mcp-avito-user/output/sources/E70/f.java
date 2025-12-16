package e70;

import com.avito.android.remote.R0;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalFiltersApi_Module_ProvidePersonalFiltersApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f394967a;

    public f(dagger.internal.f fVar) {
        this.f394967a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f394967a.get();
        e.f394966a.getClass();
        d dVar = (d) r02.create(d.class);
        t.d(dVar);
        return dVar;
    }
}
