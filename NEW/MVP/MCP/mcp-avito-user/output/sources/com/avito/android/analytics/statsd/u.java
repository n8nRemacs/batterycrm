package com.avito.android.analytics.statsd;

import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.InterfaceC28464o;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdCommonModule_ProvideStatsdEventObserverFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001b\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0002\b\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics/statsd/u;", "Ldagger/internal/h;", "", "Lcom/avito/android/analytics/r;", "Lcom/avito/android/analytics/o;", "LX41/o;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u implements dagger.internal.h<Set<com.avito.android.analytics.r<? extends InterfaceC28464o>>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f91076c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91077a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC32896n> f91078b;

    /* compiled from: StatsdCommonModule_ProvideStatsdEventObserverFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/u$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public u(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f91077a = uVar;
        this.f91078b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        z zVar = (z) this.f91077a.get();
        InterfaceC32896n interfaceC32896n = this.f91078b.get();
        f91076c.getClass();
        int i12 = C28521m.f91059a;
        Set setSingleton = interfaceC32896n.p().invoke().booleanValue() ? Collections.singleton(zVar) : B0.f406639b;
        dagger.internal.t.b(setSingleton, "Cannot return null from a non-@Nullable @Provides method");
        return setSingleton;
    }
}
