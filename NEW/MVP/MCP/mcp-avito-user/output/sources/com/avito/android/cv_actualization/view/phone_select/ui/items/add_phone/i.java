package com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPhoneSelectAddPhoneView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/add_phone/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cv_actualization/view/phone_select/ui/items/add_phone/h;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f131414c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f131415b;

    public i(@k View view) {
        super(view);
        this.f131415b = (TextView) view;
    }

    @Override // com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone.h
    public final void ZY(@k JsxCvActualizationPhoneSelectAddPhoneItem jsxCvActualizationPhoneSelectAddPhoneItem, @k Y41.a<G0> aVar) {
        TextView textView = this.f131415b;
        I5.a(textView, jsxCvActualizationPhoneSelectAddPhoneItem.f131405b.k0(textView.getContext()), false);
        textView.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(2, aVar));
    }
}
