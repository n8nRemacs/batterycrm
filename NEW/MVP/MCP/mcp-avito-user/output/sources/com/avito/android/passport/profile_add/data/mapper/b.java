package com.avito.android.passport.profile_add.data.mapper;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SpecificMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/data/mapper/b;", "Lcom/avito/android/passport/profile_add/data/mapper/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.passport.profile_add.data.mapper.a
    @k
    public final X50.d a(@k uA.c cVar) {
        return new X50.d((int) cVar.getId(), cVar.getName(), cVar.getTitle());
    }
}
