package com.avito.android.cv_actualization.view.phone_select.ui.items.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPhoneSelectPhoneHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/g;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f131434b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f131435c;

    public h(@k View view) {
        super(view);
        this.f131434b = (TextView) view.findViewById(R.id.title);
        this.f131435c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.cv_actualization.view.phone_select.ui.items.header.g
    public final void qg(@k JsxCvActualizationPhoneSelectHeaderItem jsxCvActualizationPhoneSelectHeaderItem) {
        TextView textView = this.f131434b;
        I5.a(textView, jsxCvActualizationPhoneSelectHeaderItem.f131426b.k0(textView.getContext()), false);
        I5.a(this.f131435c, jsxCvActualizationPhoneSelectHeaderItem.f131427c.k0(textView.getContext()), false);
    }
}
