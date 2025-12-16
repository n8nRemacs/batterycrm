package com.avito.avcalls.android.rtc;

import kotlin.Metadata;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioTrack.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/b;", "Lcom/avito/avcalls/android/rtc/f;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.avcalls.android.rtc.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36192b extends f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AudioTrack f331899a;

    public C36192b(@Y61.k AudioTrack audioTrack) {
        this.f331899a = audioTrack;
    }

    @Override // com.avito.avcalls.android.rtc.f
    public final MediaStreamTrack a() {
        return this.f331899a;
    }
}
