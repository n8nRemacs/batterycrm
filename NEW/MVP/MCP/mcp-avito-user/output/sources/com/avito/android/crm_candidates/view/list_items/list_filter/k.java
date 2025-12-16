package com.avito.android.crm_candidates.view.list_items.list_filter;

import Y61.l;
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

/* compiled from: JobCrmListFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/list_filter/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/j;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f130155i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f130156b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f130157c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f130158d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f130159e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f130160f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RadioButton f130161g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Checkbox f130162h;

    public k(@Y61.k View view) {
        super(view);
        this.f130156b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130157c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130158d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.counter);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130159e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.right_arrow);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130160f = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.radio_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f130161g = (RadioButton) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.checkbox_view);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f130162h = (Checkbox) viewFindViewById6;
    }

    @Override // com.avito.android.crm_candidates.view.list_items.list_filter.j
    public final void A0(@Y61.k Y41.a<G0> aVar) {
        this.f130156b.setOnClickListener(new com.avito.android.component.user_hat.items.k(16, aVar));
    }

    @Override // com.avito.android.crm_candidates.view.list_items.list_filter.j
    public final void MX(boolean z12) {
        D6.G(this.f130160f, z12);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.list_filter.j
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
        Checkbox checkbox = this.f130162h;
        checkbox.setState(toggleState);
        RadioButton radioButton = this.f130161g;
        radioButton.setState(toggleState);
        D6.G(checkbox, z13);
        D6.G(radioButton, !z13);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.list_filter.j
    public final void h(@l String str) {
        I5.a(this.f130158d, str, false);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.list_filter.j
    public final void o7(@l String str) {
        I5.a(this.f130159e, str, false);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.list_filter.j
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f130157c, str, false);
    }
}
