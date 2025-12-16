package com.avito.android.extended_profile_widgets.adapter.universal.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: UniversalWidgetTitleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/universal/title/f;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f155014b;

    public g(@k View view) {
        super(view);
        this.f155014b = (TextView) view.findViewById(R.id.extended_profile_universal_widget_title);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.universal.title.f
    public final void B60(@k UniversalWidgetTitleItem universalWidgetTitleItem) {
        String str = universalWidgetTitleItem.f155007d;
        TextView textView = this.f155014b;
        I5.a(textView, str, false);
        Integer num = universalWidgetTitleItem.f155008e;
        textView.setMaxLines(num != null ? num.intValue() : Integer.MAX_VALUE);
    }
}
