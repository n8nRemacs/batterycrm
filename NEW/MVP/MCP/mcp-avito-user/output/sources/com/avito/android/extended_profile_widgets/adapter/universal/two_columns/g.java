package com.avito.android.extended_profile_widgets.adapter.universal.two_columns;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import kotlin.Metadata;

/* compiled from: UniversalWidgetTwoColumnsItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/two_columns/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/universal/two_columns/f;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalWidgetFourBlocksView f155023b;

    public g(@k View view) {
        super(view);
        this.f155023b = (UniversalWidgetFourBlocksView) view.findViewById(R.id.extended_profile_universal_widget_four_blocks);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.universal.two_columns.f
    public final void Z10(@k UniversalWidgetTwoColumnsItem universalWidgetTwoColumnsItem) {
        this.f155023b.a(universalWidgetTwoColumnsItem.f155017d);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        UniversalWidgetFourBlocksView universalWidgetFourBlocksView = this.f155023b;
        universalWidgetFourBlocksView.f153528b.i();
        universalWidgetFourBlocksView.f153529c.i();
        universalWidgetFourBlocksView.f153530d.i();
        universalWidgetFourBlocksView.f153531e.i();
    }
}
