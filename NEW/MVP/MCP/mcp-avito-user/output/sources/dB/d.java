package Db;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommercialFeaturesImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advertising.splitter.features.d f3252a;

    public d(com.avito.android.advertising.splitter.features.d dVar) {
        this.f3252a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.advertising.splitter.features.a) this.f3252a.get());
    }
}
