package zJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.MediaConstraints;

/* compiled from: MediaConstraintsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzJ/f;", "Lcom/avito/avcalls/rtc/media/e;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f implements com.avito.avcalls.rtc.media.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MediaConstraints f444016a;

    public f() {
        this(null, 1, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.f444016a, ((f) obj).f444016a);
    }

    public final int hashCode() {
        return this.f444016a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "MediaConstraintsImpl(rtcMediaConstraints=" + this.f444016a + ')';
    }

    public f(MediaConstraints mediaConstraints, int i12, C42822w c42822w) {
        this.f444016a = (i12 & 1) != 0 ? new MediaConstraints() : mediaConstraints;
    }
}
