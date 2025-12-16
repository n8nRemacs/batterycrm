package Of0;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishLimitsIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: Of0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14683c implements h<C14682b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f12477a;

    public C14683c(l lVar) {
        this.f12477a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C14682b((Application) this.f12477a.f393949a);
    }
}
