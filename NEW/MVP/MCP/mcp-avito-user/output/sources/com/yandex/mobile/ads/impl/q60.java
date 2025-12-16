package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class q60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389089a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final j40 f389090b = new j40();

    public q60(@j.N Context context) {
        this.f389089a = context.getApplicationContext();
    }

    @j.P
    public final p60 a(@j.N C39366t1 c39366t1, @j.N List<ne1> list) {
        InstreamAdBreakPosition instreamAdBreakPositionA;
        String strC = c39366t1.c();
        if (strC == null || (instreamAdBreakPositionA = this.f389090b.a(c39366t1.f())) == null) {
            return null;
        }
        long jA2 = f20.a();
        ArrayList arrayListA = new if1(this.f389089a, new u60(instreamAdBreakPositionA, jA2)).a(list);
        if (arrayListA.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add((VideoAd) ((ff1) it.next()).c());
        }
        return new p60(arrayListA, strC, c39366t1, instreamAdBreakPositionA, jA2);
    }
}
