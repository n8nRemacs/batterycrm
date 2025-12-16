package qk;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: B2bBusinessTripIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<com.avito.android.btob_business_trip.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f429350a;

    public c(l lVar) {
        this.f429350a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.btob_business_trip.a((Application) this.f429350a.f393949a);
    }
}
