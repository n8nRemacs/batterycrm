package com.avito.android.mortgage.landing.list.decoration;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HorizontalItemsDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/decoration/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends RecyclerView.l {
    @Inject
    public c() {
    }

    public static boolean c(View view, RecyclerView recyclerView) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        return layoutManager != null && RecyclerView.U(view) == layoutManager.o0() - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        if (RecyclerView.U(view) == 0 && c(view, recyclerView)) {
            rect.right = y6.b(16);
            rect.left = y6.b(16);
            return;
        }
        if (RecyclerView.U(view) == 0) {
            rect.left = y6.b(16);
            rect.right = y6.b(12);
        } else if (c(view, recyclerView)) {
            rect.right = y6.b(16);
        } else {
            if (RecyclerView.U(view) == 0 || c(view, recyclerView)) {
                return;
            }
            rect.right = y6.b(12);
        }
    }
}
