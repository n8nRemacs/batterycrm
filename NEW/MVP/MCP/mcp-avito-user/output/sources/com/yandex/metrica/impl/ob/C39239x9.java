package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39185v3;
import com.yandex.metrica.impl.ob.C39269yf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.x9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39239x9 implements ProtobufConverter {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r1
  0x0066: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:15:0x0060, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.yandex.metrica.impl.ob.C39269yf.a a(com.yandex.metrica.impl.ob.C39185v3.a r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.yf$a r0 = new com.yandex.metrica.impl.ob.yf$a
            r0.<init>()
            java.util.Map r1 = r10.b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L52
            com.yandex.metrica.impl.ob.yf$b r4 = new com.yandex.metrica.impl.ob.yf$b
            r4.<init>()
            int r5 = r1.size()
            com.yandex.metrica.impl.ob.yf$b$a[] r6 = new com.yandex.metrica.impl.ob.C39269yf.b.a[r5]
            r7 = r2
        L19:
            if (r7 >= r5) goto L25
            com.yandex.metrica.impl.ob.yf$b$a r8 = new com.yandex.metrica.impl.ob.yf$b$a
            r8.<init>()
            r6[r7] = r8
            int r7 = r7 + 1
            goto L19
        L25:
            r4.f382250a = r6
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r5 = r2
        L30:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            com.yandex.metrica.impl.ob.yf$b$a[] r8 = r4.f382250a
            r8 = r8[r5]
            r8.f382252a = r7
            r8.f382253b = r6
            int r5 = r5 + r3
            goto L30
        L52:
            r4 = 0
        L53:
            r0.f382248a = r4
            com.yandex.metrica.impl.ob.u0 r10 = r10.a()
            int r10 = r10.ordinal()
            if (r10 == r3) goto L68
            r1 = 2
            if (r10 == r1) goto L66
            r1 = 3
            if (r10 == r1) goto L66
            goto L69
        L66:
            r2 = r1
            goto L69
        L68:
            r2 = r3
        L69:
            r0.f382249b = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39239x9.a(com.yandex.metrica.impl.ob.v3$a):com.yandex.metrica.impl.ob.yf$a");
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object fromModel(Object obj) {
        C39185v3 c39185v3 = (C39185v3) obj;
        C39269yf c39269yf = new C39269yf();
        c39269yf.f382245a = a(c39185v3.c());
        int size = c39185v3.a().size();
        C39269yf.a[] aVarArr = new C39269yf.a[size];
        for (int i12 = 0; i12 < size; i12++) {
            aVarArr[i12] = a(c39185v3.a().get(i12));
        }
        c39269yf.f382246b = aVarArr;
        return c39269yf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object toModel(Object obj) {
        C39269yf c39269yf = (C39269yf) obj;
        C39269yf.a aVar = c39269yf.f382245a;
        if (aVar == null) {
            aVar = new C39269yf.a();
        }
        C39185v3.a aVarA = a(aVar);
        C39269yf.a[] aVarArr = c39269yf.f382246b;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C39269yf.a aVar2 : aVarArr) {
            arrayList.add(a(aVar2));
        }
        return new C39185v3(aVarA, arrayList);
    }

    private final C39185v3.a a(C39269yf.a aVar) {
        EnumC39158u0 enumC39158u0;
        C39269yf.b bVar = aVar.f382248a;
        Map<String, String> mapA = bVar != null ? a(bVar) : null;
        int i12 = aVar.f382249b;
        if (i12 == 0) {
            enumC39158u0 = EnumC39158u0.UNDEFINED;
        } else if (i12 == 1) {
            enumC39158u0 = EnumC39158u0.APP;
        } else if (i12 == 2) {
            enumC39158u0 = EnumC39158u0.SATELLITE;
        } else if (i12 != 3) {
            enumC39158u0 = EnumC39158u0.UNDEFINED;
        } else {
            enumC39158u0 = EnumC39158u0.RETAIL;
        }
        return new C39185v3.a(mapA, enumC39158u0);
    }

    private final Map<String, String> a(C39269yf.b bVar) {
        C39269yf.b.a[] aVarArr = bVar.f382250a;
        int iF2 = kotlin.collections.P0.f(aVarArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (C39269yf.b.a aVar : aVarArr) {
            linkedHashMap.put(aVar.f382252a, aVar.f382253b);
        }
        return linkedHashMap;
    }
}
