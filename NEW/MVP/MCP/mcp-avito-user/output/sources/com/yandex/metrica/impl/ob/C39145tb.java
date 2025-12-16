package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.tb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39145tb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final a f381871a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f381872b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final Boolean f381873c;

    /* renamed from: com.yandex.metrica.impl.ob.tb$a */
    public enum a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C39145tb(@j.N a aVar, @j.P String str, @j.P Boolean bool) {
        this.f381871a = aVar;
        this.f381872b = str;
        this.f381873c = bool;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdTrackingInfo{provider=");
        sb2.append(this.f381871a);
        sb2.append(", advId='");
        sb2.append(this.f381872b);
        sb2.append("', limitedAdTracking=");
        return com.akita.compose.theme.re23.style.C0.g(sb2, this.f381873c, '}');
    }
}
