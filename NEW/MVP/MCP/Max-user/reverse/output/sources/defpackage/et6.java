package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class et6 {
    public final k18 a;
    public final k18 b;

    public et6(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r7, long r9, java.lang.Integer r11, defpackage.q44 r12) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.dt6
            if (r0 == 0) goto L13
            r0 = r12
            dt6 r0 = (defpackage.dt6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            dt6 r0 = new dt6
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.X
            int r1 = r0.Z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2c
            et6 r7 = r0.o
            et6 r8 = r0.d
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L2a
            goto L71
        L2a:
            r7 = move-exception
            goto L7a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.g8j.b(r12)
            zf8 r12 = new zf8
            r1 = 6
            r12.<init>(r2, r1)
            java.lang.Object r1 = r12.b
            us r1 = (defpackage.us) r1
            r4 = 0
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto La0
            java.lang.String r4 = "chatId"
            r12.t(r7, r4)
            java.lang.String r7 = "messageId"
            r12.t(r9, r7)
            if (r11 == 0) goto L58
            java.lang.String r7 = "count"
            r1.put(r7, r11)
        L58:
            k18 r7 = r6.a     // Catch: java.lang.Throwable -> L78
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L78
            hwa r7 = (defpackage.hwa) r7     // Catch: java.lang.Throwable -> L78
            r0.d = r6     // Catch: java.lang.Throwable -> L78
            r0.o = r6     // Catch: java.lang.Throwable -> L78
            r0.Z = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r12 = r7.F(r12, r0)     // Catch: java.lang.Throwable -> L78
            g84 r7 = defpackage.g84.a
            if (r12 != r7) goto L6f
            return r7
        L6f:
            r7 = r6
            r8 = r7
        L71:
            x4a r12 = (defpackage.x4a) r12     // Catch: java.lang.Throwable -> L2a
            zl9 r7 = r7.b(r12)     // Catch: java.lang.Throwable -> L2a
            goto L80
        L78:
            r7 = move-exception
            r8 = r6
        L7a:
            ipd r9 = new ipd
            r9.<init>(r7)
            r7 = r9
        L80:
            java.lang.Throwable r9 = defpackage.kpd.a(r7)
            if (r9 == 0) goto L99
            boolean r10 = r9 instanceof java.util.concurrent.CancellationException
            if (r10 != 0) goto L98
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r10 = "Can't load detailed reactions"
            defpackage.wqi.e(r8, r10, r9)
            goto L99
        L98:
            throw r9
        L99:
            boolean r8 = r7 instanceof defpackage.ipd
            if (r8 == 0) goto L9e
            goto L9f
        L9e:
            r2 = r7
        L9f:
            return r2
        La0:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "param messageIds can't be empty"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et6.a(long, long, java.lang.Integer, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hd5] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public final zl9 b(x4a x4aVar) {
        ?? arrayList;
        xl9 xl9Var;
        f9d f9dVar;
        Object next;
        ArrayList arrayList2 = x4aVar.c;
        k18 k18Var = this.b;
        if (arrayList2 != null) {
            arrayList = new ArrayList(we3.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                sl9 sl9Var = (sl9) it.next();
                arrayList.add(new tl9(sl9Var.a, ((yl9) k18Var.getValue()).b(sl9Var.b.b)));
            }
        } else {
            arrayList = hd5.a;
        }
        List list = arrayList;
        ul9 ul9Var = x4aVar.d;
        if (ul9Var != null) {
            ArrayList arrayList3 = ul9Var.a;
            ArrayList arrayList4 = new ArrayList(we3.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                rl9 rl9Var = (rl9) it2.next();
                arrayList4.add(new wl9(((yl9) k18Var.getValue()).d(rl9Var.a), rl9Var.b));
            }
            int i = ul9Var.b;
            ql9 ql9Var = ul9Var.c;
            if (ql9Var != null) {
                int i2 = ql9Var.a.a;
                f2 f2Var = new f2(0, g9d.d);
                while (true) {
                    if (!f2Var.hasNext()) {
                        next = null;
                        break;
                    }
                    next = f2Var.next();
                    if (((g9d) next).a == i2) {
                        break;
                    }
                }
                g9d g9dVar = (g9d) next;
                if (g9dVar == null) {
                    throw new IllegalArgumentException(ho7.f(i2, "Unknown reactionType = "));
                }
                f9dVar = new f9d(g9dVar, ((yl9) k18Var.getValue()).b(ql9Var.b));
            } else {
                f9dVar = null;
            }
            xl9Var = new xl9(arrayList4, i, f9dVar);
        } else {
            xl9Var = null;
        }
        sl9 sl9Var2 = x4aVar.o;
        tl9 tl9Var = sl9Var2 != null ? new tl9(sl9Var2.a, ((yl9) k18Var.getValue()).b(sl9Var2.b.b)) : null;
        Long l = x4aVar.X;
        return new zl9(list, xl9Var, tl9Var, l != null ? l.longValue() : 0L);
    }
}
