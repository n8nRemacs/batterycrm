package com.yandex.div.core.util;

import android.view.View;
import kotlin.Metadata;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class q {
    public static final View a(View view) {
        View view2 = null;
        while (view != null) {
            if (!b(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    public static final boolean b(@Y61.k View view) {
        return view.getWidth() > 0 || view.getHeight() > 0;
    }
}
