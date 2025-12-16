package com.avito.android.extended_profile_selection_create;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSelectionCreateIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/a;", "LHA/a;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements HA.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f151625a;

    @Inject
    public a(@k Application application) {
        this.f151625a = application;
    }

    @Override // HA.a
    @k
    public final Intent a(@k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig) {
        ExtendedProfileSelectionCreateActivity.f151610m.getClass();
        Intent intentPutExtra = new Intent(this.f151625a, (Class<?>) ExtendedProfileSelectionCreateActivity.class).putExtra("extended_profile.selection.create_selection_args", extendedProfileSelectionCreateConfig).putExtra("extended_profile.selection.screen_name", "extended_profile.selection.create_screen");
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }
}
