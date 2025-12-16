package com.avito.android.user_address.map.view;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAddressMapResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/view/f;", "Lcom/avito/android/user_address/map/view/e;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f307959a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f307960b;

    @Inject
    public f(@Y61.k Resources resources) {
        this.f307959a = resources.getString(R.string.address_by_coords_error_text);
        this.f307960b = resources.getString(R.string.network_unavailable_message);
    }

    @Override // com.avito.android.user_address.map.view.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF307959a() {
        return this.f307959a;
    }

    @Override // com.avito.android.user_address.map.view.e
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF307960b() {
        return this.f307960b;
    }
}
