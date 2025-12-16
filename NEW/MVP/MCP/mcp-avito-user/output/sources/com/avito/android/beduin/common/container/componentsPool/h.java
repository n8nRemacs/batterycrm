package com.avito.android.beduin.common.container.componentsPool;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentsPoolHolders.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    public static final void a(@Y61.k i iVar, @Y61.k ArrayList arrayList, @Y61.k p pVar) {
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            ViewGroup viewGroup = iVar.f103005a;
            if (!zHasNext) {
                int childCount = viewGroup.getChildCount() - arrayList.size();
                if (childCount > 0) {
                    viewGroup.removeViews(0, childCount);
                    return;
                }
                return;
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            k kVar = (k) next;
            View f101723b = kVar.f103016b.getF103243b();
            if (viewGroup.indexOfChild(f101723b) != -1) {
                viewGroup.bringChildToFront(f101723b);
            } else {
                viewGroup.addView(f101723b);
            }
            pVar.invoke(Integer.valueOf(i12), kVar);
            i12 = i13;
        }
    }
}
