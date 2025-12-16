package com.avito.android.beduin.common.container.horizontal_slider;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinHorizontalSliderSpacingItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/m;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public int f103122b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f103123c;

    public m() {
        this(0, false, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r3, @Y61.k android.view.View r4, @Y61.k androidx.recyclerview.widget.RecyclerView r5, @Y61.k androidx.recyclerview.widget.RecyclerView.z r6) {
        /*
            r2 = this;
            r5.getClass()
            int r0 = androidx.recyclerview.widget.RecyclerView.U(r4)
            r1 = -1
            if (r0 == r1) goto L13
            int r6 = r6.b()
            r1 = 1
            int r6 = r6 - r1
            if (r6 != r0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            int r6 = r5.getMeasuredWidth()
            int r0 = r5.getPaddingLeft()
            int r6 = r6 - r0
            int r5 = r5.getPaddingRight()
            int r6 = r6 - r5
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.width
            if (r1 == 0) goto L3b
            boolean r5 = r2.f103123c
            if (r5 == 0) goto L3b
            if (r4 <= 0) goto L3b
            int r6 = r6 - r4
            int r5 = r2.f103122b
            int r4 = r4 + r5
            if (r6 <= r4) goto L3d
            int r5 = r6 / r4
            int r5 = r5 * r4
            int r6 = r6 - r5
            goto L3d
        L3b:
            int r6 = r2.f103122b
        L3d:
            r3.right = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.container.horizontal_slider.m.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public m(int i12, boolean z12, int i13, C42822w c42822w) {
        i12 = (i13 & 1) != 0 ? 0 : i12;
        z12 = (i13 & 2) != 0 ? true : z12;
        this.f103122b = i12;
        this.f103123c = z12;
    }
}
