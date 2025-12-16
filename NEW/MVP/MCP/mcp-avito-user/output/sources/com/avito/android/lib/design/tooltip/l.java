package com.avito.android.lib.design.tooltip;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f181231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f181232c;

    public l(View view, k kVar) {
        this.f181231b = kVar;
        this.f181232c = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        int i22 = k.f181215q;
        k kVar = this.f181231b;
        View view2 = this.f181232c;
        Rect rectA = kVar.a(view2);
        kVar.showAtLocation(view2, 8388659, rectA.left, rectA.top);
        Long l12 = kVar.f181230p;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            View view3 = kVar.f181218d;
            if (view3 == null) {
                return;
            }
            com.avito.android.inline_filters.dialog.group.item.double_input.e eVar = new com.avito.android.inline_filters.dialog.group.item.double_input.e(kVar, 10);
            kVar.f181221g = eVar;
            view3.postDelayed(eVar, jLongValue);
        }
    }
}
