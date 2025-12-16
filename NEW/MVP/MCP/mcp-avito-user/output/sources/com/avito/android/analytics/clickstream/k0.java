package com.avito.android.analytics.clickstream;

import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SendClickStreamEventsTaskDelegateImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/k0;", "Lcom/avito/android/analytics/clickstream/h0;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f89810a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32896n f89811b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f89812c;

    @Inject
    public k0(@Y61.k H h12, @Y61.k InterfaceC32896n interfaceC32896n, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f89810a = h12;
        this.f89811b = interfaceC32896n;
        this.f89812c = interfaceC28373a;
    }

    @Override // com.avito.android.analytics.clickstream.h0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.U start() {
        return this.f89810a.a(this.f89811b.h().invoke().booleanValue()).k(new i0(this)).r(new j0(this)).u(new androidx.room.rxjava3.b(this, 3));
    }
}
