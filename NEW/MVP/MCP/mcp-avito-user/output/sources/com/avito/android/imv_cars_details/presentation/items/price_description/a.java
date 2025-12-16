package com.avito.android.imv_cars_details.presentation.items.price_description;

import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.q;
import com.avito.android.remote.imv_cars_details.models.ImvPriceDetails;
import com.avito.android.remote.imv_cars_details.models.PriceDetailsIcon;
import com.avito.android.remote.imv_cars_details.models.PriceDetailsItemWithIcon;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ImvCarsPriceDescriptionCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/price_description/a;", "", "<init>", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    @Y61.k
    public static List a(@l ImvPriceDetails imvPriceDetails, @Y61.k ViewGroup viewGroup) {
        String color;
        String toolTipText;
        String name;
        if (imvPriceDetails == null) {
            return C42784z0.f406748b;
        }
        List<PriceDetailsItemWithIcon> listC = imvPriceDetails.c();
        if (listC == null) {
            List<String> items = imvPriceDetails.getItems();
            if (items != null) {
                List<String> list = items;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new PriceDetailsItemWithIcon((String) it.next(), null, null, null));
                }
                listC = arrayList;
            } else {
                listC = null;
            }
            if (listC == null) {
                return C42784z0.f406748b;
            }
        }
        View viewB = C0.b(viewGroup, R.layout.imv_cars_price_description_title, viewGroup, false);
        ((TextView) viewB).setText(imvPriceDetails.getTitle());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        List<PriceDetailsItemWithIcon> list2 = listC;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (final PriceDetailsItemWithIcon priceDetailsItemWithIcon : list2) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.imv_cars_price_description_item, viewGroup, false);
            final j jVar = new j(viewInflate);
            PriceDetailsIcon icon = priceDetailsItemWithIcon.getIcon();
            Integer numA = (icon == null || (name = icon.getName()) == null) ? null : q.a(name);
            TextView textView = jVar.f170214d;
            ImageView imageView = jVar.f170213c;
            if (numA == null) {
                D6.H(textView);
                D6.w(imageView);
            } else {
                D6.w(textView);
                imageView.setImageDrawable(C35835l0.h(numA.intValue(), viewInflate.getContext()));
                D6.H(imageView);
                PriceDetailsIcon icon2 = priceDetailsItemWithIcon.getIcon();
                if (icon2 != null && (color = icon2.getColor()) != null) {
                    Context context = viewInflate.getContext();
                    C48063a.f437606a.getClass();
                    ColorStateList colorStateListF = C48063a.f(context, color, null, null);
                    if (colorStateListF == null) {
                        colorStateListF = ColorStateList.valueOf(16200612);
                    }
                    imageView.setImageTintList(colorStateListF);
                }
            }
            String toolTipTitle = priceDetailsItemWithIcon.getToolTipTitle();
            boolean z12 = toolTipTitle == null || toolTipTitle.length() == 0;
            TextView textView2 = jVar.f170212b;
            if (z12 && ((toolTipText = priceDetailsItemWithIcon.getToolTipText()) == null || toolTipText.length() == 0)) {
                viewInflate.setOnClickListener(null);
                viewInflate.setClickable(false);
                textView2.setText(priceDetailsItemWithIcon.getText());
            } else {
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.imv_cars_details.presentation.items.price_description.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PriceDetailsItemWithIcon priceDetailsItemWithIcon2 = priceDetailsItemWithIcon;
                        String toolTipTitle2 = priceDetailsItemWithIcon2.getToolTipTitle();
                        String toolTipText2 = priceDetailsItemWithIcon2.getToolTipText();
                        View view2 = jVar.f170211a;
                        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(view2.getContext(), 0, 0, 6, null);
                        kVar.f181224j = new r.d(new i.a(new b.a()));
                        int i12 = kVar.f181229o;
                        kVar.f181228n = -1;
                        kVar.f181229o = i12;
                        p.a(kVar, new i(toolTipTitle2, toolTipText2));
                        kVar.f(view2);
                    }
                });
                String text = priceDetailsItemWithIcon.getText();
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewInflate.getContext()).inflate(R.layout.imv_cars_price_description_tooltip_icon, (ViewGroup) null);
                viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                viewGroup2.layout(0, 0, viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                viewGroup2.draw(new Canvas(bitmapCreateBitmap));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                spannableStringBuilder.append((CharSequence) "\u2060").append((CharSequence) " ");
                spannableStringBuilder.setSpan(new ImageSpan(viewInflate.getContext(), bitmapCreateBitmap, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
                textView2.setText(spannableStringBuilder);
            }
            arrayList2.add(viewInflate);
        }
        return C42745f0.h0(arrayList2, C42745f0.e0(viewB));
    }
}
