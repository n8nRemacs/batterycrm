package jX;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.loyalty.ui.criteria.items.header.f;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: HeaderItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjX/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jX.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42317c extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof f) {
            rect.left = y6.b(16);
            rect.right = y6.b(16);
        }
    }
}
