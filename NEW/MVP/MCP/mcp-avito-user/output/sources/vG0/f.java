package Vg0;

import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormCoroutineApi_Module_ProvideRatingFormCoroutineApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f17357a;

    public f(dagger.internal.f fVar) {
        this.f17357a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f17357a.get();
        e.f17356a.getClass();
        d dVar = (d) r02.create(d.class);
        t.d(dVar);
        return dVar;
    }
}
