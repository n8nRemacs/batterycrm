package com.avito.android.lib.design.text_view;

import PK0.n;
import Y61.k;
import android.content.res.ColorStateList;
import android.widget.TextView;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextStyleDataUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@k TextView textView, @k n nVar) {
        ColorStateList colorStateListB;
        if (textView instanceof PK0.e) {
            ((PK0.e) textView).setTextStyleData(nVar);
            return;
        }
        textView.setTypeface(nVar.f12989c);
        Float f12 = nVar.f12987a;
        if (f12 != null) {
            textView.setTextSize(0, f12.floatValue());
        }
        C35763c0 c35763c0 = nVar.f12988b;
        if (c35763c0 != null && (colorStateListB = c35763c0.b()) != null) {
            textView.setTextColor(colorStateListB);
        }
        Integer num = nVar.f12991e;
        if (num != null) {
            androidx.core.widget.n.d(textView, num.intValue());
        }
        textView.setText(textView.getText());
    }
}
