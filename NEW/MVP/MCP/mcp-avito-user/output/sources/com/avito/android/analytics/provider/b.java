package com.avito.android.analytics.provider;

import Y61.k;
import Y61.l;
import com.avito.android.account.G;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CurrentUserIdProviderImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/b;", "Lcom/avito/android/analytics/provider/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final G f90246a;

    @Inject
    public b(@k G g12) {
        this.f90246a = g12;
    }

    @Override // com.avito.android.analytics.provider.a
    @l
    public final String a() {
        return this.f90246a.a();
    }
}
