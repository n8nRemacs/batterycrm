package com.avito.android.util;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: RecyclerViews.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.x4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35976x4 {
    public static final void a(@Y61.k RecyclerView recyclerView) {
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        if (itemDecorationCount <= 0) {
            return;
        }
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                return;
            } else {
                recyclerView.s0(itemDecorationCount);
            }
        }
    }

    public static final void b(@Y61.k RecyclerView recyclerView) {
        if (recyclerView.d0()) {
            return;
        }
        recyclerView.c0();
    }

    public static void c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            if (recyclerView.d0()) {
                recyclerView.post(new RunnableC35962v4(adapter, i12, null));
            } else {
                adapter.notifyItemChanged(i12, null);
            }
        }
    }
}
