package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ee, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38779ee implements InterfaceC39182v0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f380481a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final JSONObject f380482b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f380483c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f380484d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final EnumC39158u0 f380485e;

    public C38779ee(@j.P String str, @j.N JSONObject jSONObject, boolean z12, boolean z13, @j.N EnumC39158u0 enumC39158u0) {
        this.f380481a = str;
        this.f380482b = jSONObject;
        this.f380483c = z12;
        this.f380484d = z13;
        this.f380485e = enumC39158u0;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39182v0
    @j.N
    public EnumC39158u0 a() {
        return this.f380485e;
    }

    public String toString() {
        return "PreloadInfoState{trackingId='" + this.f380481a + "', additionalParameters=" + this.f380482b + ", wasSet=" + this.f380483c + ", autoTrackingEnabled=" + this.f380484d + ", source=" + this.f380485e + '}';
    }
}
