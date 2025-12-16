package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class p60 implements InstreamAdBreak {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<ff1<VideoAd>> f388728a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f388729b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39366t1 f388730c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InstreamAdBreakPosition f388731d;

    /* renamed from: e, reason: collision with root package name */
    private final long f388732e;

    public p60(@j.N ArrayList arrayList, @j.N String str, @j.N C39366t1 c39366t1, @j.N InstreamAdBreakPosition instreamAdBreakPosition, long j12) {
        this.f388728a = arrayList;
        this.f388729b = str;
        this.f388730c = c39366t1;
        this.f388731d = instreamAdBreakPosition;
        this.f388732e = j12;
    }

    public final void a(@j.P zm zmVar) {
    }

    @j.P
    public final zm b() {
        return null;
    }

    @j.N
    public final List<ff1<VideoAd>> c() {
        return this.f388728a;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @j.N
    public final InstreamAdBreakPosition getAdBreakPosition() {
        return this.f388731d;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @j.N
    public final String getType() {
        return this.f388729b;
    }

    @j.N
    public final String toString() {
        StringBuilder sbA = Cif.a("ad_break_#");
        sbA.append(this.f388732e);
        return sbA.toString();
    }

    @j.N
    public final C39366t1 a() {
        return this.f388730c;
    }
}
