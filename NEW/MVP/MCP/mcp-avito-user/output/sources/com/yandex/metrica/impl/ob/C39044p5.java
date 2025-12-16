package com.yandex.metrica.impl.ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39044p5 extends X4 {
    public C39044p5(@Y61.k L3 l32) {
        super(l32);
        String strA = l32.e().a();
        if (strA != null) {
            A2.a(strA);
        }
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@Y61.k C38715c0 c38715c0) {
        for (Map.Entry<String, byte[]> entry : c38715c0.i().entrySet()) {
            a().u().a(entry.getKey(), entry.getValue());
        }
        return true;
    }
}
