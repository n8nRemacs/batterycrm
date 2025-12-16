package BM0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationApi_Module_ProvideVerificationApiFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f1360a;

    public c(f fVar) {
        this.f1360a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f1360a.get();
        b.f1359a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
