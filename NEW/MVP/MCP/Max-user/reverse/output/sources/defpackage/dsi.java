package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class dsi {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.n8a a(defpackage.n8a r14) {
        /*
            n8a r0 = new n8a
            int r1 = r14.d
            r0.<init>(r1)
            long[] r1 = r14.b
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4a
            r3 = 0
            r4 = r3
        L12:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L45
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2c:
            if (r9 >= r7) goto L43
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            r0.a(r10)
        L3f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2c
        L43:
            if (r7 != r8) goto L4a
        L45:
            if (r4 == r2) goto L4a
            int r4 = r4 + 1
            goto L12
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsi.a(n8a):n8a");
    }

    public static boolean b(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == str2.charAt(i) || ((c = (char) ((r3 | ' ') - 97)) < 26 && c == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final n8a c(n8a n8aVar, n8a n8aVar2) {
        if (n8aVar2.i()) {
            return n8aVar;
        }
        if (n8aVar.i()) {
            return n8aVar2;
        }
        n8a n8aVar3 = new n8a(n8aVar.d + n8aVar2.d);
        n8aVar3.b(n8aVar);
        n8aVar3.b(n8aVar2);
        return n8aVar3;
    }

    public static void d(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            i3i.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.xs e(defpackage.n8a r14) {
        /*
            xs r0 = new xs
            int r1 = r14.d
            r0.<init>(r1)
            long[] r1 = r14.b
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4e
            r3 = 0
            r4 = r3
        L12:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L49
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2c:
            if (r9 >= r7) goto L47
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L43
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.add(r10)
        L43:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2c
        L47:
            if (r7 != r8) goto L4e
        L49:
            if (r4 == r2) goto L4e
            int r4 = r4 + 1
            goto L12
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsi.e(n8a):xs");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r5
  0x0044: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x001e, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long[] f(defpackage.n8a r15) {
        /*
            int r0 = r15.d
            long[] r0 = new long[r0]
            long[] r1 = r15.b
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L49
            r3 = 0
            r4 = r3
            r5 = r4
        L10:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L44
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L2a:
            if (r10 >= r8) goto L42
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L3e
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            r0[r5] = r11
            int r5 = r5 + 1
        L3e:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2a
        L42:
            if (r8 != r9) goto L49
        L44:
            if (r4 == r2) goto L49
            int r4 = r4 + 1
            goto L10
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsi.f(n8a):long[]");
    }

    public static String g(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList h(defpackage.n8a r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.d
            r0.<init>(r1)
            long[] r1 = r14.b
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4e
            r3 = 0
            r4 = r3
        L12:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L49
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2c:
            if (r9 >= r7) goto L47
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L43
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.add(r10)
        L43:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2c
        L47:
            if (r7 != r8) goto L4e
        L49:
            if (r4 == r2) goto L4e
            int r4 = r4 + 1
            goto L12
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsi.h(n8a):java.util.ArrayList");
    }

    public static final n8a i(Collection collection) {
        n8a n8aVar = new n8a(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n8aVar.a(((Number) it.next()).longValue());
        }
        return n8aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set j(defpackage.n8a r14) {
        /*
            xs r0 = new xs
            r1 = 0
            r0.<init>(r1)
            long[] r2 = r14.b
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4c
            r4 = r1
        L10:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L47
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L2a:
            if (r9 >= r7) goto L45
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L41
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r2[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.add(r10)
        L41:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L45:
            if (r7 != r8) goto L4c
        L47:
            if (r4 == r3) goto L4c
            int r4 = r4 + 1
            goto L10
        L4c:
            java.util.Set r14 = java.util.Collections.unmodifiableSet(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsi.j(n8a):java.util.Set");
    }

    public static String k(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
