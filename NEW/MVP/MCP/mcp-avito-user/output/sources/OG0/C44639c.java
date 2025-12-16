package oG0;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalMapResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: oG0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44639c implements dagger.internal.h<C44638b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f419644a;

    public C44639c(l lVar) {
        this.f419644a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C44638b((Resources) this.f419644a.f393949a);
    }
}
