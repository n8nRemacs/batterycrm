package cM;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacProblemNotificationAllCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f57830a;

    public q(dagger.internal.f fVar) {
        this.f57830a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.notification.m) this.f57830a.get());
    }
}
