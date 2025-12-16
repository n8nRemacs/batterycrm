package com.avito.android.service.short_task.metrics;

import com.avito.android.analytics.event.C28416g0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: SendMetricsTaskDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0001 \u0004*\r\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0002\b\u00030\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/service/short_task/metrics/m;", "", "Lj41/e;", "kotlin.jvm.PlatformType", "metrics", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f274100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f274101c;

    public x(LinkedHashMap linkedHashMap, A a12) {
        this.f274100b = linkedHashMap;
        this.f274101c = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<m> list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (m mVar : list) {
            arrayList.add(new Q(mVar.f274089a, mVar.f274090b));
        }
        this.f274101c.f274062b.c(new C28416g0(P0.k(P0.p(arrayList), this.f274100b)));
    }
}
