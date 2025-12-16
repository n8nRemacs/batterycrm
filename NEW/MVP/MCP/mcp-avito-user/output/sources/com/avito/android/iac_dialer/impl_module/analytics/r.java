package com.avito.android.iac_dialer.impl_module.analytics;

import android.app.Application;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: TabletDetector.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/r;", "Lcom/avito/android/iac_dialer/impl_module/analytics/q;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f165699a;

    @Inject
    public r(@Y61.k Application application) {
        this.f165699a = application;
    }

    @Override // com.avito.android.iac_dialer.impl_module.analytics.q
    public final boolean c() {
        return this.f165699a.getResources().getBoolean(R.bool.is_tablet);
    }
}
