package com.avito.android.service.short_task.metrics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.operators.observable.U;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SendMetricsTaskDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/A;", "Lcom/avito/android/service/short_task/metrics/w;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<n> f274061a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f274062b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f274063c;

    /* JADX WARN: Multi-variable type inference failed */
    public A(@Y61.k List<? extends n> list, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f274061a = list;
        this.f274062b = interfaceC28373a;
        this.f274063c = interfaceC35745a5;
    }

    @Override // com.avito.android.service.short_task.metrics.w
    @Y61.k
    public final O a(@Y61.l String str) {
        List<n> list = this.f274061a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (n nVar : list) {
            io.reactivex.rxjava3.internal.operators.observable.O oI2 = nVar.a().I(new z(nVar));
            U u12 = U.f403867b;
            Objects.requireNonNull(u12, "fallback is null");
            arrayList.add(oI2.l0(io.reactivex.rxjava3.internal.functions.a.g(u12)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("time_to_interact", str);
        }
        io.reactivex.rxjava3.core.z zVarT = io.reactivex.rxjava3.core.z.X(arrayList).T(io.reactivex.rxjava3.internal.functions.a.f401991a, Integer.MAX_VALUE);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        H hC2 = this.f274063c.c();
        zVarT.getClass();
        return zVarT.A0(io.reactivex.rxjava3.core.z.F0(30L, timeUnit, hC2)).H0().k(new x(linkedHashMap, this)).r(y.f274102b);
    }
}
