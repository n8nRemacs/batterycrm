package com.avito.android.user_viewed.domain.mapper;

import com.avito.android.remote.model.GeoReference;
import jK0.C42276f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserViewedGeoReferenceMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/domain/mapper/k;", "Lcom/avito/android/user_viewed/domain/mapper/j;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements j {
    @Inject
    public k() {
    }

    @Override // com.avito.android.user_viewed.domain.mapper.j
    @Y61.k
    public final GeoReference a(@Y61.k C42276f c42276f) {
        return new GeoReference(null, c42276f.getContent(), null, null, null, 24, null);
    }
}
