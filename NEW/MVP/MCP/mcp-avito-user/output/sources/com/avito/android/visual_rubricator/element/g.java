package com.avito.android.visual_rubricator.element;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: VisualRubricatorWidgetElementDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/element/g;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f327395b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GridLayoutManager.c f327396c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f327397d;

    /* renamed from: e, reason: collision with root package name */
    public final int f327398e;

    /* renamed from: f, reason: collision with root package name */
    public final int f327399f;

    /* renamed from: g, reason: collision with root package name */
    public final int f327400g;

    public g(@Y61.k Resources resources, int i12, @Y61.k GridLayoutManager.c cVar, boolean z12) {
        this.f327395b = i12;
        this.f327396c = cVar;
        this.f327397d = z12;
        this.f327398e = resources.getDimensionPixelSize(R.dimen.bx_content_widget_visual_rubricator_item_inner_offset);
        this.f327399f = resources.getDimensionPixelSize(R.dimen.bx_content_widget_visual_rubricator_item_bottom_offset);
        this.f327400g = resources.getDimensionPixelSize(R.dimen.bx_content_widget_visual_rubricator_item_bottom_offset_test);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r7, @Y61.k android.view.View r8, @Y61.k androidx.recyclerview.widget.RecyclerView r9, @Y61.k androidx.recyclerview.widget.RecyclerView.z r10) {
        /*
            r6 = this;
            super.getItemOffsets(r7, r8, r9, r10)
            r9.getClass()
            int r10 = androidx.recyclerview.widget.RecyclerView.U(r8)
            r0 = -1
            if (r10 == r0) goto L5c
            androidx.recyclerview.widget.RecyclerView$C r8 = r9.W(r8)
            boolean r8 = r8 instanceof com.avito.android.visual_rubricator.element.k
            if (r8 != 0) goto L16
            goto L5c
        L16:
            androidx.recyclerview.widget.GridLayoutManager$c r8 = r6.f327396c
            int r0 = r6.f327395b
            int r1 = r8.e(r10, r0)
            int r2 = r8.f(r10)
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L28
            r5 = r4
            goto L29
        L28:
            r5 = r3
        L29:
            int r1 = r1 + r2
            if (r1 != r0) goto L2e
            r1 = r4
            goto L2f
        L2e:
            r1 = r3
        L2f:
            int r2 = r6.f327398e
            if (r5 != 0) goto L35
            r7.left = r2
        L35:
            if (r1 != 0) goto L39
            r7.right = r2
        L39:
            boolean r1 = r6.f327397d
            if (r1 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.getAdapter()
            if (r9 == 0) goto L47
            int r3 = r9.getItemCount()
        L47:
            int r3 = r3 - r4
            if (r3 >= 0) goto L4b
            goto L58
        L4b:
            int r9 = r8.d(r10, r0)
            int r8 = r8.d(r3, r0)
            if (r9 != r8) goto L58
            int r8 = r6.f327400g
            goto L5a
        L58:
            int r8 = r6.f327399f
        L5a:
            r7.bottom = r8
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.visual_rubricator.element.g.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
