package com.avito.android.vas_performance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.vas_performance.ui.items.header.VasPerformanceHeaderItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PerformanceVasConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/k;", "Lcom/avito/android/vas_performance/j;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_performance.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36057k implements InterfaceC36056j {
    @Inject
    public C36057k() {
    }

    @Override // com.avito.android.vas_performance.InterfaceC36056j
    @Y61.k
    public final ArrayList a(@Y61.k DL0.b bVar) {
        ArrayList arrayListE0 = C42745f0.e0(new VasPerformanceHeaderItem("vas_title", bVar.getTitle(), bVar.getDescription()));
        AL0.a additionalInfo = bVar.getAdditionalInfo();
        if (additionalInfo != null) {
            arrayListE0.add(new com.avito.android.vas_performance.ui.items.additional_info_block.a(additionalInfo.getText(), additionalInfo.getImage()));
        }
        AL0.b lightning = bVar.getLightning();
        if (lightning != null) {
            arrayListE0.add(new com.avito.android.vas_performance.ui.items.lightning_block.a(lightning.getDescription(), lightning.getImage()));
        }
        int size = arrayListE0.size();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = bVar.f().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                Iterator<DL0.c> it2 = bVar.f().iterator();
                int i13 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (it2.next().getSelected()) {
                        break;
                    }
                    i13++;
                }
                arrayListE0.add(size, new com.avito.android.vas_performance.ui.items.tabs.b(Math.max(i13, 0), arrayList));
                Action infoAction = bVar.getInfoAction();
                com.avito.android.vas_performance.ui.items.info_action.a aVar = infoAction != null ? new com.avito.android.vas_performance.ui.items.info_action.a("vas_info_action", infoAction.getTitle(), infoAction.getDeepLink()) : null;
                if (aVar != null) {
                    arrayListE0.add(aVar);
                }
                return arrayListE0;
            }
            Object next = it.next();
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            DL0.c cVar = (DL0.c) next;
            arrayList.add(new com.avito.android.vas_performance.ui.items.tabs.a(cVar.getTitle(), i12));
            for (DL0.a aVar2 : cVar.c()) {
                arrayListE0.add(new com.avito.android.vas_performance.ui.items.vas.c(aVar2.getId(), aVar2.getTitle(), cVar.getTitle(), aVar2.getPrice(), aVar2.getOldPrice(), aVar2.getIcon(), aVar2.getLightningIcon(), aVar2.getPriceValue(), aVar2.getDeepLink()));
            }
            i12 = i14;
        }
    }
}
