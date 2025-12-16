package com.avito.android.lib.design.selector_card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCard.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/w;", "Landroid/widget/LinearLayout;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class w extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.text_view.a f180461b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.text_view.a f180462c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f180463d;

    public w(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        setOrientation(1);
        setGravity(8388611);
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(aVar);
        this.f180461b = aVar;
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        addView(view);
        this.f180463d = view;
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(aVar2);
        this.f180462c = aVar2;
    }
}
