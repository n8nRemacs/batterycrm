package e11;

/* renamed from: e11.o0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39893o0 extends T0<C39919x0> {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    @Override // e11.T0
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e11.AbstractC39858c1 a(@j.N e11.AbstractC39858c1 r10, @j.N e11.C39901r0 r11, @j.N android.content.Context r12) {
        /*
            r9 = this;
            e11.x0 r10 = (e11.C39919x0) r10
            long r0 = r11.f394766c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6f
            boolean r0 = r10.f394879e
            if (r0 != 0) goto L6f
            org.json.JSONObject r0 = r10.f394878d
            if (r0 == 0) goto L6f
            e11.B r0 = e11.C39847B.a(r12)
            int r1 = r11.f394772i
            if (r0 == 0) goto L6f
            org.json.JSONObject r2 = r10.f394878d
            java.lang.String r2 = r2.toString()
            monitor-enter(r0)
            r0.c()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = ".json"
            java.io.File r1 = r0.b(r1, r3)     // Catch: java.lang.Throwable -> L6c
            r1.getPath()     // Catch: java.lang.Throwable -> L6c
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            r1.exists()     // Catch: java.lang.Throwable -> L6c
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L5c
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)     // Catch: java.lang.Throwable -> L5c
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L5c
            r5.write(r2)     // Catch: java.lang.Throwable -> L60
            r5.close()     // Catch: java.lang.Throwable -> L60
            boolean r2 = r1.setLastModified(r3)     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L5e
            r1.getPath()     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r1 = move-exception
            goto L62
        L5e:
            monitor-exit(r0)
            goto L6f
        L60:
            r1 = move-exception
            goto L63
        L62:
            r5 = 0
        L63:
            r1.toString()     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5e
            goto L5e
        L6c:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r10
        L6f:
            int r11 = r11.f394771h
            if (r11 == 0) goto L76
            r0 = 1
            if (r11 != r0) goto Ldc
        L76:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<e11.E> r1 = r10.f394876b
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lce
            java.lang.Object r1 = r0.next()
            e11.E r1 = (e11.E) r1
            com.my.target.common.models.b r2 = r1.f394325W
            com.my.target.common.models.b r3 = r1.f394322T
            com.my.target.common.models.b r4 = r1.f394324V
            com.my.target.common.models.b r5 = r1.f394717p
            com.my.target.common.models.b r6 = r1.f394323U
            com.my.target.common.models.b r7 = r1.f394326X
            com.my.target.common.models.b r8 = r1.f394327Y
            com.my.target.common.models.b r1 = r1.f394328Z
            if (r2 == 0) goto Laa
            r11.add(r2)
        Laa:
            if (r3 == 0) goto Laf
            r11.add(r3)
        Laf:
            if (r4 == 0) goto Lb4
            r11.add(r4)
        Lb4:
            if (r5 == 0) goto Lb9
            r11.add(r5)
        Lb9:
            if (r6 == 0) goto Lbe
            r11.add(r6)
        Lbe:
            if (r7 == 0) goto Lc3
            r11.add(r7)
        Lc3:
            if (r8 == 0) goto Lc8
            r11.add(r8)
        Lc8:
            if (r1 == 0) goto L89
            r11.add(r1)
            goto L89
        Lce:
            int r0 = r11.size()
            if (r0 <= 0) goto Ldc
            com.my.target.o r0 = new com.my.target.o
            r0.<init>(r11)
            r0.d(r12)
        Ldc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39893o0.a(e11.c1, e11.r0, android.content.Context):e11.c1");
    }
}
