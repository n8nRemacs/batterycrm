package me0;

import android.content.res.Resources;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InputVinResourceProvider_Factory.java */
@e
@y
@x
/* renamed from: me0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44073b implements h<C44072a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f414656a;

    public C44073b(l lVar) {
        this.f414656a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C44072a((Resources) this.f414656a.f393949a);
    }
}
