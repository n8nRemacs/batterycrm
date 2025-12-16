package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37983o {
    public static final boolean a(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Object tag = viewGroup.getTag(R.id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        return (bool == null ? false : bool.booleanValue()) || a(viewGroup);
    }
}
