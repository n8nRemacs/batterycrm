package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class p4j {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static ArrayList b(kf2 kf2Var, long j, rs4 rs4Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = kf2Var.d(rs4Var).iterator();
        while (it.hasNext()) {
            jf2 jf2Var = (jf2) it.next();
            long j2 = jf2Var.b;
            if (j2 >= j) {
                if (jf2Var.a > j) {
                    arrayList.add(jf2Var);
                } else if (i(j, jf2Var)) {
                    long j3 = 1 + j;
                    if (j3 <= j2) {
                        if (j3 == -1) {
                            wqi.p("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        if (j2 == -1) {
                            wqi.p("Chunk.Builder", "", new IllegalStateException("end time is -1"));
                        }
                        arrayList.add(new jf2(j3, j2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(java.util.List r5, java.util.List r6, long r7, int r9, long r10, int r12, long r13) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4j.c(java.util.List, java.util.List, long, int, long, int, long):java.util.ArrayList");
    }

    public static boolean d(kf2 kf2Var, long j, long j2, rs4 rs4Var) {
        ArrayList arrayListD = kf2Var.d(rs4Var);
        imb imbVarE = e(j, arrayListD);
        Object obj = imbVarE.b;
        if (obj == null) {
            return false;
        }
        jf2 jf2Var = (jf2) obj;
        long j3 = jf2Var.a;
        if (j3 == -1) {
            wqi.p("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        if (jf2Var.b == -1) {
            wqi.p("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        if (j2 == -1) {
            wqi.p("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        kf2Var.d(rs4Var).remove(((Integer) imbVarE.a).intValue());
        kf2.e(rs4Var);
        kf2Var.a(new jf2(j3, j2), rs4Var);
        arrayListD.sort(Comparator.comparingLong(new p93(0)));
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return true;
        }
        lg8 lg8Var = lg8.d;
        if (!l6bVar.b(lg8Var)) {
            return true;
        }
        l6bVar.c(lg8Var, "p4j", "extend by prevMsg: " + l(kf2Var.d(rs4Var)), null);
        return true;
    }

    public static imb e(long j, List list) {
        jf2 jf2Var;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                jf2Var = null;
                i = -1;
                break;
            }
            jf2Var = (jf2) list.get(i);
            long j2 = jf2Var.a;
            long j3 = jf2Var.b;
            if (j2 != j3) {
                if (j >= j2 && j <= j3) {
                    break;
                }
                i++;
            } else {
                if (j == j2) {
                    break;
                }
                i++;
            }
        }
        return new imb(Integer.valueOf(i), jf2Var);
    }

    public static jf2 f(long j, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        jf2 jf2Var = null;
        while (it.hasNext()) {
            jf2 jf2Var2 = (jf2) it.next();
            long j2 = jf2Var2.b;
            if (j2 < j && (jf2Var == null || j2 > jf2Var.b)) {
                jf2Var = jf2Var2;
            }
        }
        return jf2Var;
    }

    public static long g(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static void h(kf2 kf2Var, long j, rs4 rs4Var) {
        if (((jf2) e(j, kf2Var.d(rs4Var)).b) == null) {
            kf2Var.a(new jf2(j, j), rs4Var);
        }
    }

    public static boolean i(long j, jf2 jf2Var) {
        return jf2Var != null && jf2Var.a <= j && j <= jf2Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0089 A[EDGE_INSN: B:56:0x0089->B:37:0x0089 BREAK  A[LOOP:2: B:17:0x0036->B:57:0x0036], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.util.ArrayList r17) {
        /*
            r0 = r17
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto Lb
            goto Lae
        Lb:
            r1 = 0
            r4 = r1
            r3 = r2
        Le:
            if (r3 == 0) goto L97
            int r3 = r0.size()
            if (r3 <= r2) goto L97
            java.util.Iterator r3 = r0.iterator()
            r5 = 0
        L1b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L8e
            java.lang.Object r6 = r3.next()
            jf2 r6 = (defpackage.jf2) r6
            if (r4 != 0) goto L2f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L32
        L2f:
            r4.clear()
        L32:
            java.util.Iterator r7 = r0.iterator()
        L36:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r7.next()
            jf2 r8 = (defpackage.jf2) r8
            if (r6 != r8) goto L45
            goto L36
        L45:
            long r9 = r6.a
            long r11 = r8.a
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L57
            long r13 = r8.b
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 <= 0) goto L54
            goto L57
        L54:
            r16 = r3
            goto L65
        L57:
            long r13 = r6.b
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r16 = r3
            if (r15 < 0) goto L80
            long r2 = r8.b
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L80
        L65:
            long r2 = java.lang.Math.min(r9, r11)
            long r9 = r6.b
            long r11 = r8.b
            long r9 = java.lang.Math.max(r9, r11)
            jf2 r5 = new jf2
            r5.<init>(r2, r9)
            r4.add(r6)
            r4.add(r8)
            r0.add(r5)
            r5 = 1
        L80:
            if (r5 == 0) goto L83
            goto L89
        L83:
            r3 = r16
            r2 = 1
            goto L36
        L87:
            r16 = r3
        L89:
            r0.removeAll(r4)
            if (r5 == 0) goto L90
        L8e:
            r3 = r5
            goto L94
        L90:
            r3 = r16
            r2 = 1
            goto L1b
        L94:
            r2 = 1
            goto Le
        L97:
            o00 r2 = new o00
            r3 = 13
            r2.<init>(r3)
            r0.sort(r2)
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto La6
            goto Lae
        La6:
            lg8 r3 = defpackage.lg8.d
            boolean r4 = r2.b(r3)
            if (r4 != 0) goto Laf
        Lae:
            return
        Laf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mergeChunks: "
            r4.<init>(r5)
            java.lang.String r0 = l(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "p4j"
            r2.c(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4j.j(java.util.ArrayList):void");
    }

    public static String k(jf2 jf2Var) {
        if (jf2Var == null) {
            return null;
        }
        Date date = new Date(jf2Var.a);
        Date date2 = new Date(jf2Var.b);
        return String.format(Locale.ENGLISH, "time[%tF %tT %tL - %tF %tT %tL], millis[%d - %d]", date, date, date, date2, date2, date2, Long.valueOf(date.getTime()), Long.valueOf(date2.getTime()));
    }

    public static String l(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.isEmpty()) {
            sb.append("chunks count=0");
        } else {
            sb.append("chunks count=");
            sb.append(arrayList.size());
            sb.append(": ");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(k((jf2) it.next()));
                sb.append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
