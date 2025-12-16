package pU;

import Y61.k;
import dagger.internal.h;
import fV0.C40341a;
import fV0.InterfaceC40342b;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DateTimeClientModule_ProvideDateTimeClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpU/b;", "Ldagger/internal/h;", "LfV0/b;", "a", "_design-modules_beduin-v2_interactions_repository_common_date-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pU.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47003b implements h<InterfaceC40342b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f428540b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<RT0.f> f428541a;

    /* compiled from: DateTimeClientModule_ProvideDateTimeClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpU/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_date-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pU.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47003b(@k Provider<RT0.f> provider) {
        this.f428541a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RT0.f fVar = this.f428541a.get();
        f428540b.getClass();
        C47002a.f428539a.getClass();
        return new C40341a(fVar);
    }
}
