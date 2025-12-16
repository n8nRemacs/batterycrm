package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.gpllibrary.a;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class H9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.k.a.b.C10955a fromModel(@j.N C38677ac c38677ac) {
        If.k.a.b.C10955a c10955a = new If.k.a.b.C10955a();
        c10955a.f378415a = c38677ac.f380120b;
        c10955a.f378416b = c38677ac.f380121c;
        int iOrdinal = c38677ac.f380119a.ordinal();
        int i12 = 1;
        if (iOrdinal != 1) {
            i12 = 2;
            if (iOrdinal != 2) {
                i12 = 3;
                if (iOrdinal != 3) {
                    i12 = 0;
                }
            }
        }
        c10955a.f378417c = i12;
        return c10955a;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38677ac toModel(@j.N If.k.a.b.C10955a c10955a) {
        a.b bVar;
        int i12 = c10955a.f378417c;
        if (i12 == 1) {
            bVar = a.b.f377705c;
        } else if (i12 == 2) {
            bVar = a.b.f377706d;
        } else if (i12 != 3) {
            bVar = a.b.f377704b;
        } else {
            bVar = a.b.f377707e;
        }
        return new C38677ac(bVar, c10955a.f378415a, c10955a.f378416b);
    }
}
