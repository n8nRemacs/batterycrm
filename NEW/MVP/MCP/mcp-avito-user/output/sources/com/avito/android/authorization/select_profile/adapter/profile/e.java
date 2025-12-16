package com.avito.android.authorization.select_profile.adapter.profile;

import Y61.k;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.remote.model.registration.RegisteredProfile;
import kotlin.Metadata;

/* compiled from: ProfileItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/profile/e;", "Lcom/avito/android/authorization/select_profile/adapter/profile/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f94273b;

    public e(@k com.jakewharton.rxrelay3.c cVar) {
        this.f94273b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        SelectProfileField.Profile profile = (SelectProfileField.Profile) aVar;
        RegisteredProfile registeredProfile = profile.f94260c;
        fVar.setTitle(registeredProfile.getName());
        String description = registeredProfile.getDescription();
        if (description == null) {
            description = registeredProfile.getLogin();
        }
        fVar.f(description);
        fVar.h1(registeredProfile.getAvatar());
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.d(new c(fVar, cVar));
        fVar.Pv();
        cVar.b(fVar.A().t0(new d(this, profile)));
    }
}
