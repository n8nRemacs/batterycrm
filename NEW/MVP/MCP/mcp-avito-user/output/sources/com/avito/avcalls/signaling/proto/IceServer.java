package com.avito.avcalls.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;

/* compiled from: IceConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rB?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IceServer;", "", "", "seen1", "", "", "urls", "credential", "username", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class IceServer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f333317d = {new C43401f(V0.f412822a), null, null};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f333318a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f333319b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f333320c;

    /* compiled from: IceConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IceServer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/IceServer;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<IceServer> serializer() {
            return IceServer$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public IceServer() {
        throw null;
    }

    @InterfaceC42830m
    public /* synthetic */ IceServer(int i12, List list, String str, String str2, P0 p02) {
        if (1 != (i12 & 1)) {
            E0.b(i12, 1, IceServer$$serializer.INSTANCE.getF332717a());
            throw null;
        }
        this.f333318a = list;
        if ((i12 & 2) == 0) {
            this.f333319b = null;
        } else {
            this.f333319b = str;
        }
        if ((i12 & 4) == 0) {
            this.f333320c = null;
        } else {
            this.f333320c = str2;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceServer)) {
            return false;
        }
        IceServer iceServer = (IceServer) obj;
        return L.f(this.f333318a, iceServer.f333318a) && L.f(this.f333319b, iceServer.f333319b) && L.f(this.f333320c, iceServer.f333320c);
    }

    public final int hashCode() {
        int iHashCode = this.f333318a.hashCode() * 31;
        String str = this.f333319b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f333320c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IceServer(urls=");
        sb2.append(this.f333318a);
        sb2.append(", credential=");
        sb2.append(this.f333319b);
        sb2.append(", username=");
        return C22026a.c(sb2, this.f333320c, ')');
    }

    public IceServer(List list, String str, String str2, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? null : str;
        str2 = (i12 & 4) != 0 ? null : str2;
        this.f333318a = list;
        this.f333319b = str;
        this.f333320c = str2;
    }
}
