package com.yandex.div.core.tooltip;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivTooltipWindow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/tooltip/j;", "Lcom/yandex/div/core/util/h;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j extends com.yandex.div.core.util.h {
    public j(View view, int i12, int i13, boolean z12, int i14, C42822w c42822w) {
        super(view, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? false : z12);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
