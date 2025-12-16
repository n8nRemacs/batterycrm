package com.avito.android.item_map.geo_zones;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.error.z;
import com.avito.android.item_map.geo_zones.GeoZonesPoints;
import com.avito.android.item_map.view.V;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import tO.C48587d;
import tO.InterfaceC48584a;

/* compiled from: GeoZonesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "LtO/a;", "kotlin.jvm.PlatformType", "loadingState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<P2<? super InterfaceC48584a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f173355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f173355l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(P2<? super InterfaceC48584a> p22) {
        GeoZonesPresenterState geoZonesPresenterState;
        P2<? super InterfaceC48584a> p23 = p22;
        boolean zF2 = L.f(p23, P2.c.f318721a);
        j jVar = this.f173355l;
        if (zF2) {
            V v12 = jVar.f173359c;
            if (v12 != null) {
                v12.e(null, true);
            }
        } else if (p23 instanceof P2.b) {
            InterfaceC48584a interfaceC48584a = (InterfaceC48584a) ((P2.b) p23).f318720a;
            jVar.getClass();
            int i12 = 10;
            if (interfaceC48584a instanceof InterfaceC48584a.C12670a) {
                InterfaceC48584a.C12670a c12670a = (InterfaceC48584a.C12670a) interfaceC48584a;
                AttributedText departureTo = c12670a.getDepartureTo();
                List<C48587d> listB = c12670a.b();
                ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
                for (C48587d c48587d : listB) {
                    arrayList.add(new AvitoMapPoint(c48587d.getLat(), c48587d.getLng(), null, 4, null));
                }
                geoZonesPresenterState = new GeoZonesPresenterState(departureTo, new GeoZonesPoints.Markers(arrayList));
            } else {
                if (!(interfaceC48584a instanceof InterfaceC48584a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC48584a.b bVar = (InterfaceC48584a.b) interfaceC48584a;
                AttributedText departureTo2 = bVar.getDepartureTo();
                List<List<C48587d>> listB2 = bVar.b();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listB2, 10));
                Iterator<T> it = listB2.iterator();
                while (it.hasNext()) {
                    List<C48587d> list = (List) it.next();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list, i12));
                    for (C48587d c48587d2 : list) {
                        arrayList3.add(new AvitoMapPoint(c48587d2.getLat(), c48587d2.getLng(), null, 4, null));
                    }
                    arrayList2.add(arrayList3);
                    i12 = 10;
                }
                geoZonesPresenterState = new GeoZonesPresenterState(departureTo2, new GeoZonesPoints.Polygons(arrayList2));
            }
            jVar.f173361e = geoZonesPresenterState;
            jVar.c(geoZonesPresenterState);
        } else if (p23 instanceof P2.a) {
            V v13 = jVar.f173359c;
            if (v13 != null) {
                v13.e(null, false);
            }
            V2.f318762a.e(z.k(((P2.a) p23).f318719a), null);
        }
        return G0.f406611a;
    }
}
