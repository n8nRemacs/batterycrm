package com.avito.android.serp.adapter.rich_snippets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.constructor.rich.C;
import com.avito.android.serp.adapter.rich_snippets.realty.InterfaceC34777w;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34800x;
import com.avito.android.serp.adapter.rich_snippets.service.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RichSnippetItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseCompatLoadingForDrawables"})
/* loaded from: classes3.dex */
public final class i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f270777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270778c;

    /* renamed from: d, reason: collision with root package name */
    public final int f270779d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f270780e;

    public /* synthetic */ i(Context context, boolean z12, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? false : z12);
    }

    public static boolean c(View view, RecyclerView recyclerView) {
        if (view == null) {
            return false;
        }
        Object objW = recyclerView.W(view);
        return (objW instanceof InterfaceC34800x) || (objW instanceof v) || ((objW instanceof com.avito.android.advertising.ui.c) && ((com.avito.android.advertising.ui.c) objW).DH()) || (objW instanceof InterfaceC34777w) || (objW instanceof C);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r6, @Y61.k android.view.View r7, @Y61.k androidx.recyclerview.widget.RecyclerView r8, @Y61.k androidx.recyclerview.widget.RecyclerView.z r9) {
        /*
            r5 = this;
            super.getItemOffsets(r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView$m r9 = r8.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r9 = (androidx.recyclerview.widget.GridLayoutManager) r9
            int r0 = androidx.recyclerview.widget.RecyclerView.U(r7)
            boolean r1 = c(r7, r8)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3f
            int r1 = r5.f270777b
            int r1 = -r1
            r6.left = r1
            r6.right = r1
            int r1 = r8.indexOfChild(r7)
            int r1 = r1 - r2
            if (r1 < 0) goto L3c
            android.view.View r1 = r9.d0(r1)
            boolean r4 = c(r1, r8)
            if (r4 != 0) goto L3c
            if (r1 != 0) goto L31
            r1 = r3
            goto L37
        L31:
            androidx.recyclerview.widget.RecyclerView$C r1 = r8.W(r1)
            boolean r1 = r1 instanceof com.avito.android.serp.adapter.actions_horizontal_block.r
        L37:
            if (r1 != 0) goto L3c
            int r1 = r5.f270778c
            goto L3d
        L3c:
            r1 = r3
        L3d:
            r6.top = r1
        L3f:
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r9.f53667M
            int r9 = r9.f53662H
            int r9 = r1.d(r0, r9)
            if (r9 != 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            boolean r9 = r5.f270780e
            if (r9 == 0) goto L60
            if (r2 == 0) goto L60
            androidx.recyclerview.widget.RecyclerView$C r7 = r8.W(r7)
            boolean r7 = r7 instanceof com.avito.android.serp.adapter.seller_element.seller_pin.g
            if (r7 != 0) goto L60
            int r7 = r6.top
            int r8 = r5.f270779d
            int r7 = r7 + r8
            r6.top = r7
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.rich_snippets.i.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public i(@Y61.k Context context, boolean z12) throws Resources.NotFoundException {
        this.f270777b = context.getResources().getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        context.getResources().getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f270778c = context.getResources().getDimensionPixelSize(R.dimen.serp_vertical_padding);
        this.f270779d = context.getResources().getDimensionPixelSize(R.dimen.rich_snippet_map_drag_icon_height);
        this.f270780e = z12;
    }
}
