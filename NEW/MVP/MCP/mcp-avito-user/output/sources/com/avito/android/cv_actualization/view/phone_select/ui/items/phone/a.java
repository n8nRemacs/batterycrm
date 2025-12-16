package com.avito.android.cv_actualization.view.phone_select.ui.items.phone;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPhoneSelectPhoneView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/phone/a;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cv_actualization/view/phone_select/ui/items/phone/i;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f131444c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f131445b;

    public a(@k View view) {
        super(view);
        this.f131445b = (TextView) view;
    }

    @Override // com.avito.android.cv_actualization.view.phone_select.ui.items.phone.i
    public final void WT(@k JsxCvActualizationPhoneSelectPhoneItem jsxCvActualizationPhoneSelectPhoneItem, @k l<? super String, G0> lVar) {
        String str = jsxCvActualizationPhoneSelectPhoneItem.f131442b;
        TextView textView = this.f131445b;
        I5.a(textView, str, false);
        textView.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(6, lVar, jsxCvActualizationPhoneSelectPhoneItem));
    }
}
