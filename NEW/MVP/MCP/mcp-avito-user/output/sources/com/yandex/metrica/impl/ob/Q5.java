package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.google.protobuf.nano.ym.MessageNano;

/* loaded from: classes7.dex */
public class Q5 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final O5 f379247a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final P5 f379248b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final R7 f379249c;

    public Q5(@j.N Context context, @j.N I3 i32) {
        this(new P5(), new O5(), C38899ja.a(context).a(i32), "event_hashes");
    }

    @j.N
    public N5 a() {
        try {
            byte[] bArrA = this.f379249c.a("event_hashes");
            if (A2.a(bArrA)) {
                O5 o52 = this.f379247a;
                this.f379248b.getClass();
                return o52.toModel(new Af());
            }
            O5 o53 = this.f379247a;
            this.f379248b.getClass();
            return o53.toModel((Af) MessageNano.mergeFrom(new Af(), bArrA));
        } catch (Throwable unused) {
            O5 o54 = this.f379247a;
            this.f379248b.getClass();
            return o54.toModel(new Af());
        }
    }

    @j.k0
    public Q5(@j.N P5 p52, @j.N O5 o52, @j.N R7 r72, @j.N String str) {
        this.f379248b = p52;
        this.f379247a = o52;
        this.f379249c = r72;
    }

    public void a(@j.N N5 n52) {
        R7 r72 = this.f379249c;
        P5 p52 = this.f379248b;
        Af afFromModel = this.f379247a.fromModel(n52);
        p52.getClass();
        r72.a("event_hashes", MessageNano.toByteArray(afFromModel));
    }
}
