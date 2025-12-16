package com.avito.avcalls.android.rtc;

import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoTrack;

/* compiled from: VideoTrack.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/C;", "Lcom/avito/avcalls/android/rtc/f;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C extends f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VideoTrack f331870a;

    public C(@Y61.k VideoTrack videoTrack) {
        this.f331870a = videoTrack;
    }

    @Override // com.avito.avcalls.android.rtc.f
    public final MediaStreamTrack a() {
        return this.f331870a;
    }
}
