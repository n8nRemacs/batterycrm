package com.avito.android.crm_candidates.view.list_items.inline_filters;

import android.view.View;
import at.C24172a;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmInlineFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/inline_filters/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_candidates/view/list_items/inline_filters/g;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f130128d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f130129b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f130130c;

    public h(@Y61.k View view) {
        super(view);
        this.f130129b = view;
        View viewFindViewById = view.findViewById(R.id.filter_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130130c = (Button) viewFindViewById;
    }

    @Override // com.avito.android.crm_candidates.view.list_items.inline_filters.g
    public final void A0(@Y61.l Y41.a<G0> aVar) {
        this.f130130c.setOnClickListener(new com.avito.android.component.user_hat.items.k(15, aVar));
    }

    @Override // com.avito.android.crm_candidates.view.list_items.inline_filters.g
    public final void X8() {
        Button.g(this.f130130c, null, C35835l0.h(R.attr.ic_arrowExpandLess16, this.f130129b.getContext()), false, null, 13);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.inline_filters.g
    public final void setSelected(boolean z12) {
        C24172a.a(this.f130130c, z12);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.inline_filters.g
    public final void setText(@Y61.k String str) {
        com.avito.android.lib.design.button.b.a(this.f130130c, str, false);
    }
}
