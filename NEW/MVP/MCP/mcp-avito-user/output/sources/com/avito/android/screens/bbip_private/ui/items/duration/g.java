package com.avito.android.screens.bbip_private.ui.items.duration;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateDurationItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/duration/g;", "Lcom/avito/android/screens/bbip_private/ui/items/duration/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f260849b;

    /* renamed from: c, reason: collision with root package name */
    public int f260850c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public List<Integer> f260851d = C42784z0.f406748b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@hh.g @Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f260849b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (b) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        ArrayList<Integer> integerArrayList;
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            k(iVar, bVar);
            return;
        }
        if (bundle.containsKey("payload_bbip_private_duration_selected")) {
            this.f260850c = bundle.getInt("payload_bbip_private_duration_selected");
        }
        if (bundle.containsKey("payload_bbip_private_duration_shown_durations") && (integerArrayList = bundle.getIntegerArrayList("payload_bbip_private_duration_shown_durations")) != null) {
            this.f260851d = integerArrayList;
        }
        List<Integer> list2 = this.f260851d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(bVar.f260838i);
        iVar.ya(this.f260850c, arrayList2);
    }

    public final void k(@Y61.k i iVar, @Y61.k b bVar) {
        this.f260850c = bVar.f260837h;
        List<Integer> list = bVar.f260835f;
        this.f260851d = list;
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        String str = bVar.f260838i;
        arrayList2.add(str);
        iVar.K0(bVar.f260831b, bVar.f260832c);
        iVar.o8(this.f260850c, new f(str, this, iVar, bVar), arrayList2);
    }
}
