package com.avito.avcalls.android.stats;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RtcStatsReport.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/stats/a;", "", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f332413a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, C10325a> f332414b;

    /* compiled from: RtcStatsReport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/stats/a$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.stats.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10325a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f332415a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f332416b;

        /* renamed from: c, reason: collision with root package name */
        public final double f332417c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<String, Object> f332418d;

        public C10325a(@k String str, @k String str2, double d12, @k Map<String, ? extends Object> map) {
            this.f332415a = str;
            this.f332416b = str2;
            this.f332417c = d12;
            this.f332418d = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10325a)) {
                return false;
            }
            C10325a c10325a = (C10325a) obj;
            return L.f(this.f332415a, c10325a.f332415a) && L.f(this.f332416b, c10325a.f332416b) && Double.compare(this.f332417c, c10325a.f332417c) == 0 && L.f(this.f332418d, c10325a.f332418d);
        }

        public final int hashCode() {
            return this.f332418d.hashCode() + androidx.compose.ui.graphics.colorspace.e.d(H.d(this.f332415a.hashCode() * 31, 31, this.f332416b), 31, this.f332417c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RtcStats(id=");
            sb2.append(this.f332415a);
            sb2.append(", type=");
            sb2.append(this.f332416b);
            sb2.append(", timestampUs=");
            sb2.append(this.f332417c);
            sb2.append(", values=");
            return r.w(sb2, this.f332418d, ')');
        }
    }

    public a(double d12, @k Map<String, C10325a> map) {
        this.f332413a = d12;
        this.f332414b = map;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{timestampUs=");
        sb2.append(this.f332413a);
        sb2.append(", stats=");
        return r.w(sb2, this.f332414b, '}');
    }
}
