package com.avito.android.lib.design.chips.ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Chips f178791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Chips f178792c;

    public e(Chips chips, Chips chips2) {
        this.f178791b = chips;
        this.f178792c = chips2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChange(@Y61.l android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            r0 = this;
            com.avito.android.lib.design.chips.ui.Chips r1 = r0.f178792c
            com.avito.android.lib.design.chips.state.ChipsState r2 = com.avito.android.lib.design.chips.ui.Chips.L0(r1)
            com.avito.android.lib.design.chips.state.ChipsState$DisplayType r2 = r2.f178752b
            com.avito.android.lib.design.chips.state.ChipsState$DisplayType r5 = com.avito.android.lib.design.chips.state.ChipsState.DisplayType.f178758d
            if (r2 != r5) goto L30
            boolean r2 = com.avito.android.lib.design.chips.ui.Chips.M0(r1)
            if (r2 != 0) goto L30
            com.avito.android.lib.design.chips.state.ChipsState r2 = com.avito.android.lib.design.chips.ui.Chips.L0(r1)
            int r4 = r2.f178751a
            com.avito.android.lib.design.chips.state.ChipsState r9 = new com.avito.android.lib.design.chips.state.ChipsState
            Y41.l<java.lang.Integer, kotlin.G0> r6 = r2.f178753c
            java.util.List<com.avito.android.lib.design.chips.h> r7 = r2.f178754d
            Y41.p<com.avito.android.lib.design.chips.h, java.lang.Boolean, kotlin.G0> r8 = r2.f178755e
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r1.setState(r9)
            com.avito.android.inline_filters.dialog.group.item.double_input.e r2 = new com.avito.android.inline_filters.dialog.group.item.double_input.e
            r3 = 5
            r2.<init>(r1, r3)
            r1.post(r2)
        L30:
            com.avito.android.lib.design.chips.state.ChipsState r2 = com.avito.android.lib.design.chips.ui.Chips.L0(r1)
            com.avito.android.lib.design.chips.state.ChipsState$DisplayType r2 = r2.f178752b
            com.avito.android.lib.design.chips.state.ChipsState$DisplayType r3 = com.avito.android.lib.design.chips.state.ChipsState.DisplayType.f178757c
            if (r2 != r3) goto L88
            boolean r2 = com.avito.android.lib.design.chips.ui.Chips.M0(r1)
            r3 = 0
            if (r2 == 0) goto L74
            androidx.recyclerview.widget.RecyclerView$m r2 = r1.getLayoutManager()
            boolean r4 = r2 instanceof com.google.android.flexbox.FlexboxLayoutManager
            if (r4 == 0) goto L74
            com.google.android.flexbox.FlexboxLayoutManager r2 = (com.google.android.flexbox.FlexboxLayoutManager) r2
            java.util.List r2 = r2.M1()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r4 = 1
            if (r2 > r4) goto L74
            com.avito.android.lib.design.chips.SafeFlexboxLayoutManager r2 = new com.avito.android.lib.design.chips.SafeFlexboxLayoutManager
            android.content.Context r5 = r1.getContext()
            r2.<init>(r5)
            r2.R1(r4)
            r2.Q1(r3)
            r1.setLayoutManager(r2)
            com.avito.android.inline_filters.dialog.group.item.double_input.e r2 = new com.avito.android.inline_filters.dialog.group.item.double_input.e
            r3 = 5
            r2.<init>(r1, r3)
            r1.post(r2)
            goto L88
        L74:
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.getContext()
            r2.<init>(r3, r3)
            r1.setLayoutManager(r2)
            com.avito.android.inline_filters.dialog.group.item.double_input.e r2 = new com.avito.android.inline_filters.dialog.group.item.double_input.e
            r3 = 5
            r2.<init>(r1, r3)
            r1.post(r2)
        L88:
            com.avito.android.lib.design.chips.ui.Chips r1 = r0.f178791b
            r1.removeOnLayoutChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.chips.ui.e.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
