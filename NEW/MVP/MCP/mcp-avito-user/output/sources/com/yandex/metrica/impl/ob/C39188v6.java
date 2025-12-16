package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.U1;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.v6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39188v6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final N6 f382034a;

    public C39188v6() {
        this(new N6());
    }

    public U1.f a(@j.N H6 h62, @j.N Q1 q12) {
        String strB;
        F6 f62 = h62.f378242a;
        String str = "";
        if (f62 != null && (strB = f62.b()) != null) {
            str = strB;
        }
        byte[] bArrA = this.f382034a.a(h62);
        C38737cm c38737cmB = Ul.b(q12.b().c());
        List<Integer> list = C39278z0.f382293i;
        J j12 = new J(bArrA, str, EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), c38737cmB);
        j12.c(q12.d());
        return new U1.f(j12, q12).a(j12.t()).a(true);
    }

    @j.k0
    public C39188v6(@j.N N6 n62) {
        this.f382034a = n62;
    }
}
