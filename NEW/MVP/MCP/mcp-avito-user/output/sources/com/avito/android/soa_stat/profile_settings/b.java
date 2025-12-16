package com.avito.android.soa_stat.profile_settings;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SoaStatIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/b;", "Lcom/avito/android/soa_stat/profile_settings/a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f284075a;

    @Inject
    public b(@Y61.k Context context) {
        this.f284075a = context;
    }

    @Override // com.avito.android.soa_stat.profile_settings.a
    @Y61.k
    public final Intent a() {
        return new Intent(this.f284075a, (Class<?>) SoaStatProfileSettingsActivity.class);
    }
}
