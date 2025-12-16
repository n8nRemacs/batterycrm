package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.f4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38794f4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38724c9 f380526a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f380527b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39232x2 f380528c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private C39152ti f380529d;

    /* renamed from: e, reason: collision with root package name */
    private long f380530e;

    public C38794f4(@j.N Context context, @j.N I3 i32) {
        this(new C38724c9(C38899ja.a(context).b(i32)), new com.yandex.metrica.coreutils.services.e(), new C39232x2());
    }

    public boolean a(@j.P Boolean bool) {
        C39152ti c39152ti;
        return Boolean.FALSE.equals(bool) && (c39152ti = this.f380529d) != null && this.f380528c.a(this.f380530e, c39152ti.f381894a, "should report diagnostic");
    }

    public void a() {
        long jB2 = this.f380527b.b();
        this.f380530e = jB2;
        this.f380526a.d(jB2).d();
    }

    public C38794f4(@j.N C38724c9 c38724c9, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N C39232x2 c39232x2) {
        this.f380526a = c38724c9;
        this.f380527b = fVar;
        this.f380528c = c39232x2;
        this.f380530e = c38724c9.k();
    }

    public void a(@j.P C39152ti c39152ti) {
        this.f380529d = c39152ti;
    }
}
