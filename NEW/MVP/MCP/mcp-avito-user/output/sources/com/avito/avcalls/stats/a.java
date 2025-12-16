package com.avito.avcalls.stats;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RtcStatsReport.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/stats/a;", "", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f333641a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, C10362a> f333642b;

    /* compiled from: RtcStatsReport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/stats/a$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.stats.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10362a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f333643a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f333644b;

        /* renamed from: c, reason: collision with root package name */
        public final double f333645c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<String, Object> f333646d;

        public C10362a(@k String str, @k String str2, double d12, @k Map<String, ? extends Object> map) {
            this.f333643a = str;
            this.f333644b = str2;
            this.f333645c = d12;
            this.f333646d = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10362a)) {
                return false;
            }
            C10362a c10362a = (C10362a) obj;
            return L.f(this.f333643a, c10362a.f333643a) && L.f(this.f333644b, c10362a.f333644b) && Double.compare(this.f333645c, c10362a.f333645c) == 0 && L.f(this.f333646d, c10362a.f333646d);
        }

        public final int hashCode() {
            return this.f333646d.hashCode() + androidx.compose.ui.graphics.colorspace.e.d(H.d(this.f333643a.hashCode() * 31, 31, this.f333644b), 31, this.f333645c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RtcStats(id=");
            sb2.append(this.f333643a);
            sb2.append(", type=");
            sb2.append(this.f333644b);
            sb2.append(", timestampUs=");
            sb2.append(this.f333645c);
            sb2.append(", values=");
            return r.w(sb2, this.f333646d, ')');
        }
    }

    public a(double d12, @k Map<String, C10362a> map) {
        this.f333641a = d12;
        this.f333642b = map;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{timestampUs=");
        sb2.append(this.f333641a);
        sb2.append(", stats=");
        return r.w(sb2, this.f333642b, '}');
    }
}
