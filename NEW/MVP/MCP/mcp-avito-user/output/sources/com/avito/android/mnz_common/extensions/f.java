package com.avito.android.mnz_common.extensions;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: RecyclerViewExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {
    public static final int a(@k View view, @k RecyclerView recyclerView) {
        int iU2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || (iU2 = RecyclerView.U(view)) == -1 || iU2 == 0) {
            return -1;
        }
        return adapter.getItemViewType(iU2 - 1);
    }
}
