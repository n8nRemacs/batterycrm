package com.avito.android.authorization.select_profile.social_login;

import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: SocialRegistrationSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/d;", "", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/d$a;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    void a(@Y61.k SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment);

    void b(@Y61.k Profile profile, @Y61.k Session session);

    void c(@Y61.k p pVar);

    void c0();

    @Y61.k
    Kundle d0();

    void e0();
}
