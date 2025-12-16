package com.avito.android.checkout.ui.items.promocode;

import Y61.l;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import com.avito.android.checkout.ui.items.promocode.CheckoutPromoCodeItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.input.s;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CheckoutPromoCodeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/ui/items/promocode/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/checkout/ui/items/promocode/j;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f118470n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f118471b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f118472c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f118473d;

    /* renamed from: e, reason: collision with root package name */
    public final Input f118474e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f118475f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f118476g;

    /* renamed from: h, reason: collision with root package name */
    public final int f118477h;

    /* renamed from: i, reason: collision with root package name */
    public final int f118478i;

    /* renamed from: j, reason: collision with root package name */
    public final int f118479j;

    /* renamed from: k, reason: collision with root package name */
    public final int f118480k;

    /* renamed from: l, reason: collision with root package name */
    public final int f118481l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public s f118482m;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f118471b = aVar;
        this.f118472c = (TextView) view.findViewById(R.id.checkout_promocode_title);
        this.f118473d = (TextView) view.findViewById(R.id.checkout_promocode_title_icon);
        Input input = (Input) view.findViewById(R.id.checkout_promocode_input);
        input.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        input.setInputType(524432);
        this.f118474e = input;
        this.f118475f = (Button) view.findViewById(R.id.checkout_promocode_button);
        this.f118476g = (TextView) view.findViewById(R.id.checkout_promocode_label);
        this.f118477h = C35835l0.d(R.attr.green800, view.getContext());
        this.f118478i = C35835l0.d(R.attr.red600, view.getContext());
        this.f118479j = R.attr.textIconExpandLess;
        this.f118480k = R.attr.textIconExpandMore;
        this.f118481l = y6.b(32);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void BD(@Y61.k CheckoutPromoCodeItem.Button button, @Y61.k Y41.a<G0> aVar) throws Resources.NotFoundException {
        String str = button.f118447b;
        Button button2 = this.f118475f;
        button2.setText(str);
        Integer numA = com.avito.android.mnz_common.extensions.c.a(this.itemView.getContext(), button.f118449d);
        if (numA != null) {
            button2.setAppearance(numA.intValue());
        }
        button2.setOnClickListener(new m(10, aVar));
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void Gp(boolean z12) {
        Input input = this.f118474e;
        if (!z12) {
            input.f();
        }
        input.setEnabled(z12);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void OL(@l String str, @Y61.k Y41.l<? super String, G0> lVar) {
        Input input = this.f118474e;
        Editable editableM53getText = input.m53getText();
        if (L.f(editableM53getText != null ? editableM53getText.toString() : null, str)) {
            return;
        }
        s sVar = this.f118482m;
        if (sVar != null) {
            input.h(sVar);
        }
        Input.t(input, str, false, 6);
        this.f118482m = n.c(input, lVar);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void S9(boolean z12) {
        D6.c(this.itemView, null, null, Integer.valueOf(z12 ? 0 : this.f118481l), null, 11);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void Y50(@Y61.k AttributedText attributedText, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.util.text.a aVar2 = this.f118471b;
        TextView textView = this.f118472c;
        com.avito.android.util.text.j.c(textView, attributedText, aVar2);
        textView.setOnClickListener(new m(11, aVar));
        this.f118473d.setOnClickListener(new m(12, aVar));
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void c50(boolean z12) {
        CharSequence text;
        int i12 = z12 ? this.f118479j : this.f118480k;
        FV.a.f4720a.getClass();
        FV.a.c(this.f118473d, i12);
        D6.G(this.f118474e, z12);
        D6.G(this.f118475f, z12);
        TextView textView = this.f118476g;
        D6.G(textView, (!z12 || (text = textView.getText()) == null || text.length() == 0) ? false : true);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void e6(boolean z12) {
        this.f118475f.setLoading(z12);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void j4(boolean z12) {
        Input input = this.f118474e;
        Editable editableM53getText = input.m53getText();
        input.setSelection(editableM53getText != null ? editableM53getText.length() : 0);
        Input.f179303W.getClass();
        input.setState(z12 ? Input.f179305b0 : Input.f179304a0);
        this.f118476g.setTextColor(z12 ? this.f118478i : this.f118477h);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void pq(boolean z12) {
        this.f118475f.setEnabled(z12);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void setHint(@l String str) {
        this.f118474e.setHint(str);
    }

    @Override // com.avito.android.checkout.ui.items.promocode.j
    public final void wm(@l String str) {
        TextView textView = this.f118476g;
        textView.setText(str);
        D6.G(textView, str != null);
    }
}
