package io.ktor.http;

import com.adjust.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: URLProtocol.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/O0;", "", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class O0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f399884c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final O0 f399885d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final O0 f399886e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final O0 f399887f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f399888g;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399889a;

    /* renamed from: b, reason: collision with root package name */
    public final int f399890b;

    /* compiled from: URLProtocol.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/O0$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        O0 o02 = new O0("http", 80);
        f399885d = o02;
        O0 o03 = new O0(Constants.SCHEME, 443);
        O0 o04 = new O0("ws", 80);
        f399886e = o04;
        O0 o05 = new O0("wss", 443);
        f399887f = o05;
        List listU = C42745f0.U(o02, o03, o04, o05, new O0("socks", 1080));
        int iF2 = kotlin.collections.P0.f(C42745f0.q(listU, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : listU) {
            linkedHashMap.put(((O0) obj).f399889a, obj);
        }
        f399888g = linkedHashMap;
    }

    public O0(@Y61.k String str, int i12) {
        this.f399889a = str;
        this.f399890b = i12;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        return this.f399889a.equals(o02.f399889a) && this.f399890b == o02.f399890b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f399890b) + (this.f399889a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.f399889a);
        sb2.append(", defaultPort=");
        return androidx.appcompat.app.r.t(sb2, this.f399890b, ')');
    }
}
