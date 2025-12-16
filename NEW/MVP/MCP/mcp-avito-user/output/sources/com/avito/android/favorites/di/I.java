package com.avito.android.favorites.di;

import android.app.Application;
import com.avito.android.di.C29972i;
import com.avito.android.favorites.Z;
import com.avito.android.favorites.di.C30644b;
import com.avito.android.service.short_task.ShortTask;

/* compiled from: FavoritesModule_ProvideFavoriteAdvertsTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f156934a;

    public I(dagger.internal.l lVar) {
        this.f156934a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f156934a.f393949a;
        F.f156931a.getClass();
        C30644b.C4600b c4600b = new C30644b.C4600b();
        B b12 = (B) C29972i.a(C29972i.b(application), B.class);
        c4600b.f157310a = b12;
        return new Z(new C30644b.c(b12, null).f157315e.get());
    }
}
