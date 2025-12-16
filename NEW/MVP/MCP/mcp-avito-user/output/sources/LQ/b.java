package Lq;

import com.avito.android.P;
import com.avito.android.S;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AndroidXPlatformProvider_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C14429a> {

    /* renamed from: a, reason: collision with root package name */
    public final S f10130a;

    public b(S s5) {
        this.f10130a = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14429a((P) this.f10130a.get());
    }
}
