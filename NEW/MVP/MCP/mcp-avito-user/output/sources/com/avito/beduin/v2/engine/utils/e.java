package com.avito.beduin.v2.engine.utils;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.exception.AbstractBeduinException;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ExceptionUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {
    @l
    public static final String a(@k com.avito.beduin.v2.engine.field.entity.c cVar, @k z zVar) {
        Object bVar;
        com.avito.beduin.v2.engine.field.d dVarA;
        v vVarQ;
        try {
            int i12 = Z.f406624c;
            com.avito.beduin.v2.engine.field.f<?> fVar = cVar.f336790e.f336867a.get("tag");
            bVar = (fVar == null || (dVarA = fVar.a(zVar, cVar.f336791f)) == null || (vVarQ = dVarA.q(zVar)) == null) ? null : vVarQ.getF336843b();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        String str = (String) (bVar instanceof Z.b ? null : bVar);
        return str == null ? cVar.f336793h : str;
    }

    public static final void b(@k AbstractBeduinException abstractBeduinException, @k String str, @l String str2) {
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (4 >= RU0.b.f14469c) {
            RU0.c cVar = RU0.b.f14468b;
            String strO = H.o(new StringBuilder(), RU0.b.f14470d, ':', str);
            if (str2 == null) {
                str2 = d.c(d.b(abstractBeduinException), d.a(abstractBeduinException.getCause()));
            }
            cVar.e(strO, str2, abstractBeduinException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.beduin.v2.engine.utils.b c(@Y61.k com.avito.beduin.v2.engine.core.z r6, @Y61.k com.avito.beduin.v2.engine.field.m r7) {
        /*
            java.lang.String r0 = "type"
            com.avito.beduin.v2.engine.field.d r0 = r7.c(r0)
            r1 = 0
            if (r0 == 0) goto L17
            com.avito.beduin.v2.engine.field.entity.v r0 = r0.q(r6)
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.getF336843b()
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L19
        L17:
            java.lang.String r0 = "Unknown"
        L19:
            java.lang.String r2 = "property"
            com.avito.beduin.v2.engine.field.d r2 = r7.c(r2)
            if (r2 == 0) goto L2c
            com.avito.beduin.v2.engine.field.entity.v r2 = r2.q(r6)
            if (r2 == 0) goto L2c
            java.lang.String r2 = r2.getF336843b()
            goto L2d
        L2c:
            r2 = r1
        L2d:
            java.lang.String r3 = "trace"
            com.avito.beduin.v2.engine.field.d r7 = r7.c(r3)
            r3 = 0
            if (r7 == 0) goto L72
            com.avito.beduin.v2.engine.field.entity.a r7 = r7.l(r6)
            if (r7 == 0) goto L72
            java.util.List<com.avito.beduin.v2.engine.field.d> r7 = r7.f336782b
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r7.iterator()
        L49:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L67
            java.lang.Object r5 = r7.next()
            com.avito.beduin.v2.engine.field.d r5 = (com.avito.beduin.v2.engine.field.d) r5
            com.avito.beduin.v2.engine.field.entity.v r5 = r5.q(r6)
            if (r5 == 0) goto L60
            java.lang.String r5 = r5.getF336843b()
            goto L61
        L60:
            r5 = r1
        L61:
            if (r5 == 0) goto L49
            r4.add(r5)
            goto L49
        L67:
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.Object[] r6 = r4.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r6 == 0) goto L72
            goto L74
        L72:
            java.lang.String[] r6 = new java.lang.String[r3]
        L74:
            com.avito.beduin.v2.engine.utils.b r7 = new com.avito.beduin.v2.engine.utils.b
            r7.<init>(r0, r2, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.utils.e.c(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.utils.b");
    }

    public static final m d(z zVar, String str, String str2, Exception exc) {
        Q q12 = new Q("type", C36273j.e(zVar, str));
        Q q13 = new Q("property", str2 != null ? C36273j.e(zVar, str2) : com.avito.beduin.v2.engine.field.entity.f.f336800b);
        List listA = d.a(exc);
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(C36273j.e(zVar, (String) it.next()));
        }
        return new m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{q12, q13, new Q("trace", new C36268a(arrayList))});
    }
}
