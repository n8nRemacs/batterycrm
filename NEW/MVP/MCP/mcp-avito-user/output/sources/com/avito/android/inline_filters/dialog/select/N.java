package com.avito.android.inline_filters.dialog.select;

import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SelectFilterView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class N extends kotlin.jvm.internal.H implements Y41.l<CharSequence, G0> {
    @Override // Y41.l
    public final G0 invoke(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        SelectFilterView selectFilterView = (SelectFilterView) this.receiver;
        int size = selectFilterView.f172040i.size();
        if (charSequence2.length() == 0) {
            selectFilterView.f172040i = selectFilterView.f172039h;
            selectFilterView.x(false);
            selectFilterView.z(null, selectFilterView.f172040i);
        } else {
            List<com.avito.android.inline_filters.dialog.select.adapter.i> list = selectFilterView.f172039h;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                com.avito.android.inline_filters.dialog.select.adapter.i iVar = (com.avito.android.inline_filters.dialog.select.adapter.i) obj;
                if (iVar.f172095f != InlineItemType.f172065l && C43066x.q(iVar.f172093d, charSequence2, true)) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((com.avito.android.inline_filters.dialog.select.adapter.i) next).f172093d)) {
                    arrayList2.add(next);
                }
            }
            selectFilterView.f172040i = arrayList2;
            if (arrayList2.isEmpty()) {
                selectFilterView.x(true);
            }
            if (size == 0 && !selectFilterView.f172040i.isEmpty()) {
                selectFilterView.x(false);
            }
            selectFilterView.z(null, selectFilterView.f172040i);
        }
        return G0.f406611a;
    }
}
