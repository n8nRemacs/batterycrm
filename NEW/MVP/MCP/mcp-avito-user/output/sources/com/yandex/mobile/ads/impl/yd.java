package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class yd {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final er f391999a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final mq f392000b;

    public yd(@Y61.k er erVar, @Y61.k mq mqVar) {
        this.f391999a = erVar;
        this.f392000b = mqVar;
    }

    @Y61.l
    public final xd a(@Y61.k Context context, @Y61.k com.yandex.mobile.ads.nativeads.u uVar) {
        vq vqVar;
        Object next;
        this.f391999a.getClass();
        if (er.a(context)) {
            List<vq> listC = uVar.c();
            if (listC != null) {
                Iterator<T> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((vq) next).c(), xp.a(1))) {
                        break;
                    }
                }
                vqVar = (vq) next;
            } else {
                vqVar = null;
            }
            if (vqVar != null) {
                this.f392000b.getClass();
                com.yandex.div2.H0 h0A = mq.a(vqVar);
                if (h0A != null) {
                    return new xd(h0A);
                }
            }
        }
        return null;
    }

    public /* synthetic */ yd() {
        this(new er(), new mq());
    }
}
