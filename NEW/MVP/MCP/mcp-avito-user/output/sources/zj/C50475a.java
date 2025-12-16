package zJ;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.AudioSource;

/* compiled from: AudioSourceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzJ/a;", "Lcom/avito/avcalls/rtc/media/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C50475a implements com.avito.avcalls.rtc.media.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AudioSource f444013a;

    public C50475a(@Y61.k AudioSource audioSource) {
        this.f444013a = audioSource;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50475a) && L.f(this.f444013a, ((C50475a) obj).f444013a);
    }

    public final int hashCode() {
        return this.f444013a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AudioSourceImpl(rtcAudioSource=" + this.f444013a + ')';
    }
}
