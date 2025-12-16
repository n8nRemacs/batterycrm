package com.avito.android.extended_profile_selection_create.select.adapter.search_correction;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchCorrectionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/adapter/search_correction/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_selection_create/select/adapter/search_correction/g;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f152089d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f152090b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f152091c;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_correction_search_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152090b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_correction_search_action);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152091c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.extended_profile_selection_create.select.adapter.search_correction.g
    public final void Z3(@l String str, @k Y41.a<G0> aVar) {
        TextView textView = this.f152091c;
        I5.a(textView, str, false);
        textView.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(14, aVar));
    }

    @Override // com.avito.android.extended_profile_selection_create.select.adapter.search_correction.g
    public final void b(@l String str) {
        I5.a(this.f152090b, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f152091c.setOnClickListener(null);
    }
}
