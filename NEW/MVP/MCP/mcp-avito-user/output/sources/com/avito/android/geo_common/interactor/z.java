package com.avito.android.geo_common.interactor;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mF.InterfaceC43955a;

/* compiled from: LocationInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/geo_common/interactor/z;", "Ldagger/internal/h;", "Lcom/avito/android/geo_common/interactor/y;", "a", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f159403c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC43955a> f159404a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f159405b;

    /* compiled from: LocationInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/geo_common/interactor/z$a;", "", "<init>", "()V", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public z(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f159404a = provider;
        this.f159405b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f159404a);
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f159405b));
        f159403c.getClass();
        return new y(eVarB, eVarA);
    }
}
