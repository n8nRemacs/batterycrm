package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class wa0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final xa0 f391357a;

    public wa0(@Y61.k Context context, @Y61.k InstreamAd instreamAd) {
        this.f391357a = new xa0(context, instreamAd);
    }

    @Y61.k
    public final va0 a(@Y61.k qa0 qa0Var, @Y61.l String str) {
        ArrayList arrayListA = this.f391357a.a(str);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayDeque.add(qa0Var.a((ra0) it.next()));
        }
        return new va0(arrayDeque);
    }
}
