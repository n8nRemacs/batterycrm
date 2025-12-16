package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final i3 f386753a;

    public j3(@Y61.k Context context, @Y61.k p60 p60Var, @Y61.k v40 v40Var, @Y61.k w20 w20Var, @Y61.k l50 l50Var, @Y61.k qf1<VideoAd> qf1Var) {
        this.f386753a = new i3(context, p60Var, C39369u1.a(p60Var.a().c()), w20Var, v40Var, l50Var, qf1Var);
    }

    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f386753a.a((ff1) it.next()));
        }
        return arrayList;
    }
}
