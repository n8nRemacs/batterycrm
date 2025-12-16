package com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: LandingFeatureItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/items/landing_feature/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/items/landing_feature/g;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f299703b;

    public h(@k View view) {
        super(view);
        this.f299703b = (TextView) view.findViewById(R.id.title);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.g
    public final void setTitle(@k String str) {
        this.f299703b.setText(str);
    }
}
