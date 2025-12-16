package com.avito.android.realty_agency.inline_filters.district;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DistrictFilterDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/district/e;", "Lcom/avito/android/inline_filters/dialog/E;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements E {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f251583a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f251584b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f251585c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f251586d;

    public e(@k View view, @k j jVar, @k com.avito.konveyor.adapter.a aVar, @k Y41.a<G0> aVar2) {
        this.f251583a = jVar;
        this.f251584b = aVar;
        this.f251585c = aVar2;
        View viewFindViewById = view.findViewById(R.id.districts);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView) viewFindViewById).setAdapter(jVar);
        View viewFindViewById2 = view.findViewById(R.id.search_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f251586d = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.apply_btn);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById3).setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 25));
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @l
    /* renamed from: getState */
    public final Parcelable getF171936c() {
        return null;
    }
}
