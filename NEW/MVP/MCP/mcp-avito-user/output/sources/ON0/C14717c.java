package On0;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SingleTimeDeeplinkCacheImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: On0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14717c implements h<C14716b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f12516a;

    public C14717c(l lVar) {
        this.f12516a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C14716b((Application) this.f12516a.f393949a);
    }
}
