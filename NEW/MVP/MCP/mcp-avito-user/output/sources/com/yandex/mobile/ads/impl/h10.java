package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class h10 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f385882a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Map<String, String> f385883b;

    public final synchronized Map<String, String> a() {
        try {
            if (this.f385883b == null) {
                this.f385883b = Collections.unmodifiableMap(new HashMap(this.f385882a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f385883b;
    }
}
