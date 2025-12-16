package RZ;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.mortgage.applications_list.items.application.h;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationsListMarginItemDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRZ/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f14518b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f14519c = y6.b(12);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2.getBindingAdapterPosition() > 0;
        if (cW2 instanceof h) {
            Integer numValueOf = Integer.valueOf(f14519c);
            if (!z12) {
                numValueOf = null;
            }
            rect.top = numValueOf != null ? numValueOf.intValue() : 0;
        }
    }
}
