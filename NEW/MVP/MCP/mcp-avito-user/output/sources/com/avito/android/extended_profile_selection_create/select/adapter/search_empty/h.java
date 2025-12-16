package com.avito.android.extended_profile_selection_create.select.adapter.search_empty;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchEmptyItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/adapter/search_empty/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_selection_create/select/adapter/search_empty/g;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f152101c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f152102b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_selection_create_empty_search_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f152102b = viewFindViewById;
    }

    @Override // com.avito.android.extended_profile_selection_create.select.adapter.search_empty.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f152102b.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(15, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f152102b.setOnClickListener(null);
    }
}
