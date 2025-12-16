package com.avito.android.publish.draft_onboarding;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DraftOnboardingResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/draft_onboarding/f;", "Lcom/avito/android/publish/draft_onboarding/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f235310a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f235311b;

    @Inject
    public f(@Y61.k Resources resources) {
        this.f235310a = resources.getString(R.string.drafts_onboarding_title);
        this.f235311b = resources.getString(R.string.drafts_onboarding_text);
    }

    @Override // com.avito.android.publish.draft_onboarding.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF235311b() {
        return this.f235311b;
    }

    @Override // com.avito.android.publish.draft_onboarding.e
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF235310a() {
        return this.f235310a;
    }
}
