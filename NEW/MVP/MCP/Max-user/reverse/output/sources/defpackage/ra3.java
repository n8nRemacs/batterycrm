package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ra3 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public static vk4 a(DataInputStream dataInputStream) {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(ho7.f(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = zxg.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new vk4(map);
    }

    public static void b(vk4 vk4Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = vk4Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static d99 e(u3c u3cVar, wg7 wg7Var, d99 d99Var, m9g m9gVar) {
        s9g s9gVarV = u3cVar.v();
        int iJ = u3cVar.j();
        Object objL = s9gVarV.p() ? null : s9gVarV.l(iJ);
        int iB = (u3cVar.f() || s9gVarV.p()) ? -1 : s9gVarV.f(iJ, m9gVar, false).b(zxg.U(u3cVar.e()) - m9gVar.e);
        for (int i = 0; i < wg7Var.size(); i++) {
            d99 d99Var2 = (d99) wg7Var.get(i);
            if (j(d99Var2, objL, u3cVar.f(), u3cVar.s(), u3cVar.l(), iB)) {
                return d99Var2;
            }
        }
        if (wg7Var.isEmpty() && d99Var != null && j(d99Var, objL, u3cVar.f(), u3cVar.s(), u3cVar.l(), iB)) {
            return d99Var;
        }
        return null;
    }

    public static boolean j(d99 d99Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = d99Var.a;
        int i4 = d99Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && d99Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && d99Var.e == i3;
    }

    public void c(lk6 lk6Var, d99 d99Var, s9g s9gVar) {
        if (d99Var == null) {
            return;
        }
        if (s9gVar.b(d99Var.a) != -1) {
            lk6Var.T(d99Var, s9gVar);
            return;
        }
        s9g s9gVar2 = (s9g) ((ah7) this.c).get(d99Var);
        if (s9gVar2 != null) {
            lk6Var.T(d99Var, s9gVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r12, defpackage.p3b r14, defpackage.q44 r15) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.b
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r15 instanceof defpackage.pa3
            if (r1 == 0) goto L17
            r1 = r15
            pa3 r1 = (defpackage.pa3) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1c
        L17:
            pa3 r1 = new pa3
            r1.<init>(r11, r15)
        L1c:
            java.lang.Object r15 = r1.Y
            int r2 = r1.s0
            qqg r3 = defpackage.qqg.a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            long r12 = r1.X
            java.lang.Long r14 = r1.o
            ra3 r0 = r1.d
            defpackage.g8j.b(r15)
        L30:
            r7 = r12
            goto L90
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            defpackage.g8j.b(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "dropServerDraft "
            r15.<init>(r2)
            r15.append(r12)
            java.lang.String r15 = r15.toString()
            defpackage.wqi.d(r0, r15)
            java.lang.Object r15 = r11.f
            k18 r15 = (defpackage.k18) r15
            java.lang.Object r15 = r15.getValue()
            age r15 = (defpackage.age) r15
            l5c r15 = (defpackage.l5c) r15
            boolean r15 = r15.s()
            if (r15 != 0) goto L66
            java.lang.String r12 = "Drafts sync NOT enabled. Not discard to server"
            defpackage.wqi.d(r0, r12)
            return r3
        L66:
            if (r14 == 0) goto L6b
            java.lang.Long r14 = r14.e
            goto L6c
        L6b:
            r14 = 0
        L6c:
            if (r14 != 0) goto L74
            java.lang.String r12 = "Drafts sync enabled. No old draft. Not discard to server"
            defpackage.wqi.d(r0, r12)
            return r3
        L74:
            java.lang.String r15 = "Drafts sync enabled. Discard to server"
            defpackage.wqi.d(r0, r15)
            java.lang.Object r15 = r11.a
            oa3 r15 = (defpackage.oa3) r15
            r1.d = r11
            r1.o = r14
            r1.X = r12
            r1.s0 = r4
            java.lang.Object r15 = r15.a(r12, r1)
            g84 r0 = defpackage.g84.a
            if (r15 != r0) goto L8e
            return r0
        L8e:
            r0 = r11
            goto L30
        L90:
            java.lang.Object r12 = r0.e
            k18 r12 = (defpackage.k18) r12
            java.lang.Object r12 = r12.getValue()
            hwa r12 = (defpackage.hwa) r12
            long r9 = r14.longValue()
            boolean r13 = r12.j(r7)
            if (r13 == 0) goto Lbd
            r13 = 0
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 >= 0) goto Lab
            goto Lbd
        Lab:
            x25 r4 = new x25
            z7c r13 = r12.t()
            pe8 r13 = r13.a
            long r5 = r13.k()
            r4.<init>(r5, r7, r9)
            defpackage.hwa.r(r12, r4)
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra3.d(long, p3b, q44):java.lang.Object");
    }

    public gz0 f(String str) {
        return (gz0) ((HashMap) this.a).get(str);
    }

    public gz0 g(String str) {
        HashMap map = (HashMap) this.a;
        gz0 gz0Var = (gz0) map.get(str);
        if (gz0Var != null) {
            return gz0Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        gz0 gz0Var2 = new gz0(iKeyAt, str, vk4.c);
        map.put(str, gz0Var2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((hz0) this.e).e(gz0Var2);
        return gz0Var2;
    }

    public void h(long j) {
        hz0 hz0Var;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        hz0 hz0Var2 = (hz0) this.e;
        hz0Var2.j(j);
        hz0 hz0Var3 = (hz0) this.f;
        if (hz0Var3 != null) {
            hz0Var3.j(j);
        }
        if (hz0Var2.f() || (hz0Var = (hz0) this.f) == null || !hz0Var.f()) {
            hz0Var2.l(map, sparseArray);
        } else {
            ((hz0) this.f).l(map, sparseArray);
            hz0Var2.b(map);
        }
        hz0 hz0Var4 = (hz0) this.f;
        if (hz0Var4 != null) {
            hz0Var4.m();
            this.f = null;
        }
    }

    public Object i(long j, dtf dtfVar) {
        Object objI = svi.i(((q2b) ((lzf) ((k18) this.d).getValue())).b(), new qa3(this, j, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public void k(String str) {
        SparseArray sparseArray = (SparseArray) this.b;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.a;
        gz0 gz0Var = (gz0) map.get(str);
        if (gz0Var != null && gz0Var.c.isEmpty() && gz0Var.d.isEmpty()) {
            map.remove(str);
            int i = gz0Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((hz0) this.e).d(gz0Var, z);
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public void l() {
        ((hz0) this.e).g((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void m(s9g s9gVar) {
        lk6 lk6Var = new lk6(4);
        if (((wg7) this.b).isEmpty()) {
            c(lk6Var, (d99) this.e, s9gVar);
            if (!Objects.equals((d99) this.f, (d99) this.e)) {
                c(lk6Var, (d99) this.f, s9gVar);
            }
            if (!Objects.equals((d99) this.d, (d99) this.e) && !Objects.equals((d99) this.d, (d99) this.f)) {
                c(lk6Var, (d99) this.d, s9gVar);
            }
        } else {
            for (int i = 0; i < ((wg7) this.b).size(); i++) {
                c(lk6Var, (d99) ((wg7) this.b).get(i), s9gVar);
            }
            if (!((wg7) this.b).contains((d99) this.d)) {
                c(lk6Var, (d99) this.d, s9gVar);
            }
        }
        this.c = lk6Var.u();
    }
}
