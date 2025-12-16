package com.avito.android.crm_paid_cvs.view.list_items.searches_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchesItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/searches_item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/searches_item/i;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f131003g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f131004b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f131005c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f131006d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f131007e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f131008f;

    public j(@k View view) {
        super(view);
        this.f131004b = view;
        View viewFindViewById = view.findViewById(R.id.search_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131005c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.new_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f131006d = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.search_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131007e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.edit_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f131008f = viewFindViewById4;
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.searches_item.i
    public final void ZK(boolean z12) {
        D6.G(this.f131006d, z12);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.searches_item.i
    public final void eK(@k Y41.a<G0> aVar) {
        this.f131008f.setOnClickListener(new com.avito.android.component.user_hat.items.k(29, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.searches_item.i
    public final void h(@k String str) {
        I5.a(this.f131007e, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.searches_item.i
    public final void jH(@k Y41.a<G0> aVar) {
        this.f131004b.setOnClickListener(new com.avito.android.component.user_hat.items.k(28, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.searches_item.i
    public final void setTitle(@k String str) {
        I5.a(this.f131005c, str, false);
    }
}
