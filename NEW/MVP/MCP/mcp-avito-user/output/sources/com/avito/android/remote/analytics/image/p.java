package com.avito.android.remote.analytics.image;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.u;
import com.avito.android.remote.analytics.y;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lj0.C43784d;
import lj0.InterfaceC43782b;

/* compiled from: ImagesNetworkErrorsReporterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/p;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/image/o;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f253148g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<q> f253149a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<u> f253150b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253151c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.analytics.n> f253152d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<y> f253153e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43784d f253154f;

    /* compiled from: ImagesNetworkErrorsReporterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/p$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k dagger.internal.f fVar, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k C43784d c43784d) {
        this.f253149a = provider;
        this.f253150b = provider2;
        this.f253151c = fVar;
        this.f253152d = provider3;
        this.f253153e = provider4;
        this.f253154f = c43784d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = this.f253149a.get();
        u uVar = this.f253150b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f253151c.get();
        com.avito.android.remote.analytics.n nVar = this.f253152d.get();
        y yVar = this.f253153e.get();
        InterfaceC43782b interfaceC43782b = (InterfaceC43782b) this.f253154f.get();
        f253148g.getClass();
        return new o(qVar, uVar, interfaceC28373a, nVar, yVar, interfaceC43782b);
    }
}
