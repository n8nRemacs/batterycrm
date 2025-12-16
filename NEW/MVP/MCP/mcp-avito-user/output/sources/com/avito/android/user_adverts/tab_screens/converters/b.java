package com.avito.android.user_adverts.tab_screens.converters;

import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.DisclaimerItemDomain;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DisclaimerConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/b;", "Lcom/avito/android/user_adverts/tab_screens/converters/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.user_adverts.tab_screens.converters.a
    @Y61.k
    public final com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.b a(@Y61.k DisclaimerItemDomain disclaimerItemDomain) {
        return new com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.b(disclaimerItemDomain.f315014b, null, 2, null);
    }
}
