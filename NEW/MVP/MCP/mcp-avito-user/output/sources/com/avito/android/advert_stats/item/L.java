package com.avito.android.advert_stats.item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StatisticsToItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/L;", "Lcom/avito/android/advert_stats/item/K;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L implements K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D f86694a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f86695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final z f86696c;

    @Inject
    public L(@Y61.k D d12, @Y61.k H h12, @Y61.k z zVar) {
        this.f86694a = d12;
        this.f86695b = h12;
        this.f86696c = zVar;
    }

    @Override // com.avito.android.advert_stats.item.K
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k w wVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            if (aVar instanceof com.avito.android.advert_stats.item.title.a) {
                arrayList.add(aVar);
            } else if (aVar instanceof com.avito.android.advert_stats.item.period.a) {
                arrayList.add(new com.avito.android.advert_stats.item.period.a("period" + wVar.getF83558b(), wVar.getF86702d(), false, 4, null));
            } else if (aVar instanceof C28336o) {
                arrayList.add(aVar);
            }
        }
        if (wVar instanceof C28322a) {
            List<VasInfo> list2 = ((C28322a) wVar).f86726k;
            C28322a c28322a = (C28322a) wVar;
            arrayList.addAll(c(wVar, !list2.isEmpty(), c28322a.f86727l));
            List<VasInfo> list3 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            for (VasInfo vasInfo : list3) {
                arrayList2.add(new com.avito.android.advert_stats.item.details.a(c28322a.f86717b + vasInfo.f86715b, vasInfo.f86715b, null, vasInfo.f86716c, false, false, 52, null));
            }
            arrayList.addAll(arrayList2);
        } else if (wVar instanceof O) {
            arrayList.addAll(c(wVar, ((O) wVar).f86707i, ((O) wVar).f86706h));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x016c, code lost:
    
        r29 = r2;
        r12 = java.lang.String.valueOf(r6);
        r14 = r14.a(((kb.C42660b) kotlin.collections.C42745f0.E(r7.a())).getDate(), ((kb.C42660b) kotlin.collections.C42745f0.Q(r7.a())).getDate());
        r2 = r7.getStats();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0198, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019a, code lost:
    
        r15 = java.lang.Integer.valueOf(r2.getViews());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a4, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a5, code lost:
    
        r2 = r7.getStats();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a9, code lost:
    
        if (r2 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ab, code lost:
    
        r16 = java.lang.Integer.valueOf(r2.getContacts());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b6, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b8, code lost:
    
        r2 = r7.getStats();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bc, code lost:
    
        if (r2 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01be, code lost:
    
        r17 = java.lang.Integer.valueOf(r2.getFavorites());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c9, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cb, code lost:
    
        r18 = r31.getDescription();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d3, code lost:
    
        if (r31.d() == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d5, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d8, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01da, code lost:
    
        r3.add(new com.avito.android.advert_stats.item.O(r12, r13, r14, r15, r16, r17, r18, r19));
        r6 = r8;
        r2 = r29;
        r4 = 10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.avito.android.advert_stats.item.L] */
    @Override // com.avito.android.advert_stats.item.K
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(@Y61.k kb.C42659a r31) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_stats.item.L.b(kb.a):java.util.ArrayList");
    }

    public final ArrayList c(w wVar, boolean z12, String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new com.avito.android.advert_stats.item.details.a("status" + wVar.getF83559c(), str, null, null, true, false, 44, null));
        }
        Integer f86703e = wVar.getF86703e();
        H h12 = this.f86695b;
        D d12 = this.f86694a;
        if (f86703e != null) {
            arrayList.add(new com.avito.android.advert_stats.item.details.a("views" + wVar.getF83559c(), d12.d(f86703e.intValue()), Integer.valueOf(h12.c()), null, false, false, 56, null));
        }
        Integer f86704f = wVar.getF86704f();
        if (f86704f != null) {
            arrayList.add(new com.avito.android.advert_stats.item.details.a("contacts" + wVar.getF83559c(), d12.e(f86704f.intValue()), Integer.valueOf(h12.a()), null, false, false, 56, null));
        }
        Integer f86705g = wVar.getF86705g();
        if (f86705g != null) {
            arrayList.add(new com.avito.android.advert_stats.item.details.a("favorites" + wVar.getF83559c(), d12.a(f86705g.intValue()), Integer.valueOf(h12.b()), null, false, false, 56, null));
        }
        if (z12) {
            String f83559c = wVar.getF83559c();
            arrayList.addAll(C42745f0.U(new com.avito.android.advert_stats.item.details.a(androidx.camera.camera2.internal.G.f("predict_views", f83559c), d12.getF86690d(), Integer.valueOf(h12.d()), null, false, false, 56, null), new com.avito.android.advert_stats.item.details.a(androidx.camera.camera2.internal.G.f("legend_views", f83559c), d12.getF86689c(), Integer.valueOf(h12.e()), null, false, false, 56, null)));
        }
        return arrayList;
    }
}
