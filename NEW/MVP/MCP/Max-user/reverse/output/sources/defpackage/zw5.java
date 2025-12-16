package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zw5 implements SharedPreferences {
    public static final Object g = new Object();
    public final cx5 a;
    public final vy b;
    public c9a c;
    public final bwf d;
    public final Object e;
    public final Object f;

    public zw5(File file, ax5 ax5Var, bx5 bx5Var, cx5 cx5Var) {
        this.a = cx5Var;
        File file2 = new File(file, vmf.N(ax5Var.a, ".prefs").concat(".prefs"));
        vy vyVar = new vy(file2, cx5Var != null ? new wo4(23, this) : null);
        this.b = vyVar;
        this.c = new c9a(10);
        this.d = new bwf(new qn2(this, 15, bx5Var));
        this.e = ipi.b(2, new nq5(7));
        this.f = new Object();
        if (file2.exists()) {
            if (cx5Var != null) {
                try {
                    cx5Var.log("read prefs from file");
                } catch (Throwable th) {
                    cx5 cx5Var2 = this.a;
                    if (cx5Var2 != null) {
                        cx5Var2.error("read prefs from file failure", th);
                        return;
                    }
                    return;
                }
            }
            t7j.b(vyVar, new qk(10, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[EDGE_INSN: B:49:0x00e7->B:61:0x00f1 BREAK  A[LOOP:3: B:40:0x00b4->B:50:0x00e9]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.d9a r25, boolean r26, defpackage.w8a r27) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw5.a(d9a, boolean, w8a):void");
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.c.b(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        cx5 cx5Var = this.a;
        if (cx5Var != null) {
            cx5Var.log("edit: strategy = ".concat("BIG_CHANGES"));
        }
        return new yw5(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map getAll() {
        /*
            r17 = this;
            r0 = r17
            java.util.HashMap r1 = new java.util.HashMap
            c9a r2 = r0.c
            int r2 = r2.e
            r1.<init>(r2)
            c9a r2 = r0.c
            java.lang.Object[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L56
            r6 = 0
            r7 = r6
        L1a:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L51
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L34:
            if (r12 >= r10) goto L4f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r14 = (java.lang.String) r14
            r1.put(r14, r13)
        L4b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L34
        L4f:
            if (r10 != r11) goto L56
        L51:
            if (r7 == r5) goto L56
            int r7 = r7 + 1
            goto L1a
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw5.getAll():java.util.Map");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objF = this.c.f(str);
        Boolean bool = objF instanceof Boolean ? (Boolean) objF : null;
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objF = this.c.f(str);
        Float f2 = objF instanceof Float ? (Float) objF : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objF = this.c.f(str);
        Integer num = objF instanceof Integer ? (Integer) objF : null;
        return num != null ? num.intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objF = this.c.f(str);
        Long l = objF instanceof Long ? (Long) objF : null;
        return l != null ? l.longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objF = this.c.f(str);
        String str3 = objF instanceof String ? (String) objF : null;
        return str3 == null ? str2 : str3;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objF = this.c.f(str);
        Set set2 = objF instanceof Set ? (Set) objF : null;
        return set2 == null ? set : set2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f) {
            ((WeakHashMap) this.e.getValue()).put(onSharedPreferenceChangeListener, g);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f) {
            ((WeakHashMap) this.e.getValue()).remove(onSharedPreferenceChangeListener);
        }
    }
}
