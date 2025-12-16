package com.avito.android.lib.util;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ReuseChildrenHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/util/t;", "D", "Landroid/view/View;", "V", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class t<D, V extends View> {
    public abstract void a(@Y61.k View view, Object obj);

    @Y61.k
    public abstract V b();

    public final void c(@Y61.k ViewGroup viewGroup, @Y61.k List<? extends D> list) {
        int childCount;
        int size;
        if (viewGroup.getChildCount() > list.size() && (size = list.size()) <= viewGroup.getChildCount() - 1) {
            while (true) {
                viewGroup.removeViewAt(childCount);
                if (childCount == size) {
                    break;
                } else {
                    childCount--;
                }
            }
        }
        if (viewGroup.getChildCount() < list.size()) {
            int size2 = list.size();
            for (int childCount2 = viewGroup.getChildCount(); childCount2 < size2; childCount2++) {
                viewGroup.addView(b());
            }
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a(viewGroup.getChildAt(i12), obj);
            i12 = i13;
        }
    }
}
