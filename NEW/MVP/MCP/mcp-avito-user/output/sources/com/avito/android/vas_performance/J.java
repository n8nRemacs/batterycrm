package com.avito.android.vas_performance;

import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VisualVasConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/J;", "Lcom/avito/android/vas_performance/I;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J implements I {
    @Inject
    public J() {
    }

    @Override // com.avito.android.vas_performance.I
    @Y61.k
    public final ArrayList a(@Y61.k HL0.b bVar) {
        ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.vas_performance.screens.visual.item.header.a(bVar.getTitle()));
        List<HL0.c> listI = bVar.i();
        ArrayList arrayList = new ArrayList(C42745f0.q(listI, 10));
        for (Iterator it = listI.iterator(); it.hasNext(); it = it) {
            HL0.c cVar = (HL0.c) it.next();
            String id2 = cVar.getId();
            String title = cVar.getTitle();
            AttributedText description = cVar.getDescription();
            AttributedText price = cVar.getPrice();
            AttributedText oldPrice = cVar.getOldPrice();
            Image icon = cVar.getIcon();
            String duration = cVar.getDuration();
            long priceValue = cVar.getPriceValue();
            boolean selected = cVar.getSelected();
            HL0.a extraOption = cVar.getExtraOption();
            UniversalImage icon2 = extraOption != null ? extraOption.getIcon() : null;
            HL0.a extraOption2 = cVar.getExtraOption();
            AttributedText description2 = extraOption2 != null ? extraOption2.getDescription() : null;
            MnzFloatingFooterContact delta = cVar.getDelta();
            Float fValueOf = delta != null ? Float.valueOf(delta.getProgress()) : null;
            MnzFloatingFooterContact delta2 = cVar.getDelta();
            Integer numValueOf = delta2 != null ? Integer.valueOf(delta2.getCount()) : null;
            MnzFloatingFooterContact delta3 = cVar.getDelta();
            AttributedText text = delta3 != null ? delta3.getText() : null;
            MnzFloatingFooterContact delta4 = cVar.getDelta();
            String iconName = delta4 != null ? delta4.getIconName() : null;
            MnzFloatingFooterContact delta5 = cVar.getDelta();
            arrayList.add(new com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a(id2, title, description, price, oldPrice, icon, duration, priceValue, selected, icon2, description2, fValueOf, numValueOf, text, iconName, delta5 != null ? delta5.getProgressColor() : null));
        }
        arrayListE0.addAll(arrayList);
        return arrayListE0;
    }
}
