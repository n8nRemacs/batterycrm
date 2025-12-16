package com.avito.android.user_address.list.domain;

import Y61.k;
import com.avito.android.user_address.UserAddressActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: UserAddressGetListUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/domain/c;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.geo_common.interactor.g f307353a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.a f307354b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List f307355c;

    @Inject
    public c(@k com.avito.android.geo_common.interactor.g gVar, @k com.avito.android.user_address.a aVar, @k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List list) {
        this.f307353a = gVar;
        this.f307354b = aVar;
        this.f307355c = list;
    }

    @k
    public final C43152f0 a(boolean z12) {
        return new C43152f0(C43175k.G(new a(this, z12, null)), new b(3, null));
    }
}
