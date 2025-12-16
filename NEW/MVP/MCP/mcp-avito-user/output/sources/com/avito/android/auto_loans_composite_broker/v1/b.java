package com.avito.android.auto_loans_composite_broker.v1;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCompositeBrokerResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/b;", "Lcom/avito/android/auto_loans_composite_broker/v1/a;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f95537a;

    @Inject
    public b(@Y61.k Resources resources) {
        this.f95537a = resources;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.a
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f95537a.getString(R.string.composite_broker_credit_top_limit, str);
    }
}
