package com.avito.android.adaptive.image;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.NetworkType;
import kotlin.Metadata;

/* compiled from: AdaptiveAlgorithm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/adaptive/image/a;", "", "a", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdaptiveAlgorithm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adaptive/image/a$a;", "", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.adaptive.image.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2141a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f68480a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f68481b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final NetworkType f68482c;

        /* renamed from: d, reason: collision with root package name */
        public final long f68483d;

        /* renamed from: e, reason: collision with root package name */
        public final double f68484e;

        public C2141a(boolean z12, boolean z13, @Y61.k NetworkType networkType, long j12, double d12) {
            this.f68480a = z12;
            this.f68481b = z13;
            this.f68482c = networkType;
            this.f68483d = j12;
            this.f68484e = d12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2141a)) {
                return false;
            }
            C2141a c2141a = (C2141a) obj;
            return this.f68480a == c2141a.f68480a && this.f68481b == c2141a.f68481b && this.f68482c == c2141a.f68482c && this.f68483d == c2141a.f68483d && Double.compare(this.f68484e, c2141a.f68484e) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f68484e) + r.g((this.f68482c.hashCode() + r.i(Boolean.hashCode(this.f68480a) * 31, 31, this.f68481b)) * 31, 31, this.f68483d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(batterySave=");
            sb2.append(this.f68480a);
            sb2.append(", networkCongestion=");
            sb2.append(this.f68481b);
            sb2.append(", networkType=");
            sb2.append(this.f68482c);
            sb2.append(", imageLoadSpeedBytesPerSecond=");
            sb2.append(this.f68483d);
            sb2.append(", averageBytesPerPixel=");
            return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f68484e, ')');
        }
    }

    @Y61.k
    C2141a getInfo();
}
