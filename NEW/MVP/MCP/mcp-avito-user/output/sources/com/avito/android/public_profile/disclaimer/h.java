package com.avito.android.public_profile.disclaimer;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: PublicProfileDisclaimerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/public_profile/disclaimer/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/public_profile/disclaimer/g;", "_avito_public-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f231822b;

    public h(@k View view, int i12) {
        super(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart(i12);
        marginLayoutParams.setMarginEnd(i12);
        view.requestLayout();
        this.f231822b = (TextView) view;
    }

    @Override // com.avito.android.public_profile.disclaimer.g
    public final void E7(@k String str) {
        I5.a(this.f231822b, str, false);
    }
}
