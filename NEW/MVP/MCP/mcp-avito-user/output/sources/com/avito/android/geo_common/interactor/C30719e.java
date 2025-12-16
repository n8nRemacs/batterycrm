package com.avito.android.geo_common.interactor;

import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mF.InterfaceC43955a;
import pF.InterfaceC46942a;

/* compiled from: LocationDirectionsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/geo_common/interactor/e;", "Ldagger/internal/h;", "Lcom/avito/android/geo_common/interactor/d;", "a", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.geo_common.interactor.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30719e implements dagger.internal.h<C30718d> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f159337d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f159338a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC46942a> f159339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC43955a> f159340c;

    /* compiled from: LocationDirectionsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/geo_common/interactor/e$a;", "", "<init>", "()V", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.geo_common.interactor.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30719e(@Y61.k Provider<R0> provider, @Y61.k Provider<InterfaceC46942a> provider2, @Y61.k Provider<InterfaceC43955a> provider3) {
        this.f159338a = provider;
        this.f159339b = provider2;
        this.f159340c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f159338a.get();
        h31.e eVarB = dagger.internal.g.b(this.f159339b);
        h31.e eVarB2 = dagger.internal.g.b(this.f159340c);
        f159337d.getClass();
        return new C30718d(r02, eVarB, eVarB2);
    }
}
