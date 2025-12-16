package Zd;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f20312a;

    /* renamed from: b, reason: collision with root package name */
    public final l f20313b;

    public d(dagger.internal.l lVar, l lVar2) {
        this.f20312a = lVar;
        this.f20313b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Application) this.f20312a.f393949a, (i) this.f20313b.get());
    }
}
