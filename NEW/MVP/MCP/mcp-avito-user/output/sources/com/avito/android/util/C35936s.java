package com.avito.android.util;

import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: ApiExceptions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_network-typed-result_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35936s {
    @Y61.k
    public static final ApiException a(@Y61.k ApiError apiError, @Y61.l Throwable th2) {
        if (apiError instanceof ApiError.NetworkIOError) {
            return new NetworkException(apiError, th2);
        }
        if (apiError instanceof ApiError.CertificatePinningError) {
            return new CertificatePinningException((ApiError.CertificatePinningError) apiError, th2);
        }
        if (apiError instanceof ApiError.Forbidden) {
            return new ForbiddenException((ApiError.Forbidden) apiError, th2);
        }
        if (apiError instanceof ApiError.BadRequest) {
            return new BadRequestException((ApiError.BadRequest) apiError, th2);
        }
        if (apiError instanceof ApiError.InternalError) {
            return new InternalErrorException((ApiError.InternalError) apiError, th2);
        }
        if (apiError instanceof ApiError.NotFound) {
            return new NotFoundException((ApiError.NotFound) apiError, th2);
        }
        if (apiError instanceof ApiError.Unauthorized) {
            return new UnauthorizedException((ApiError.Unauthorized) apiError, th2);
        }
        if (!(apiError instanceof ApiError.UnknownError)) {
            return new ApiException(apiError, th2);
        }
        Throwable th3 = ((ApiError.UnknownError) apiError).f253395c;
        if (th3 != null) {
            th2 = th3;
        }
        return new ApiException(apiError, th2);
    }
}
