package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.Lg;
import com.yandex.metrica.impl.ob.U3.b;

/* loaded from: classes7.dex */
public class V3 extends M3 {

    /* renamed from: m, reason: collision with root package name */
    private final Pm f379757m;

    public V3(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N AbstractC39200vi abstractC39200vi, @j.N C39057pi c39057pi, @j.N Lg.e eVar, @j.N ICommonExecutor iCommonExecutor, int i12, @j.N Pm pm2, @j.N C38791f1 c38791f1) {
        super(context, i32, aVar, abstractC39200vi, c39057pi, eVar, iCommonExecutor, i12, c38791f1);
        this.f379757m = pm2;
    }

    @j.N
    public C38996n7 a(@j.N C38872i7 c38872i7, @j.N InterfaceC38797f7<String> interfaceC38797f7, @j.N C38724c9 c38724c9) {
        return new C38996n7(this.f378865c, new B0(), c38872i7, interfaceC38797f7, F0.g().q().e(), c38724c9);
    }

    @j.N
    public InterfaceC38797f7<String> b(@j.N U3 u32) {
        return new C38946l7(u32);
    }

    @j.N
    public C39150tg c(@j.N U3 u32) {
        return new C39150tg(new C38955lg(u32), u32.new b(), u32);
    }

    @j.N
    public C38872i7 f() {
        return new C38872i7(new C38722c7(EnumC38822g7.BREAKPAD, null), new C38847h7(new P6()));
    }

    @j.N
    public C38768e3 a(@j.N U3 u32) {
        return new C38768e3(this.f378865c, this.f379757m.a(), this.f379757m.i(), C38793f3.a(), new C38718c3(this.f378865c), new C38693b3(u32, F0.g().q().e()), F0.g().b(), new C38743d3());
    }
}
