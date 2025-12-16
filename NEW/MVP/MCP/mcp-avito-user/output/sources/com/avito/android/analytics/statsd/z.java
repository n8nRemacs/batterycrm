package com.avito.android.analytics.statsd;

import Ec.InterfaceC13473b;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.statsd.y;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35881r2;
import com.avito.android.util.V2;
import java.time.Duration;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StatsdEventTrackerImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/analytics/statsd/z;", "Lcom/avito/android/analytics/r;", "Lcom/avito/android/analytics/statsd/y;", "Lcom/avito/android/util/r2;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z implements com.avito.android.analytics.r<y>, InterfaceC35881r2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.inhouse_transport.u<StatsdRecord> f91093a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.inhouse_transport.k f91094b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f91095c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f91096d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13473b f91097e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f91098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35881r2.a f91099g = InterfaceC35881r2.a.f318986a;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f91100h;

    /* renamed from: i, reason: collision with root package name */
    public long f91101i;

    /* compiled from: StatsdEventTrackerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/statsd/z$a;", "", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Duration f91102a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f91103b;

        public a(@Y61.k Duration duration, boolean z12) {
            this.f91102a = duration;
            this.f91103b = z12;
        }
    }

    @Inject
    public z(@Y61.k com.avito.android.analytics.inhouse_transport.u<StatsdRecord> uVar, @Y61.k com.avito.android.analytics.inhouse_transport.k kVar, @Y61.k C c12, @Y61.k a aVar, @Y61.k InterfaceC13473b interfaceC13473b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.server_time.h hVar) {
        this.f91093a = uVar;
        this.f91094b = kVar;
        this.f91095c = c12;
        this.f91096d = aVar;
        this.f91097e = interfaceC13473b;
        this.f91098f = hVar;
        this.f91100h = interfaceC35745a5.g(Executors.newSingleThreadExecutor(new com.avito.android.analytics.clickstream.D(1)));
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
        this.f91099g.getClass();
    }

    @Override // com.avito.android.analytics.r
    public final void c(InterfaceC28464o interfaceC28464o) {
        StatsdType statsdType;
        y yVar = (y) interfaceC28464o;
        this.f91095c.a(yVar);
        String str = this.f91097e.getF4112a() + '.' + yVar.f91091b;
        if (yVar instanceof y.c) {
            statsdType = StatsdType.TIME;
        } else if (yVar instanceof y.a) {
            statsdType = StatsdType.COUNT;
        } else {
            if (!(yVar instanceof y.b)) {
                throw new NoWhenBranchMatchedException();
            }
            statsdType = StatsdType.GAUGE;
        }
        com.avito.android.server_time.h hVar = this.f91098f;
        StatsdRecord statsdRecord = new StatsdRecord(str, statsdType, yVar.f91092c, Long.valueOf(hVar.now()));
        com.avito.android.analytics.inhouse_transport.u<StatsdRecord> uVar = this.f91093a;
        uVar.add(statsdRecord);
        a aVar = this.f91096d;
        if (aVar.f91103b) {
            V2.f318762a.c("Statsd", "Event: " + statsdRecord.getType() + ':' + statsdRecord.getKey() + ':' + statsdRecord.getValue(), null);
        }
        if (uVar.a() < 100 || aVar.f91102a.toMillis() > hVar.now() - this.f91101i) {
            return;
        }
        this.f91094b.flush();
        this.f91101i = hVar.now();
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final io.reactivex.rxjava3.core.H getF91100h() {
        return this.f91100h;
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    public final Class<y> i() {
        return y.class;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized */
    public final boolean getF318637a() {
        this.f91099g.getClass();
        return true;
    }
}
