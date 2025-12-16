package y3;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SessionChangeTrackerImpl_Factory.java */
@e
@y
@x
/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50046b implements h<C50045a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f442870a;

    public C50046b(f fVar) {
        this.f442870a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50045a((InterfaceC28373a) this.f442870a.get());
    }
}
