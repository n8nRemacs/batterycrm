package com.avito.avcalls.rtc.connecting;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.avcalls.signaling.proto.IceServer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RtcConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/b;", "", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<IceServer> f333092a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f333093b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f333094c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f333095d;

    /* compiled from: RtcConfiguration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/b$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.rtc.connecting.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public b(@k List<IceServer> list, boolean z12, boolean z13, boolean z14) {
        this.f333092a = list;
        this.f333093b = z12;
        this.f333094c = z13;
        this.f333095d = z14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f333092a, bVar.f333092a) && this.f333093b == bVar.f333093b && this.f333094c == bVar.f333094c && this.f333095d == bVar.f333095d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f333095d) + r.i(r.i(this.f333092a.hashCode() * 31, 31, this.f333093b), 31, this.f333094c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RtcConfiguration(iceServers=");
        sb2.append(this.f333092a);
        sb2.append(", isTcpCandidatesEnabled=");
        sb2.append(this.f333093b);
        sb2.append(", isContinualGathering=");
        sb2.append(this.f333094c);
        sb2.append(", isUseUnifiedPlan=");
        return r.x(sb2, this.f333095d, ')');
    }
}
