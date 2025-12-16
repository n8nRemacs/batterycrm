package Hh;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinRunUntilLimitPersistentStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C13991a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f7607a;

    public c(C30214v6 c30214v6) {
        this.f7607a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13991a((l) this.f7607a.get());
    }
}
