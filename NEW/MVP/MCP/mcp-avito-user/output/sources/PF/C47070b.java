package pf;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: pf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47070b implements h<C47069a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f428708a;

    public C47070b(f fVar) {
        this.f428708a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47069a((InterfaceC28373a) this.f428708a.get());
    }
}
