package com.avito.android.passport.profile_add.create_flow.select_vertical;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: SelectVerticalInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/l;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/i;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.data.mapper.d f211922a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.domain.interactor.a f211923b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.domain.interactor.m f211924c;

    @Inject
    public l(@Y61.k com.avito.android.passport.profile_add.data.mapper.d dVar, @Y61.k com.avito.android.passport.profile_add.domain.interactor.a aVar, @Y61.k com.avito.android.passport.profile_add.domain.interactor.m mVar) {
        this.f211922a = dVar;
        this.f211923b = aVar;
        this.f211924c = mVar;
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.i
    @Y61.k
    public final C43152f0 a() {
        return new C43152f0(C43175k.G(new j(this, null)), new k(3, null));
    }
}
