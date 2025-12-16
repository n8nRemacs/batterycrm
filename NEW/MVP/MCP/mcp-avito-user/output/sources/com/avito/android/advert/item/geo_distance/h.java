package com.avito.android.advert.item.geo_distance;

import androidx.appcompat.app.r;
import com.avito.android.advert.item.geo_distance.g;
import com.avito.android.remote.model.geo_distance.AdvertDetailsGeoDistance;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.android.travel_time_calculator.data.TransportType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/travel_time_calculator/data/TransportType;", "", "results", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.l<Map<TransportType, ? extends Long>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f75703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsGeoDistance.MeasureOnClientData f75704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f75705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, AdvertDetailsGeoDistance.MeasureOnClientData measureOnClientData, k kVar) {
        super(1);
        this.f75703l = gVar;
        this.f75704m = measureOnClientData;
        this.f75705n = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Map<TransportType, ? extends Long> map) {
        Map<TransportType, ? extends Long> map2 = map;
        String titlePrefix = this.f75704m.getTitlePrefix();
        g gVar = this.f75703l;
        boolean zIsEmpty = map2.isEmpty();
        k kVar = this.f75705n;
        if (zIsEmpty) {
            g.a.d dVar = g.a.d.f75700a;
            gVar.f75694g = dVar;
            gVar.k(dVar, kVar);
        } else {
            gVar.f75692e.getClass();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder(titlePrefix.concat("{{prefixSpacer}}"));
            arrayList.add(new SpacerAttribute("prefixSpacer", "prefixSpacer", null, 8));
            Iterator<T> it = m.f75717a.iterator();
            boolean z12 = true;
            while (it.hasNext()) {
                Q q12 = (Q) it.next();
                TransportType transportType = (TransportType) q12.f406619b;
                String str = (String) q12.f406620c;
                Long l12 = map2.get(transportType);
                if (l12 != null) {
                    long jLongValue = l12.longValue();
                    if (!z12) {
                        sb2.append("{{routeSpacer}}");
                        arrayList.add(new SpacerAttribute("routeSpacer", "routeSpacer", null, 10));
                    }
                    StringBuilder sbA = r.A("{{", str, "}} ");
                    e.a aVar = kotlin.time.e.f410651c;
                    long jH2 = kotlin.time.g.h(jLongValue, DurationUnit.f410634f);
                    StringBuilder sb3 = new StringBuilder();
                    long jL2 = kotlin.time.e.l(jH2, DurationUnit.f410636h);
                    int iF2 = kotlin.time.e.f(jH2);
                    kotlin.time.e.i(jH2);
                    kotlin.time.e.h(jH2);
                    if (jL2 != 0) {
                        sb3.append(jL2);
                        sb3.append(" ч");
                    }
                    if (iF2 != 0) {
                        if (sb3.length() > 0) {
                            sb3.append(" ");
                        }
                        sb3.append(iF2);
                        sb3.append(" мин");
                    }
                    sbA.append(sb3.toString());
                    sb2.append(sbA.toString());
                    arrayList.add(new TextIconAttribute(str, str, null, null, 12, null));
                    z12 = false;
                }
            }
            g.a.C2249a c2249a = new g.a.C2249a(new AttributedText(sb2.toString(), arrayList, 1));
            gVar.f75694g = c2249a;
            gVar.k(c2249a, kVar);
        }
        return G0.f406611a;
    }
}
