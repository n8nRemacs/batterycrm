package com.avito.android.category_items_tree.screens.items_screen;

import com.avito.android.category_items_tree.screens.items_screen.a;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryItemType.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-items-tree_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    @Y61.k
    public static final List<a> a(@Y61.k List<? extends a> list) {
        if (!list.isEmpty()) {
            ListIterator<? extends a> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!(listIterator.previous() instanceof a.c)) {
                    return C42745f0.E0(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return C42784z0.f406748b;
    }
}
