package com.avito.android.profile_settings;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ProfileSettingsResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileSettingsIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/c;", "Lcom/avito/android/profile_settings/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f228385a;

    @Inject
    public c(@Y61.k Application application) {
        this.f228385a = application;
    }

    @Override // com.avito.android.profile_settings.b
    @Y61.k
    public final Intent a() {
        return a.a(this.f228385a, ProfileSettingsResult.Tab.Type.BASIC.getShortcut(), null, null, 16);
    }

    @Override // com.avito.android.profile_settings.b
    @Y61.k
    public final Intent b(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        return a.a(this.f228385a, str, str2, str3, 8);
    }

    @Override // com.avito.android.profile_settings.b
    @Y61.k
    public final Intent c() {
        return a.a(this.f228385a, ProfileSettingsResult.Tab.Type.EXTENDED.getShortcut(), null, null, 24);
    }
}
