package com.avito.android.messenger;

import android.app.Application;
import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.photo_picker.C33272x;
import com.avito.android.photo_picker.C33273y;

/* compiled from: MessengerIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f186153a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f186154b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f186155c;

    /* renamed from: d, reason: collision with root package name */
    public final C33273y f186156d;

    /* renamed from: e, reason: collision with root package name */
    public final K1 f186157e;

    /* renamed from: f, reason: collision with root package name */
    public final C30713g1 f186158f;

    public H(dagger.internal.l lVar, com.avito.android.O o12, com.avito.android.navigation.c cVar, C33273y c33273y, K1 k12, C30713g1 c30713g1) {
        this.f186153a = lVar;
        this.f186154b = o12;
        this.f186155c = cVar;
        this.f186156d = c33273y;
        this.f186157e = k12;
        this.f186158f = c30713g1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f186153a.f393949a;
        com.avito.android.L l12 = (com.avito.android.L) this.f186154b.get();
        com.avito.android.navigation.a aVar = (com.avito.android.navigation.a) this.f186155c.get();
        this.f186156d.getClass();
        return new G(application, l12, aVar, new C33272x(), (I1) this.f186157e.get(), (C30277e1) this.f186158f.get());
    }
}
