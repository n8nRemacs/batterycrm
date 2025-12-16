package Z9;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsApi_Module_ProvideAdvertDetailsApiFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f19941a;

    public c(f fVar) {
        this.f19941a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19941a.get();
        b.f19940a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
