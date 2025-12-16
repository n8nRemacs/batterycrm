package Zb;

import Y61.k;
import ac.C19864a;
import com.avito.android.C34161r;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnalyticsCallFeaturesModule_ProvideAnalyticsCallFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LZb/b;", "Ldagger/internal/h;", "Lac/a;", "a", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zb.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C19530b implements h<C19864a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f20265b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f20266a;

    /* compiled from: AnalyticsCallFeaturesModule_ProvideAnalyticsCallFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZb/b$a;", "", "<init>", "()V", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zb.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C19530b(@k Provider<C34161r> provider) {
        this.f20266a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f20266a.get();
        f20265b.getClass();
        C19529a.f20264a.getClass();
        return (C19864a) c34161r.f246393a.b(C19864a.class);
    }
}
