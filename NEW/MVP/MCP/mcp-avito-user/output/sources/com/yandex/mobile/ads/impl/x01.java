package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public final class x01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f391517a = new LinkedHashSet();

    public final synchronized void a(@Y61.k w01 w01Var) {
        this.f391517a.remove(w01Var);
    }

    public final synchronized void b(@Y61.k w01 w01Var) {
        this.f391517a.add(w01Var);
    }

    public final synchronized boolean c(@Y61.k w01 w01Var) {
        return this.f391517a.contains(w01Var);
    }
}
