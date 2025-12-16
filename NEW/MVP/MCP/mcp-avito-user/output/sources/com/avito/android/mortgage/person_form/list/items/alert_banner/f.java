package com.avito.android.mortgage.person_form.list.items.alert_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AlertBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/alert_banner/f;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/alert_banner/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends C00.a implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f200591b;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.alert);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200591b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.alert_banner.e
    public final void sL(@k AttributedText attributedText) {
        j.c(this.f200591b, attributedText, null);
    }
}
