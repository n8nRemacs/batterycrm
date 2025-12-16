package com.yandex.metrica.impl.ob;

import java.util.HashMap;

/* loaded from: classes7.dex */
public class J extends C38715c0 {

    /* renamed from: r, reason: collision with root package name */
    private HashMap<a, Integer> f378538r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC38813fn<String> f378539s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC38813fn<String> f378540t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC38813fn<String> f378541u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC38813fn<byte[]> f378542v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC38813fn<String> f378543w;

    /* renamed from: x, reason: collision with root package name */
    private InterfaceC38813fn<String> f378544x;

    public enum a {
        NAME,
        VALUE,
        USER_INFO
    }

    @j.k0
    public J(@j.N C38737cm c38737cm) {
        this.f378538r = new HashMap<>();
        a(c38737cm);
    }

    private String g(@j.P String str) {
        String strA = this.f378539s.a(str);
        a(str, strA, a.NAME);
        return strA;
    }

    private String h(String str) {
        String strA = this.f378540t.a(str);
        a(str, strA, a.VALUE);
        return strA;
    }

    public static C38715c0 s() {
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_SEND_USER_PROFILE.b();
        return c38715c0;
    }

    private void u() {
        this.f380261h = 0;
        for (Integer num : this.f378538r.values()) {
            this.f380261h = num.intValue() + this.f380261h;
        }
    }

    public J a(@j.N HashMap<a, Integer> map) {
        this.f378538r = map;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.C38715c0
    public C38715c0 b(String str) {
        String strA = this.f378539s.a(str);
        a(str, strA, a.NAME);
        this.f380254a = strA;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.C38715c0
    @j.N
    public C38715c0 d(@j.P String str) {
        return super.d(this.f378543w.a(str));
    }

    @Override // com.yandex.metrica.impl.ob.C38715c0
    public C38715c0 e(String str) {
        String strA = this.f378544x.a(str);
        a(str, strA, a.USER_INFO);
        return super.e(strA);
    }

    @Override // com.yandex.metrica.impl.ob.C38715c0
    public C38715c0 f(String str) {
        String strA = this.f378540t.a(str);
        a(str, strA, a.VALUE);
        this.f380255b = strA;
        return this;
    }

    public J i(@j.N String str) {
        String strA = this.f378541u.a(str);
        a(str, strA, a.VALUE);
        this.f380255b = strA;
        return this;
    }

    @j.N
    public HashMap<a, Integer> t() {
        return this.f378538r;
    }

    private void a(@j.N C38737cm c38737cm) {
        this.f378539s = new C38763dn(1000, "event name", c38737cm);
        this.f378540t = new C38738cn(245760, "event value", c38737cm);
        this.f378541u = new C38738cn(1024000, "event extended value", c38737cm);
        this.f378542v = new Tm(245760, "event value bytes", c38737cm);
        this.f378543w = new C38763dn(200, "user profile id", c38737cm);
        this.f378544x = new C38763dn(10000, "UserInfo", c38737cm);
    }

    public J(String str, String str2, int i12, @j.N C38737cm c38737cm) {
        this(str, str2, i12, 0, c38737cm);
    }

    public J(String str, String str2, int i12, int i13, @j.N C38737cm c38737cm) {
        this.f378538r = new HashMap<>();
        a(c38737cm);
        this.f380255b = h(str);
        this.f380254a = g(str2);
        this.f380258e = i12;
        this.f380259f = i13;
    }

    private void a(@j.P String str, @j.P String str2, a aVar) {
        if (C38689b.b(str, str2)) {
            this.f378538r.put(aVar, Integer.valueOf(C38689b.b(str).length - C38689b.b(str2).length));
        } else {
            this.f378538r.remove(aVar);
        }
        u();
    }

    public J(byte[] bArr, @j.P String str, int i12, @j.N C38737cm c38737cm) {
        this.f378538r = new HashMap<>();
        a(c38737cm);
        a(bArr);
        this.f380254a = g(str);
        this.f380258e = i12;
    }

    @Override // com.yandex.metrica.impl.ob.C38715c0
    public final C38715c0 a(@j.P byte[] bArr) {
        byte[] bArrA = this.f378542v.a(bArr);
        a aVar = a.VALUE;
        if (bArr.length != bArrA.length) {
            this.f378538r.put(aVar, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f378538r.remove(aVar);
        }
        u();
        return super.a(bArrA);
    }

    @j.N
    public static C38715c0 a(@j.P String str, @j.N C38737cm c38737cm) {
        J j12 = new J(c38737cm);
        j12.f380258e = EnumC38666a1.EVENT_TYPE_SET_USER_PROFILE_ID.b();
        return super.d(j12.f378543w.a(str));
    }
}
