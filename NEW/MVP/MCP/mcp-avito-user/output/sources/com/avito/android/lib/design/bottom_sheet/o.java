package com.avito.android.lib.design.bottom_sheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetMenuDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/o;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o extends d {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f178559F = 0;

    /* renamed from: E, reason: collision with root package name */
    public final float f178560E;

    public o(@Y61.k Context context, @Y61.k Y41.l<? super o, G0> lVar) {
        super(context, 0, 2, null);
        this.f178560E = context.getResources().getDisplayMetrics().density;
        D(R.layout.design_bottom_sheet_menu_scrollable_content, true);
        lVar.invoke(this);
    }

    public static void V(o oVar, Y41.l lVar) {
        int iJ2 = C35835l0.j(R.attr.textHeadingLarge, oVar.getContext());
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(oVar.getContext(), null, 0, 0, 14, null);
        aVar.setId(View.generateViewId());
        aVar.setTag("header");
        aVar.setTextAppearance(iJ2);
        lVar.invoke(aVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f12 = oVar.f178560E;
        int iB2 = kotlin.math.b.b(8 * f12);
        int iB3 = kotlin.math.b.b(16 * f12);
        layoutParams.setMargins(iB3, iB2, iB3, 0);
        LinearLayout linearLayout = (LinearLayout) oVar.findViewById(R.id.menu_content);
        if (linearLayout != null) {
            linearLayout.addView(aVar, layoutParams);
        }
    }

    public static void W(o oVar, String str, Integer num, Integer num2, com.avito.android.image_loader.a aVar, Integer num3, Y41.l lVar, int i12) {
        Integer num4 = (i12 & 2) != 0 ? null : num;
        Integer num5 = (i12 & 4) != 0 ? null : num2;
        com.avito.android.image_loader.a aVar2 = (i12 & 8) != 0 ? null : aVar;
        Integer num6 = (i12 & 16) == 0 ? num3 : null;
        View viewInflate = oVar.getLayoutInflater().inflate(R.layout.design_bottom_sheet_menu_item_with_badge, (ViewGroup) oVar.findViewById(R.id.menu_content), false);
        viewInflate.setId(View.generateViewId());
        viewInflate.setTag("menu_item");
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.menu_item_icon);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(R.id.menu_item_thumbnail);
        TextView textView = (TextView) viewInflate.findViewById(R.id.menu_item_title);
        textView.setText(str);
        if (aVar2 != null) {
            D6.H(simpleDraweeView);
            C35949t5.c(simpleDraweeView, aVar2, null, null, null, 14);
        } else {
            D6.w(simpleDraweeView);
        }
        if (num4 != null) {
            D6.H(imageView);
            imageView.setImageResource(num4.intValue());
            if (num5 != null) {
                imageView.setImageTintList(ColorStateList.valueOf(num5.intValue()));
            }
        } else {
            D6.w(imageView);
        }
        if (num6 != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, num6.intValue(), 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        viewInflate.setOnClickListener(new l(lVar));
        LinearLayout linearLayout = (LinearLayout) oVar.findViewById(R.id.menu_content);
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        }
    }

    public final void X(@Y61.k Y41.l<? super TextView, G0> lVar) {
        int iJ2 = C35835l0.j(R.attr.textBody, getContext());
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(getContext(), null, 0, 0, 14, null);
        aVar.setId(View.generateViewId());
        aVar.setTag("text");
        aVar.setTextAppearance(iJ2);
        lVar.invoke(aVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f12 = this.f178560E;
        int iB2 = kotlin.math.b.b(16 * f12);
        int iB3 = kotlin.math.b.b(8 * f12);
        layoutParams.setMargins(iB2, iB3, iB2, iB3);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.menu_content);
        if (linearLayout != null) {
            linearLayout.addView(aVar, layoutParams);
        }
    }
}
