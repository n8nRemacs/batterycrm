package e11;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final k2 f394669a = new k2();

    public static void a(@j.N Context context, @j.P ArrayList arrayList) {
        k2 k2Var = f394669a;
        k2Var.getClass();
        if (arrayList.size() == 0) {
            return;
        }
        m2.c(new FX0.a(k2Var, arrayList, null, context, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(@j.N e11.X1 r4, @j.P java.util.HashMap r5, @j.P e11.K1 r6, @j.N android.content.Context r7) {
        /*
            boolean r0 = r4 instanceof e11.C39865f
            if (r0 == 0) goto Lc
            r0 = r4
            e11.f r0 = (e11.C39865f) r0
            float r0 = r0.f394592d
        L9:
            java.lang.String r0 = r4.f394507b
            goto L20
        Lc:
            boolean r0 = r4 instanceof e11.V1
            if (r0 == 0) goto L16
            r0 = r4
            e11.V1 r0 = (e11.V1) r0
        L13:
            int r0 = r0.f394417d
            goto L9
        L16:
            boolean r0 = r4 instanceof e11.Q
            if (r0 == 0) goto L1e
            r0 = r4
            e11.Q r0 = (e11.Q) r0
            goto L13
        L1e:
            java.lang.String r0 = r4.f394506a
        L20:
            java.lang.String r0 = r4.f394507b
            boolean r4 = r4.f394508c
            if (r4 == 0) goto L2a
            java.lang.String r0 = e11.F.a(r0)
        L2a:
            boolean r4 = android.webkit.URLUtil.isNetworkUrl(r0)
            r1 = 0
            if (r4 == 0) goto L32
            goto L33
        L32:
            r0 = r1
        L33:
            if (r0 != 0) goto L36
            return
        L36:
            if (r5 == 0) goto L7a
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L7a
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r4.appendQueryParameter(r3, r2)
            goto L4b
        L67:
            java.lang.StringBuilder r5 = androidx.compose.foundation.H.r(r0)
            android.net.Uri r4 = r4.build()
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L7a:
            android.content.Context r4 = r7.getApplicationContext()
            if (r6 != 0) goto L85
            e11.K1 r6 = new e11.K1
            r6.<init>()
        L85:
            r6.b(r0, r1, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.k2.b(e11.X1, java.util.HashMap, e11.K1, android.content.Context):void");
    }
}
