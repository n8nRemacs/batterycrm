package bQ;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvPackagesIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f57069a;

    public d(l lVar) {
        this.f57069a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Application) this.f57069a.f393949a);
    }
}
