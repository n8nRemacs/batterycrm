package com.avito.android.remote.error;

import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ApiErrors.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_network-typed-result_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class j {
    public static ApiError.UnknownError a(int i12, String str, Throwable th2) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            th2 = null;
        }
        return new ApiError.UnknownError(str, "", th2);
    }

    public static ApiError.IncorrectData b() {
        return new ApiError.IncorrectData(P0.c());
    }

    public static ApiError.Unauthorized c() {
        return new ApiError.Unauthorized("unauthorized");
    }

    public static ApiError.UnknownError d(int i12, String str) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        return new ApiError.UnknownError(str, "", null);
    }
}
