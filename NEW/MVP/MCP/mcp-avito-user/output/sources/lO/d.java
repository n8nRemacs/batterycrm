package Lo;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeCheckIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C14421b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f10122a;

    public d(l lVar) {
        this.f10122a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C14421b((Application) this.f10122a.f393949a);
    }
}
