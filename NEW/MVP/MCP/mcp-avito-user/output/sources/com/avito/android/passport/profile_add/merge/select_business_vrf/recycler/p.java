package com.avito.android.passport.profile_add.merge.select_business_vrf.recycler;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportSelectBusinessItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/p;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements com.avito.android.recycler.data_aware.a {
    @Inject
    public p() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF113526b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF113526b()) : null) || !(aVar instanceof PassportSelectBusinessItem) || !(aVar2 instanceof PassportSelectBusinessItem)) {
            return null;
        }
        PassportSelectBusinessItem passportSelectBusinessItem = (PassportSelectBusinessItem) aVar2;
        return new o(passportSelectBusinessItem.f213500b, passportSelectBusinessItem.f213502d, passportSelectBusinessItem.f213503e);
    }
}
