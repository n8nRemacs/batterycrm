package com.avito.android.travel_payment_methods.items.payment_method;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_payment_methods.model.PaymentMethod;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentMethodViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/payment_method/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/travel_payment_methods/items/payment_method/o;", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f302525h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f302526b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ImageView f302527c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final TextView f302528d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f302529e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Badge f302530f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Checkmark f302531g;

    public p(@Y61.k View view) {
        super(view);
        this.f302526b = view;
        this.f302527c = (ImageView) view.findViewById(R.id.payment_method_icon);
        this.f302528d = (TextView) view.findViewById(R.id.payment_method_title);
        this.f302529e = (TextView) view.findViewById(R.id.payment_method_subtitle);
        this.f302530f = (Badge) view.findViewById(R.id.payment_method_new_badge);
        this.f302531g = (Checkmark) view.findViewById(R.id.payment_method_checkmark);
    }

    @Override // com.avito.android.travel_payment_methods.items.payment_method.o
    public final void Bc(boolean z12) {
        Checkmark checkmark = this.f302531g;
        if (checkmark != null) {
            checkmark.setEnabled(true);
            checkmark.setChecked(z12);
            checkmark.setBackground(!z12 ? D6.u(checkmark, R.drawable.bg_payment_method_checkmark) : null);
        }
    }

    @Override // com.avito.android.travel_payment_methods.items.payment_method.o
    public final void pK(@Y61.k PaymentMethodItem paymentMethodItem, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2) {
        String str;
        String colorKey;
        Integer numA;
        PaymentMethod paymentMethod = paymentMethodItem.f302517c;
        ImageView imageView = this.f302527c;
        if (imageView != null && (str = paymentMethod.f302550b.f302558c) != null) {
            Context context = imageView.getContext();
            Integer numA2 = com.avito.android.lib.util.q.a(str);
            int iIntValue = numA2 != null ? numA2.intValue() : R.attr.ic_operations20;
            UniversalColor universalColor = paymentMethod.f302550b.f302557b;
            imageView.setImageDrawable(C35835l0.m(context, iIntValue, (universalColor == null || (colorKey = universalColor.getColorKey()) == null || (numA = com.avito.android.lib.util.e.a(colorKey)) == null) ? R.attr.black : numA.intValue()));
        }
        TextView textView = this.f302528d;
        if (textView != null) {
            com.avito.android.util.text.j.c(textView, paymentMethod.f302556h, null);
        }
        AttributedText attributedText = paymentMethod.f302555g;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new B(27, lVar2));
            TextView textView2 = this.f302529e;
            if (textView2 != null) {
                com.avito.android.util.text.j.c(textView2, attributedText, null);
            }
        }
        D6.G(this.f302530f, paymentMethod.f302551c);
        this.f302526b.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(9, lVar, paymentMethodItem));
    }
}
