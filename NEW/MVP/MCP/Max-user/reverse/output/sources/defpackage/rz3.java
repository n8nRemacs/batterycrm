package defpackage;

import android.net.Uri;
import org.apache.http.HttpHost;

/* loaded from: classes2.dex */
public abstract class rz3 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        if ('a' <= c && 'f' >= c) {
            return c - 'W';
        }
        if ('A' <= c && 'F' >= c) {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.z26 r4, java.lang.Object r5, java.lang.Object r6, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.w46
            if (r0 == 0) goto L13
            r0 = r7
            w46 r0 = (defpackage.w46) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            w46 r0 = new w46
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            java.lang.Object r6 = r0.d
            defpackage.g8j.b(r7)
            goto L3f
        L2f:
            defpackage.g8j.b(r7)
            r0.d = r6
            r0.X = r2
            java.lang.Object r4 = r4.a(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L3f
            return
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz3.b(z26, java.lang.Object, java.lang.Object, q44):void");
    }

    public static final Uri c(String str) {
        if (str.length() == 0) {
            return null;
        }
        return (dnf.r(str, "file:", true) || dnf.r(str, HttpHost.DEFAULT_SCHEME_NAME, true) || dnf.r(str, "content", true) || dnf.r(str, "android.resource", true) || dnf.r(str, "data", true) || dnf.r(str, "res:/", true)) ? Uri.parse(str) : Uri.parse("file:".concat(str));
    }
}
