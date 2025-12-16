package ru.avito.component.payments.method;

import L91.q;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.verification.verification_input_inn.o;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.g;

/* compiled from: PaymentMethodCard.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/payments/method/d;", "Lru/avito/component/payments/method/e;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public class d implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f430390b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f430391c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f430392d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f430393e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f430394f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f430395g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f430396h;

    /* compiled from: PaymentMethodCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            d dVar = d.this;
            I5.a(dVar.f430393e, str, false);
            int length = str.length();
            TextView textView = dVar.f430393e;
            TextView textView2 = dVar.f430392d;
            if (length == 0) {
                textView2.setMaxLines(2);
                textView2.setSingleLine(false);
                D6.w(textView);
            } else {
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                D6.H(textView);
            }
        }
    }

    public d(@k View view) {
        this.f430390b = view;
        View viewFindViewById = view.findViewById(R.id.payment_method_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f430391c = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.payment_method_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430392d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.payment_method_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430393e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.payment_method_error);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430394f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.information_tooltip_image_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f430395g = (ImageView) viewFindViewById5;
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f430396h = cVar;
        new io.reactivex.rxjava3.disposables.c().b(cVar.t0(new a()));
    }

    @Override // ru.avito.component.payments.method.e
    public final void AB(@k PaymentLabel paymentLabel) {
        this.f430391c.setImageResource(paymentLabel.f430384b);
    }

    @Override // ru.avito.component.payments.method.e
    public final void Nv(@k PaymentLabel paymentLabel) {
        this.f430390b.setTag(paymentLabel);
    }

    @Override // ru.avito.component.payments.method.e
    public final void f(@k String str) {
        this.f430396h.accept(str);
    }

    @Override // ru.avito.component.payments.method.e
    public final void pc(@k String str) {
        boolean zK2 = C43066x.K(str);
        ImageView imageView = this.f430395g;
        if (zK2) {
            D6.w(imageView);
            imageView.setOnClickListener(new q(6));
        } else {
            D6.H(imageView);
            imageView.setOnClickListener(new o(24, this, str));
        }
    }

    @Override // ru.avito.component.payments.method.e
    public final void setEnabled(boolean z12) {
        D6.F(this.f430390b, z12);
    }

    @Override // ru.avito.component.payments.method.e
    public final void setErrorMessage(@l String str) {
        I5.a(this.f430394f, str, false);
    }

    @Override // ru.avito.component.payments.method.e
    public final void setTitle(@k String str) {
        I5.a(this.f430392d, str, false);
    }
}
