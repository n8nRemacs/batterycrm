package io.ktor.http;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/CookieEncoding;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CookieEncoding {

    /* renamed from: b, reason: collision with root package name */
    public static final CookieEncoding f399849b;

    /* renamed from: c, reason: collision with root package name */
    public static final CookieEncoding f399850c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CookieEncoding[] f399851d;

    static {
        CookieEncoding cookieEncoding = new CookieEncoding("RAW", 0);
        f399849b = cookieEncoding;
        CookieEncoding cookieEncoding2 = new CookieEncoding("DQUOTES", 1);
        CookieEncoding cookieEncoding3 = new CookieEncoding("URI_ENCODING", 2);
        f399850c = cookieEncoding3;
        f399851d = new CookieEncoding[]{cookieEncoding, cookieEncoding2, cookieEncoding3, new CookieEncoding("BASE64_ENCODING", 3)};
    }

    public CookieEncoding() {
        throw null;
    }

    public static CookieEncoding valueOf(String str) {
        return (CookieEncoding) Enum.valueOf(CookieEncoding.class, str);
    }

    public static CookieEncoding[] values() {
        return (CookieEncoding[]) f399851d.clone();
    }
}
