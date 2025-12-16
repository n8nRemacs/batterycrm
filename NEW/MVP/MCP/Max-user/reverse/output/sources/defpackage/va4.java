package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class va4 implements ui8 {
    public final k18 X;
    public final bwf Y;
    public final nxg Z;
    public final b1b a;
    public final String b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final ConcurrentHashMap s0;
    public final w8a t0;
    public final jve u0;
    public final hbd v0;
    public final mk3 w0;
    public final n9a x0;
    public final nn8 y0;

    public va4(k18 k18Var, k18 k18Var2, k18 k18Var3, OneMeRoomDatabase oneMeRoomDatabase, k18 k18Var4, b1b b1bVar, g5b g5bVar, nxg nxgVar) {
        Context context = g5bVar.a;
        this.a = b1bVar;
        this.b = va4.class.getName();
        this.c = k18Var;
        this.d = k18Var2;
        this.o = k18Var4;
        this.X = k18Var3;
        this.Y = new bwf(new e44(4, oneMeRoomDatabase));
        this.Z = nxgVar;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        CharSequence charSequenceA = ((e7b) k18Var3.getValue()).a(g5bVar.a.getString(mvd.Y), null, 2, false, 0, true, false);
        id5 id5Var = id5.a;
        n8a n8aVar = dk8.a;
        rd5 rd5Var = rd5.a;
        hd5 hd5Var = hd5.a;
        concurrentHashMap.put("all.chat.folder", ucf.a(new f86("all.chat.folder", charSequenceA, -1, rd5Var, rd5Var, hd5Var, id5Var, hd5Var, rd5Var, n8aVar, 0L, null, null, false, null, rd5Var, rd5Var)));
        this.s0 = concurrentHashMap;
        Object[] objArr = rqa.a;
        w8a w8aVar = new w8a(1);
        w8aVar.b("all.chat.folder");
        this.t0 = w8aVar;
        jve jveVarB = kve.b(1, 0, 6);
        this.u0 = jveVarB;
        this.v0 = gw0.C(new g56(gw0.E(jveVarB, new mo1((Continuation) null, this, 1)), new ia4(this, null), 1), nxgVar, yve.b, hd5Var);
        this.w0 = new mk3();
        Symbol symbol = o9a.a;
        n9a n9aVar = new n9a();
        this.x0 = n9aVar;
        nn8 nn8Var = new nn8();
        nn8Var.put(Collections.singleton(da6.X), context.getString(mvd.b0));
        nn8Var.put(gke.h(da6.w0, da6.x0), context.getString(mvd.c0));
        this.y0 = nn8Var.b();
        svi.e(nxgVar, null, null, new ta4(n9aVar, null, this, k18Var3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.va4 r9, int r10, defpackage.dh2 r11, defpackage.q44 r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof defpackage.na4
            if (r0 == 0) goto L16
            r0 = r12
            na4 r0 = (defpackage.na4) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            na4 r0 = new na4
            r0.<init>(r9, r12)
        L1b:
            java.lang.Object r12 = r0.Y
            g84 r1 = defpackage.g84.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            uqd r9 = r0.X
            dh2 r11 = r0.o
            va4 r10 = r0.d
            defpackage.g8j.b(r12)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L8a
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.g8j.b(r12)
            java.lang.String r12 = r9.b
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L45
            goto L69
        L45:
            lg8 r4 = defpackage.lg8.d
            boolean r5 = r2.b(r4)
            if (r5 == 0) goto L69
            java.lang.String r5 = r11.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "internalCreate of folder="
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " on position="
            r6.append(r5)
            r6.append(r10)
            java.lang.String r5 = r6.toString()
            r6 = 0
            r2.c(r4, r12, r5, r6)
        L69:
            uqd r10 = defpackage.h8j.b(r11, r10)
            drd r12 = r9.i()
            n8a r2 = r11.e
            r0.d = r9
            r0.o = r11
            r0.X = r10
            r0.s0 = r3
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl r3 = r12.a
            yqd r4 = new yqd
            r5 = 0
            r4.<init>(r12, r10, r2, r5)
            java.lang.Object r12 = defpackage.i8j.a(r3, r4, r0)
            if (r12 != r1) goto L8a
            return r1
        L8a:
            java.util.concurrent.ConcurrentHashMap r12 = r9.s0
            java.lang.String r0 = r11.a
            k18 r9 = r9.X
            java.lang.Object r9 = r9.getValue()
            e7b r9 = (defpackage.e7b) r9
            n8a r11 = r11.e
            java.util.Set r11 = defpackage.dsi.j(r11)
            f86 r9 = defpackage.h8j.c(r10, r9, r11)
            tcf r9 = defpackage.ucf.a(r9)
            r12.put(r0, r9)
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.a(va4, int, dh2, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.va4 r25, defpackage.d9a r26, defpackage.q44 r27) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.b(va4, d9a, q44):java.lang.Object");
    }

    @Override // defpackage.ui8
    public final void c() throws Throwable {
        String str = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Clearing all cache on logout", null);
            }
        }
        this.s0.clear();
        svi.g(bd5.a, new ra4(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:22:0x0059, B:48:0x010e, B:55:0x011d, B:54:0x011b), top: B:69:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r20, defpackage.dh2 r22, defpackage.w8a r23, defpackage.q44 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.d(long, dh2, w8a, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[Catch: all -> 0x005d, PHI: r4 r7 r10 r11 r13
  0x0104: PHI (r4v9 ??) = (r4v13 ??), (r4v14 ??) binds: [B:46:0x0101, B:23:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r7v4 va4) = (r7v3 va4), (r7v6 va4) binds: [B:46:0x0101, B:23:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v8 java.lang.String) binds: [B:46:0x0101, B:23:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r11v1 long) = (r11v0 long), (r11v3 long) binds: [B:46:0x0101, B:23:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r13v3 va4) = (r13v2 va4), (r13v6 va4) binds: [B:46:0x0101, B:23:0x0058] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x005d, blocks: (B:22:0x0055, B:48:0x0104, B:50:0x010c, B:51:0x010f, B:45:0x00e0), top: B:61:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:22:0x0055, B:48:0x0104, B:50:0x010c, B:51:0x010f, B:45:0x00e0), top: B:61:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [j9a] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r19, java.lang.String r21, defpackage.q44 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.e(long, java.lang.String, q44):java.lang.Object");
    }

    public final boolean f() {
        if (!this.w0.isCompleted()) {
            return false;
        }
        int size = ((List) this.v0.a.getValue()).size();
        l5c l5cVar = (l5c) ((age) this.d.getValue());
        l5cVar.getClass();
        return size < ((int) l5cVar.m(PmsKey.f54foldersmaxcount, (long) 30)) + 1;
    }

    public final pb3 g() {
        return (pb3) this.c.getValue();
    }

    public final mcf h(String str) {
        return (mcf) this.s0.computeIfAbsent(str, new ni(11, new ia(this, 13, str)));
    }

    public final drd i() {
        return (drd) this.Y.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(defpackage.q44 r25) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.j(q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.dh2 r15, java.lang.Integer r16, defpackage.q44 r17) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.k(dh2, java.lang.Integer, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v13, types: [j9a] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r12, defpackage.q44 r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.l(long, q44, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:52:0x0113, B:38:0x00ba, B:40:0x00c6, B:46:0x00eb, B:43:0x00cd, B:45:0x00d5, B:47:0x00fe), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:52:0x0113, B:38:0x00ba, B:40:0x00c6, B:46:0x00eb, B:43:0x00cd, B:45:0x00d5, B:47:0x00fe), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r13v0, types: [dh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r11, defpackage.dh2 r13, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.m(long, dh2, q44):java.lang.Object");
    }
}
