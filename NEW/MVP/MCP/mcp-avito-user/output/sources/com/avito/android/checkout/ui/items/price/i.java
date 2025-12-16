package com.avito.android.checkout.ui.items.price;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckoutPriceItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/ui/items/price/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/checkout/ui/items/price/h;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f118422p = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f118423b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f118424c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f118425d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f118426e;

    /* renamed from: f, reason: collision with root package name */
    public final StrikethroughTextView f118427f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f118428g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f118429h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f118430i;

    /* renamed from: j, reason: collision with root package name */
    public final int f118431j;

    /* renamed from: k, reason: collision with root package name */
    public final int f118432k;

    /* renamed from: l, reason: collision with root package name */
    public final int f118433l;

    /* renamed from: m, reason: collision with root package name */
    public final int f118434m;

    /* renamed from: n, reason: collision with root package name */
    public final int f118435n;

    /* renamed from: o, reason: collision with root package name */
    public final int f118436o;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f118423b = aVar;
        this.f118424c = (ViewGroup) view.findViewById(R.id.checkout_price_main_container);
        this.f118425d = (TextView) view.findViewById(R.id.checkout_price_main_title);
        this.f118426e = (TextView) view.findViewById(R.id.checkout_price_main_title_icon);
        this.f118427f = (StrikethroughTextView) view.findViewById(R.id.checkout_price_main_old_value);
        this.f118428g = (TextView) view.findViewById(R.id.checkout_price_main_value);
        this.f118429h = (LinearLayout) view.findViewById(R.id.checkout_price_drop_down_container);
        this.f118430i = (TextView) view.findViewById(R.id.checkout_price_description);
        this.f118431j = y6.b(8);
        this.f118432k = y6.b(4);
        this.f118433l = y6.b(32);
        this.f118434m = R.attr.textIconExpandLess;
        this.f118435n = R.attr.textIconExpandMore;
        this.f118436o = C35835l0.j(R.attr.textM20, view.getContext());
    }

    @Override // com.avito.android.checkout.ui.items.price.h
    public final void K70() {
        this.f118424c.setOnClickListener(null);
        TextView textView = this.f118426e;
        textView.setText((CharSequence) null);
        D6.w(textView);
        LinearLayout linearLayout = this.f118429h;
        linearLayout.removeAllViews();
        D6.w(linearLayout);
    }

    @Override // com.avito.android.checkout.ui.items.price.h
    public final void LR(boolean z12) {
        int i12 = z12 ? this.f118434m : this.f118435n;
        FV.a.f4720a.getClass();
        TextView textView = this.f118426e;
        FV.a.c(textView, i12);
        D6.H(textView);
        D6.G(this.f118429h, z12);
    }

    @Override // com.avito.android.checkout.ui.items.price.h
    public final void Ly(@k ArrayList arrayList, boolean z12, @k Y41.a aVar) {
        LinearLayout linearLayout = this.f118429h;
        linearLayout.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            DescriptionParameterItem descriptionParameterItem = new DescriptionParameterItem(this.itemView.getContext(), null, 0, 0, 14, null);
            descriptionParameterItem.setAppearance(this.f118436o);
            com.avito.android.lib.design.text_view.a leftTextView = descriptionParameterItem.getLeftTextView();
            AttributedText attributedText = jVar.f118437a;
            com.avito.android.util.text.a aVar2 = this.f118423b;
            com.avito.android.util.text.j.a(leftTextView, attributedText, aVar2);
            com.avito.android.util.text.j.a(descriptionParameterItem.getRightTextView(), jVar.f118438b, aVar2);
            descriptionParameterItem.setDotsOffset(this.f118432k);
            descriptionParameterItem.setLayoutParams(layoutParams);
            D6.c(descriptionParameterItem, null, Integer.valueOf(this.f118431j), null, null, 13);
            linearLayout.addView(descriptionParameterItem);
        }
        LR(z12);
        this.f118424c.setOnClickListener(new m(9, aVar));
    }

    @Override // com.avito.android.checkout.ui.items.price.h
    public final void S9(boolean z12) {
        D6.c(this.itemView, null, null, Integer.valueOf(z12 ? 0 : this.f118433l), null, 11);
    }

    @Override // com.avito.android.checkout.ui.items.price.h
    public final void bC(@k AttributedText attributedText, @k AttributedText attributedText2, @l String str) {
        TextView textView = this.f118425d;
        com.avito.android.util.text.a aVar = this.f118423b;
        com.avito.android.util.text.j.a(textView, attributedText, aVar);
        com.avito.android.util.text.j.a(this.f118428g, attributedText2, aVar);
        I5.a(this.f118427f, str, false);
    }

    @Override // com.avito.android.checkout.ui.items.price.h
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f118430i, attributedText, this.f118423b);
    }
}
