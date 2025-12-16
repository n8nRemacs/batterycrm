package com.yandex.mobile.ads.impl;

import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public enum qm {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("htmlDisplay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("nativeDisplay"),
    f389238b("video"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49(MediaStreamTrack.AUDIO_TRACK_KIND);


    /* renamed from: a, reason: collision with root package name */
    private final String f389240a;

    qm(String str) {
        this.f389240a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f389240a;
    }
}
