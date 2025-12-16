package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes7.dex */
public class I4 extends K4<X4> {

    /* renamed from: a, reason: collision with root package name */
    private final E5 f378277a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<EnumC38666a1, AbstractC39235x5<X4>> f378278b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private C39139t5 f378279c;

    public I4(L3 l32) {
        E5 e52 = new E5(l32);
        this.f378277a = e52;
        this.f378279c = new C39139t5(e52);
        this.f378278b = a();
    }

    private HashMap<EnumC38666a1, AbstractC39235x5<X4>> a() {
        HashMap<EnumC38666a1, AbstractC39235x5<X4>> map = new HashMap<>();
        map.put(EnumC38666a1.EVENT_TYPE_ACTIVATION, new C39115s5(this.f378277a));
        map.put(EnumC38666a1.EVENT_TYPE_START, new H5(this.f378277a));
        map.put(EnumC38666a1.EVENT_TYPE_REGULAR, new B5(this.f378277a));
        C39283z5 c39283z5 = new C39283z5(this.f378277a);
        map.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_USER, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_SEND_REFERRER, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_STATBOX, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_CUSTOM_EVENT, c39283z5);
        EnumC38666a1 enumC38666a1 = EnumC38666a1.EVENT_TYPE_SET_SESSION_EXTRA;
        E5 e52 = this.f378277a;
        map.put(enumC38666a1, new G5(e52, e52.u()));
        map.put(EnumC38666a1.EVENT_TYPE_APP_OPEN, new D5(this.f378277a));
        map.put(EnumC38666a1.EVENT_TYPE_PURGE_BUFFER, new A5(this.f378277a));
        EnumC38666a1 enumC38666a12 = EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        E5 e53 = this.f378277a;
        map.put(enumC38666a12, new G5(e53, e53.l()));
        EnumC38666a1 enumC38666a13 = EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        E5 e54 = this.f378277a;
        map.put(enumC38666a13, new G5(e54, e54.l()));
        map.put(EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new C39211w5(this.f378277a));
        map.put(EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C39211w5(this.f378277a));
        map.put(EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new C39187v5(this.f378277a));
        EnumC38666a1 enumC38666a14 = EnumC38666a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        E5 e55 = this.f378277a;
        map.put(enumC38666a14, new G5(e55, e55.l()));
        map.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new J5(this.f378277a));
        I5 i52 = new I5(this.f378277a);
        map.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED, i52);
        map.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, i52);
        map.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, i52);
        map.put(EnumC38666a1.EVENT_TYPE_ANR, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_IDENTITY, new C39259y5(this.f378277a));
        map.put(EnumC38666a1.EVENT_TYPE_SET_USER_INFO, new F5(this.f378277a));
        EnumC38666a1 enumC38666a15 = EnumC38666a1.EVENT_TYPE_REPORT_USER_INFO;
        E5 e56 = this.f378277a;
        map.put(enumC38666a15, new G5(e56, e56.o()));
        EnumC38666a1 enumC38666a16 = EnumC38666a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        E5 e57 = this.f378277a;
        map.put(enumC38666a16, new G5(e57, e57.d()));
        EnumC38666a1 enumC38666a17 = EnumC38666a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        E5 e58 = this.f378277a;
        map.put(enumC38666a17, new G5(e58, e58.c()));
        map.put(EnumC38666a1.EVENT_TYPE_SEND_USER_PROFILE, c39283z5);
        EnumC38666a1 enumC38666a18 = EnumC38666a1.EVENT_TYPE_SET_USER_PROFILE_ID;
        E5 e59 = this.f378277a;
        map.put(enumC38666a18, new G5(e59, e59.x()));
        map.put(EnumC38666a1.EVENT_TYPE_SEND_REVENUE_EVENT, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_IDENTITY_LIGHT, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_CLEANUP, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_VIEW_TREE, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_RAW_VIEW_TREE, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_STATBOX_EXP, c39283z5);
        map.put(EnumC38666a1.EVENT_TYPE_WEBVIEW_SYNC, c39283z5);
        return map;
    }

    public E5 b() {
        return this.f378277a;
    }

    public void a(EnumC38666a1 enumC38666a1, AbstractC39235x5<X4> abstractC39235x5) {
        this.f378278b.put(enumC38666a1, abstractC39235x5);
    }

    @Override // com.yandex.metrica.impl.ob.K4
    public H4 a(int i12) {
        LinkedList linkedList = new LinkedList();
        EnumC38666a1 enumC38666a1A = EnumC38666a1.a(i12);
        C39139t5 c39139t5 = this.f378279c;
        if (c39139t5 != null) {
            c39139t5.a(enumC38666a1A, linkedList);
        }
        AbstractC39235x5<X4> abstractC39235x5 = this.f378278b.get(enumC38666a1A);
        if (abstractC39235x5 != null) {
            abstractC39235x5.a(linkedList);
        }
        return new H4(linkedList);
    }
}
