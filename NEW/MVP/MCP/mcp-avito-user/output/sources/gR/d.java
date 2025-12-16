package Gr;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactAccessIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C13910b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f6751a;

    public d(l lVar) {
        this.f6751a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C13910b((Application) this.f6751a.f393949a);
    }
}
