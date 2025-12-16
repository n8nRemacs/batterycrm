package nX;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.loyalty.ui.quality_service.items.effects.i;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: EffectsItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnX/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44347b extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof i) {
            rect.top = y6.b(32);
        }
    }
}
