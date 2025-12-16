package com.avito.android.lib.design.chips;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Chips f178747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Chips f178748c;

    public q(Chips chips, Chips chips2) {
        this.f178747b = chips;
        this.f178748c = chips2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChange(@Y61.l android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            r0 = this;
            com.avito.android.lib.design.chips.Chips r1 = r0.f178748c
            com.avito.android.lib.design.chips.Chips$DisplayType r2 = r1.getDisplayType()
            com.avito.android.lib.design.chips.Chips$DisplayType r3 = com.avito.android.lib.design.chips.Chips.DisplayType.f178701b
            androidx.recyclerview.widget.RecyclerView r4 = r1.f178693s
            if (r2 != r3) goto L20
            boolean r2 = com.avito.android.lib.design.chips.Chips.i(r4)
            if (r2 != 0) goto L20
            com.avito.android.lib.design.chips.Chips$DisplayType r2 = com.avito.android.lib.design.chips.Chips.DisplayType.f178703d
            r1.setDisplayType(r2)
            com.avito.android.inline_filters.dialog.group.item.double_input.e r2 = new com.avito.android.inline_filters.dialog.group.item.double_input.e
            r3 = 4
            r2.<init>(r1, r3)
            r1.post(r2)
        L20:
            com.avito.android.lib.design.chips.Chips$DisplayType r2 = r1.getDisplayType()
            com.avito.android.lib.design.chips.Chips$DisplayType r3 = com.avito.android.lib.design.chips.Chips.DisplayType.f178702c
            if (r2 != r3) goto L76
            boolean r2 = com.avito.android.lib.design.chips.Chips.i(r4)
            r3 = 0
            if (r2 == 0) goto L62
            androidx.recyclerview.widget.RecyclerView$m r2 = r4.getLayoutManager()
            boolean r5 = r2 instanceof com.google.android.flexbox.FlexboxLayoutManager
            if (r5 == 0) goto L62
            com.google.android.flexbox.FlexboxLayoutManager r2 = (com.google.android.flexbox.FlexboxLayoutManager) r2
            java.util.List r2 = r2.M1()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r5 = 1
            if (r2 > r5) goto L62
            com.avito.android.lib.design.chips.SafeFlexboxLayoutManager r2 = new com.avito.android.lib.design.chips.SafeFlexboxLayoutManager
            android.content.Context r6 = r4.getContext()
            r2.<init>(r6)
            r2.R1(r5)
            r2.Q1(r3)
            r4.setLayoutManager(r2)
            com.avito.android.inline_filters.dialog.group.item.double_input.e r2 = new com.avito.android.inline_filters.dialog.group.item.double_input.e
            r3 = 4
            r2.<init>(r1, r3)
            r1.post(r2)
            goto L76
        L62:
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.getContext()
            r2.<init>(r3, r3)
            r4.setLayoutManager(r2)
            com.avito.android.inline_filters.dialog.group.item.double_input.e r2 = new com.avito.android.inline_filters.dialog.group.item.double_input.e
            r3 = 4
            r2.<init>(r1, r3)
            r1.post(r2)
        L76:
            com.avito.android.lib.design.chips.Chips r1 = r0.f178747b
            r1.removeOnLayoutChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.chips.q.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
