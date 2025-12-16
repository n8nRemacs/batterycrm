package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.e8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38773e8 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C38698b8> f380440a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final B0 f380441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Q7 f380442c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final C38673a8 f380443d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final C38673a8 f380444e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f380445f;

    public C38773e8(@Y61.k Context context) {
        this.f380445f = context;
        B0 b02 = new B0();
        this.f380441b = b02;
        Q7 q72 = new Q7(context, "appmetrica_vital.dat", b02);
        this.f380442c = q72;
        this.f380443d = new C38673a8(F0.g().s(), q72);
        this.f380444e = new C38673a8(new C38774e9(C38899ja.a(context).j()), q72);
    }

    @Y61.k
    public final C38673a8 a() {
        return this.f380443d;
    }

    @Y61.k
    public final C38673a8 b() {
        return this.f380444e;
    }

    @Y61.k
    public final synchronized C38698b8 a(@Y61.k I3 i32) {
        C38698b8 c38698b8;
        try {
            String strValueOf = String.valueOf(i32.a());
            Map<String, C38698b8> map = this.f380440a;
            c38698b8 = map.get(strValueOf);
            if (c38698b8 == null) {
                c38698b8 = new C38698b8(new C38724c9(C38899ja.a(this.f380445f).b(i32)), new Q7(this.f380445f, "appmetrica_vital_" + i32.a() + ".dat", this.f380441b), strValueOf);
                map.put(strValueOf, c38698b8);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c38698b8;
    }
}
