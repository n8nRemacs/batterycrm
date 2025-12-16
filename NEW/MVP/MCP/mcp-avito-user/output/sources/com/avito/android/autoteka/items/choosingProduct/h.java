package com.avito.android.autoteka.items.choosingProduct;

import Tf.c;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.autoteka.domain.model.choosingPurchase.ProductItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.autoteka.model.AutotekaDiscount;
import com.avito.android.remote.autoteka.model.StandaloneAutotekaBlock;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ChoosingProductView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/choosingProduct/g;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f96716i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f96717b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f96718c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f96719d;

    /* renamed from: e, reason: collision with root package name */
    public final CardView f96720e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f96721f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f96722g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f96723h;

    public h(@Y61.k View view) {
        super(view);
        this.f96717b = view;
        this.f96718c = (LinearLayout) view.findViewById(R.id.autoteka_products_container);
        this.f96719d = (TextView) view.findViewById(R.id.autoteka_choosing_product_text);
        this.f96720e = (CardView) view.findViewById(R.id.autoteka_choosing_product_standalone_block);
        this.f96721f = (TextView) view.findViewById(R.id.autoteka_choosing_product_standalone_link);
        this.f96722g = (TextView) view.findViewById(R.id.autoteka_choosing_product_standalone_description);
        this.f96723h = view.getContext();
    }

    @Override // com.avito.android.autoteka.items.choosingProduct.g
    public final void F(@Y61.l AttributedText attributedText) {
        int i12 = (attributedText == null || attributedText.getText().length() <= 0) ? 8 : 0;
        TextView textView = this.f96719d;
        textView.setVisibility(i12);
        if (attributedText != null) {
            com.avito.android.util.text.j.c(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.autoteka.items.choosingProduct.g
    public final void Kn(@Y61.l StandaloneAutotekaBlock standaloneAutotekaBlock, @Y61.k Y41.l<? super String, G0> lVar) {
        this.f96720e.setVisibility(standaloneAutotekaBlock != null ? 0 : 8);
        if (standaloneAutotekaBlock != null) {
            AttributedText description = standaloneAutotekaBlock.getDescription();
            TextView textView = this.f96722g;
            if (description != null) {
                com.avito.android.util.text.j.c(textView, description, null);
            }
            textView.setVisibility(standaloneAutotekaBlock.getDescription() == null ? 8 : 0);
            String title = standaloneAutotekaBlock.getStandaloneLink().getTitle();
            TextView textView2 = this.f96721f;
            textView2.setText(title);
            textView2.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(10, lVar, standaloneAutotekaBlock));
        }
    }

    @Override // com.avito.android.autoteka.items.choosingProduct.g
    public final void vL(@Y61.k Y41.l lVar, @Y61.k List list) {
        DockingBadgeType.Predefined predefined;
        G0 g02;
        LinearLayout linearLayout = this.f96718c;
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductItem productItem = (ProductItem) it.next();
            Tf.c cVar = new Tf.c(this.f96723h);
            cVar.f15789c.setText(productItem.f96631d);
            ArrayList<AutotekaDiscount> arrayList = productItem.f96630c;
            boolean zIsEmpty = arrayList.isEmpty();
            DockingBadgeContainer dockingBadgeContainer = cVar.f15788b;
            if (zIsEmpty) {
                dockingBadgeContainer.setBadgeItems(Collections.singletonList(new DockingBadgeItem(cVar.getContext().getString(R.string.autoteka_without_discount), DockingBadgeType.Predefined.Gray, DockingBadgeEdgeType.Flag, DockingBadgeEdgeType.Pipka, null, 16, null)));
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (AutotekaDiscount autotekaDiscount : arrayList) {
                    int i12 = c.a.f15795a[autotekaDiscount.getDiscountType().ordinal()];
                    if (i12 == 1) {
                        predefined = DockingBadgeType.Predefined.Violet;
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        predefined = DockingBadgeType.Predefined.Green;
                    }
                    arrayList2.add(new DockingBadgeItem(autotekaDiscount.getValue(), predefined, DockingBadgeEdgeType.Flag, DockingBadgeEdgeType.Pipka, null, 16, null));
                }
                dockingBadgeContainer.setBadgeItems(arrayList2);
            }
            View view = cVar.f15794h;
            String str = productItem.f96636i;
            if (str == null) {
                view.setBackgroundResource(R.drawable.background_product_default);
            } else {
                Integer numH = com.avito.android.lib.util.f.h(str);
                if (numH != null) {
                    AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(cVar.getContext(), numH.intValue(), 0, 4, null);
                    c5275a.f179264a = y6.b(12);
                    view.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    view.setBackgroundResource(R.drawable.background_product_default);
                }
            }
            cVar.f15791e.setText(productItem.f96633f);
            I5.a(cVar.f15792f, productItem.f96634g, false);
            I5.a(cVar.f15793g, productItem.f96635h, false);
            I5.a(cVar.f15790d, productItem.f96632e, false);
            view.setOnClickListener(new Tf.b(0, lVar, productItem.f96629b));
            linearLayout.addView(cVar);
        }
    }
}
