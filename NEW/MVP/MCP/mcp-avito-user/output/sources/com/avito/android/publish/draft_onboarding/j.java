package com.avito.android.publish.draft_onboarding;

import AK0.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PrefDraftOnboardingSessionStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/draft_onboarding/j;", "Lcom/avito/android/publish/draft_onboarding/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f235313a;

    @Inject
    public j(@Y61.k l lVar) {
        this.f235313a = lVar;
    }

    @Override // com.avito.android.publish.draft_onboarding.i
    public final boolean a() {
        return this.f235313a.getF316a().getBoolean("remote_drafts_onboarding_was_shown", false);
    }

    @Override // com.avito.android.publish.draft_onboarding.i
    public final void b() {
        this.f235313a.getF316a().edit().putBoolean("remote_drafts_onboarding_was_shown", true).apply();
    }
}
