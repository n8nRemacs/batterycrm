package x9;

import android.content.res.Resources;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EquipmentsResourceProviderImpl_Factory.java */
@e
@y
@x
/* renamed from: x9.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49796c implements h<C49795b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f442272a;

    public C49796c(l lVar) {
        this.f442272a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C49795b((Resources) this.f442272a.f393949a);
    }
}
