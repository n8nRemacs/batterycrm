package com.avito.android.analytics.statsd;

import com.avito.android.analytics.statsd.C28521m;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StatsdSenderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/statsd/L;", "Lcom/avito/android/analytics/statsd/J;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class L implements J {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Duration f91038e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28520l f91039a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.inhouse_transport.u<StatsdRecord> f91040b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91041c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f91042d;

    /* compiled from: StatsdSenderImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/L$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f91038e = Duration.ofDays(7L);
    }

    @Inject
    public L(@Y61.k InterfaceC28520l interfaceC28520l, @C28521m.a @Y61.k com.avito.android.analytics.inhouse_transport.u<StatsdRecord> uVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.server_time.h hVar) {
        this.f91039a = interfaceC28520l;
        this.f91040b = uVar;
        this.f91041c = interfaceC35745a5;
        this.f91042d = hVar;
    }

    @Override // com.avito.android.analytics.statsd.J
    @Y61.k
    public final W a() {
        return new io.reactivex.rxjava3.internal.operators.single.G(new Callable() { // from class: com.avito.android.analytics.statsd.K
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                L l12 = this.f91037b;
                M m12 = new M(l12.f91042d.now() - L.f91038e.toMillis());
                ArrayList arrayList = new ArrayList();
                while (arrayList.size() < 100) {
                    com.avito.android.analytics.inhouse_transport.u<StatsdRecord> uVar = l12.f91040b;
                    if (uVar.isEmpty()) {
                        break;
                    }
                    List<StatsdRecord> listE = uVar.e(100 - arrayList.size());
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listE) {
                        if (((Boolean) m12.invoke(obj)).booleanValue()) {
                            arrayList2.add(obj);
                        }
                    }
                    C42745f0.h(arrayList2, arrayList);
                }
                return arrayList;
            }
        }).n(new O(this)).z(this.f91041c.a());
    }
}
