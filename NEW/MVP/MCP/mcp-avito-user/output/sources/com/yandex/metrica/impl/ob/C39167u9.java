package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39221wf;
import com.yandex.metrica.impl.ob.C39277z;

/* renamed from: com.yandex.metrica.impl.ob.u9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39167u9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39221wf.a fromModel(@j.N C39277z c39277z) {
        C39221wf.a aVar = new C39221wf.a();
        C39277z.a aVar2 = c39277z.f382277a;
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                aVar.f382125a = 1;
            } else if (iOrdinal == 1) {
                aVar.f382125a = 2;
            } else if (iOrdinal == 2) {
                aVar.f382125a = 3;
            } else if (iOrdinal == 3) {
                aVar.f382125a = 4;
            } else if (iOrdinal == 4) {
                aVar.f382125a = 5;
            }
        }
        Boolean bool = c39277z.f382278b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f382126b = 1;
            } else {
                aVar.f382126b = 0;
            }
        }
        return aVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39277z toModel(@j.N C39221wf.a aVar) {
        C39277z.a aVar2;
        int i12 = aVar.f382125a;
        Boolean bool = null;
        if (i12 == 1) {
            aVar2 = C39277z.a.ACTIVE;
        } else if (i12 == 2) {
            aVar2 = C39277z.a.WORKING_SET;
        } else if (i12 == 3) {
            aVar2 = C39277z.a.FREQUENT;
        } else if (i12 != 4) {
            aVar2 = i12 != 5 ? null : C39277z.a.RESTRICTED;
        } else {
            aVar2 = C39277z.a.RARE;
        }
        int i13 = aVar.f382126b;
        if (i13 == 0) {
            bool = Boolean.FALSE;
        } else if (i13 == 1) {
            bool = Boolean.TRUE;
        }
        return new C39277z(aVar2, bool);
    }
}
