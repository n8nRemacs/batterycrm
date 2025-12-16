package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.clickstream.H;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import proto.events.apps.BatchOuterClass;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamSenderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/Q;", "Lcom/avito/android/analytics/clickstream/H;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28377b f89759a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event> f89760b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f89761c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H.a f89762d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f89763e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f89764f = UUID.randomUUID().toString();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final b0 f89765g = new b0(new C28376a());

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f89766h;

    public Q(@Y61.k com.avito.android.remote.H h12, @Y61.k InterfaceC28377b interfaceC28377b, @Y61.k com.avito.android.analytics.inhouse_transport.u uVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k H.a aVar, @Y61.k com.avito.android.util.C c12) {
        this.f89759a = interfaceC28377b;
        this.f89760b = uVar;
        this.f89761c = interfaceC35745a5;
        this.f89762d = aVar;
        this.f89763e = c12;
        this.f89766h = h12.getF253025a();
    }

    public static final io.reactivex.rxjava3.core.I b(Q q12, List list) {
        q12.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((EventOuterClass.Event) it.next()).getEventId()));
        }
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.core.I.q(new H.c.b(arrayList));
        }
        LinkedHashMap linkedHashMapA = q12.f89765g.a(q12.f89762d.a());
        BatchOuterClass.Envelope.a aVarNewBuilder = BatchOuterClass.Envelope.newBuilder();
        aVarNewBuilder.n();
        ((BatchOuterClass.Envelope) aVarNewBuilder.f362681c).setVersion(1);
        aVarNewBuilder.t("sdk", "android/0.0.0");
        aVarNewBuilder.t("build_uid", q12.f89766h);
        aVarNewBuilder.t("src_id", "148");
        com.avito.android.util.C c12 = q12.f89763e;
        aVarNewBuilder.t("software_version", c12.getF125493m());
        aVarNewBuilder.t("build", String.valueOf(c12.getF125492l()));
        aVarNewBuilder.n();
        ((BatchOuterClass.Envelope) aVarNewBuilder.f362681c).getMutableCommonMap().putAll(linkedHashMapA);
        aVarNewBuilder.s("src_id", "148");
        aVarNewBuilder.s("software_version", c12.getF125493m());
        aVarNewBuilder.s("build", String.valueOf(c12.getF125492l()));
        aVarNewBuilder.s("run_id", q12.f89764f);
        aVarNewBuilder.n();
        ((BatchOuterClass.Envelope) aVarNewBuilder.f362681c).addAllEvents(list);
        return q12.f89759a.a(aVarNewBuilder.c5()).z(q12.f89761c.a()).r(new P(arrayList)).u(new I(0));
    }

    @Override // com.avito.android.analytics.clickstream.H
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W a(boolean z12) {
        V2.f318762a.i("ClickStream", AK.c.s(new StringBuilder("Send events: uid="), this.f89766h, " to srcId=148"), null);
        InterfaceC35745a5 interfaceC35745a5 = this.f89761c;
        if (!z12) {
            return new io.reactivex.rxjava3.internal.operators.single.G(new VH0.c(this, 4)).n(new N(this)).r(O.f89757b).z(interfaceC35745a5.a());
        }
        int iA2 = this.f89760b.a();
        int i12 = iA2 / 100;
        int i13 = iA2 % 100;
        if (i13 != 0) {
            i12++;
        }
        if (i13 <= 0) {
            i13 = 100;
        }
        ArrayList arrayList = new ArrayList(i12);
        for (int i14 = 0; i14 < i12; i14++) {
            arrayList.add(100);
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(Integer.valueOf(i13));
        }
        return new C41936b0(io.reactivex.rxjava3.core.z.X(arrayList), new L(this)).H0().z(interfaceC35745a5.a());
    }
}
