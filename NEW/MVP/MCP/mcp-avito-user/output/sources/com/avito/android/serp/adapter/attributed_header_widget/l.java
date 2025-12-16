package com.avito.android.serp.adapter.attributed_header_widget;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AttributedHeaderWidgetView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/attributed_header_widget/l;", "Lcom/avito/android/serp/adapter/attributed_header_widget/k;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f268947b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f268948c;

    public l(@Y61.k View view) {
        super(view);
        this.f268947b = (TextView) view.findViewById(R.id.attributed_header_title);
        this.f268948c = (TextView) view.findViewById(R.id.attributed_header_description);
    }

    @Override // com.avito.android.serp.adapter.attributed_header_widget.k
    public final void q(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f268948c, attributedText, null);
    }

    @Override // com.avito.android.serp.adapter.attributed_header_widget.k
    public final void w(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f268947b, attributedText, null);
    }
}
