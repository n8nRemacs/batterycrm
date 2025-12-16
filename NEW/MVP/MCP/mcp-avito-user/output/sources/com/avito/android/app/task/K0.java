package com.avito.android.app.task;

/* compiled from: MessengerPhotosCleanupTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class K0 implements dagger.internal.h<MessengerPhotosCleanupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final I0 f91478a;

    public K0(I0 i02) {
        this.f91478a = i02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MessengerPhotosCleanupTask((G0) this.f91478a.get());
    }
}
