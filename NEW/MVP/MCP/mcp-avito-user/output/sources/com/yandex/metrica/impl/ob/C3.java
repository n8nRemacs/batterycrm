package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.Lg;

/* loaded from: classes7.dex */
public class C3 extends L3 {
    public C3(@j.N Context context, @j.N C39057pi c39057pi, @j.N I3 i32, @j.N D3.a aVar, @j.N Lg.e eVar, @j.N AbstractC39200vi abstractC39200vi) {
        this(context, i32, new B3(), new C39232x2(), new M3(context, i32, aVar, abstractC39200vi, c39057pi, eVar, F0.g().q().d(), A2.b(context, i32.b()), F0.g().h()));
    }

    @Override // com.yandex.metrica.impl.ob.L3
    @j.N
    public CounterConfiguration.b s() {
        return CounterConfiguration.b.APPMETRICA;
    }

    @j.k0
    public C3(@j.N Context context, @j.N I3 i32, @j.N B3 b32, @j.N C39232x2 c39232x2, @j.N M3 m32) {
        super(context, i32, b32, c39232x2, m32);
    }
}
