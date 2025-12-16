package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes.dex */
public abstract class jsi {
    public static String a() {
        ej3 ej3VarA = ks4.a();
        if (ej3VarA == null) {
            return "Association(type=0)";
        }
        ej3VarA.a();
        imb imbVar = (imb) ej3VarA.d.get(0);
        if (imbVar == null) {
            return "Association(type=0)";
        }
        StringBuilder sb = new StringBuilder("Association(keyType=");
        sb.append((String) imbVar.a);
        sb.append(", valueType=");
        return u45.l(sb, (String) imbVar.b, ')');
    }

    public static final List b(MessageModel messageModel) {
        Object h09Var;
        Object b09Var;
        t98 h09Var2;
        boolean z = messageModel.v0;
        m00 m00Var = messageModel.t0.b;
        if ((m00Var instanceof ws8) || (m00Var instanceof hv5)) {
            if (m00Var instanceof ae3) {
                ArrayList arrayList = ((ae3) m00Var).b;
                ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jd3 jd3Var = (jd3) it.next();
                    if (jd3Var instanceof od7) {
                        if (z) {
                            od7 od7Var = (od7) jd3Var;
                            long j = od7Var.a;
                            String str = od7Var.k;
                            h09Var2 = new tz8(messageModel.a, j, m00Var, str == null ? "" : str);
                        } else {
                            od7 od7Var2 = (od7) jd3Var;
                            h09Var2 = new b09(messageModel.a, od7Var2.a, m00Var, od7Var2, null, 48);
                        }
                    } else {
                        if (!(jd3Var instanceof s0h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (z) {
                            s0h s0hVar = (s0h) jd3Var;
                            long j2 = s0hVar.a;
                            String str2 = s0hVar.g;
                            h09Var2 = new tz8(messageModel.a, j2, m00Var, str2 == null ? "" : str2);
                        } else {
                            s0h s0hVar2 = (s0h) jd3Var;
                            h09Var2 = new h09(messageModel.a, s0hVar2.a, m00Var, s0hVar2);
                        }
                    }
                    arrayList2.add(h09Var2);
                }
                return arrayList2;
            }
            if (m00Var instanceof n2f) {
                if (z) {
                    od7 od7Var3 = ((n2f) m00Var).c;
                    long j3 = od7Var3.a;
                    String str3 = od7Var3.k;
                    b09Var = new tz8(messageModel.a, j3, m00Var, str3 == null ? "" : str3);
                } else {
                    long j4 = messageModel.a;
                    od7 od7Var4 = ((n2f) m00Var).c;
                    b09Var = new b09(j4, od7Var4.a, m00Var, od7Var4, null, 48);
                }
                return Collections.singletonList(b09Var);
            }
            if (m00Var instanceof s3f) {
                if (z) {
                    s0h s0hVar3 = ((s3f) m00Var).c;
                    long j5 = s0hVar3.a;
                    String str4 = s0hVar3.g;
                    h09Var = new tz8(messageModel.a, j5, m00Var, str4 == null ? "" : str4);
                } else {
                    long j6 = messageModel.a;
                    s0h s0hVar4 = ((s3f) m00Var).c;
                    h09Var = new h09(j6, s0hVar4.a, m00Var, s0hVar4);
                }
                return Collections.singletonList(h09Var);
            }
            if (m00Var instanceof hv5) {
                ArrayList arrayList3 = new ArrayList();
                hv5 hv5Var = (hv5) m00Var;
                od7 od7Var5 = hv5Var.j;
                s0h s0hVar5 = hv5Var.k;
                if (z && od7Var5 != null) {
                    arrayList3.add(new tz8(messageModel.a, od7Var5.a, m00Var, hv5Var.c));
                    return arrayList3;
                }
                if (z && s0hVar5 != null) {
                    arrayList3.add(new tz8(messageModel.a, s0hVar5.a, m00Var, hv5Var.c));
                    return arrayList3;
                }
                if (od7Var5 != null) {
                    arrayList3.add(new b09(messageModel.a, od7Var5.a, m00Var, od7Var5, hv5Var.c, 16));
                    return arrayList3;
                }
                if (s0hVar5 != null) {
                    arrayList3.add(new h09(messageModel.a, s0hVar5.a, m00Var, s0hVar5, hv5Var.c));
                }
                return arrayList3;
            }
        }
        return hd5.a;
    }
}
