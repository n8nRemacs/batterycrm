package io.ktor.http.auth;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeaderValueEncoding.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/auth/HeaderValueEncoding;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HeaderValueEncoding {

    /* renamed from: b, reason: collision with root package name */
    public static final HeaderValueEncoding f399924b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ HeaderValueEncoding[] f399925c;

    static {
        HeaderValueEncoding headerValueEncoding = new HeaderValueEncoding("QUOTED_WHEN_REQUIRED", 0);
        f399924b = headerValueEncoding;
        f399925c = new HeaderValueEncoding[]{headerValueEncoding, new HeaderValueEncoding("QUOTED_ALWAYS", 1), new HeaderValueEncoding("URI_ENCODE", 2)};
    }

    public HeaderValueEncoding() {
        throw null;
    }

    public static HeaderValueEncoding valueOf(String str) {
        return (HeaderValueEncoding) Enum.valueOf(HeaderValueEncoding.class, str);
    }

    public static HeaderValueEncoding[] values() {
        return (HeaderValueEncoding[]) f399925c.clone();
    }
}
