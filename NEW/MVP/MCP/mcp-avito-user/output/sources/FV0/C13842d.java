package Fv0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.services_transportation_widget.item.fields.price.f;
import com.avito.android.services_transportation_widget.item.fields.select.g;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ServicesTransportationWidgetFieldsDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFv0/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fv0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13842d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f6022b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f6023c = y6.b(8);

    /* renamed from: d, reason: collision with root package name */
    public final int f6024d = y6.b(6);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int iU2 = RecyclerView.U(view);
        if (iU2 == -1) {
            rect.set(0, 0, 0, 0);
            return;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
        int i12 = bVar.f53669f;
        int i13 = bVar.f53670g;
        int i14 = this.f6022b;
        int i15 = i14 - i13;
        if (cW2 instanceof g) {
            int i16 = this.f6023c / i14;
            rect.left = i15 * i12 * i16;
            rect.right = (1 - i12) * i15 * i16;
            if (iU2 > 0) {
                rect.top = this.f6024d;
                return;
            }
            return;
        }
        if (cW2 instanceof f) {
            if (iU2 > 0) {
                rect.top = y6.b(4);
            }
        } else if (!(cW2 instanceof com.avito.android.services_transportation_widget.item.fields.disclaimer.f)) {
            rect.set(0, 0, 0, 0);
        } else if (iU2 > 0) {
            rect.top = y6.b(16);
        }
    }
}
