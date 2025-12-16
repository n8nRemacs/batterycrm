package com.avito.android.advert.item.privacyDisclaimer;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPrivacyDisclaimerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/privacyDisclaimer/h;", "Lcom/avito/android/advert/item/privacyDisclaimer/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f78251b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f78252c;

    public h(@k View view) {
        super(view);
        this.f78251b = view;
        this.f78252c = (TextView) view.findViewById(R.id.privacy_disclaimer);
    }

    @Override // com.avito.android.advert.item.privacyDisclaimer.g
    public final void mJ(@k String str) {
        this.f78252c.setText(str);
    }
}
