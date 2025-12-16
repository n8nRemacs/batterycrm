package N4;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;

/* compiled from: BrandingAdvantagesItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN4/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f11184b = 3;

    /* renamed from: c, reason: collision with root package name */
    public final int f11185c;

    public a(@U int i12) {
        this.f11185c = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = this.f11184b;
        if (i12 == 1) {
            return;
        }
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i13 = iU2 % i12;
        int i14 = iU2 / i12;
        int i15 = this.f11185c;
        if (i13 != 0) {
            rect.left = i15;
        }
        if (i14 != 0) {
            rect.top = i15;
        }
    }
}
