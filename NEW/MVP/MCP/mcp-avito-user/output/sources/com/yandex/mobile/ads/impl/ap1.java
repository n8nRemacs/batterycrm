package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jp1;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class ap1 extends jp1 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f383624c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f383625d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f383626e;

    public ap1(jp1.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j12) {
        super(bVar);
        this.f383624c = new HashSet<>(hashSet);
        this.f383625d = jSONObject;
        this.f383626e = j12;
    }
}
