package com.avito.android.safety.sessions;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import com.avito.android.safety.sessions.info.SessionsInfoActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/h;", "Lcom/avito/android/safety/sessions/g;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f257941a;

    @Inject
    public h(@Y61.k Application application) {
        this.f257941a = application;
    }

    @Override // com.avito.android.safety.sessions.g
    @Y61.k
    public final Intent a(@Y61.k SessionsInfoLink.SessionsInfoParams sessionsInfoParams) {
        Intent intent = new Intent(this.f257941a, (Class<?>) SessionsInfoActivity.class);
        intent.putExtra("params", sessionsInfoParams);
        return intent;
    }
}
