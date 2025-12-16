package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38891j2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38916k2 f380822a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f380823b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Map<String, C38867i2> f380824c = new HashMap();

    public C38891j2(@j.N Context context, @j.N C38916k2 c38916k2) {
        this.f380823b = context;
        this.f380822a = c38916k2;
    }

    @j.N
    public synchronized C38867i2 a(@j.N String str, @j.N CounterConfiguration.b bVar) {
        C38867i2 c38867i2;
        c38867i2 = this.f380824c.get(str);
        if (c38867i2 == null) {
            c38867i2 = new C38867i2(str, this.f380823b, bVar, this.f380822a);
            this.f380824c.put(str, c38867i2);
        }
        return c38867i2;
    }
}
