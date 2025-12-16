package bU;

import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import com.akita.compose.foundation.p;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ThemeColors.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_renderer-compose_component_base"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.akita.compose.foundation.p a(com.avito.beduin.v2.theme.f r7, com.avito.beduin.v2.theme.k r8) {
        /*
            java.lang.Object r7 = r7.a()
            com.avito.beduin.v2.theme.r$b r7 = (com.avito.beduin.v2.theme.r.b) r7
            r0 = 0
            if (r7 != 0) goto Lb
            goto La4
        Lb:
            com.avito.beduin.v2.theme.f<java.lang.String> r1 = r7.f338371c
            java.lang.Object r1 = r1.a()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1a
            java.lang.String r1 = com.avito.beduin.v2.theme.y.b(r1)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            if (r1 == 0) goto L26
            com.avito.beduin.v2.theme.a r8 = r8.f338363a
            java.lang.Object r8 = r8.a(r1)
            com.avito.beduin.v2.render.compose.j r8 = (com.avito.beduin.v2.render.compose.j) r8
            goto L27
        L26:
            r8 = r0
        L27:
            if (r8 == 0) goto L36
            com.akita.compose.foundation.p r0 = new com.akita.compose.foundation.p
            r6 = 0
            long r2 = r8.f338078a
            long r4 = r8.f338079b
            r1 = r0
            r1.<init>(r2, r4, r6)
            goto La4
        L36:
            r8 = 0
            com.avito.beduin.v2.theme.f r8 = r7.a(r8)
            java.lang.Object r8 = r8.a()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L5b
            ET0.f r1 = ET0.f.f4020a
            r1.getClass()
            java.lang.Integer r8 = ET0.f.a(r8)
            if (r8 == 0) goto L5b
            int r8 = r8.intValue()
            long r1 = androidx.compose.ui.graphics.V.b(r8)
            androidx.compose.ui.graphics.T r8 = androidx.compose.ui.graphics.T.a(r1)
            goto L5c
        L5b:
            r8 = r0
        L5c:
            r1 = 1
            com.avito.beduin.v2.theme.f r7 = r7.a(r1)
            java.lang.Object r7 = r7.a()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L80
            ET0.f r1 = ET0.f.f4020a
            r1.getClass()
            java.lang.Integer r7 = ET0.f.a(r7)
            if (r7 == 0) goto L80
            int r7 = r7.intValue()
            long r0 = androidx.compose.ui.graphics.V.b(r7)
            androidx.compose.ui.graphics.T r0 = androidx.compose.ui.graphics.T.a(r0)
        L80:
            com.akita.compose.foundation.p r7 = new com.akita.compose.foundation.p
            if (r8 == 0) goto L88
            long r1 = r8.f39331a
        L86:
            r2 = r1
            goto L90
        L88:
            androidx.compose.ui.graphics.T$a r8 = androidx.compose.ui.graphics.T.f39320b
            r8.getClass()
            long r1 = androidx.compose.ui.graphics.T.f39330l
            goto L86
        L90:
            if (r0 == 0) goto L96
            long r0 = r0.f39331a
        L94:
            r4 = r0
            goto L9e
        L96:
            androidx.compose.ui.graphics.T$a r8 = androidx.compose.ui.graphics.T.f39320b
            r8.getClass()
            long r0 = androidx.compose.ui.graphics.T.f39330l
            goto L94
        L9e:
            r6 = 0
            r1 = r7
            r1.<init>(r2, r4, r6)
            r0 = r7
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bU.j.a(com.avito.beduin.v2.theme.f, com.avito.beduin.v2.theme.k):com.akita.compose.foundation.p");
    }

    public static p b(r rVar, com.avito.beduin.v2.theme.k kVar) {
        long j12;
        long j13;
        String str = rVar.f338368c;
        String strB = str != null ? y.b(str) : null;
        com.avito.beduin.v2.render.compose.j jVar = strB != null ? (com.avito.beduin.v2.render.compose.j) kVar.f338363a.a(strB) : null;
        if (jVar != null) {
            return new p(jVar.f338078a, jVar.f338079b, null);
        }
        String strA = rVar.a(false);
        ET0.f.f4020a.getClass();
        Integer numA = ET0.f.a(strA);
        T tA2 = numA != null ? T.a(V.b(numA.intValue())) : null;
        Integer numA2 = ET0.f.a(rVar.a(true));
        T tA3 = numA2 != null ? T.a(V.b(numA2.intValue())) : null;
        if (tA2 != null) {
            j12 = tA2.f39331a;
        } else {
            T.f39320b.getClass();
            j12 = T.f39330l;
        }
        long j14 = j12;
        if (tA3 != null) {
            j13 = tA3.f39331a;
        } else {
            T.f39320b.getClass();
            j13 = T.f39330l;
        }
        return new p(j14, j13, null);
    }
}
