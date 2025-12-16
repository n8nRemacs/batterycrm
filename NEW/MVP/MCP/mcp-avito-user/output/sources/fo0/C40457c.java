package fo0;

import android.app.Application;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InternalSafetySettingsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: fo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40457c implements dagger.internal.h<C40456b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f396081a;

    public C40457c(l lVar) {
        this.f396081a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40456b((Application) this.f396081a.f393949a);
    }
}
