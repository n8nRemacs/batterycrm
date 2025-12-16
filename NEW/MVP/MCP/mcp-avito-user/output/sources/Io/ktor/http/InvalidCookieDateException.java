package io.ktor.http;

import kotlin.Metadata;

/* compiled from: CookieUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/InvalidCookieDateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InvalidCookieDateException extends IllegalStateException {
    public InvalidCookieDateException(@Y61.k String str, @Y61.k String str2) {
        super("Failed to parse date string: \"" + str + "\". Reason: \"" + str2 + '\"');
    }
}
