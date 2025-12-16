package Sm0;

import android.content.res.Resources;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResourceProviderImpl_Factory.java */
@e
@y
@x
/* renamed from: Sm0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15204c implements h<C15203b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f15142a;

    public C15204c(l lVar) {
        this.f15142a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C15203b((Resources) this.f15142a.f393949a);
    }
}
