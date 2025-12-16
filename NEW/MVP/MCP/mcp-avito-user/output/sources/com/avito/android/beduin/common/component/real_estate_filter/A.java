package com.avito.android.beduin.common.component.real_estate_filter;

import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BeduinRealEstateFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A {
    public static final void a(@Y61.k com.avito.android.lib.design.bottom_sheet.d dVar, @Y61.k String str, @Y61.l String str2) {
        dVar.L(str, str2, true, true);
        ImageView imageView = (ImageView) dVar.findViewById(R.id.bottom_sheet_close_button);
        if (imageView != null) {
            D6.c(imageView, Integer.valueOf(y6.b(20)), null, null, null, 14);
        }
        TextView textView = (TextView) dVar.findViewById(R.id.bottom_sheet_title);
        if (textView != null) {
            textView.setTextAppearance(C35835l0.j(R.attr.textH5, textView.getContext()));
        }
        TextView textView2 = (TextView) dVar.findViewById(R.id.bottom_sheet_action_button);
        if (textView2 != null) {
            D6.c(textView2, null, null, Integer.valueOf(C35835l0.f(R.attr.listItemHorizontalPadding, textView2.getContext())), null, 11);
            textView2.setTextAppearance(C35835l0.j(R.attr.textM2, textView2.getContext()));
            textView2.setTextColor(androidx.core.content.d.getColorStateList(textView2.getContext(), R.color.beduin_real_estate_header_action));
        }
    }
}
