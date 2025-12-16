package com.avito.android.authorization.select_profile.social_login;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: SocialRegistrationSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f94420b;

    public l(j jVar) {
        this.f94420b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = (DeepLink) obj;
        SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment = this.f94420b.f94405m;
        if (socialRegistrationSuggestsFragment != null) {
            socialRegistrationSuggestsFragment.q5(deepLink);
        }
    }
}
