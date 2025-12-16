package tL;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacAppStatusLogWatcherListener_Factory.java */
@e
@y
@x
/* renamed from: tL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48569b implements h<C48568a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f439231a;

    public C48569b(u uVar) {
        this.f439231a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48568a((com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b) this.f439231a.get());
    }
}
