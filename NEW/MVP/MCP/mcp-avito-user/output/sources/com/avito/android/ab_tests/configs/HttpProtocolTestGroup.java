package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpProtocolTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/HttpProtocolTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HttpProtocolTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final HttpProtocolTestGroup f67825c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ HttpProtocolTestGroup[] f67826d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f67827e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67828b;

    /* compiled from: HttpProtocolTestGroup.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[HttpProtocolTestGroup.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HttpProtocolTestGroup httpProtocolTestGroup = HttpProtocolTestGroup.f67825c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HttpProtocolTestGroup httpProtocolTestGroup2 = HttpProtocolTestGroup.f67825c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                HttpProtocolTestGroup httpProtocolTestGroup3 = HttpProtocolTestGroup.f67825c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        HttpProtocolTestGroup httpProtocolTestGroup = new HttpProtocolTestGroup("NONE", 0, "");
        f67825c = httpProtocolTestGroup;
        HttpProtocolTestGroup[] httpProtocolTestGroupArr = {httpProtocolTestGroup, new HttpProtocolTestGroup("CONTROL", 1, "control"), new HttpProtocolTestGroup("HTTP1", 2, "http1"), new HttpProtocolTestGroup("HTTP1_AND_HTTP2", 3, "http1_and_http2")};
        f67826d = httpProtocolTestGroupArr;
        f67827e = c.a(httpProtocolTestGroupArr);
    }

    public HttpProtocolTestGroup(String str, int i12, String str2) {
        this.f67828b = str2;
    }

    public static HttpProtocolTestGroup valueOf(String str) {
        return (HttpProtocolTestGroup) Enum.valueOf(HttpProtocolTestGroup.class, str);
    }

    public static HttpProtocolTestGroup[] values() {
        return (HttpProtocolTestGroup[]) f67826d.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67834b() {
        return this.f67828b;
    }
}
