package com.vk.api.sdk.internal;

import android.util.SparseArray;
import com.adjust.sdk.Constants;
import com.facebook.imageutils.JfifUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import okhttp3.internal.http.StatusLine;

/* compiled from: HttpStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/internal/d;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d {
    static {
        new d();
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(100, "Continue");
        sparseArray.put(UpdateStatusCode.DialogButton.CONFIRM, "Switching Protocols");
        sparseArray.put(102, "Processing");
        sparseArray.put(103, "Checkpoint");
        sparseArray.put(200, "OK");
        sparseArray.put(201, "Created");
        sparseArray.put(202, "Accepted");
        sparseArray.put(203, "Non-Authoritative Information");
        sparseArray.put(204, "No Content");
        sparseArray.put(205, "Reset Content");
        sparseArray.put(206, "Partial Content");
        sparseArray.put(207, "Multi-Status");
        sparseArray.put(JfifUtil.MARKER_RST0, "Already Reported");
        sparseArray.put(226, "IM Used");
        sparseArray.put(300, "Multiple Choices");
        sparseArray.put(301, "Moved Permanently");
        sparseArray.put(302, "Found");
        sparseArray.put(303, "See Other");
        sparseArray.put(304, "Not Modified");
        sparseArray.put(305, "Use Proxy");
        sparseArray.put(StatusLine.HTTP_TEMP_REDIRECT, "Temporary Redirect");
        sparseArray.put(StatusLine.HTTP_PERM_REDIRECT, "Permanent Redirect");
        sparseArray.put(Constants.MINIMAL_ERROR_STATUS_CODE, "Bad Request");
        sparseArray.put(401, "Unauthorized");
        sparseArray.put(402, "Payment Required");
        sparseArray.put(403, "Forbidden");
        sparseArray.put(404, "Not Found");
        sparseArray.put(405, "Method Not Allowed");
        sparseArray.put(406, "Not Acceptable");
        sparseArray.put(407, "Proxy Authentication Required");
        sparseArray.put(408, "Request Timeout");
        sparseArray.put(409, "Conflict");
        sparseArray.put(410, "Gone");
        sparseArray.put(411, "Length Required");
        sparseArray.put(412, "Precondition Failed");
        sparseArray.put(413, "Payload Too Large");
        sparseArray.put(414, "URI Too Long");
        sparseArray.put(415, "Unsupported Media Type");
        sparseArray.put(416, "Requested range not satisfiable");
        sparseArray.put(417, "Expectation Failed");
        sparseArray.put(418, "I'm a teapot");
        sparseArray.put(419, "Insufficient Space On Resource");
        sparseArray.put(420, "Method Failure");
        sparseArray.put(StatusLine.HTTP_MISDIRECTED_REQUEST, "Destination Locked");
        sparseArray.put(422, "Unprocessable Entity");
        sparseArray.put(423, "Locked");
        sparseArray.put(424, "Failed Dependency");
        sparseArray.put(426, "Upgrade Required");
        sparseArray.put(428, "Precondition Required");
        sparseArray.put(429, "Too Many Requests");
        sparseArray.put(431, "Request Header Fields Too Large");
        sparseArray.put(500, "Internal Server Error");
        sparseArray.put(501, "Not Implemented");
        sparseArray.put(502, "Bad Gateway");
        sparseArray.put(503, "Service Unavailable");
        sparseArray.put(504, "Gateway Timeout");
        sparseArray.put(505, "HTTP Version not supported");
        sparseArray.put(506, "Variant Also Negotiates");
        sparseArray.put(507, "Insufficient Storage");
        sparseArray.put(508, "Loop Detected");
        sparseArray.put(509, "Bandwidth Limit Exceeded");
        sparseArray.put(510, "Not Extended");
        sparseArray.put(511, "Network Authentication Required");
    }
}
