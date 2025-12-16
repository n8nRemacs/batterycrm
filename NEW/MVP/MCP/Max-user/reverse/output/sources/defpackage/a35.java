package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class a35 {
    public static p3b a(byte[] bArr, yi5 yi5Var) {
        Protos.MessageElement[] messageElementArr;
        if (bArr.length != 0) {
            try {
                ppc ppcVar = (ppc) fl9.mergeFrom(new ppc(), bArr);
                String str = ppcVar.b;
                Protos.MessageElements messageElements = ppcVar.i;
                y08 y08Var = new y08(str, (messageElements == null || (messageElementArr = messageElements.elements) == null || messageElementArr.length == 0) ? null : dj9.a(messageElementArr));
                long j = ppcVar.k;
                long j2 = ppcVar.d;
                Long lValueOf = j2 == 0 ? null : Long.valueOf(j2);
                long j3 = ppcVar.c;
                Long lValueOf2 = j3 == 0 ? null : Long.valueOf(j3);
                long j4 = ppcVar.h;
                return new p3b(j, y08Var, lValueOf, lValueOf2, j4 == 0 ? null : Long.valueOf(j4), ppcVar.j, 64);
            } catch (Exception e) {
                wqi.b(a35.class.getName(), "Can't parse draft", e);
                if (yi5Var != null) {
                    ((y3b) yi5Var).a(new IllegalStateException("Can't parse draft", e));
                } else {
                    wqi.e(a35.class.getName(), "Can't parse draft", e);
                }
            }
        }
        return null;
    }

    public static byte[] b(p3b p3bVar) {
        if (!(p3bVar instanceof p3b) || p3bVar.d()) {
            return coi.e;
        }
        ppc ppcVar = new ppc();
        ppcVar.k = p3bVar.a;
        y08 y08Var = p3bVar.b;
        if (!qzi.b(y08Var)) {
            ppcVar.b = y08Var.a;
            List list = y08Var.b;
            if (list != null && !list.isEmpty()) {
                ppcVar.i = dj9.c(list);
            }
        }
        Long l = p3bVar.d;
        ppcVar.c = l != null ? l.longValue() : 0L;
        Long l2 = p3bVar.c;
        ppcVar.d = l2 != null ? l2.longValue() : 0L;
        Long l3 = p3bVar.e;
        ppcVar.h = l3 != null ? l3.longValue() : 0L;
        ppcVar.j = p3bVar.f;
        return fl9.toByteArray(ppcVar);
    }
}
