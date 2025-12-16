package lj0;

import Y61.k;
import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MobileNetworkOperatorProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Llj0/d;", "Ldagger/internal/h;", "Llj0/c;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lj0.d, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C43784d implements h<C43783c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f414173c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f414174a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f414175b;

    /* compiled from: MobileNetworkOperatorProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llj0/d$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lj0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43784d(@k l lVar, @k g gVar) {
        this.f414174a = lVar;
        this.f414175b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f414174a.f393949a;
        f fVar = (f) this.f414175b.get();
        f414173c.getClass();
        return new C43783c(application, fVar);
    }
}
