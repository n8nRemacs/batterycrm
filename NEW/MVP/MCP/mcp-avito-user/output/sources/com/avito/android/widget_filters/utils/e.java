package com.avito.android.widget_filters.utils;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: WidgetFiltersViewExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_widget-filters_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {
    public static final void a(@k TextView textView, @l com.avito.android.widget_filters.ui.items.d dVar, @k Context context) {
        if (dVar == null) {
            D6.w(textView);
            return;
        }
        D6.H(textView);
        String str = dVar.f330358a;
        String str2 = str == null ? "" : str;
        com.avito.android.widget_filters.ui.items.a aVar = dVar.f330359b;
        if (!aVar.f330319a) {
            I5.a(textView, str2, false);
            return;
        }
        PrintableText printableText = aVar.f330320b;
        String strK0 = printableText != null ? printableText.k0(context) : null;
        com.avito.android.lib.design.badge.e.d(textView, str2, strK0 == null ? "" : strK0, R.style.Re23_Badge_TextRedM, null, 56);
    }
}
