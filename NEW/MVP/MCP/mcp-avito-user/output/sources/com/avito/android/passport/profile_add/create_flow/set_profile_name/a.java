package com.avito.android.passport.profile_add.create_flow.set_profile_name;

import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ErrorClassifier.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_extended-profile-creation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {
    @Y61.k
    public static final String a(@Y61.k Throwable th2) {
        ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
        ApiError apiError = apiException != null ? apiException.f318522b : null;
        ApiError.IncorrectData incorrectData = apiError instanceof ApiError.IncorrectData ? (ApiError.IncorrectData) apiError : null;
        Map<String, String> mapC = incorrectData != null ? incorrectData.c() : null;
        if (mapC == null) {
            mapC = P0.c();
        }
        String str = mapC.get("name");
        return str == null ? "" : str;
    }

    public static final boolean b(@Y61.k Throwable th2) {
        ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
        ApiError apiError = apiException != null ? apiException.f318522b : null;
        ApiError.IncorrectData incorrectData = apiError instanceof ApiError.IncorrectData ? (ApiError.IncorrectData) apiError : null;
        Map<String, String> mapC = incorrectData != null ? incorrectData.c() : null;
        if (mapC == null) {
            mapC = P0.c();
        }
        return mapC.containsKey("name");
    }
}
