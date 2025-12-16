package com.avito.android.remote.analytics;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.analytics.InterfaceC28373a;
import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lj0.C43784d;
import lj0.InterfaceC43782b;

/* compiled from: NetworkErrorsReporterFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/l;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/k;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f253175g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f253176a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final K1 f253177b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253178c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<n> f253179d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<y> f253180e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43784d f253181f;

    /* compiled from: NetworkErrorsReporterFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/l$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k Provider provider, @Y61.k K1 k12, @Y61.k dagger.internal.f fVar, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k C43784d c43784d) {
        this.f253176a = provider;
        this.f253177b = k12;
        this.f253178c = fVar;
        this.f253179d = provider2;
        this.f253180e = provider3;
        this.f253181f = c43784d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f253176a);
        I1 i12 = (I1) this.f253177b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f253178c.get();
        n nVar = this.f253179d.get();
        y yVar = this.f253180e.get();
        InterfaceC43782b interfaceC43782b = (InterfaceC43782b) this.f253181f.get();
        f253175g.getClass();
        return new k(eVarB, i12, interfaceC28373a, nVar, yVar, interfaceC43782b);
    }
}
