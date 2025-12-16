package ru.avito.component.payments.method;

import Y61.k;
import android.view.View;
import android.widget.RadioButton;
import com.avito.android.R;
import com.avito.android.lib.design.shadow_layout.ShadowLayout;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import hw.InterfaceC41178c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckablePaymentMethodCard.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/component/payments/method/c;", "Lru/avito/component/payments/method/d;", "Lru/avito/component/payments/method/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c extends d implements a {

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f430387i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final RadioButton f430388j;

    /* renamed from: k, reason: collision with root package name */
    public final View f430389k;

    public c(@k View view) {
        super(view);
        this.f430387i = view;
        this.f430388j = (RadioButton) view.findViewById(R.id.payment_method_radiobutton);
        this.f430389k = view.findViewById(R.id.payment_content);
    }

    @Override // ru.avito.component.payments.method.e
    public final void c(@k Y41.a<G0> aVar) {
        this.f430389k.setOnClickListener(new i(29, aVar));
        this.f430388j.setOnClickListener(new b(0, aVar));
    }

    @Override // ru.avito.component.payments.method.a
    public final void setChecked(boolean z12) {
        ShadowLayout shadowLayout = (ShadowLayout) this.f430387i;
        RadioButton radioButton = this.f430388j;
        radioButton.setChecked(z12);
        shadowLayout.setEnableShadows(radioButton.isChecked());
        this.f430389k.setBackgroundResource(radioButton.isChecked() ? R.drawable.bg_payment_method_selected : R.drawable.bg_payment_method);
    }
}
