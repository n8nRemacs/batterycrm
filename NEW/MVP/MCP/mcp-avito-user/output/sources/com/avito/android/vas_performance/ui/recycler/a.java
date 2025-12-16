package com.avito.android.vas_performance.ui.recycler;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: AppliedServicesItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/recycler/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f321893b;

    /* renamed from: c, reason: collision with root package name */
    public final int f321894c;

    /* renamed from: d, reason: collision with root package name */
    public final int f321895d;

    /* renamed from: e, reason: collision with root package name */
    public final int f321896e;

    /* renamed from: f, reason: collision with root package name */
    public final int f321897f;

    public a(@k Resources resources) {
        this.f321893b = resources.getDimensionPixelSize(R.dimen.title_item_top_offset);
        this.f321894c = resources.getDimensionPixelSize(R.dimen.info_item_top_offset);
        this.f321895d = resources.getDimensionPixelSize(R.dimen.info_action_item_top_offset);
        this.f321896e = resources.getDimensionPixelSize(R.dimen.margin_default);
        this.f321897f = resources.getDimensionPixelSize(R.dimen.margin_tiny);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r3, @Y61.k android.view.View r4, @Y61.k androidx.recyclerview.widget.RecyclerView r5, @Y61.k androidx.recyclerview.widget.RecyclerView.z r6) {
        /*
            r2 = this;
            super.getItemOffsets(r3, r4, r5, r6)
            androidx.recyclerview.widget.RecyclerView$C r4 = r5.W(r4)
            if (r4 != 0) goto La
            return
        La:
            int r5 = r4.getBindingAdapterPosition()
            r6 = 0
            if (r5 >= 0) goto L13
        L11:
            r5 = r6
            goto L2e
        L13:
            boolean r5 = r4 instanceof com.avito.android.vas_performance.ui.items.title.c
            if (r5 == 0) goto L1a
            int r5 = r2.f321893b
            goto L2e
        L1a:
            boolean r5 = r4 instanceof com.avito.android.vas_performance.ui.items.info.f
            if (r5 == 0) goto L21
            int r5 = r2.f321894c
            goto L2e
        L21:
            boolean r5 = r4 instanceof com.avito.android.vas_performance.ui.items.info_action.h
            if (r5 == 0) goto L28
            int r5 = r2.f321895d
            goto L2e
        L28:
            boolean r5 = r4 instanceof com.avito.android.vas_performance.ui.items.banner.f
            if (r5 == 0) goto L11
            int r5 = r2.f321897f
        L2e:
            boolean r0 = r4 instanceof com.avito.android.vas_performance.ui.items.applied_services.g
            int r1 = r2.f321896e
            if (r0 == 0) goto L36
            r0 = r6
            goto L37
        L36:
            r0 = r1
        L37:
            boolean r4 = r4 instanceof com.avito.android.vas_performance.ui.items.title.c
            if (r4 == 0) goto L3c
            r6 = r1
        L3c:
            r3.set(r0, r5, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.ui.recycler.a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
