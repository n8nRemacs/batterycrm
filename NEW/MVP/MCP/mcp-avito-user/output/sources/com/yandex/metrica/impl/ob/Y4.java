package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class Y4 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final IReporter f379950b;

    public Y4(@j.N L3 l32, @j.N IReporter iReporter) {
        super(l32);
        this.f379950b = iReporter;
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        C39092r6 c39092r6A = C39092r6.a(c38715c0.o());
        HashMap map = new HashMap();
        map.put("type", c39092r6A.f381727a);
        map.put("delivery_method", c39092r6A.f381728b);
        this.f379950b.reportEvent("crash_saved", map);
        return false;
    }
}
