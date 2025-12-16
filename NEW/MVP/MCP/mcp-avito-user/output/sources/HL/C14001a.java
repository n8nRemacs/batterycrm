package Hl;

import Y61.k;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.rich_snippets.regular.C34780c;
import com.avito.android.serp.adapter.rich_snippets.regular.D;
import com.avito.android.serp.adapter.rich_snippets.regular.F;
import com.avito.android.serp.adapter.rich_snippets.regular.H;
import com.avito.android.serp.adapter.rich_snippets.regular.J;
import com.avito.android.serp.adapter.rich_snippets.regular.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecentQuerySearchItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHl/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14001a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7664c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7665d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7666e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7667f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7668g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7669h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7670i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7671j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7672k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7673l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7674m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7675n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7676o;

    public /* synthetic */ C14001a(Resources resources, boolean z12, com.avito.konveyor.a aVar, int i12, C42822w c42822w) {
        this(resources, (i12 & 2) != 0 ? false : z12, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r5, @Y61.k android.view.View r6, @Y61.k androidx.recyclerview.widget.RecyclerView r7, @Y61.k androidx.recyclerview.widget.RecyclerView.z r8) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$C r8 = r7.W(r6)
            int r6 = androidx.recyclerview.widget.RecyclerView.V(r6)
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r7.getAdapter()
            int r0 = r6 + 1
            r1 = 0
            if (r7 == 0) goto L38
            if (r0 <= 0) goto L38
            int r2 = r7.getItemCount()
            r3 = 1
            int r2 = r2 - r3
            if (r0 > r2) goto L38
            int r7 = r7.getItemViewType(r0)
            int r0 = r4.f7671j
            if (r7 == r0) goto L39
            int r0 = r4.f7673l
            if (r7 == r0) goto L39
            int r0 = r4.f7672k
            if (r7 == r0) goto L39
            int r0 = r4.f7674m
            if (r7 == r0) goto L39
            int r0 = r4.f7675n
            if (r7 == r0) goto L39
            int r0 = r4.f7676o
            if (r7 != r0) goto L38
            goto L39
        L38:
            r3 = r1
        L39:
            boolean r7 = r8 instanceof com.avito.android.recent_query_search.k
            if (r7 == 0) goto L6b
            com.avito.android.recent_query_search.k r8 = (com.avito.android.recent_query_search.k) r8
            boolean r7 = r8.t20()
            if (r7 == 0) goto L48
            int r8 = r4.f7669h
            goto L4a
        L48:
            int r8 = r4.f7670i
        L4a:
            if (r7 == 0) goto L4f
            int r7 = r4.f7667f
            goto L51
        L4f:
            int r7 = r4.f7668g
        L51:
            if (r3 == 0) goto L54
            goto L56
        L54:
            int r1 = r4.f7666e
        L56:
            int r0 = r4.f7664c
            int r0 = -r0
            r5.left = r0
            r5.right = r0
            r5.bottom = r1
            if (r6 != 0) goto L67
            boolean r6 = r4.f7663b
            if (r6 == 0) goto L69
            r8 = r7
            goto L69
        L67:
            int r8 = r4.f7665d
        L69:
            r5.top = r8
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hl.C14001a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public C14001a(@k Resources resources, boolean z12, @k com.avito.konveyor.a aVar) {
        this.f7663b = z12;
        this.f7664c = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f7665d = resources.getDimensionPixelSize(R.dimen.serp_recent_query_search_vertical_offset);
        this.f7666e = resources.getDimensionPixelSize(R.dimen.serp_recent_query_search_bottom_offset);
        this.f7667f = resources.getDimensionPixelSize(R.dimen.serp_recent_query_search_map_with_title_top_offset);
        this.f7668g = resources.getDimensionPixelSize(R.dimen.serp_recent_query_search_map_without_title_top_offset);
        this.f7669h = resources.getDimensionPixelSize(R.dimen.serp_recent_query_search_first_pos_with_title_top_offset);
        this.f7670i = resources.getDimensionPixelSize(R.dimen.serp_recent_query_search_first_pos_without_title_top_offset);
        this.f7671j = aVar.Y(C34780c.class);
        this.f7672k = aVar.Y(c0.class);
        this.f7673l = aVar.Y(J.class);
        this.f7674m = aVar.Y(H.class);
        this.f7675n = aVar.Y(F.class);
        this.f7676o = aVar.Y(D.class);
    }
}
