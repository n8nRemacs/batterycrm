package com.avito.android.util;

import com.avito.android.remote.error.ApiError;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Throwables.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_network-typed-result_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class K5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(@Y61.l Throwable th2) {
        for (Throwable cause = th2; cause != 0; cause = cause.getCause()) {
            if (!(cause instanceof UnauthorizedException)) {
                if (cause instanceof ApiException) {
                    return ((ApiException) cause).f318522b instanceof ApiError.Unauthorized;
                }
                if (cause instanceof com.avito.android.remote.error.n) {
                    if (((com.avito.android.remote.error.n) cause).getF318611d().getCode() != 401) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(@Y61.l Throwable th2) {
        for (Throwable cause = th2; cause != 0; cause = cause.getCause()) {
            if (!(cause instanceof BadRequestException)) {
                if (cause instanceof ApiException) {
                    return ((ApiException) cause).f318522b instanceof ApiError.BadRequest;
                }
                if (cause instanceof com.avito.android.remote.error.n) {
                    if (((com.avito.android.remote.error.n) cause).getF318611d().getCode() != 400) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean c(@Y61.l Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof CertificatePinningException) {
                return true;
            }
            if (th2 instanceof ApiException) {
                return ((ApiException) th2).f318522b instanceof ApiError.CertificatePinningError;
            }
            if (th2 instanceof NetworkException) {
                return th2.getCause() instanceof CertificatePinningException;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean d(@Y61.l Throwable th2) {
        for (Throwable cause = th2; cause != 0; cause = cause.getCause()) {
            if (!(cause instanceof ForbiddenException)) {
                if (cause instanceof ApiException) {
                    return ((ApiException) cause).f318522b instanceof ApiError.Forbidden;
                }
                if (cause instanceof com.avito.android.remote.error.n) {
                    if (((com.avito.android.remote.error.n) cause).getF318611d().getCode() != 403) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(@Y61.l Throwable th2) {
        while (th2 != null) {
            if ((th2 instanceof IOException) || (th2 instanceof InterruptedException) || (th2 instanceof NetworkException)) {
                return true;
            }
            if (th2 instanceof ApiException) {
                return ((ApiException) th2).f318522b instanceof ApiError.NetworkIOError;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f(@Y61.l Throwable th2) {
        for (Throwable cause = th2; cause != 0; cause = cause.getCause()) {
            if (!(cause instanceof NotFoundException)) {
                if (cause instanceof ApiException) {
                    return ((ApiException) cause).f318522b instanceof ApiError.NotFound;
                }
                if (cause instanceof com.avito.android.remote.error.n) {
                    if (((com.avito.android.remote.error.n) cause).getF318611d().getCode() != 404) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
