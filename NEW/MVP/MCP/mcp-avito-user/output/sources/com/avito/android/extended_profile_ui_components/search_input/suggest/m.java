package com.avito.android.extended_profile_ui_components.search_input.suggest;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/l;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f153455d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f153456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f153457c;

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_suggest_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f153456b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_suggest_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153457c = viewFindViewById2;
    }

    @Override // com.avito.android.extended_profile_ui_components.search_input.suggest.l
    public final void S60(@Y61.k CharSequence charSequence, @Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f153456b;
        I5.a(textView, charSequence, false);
        textView.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(18, aVar));
        this.f153457c.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(19, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f153456b.setOnClickListener(null);
    }
}
