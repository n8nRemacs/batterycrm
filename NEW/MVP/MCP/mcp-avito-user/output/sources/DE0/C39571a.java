package dE0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_select.ui.items.header.h;
import com.avito.android.tariff_select.ui.items.tariff.i;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TariffSelectItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdE0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dE0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39571a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f393748b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f393749c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f393750d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f393751e = y6.b(10);

    /* renamed from: f, reason: collision with root package name */
    public final int f393752f = y6.b(24);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int i12 = cW2 instanceof h ? this.f393750d : cW2 instanceof i ? this.f393751e : 0;
        rect.left = i12;
        RecyclerView.C cW3 = recyclerView.W(view);
        rect.top = cW3 instanceof h ? this.f393748b : cW3 instanceof i ? this.f393749c : 0;
        rect.right = i12;
        rect.bottom = RecyclerView.U(view) == zVar.b() + (-1) ? this.f393752f : 0;
    }
}
