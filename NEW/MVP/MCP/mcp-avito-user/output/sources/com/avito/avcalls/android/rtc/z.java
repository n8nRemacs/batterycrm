package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.signaling.proto.IceServer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RtcConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/z;", "", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class z {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<IceServer> f331984a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f331985b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f331986c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f331987d;

    /* compiled from: RtcConfiguration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/z$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.rtc.z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public z(@Y61.k List<IceServer> list, boolean z12, boolean z13, boolean z14) {
        this.f331984a = list;
        this.f331985b = z12;
        this.f331986c = z13;
        this.f331987d = z14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f331984a, zVar.f331984a) && this.f331985b == zVar.f331985b && this.f331986c == zVar.f331986c && this.f331987d == zVar.f331987d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f331987d) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f331984a.hashCode() * 31, 31, this.f331985b), 31, this.f331986c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RtcConfiguration(iceServers=");
        sb2.append(this.f331984a);
        sb2.append(", isTcpCandidatesEnabled=");
        sb2.append(this.f331985b);
        sb2.append(", isContinualGathering=");
        sb2.append(this.f331986c);
        sb2.append(", isUseUnifiedPlan=");
        return androidx.appcompat.app.r.x(sb2, this.f331987d, ')');
    }
}
