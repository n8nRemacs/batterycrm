package com.avito.android.util;

import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.ProfileInfo;
import kotlin.Metadata;

/* compiled from: Profiles.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-api_profile"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.e4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35783e4 {
    @Y61.k
    public static final ProfileInfo a(@Y61.k Profile profile) {
        return new ProfileInfo(profile.getUserId(), profile.getUserHashId(), profile.getName(), profile.getEmail());
    }
}
