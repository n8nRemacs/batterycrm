package com.yandex.metrica.impl.ob;

import java.util.List;

/* loaded from: classes7.dex */
public class Wc extends V {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I2 f379817b;

    public Wc(@j.P V v12, @j.N I2 i22) {
        super(null);
        this.f379817b = i22;
    }

    @Override // com.yandex.metrica.impl.ob.V
    public void b(@j.P Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.f379817b.b((I2) list);
        }
    }
}
