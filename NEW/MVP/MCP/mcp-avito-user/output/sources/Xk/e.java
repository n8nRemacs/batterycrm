package xK;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import nt.i;

/* compiled from: IacCallScreenDialerMediatorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<C49854d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f442400a;

    /* renamed from: b, reason: collision with root package name */
    public final i f442401b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f442402c;

    public e(dagger.internal.f fVar, i iVar, C30102l3 c30102l3) {
        this.f442400a = fVar;
        this.f442401b = iVar;
        this.f442402c = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49854d(g.b(this.f442400a), (nt.f) this.f442401b.get(), (Context) this.f442402c.get());
    }
}
