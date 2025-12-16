package com.avito.android.player.router;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlayerIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f220230a;

    /* renamed from: b, reason: collision with root package name */
    public final O f220231b;

    public f(l lVar, O o12) {
        this.f220230a = lVar;
        this.f220231b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Application) this.f220230a.f393949a, (L) this.f220231b.get());
    }
}
