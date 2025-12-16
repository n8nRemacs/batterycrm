package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/actions_block/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/actions_block/j;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f138284d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f138285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Switcher f138286c;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.sorting_type);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f138285b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.client_mode_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById2).setOnClickListener(new k(this, 0));
        View viewFindViewById3 = view.findViewById(R.id.client_mode_switcher);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f138286c = (Switcher) viewFindViewById3;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.j
    public final void rR(@Y61.k Y41.a<G0> aVar) {
        this.f138285b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(25, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.j
    public final void ux(@Y61.k String str) {
        I5.a(this.f138285b, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.j
    public final void wA(boolean z12) throws Resources.NotFoundException {
        Switcher switcher = this.f138286c;
        if (switcher.isChecked() != z12) {
            switcher.setChecked(z12);
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.j
    public final void z70(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f138286c.setOnCheckedChangeListener(new com.avito.android.blueprints.publish.select.inline.j(1, lVar));
    }
}
