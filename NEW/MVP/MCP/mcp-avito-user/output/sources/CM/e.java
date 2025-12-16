package cM;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacProblemBatteryOptimizationCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<C27065d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f57822a;

    public e(dagger.internal.l lVar) {
        this.f57822a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C27065d((Application) this.f57822a.f393949a);
    }
}
