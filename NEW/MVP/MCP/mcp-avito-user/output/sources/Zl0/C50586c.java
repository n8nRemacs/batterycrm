package zl0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.y;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkRequestsRetriesAnalytics_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lzl0/c;", "Ldagger/internal/h;", "Lzl0/b;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50586c implements h<C50585b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f444222c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f444223a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f444224b;

    /* compiled from: NetworkRequestsRetriesAnalytics_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl0/c$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zl0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50586c(@k dagger.internal.f fVar, @k u uVar) {
        this.f444223a = fVar;
        this.f444224b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f444223a.get();
        y yVar = (y) this.f444224b.get();
        f444222c.getClass();
        return new C50585b(interfaceC28373a, yVar);
    }
}
