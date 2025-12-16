package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.C42833p;

/* loaded from: classes8.dex */
public final class y01 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final IOException f391874a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private IOException f391875b;

    public y01(@Y61.k IOException iOException) {
        super(iOException);
        this.f391874a = iOException;
        this.f391875b = iOException;
    }

    @Y61.k
    public final IOException a() {
        return this.f391874a;
    }

    @Y61.k
    public final IOException b() {
        return this.f391875b;
    }

    public final void a(@Y61.k IOException iOException) {
        C42833p.a(this.f391874a, iOException);
        this.f391875b = iOException;
    }
}
