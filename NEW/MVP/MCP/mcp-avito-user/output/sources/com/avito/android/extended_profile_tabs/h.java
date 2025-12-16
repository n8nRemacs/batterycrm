package com.avito.android.extended_profile_tabs;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileTabsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f153202a;

    /* renamed from: b, reason: collision with root package name */
    public final O f153203b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f153204c;

    public h(O o12, com.avito.android.navigation.c cVar, dagger.internal.l lVar) {
        this.f153202a = lVar;
        this.f153203b = o12;
        this.f153204c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Application) this.f153202a.f393949a, (L) this.f153203b.get(), (com.avito.android.navigation.a) this.f153204c.get());
    }
}
