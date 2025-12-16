package zJ;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoTrack;
import xJ.C49847b;

/* compiled from: VideoTrackImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LzJ/m;", "LzJ/h;", "Lcom/avito/avcalls/rtc/media/l;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class m implements h, com.avito.avcalls.rtc.media.l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VideoTrack f444019a;

    public m(@Y61.k VideoTrack videoTrack) {
        this.f444019a = videoTrack;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.f444019a, ((m) obj).f444019a);
    }

    @Override // com.avito.avcalls.rtc.media.f
    @Y61.k
    public final String getId() {
        return v().id();
    }

    public final int hashCode() {
        return this.f444019a.hashCode();
    }

    @Override // com.avito.avcalls.rtc.media.f
    public final boolean isEnabled() {
        return v().enabled();
    }

    @Override // com.avito.avcalls.rtc.media.l
    public final void o(@Y61.k DQ0.a aVar) {
        this.f444019a.removeSink(((C49847b) aVar).f442337b);
    }

    @Override // com.avito.avcalls.rtc.media.l
    public final void p(@Y61.k DQ0.a aVar) {
        this.f444019a.addSink(((C49847b) aVar).f442337b);
    }

    @Override // com.avito.avcalls.rtc.media.f
    public final void setEnabled(boolean z12) {
        v().setEnabled(z12);
    }

    @Y61.k
    public final String toString() {
        return "VideoTrackImpl(rtcMediaStreamTrack=" + this.f444019a + ')';
    }

    @Override // zJ.h
    public final MediaStreamTrack v() {
        return this.f444019a;
    }

    @Override // com.avito.avcalls.utils.logs.c
    @Y61.k
    public final Object g() {
        return this;
    }
}
