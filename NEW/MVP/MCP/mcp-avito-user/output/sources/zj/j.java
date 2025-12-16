package zJ;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.RtpSender;

/* compiled from: RtpSenderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzJ/j;", "Lcom/avito/avcalls/rtc/media/h;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class j implements com.avito.avcalls.rtc.media.h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RtpSender f444017a;

    public j(@Y61.k RtpSender rtpSender) {
        this.f444017a = rtpSender;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && L.f(this.f444017a, ((j) obj).f444017a);
    }

    public final int hashCode() {
        return this.f444017a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "RtpSenderImpl(rtcRtpSender=" + this.f444017a + ')';
    }

    @Override // com.avito.avcalls.rtc.media.h
    public final void y(@Y61.k com.avito.avcalls.rtc.media.f fVar) {
        z(null);
        z(fVar);
    }

    @Override // com.avito.avcalls.rtc.media.h
    public final void z(@Y61.l com.avito.avcalls.rtc.media.f fVar) {
        this.f444017a.setTrack(fVar != null ? ((h) fVar.g()).v() : null, false);
    }
}
