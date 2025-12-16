package lQ0;

import com.avito.android.work_profile.profile.cvs.mvi.f;
import com.avito.android.work_profile.profile.cvs.mvi.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvsViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<C43670a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f413736a;

    public b(g gVar) {
        this.f413736a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43670a((f) this.f413736a.get(), null, 2, null);
    }
}
