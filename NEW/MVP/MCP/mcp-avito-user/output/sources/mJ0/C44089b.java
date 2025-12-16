package mj0;

import Y61.k;
import com.avito.android.remote.analytics.u;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UrlDefinitionProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lmj0/b;", "Ldagger/internal/h;", "Lmj0/a;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mj0.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C44089b implements h<C44088a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414667b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<u> f414668a;

    /* compiled from: UrlDefinitionProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmj0/b$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mj0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44089b(@k Provider<u> provider) {
        this.f414668a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = this.f414668a.get();
        f414667b.getClass();
        return new C44088a(uVar);
    }
}
