package com.avito.android.user_adverts_filters.host;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.host.d;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertsFiltersIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/e;", "Lcom/avito/android/user_adverts_filters/host/d;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f315963a;

    @Inject
    public e(@k Context context) {
        this.f315963a = context;
    }

    @Override // com.avito.android.user_adverts_filters.host.d
    @k
    public final Intent a(@k d.a aVar) {
        String str = aVar.f315959b;
        UserAdvertsFiltersData userAdvertsFiltersData = new UserAdvertsFiltersData(aVar.f315958a, null, str, 2, null);
        UserAdvertsFiltersData.a aVar2 = UserAdvertsFiltersData.f315950e;
        Intent intent = new Intent(this.f315963a, (Class<?>) UserAdvertsFiltersHostActivity.class);
        aVar2.getClass();
        return intent.putExtra("user_adverts_filters_host_extra_data", userAdvertsFiltersData);
    }

    @Override // com.avito.android.user_adverts_filters.host.d
    @k
    public final d.b b(int i12, @l Intent intent) {
        if (intent == null || i12 != -1) {
            return d.b.C9797b.f315962a;
        }
        UserAdvertsFiltersData.f315950e.getClass();
        UserAdvertsFiltersData userAdvertsFiltersDataA = UserAdvertsFiltersData.a.a(intent);
        return new d.b.a(userAdvertsFiltersDataA.f315951b, userAdvertsFiltersDataA.f315952c);
    }
}
