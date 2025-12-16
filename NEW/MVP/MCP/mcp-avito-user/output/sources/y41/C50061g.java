package y41;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* compiled from: SentryStackTraceElement.java */
/* renamed from: y41.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50061g implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final String f442921b;

    /* renamed from: c, reason: collision with root package name */
    public final String f442922c;

    /* renamed from: d, reason: collision with root package name */
    public final String f442923d;

    /* renamed from: e, reason: collision with root package name */
    public final int f442924e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, Object> f442925f;

    public C50061g(int i12, String str, String str2, String str3, Map map) {
        this.f442921b = str;
        this.f442922c = str2;
        this.f442923d = str3;
        this.f442924e = i12;
        this.f442925f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C50061g c50061g = (C50061g) obj;
        return this.f442924e == c50061g.f442924e && Objects.equals(this.f442921b, c50061g.f442921b) && Objects.equals(this.f442922c, c50061g.f442922c) && Objects.equals(this.f442923d, c50061g.f442923d) && Objects.equals(this.f442925f, c50061g.f442925f);
    }

    public final int hashCode() {
        return Objects.hash(this.f442921b, this.f442922c, this.f442923d, Integer.valueOf(this.f442924e), null, null, null, this.f442925f);
    }

    public final String toString() {
        return "SentryStackTraceElement{module='" + this.f442921b + "', function='" + this.f442922c + "', fileName='" + this.f442923d + "', lineno=" + this.f442924e + ", colno=null, absPath='null', platform='null', locals='" + this.f442925f + "'}";
    }
}
