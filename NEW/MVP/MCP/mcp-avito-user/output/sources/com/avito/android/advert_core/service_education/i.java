package com.avito.android.advert_core.service_education;

import android.view.View;
import com.avito.android.R;
import com.avito.android.ui.widget.WrapWidthTextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: AdvertServiceEducationItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/service_education/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/service_education/h;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WrapWidthTextView f84317b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WrapWidthTextView f84318c;

    public i(@Y61.k View view) {
        super(view);
        this.f84317b = (WrapWidthTextView) view.findViewById(R.id.advert_service_eduction_institution);
        this.f84318c = (WrapWidthTextView) view.findViewById(R.id.advert_service_eduction_speciality_year);
    }

    @Override // com.avito.android.advert_core.service_education.h
    public final void dZ(@Y61.l String str) {
        I5.a(this.f84318c, str, false);
    }

    @Override // com.avito.android.advert_core.service_education.h
    public final void yG(@Y61.l String str) {
        I5.a(this.f84317b, str, false);
    }
}
