package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.impl.ob.C39052pd;
import com.yandex.metrica.networktasks.impl.g;
import com.yandex.metrica.networktasks.impl.h;

/* loaded from: classes7.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    public final g f382400a;

    /* renamed from: b, reason: collision with root package name */
    public final h f382401b;

    /* renamed from: c, reason: collision with root package name */
    public final C39052pd f382402c;

    /* renamed from: d, reason: collision with root package name */
    public long f382403d;

    /* renamed from: e, reason: collision with root package name */
    public int f382404e;

    public ExponentialBackoffDataHolder(C39052pd c39052pd) {
        h hVar = new h();
        g gVar = new g();
        this.f382402c = c39052pd;
        this.f382401b = hVar;
        this.f382400a = gVar;
        this.f382403d = c39052pd.getLastAttemptTimeSeconds();
        this.f382404e = c39052pd.getNextSendAttemptNumber();
    }
}
