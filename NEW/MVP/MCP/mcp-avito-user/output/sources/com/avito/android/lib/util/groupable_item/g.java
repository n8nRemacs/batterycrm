package com.avito.android.lib.util.groupable_item;

import Y61.k;
import com.avito.android.lib.util.groupable_item.EdgeMode;
import com.avito.android.lib.util.groupable_item.immutable.Edges;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GroupingListProcessor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/groupable_item/g;", "Lcom/avito/android/lib/util/groupable_item/f;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final QV.d f181358a = new QV.d();

    @Inject
    public g() {
    }

    @Override // com.avito.android.lib.util.groupable_item.f
    @k
    public final ArrayList a(@k List list, @k QV.e eVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (!it.hasNext()) {
                ArrayList arrayListA = this.f181358a.a(arrayList, eVar);
                Iterator it2 = list2.iterator();
                Iterator it3 = arrayListA.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(C42745f0.q(list2, 10), C42745f0.q(arrayListA, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    QV.b bVar = (QV.b) it3.next();
                    if (next instanceof a) {
                        a aVar = (a) next;
                        GroupingOutput f224507k = aVar.getF224507k();
                        EdgeMode.a aVar2 = EdgeMode.f181350b;
                        Edges edges = bVar.f13744b;
                        boolean z13 = edges == Edges.f181360b || edges == Edges.f181362d;
                        aVar2.getClass();
                        f224507k.f181355b = z13 ? EdgeMode.f181351c : EdgeMode.f181352d;
                        GroupingOutput f224507k2 = aVar.getF224507k();
                        Edges edges2 = bVar.f13744b;
                        f224507k2.f181356c = (edges2 == Edges.f181361c || edges2 == Edges.f181362d) ? EdgeMode.f181351c : EdgeMode.f181352d;
                    }
                    arrayList2.add(next);
                }
                return arrayList2;
            }
            Object next2 = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (!(next2 instanceof a) || ((a) next2).getF224506j()) {
                z12 = false;
            }
            arrayList.add(new QV.a(i12, z12));
            i12 = i13;
        }
    }

    @Override // com.avito.android.lib.util.groupable_item.f
    @k
    public final ArrayList b(@k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (Object obj : arrayList) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                GroupingOutput f224507k = aVar.getF224507k();
                EdgeMode edgeMode = EdgeMode.f181351c;
                f224507k.f181355b = edgeMode;
                aVar.getF224507k().f181356c = edgeMode;
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }
}
