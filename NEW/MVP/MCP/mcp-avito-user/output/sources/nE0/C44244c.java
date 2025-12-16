package nE0;

import android.content.Context;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ThemeSettingsResourceProviderImpl_Factory.java */
@e
@y
@x
/* renamed from: nE0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44244c implements h<C44243b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f414955a;

    public C44244c(l lVar) {
        this.f414955a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C44243b((Context) this.f414955a.f393949a);
    }
}
