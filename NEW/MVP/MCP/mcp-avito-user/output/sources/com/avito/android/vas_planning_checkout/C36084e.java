package com.avito.android.vas_planning_checkout;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasCheckoutDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_planning_checkout.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36084e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f322900b;

    /* renamed from: c, reason: collision with root package name */
    public final int f322901c;

    /* renamed from: d, reason: collision with root package name */
    public final int f322902d;

    /* renamed from: e, reason: collision with root package name */
    public final int f322903e;

    /* renamed from: f, reason: collision with root package name */
    public final int f322904f;

    @Inject
    public C36084e(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f322900b = resources;
        this.f322901c = resources.getDimensionPixelSize(R.dimen.vas_planning_container_horizontal_padding);
        this.f322902d = resources.getDimensionPixelSize(R.dimen.vas_planning_padding_checkout_header);
        this.f322903e = resources.getDimensionPixelSize(R.dimen.vas_planning_padding_vertical_result_title);
        this.f322904f = aVar.Y(com.avito.android.vas_planning_checkout.item.result_warning.a.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r4, @Y61.k android.view.View r5, @Y61.k androidx.recyclerview.widget.RecyclerView r6, @Y61.k androidx.recyclerview.widget.RecyclerView.z r7) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$C r7 = r6.W(r5)
            boolean r7 = r7 instanceof com.avito.android.vas_planning_checkout.item.result_warning.f
            int r0 = r3.f322901c
            r1 = 0
            if (r7 == 0) goto Ld
            r7 = r1
            goto Le
        Ld:
            r7 = r0
        Le:
            r4.left = r7
            androidx.recyclerview.widget.RecyclerView$C r7 = r6.W(r5)
            boolean r7 = r7 instanceof com.avito.android.vas_planning_checkout.item.result_warning.f
            if (r7 == 0) goto L19
            r0 = r1
        L19:
            r4.right = r0
            androidx.recyclerview.widget.RecyclerView$C r7 = r6.W(r5)
            boolean r0 = r7 instanceof com.avito.android.vas_planning_checkout.item.disclaimer.f
            android.content.res.Resources r2 = r3.f322900b
            if (r0 == 0) goto L2d
            r7 = 2131168725(0x7f070dd5, float:1.795176E38)
            int r7 = r2.getDimensionPixelOffset(r7)
            goto L3a
        L2d:
            boolean r7 = r7 instanceof com.avito.android.vas_planning_checkout.item.price.e
            if (r7 == 0) goto L39
            r7 = 2131168729(0x7f070dd9, float:1.7951768E38)
            int r7 = r2.getDimensionPixelOffset(r7)
            goto L3a
        L39:
            r7 = r1
        L3a:
            r4.top = r7
            androidx.recyclerview.widget.RecyclerView$C r5 = r6.W(r5)
            boolean r7 = r5 instanceof com.avito.android.vas_planning_checkout.item.header.c
            if (r7 == 0) goto L6b
            int r5 = r5.getBindingAdapterPosition()
            int r5 = r5 + 1
            if (r5 < 0) goto L69
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r6.getAdapter()
            if (r7 == 0) goto L56
            int r1 = r7.getItemCount()
        L56:
            if (r5 >= r1) goto L69
            androidx.recyclerview.widget.RecyclerView$Adapter r6 = r6.getAdapter()
            if (r6 == 0) goto L69
            int r5 = r6.getItemViewType(r5)
            int r6 = r3.f322904f
            if (r5 != r6) goto L69
            int r1 = r3.f322903e
            goto L6b
        L69:
            int r1 = r3.f322902d
        L6b:
            r4.bottom = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_planning_checkout.C36084e.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
