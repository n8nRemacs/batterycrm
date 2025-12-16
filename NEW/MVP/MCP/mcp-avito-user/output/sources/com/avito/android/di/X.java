package com.avito.android.di;

import com.avito.android.analytics.statsd.C28521m;
import com.avito.android.analytics.statsd.InterfaceC28520l;
import com.avito.android.analytics.statsd.StatsdRecord;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: StatsdSendDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/X;", "Lcom/avito/android/di/h;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface X extends InterfaceC29971h {
    @C28521m.a
    @Y61.k
    com.avito.android.analytics.inhouse_transport.u<StatsdRecord> Rb();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC28520l n8();

    @Y61.k
    com.avito.android.server_time.h y();
}
