package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class fx7 implements Serializable {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final transient Object o;

    public fx7(int i, int i2, long j, long j2, Object obj) {
        this.o = obj;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof fx7)) {
            return false;
        }
        fx7 fx7Var = (fx7) obj;
        Object obj2 = fx7Var.o;
        Object obj3 = this.o;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return this.c == fx7Var.c && this.d == fx7Var.d && this.b == fx7Var.b && this.a == fx7Var.a;
    }

    public final int hashCode() {
        Object obj = this.o;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.c) + this.d) ^ ((int) this.b)) + ((int) this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            java.lang.String r1 = "[Source: "
            r0.append(r1)
            r1 = 93
            java.lang.Object r2 = r9.o
            if (r2 != 0) goto L19
            java.lang.String r2 = "UNKNOWN"
            r0.append(r2)
            goto Lcf
        L19:
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L21
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            goto L25
        L21:
            java.lang.Class r3 = r2.getClass()
        L25:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "java."
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L36
            java.lang.String r4 = r3.getSimpleName()
            goto L43
        L36:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L3d
            java.lang.String r4 = "byte[]"
            goto L43
        L3d:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto L43
            java.lang.String r4 = "char[]"
        L43:
            r3 = 40
            r0.append(r3)
            r0.append(r4)
            r3 = 41
            r0.append(r3)
            boolean r3 = r2 instanceof java.lang.CharSequence
            r4 = 34
            r5 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            java.lang.String r7 = " chars"
            if (r3 == 0) goto L7d
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r3 = r2.length()
            int r5 = java.lang.Math.min(r3, r5)
            java.lang.CharSequence r2 = r2.subSequence(r6, r5)
            java.lang.String r2 = r2.toString()
            r0.append(r4)
            r0.append(r2)
            r0.append(r4)
            int r2 = r2.length()
        L7a:
            int r6 = r3 - r2
            goto Lbf
        L7d:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto L9b
            char[] r2 = (char[]) r2
            int r3 = r2.length
            java.lang.String r8 = new java.lang.String
            int r5 = java.lang.Math.min(r3, r5)
            r8.<init>(r2, r6, r5)
            r0.append(r4)
            r0.append(r8)
            r0.append(r4)
            int r2 = r8.length()
            goto L7a
        L9b:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto Lbf
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            int r3 = java.lang.Math.min(r3, r5)
            java.lang.String r5 = new java.lang.String
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            r5.<init>(r2, r6, r3, r7)
            r0.append(r4)
            r0.append(r5)
            r0.append(r4)
            int r2 = r2.length
            int r6 = r2 - r3
            java.lang.String r7 = " bytes"
        Lbf:
            if (r6 <= 0) goto Lcf
            java.lang.String r2 = "[truncated "
            r0.append(r2)
            r0.append(r6)
            r0.append(r7)
            r0.append(r1)
        Lcf:
            java.lang.String r2 = "; line: "
            r0.append(r2)
            int r2 = r9.c
            r0.append(r2)
            java.lang.String r2 = ", column: "
            r0.append(r2)
            int r2 = r9.d
            java.lang.String r0 = defpackage.xc0.h(r0, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx7.toString():java.lang.String");
    }
}
