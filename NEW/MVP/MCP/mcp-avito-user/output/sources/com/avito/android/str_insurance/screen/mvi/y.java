package com.avito.android.str_insurance.screen.mvi;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrInsuranceResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/y;", "Lcom/avito/android/str_insurance/screen/mvi/x;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f288790a;

    @Inject
    public y(@Y61.k Resources resources) {
        this.f288790a = resources.getString(R.string.str_insurance_unknown_server_error);
    }

    @Override // com.avito.android.str_insurance.screen.mvi.x
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF288790a() {
        return this.f288790a;
    }
}
