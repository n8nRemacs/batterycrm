package zJ;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioTrackImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LzJ/c;", "LzJ/h;", "Lcom/avito/avcalls/rtc/media/b;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements h, com.avito.avcalls.rtc.media.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AudioTrack f444014a;

    public c(@Y61.k AudioTrack audioTrack) {
        this.f444014a = audioTrack;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f444014a, ((c) obj).f444014a);
    }

    @Override // com.avito.avcalls.rtc.media.f
    @Y61.k
    public final String getId() {
        return v().id();
    }

    public final int hashCode() {
        return this.f444014a.hashCode();
    }

    @Override // com.avito.avcalls.rtc.media.f
    public final boolean isEnabled() {
        return v().enabled();
    }

    @Override // com.avito.avcalls.rtc.media.f
    public final void setEnabled(boolean z12) {
        v().setEnabled(z12);
    }

    @Y61.k
    public final String toString() {
        return "AudioTrackImpl(rtcMediaStreamTrack=" + this.f444014a + ')';
    }

    @Override // zJ.h
    public final MediaStreamTrack v() {
        return this.f444014a;
    }

    @Override // com.avito.avcalls.utils.logs.c
    @Y61.k
    public final Object g() {
        return this;
    }
}
