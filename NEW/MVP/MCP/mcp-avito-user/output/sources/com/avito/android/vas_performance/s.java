package com.avito.android.vas_performance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_performance.ui.items.header.VasPerformanceHeaderItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StickersBuyVasConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/s;", "Lcom/avito/android/vas_performance/r;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s implements r {
    @Inject
    public s() {
    }

    public static int d(List list) {
        List list2 = list;
        int i12 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.L.f(((EL0.a) it.next()).getIsSelected(), Boolean.TRUE) && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    @Override // com.avito.android.vas_performance.r
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.mnz_common.data.MnzFloatingFooter a(@Y61.k FL0.d r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.s.a(FL0.d):com.avito.android.mnz_common.data.MnzFloatingFooter");
    }

    @Override // com.avito.android.vas_performance.r
    @Y61.k
    public final ArrayList b(@Y61.k FL0.d dVar) {
        Object obj = null;
        ArrayList arrayListE0 = C42745f0.e0(new VasPerformanceHeaderItem("stickers_vas_title", dVar.getTitle(), null));
        AttributedText description = dVar.getDescription();
        if (description != null) {
            arrayListE0.add(new com.avito.android.vas_performance.ui.items.attributed_text.c(description));
        }
        int iD2 = d(dVar.j());
        Iterator<T> it = dVar.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FL0.c) next).getSelectedCount() == iD2) {
                obj = next;
                break;
            }
        }
        FL0.c cVar = (FL0.c) obj;
        if (cVar != null) {
            arrayListE0.add(new com.avito.android.vas_performance.ui.items.stickers_count.a(cVar.getTitle(), cVar.getDescription(), dVar.getIcon(), cVar.getLightningIcon()));
        }
        ArrayList arrayList = new ArrayList();
        for (EL0.a aVar : dVar.j()) {
            arrayList.add(new com.avito.android.vas_performance.ui.items.stickers.a(aVar.getId(), aVar.getTitle(), aVar.getIsSelected(), aVar.getDescriptionForSeller()));
        }
        arrayListE0.add(new com.avito.android.vas_performance.ui.items.stickers.b(dVar.getMaxSelectedCount(), arrayList));
        return arrayListE0;
    }

    @Override // com.avito.android.vas_performance.r
    @Y61.k
    public final com.avito.android.vas_performance.ui.a c(@Y61.k FL0.d dVar) {
        String str;
        com.avito.android.vas_performance.ui.a aVar;
        String title;
        str = "";
        if (d(dVar.j()) == 0) {
            FL0.a emptyAction = dVar.getEmptyAction();
            if (emptyAction != null && (title = emptyAction.getTitle()) != null) {
                str = title;
            }
            aVar = new com.avito.android.vas_performance.ui.a(str, false);
        } else {
            String selectedActionTitle = dVar.getSelectedActionTitle();
            aVar = new com.avito.android.vas_performance.ui.a(selectedActionTitle != null ? selectedActionTitle : "", true);
        }
        return aVar;
    }
}
