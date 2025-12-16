package com.avito.android.passport.profile_add;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportAddProfileIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/c;", "Lcom/avito/android/passport/profile_add/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f211221a;

    @Inject
    public c(@Y61.k Context context) {
        this.f211221a = context;
    }

    @Override // com.avito.android.passport.profile_add.b
    @Y61.k
    public final Intent a(@Y61.l Navigation navigation2, @Y61.l AnalyticScreen analyticScreen) {
        PassportAddProfileActivity.f211167n.getClass();
        Intent intentPutExtra = new Intent(this.f211221a, (Class<?>) PassportAddProfileActivity.class).putExtra("passport.add_profile.navigation_arg", navigation2);
        if (analyticScreen == null) {
            analyticScreen = null;
        }
        Intent intentPutExtra2 = intentPutExtra.putExtra("passport.add_profile.first_screen_arg", (Parcelable) analyticScreen);
        intentPutExtra2.setFlags(603979776);
        return intentPutExtra2;
    }
}
