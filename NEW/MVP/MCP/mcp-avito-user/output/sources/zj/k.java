package zJ;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.VideoSource;

/* compiled from: VideoSourceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzJ/k;", "Lcom/avito/avcalls/rtc/media/j;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class k implements com.avito.avcalls.rtc.media.j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VideoSource f444018a;

    public k(@Y61.k VideoSource videoSource) {
        this.f444018a = videoSource;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && L.f(this.f444018a, ((k) obj).f444018a);
    }

    public final int hashCode() {
        return this.f444018a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "VideoSourceImpl(rtcVideoSource=" + this.f444018a + ')';
    }
}
