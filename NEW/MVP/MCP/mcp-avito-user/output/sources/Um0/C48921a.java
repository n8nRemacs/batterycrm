package uM0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.android.vas_union.ui.items.title.g;
import com.avito.android.vas_union.ui.items.vas_performance_chips.h;
import com.avito.android.vas_union.ui.items.vas_performance_select.j;
import kotlin.Metadata;

/* compiled from: VasUnionV2ItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuM0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48921a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f439911b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f439912c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f439913d = y6.b(24);

    /* renamed from: e, reason: collision with root package name */
    public final int f439914e = y6.b(24);

    /* renamed from: f, reason: collision with root package name */
    public final int f439915f = y6.b(16);

    /* renamed from: g, reason: collision with root package name */
    public final int f439916g = y6.b(24);

    /* renamed from: h, reason: collision with root package name */
    public final int f439917h = y6.b(12);

    /* renamed from: i, reason: collision with root package name */
    public final int f439918i = y6.b(10);

    /* renamed from: j, reason: collision with root package name */
    public final int f439919j = y6.b(20);

    /* renamed from: k, reason: collision with root package name */
    public final int f439920k = y6.b(10);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        RecyclerView.C cW2 = recyclerView.W(view);
        int i13 = 0;
        if (cW2 instanceof g) {
            i12 = this.f439912c;
        } else if (cW2 instanceof h) {
            i12 = this.f439915f;
        } else {
            i12 = ((cW2 instanceof com.avito.android.vas_union.ui.items.vas_performance_click.h) || (cW2 instanceof j)) ? this.f439918i : cW2 instanceof com.avito.android.vas_union.ui.items.vas_bundle.j ? this.f439920k : 0;
        }
        rect.left = i12;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof g) {
            i13 = this.f439911b;
        } else if (cW3 instanceof com.avito.android.vas_union.ui.items.tabs.h) {
            i13 = this.f439913d;
        } else if (cW3 instanceof h) {
            i13 = this.f439914e;
        } else if (cW3 instanceof com.avito.android.vas_union.ui.items.vas_performance_click.h) {
            i13 = this.f439916g;
        } else if (cW3 instanceof j) {
            i13 = this.f439917h;
        } else if (cW3 instanceof com.avito.android.vas_union.ui.items.vas_bundle.j) {
            i13 = this.f439919j;
        }
        rect.top = i13;
        rect.right = i12;
    }
}
