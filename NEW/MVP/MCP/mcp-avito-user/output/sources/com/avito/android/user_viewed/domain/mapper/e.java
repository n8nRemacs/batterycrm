package com.avito.android.user_viewed.domain.mapper;

import com.avito.android.user_viewed.domain.model.UserViewedButton;
import jK0.C42273c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserViewedButtonMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/domain/mapper/e;", "Lcom/avito/android/user_viewed/domain/mapper/d;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.user_viewed.domain.mapper.d
    @Y61.k
    public final UserViewedButton a(@Y61.k C42273c c42273c) {
        return new UserViewedButton(c42273c.getTitle(), c42273c.getDeeplink(), c42273c.getStyle(), c42273c.getType());
    }
}
