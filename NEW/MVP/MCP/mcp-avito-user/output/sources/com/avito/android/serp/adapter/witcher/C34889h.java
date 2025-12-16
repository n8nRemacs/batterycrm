package com.avito.android.serp.adapter.witcher;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.L0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WitcherElementsDecorator.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34889h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f273862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273863c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273864d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f273865e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f273866f;

    public C34889h(int i12, @Y61.k Resources resources, @Y61.k L0 l02) {
        this.f273862b = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f273863c = l02.c();
        this.f273864d = i12;
        this.f273865e = resources.getBoolean(R.bool.is_tablet);
        this.f273866f = resources.getConfiguration().orientation == 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        ViewParent parent;
        super.getItemOffsets(rect, view, recyclerView, zVar);
        boolean z12 = this.f273866f;
        boolean z13 = this.f273865e;
        float f12 = (z13 || z12) ? 0.54f : 0.85f;
        ViewParent parent2 = view.getParent();
        RecyclerView recyclerView2 = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.text_content);
        int i12 = this.f273862b;
        int paddingStart = (this.f273863c - ((recyclerView2 != null ? recyclerView2.getPaddingStart() : i12) * 2)) / ((int) (this.f273864d + 0.21f));
        view.getLayoutParams().width = paddingStart;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = paddingStart;
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = (int) (paddingStart * f12);
        }
        Object parent3 = (recyclerView2 == null || (parent = recyclerView2.getParent()) == null) ? null : parent.getParent();
        View view2 = parent3 instanceof View ? (View) parent3 : null;
        if (kotlin.jvm.internal.L.f(view2 != null ? view2.getTag() : null, "indents_from_backend_tag") || z13 || z12) {
            return;
        }
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        if (recyclerView.getAdapter() == null) {
            return;
        }
        if (iU2 == 0) {
            D6.c(view, Integer.valueOf(i12), null, 0, null, 10);
        } else if (iU2 == r3.getItemCount() - 1) {
            D6.c(view, 0, null, Integer.valueOf(i12), null, 10);
        } else {
            D6.c(view, 0, null, 0, null, 10);
        }
    }
}
