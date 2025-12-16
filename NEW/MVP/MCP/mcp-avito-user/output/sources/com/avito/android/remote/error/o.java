package com.avito.android.remote.error;

import com.adjust.sdk.Constants;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.error.Status;
import com.facebook.imageutils.JfifUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.http.StatusLine;

/* compiled from: HttpStatusErrorsFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/o;", "", "<init>", "()V", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o f253437a = new o();

    @Y61.k
    public static String a(int i12) {
        return b(i12) + " (" + i12 + ')';
    }

    @Y61.k
    public static String b(int i12) {
        if (i12 == 226) {
            return "im used";
        }
        if (i12 == 307) {
            return "temporary redirect";
        }
        if (i12 == 426) {
            return "upgrade required";
        }
        if (i12 == 429) {
            Status.c cVar = Status.f253396c;
            return "too-many-requests";
        }
        if (i12 == 510) {
            return "not extended";
        }
        switch (i12) {
            case 100:
                return "continue";
            case UpdateStatusCode.DialogButton.CONFIRM /* 101 */:
                return "switching protocols";
            case 102:
                return "processing";
            default:
                switch (i12) {
                    case 200:
                        Status.c cVar2 = Status.f253396c;
                        return "ok";
                    case 201:
                        return "created";
                    case 202:
                        return "accepted";
                    case 203:
                        return "non-authoritative information";
                    case 204:
                        return "no content";
                    case 205:
                        return "reset content";
                    case 206:
                        return "partial content";
                    case 207:
                        return "multi-status";
                    case JfifUtil.MARKER_RST0 /* 208 */:
                        return "already reported";
                    default:
                        switch (i12) {
                            case 300:
                                return "multiple choices";
                            case 301:
                                return "moved permanently";
                            case 302:
                                return "found";
                            case 303:
                                return "see other";
                            case 304:
                                return "not modified";
                            case 305:
                                return "use proxy";
                            default:
                                switch (i12) {
                                    case Constants.MINIMAL_ERROR_STATUS_CODE /* 400 */:
                                        Status.c cVar3 = Status.f253396c;
                                        return "bad-request";
                                    case 401:
                                        Status.c cVar4 = Status.f253396c;
                                        return "unauthorized";
                                    case 402:
                                        return "payment required";
                                    case 403:
                                        Status.c cVar5 = Status.f253396c;
                                        return "forbidden";
                                    case 404:
                                        Status.c cVar6 = Status.f253396c;
                                        return "not-found";
                                    case 405:
                                        return "method not allowed";
                                    case 406:
                                        return "not acceptable";
                                    case 407:
                                        return "proxy authentication required";
                                    case 408:
                                        return "request timeout";
                                    case 409:
                                        Status.c cVar7 = Status.f253396c;
                                        return "conflict";
                                    case 410:
                                        return "gone";
                                    case 411:
                                        return "length required";
                                    case 412:
                                        return "precondition failed";
                                    case 413:
                                        return "request entity too large";
                                    case 414:
                                        return "request-uri too long";
                                    case 415:
                                        return "unsupported media type";
                                    case 416:
                                        return "requested range not satisfiable";
                                    case 417:
                                        return "expectation failed";
                                    default:
                                        switch (i12) {
                                            case 419:
                                                return "insufficient space on resource";
                                            case 420:
                                                return "method failure";
                                            case StatusLine.HTTP_MISDIRECTED_REQUEST /* 421 */:
                                                return "destination locked";
                                            case 422:
                                                return "unprocessable entity";
                                            case 423:
                                                return "locked";
                                            case 424:
                                                return "failed dependency";
                                            default:
                                                switch (i12) {
                                                    case 500:
                                                        Status.c cVar8 = Status.f253396c;
                                                        return "internal-error";
                                                    case 501:
                                                        return "not implemented";
                                                    case 502:
                                                        return "bad gateway";
                                                    case 503:
                                                        return "service unavailable";
                                                    case 504:
                                                        return "gateway timeout";
                                                    case 505:
                                                        return "http version not supported";
                                                    case 506:
                                                        return "variant also negotiates";
                                                    case 507:
                                                        return "insufficient storage";
                                                    case 508:
                                                        return "loop detected";
                                                    default:
                                                        return "<unsupported>";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Y61.l
    public static String c(@Y61.k ApiError apiError) {
        if (apiError instanceof ApiError.BadRequest) {
            Status.c cVar = Status.f253396c;
            return "bad-request (400)";
        }
        if (apiError instanceof ApiError.Unauthorized) {
            Status.c cVar2 = Status.f253396c;
            return "unauthorized (401)";
        }
        if (apiError instanceof ApiError.Forbidden) {
            Status.c cVar3 = Status.f253396c;
            return "forbidden (403)";
        }
        if (apiError instanceof ApiError.NotFound) {
            Status.c cVar4 = Status.f253396c;
            return "not-found (404)";
        }
        if (apiError instanceof ApiError.InternalError) {
            Status.c cVar5 = Status.f253396c;
            return "internal-error (500)";
        }
        if (apiError instanceof ApiError.HttpError) {
            return "HttpError (" + ((ApiError.HttpError) apiError).f253392b.getCode() + ')';
        }
        if (apiError instanceof ApiError.Failure) {
            Status.c cVar6 = Status.f253396c;
            return "failure";
        }
        if (apiError instanceof ApiError.ErrorDialog) {
            Status.c cVar7 = Status.f253396c;
            return "error-dialog";
        }
        if (apiError instanceof ApiError.IncorrectData) {
            Status.c cVar8 = Status.f253396c;
            return "incorrect-data";
        }
        if (apiError instanceof ApiError.ErrorAction) {
            Status.c cVar9 = Status.f253396c;
            return "action";
        }
        if (apiError instanceof ApiError.CertificatePinningError) {
            return "certificate pinning";
        }
        if (apiError instanceof ApiError.NetworkIOError) {
            return "network io";
        }
        if (apiError instanceof ApiError.PretendError) {
            return "pretend error";
        }
        if (apiError instanceof ApiError.Custom) {
            return "custom";
        }
        if (apiError instanceof ApiError.UnknownError) {
            return null;
        }
        if (!(apiError instanceof ApiError.TooManyRequests)) {
            throw new NoWhenBranchMatchedException();
        }
        Status.c cVar10 = Status.f253396c;
        return "too-many-requests (429)";
    }
}
