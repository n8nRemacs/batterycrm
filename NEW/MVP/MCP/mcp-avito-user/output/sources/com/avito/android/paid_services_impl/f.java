package com.avito.android.paid_services_impl;

import android.content.Context;
import android.content.Intent;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PaidServicesIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paid_services_impl/f;", "Lv50/c;", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements v50.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f210648a;

    @Inject
    public f(@Y61.k Context context) {
        this.f210648a = context;
    }

    @Override // v50.c
    @Y61.k
    public final Intent a(@Y61.k DeepLink deepLink) {
        return new Intent(this.f210648a, (Class<?>) PaidServicesActivity.class).putExtra(Constants.DEEPLINK, deepLink);
    }
}
