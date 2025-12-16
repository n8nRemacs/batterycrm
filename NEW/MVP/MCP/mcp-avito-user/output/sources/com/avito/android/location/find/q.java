package com.avito.android.location.find;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FindLocationPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/find/q;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/p;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f181766c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<d> f181767a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f181768b;

    /* compiled from: FindLocationPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/find/q$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f181767a = provider;
        this.f181768b = uVar;
    }

    @X41.n
    @Y61.k
    public static final q a(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        f181766c.getClass();
        return new q(uVar, provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f181767a.get();
        w wVar = (w) this.f181768b.get();
        f181766c.getClass();
        return new p(dVar, wVar);
    }
}
