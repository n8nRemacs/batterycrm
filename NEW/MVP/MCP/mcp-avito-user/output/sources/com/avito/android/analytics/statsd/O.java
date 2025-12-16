package com.avito.android.analytics.statsd;

import com.avito.android.analytics.inhouse_transport.A;
import java.time.Duration;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StatsdSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/analytics/statsd/StatsdRecord;", "kotlin.jvm.PlatformType", "events", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/analytics/inhouse_transport/A;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f91046b;

    public O(L l12) {
        this.f91046b = l12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List<StatsdRecord> list = (List) obj;
        Duration duration = L.f91038e;
        L l12 = this.f91046b;
        l12.getClass();
        return (list.isEmpty() ? io.reactivex.rxjava3.core.I.q(new A.b()) : l12.f91039a.a(list).z(l12.f91041c.a()).r(P.f91047b).u(new com.avito.android.analytics.clickstream.I(2))).k(new N(l12, list));
    }
}
