package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ggg implements grf, au, qu6, e1e, n8e, o8e {
    public final Object X;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object o;

    public /* synthetic */ ggg(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.o = obj2;
        this.X = bArr;
        this.c = objArr;
        this.b = i;
    }

    public static void D(String str) {
        if (dnf.n(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = fni.b(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public static /* synthetic */ void G(ggg gggVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = gggVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        gggVar.F(i, str, str2);
        throw null;
    }

    public String A() {
        String str = (String) this.o;
        if (str == null) {
            return u();
        }
        this.o = null;
        return str;
    }

    public String B() {
        String string;
        String str = (String) this.c;
        String str2 = (String) this.o;
        if (str2 != null) {
            this.o = null;
            return str2;
        }
        int iD0 = d0();
        if (iD0 >= str.length() || iD0 == -1) {
            G(this, "EOF", iD0, null, 4);
            throw null;
        }
        byte bA = api.a(str.charAt(iD0));
        if (bA == 1) {
            return A();
        }
        if (bA != 0) {
            G(this, "Expected beginning of the string, but got " + str.charAt(iD0), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (api.a(str.charAt(iD0)) == 0) {
            iD0++;
            if (iD0 >= str.length()) {
                ((StringBuilder) this.X).append((CharSequence) str, this.b, iD0);
                int iZ = Z(iD0);
                if (iZ == -1) {
                    this.b = iD0;
                    ((StringBuilder) this.X).append((CharSequence) str, 0, 0);
                    StringBuilder sb = (StringBuilder) this.X;
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iD0 = iZ;
                z = true;
            }
        }
        if (z) {
            ((StringBuilder) this.X).append((CharSequence) str, this.b, iD0);
            StringBuilder sb2 = (StringBuilder) this.X;
            String string3 = sb2.toString();
            sb2.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(this.b, iD0).toString();
        }
        this.b = iD0;
        return string;
    }

    public String C() {
        String strB = B();
        if (!fni.a(strB, "null") || ((String) this.c).charAt(this.b - 1) == '\"') {
            return strB;
        }
        G(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void E(int i) {
        int iL = L(i);
        ((v32) this.o).d0(iL);
        RecyclerView recyclerView = (RecyclerView) ((x6i) this.d).b;
        View childAt = recyclerView.getChildAt(iL);
        if (childAt != null) {
            mid midVarU = RecyclerView.U(childAt);
            if (midVarU != null) {
                if (midVarU.s() && !midVarU.x()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(midVarU);
                    throw new IllegalArgumentException(wy1.f(recyclerView, sb));
                }
                if (RecyclerView.L1) {
                    Log.d("RecyclerView", "tmpDetach " + midVarU);
                }
                midVarU.e(256);
            }
        } else if (RecyclerView.K1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iL);
            throw new IllegalArgumentException(wy1.f(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iL);
    }

    public void F(int i, String str, String str2) {
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbO = ho7.o(str, " at path: ");
        sbO.append(((lk6) this.d).G());
        sbO.append(strConcat);
        throw koi.b(sbO.toString(), (String) this.c, i);
    }

    public void H(byte b, boolean z) {
        String str = (String) this.c;
        String strG = api.g(b);
        int i = z ? this.b - 1 : this.b;
        G(this, wy1.j("Expected ", strG, ", but had '", (this.b == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public int I(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        G(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public View J(int i) {
        return ((RecyclerView) ((x6i) this.d).b).getChildAt(L(i));
    }

    public int K() {
        return ((RecyclerView) ((x6i) this.d).b).getChildCount() - ((ArrayList) this.X).size();
    }

    public int L(int i) {
        v32 v32Var = (v32) this.o;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((x6i) this.d).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iU = i - (i2 - v32Var.U(i2));
            if (iU == 0) {
                while (v32Var.W(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iU;
        }
        return -1;
    }

    public String M(String str) {
        HashMap map = (HashMap) this.o;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((ArrayList) this.X).iterator();
            while (it.hasNext()) {
                l22 l22VarG = ((l22) it.next()).g();
                z5j.a("CameraInfo doesn't contain Camera2 implementation.", l22VarG instanceof hz1);
                if (str2.equals(((hz1) ((hz1) l22VarG).c.b).a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public View N(int i) {
        return ((RecyclerView) ((x6i) this.d).b).getChildAt(i);
    }

    public int O() {
        return ((RecyclerView) ((x6i) this.d).b).getChildCount();
    }

    public void P(View view) {
        ((ArrayList) this.X).add(view);
        x6i x6iVar = (x6i) this.d;
        mid midVarU = RecyclerView.U(view);
        if (midVarU != null) {
            View view2 = midVarU.a;
            RecyclerView recyclerView = (RecyclerView) x6iVar.b;
            int i = midVarU.A0;
            if (i != -1) {
                midVarU.z0 = i;
            } else {
                WeakHashMap weakHashMap = hfh.a;
                midVarU.z0 = view2.getImportantForAccessibility();
            }
            if (recyclerView.Z()) {
                midVarU.A0 = 4;
                recyclerView.E1.add(midVarU);
            } else {
                WeakHashMap weakHashMap2 = hfh.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean Q(ggg gggVar, int i) {
        return gggVar != null && xxg.a(((jld[]) this.d)[i], ((jld[]) gggVar.d)[i]) && xxg.a(((an5[]) this.o)[i], ((an5[]) gggVar.o)[i]);
    }

    public boolean R(ggg gggVar, int i) {
        return gggVar != null && Objects.equals(((kld[]) this.d)[i], ((kld[]) gggVar.d)[i]) && Objects.equals(((bn5[]) this.o)[i], ((bn5[]) gggVar.o)[i]);
    }

    public boolean S(int i) {
        switch (this.a) {
            case 0:
                if (((jld[]) this.d)[i] != null) {
                }
                break;
            default:
                if (((kld[]) this.d)[i] != null) {
                }
                break;
        }
        return false;
    }

    public void T(pk6 pk6Var) throws IOException, SQLException {
        oy oyVar = (oy) this.o;
        Cursor cursorK0 = pk6Var.k0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorK0.moveToFirst()) {
                if (cursorK0.getInt(0) == 0) {
                    z = true;
                }
            }
            cursorK0.close();
            oyVar.c(pk6Var);
            if (!z) {
                lm9 lm9VarU = oyVar.u(pk6Var);
                if (!lm9VarU.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + lm9VarU.c);
                }
            }
            h0(pk6Var);
            oyVar.q();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(defpackage.pk6 r9) throws java.io.IOException, android.database.SQLException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.o
            oy r0 = (defpackage.oy) r0
            java.lang.Object r1 = r8.X
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r2 = r9.k0(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1d
            r4 = 0
            if (r3 == 0) goto L20
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L1d:
            r9 = move-exception
            goto L91
        L20:
            r3 = r4
        L21:
            r2.close()
            r2 = 0
            if (r3 == 0) goto L6a
            aqc r3 = new aqc
            r5 = 5
            r6 = 0
            java.lang.String r7 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r3.<init>(r7, r2, r6, r5)
            android.database.Cursor r3 = r9.j0(r3)
            boolean r5 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L41
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r9 = move-exception
            goto L64
        L41:
            r4 = r2
        L42:
            r3.close()
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L75
            java.lang.Object r3 = r8.c
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L56
            goto L75
        L56:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r2 = ", found: "
            java.lang.String r0 = defpackage.wy1.i(r0, r1, r2, r4)
            r9.<init>(r0)
            throw r9
        L64:
            throw r9     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            defpackage.r4j.a(r3, r9)
            throw r0
        L6a:
            lm9 r1 = r0.u(r9)
            boolean r3 = r1.b
            if (r3 == 0) goto L7b
            r8.h0(r9)
        L75:
            r0.r(r9)
            r8.d = r2
            return
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L91:
            throw r9     // Catch: java.lang.Throwable -> L92
        L92:
            r0 = move-exception
            defpackage.r4j.a(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggg.U(pk6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007a A[EDGE_INSN: B:73:0x007a->B:37:0x007a BREAK  A[LOOP:1: B:12:0x0022->B:76:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(defpackage.pk6 r13, int r14, int r15) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggg.V(pk6, int, int):void");
    }

    public String W(String str, boolean z) {
        int i = this.b;
        try {
            if (v() == 6 && fni.a(Y(z), str)) {
                this.o = null;
                if (v() == 5) {
                    return Y(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.o = null;
        }
    }

    public byte X() {
        String str = (String) this.c;
        int i = this.b;
        while (true) {
            int iZ = Z(i);
            if (iZ == -1) {
                this.b = iZ;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iZ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iZ;
                return api.a(cCharAt);
            }
            i = iZ + 1;
        }
    }

    public String Y(boolean z) {
        String strA;
        byte bX = X();
        if (z) {
            if (bX != 1 && bX != 0) {
                return null;
            }
            strA = B();
        } else {
            if (bX != 1) {
                return null;
            }
            strA = A();
        }
        this.o = strA;
        return strA;
    }

    public int Z(int i) {
        if (i < ((String) this.c).length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.e1e
    public uz9 a() {
        return (uz9) this.o;
    }

    public synchronized void a0(final tu6 tu6Var, final long j) {
        try {
            if (this.b > 0) {
                ((iy1) this.X).g(new a4h() { // from class: nj6
                    @Override // defpackage.a4h
                    public final void run() {
                        ggg gggVar = this.a;
                        ((su6) gggVar.o).d((xo8) gggVar.d, tu6Var, j);
                    }
                }, true);
                this.b--;
            } else {
                ((ArrayDeque) this.c).add(new h9g(tu6Var, j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n8e
    public void b(y9g y9gVar, jp5 jp5Var, mjg mjgVar) {
    }

    public void b0(int i) {
        x6i x6iVar = (x6i) this.d;
        int i2 = this.b;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iL = L(i);
            View childAt = ((RecyclerView) x6iVar.b).getChildAt(iL);
            if (childAt != null) {
                this.b = 1;
                this.c = childAt;
                if (((v32) this.o).d0(iL)) {
                    g0(childAt);
                }
                x6iVar.w(iL);
            }
            this.b = 0;
            this.c = null;
        } catch (Throwable th) {
            this.b = 0;
            this.c = null;
            throw th;
        }
    }

    @Override // defpackage.e1e
    public void c(ContentResolver contentResolver, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream == null) {
            return;
        }
        try {
            j0(outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
        } finally {
        }
    }

    public synchronized void c0() {
        try {
            if (((ArrayDeque) this.c).isEmpty()) {
                iy1 iy1Var = (iy1) this.X;
                su6 su6Var = (su6) this.o;
                Objects.requireNonNull(su6Var);
                iy1Var.g(new p72(su6Var, 1), true);
            } else {
                ((ArrayDeque) this.c).add(new h9g(tu6.e, Long.MIN_VALUE));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    @Override // defpackage.n8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.qyg r33) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggg.d(qyg):void");
    }

    public int d0() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.c;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    @Override // defpackage.o8e
    public void e(z9g z9gVar, kp5 kp5Var, mjg mjgVar) {
    }

    public boolean e0() {
        int iD0 = d0();
        String str = (String) this.c;
        if (iD0 >= str.length() || iD0 == -1 || str.charAt(iD0) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    @Override // defpackage.o8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.umb r38) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggg.f(umb):void");
    }

    public void f0(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strB = B();
                this.b = i;
                if (fni.a(strB, "null")) {
                    F(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        H(api.a(c), true);
        throw null;
    }

    @Override // defpackage.au
    public int g(l16 l16Var) {
        em5 em5Var = (em5) this.c;
        if (this.b == 2) {
            long duration = em5Var.getDuration();
            l16Var.b = zxg.Z(Math.min(em5Var.e(), duration), duration);
        }
        return this.b;
    }

    public void g0(View view) {
        if (((ArrayList) this.X).remove(view)) {
            x6i x6iVar = (x6i) this.d;
            mid midVarU = RecyclerView.U(view);
            if (midVarU != null) {
                RecyclerView recyclerView = (RecyclerView) x6iVar.b;
                int i = midVarU.z0;
                if (recyclerView.Z()) {
                    midVarU.A0 = i;
                    recyclerView.E1.add(midVarU);
                } else {
                    View view2 = midVarU.a;
                    WeakHashMap weakHashMap = hfh.a;
                    view2.setImportantForAccessibility(i);
                }
                midVarU.z0 = 0;
            }
        }
    }

    @Override // defpackage.grf
    public Object get() {
        gri.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        Range range = ((g90) this.o).a;
        x90 x90Var = (x90) this.c;
        int i = x90Var.c;
        f90 f90Var = (f90) this.X;
        int iC = usi.c(i, f90Var.c, x90Var.e, f90Var.b, x90Var.d, range);
        lz9 lz9Var = new lz9();
        lz9Var.b = -1;
        lz9Var.a = (String) this.d;
        lz9Var.b = Integer.valueOf(this.b);
        lz9Var.c = f9g.a;
        lz9Var.X = Integer.valueOf(f90Var.c);
        lz9Var.o = Integer.valueOf(f90Var.b);
        lz9Var.d = Integer.valueOf(iC);
        return lz9Var.c();
    }

    @Override // defpackage.e1e
    public Integer getHeight() {
        return null;
    }

    @Override // defpackage.e1e
    public Integer getWidth() {
        return null;
    }

    @Override // defpackage.e1e
    public Uri h() {
        return (Uri) this.c;
    }

    public void h0(pk6 pk6Var) throws SQLException {
        pk6Var.Q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pk6Var.Q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.X) + "')");
    }

    @Override // defpackage.e1e
    public String i() {
        return (String) this.X;
    }

    public void i0(int i) {
        int[] iArr = (int[]) this.X;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (zx6 zx6Var : ((zx6[][]) this.o)[i]) {
            i0(zx6Var.a.b);
            zx6[] zx6VarArr = (zx6[]) this.d;
            int i2 = this.b;
            this.b = i2 - 1;
            zx6VarArr[i2] = zx6Var;
        }
        iArr[i] = 2;
    }

    @Override // defpackage.au
    public ah7 j() {
        lk6 lk6Var = new lk6(4);
        jdc jdcVar = (jdc) this.X;
        String str = (String) jdcVar.c;
        if (str != null) {
            lk6Var.T(1, str);
        }
        String str2 = (String) jdcVar.d;
        if (str2 != null) {
            lk6Var.T(2, str2);
        }
        return lk6Var.u();
    }

    public void j0(OutputStream outputStream) throws IOException {
        int i = this.b;
        byte[] bArr = new byte[2048];
        int i2 = 0;
        do {
            int iMin = Math.min(2048, i - i2);
            ((nf9) this.d).P(i2, 0, iMin, bArr);
            outputStream.write(bArr, 0, iMin);
            i2 += iMin;
        } while (i2 < i);
        outputStream.flush();
    }

    @Override // defpackage.e1e
    public Integer k() {
        return Integer.valueOf(this.b);
    }

    public void l(zka zkaVar) {
        IconCompat iconCompatA = zkaVar.a();
        int i = zkaVar.f;
        boolean z = zkaVar.d;
        Bundle bundle = zkaVar.a;
        Notification.Action.Builder builderA = ima.a(iconCompatA != null ? ob7.g(iconCompatA, null) : null, zkaVar.i, zkaVar.j);
        pkd[] pkdVarArr = zkaVar.c;
        if (pkdVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[pkdVarArr.length];
            for (int i2 = 0; i2 < pkdVarArr.length; i2++) {
                remoteInputArr[i2] = pkd.a(pkdVarArr[i2]);
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                gma.c(builderA, remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i3 = Build.VERSION.SDK_INT;
        jma.a(builderA, z);
        bundle2.putInt("android.support.action.semanticAction", i);
        if (i3 >= 28) {
            lma.b(builderA, i);
        }
        if (i3 >= 29) {
            mma.c(builderA, zkaVar.g);
        }
        if (i3 >= 31) {
            nma.a(builderA, zkaVar.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", zkaVar.e);
        gma.b(builderA, bundle2);
        gma.a((Notification.Builder) this.o, gma.d(builderA));
    }

    @Override // defpackage.qu6
    public synchronized void m() {
        h9g h9gVar = (h9g) ((ArrayDeque) this.c).poll();
        if (h9gVar == null) {
            this.b++;
            return;
        }
        ((iy1) this.X).g(new o72(this, 4, h9gVar), true);
        h9g h9gVar2 = (h9g) ((ArrayDeque) this.c).peek();
        if (h9gVar2 != null && h9gVar2.b == Long.MIN_VALUE) {
            iy1 iy1Var = (iy1) this.X;
            su6 su6Var = (su6) this.o;
            Objects.requireNonNull(su6Var);
            iy1Var.g(new p72(su6Var, 1), true);
            ((ArrayDeque) this.c).remove();
        }
    }

    @Override // defpackage.e1e
    public void n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            j0(fileOutputStream);
            fileOutputStream.close();
        } finally {
        }
    }

    public void p(int i, View view, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((x6i) this.d).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : L(i);
        ((v32) this.o).Z(childCount, z);
        if (z) {
            P(view);
        }
        recyclerView.addView(view, childCount);
        mid midVarU = RecyclerView.U(view);
        phd phdVar = recyclerView.z0;
        if (phdVar != null && midVarU != null) {
            phdVar.w(midVarU);
        }
        ArrayList arrayList = recyclerView.P0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((yhd) recyclerView.P0.get(size)).d(view);
            }
        }
    }

    public int q(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.X).append((char) (I(i + 3, charSequence) + (I(i, charSequence) << 12) + (I(i + 1, charSequence) << 8) + (I(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return q(this.b, charSequence);
        }
        G(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void r(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((x6i) this.d).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : L(i);
        ((v32) this.o).Z(childCount, z);
        if (z) {
            P(view);
        }
        mid midVarU = RecyclerView.U(view);
        if (midVarU != null) {
            if (!midVarU.s() && !midVarU.x()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(midVarU);
                throw new IllegalArgumentException(wy1.f(recyclerView, sb));
            }
            if (RecyclerView.L1) {
                Log.d("RecyclerView", "reAttach " + midVarU);
            }
            midVarU.t0 &= -257;
        } else if (RecyclerView.K1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(wy1.f(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // defpackage.au
    public void release() {
        ((em5) this.c).h1();
        this.b = 0;
    }

    public boolean s() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.c;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    @Override // defpackage.au
    public void start() {
        em5 em5Var = (em5) this.c;
        k09 k09Var = ((g95) this.o).a;
        em5Var.getClass();
        em5Var.C(wg7.m(k09Var));
        em5Var.prepare();
        this.b = 1;
    }

    public void t(int i, String str) {
        String str2 = (String) this.c;
        if (str2.length() - i < str.length()) {
            G(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                G(this, "Expected valid boolean literal prefix, but had '" + B() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((v32) this.o).toString() + ", hidden list:" + ((ArrayList) this.X).size();
            case 13:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.c);
                sb.append("', currentPosition=");
                return xc0.h(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public String u() {
        String string;
        String str = (String) this.c;
        x('\"');
        int i = this.b;
        int iC = vmf.C(str, '\"', i, 4);
        if (iC == -1) {
            B();
            H((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iC) {
            if (str.charAt(i2) == '\\') {
                int iZ = this.b;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        ((StringBuilder) this.X).append((CharSequence) str, iZ, i2);
                        int iZ2 = Z(i2 + 1);
                        if (iZ2 == -1) {
                            G(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iQ = iZ2 + 1;
                        char cCharAt2 = str.charAt(iZ2);
                        if (cCharAt2 == 'u') {
                            iQ = q(iQ, str);
                        } else {
                            char c = cCharAt2 < 'u' ? ya2.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                G(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.X).append(c);
                        }
                        iZ = Z(iQ);
                        if (iZ == -1) {
                            G(this, "Unexpected EOF", iZ, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            ((StringBuilder) this.X).append((CharSequence) str, iZ, i2);
                            iZ = Z(i2);
                            if (iZ == -1) {
                                G(this, "Unexpected EOF", iZ, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i2);
                        }
                    }
                    i2 = iZ;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                if (z) {
                    ((StringBuilder) this.X).append((CharSequence) str, iZ, i2);
                    StringBuilder sb = (StringBuilder) this.X;
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iZ, i2).toString();
                }
                this.b = i2 + 1;
                return string;
            }
            i2++;
        }
        this.b = iC + 1;
        return str.substring(i, iC);
    }

    public byte v() {
        String str = (String) this.c;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return api.a(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte w(byte b) {
        byte bV = v();
        if (bV == b) {
            return bV;
        }
        H(b, true);
        throw null;
    }

    public void x(char c) {
        int i = this.b;
        if (i == -1) {
            f0(c);
            throw null;
        }
        String str = (String) this.c;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                f0(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        f0(c);
        throw null;
    }

    @Override // defpackage.qu6
    public synchronized void y() {
        this.b = 0;
        ((ArrayDeque) this.c).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0188, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0195, code lost:
    
        G(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019b, code lost:
    
        G(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        G(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        G(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        G(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        r21.b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        G(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        G(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long z() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggg.z():long");
    }

    public ggg(fje fjeVar, int i, List list, xo8 xo8Var, List list2) {
        this.a = 12;
        this.d = fjeVar;
        this.b = i;
        this.c = list;
        this.o = xo8Var;
        this.X = list2;
    }

    public ggg(nf9 nf9Var, uz9 uz9Var, String str) {
        this.a = 10;
        this.d = nf9Var;
        this.o = uz9Var;
        this.X = str;
        this.b = nf9Var.Q();
        this.c = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public ggg(cf4 cf4Var, oy oyVar, String str, String str2) {
        this.a = 11;
        int i = oyVar.b;
        this.a = 11;
        this.b = i;
        this.d = cf4Var;
        this.o = oyVar;
        this.X = str;
        this.c = str2;
    }

    public ggg(xo8 xo8Var, su6 su6Var, iy1 iy1Var) {
        this.a = 6;
        this.d = xo8Var;
        this.o = su6Var;
        this.X = iy1Var;
        this.c = new ArrayDeque();
    }

    public ggg(t22 t22Var) {
        this.a = 3;
        this.b = 0;
        HashMap map = new HashMap();
        this.o = map;
        this.c = new HashSet();
        this.d = new ArrayList();
        this.X = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = t22Var.a.D();
        } catch (CameraAccessExceptionCompat unused) {
            gri.b("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (qxi.a(t22Var, str) && qxi.a(t22Var, str2)) {
                        ((HashSet) this.c).add(new HashSet(Arrays.asList(str, str2)));
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    gri.a("Camera2CameraCoordinator", wy1.j("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }

    public ggg(String str, int i, g90 g90Var, f90 f90Var, x90 x90Var) {
        this.a = 2;
        this.d = str;
        this.b = i;
        this.o = g90Var;
        this.X = f90Var;
        this.c = x90Var;
    }

    public ggg(nla nlaVar) {
        ArrayList arrayList;
        int i;
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        zka zkaVarK;
        int i2;
        this.a = 9;
        new ArrayList();
        this.c = new Bundle();
        this.X = nlaVar;
        Context context = nlaVar.a;
        ArrayList arrayList5 = nlaVar.H;
        ArrayList arrayList6 = nlaVar.c;
        ArrayList arrayList7 = nlaVar.d;
        this.d = context;
        Notification.Builder builderA = kma.a(context, nlaVar.z);
        this.o = builderA;
        Notification notification = nlaVar.F;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nlaVar.e).setContentText(nlaVar.f).setContentInfo(null).setContentIntent(nlaVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(nlaVar.h, (notification.flags & 128) != 0).setNumber(nlaVar.j).setProgress(nlaVar.o, nlaVar.p, nlaVar.q);
        IconCompat iconCompat = nlaVar.i;
        ima.b(builderA, iconCompat == null ? null : ob7.g(iconCompat, context));
        builderA.setSubText(null).setUsesChronometer(nlaVar.m).setPriority(nlaVar.k);
        bma bmaVar = nlaVar.n;
        if (bmaVar instanceof sla) {
            sla slaVar = (sla) bmaVar;
            int i3 = hxc.ic_call_decline;
            PendingIntent pendingIntent = slaVar.h;
            if (pendingIntent == null) {
                zkaVarK = slaVar.k(i3, n3d.call_notification_hang_up_action, mvc.call_notification_decline_color, slaVar.i);
            } else {
                zkaVarK = slaVar.k(i3, n3d.call_notification_decline_action, mvc.call_notification_decline_color, pendingIntent);
            }
            int i4 = hxc.ic_call_answer;
            PendingIntent pendingIntent2 = slaVar.g;
            zka zkaVarK2 = pendingIntent2 == null ? null : slaVar.k(i4, n3d.call_notification_answer_action, mvc.call_notification_answer_color, pendingIntent2);
            ArrayList arrayList8 = new ArrayList(3);
            arrayList8.add(zkaVarK);
            ArrayList arrayList9 = ((nla) slaVar.b).b;
            if (arrayList9 != null) {
                Iterator it = arrayList9.iterator();
                i2 = 2;
                while (it.hasNext()) {
                    zka zkaVar = (zka) it.next();
                    if (zkaVar.g) {
                        arrayList8.add(zkaVar);
                    } else if (!zkaVar.a.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList8.add(zkaVar);
                        i2--;
                    }
                    if (zkaVarK2 != null && i2 == 1) {
                        arrayList8.add(zkaVarK2);
                        i2--;
                    }
                }
            } else {
                i2 = 2;
            }
            if (zkaVarK2 != null && i2 >= 1) {
                arrayList8.add(zkaVarK2);
            }
            Iterator it2 = arrayList8.iterator();
            while (it2.hasNext()) {
                l((zka) it2.next());
            }
        } else {
            Iterator it3 = nlaVar.b.iterator();
            while (it3.hasNext()) {
                l((zka) it3.next());
            }
        }
        Bundle bundle2 = nlaVar.w;
        if (bundle2 != null) {
            ((Bundle) this.c).putAll(bundle2);
        }
        int i5 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.o).setShowWhen(nlaVar.l);
        gma.i((Notification.Builder) this.o, nlaVar.u);
        gma.g((Notification.Builder) this.o, nlaVar.r);
        gma.j((Notification.Builder) this.o, nlaVar.t);
        gma.h((Notification.Builder) this.o, nlaVar.s);
        this.b = nlaVar.C;
        hma.b((Notification.Builder) this.o, nlaVar.v);
        hma.c((Notification.Builder) this.o, nlaVar.x);
        hma.f((Notification.Builder) this.o, nlaVar.y);
        hma.d((Notification.Builder) this.o, null);
        hma.e((Notification.Builder) this.o, notification.sound, notification.audioAttributes);
        if (i5 < 28) {
            if (arrayList6 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList6.size());
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    ltb ltbVar = (ltb) it4.next();
                    CharSequence charSequence = ltbVar.a;
                    String str = ltbVar.c;
                    if (str == null) {
                        if (charSequence != null) {
                            str = "name:" + ((Object) charSequence);
                        } else {
                            str = "";
                        }
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList5 == null) {
                    arrayList5 = arrayList4;
                } else {
                    xs xsVar = new xs(arrayList5.size() + arrayList4.size());
                    xsVar.addAll(arrayList4);
                    xsVar.addAll(arrayList5);
                    arrayList5 = new ArrayList(xsVar);
                }
            }
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                hma.a((Notification.Builder) this.o, (String) it5.next());
            }
        }
        if (arrayList7.size() > 0) {
            Bundle bundle3 = nlaVar.b().getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList7.size()) {
                String string = Integer.toString(i6);
                zka zkaVar2 = (zka) arrayList7.get(i6);
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatA = zkaVar2.a();
                Bundle bundle7 = zkaVar2.a;
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.e() : 0);
                bundle6.putCharSequence("title", zkaVar2.i);
                bundle6.putParcelable("actionIntent", zkaVar2.j);
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", zkaVar2.d);
                bundle6.putBundle("extras", bundle);
                pkd[] pkdVarArr = zkaVar2.c;
                if (pkdVarArr == null) {
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[pkdVarArr.length];
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    int i7 = 0;
                    while (i7 < pkdVarArr.length) {
                        pkd pkdVar = pkdVarArr[i7];
                        int i8 = i7;
                        Bundle bundle8 = new Bundle();
                        pkd[] pkdVarArr2 = pkdVarArr;
                        int i9 = i6;
                        bundle8.putString("resultKey", pkdVar.a);
                        bundle8.putCharSequence("label", pkdVar.b);
                        bundle8.putCharSequenceArray("choices", pkdVar.c);
                        bundle8.putBoolean("allowFreeFormInput", pkdVar.d);
                        bundle8.putBundle("extras", pkdVar.f);
                        Set set = pkdVar.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(set.size());
                            Iterator it6 = set.iterator();
                            while (it6.hasNext()) {
                                arrayList10.add((String) it6.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr[i8] = bundle8;
                        i7 = i8 + 1;
                        pkdVarArr = pkdVarArr2;
                        i6 = i9;
                    }
                }
                int i10 = i6;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", zkaVar2.e);
                bundle6.putInt("semanticAction", zkaVar2.f);
                bundle5.putBundle(string, bundle6);
                i6 = i10 + 1;
                arrayList6 = arrayList2;
                arrayList7 = arrayList3;
            }
            arrayList = arrayList6;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            nlaVar.b().putBundle("android.car.EXTENSIONS", bundle3);
            ((Bundle) this.c).putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList6;
        }
        int i11 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.o).setExtras(nlaVar.w);
        jma.e((Notification.Builder) this.o, null);
        kma.b((Notification.Builder) this.o, nlaVar.A);
        kma.e((Notification.Builder) this.o, null);
        kma.f((Notification.Builder) this.o, nlaVar.B);
        kma.g((Notification.Builder) this.o, 0L);
        kma.d((Notification.Builder) this.o, nlaVar.C);
        if (!TextUtils.isEmpty(nlaVar.z)) {
            ((Notification.Builder) this.o).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i11 >= 28) {
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                ltb ltbVar2 = (ltb) it7.next();
                Notification.Builder builder = (Notification.Builder) this.o;
                ltbVar2.getClass();
                lma.a(builder, ktb.b(ltbVar2));
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            mma.a((Notification.Builder) this.o, nlaVar.E);
            mma.b((Notification.Builder) this.o, null);
        }
        if (i12 >= 31 && (i = nlaVar.D) != 0) {
            nma.b((Notification.Builder) this.o, i);
        }
        if (nlaVar.G) {
            if (((nla) this.X).s) {
                this.b = 2;
            } else {
                this.b = 1;
            }
            ((Notification.Builder) this.o).setVibrate(null);
            ((Notification.Builder) this.o).setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            ((Notification.Builder) this.o).setDefaults(i13);
            if (TextUtils.isEmpty(((nla) this.X).r)) {
                gma.g((Notification.Builder) this.o, "silent");
            }
            kma.d((Notification.Builder) this.o, this.b);
        }
    }

    public ggg(x6i x6iVar) {
        this.a = 4;
        this.b = 0;
        this.d = x6iVar;
        this.o = new v32(1);
        this.X = new ArrayList();
    }

    public ggg(jld[] jldVarArr, an5[] an5VarArr, mgg mggVar, lo8 lo8Var) {
        this.a = 0;
        this.d = jldVarArr;
        this.o = (an5[]) an5VarArr.clone();
        this.X = mggVar;
        this.c = lo8Var;
        this.b = jldVarArr.length;
    }

    public ggg(kld[] kldVarArr, bn5[] bn5VarArr, kgg kggVar, Object obj) {
        this.a = 1;
        hsi.b(kldVarArr.length == bn5VarArr.length);
        this.d = kldVarArr;
        this.o = (bn5[]) bn5VarArr.clone();
        this.X = kggVar;
        this.c = obj;
        this.b = kldVarArr.length;
    }

    public ggg() {
        this.a = 7;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.b = iGlCreateProgram;
        t6d.b();
        t6d.a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        t6d.a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            Log.e("GlUtil", strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
        }
        GLES20.glUseProgram(iGlCreateProgram);
        this.X = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.d = new v17[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str);
            v17 v17Var = new v17(21, (byte) 0);
            ((v17[]) this.d)[i] = v17Var;
            ((HashMap) this.X).put(str, v17Var);
        }
        this.c = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
        this.o = new v1a[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str2 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str2);
            v1a v1aVar = new v1a(21);
            ((v1a[]) this.o)[i5] = v1aVar;
            ((HashMap) this.c).put(str2, v1aVar);
        }
        t6d.b();
    }

    public ggg(String str) {
        this.a = 13;
        lk6 lk6Var = new lk6((char) 0, 15);
        lk6Var.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        lk6Var.d = iArr;
        lk6Var.b = -1;
        this.d = lk6Var;
        this.X = new StringBuilder();
        this.c = str;
    }

    public ggg(Context context, g95 g95Var, b99 b99Var, bd3 bd3Var, int i, Looper looper, zt ztVar, mwf mwfVar, cq4 cq4Var, LogSessionId logSessionId) {
        this.a = 5;
        this.d = context;
        this.o = g95Var;
        jdc jdcVar = new jdc(bd3Var);
        this.X = jdcVar;
        nq4 nq4Var = cq4Var.a;
        ar4 ar4Var = new ar4(context);
        ar4Var.b(nq4Var);
        bo4.m("bufferForPlaybackMs", 100, 0, "0");
        bo4.m("bufferForPlaybackAfterRebufferMs", 200, 0, "0");
        bo4.m("minBufferMs", 50000, 100, "bufferForPlaybackMs");
        bo4.m("minBufferMs", 50000, 200, "bufferForPlaybackAfterRebufferMs");
        bo4.m("maxBufferMs", 50000, 50000, "minBufferMs");
        bo4 bo4Var = new bo4(new ri4(), 50000, 50000, 100, 200, false);
        hl5 hl5Var = new hl5(context, new kl5(g95Var.b, g95Var.c, jdcVar, i, ztVar, logSessionId));
        hsi.g(!hl5Var.x);
        hl5Var.d = new eo4(2, b99Var);
        hl5Var.c(ar4Var);
        hl5Var.b(bo4Var);
        hsi.g(!hl5Var.x);
        looper.getClass();
        hl5Var.i = looper;
        hsi.g(!hl5Var.x);
        hl5Var.v = false;
        if (bd3Var instanceof fl4) {
            ((fl4) bd3Var).getClass();
            hsi.g(!hl5Var.x);
        }
        if (mwfVar != mwf.a) {
            hsi.g(!hl5Var.x);
            hl5Var.b = mwfVar;
        }
        em5 em5VarA = hl5Var.a();
        this.c = em5VarA;
        em5VarA.x0.a(new jl5(this, ztVar));
        this.b = 0;
    }

    public ggg(ijg ijgVar, int i) {
        this.a = 14;
        this.c = ijgVar;
        this.d = new u62(new byte[5], 5, 2, (byte) 0);
        this.o = new SparseArray();
        this.X = new SparseIntArray();
        this.b = i;
    }

    public ggg(jjg jjgVar, int i) {
        this.a = 15;
        this.c = jjgVar;
        this.d = new u62(new byte[5], 5, 3, (byte) 0);
        this.o = new SparseArray();
        this.X = new SparseIntArray();
        this.b = i;
    }

    public ggg(by6 by6Var, zx6[] zx6VarArr) {
        this.a = 8;
        this.c = by6Var;
        int length = zx6VarArr.length;
        this.d = new zx6[length];
        this.b = length - 1;
        int iF = by6Var.f() + 1;
        zx6[][] zx6VarArr2 = new zx6[iF][];
        int[] iArr = new int[iF];
        for (zx6 zx6Var : zx6VarArr) {
            int i = zx6Var.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < iF; i2++) {
            zx6VarArr2[i2] = new zx6[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (zx6 zx6Var2 : zx6VarArr) {
            int i3 = zx6Var2.a.a;
            zx6[] zx6VarArr3 = zx6VarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            zx6VarArr3[i4] = zx6Var2;
        }
        this.o = zx6VarArr2;
        this.X = new int[((by6) this.c).f() + 1];
    }
}
