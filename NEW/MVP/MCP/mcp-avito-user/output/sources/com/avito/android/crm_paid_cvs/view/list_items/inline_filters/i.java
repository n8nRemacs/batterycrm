package com.avito.android.crm_paid_cvs.view.list_items.inline_filters;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import ht.C40979a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/inline_filters/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/inline_filters/h;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f130921d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f130922b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f130923c;

    public i(@k View view) {
        super(view);
        this.f130922b = view;
        View viewFindViewById = view.findViewById(R.id.filter_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130923c = (Button) viewFindViewById;
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.inline_filters.h
    public final void A0(@l Y41.a<G0> aVar) {
        this.f130923c.setOnClickListener(new com.avito.android.component.user_hat.items.k(26, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.inline_filters.h
    @SuppressLint({"UdfComponentUsage"})
    public final void X8() {
        Button.g(this.f130923c, null, C35835l0.h(R.attr.ic_arrowExpandLess16, this.f130922b.getContext()), false, null, 13);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.inline_filters.h
    public final void setSelected(boolean z12) {
        C40979a.a(this.f130923c, z12);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.inline_filters.h
    public final void setText(@k String str) {
        com.avito.android.lib.design.button.b.a(this.f130923c, str, false);
    }
}
