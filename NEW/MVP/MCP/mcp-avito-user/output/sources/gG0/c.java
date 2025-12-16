package Gg0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingApi_Module_ProvideRatingApiFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<InterfaceC13878a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f6703a;

    public c(f fVar) {
        this.f6703a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f6703a.get();
        C13879b.f6702a.getClass();
        InterfaceC13878a interfaceC13878a = (InterfaceC13878a) r02.create(InterfaceC13878a.class);
        t.d(interfaceC13878a);
        return interfaceC13878a;
    }
}
