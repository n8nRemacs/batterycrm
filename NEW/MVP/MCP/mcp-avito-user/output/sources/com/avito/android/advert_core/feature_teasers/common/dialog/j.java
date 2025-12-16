package com.avito.android.advert_core.feature_teasers.common.dialog;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFeatureTeaserDialogTextItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/j;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f83640b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f83641c;

    public j(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f83640b = aVar;
        TextView textView = (TextView) view;
        this.f83641c = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
