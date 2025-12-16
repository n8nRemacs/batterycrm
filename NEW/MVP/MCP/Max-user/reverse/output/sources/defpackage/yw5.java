package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class yw5 implements SharedPreferences.Editor {
    public final HashMap a = new HashMap();
    public final Object b = new Object();
    public boolean c;
    public final /* synthetic */ zw5 d;

    public yw5(zw5 zw5Var) {
        this.d = zw5Var;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        cx5 cx5Var = this.d.a;
        if (cx5Var != null) {
            cx5Var.log("apply");
        }
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        synchronized (this.b) {
            this.c = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:13:0x0059, B:17:0x0062, B:19:0x006b, B:21:0x006f, B:24:0x0078, B:26:0x007c, B:29:0x0084, B:31:0x0089, B:32:0x0093, B:34:0x0099, B:39:0x00b0, B:41:0x00b6, B:43:0x00bc, B:46:0x00c3, B:52:0x00d3, B:47:0x00c7, B:50:0x00ce, B:54:0x00d8, B:56:0x00df, B:58:0x00e3, B:59:0x00e8, B:60:0x00f9, B:62:0x00fd), top: B:72:0x0059, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, k18] */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean commit() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw5.commit():boolean");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.b) {
            this.a.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.b) {
            this.a.put(str, Float.valueOf(f));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.b) {
            this.a.put(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.b) {
            this.a.put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.b) {
            this.a.put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.b) {
            this.a.put(str, set);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        synchronized (this.b) {
            this.a.put(str, this);
        }
        return this;
    }
}
