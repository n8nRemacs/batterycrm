package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;

/* compiled from: SafePopupWindow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/h;", "Landroid/widget/PopupWindow;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class h extends PopupWindow {
    @Override // android.widget.PopupWindow
    public final void setContentView(@Y61.l View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
