package com.avito.android.authorization.select_profile.social_login;

import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.event.AuthWarningPhoneInOtherAccEvent;
import kotlin.Metadata;

/* compiled from: SocialRegistrationSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f94391b;

    public h(j jVar) {
        this.f94391b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        j jVar = this.f94391b;
        SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = jVar.f94394b;
        if (socialRegistrationSuggestsParams.f92753e == null) {
            jVar.e();
            return;
        }
        jVar.f94400h.c(new AuthWarningPhoneInOtherAccEvent(AuthWarningPhoneInOtherAccEvent.Source.f93834d));
        jVar.g(socialRegistrationSuggestsParams.f92753e, new k(jVar));
    }
}
