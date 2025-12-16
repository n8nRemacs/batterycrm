package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.MediaFile;

/* loaded from: classes8.dex */
public final class e60 implements MediaFile {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InstreamAdBreakPosition f384768a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f384769b;

    /* renamed from: c, reason: collision with root package name */
    private final int f384770c;

    /* renamed from: d, reason: collision with root package name */
    private final int f384771d;

    public e60(@j.N InstreamAdBreakPosition instreamAdBreakPosition, @j.N String str, int i12, int i13) {
        this.f384768a = instreamAdBreakPosition;
        this.f384769b = str;
        this.f384770c = i12;
        this.f384771d = i13;
    }

    @j.N
    public final InstreamAdBreakPosition a() {
        return this.f384768a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f384771d;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f384770c;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, com.yandex.mobile.ads.impl.sf1
    @j.N
    public final String getUrl() {
        return this.f384769b;
    }
}
