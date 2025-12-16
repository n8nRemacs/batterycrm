package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;

/* compiled from: TransientView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(@Y61.k View view) {
        if (!(view instanceof s)) {
            return false;
        }
        if (((s) view).j()) {
            return true;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return a(viewGroup);
    }
}
