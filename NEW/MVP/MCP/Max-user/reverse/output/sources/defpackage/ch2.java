package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ch2 {
    public final String a = ch2.class.getName();
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public ch2(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
    }

    public static zde b(at atVar, c23 c23Var) {
        if (c23Var instanceof a23) {
            return lee.h(atVar, new gf1(9));
        }
        if (c23Var instanceof b23) {
            return atVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final zde a(zde zdeVar, c23 c23Var) {
        if (c23Var instanceof a23) {
            return zdeVar;
        }
        if (!(c23Var instanceof b23)) {
            throw new NoWhenBranchMatchedException();
        }
        b23 b23Var = (b23) c23Var;
        final Set set = b23Var.a;
        final Set set2 = b23Var.b;
        final Set set3 = b23Var.c;
        final Set set4 = b23Var.d;
        final Map map = b23Var.e;
        return lee.g(zdeVar, new em6() { // from class: zg2
            /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
            @Override // defpackage.em6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    pb2 r5 = (defpackage.pb2) r5
                    rf2 r0 = r5.b
                    long r1 = r0.a
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    java.util.Set r2 = r2
                    boolean r1 = r2.contains(r1)
                    ch2 r2 = r4.a
                    java.util.Map r3 = r4
                    if (r1 != 0) goto L1e
                    java.util.Set r1 = r3
                    boolean r1 = r2.f(r1, r3, r5)
                    if (r1 == 0) goto L37
                L1e:
                    long r0 = r0.a
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    java.util.Set r1 = r5
                    boolean r0 = r1.contains(r0)
                    if (r0 != 0) goto L37
                    java.util.Set r0 = r6
                    boolean r5 = r2.f(r0, r3, r5)
                    if (r5 == 0) goto L35
                    goto L37
                L35:
                    r5 = 1
                    goto L38
                L37:
                    r5 = 0
                L38:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zg2.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    public final Object c(c23 c23Var) {
        if (!(c23Var instanceof a23)) {
            if (c23Var instanceof b23) {
                return hd5.a;
            }
            throw new NoWhenBranchMatchedException();
        }
        List listO = ((ve2) this.c.getValue()).O(ve2.J);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((pb2) obj).R()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List d(c23 c23Var, long j, Long l, int i) {
        zde zdeVarA = a(b(new at(2, ((ve2) this.c.getValue()).O(c23Var.getComparator())), c23Var), c23Var);
        Iterator it = zdeVarA.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                ve3.p();
                throw null;
            }
            pb2 pb2Var = (pb2) next;
            if (j >= pb2Var.q()) {
                long j2 = pb2Var.a;
                if (l == null || j2 != l.longValue()) {
                    break;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return hd5.a;
        }
        return lee.o(zdeVarA).subList(i2, Math.min(i != Integer.MAX_VALUE ? i + i2 + 1 : Integer.MAX_VALUE, lee.e(zdeVarA)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, defpackage.q44 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ah2
            if (r0 == 0) goto L13
            r0 = r10
            ah2 r0 = (defpackage.ah2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ah2 r0 = new ah2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            ch2 r9 = r0.o
            java.lang.String r1 = r0.d
            defpackage.g8j.b(r10)
            goto L77
        L3a:
            defpackage.g8j.b(r10)
            k18 r10 = r8.e
            java.lang.Object r10 = r10.getValue()
            va4 r10 = (defpackage.va4) r10
            r0.d = r9
            r0.o = r8
            r0.Z = r3
            drd r10 = r10.i()
            r10.getClass()
            java.lang.String r1 = "SELECT chatId FROM folder_and_chats WHERE folderId = ?"
            dsd r1 = defpackage.dsd.c(r3, r1)
            if (r9 != 0) goto L5e
            r1.S(r3)
            goto L61
        L5e:
            r1.f(r3, r9)
        L61:
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl r5 = r10.a
            brd r6 = new brd
            r7 = 1
            r6.<init>(r10, r1, r7)
            java.lang.Object r10 = defpackage.k7j.a(r5, r3, r6, r0)
            if (r10 != r4) goto L75
            goto L8c
        L75:
            r1 = r9
            r9 = r8
        L77:
            java.util.List r10 = (java.util.List) r10
            java.lang.String r3 = "all.chat.folder"
            boolean r1 = defpackage.fni.a(r1, r3)
            r3 = 0
            r0.d = r3
            r0.o = r3
            r0.Z = r2
            java.lang.Object r9 = r9.h(r0, r10, r1)
            if (r9 != r4) goto L8d
        L8c:
            return r4
        L8d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch2.e(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.util.Set r8, java.util.Map r9, defpackage.pb2 r10) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch2.f(java.util.Set, java.util.Map, pb2):boolean");
    }

    public final Boolean g(long j, String str) {
        lg8 lg8Var = lg8.X;
        pb2 pb2Var = (pb2) ((w63) this.d.getValue()).j(j).a.getValue();
        if (pb2Var == null) {
            String str2 = this.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, vb9.e(j, "Not found chat with id="), null);
            }
            return Boolean.FALSE;
        }
        f86 f86Var = (f86) ((va4) this.e.getValue()).h(str).getValue();
        if (f86Var != null) {
            return Boolean.valueOf(f86Var.a() || f86Var.o.contains(new Long(pb2Var.b.a)) || f(f86Var.d, f86Var.Y, pb2Var));
        }
        String str3 = this.a;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, str3, "Not found folder with id=".concat(str), null);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.q44 r7, java.util.List r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bh2
            if (r0 == 0) goto L13
            r0 = r7
            bh2 r0 = (defpackage.bh2) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            bh2 r0 = new bh2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.Z
            int r1 = r0.t0
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.util.Iterator r8 = r0.Y
            java.util.Collection r9 = r0.X
            java.util.Comparator r1 = r0.o
            ch2 r3 = r0.d
            defpackage.g8j.b(r7)
            goto L7e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.g8j.b(r7)
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L41
            hd5 r7 = defpackage.hd5.a
            return r7
        L41:
            if (r9 == 0) goto L46
            o00 r7 = defpackage.ve2.J
            goto L48
        L46:
            o00 r7 = defpackage.ve2.I
        L48:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
            r3 = r6
            r1 = r7
        L53:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r8.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r4 = r7.longValue()
            k18 r7 = r3.d
            java.lang.Object r7 = r7.getValue()
            w63 r7 = (defpackage.w63) r7
            r0.d = r3
            r0.o = r1
            r0.X = r9
            r0.Y = r8
            r0.t0 = r2
            java.lang.Object r7 = r7.h(r4, r0)
            g84 r4 = defpackage.g84.a
            if (r7 != r4) goto L7e
            return r4
        L7e:
            pb2 r7 = (defpackage.pb2) r7
            if (r7 == 0) goto L53
            r9.add(r7)
            goto L53
        L86:
            java.util.List r9 = (java.util.List) r9
            java.util.List r7 = defpackage.ue3.X(r9, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch2.h(q44, java.util.List, boolean):java.lang.Object");
    }
}
