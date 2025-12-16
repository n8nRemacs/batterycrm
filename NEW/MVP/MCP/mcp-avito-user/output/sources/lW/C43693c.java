package lW;

import X41.n;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.server_time.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationAnalyticsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LlW/c;", "Ldagger/internal/h;", "LlW/b;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lW.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43693c implements h<C43692b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f413829c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC28373a> f413830a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<f> f413831b;

    /* compiled from: LocationAnalyticsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlW/c$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lW.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43693c(@k Provider<InterfaceC28373a> provider, @k Provider<f> provider2) {
        this.f413830a = provider;
        this.f413831b = provider2;
    }

    @n
    @k
    public static final C43693c a(@k Provider<InterfaceC28373a> provider, @k Provider<f> provider2) {
        f413829c.getClass();
        return new C43693c(provider, provider2);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f413830a.get();
        f fVar = this.f413831b.get();
        f413829c.getClass();
        return new C43692b(interfaceC28373a, fVar);
    }
}
