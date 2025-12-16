package com.avito.android.safety.sessions.social_logout;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsSocialLogoutResourcesProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/social_logout/t;", "Lcom/avito/android/safety/sessions/social_logout/s;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f258061a;

    @Inject
    public t(@Y61.k Resources resources) {
        this.f258061a = resources.getString(R.string.sessions_social_logout_error_text_snackbar);
    }

    @Override // com.avito.android.safety.sessions.social_logout.s
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF258061a() {
        return this.f258061a;
    }
}
