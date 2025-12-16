package com.avito.android.analytics.statsd;

import com.avito.android.analytics.inhouse_transport.A;
import java.time.Duration;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StatsdSenderImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/A;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/analytics/inhouse_transport/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class N<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f91044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<StatsdRecord> f91045c;

    public N(L l12, List<StatsdRecord> list) {
        this.f91044b = l12;
        this.f91045c = list;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Duration duration = L.f91038e;
        L l12 = this.f91044b;
        l12.getClass();
        if (((com.avito.android.analytics.inhouse_transport.A) obj) instanceof A.a) {
            l12.f91040b.b(this.f91045c);
        }
    }
}
