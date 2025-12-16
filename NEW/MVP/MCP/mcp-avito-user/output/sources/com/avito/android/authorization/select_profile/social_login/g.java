package com.avito.android.authorization.select_profile.social_login;

import androidx.fragment.app.ActivityC22955m;
import kotlin.Metadata;

/* compiled from: SocialRegistrationSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f94390b;

    public g(j jVar) {
        this.f94390b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ActivityC22955m activityC22955mL1;
        SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment = this.f94390b.f94405m;
        if (socialRegistrationSuggestsFragment == null || (activityC22955mL1 = socialRegistrationSuggestsFragment.l1()) == null) {
            return;
        }
        activityC22955mL1.finish();
    }
}
