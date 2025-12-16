package Vt;

import Xt.InterfaceC17045a;
import Y61.k;
import hw.InterfaceC41178c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: CircularGallery.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cyclic-gallery-widget_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {
    @InterfaceC41178c
    @k
    public static final List<InterfaceC17045a> a(@k List<? extends Q<? extends com.avito.android.image_loader.k, Boolean>> list, boolean z12) {
        if (list.isEmpty()) {
            return C42784z0.f406748b;
        }
        if (z12) {
            Q<? extends com.avito.android.image_loader.k, Boolean> q12 = list.get(0);
            A a12 = q12.f406619b;
            boolean z13 = !L.f(q12.f406620c, Boolean.FALSE);
            return list.size() >= 3 ? Collections.singletonList(new Xt.b((com.avito.android.image_loader.k) a12, z13, new Xt.g((com.avito.android.image_loader.k) list.get(1).f406619b, (com.avito.android.image_loader.k) list.get(2).f406619b))) : Collections.singletonList(new Xt.b((com.avito.android.image_loader.k) a12, z13, null, 4, null));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Q<? extends com.avito.android.image_loader.k, Boolean>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Xt.e((com.avito.android.image_loader.k) it.next().f406619b, !L.f(r1.f406620c, Boolean.FALSE)));
        }
        return arrayList;
    }
}
