package com.avito.android.user_address;

import Y61.k;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: GeoSessionProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/b;", "Lcom/avito/android/user_address/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f307189a;

    @Inject
    public b(@k @Named("geo_session_id") String str) {
        this.f307189a = str;
    }

    @Override // com.avito.android.user_address.a
    @k
    /* renamed from: getId, reason: from getter */
    public final String getF307189a() {
        return this.f307189a;
    }
}
