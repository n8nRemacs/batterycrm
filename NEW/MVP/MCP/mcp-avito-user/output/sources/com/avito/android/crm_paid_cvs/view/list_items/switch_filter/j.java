package com.avito.android.crm_paid_cvs.view.list_items.switch_filter;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SwitchFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/switch_filter/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/switch_filter/i;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f131038e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f131039b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f131040c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Switcher f131041d;

    public j(@k View view) {
        super(view);
        this.f131039b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131040c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f131041d = (Switcher) viewFindViewById2;
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.switch_filter.i
    public final void A0(@k Y41.a<G0> aVar) {
        this.f131039b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(1, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.switch_filter.i
    public final void setSelected(boolean z12) throws Resources.NotFoundException {
        this.f131041d.setChecked(z12);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.switch_filter.i
    public final void setTitle(@k String str) {
        I5.a(this.f131040c, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.switch_filter.i
    public final void setVisible(boolean z12) {
        D6.G(this.f131039b, z12);
    }
}
