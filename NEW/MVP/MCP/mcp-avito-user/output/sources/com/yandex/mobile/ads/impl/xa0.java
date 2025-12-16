package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class xa0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39324f2 f391588a = new C39324f2();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final C39328g2 f391589b = new C39328g2();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final o60 f391590c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final sa0 f391591d;

    public xa0(@Y61.k Context context, @Y61.k InstreamAd instreamAd) {
        o60 o60VarA = v60.a(instreamAd);
        this.f391590c = o60VarA;
        this.f391591d = new sa0(context, o60VarA);
    }

    @Y61.k
    public final ArrayList a(@Y61.l String str) {
        C39328g2 c39328g2 = this.f391589b;
        List<p60> adBreaks = this.f391590c.getAdBreaks();
        c39328g2.getClass();
        ArrayList arrayListA = C39328g2.a(adBreaks);
        this.f391588a.getClass();
        ArrayList arrayListA2 = C39324f2.a(str, arrayListA);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA2, 10));
        Iterator it = arrayListA2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f391591d.a((p60) it.next()));
        }
        return arrayList;
    }
}
