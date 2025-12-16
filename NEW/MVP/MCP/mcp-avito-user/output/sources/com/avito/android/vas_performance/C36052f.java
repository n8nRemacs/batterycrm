package com.avito.android.vas_performance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.vas_performance.ui.items.header.VasPerformanceHeaderItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CompetitiveVasConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/f;", "Lcom/avito/android/vas_performance/e;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_performance.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36052f implements InterfaceC36051e {
    @Inject
    public C36052f() {
    }

    public static boolean d(int i12, int i13, List list) {
        List<CL0.a> listB;
        CL0.a aVar;
        CL0.d dVar = (CL0.d) C42745f0.K(i12, list);
        String title = (dVar == null || (listB = dVar.b()) == null || (aVar = (CL0.a) C42745f0.K(i13, listB)) == null) ? null : aVar.getTitle();
        return !(title == null || C43066x.K(title));
    }

    @Override // com.avito.android.vas_performance.InterfaceC36051e
    public final int a(int i12, int i13, @Y61.k List<CL0.d> list) {
        Integer numValueOf;
        List<CL0.a> listB;
        List<CL0.a> listB2;
        if (i13 >= 0) {
            CL0.d dVar = (CL0.d) C42745f0.K(i12, list);
            if (i13 < ((dVar == null || (listB2 = dVar.b()) == null) ? 0 : listB2.size())) {
                return i13;
            }
        }
        CL0.d dVar2 = (CL0.d) C42745f0.K(i12, list);
        if (dVar2 == null || (listB = dVar2.b()) == null) {
            numValueOf = null;
        } else {
            Iterator<CL0.a> it = listB.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                Boolean selected = it.next().getSelected();
                if (selected != null ? selected.booleanValue() : false) {
                    break;
                }
                i14++;
            }
            numValueOf = Integer.valueOf(i14);
        }
        Integer num = (numValueOf != null ? numValueOf.intValue() : 0) >= 0 ? numValueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.vas_performance.InterfaceC36051e
    @Y61.k
    public final ArrayList b(@Y61.k CL0.c cVar, int i12, int i13) {
        C42784z0 c42784z0;
        List<CL0.a> listB;
        int i14 = 0;
        ArrayList arrayListE0 = C42745f0.e0(new VasPerformanceHeaderItem("competitive_vas_title", cVar.getTitle(), null));
        CL0.d dVar = (CL0.d) C42745f0.K(i12, cVar.d());
        CL0.a aVar = (dVar == null || (listB = dVar.b()) == null) ? null : (CL0.a) C42745f0.K(i13, listB);
        boolean zD2 = d(i12, i13 - 1, cVar.d());
        boolean zD3 = d(i12, i13 + 1, cVar.d());
        if (aVar != null) {
            CL0.d dVar2 = (CL0.d) C42745f0.K(i12, cVar.d());
            List<CL0.b> listA = dVar2 != null ? dVar2.a() : null;
            String id2 = aVar.getId();
            String title = aVar.getTitle();
            String subtitle = aVar.getSubtitle();
            String str = subtitle == null ? "" : subtitle;
            String oldPrice = aVar.getOldPrice();
            String description = aVar.getDescription();
            String str2 = description == null ? "" : description;
            Image icon = aVar.getIcon();
            Image lightningIcon = aVar.getLightningIcon();
            if (listA != null) {
                List<CL0.b> list = listA;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                int i15 = 0;
                for (Object obj : list) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    CL0.b bVar = (CL0.b) obj;
                    UniversalImage selected = i15 == i13 ? bVar.getSelected() : bVar.getDisabled();
                    if (selected == null) {
                        selected = new UniversalImage(null, null);
                    }
                    arrayList.add(selected);
                    i15 = i16;
                }
                c42784z0 = arrayList;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            arrayListE0.add(new com.avito.android.vas_performance.ui.items.competitive_vas.d(id2, title, str, oldPrice, str2, icon, lightningIcon, c42784z0, zD2, zD3));
        }
        if (cVar.d().size() > 1) {
            List<CL0.d> listD = cVar.d();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listD, 10));
            for (Object obj2 : listD) {
                int i17 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList2.add(new com.avito.android.vas_performance.ui.items.competitive_vas_tabs.a(((CL0.d) obj2).getTitle(), i14));
                i14 = i17;
            }
            arrayListE0.add(1, new com.avito.android.vas_performance.ui.items.competitive_vas_tabs.b(i12, arrayList2));
        }
        Action infoAction = cVar.getInfoAction();
        if (infoAction != null) {
            arrayListE0.add(new com.avito.android.vas_performance.ui.items.competitive_vas_info_action.a(infoAction.getTitle(), infoAction.getDeepLink()));
        }
        return arrayListE0;
    }

    @Override // com.avito.android.vas_performance.InterfaceC36051e
    public final int c(int i12, @Y61.k List list) {
        if (i12 >= 0) {
            return i12;
        }
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (((CL0.d) it.next()).getSelected()) {
                break;
            }
            i13++;
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
