package Zd;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InternalAuthIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f20315a;

    public l(dagger.internal.l lVar) {
        this.f20315a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Application) this.f20315a.f393949a);
    }
}
