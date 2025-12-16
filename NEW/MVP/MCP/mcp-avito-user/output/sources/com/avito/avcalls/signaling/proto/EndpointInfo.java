package com.avito.avcalls.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.avcalls.utils.Platform;
import com.avito.avcalls.utils.b;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;

/* compiled from: EndpointInfo.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rB?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/avcalls/signaling/proto/EndpointInfo;", "", "", "seen1", "", "ua", "voip", "", "features", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class EndpointInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f333302d = {null, null, new C43401f(V0.f412822a)};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f333303a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333304b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f333305c;

    /* compiled from: EndpointInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/avcalls/signaling/proto/EndpointInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/EndpointInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "FEATURE_FAST_CONNECT", "Ljava/lang/String;", "FEATURE_PING", "FEATURE_VIDEO", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public static EndpointInfo a(@k b bVar) {
            String str = bVar.f333651a + ' ' + bVar.f333652b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Platform.f333648b);
            sb2.append(' ');
            sb2.append(bVar.f333653c);
            sb2.append(bVar.f333654d ? "" : "-dev");
            return new EndpointInfo(str, sb2.toString(), C42745f0.e0("ping", "fc", "video"), null);
        }

        @k
        public final KSerializer<EndpointInfo> serializer() {
            return EndpointInfo$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public EndpointInfo() {
        throw null;
    }

    @InterfaceC42830m
    public /* synthetic */ EndpointInfo(int i12, String str, String str2, List list, P0 p02) {
        if (7 != (i12 & 7)) {
            E0.b(i12, 7, EndpointInfo$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f333303a = str;
        this.f333304b = str2;
        this.f333305c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndpointInfo)) {
            return false;
        }
        EndpointInfo endpointInfo = (EndpointInfo) obj;
        return L.f(this.f333303a, endpointInfo.f333303a) && L.f(this.f333304b, endpointInfo.f333304b) && L.f(this.f333305c, endpointInfo.f333305c);
    }

    public final int hashCode() {
        return this.f333305c.hashCode() + H.d(this.f333303a.hashCode() * 31, 31, this.f333304b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EndpointInfo(ua=");
        sb2.append(this.f333303a);
        sb2.append(", voip=");
        sb2.append(this.f333304b);
        sb2.append(", features=");
        return H.p(sb2, this.f333305c, ')');
    }

    public EndpointInfo(String str, String str2, List list, C42822w c42822w) {
        this.f333303a = str;
        this.f333304b = str2;
        this.f333305c = list;
    }
}
