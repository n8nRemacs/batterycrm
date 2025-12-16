package com.my.target;

import com.my.target.AbstractC37822y0;
import com.my.target.Z;
import e11.C39893o0;
import e11.C39919x0;

/* loaded from: classes7.dex */
public final class K extends Z<C39919x0> {

    public static class b implements Z.a<C39919x0> {
        public b() {
        }

        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37822y0 a() {
            return new AbstractC37822y0.a();
        }

        @Override // com.my.target.Z.a
        public final boolean b() {
            return false;
        }

        @Override // com.my.target.Z.a
        @j.P
        public final e11.T0<C39919x0> c() {
            return new C39893o0();
        }

        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37789h0<C39919x0> d() {
            return new P();
        }
    }

    public interface c extends Z.b<C39919x0> {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    @Override // com.my.target.Z
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(@j.N e11.C39882k1 r10, @j.N e11.C39885l1 r11, @j.N java.util.HashMap r12, @j.N android.content.Context r13) {
        /*
            r9 = this;
            e11.r0 r0 = r9.f364677b
            long r0 = r0.f394766c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lba
            e11.B r0 = e11.C39847B.a(r13)
            r1 = 0
            if (r0 == 0) goto Lb4
            e11.r0 r2 = r9.f364677b
            int r3 = r2.f394772i
            long r4 = r2.f394766c
            monitor-enter(r0)
            r0.c()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = java.lang.Integer.toString(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = ".json"
            java.io.File r2 = r0.b(r2, r3)     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4e
            boolean r3 = r2.isFile()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L50
            long r6 = r2.lastModified()     // Catch: java.lang.Throwable -> L4b
            long r6 = r6 + r4
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4b
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L50
            r2.getPath()     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> L4b
            if (r3 != 0) goto L4e
            r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L4b
            goto L4e
        L4b:
            r10 = move-exception
            goto Lb2
        L4e:
            monitor-exit(r0)
            goto Lb4
        L50:
            r2.getPath()     // Catch: java.lang.Throwable -> L4b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L99
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Throwable -> L7e
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L7e
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7e
            r4 = 1024(0x400, float:1.435E-42)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L7e
        L6d:
            int r6 = r5.read(r4)     // Catch: java.lang.Throwable -> L7e
            r7 = -1
            if (r6 == r7) goto L80
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L7e
            r8 = 0
            r7.<init>(r4, r8, r6)     // Catch: java.lang.Throwable -> L7e
            r2.append(r7)     // Catch: java.lang.Throwable -> L7e
            goto L6d
        L7e:
            r2 = move-exception
            goto L9b
        L80:
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L8f
            r3.close()     // Catch: java.lang.Throwable -> L8a
            goto L4e
        L8a:
            r2 = move-exception
        L8b:
            r2.toString()     // Catch: java.lang.Throwable -> L4b
            goto L4e
        L8f:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L7e
            r3.close()     // Catch: java.lang.Throwable -> L97
            goto L4e
        L97:
            r2 = move-exception
            goto L8b
        L99:
            r2 = move-exception
            r3 = r1
        L9b:
            r2.toString()     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.lang.Throwable -> La4
            goto L4e
        La4:
            r2 = move-exception
            goto L8b
        La6:
            r10 = move-exception
            if (r3 == 0) goto Lb1
            r3.close()     // Catch: java.lang.Throwable -> Lad
            goto Lb1
        Lad:
            r11 = move-exception
            r11.toString()     // Catch: java.lang.Throwable -> L4b
        Lb1:
            throw r10     // Catch: java.lang.Throwable -> L4b
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r10
        Lb4:
            if (r1 == 0) goto Lba
            r11 = 1
            r10.f394662t = r11
            return r1
        Lba:
            java.lang.String r10 = super.e(r10, r11, r12, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.K.e(e11.k1, e11.l1, java.util.HashMap, android.content.Context):java.lang.String");
    }
}
