package com.avito.android.cv_actualization.view.phone_select.ui.items.error;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPhoneSelectErrorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/error/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cv_actualization/view/phone_select/ui/items/error/g;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f131424b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f131425c;

    public h(@k View view) {
        super(view);
        this.f131424b = (ImageView) view.findViewById(R.id.error_icon);
        this.f131425c = (TextView) view.findViewById(R.id.error_title);
    }

    @Override // com.avito.android.cv_actualization.view.phone_select.ui.items.error.g
    public final void F00(@k JsxCvActualizationPhoneSelectErrorItem jsxCvActualizationPhoneSelectErrorItem) {
        TextView textView = this.f131425c;
        I5.a(textView, jsxCvActualizationPhoneSelectErrorItem.f131417c.k0(textView.getContext()), false);
        ImageView imageView = this.f131424b;
        imageView.setImageResource(C35835l0.j(jsxCvActualizationPhoneSelectErrorItem.f131416b, imageView.getContext()));
    }
}
