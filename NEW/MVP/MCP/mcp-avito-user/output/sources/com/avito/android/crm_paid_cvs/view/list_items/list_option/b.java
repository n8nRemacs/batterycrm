package com.avito.android.crm_paid_cvs.view.list_items.list_option;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ListOptionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/list_option/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/list_option/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f130924f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f130925b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f130926c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RadioButton f130927d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Checkbox f130928e;

    public b(@k View view) {
        super(view);
        this.f130925b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130926c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.radio_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f130927d = (RadioButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkbox_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f130928e = (Checkbox) viewFindViewById3;
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.list_option.a
    public final void A0(@k Y41.a<G0> aVar) {
        this.f130925b.setOnClickListener(new com.avito.android.component.user_hat.items.k(27, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.list_option.a
    public final void Md(boolean z12, boolean z13) {
        ToggleState.ToggleValue toggleValue;
        if (z12) {
            toggleValue = ToggleState.ToggleValue.f181170d;
        } else {
            if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            toggleValue = ToggleState.ToggleValue.f181168b;
        }
        ToggleState toggleState = new ToggleState(null, false, false, false, toggleValue, 7, null);
        Checkbox checkbox = this.f130928e;
        checkbox.setState(toggleState);
        RadioButton radioButton = this.f130927d;
        radioButton.setState(toggleState);
        D6.G(checkbox, z13);
        D6.G(radioButton, !z13);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.list_option.a
    public final void setTitle(@k String str) {
        I5.a(this.f130926c, str, false);
    }
}
