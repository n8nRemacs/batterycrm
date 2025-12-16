package io.ktor.http;

import com.adjust.sdk.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http.StatusLine;

/* compiled from: HttpStatusCode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/n0;", "", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C41535n0 implements Comparable<C41535n0> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f400082d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400083e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400084f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400085g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400086h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400087i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400088j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400089k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final C41535n0 f400090l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final List<C41535n0> f400091m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f400092n;

    /* renamed from: b, reason: collision with root package name */
    public final int f400093b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f400094c;

    /* compiled from: HttpStatusCode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/n0$a;", "", "<init>", "()V", "", "", "Lio/ktor/http/n0;", "statusCodesMap", "Ljava/util/Map;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C41535n0 c41535n0 = new C41535n0(100, "Continue");
        C41535n0 c41535n02 = new C41535n0(UpdateStatusCode.DialogButton.CONFIRM, "Switching Protocols");
        f400083e = c41535n02;
        C41535n0 c41535n03 = new C41535n0(102, "Processing");
        C41535n0 c41535n04 = new C41535n0(200, "OK");
        C41535n0 c41535n05 = new C41535n0(201, "Created");
        C41535n0 c41535n06 = new C41535n0(202, "Accepted");
        C41535n0 c41535n07 = new C41535n0(203, "Non-Authoritative Information");
        C41535n0 c41535n08 = new C41535n0(204, "No Content");
        C41535n0 c41535n09 = new C41535n0(205, "Reset Content");
        C41535n0 c41535n010 = new C41535n0(206, "Partial Content");
        C41535n0 c41535n011 = new C41535n0(207, "Multi-Status");
        C41535n0 c41535n012 = new C41535n0(300, "Multiple Choices");
        C41535n0 c41535n013 = new C41535n0(301, "Moved Permanently");
        f400084f = c41535n013;
        C41535n0 c41535n014 = new C41535n0(302, "Found");
        f400085g = c41535n014;
        C41535n0 c41535n015 = new C41535n0(303, "See Other");
        f400086h = c41535n015;
        C41535n0 c41535n016 = new C41535n0(304, "Not Modified");
        f400087i = c41535n016;
        C41535n0 c41535n017 = new C41535n0(305, "Use Proxy");
        C41535n0 c41535n018 = new C41535n0(306, "Switch Proxy");
        C41535n0 c41535n019 = new C41535n0(StatusLine.HTTP_TEMP_REDIRECT, "Temporary Redirect");
        f400088j = c41535n019;
        C41535n0 c41535n020 = new C41535n0(StatusLine.HTTP_PERM_REDIRECT, "Permanent Redirect");
        f400089k = c41535n020;
        C41535n0 c41535n021 = new C41535n0(Constants.MINIMAL_ERROR_STATUS_CODE, "Bad Request");
        C41535n0 c41535n022 = new C41535n0(401, "Unauthorized");
        C41535n0 c41535n023 = new C41535n0(402, "Payment Required");
        C41535n0 c41535n024 = new C41535n0(403, "Forbidden");
        C41535n0 c41535n025 = new C41535n0(404, "Not Found");
        C41535n0 c41535n026 = new C41535n0(405, "Method Not Allowed");
        C41535n0 c41535n027 = new C41535n0(406, "Not Acceptable");
        C41535n0 c41535n028 = new C41535n0(407, "Proxy Authentication Required");
        C41535n0 c41535n029 = new C41535n0(408, "Request Timeout");
        C41535n0 c41535n030 = new C41535n0(409, "Conflict");
        C41535n0 c41535n031 = new C41535n0(410, "Gone");
        C41535n0 c41535n032 = new C41535n0(411, "Length Required");
        C41535n0 c41535n033 = new C41535n0(412, "Precondition Failed");
        C41535n0 c41535n034 = new C41535n0(413, "Payload Too Large");
        C41535n0 c41535n035 = new C41535n0(414, "Request-URI Too Long");
        C41535n0 c41535n036 = new C41535n0(415, "Unsupported Media Type");
        C41535n0 c41535n037 = new C41535n0(416, "Requested Range Not Satisfiable");
        C41535n0 c41535n038 = new C41535n0(417, "Expectation Failed");
        C41535n0 c41535n039 = new C41535n0(422, "Unprocessable Entity");
        C41535n0 c41535n040 = new C41535n0(423, "Locked");
        C41535n0 c41535n041 = new C41535n0(424, "Failed Dependency");
        C41535n0 c41535n042 = new C41535n0(425, "Too Early");
        C41535n0 c41535n043 = new C41535n0(426, "Upgrade Required");
        C41535n0 c41535n044 = new C41535n0(429, "Too Many Requests");
        C41535n0 c41535n045 = new C41535n0(431, "Request Header Fields Too Large");
        C41535n0 c41535n046 = new C41535n0(500, "Internal Server Error");
        C41535n0 c41535n047 = new C41535n0(501, "Not Implemented");
        C41535n0 c41535n048 = new C41535n0(502, "Bad Gateway");
        C41535n0 c41535n049 = new C41535n0(503, "Service Unavailable");
        C41535n0 c41535n050 = new C41535n0(504, "Gateway Timeout");
        f400090l = c41535n050;
        List<C41535n0> listU = C42745f0.U(c41535n0, c41535n02, c41535n03, c41535n04, c41535n05, c41535n06, c41535n07, c41535n08, c41535n09, c41535n010, c41535n011, c41535n012, c41535n013, c41535n014, c41535n015, c41535n016, c41535n017, c41535n018, c41535n019, c41535n020, c41535n021, c41535n022, c41535n023, c41535n024, c41535n025, c41535n026, c41535n027, c41535n028, c41535n029, c41535n030, c41535n031, c41535n032, c41535n033, c41535n034, c41535n035, c41535n036, c41535n037, c41535n038, c41535n039, c41535n040, c41535n041, c41535n042, c41535n043, c41535n044, c41535n045, c41535n046, c41535n047, c41535n048, c41535n049, c41535n050, new C41535n0(505, "HTTP Version Not Supported"), new C41535n0(506, "Variant Also Negotiates"), new C41535n0(507, "Insufficient Storage"));
        f400091m = listU;
        List<C41535n0> list = listU;
        int iF2 = kotlin.collections.P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((C41535n0) obj).f400093b), obj);
        }
        f400092n = linkedHashMap;
    }

    public C41535n0(int i12, @Y61.k String str) {
        this.f400093b = i12;
        this.f400094c = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C41535n0 c41535n0) {
        return this.f400093b - c41535n0.f400093b;
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof C41535n0) && ((C41535n0) obj).f400093b == this.f400093b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f400093b);
    }

    @Y61.k
    public final String toString() {
        return this.f400093b + ' ' + this.f400094c;
    }
}
