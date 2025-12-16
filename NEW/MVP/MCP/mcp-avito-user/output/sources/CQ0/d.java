package CQ0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ManualAudioSessionLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LCQ0/d;", "Lcom/avito/avcalls/utils/logs/b;", "LCQ0/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d extends com.avito.avcalls.utils.logs.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f2179b;

    public d(@k a aVar) {
        this.f2179b = aVar;
    }

    @Override // com.avito.avcalls.utils.logs.b
    @k
    public final String G() {
        return "ManualAudioSession";
    }

    @Override // CQ0.a
    public final void I(boolean z12) {
        F().b("setIsEnabled", Boolean.valueOf(z12));
        this.f2179b.I(z12);
    }

    @Override // CQ0.a
    public final void J(@k String str, @k com.avito.avcalls.rtc.peer_connection.a aVar) {
        F().b("registerPeerConnection", str);
        this.f2179b.J(str, aVar);
    }

    @Override // CQ0.a
    public final void K(@k String str) {
        F().b("unregisterPeerConnection", str);
        this.f2179b.K(str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f2179b, ((d) obj).f2179b);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f2179b;
    }

    public final int hashCode() {
        return this.f2179b.hashCode();
    }
}
