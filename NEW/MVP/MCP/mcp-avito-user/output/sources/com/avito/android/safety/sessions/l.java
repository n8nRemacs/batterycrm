package com.avito.android.safety.sessions;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.safety.sessions.social_logout.SessionsSocialLogoutActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/l;", "Lcom/avito/android/safety/sessions/k;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f257992a;

    @Inject
    public l(@Y61.k Application application) {
        this.f257992a = application;
    }

    @Override // com.avito.android.safety.sessions.k
    @Y61.k
    public final Intent a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5) {
        Intent intent = new Intent(this.f257992a, (Class<?>) SessionsSocialLogoutActivity.class);
        intent.putExtra(SearchParamsConverterKt.SOURCE, str);
        intent.putExtra("user_id", str2);
        intent.putExtra("login_type", str3);
        intent.putExtra("session_id_hash", str4);
        intent.putExtra("device_id", str5);
        intent.putExtra("is_from_safety_screen_param", z12);
        return intent;
    }
}
