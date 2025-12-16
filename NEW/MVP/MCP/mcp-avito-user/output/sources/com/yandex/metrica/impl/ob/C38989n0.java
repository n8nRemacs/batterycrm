package com.yandex.metrica.impl.ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38989n0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final Map<String, String> f381138a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f381139b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f381140c;

    public C38989n0(@j.P String str, @j.P Map<String, String> map, @j.P String str2) {
        this.f381139b = str;
        this.f381138a = map;
        this.f381140c = str2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb2.append(this.f381138a);
        sb2.append(", mDeeplink='");
        sb2.append(this.f381139b);
        sb2.append("', mUnparsedReferrer='");
        return AK.c.s(sb2, this.f381140c, "'}");
    }
}
