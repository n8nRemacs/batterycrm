package com.avito.android.vas_performance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_performance.ui.items.header.VasPerformanceHeaderItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StickersEditVasConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/w;", "Lcom/avito/android/vas_performance/v;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements v {
    @Inject
    public w() {
    }

    @Override // com.avito.android.vas_performance.v
    @Y61.k
    public final ArrayList a(@Y61.k GL0.c cVar, int i12) {
        Object next;
        ArrayList arrayListE0 = C42745f0.e0(new VasPerformanceHeaderItem("stickers_vas_title", cVar.getTitle(), null));
        AttributedText description = cVar.getDescription();
        if (description != null) {
            arrayListE0.add(new com.avito.android.vas_performance.ui.items.attributed_text.c(description));
        }
        String title = cVar.getService().getTitle();
        Iterator<T> it = cVar.getService().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((GL0.a) next).getChangesCount() == i12) {
                break;
            }
        }
        GL0.a aVar = (GL0.a) next;
        arrayListE0.add(new com.avito.android.vas_performance.ui.items.stickers_changes.a(cVar.getIcon(), title, aVar != null ? aVar.getMessage() : null));
        ArrayList arrayList = new ArrayList();
        for (EL0.a aVar2 : cVar.j()) {
            arrayList.add(new com.avito.android.vas_performance.ui.items.stickers.a(aVar2.getId(), aVar2.getTitle(), aVar2.getIsSelected(), null, 8, null));
        }
        arrayListE0.add(new com.avito.android.vas_performance.ui.items.stickers.b(cVar.getMaxSelectedCount(), arrayList));
        return arrayListE0;
    }

    @Override // com.avito.android.vas_performance.v
    @Y61.k
    public final com.avito.android.vas_performance.ui.a b(@Y61.k GL0.c cVar, int i12) {
        com.avito.android.vas_performance.ui.a aVar;
        if (i12 == 0) {
            String emptyActionTitle = cVar.getEmptyActionTitle();
            aVar = new com.avito.android.vas_performance.ui.a(emptyActionTitle != null ? emptyActionTitle : "", false);
        } else {
            String selectedActionTitle = cVar.getSelectedActionTitle();
            aVar = new com.avito.android.vas_performance.ui.a(selectedActionTitle != null ? selectedActionTitle : "", true);
        }
        return aVar;
    }
}
