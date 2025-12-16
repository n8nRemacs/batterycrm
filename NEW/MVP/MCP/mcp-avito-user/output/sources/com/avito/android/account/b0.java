package com.avito.android.account;

import com.avito.android.remote.model.ProfileInfo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileMerger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/account/b0;", "Lcom/avito/android/account/a0;", "<init>", "()V", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b0 implements a0 {
    @Inject
    public b0() {
    }

    @Override // com.avito.android.account.a0
    @Y61.k
    public final ProfileInfo a(@Y61.k ProfileInfo profileInfo, @Y61.k ProfileInfo profileInfo2) {
        if (profileInfo.getUserId() == null || !kotlin.jvm.internal.L.f(profileInfo.getUserId(), profileInfo2.getUserId())) {
            return profileInfo;
        }
        String userHashId = profileInfo.getUserHashId();
        if (userHashId == null) {
            userHashId = profileInfo2.getUserHashId();
        }
        String str = userHashId;
        String name = profileInfo.getName();
        if (name == null) {
            name = profileInfo2.getName();
        }
        String str2 = name;
        String email = profileInfo.getEmail();
        return ProfileInfo.copy$default(profileInfo, null, str, str2, email == null ? profileInfo2.getEmail() : email, 1, null);
    }
}
