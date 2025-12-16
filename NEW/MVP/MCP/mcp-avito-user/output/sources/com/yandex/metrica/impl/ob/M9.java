package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39205w;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class M9 implements ProtobufConverter {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r6
  0x0035: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:8:0x0030, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.yandex.metrica.impl.ob.If.k.b fromModel(@j.N com.yandex.metrica.impl.ob.Ac r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.If$k$b r0 = new com.yandex.metrica.impl.ob.If$k$b
            r0.<init>()
            java.util.List<com.yandex.metrica.impl.ob.E$b$a> r1 = r10.f377769a
            int r1 = r1.size()
            int[] r1 = new int[r1]
            r0.f378418a = r1
            java.util.List<com.yandex.metrica.impl.ob.E$b$a> r1 = r10.f377769a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L17:
            boolean r4 = r1.hasNext()
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r1.next()
            com.yandex.metrica.impl.ob.E$b$a r4 = (com.yandex.metrica.impl.ob.E.b.a) r4
            int[] r8 = r0.f378418a
            int r4 = r4.ordinal()
            if (r4 == r7) goto L39
            if (r4 == r6) goto L37
            if (r4 == r5) goto L35
            r6 = 4
            if (r4 == r6) goto L3a
        L35:
            r5 = r6
            goto L3a
        L37:
            r5 = r7
            goto L3a
        L39:
            r5 = r2
        L3a:
            r8[r3] = r5
            int r3 = r3 + r7
            goto L17
        L3e:
            java.util.List<com.yandex.metrica.impl.ob.w$a> r1 = r10.f377770b
            int r1 = r1.size()
            int[] r1 = new int[r1]
            r0.f378419b = r1
            java.util.List<com.yandex.metrica.impl.ob.w$a> r10 = r10.f377770b
            java.util.Iterator r10 = r10.iterator()
            r1 = r2
        L4f:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r10.next()
            com.yandex.metrica.impl.ob.w$a r3 = (com.yandex.metrica.impl.ob.C39205w.a) r3
            int[] r4 = r0.f378419b
            int r3 = r3.ordinal()
            if (r3 == r7) goto L69
            if (r3 == r6) goto L67
            r3 = r5
            goto L6a
        L67:
            r3 = r6
            goto L6a
        L69:
            r3 = r2
        L6a:
            r4[r1] = r3
            int r1 = r1 + r7
            goto L4f
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.M9.fromModel(com.yandex.metrica.impl.ob.Ac):com.yandex.metrica.impl.ob.If$k$b");
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ac toModel(@j.N If.k.b bVar) {
        E.b.a aVar;
        C39205w.a aVar2;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        if (bVar.f378418a.length != 0) {
            int i13 = 0;
            while (true) {
                int[] iArr = bVar.f378418a;
                if (i13 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i13];
                if (i14 == 0) {
                    aVar = E.b.a.NONE;
                } else if (i14 == 1) {
                    aVar = E.b.a.USB;
                } else if (i14 == 2) {
                    aVar = E.b.a.WIRELESS;
                } else if (i14 != 3) {
                    aVar = E.b.a.UNKNOWN;
                } else {
                    aVar = E.b.a.AC;
                }
                arrayList.add(aVar);
                i13++;
            }
        } else {
            arrayList.addAll(Arrays.asList(E.b.a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.f378419b.length != 0) {
            while (true) {
                int[] iArr2 = bVar.f378419b;
                if (i12 >= iArr2.length) {
                    break;
                }
                int i15 = iArr2[i12];
                if (i15 == 0) {
                    aVar2 = C39205w.a.BACKGROUND;
                } else if (i15 != 2) {
                    aVar2 = C39205w.a.UNKNOWN;
                } else {
                    aVar2 = C39205w.a.VISIBLE;
                }
                arrayList2.add(aVar2);
                i12++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(C39205w.a.values()));
        }
        return new Ac(arrayList, arrayList2);
    }
}
