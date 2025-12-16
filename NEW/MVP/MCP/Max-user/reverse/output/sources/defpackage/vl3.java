package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class vl3 implements ol3, yt, qp5 {
    public static final tl3 Z = new tl3(0);
    public static final byte[] s0 = {0, 7, 8, 15};
    public static final byte[] t0 = {0, 119, -120, -1};
    public static final byte[] u0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object Y;
    public Object o;
    public Object a = new HashMap();
    public Object b = new HashMap();
    public Object c = new HashMap();
    public Object d = new HashSet();
    public Object X = new AtomicReference();

    public vl3(Executor executor, ArrayList arrayList, ArrayList arrayList2, sl3 sl3Var) {
        ai5 ai5Var = new ai5(executor);
        this.o = ai5Var;
        this.Y = sl3Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(cl3.c(ai5Var, ai5.class, bof.class, nqc.class));
        arrayList3.add(cl3.c(this, vl3.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            cl3 cl3Var = (cl3) it.next();
            if (cl3Var != null) {
                arrayList3.add(cl3Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((rpc) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((sl3) this.Y).a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((cl3) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                t7j.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                t7j.a(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                cl3 cl3Var2 = (cl3) it5.next();
                ((HashMap) this.a).put(cl3Var2, new l18(new ul3(this, 0, cl3Var2)));
            }
            arrayList5.addAll(v(arrayList3));
            arrayList5.addAll(w());
            u();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.X).get();
        if (bool != null) {
            j((HashMap) this.a, bool.booleanValue());
        }
    }

    public static byte[] g(int i, int i2, u62 u62Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) u62Var.i(i2);
        }
        return bArr;
    }

    public static int[] k() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] l() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205 A[LOOP:3: B:87:0x0158->B:119:0x0205, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0201 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl3.r(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a75 s(u62 u62Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int i8 = u62Var.i(8);
        u62Var.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrK = k();
        int[] iArrL = l();
        while (i10 > 0) {
            int i12 = u62Var.i(i7);
            int i13 = u62Var.i(i7);
            int[] iArr2 = (i13 & 128) != 0 ? iArr : (i13 & 64) != 0 ? iArrK : iArrL;
            if ((i13 & 1) != 0) {
                i5 = u62Var.i(i7);
                i6 = u62Var.i(i7);
                i2 = u62Var.i(i7);
                i4 = u62Var.i(i7);
                i3 = i10 - 6;
            } else {
                int i14 = u62Var.i(6) << i9;
                int i15 = u62Var.i(4) << 4;
                i2 = u62Var.i(4) << 4;
                i3 = i10 - 4;
                i4 = u62Var.i(i9) << 6;
                i5 = i14;
                i6 = i15;
            }
            if (i5 == 0) {
                i6 = i11;
                i2 = i6;
                i4 = 255;
            }
            double d = i5;
            double d2 = i6 - 128;
            double d3 = i2 - 128;
            iArr2[i12] = m((byte) (255 - (i4 & 255)), xxg.i((int) ((1.402d * d2) + d), 0, 255), xxg.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), xxg.i((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i3;
            i11 = 0;
            i8 = i8;
            iArrL = iArrL;
            i7 = 8;
            i9 = 2;
        }
        return new a75(i8, iArr, iArrK, iArrL);
    }

    public static d75 t(u62 u62Var) {
        byte[] bArr;
        int i = u62Var.i(16);
        u62Var.t(4);
        int i2 = u62Var.i(2);
        boolean zH = u62Var.h();
        u62Var.t(1);
        byte[] bArr2 = xxg.f;
        if (i2 != 1) {
            if (i2 == 0) {
                int i3 = u62Var.i(16);
                int i4 = u62Var.i(16);
                if (i3 > 0) {
                    bArr2 = new byte[i3];
                    u62Var.l(i3, bArr2);
                }
                if (i4 > 0) {
                    bArr = new byte[i4];
                    u62Var.l(i4, bArr);
                }
            }
            return new d75(i, zH, bArr2, bArr);
        }
        u62Var.t(u62Var.i(8) * 16);
        bArr = bArr2;
        return new d75(i, zH, bArr2, bArr);
    }

    @Override // defpackage.ol3
    public synchronized rpc d(fsc fscVar) {
        p18 p18Var = (p18) ((HashMap) this.c).get(fscVar);
        if (p18Var != null) {
            return p18Var;
        }
        return Z;
    }

    @Override // defpackage.ol3
    public synchronized rpc e(fsc fscVar) {
        v5j.a(fscVar, "Null interface requested.");
        return (rpc) ((HashMap) this.b).get(fscVar);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new awg((Context) ((Provider) this.a).get(), (uy9) ((Provider) this.b).get(), (ri5) ((Provider) this.c).get(), (st7) ((u5i) this.d).get(), (Executor) ((Provider) this.o).get(), (wvf) ((Provider) this.X).get(), new iwf(), new nwf(), (eb3) ((Provider) this.Y).get());
    }

    @Override // defpackage.yt
    public au h(g95 g95Var, Looper looper, zt ztVar, ym3 ym3Var) {
        k09 k09Var = g95Var.a;
        Context context = (Context) this.a;
        String strC = tfi.c(context, k09Var);
        if (strC != null && xz9.k(strC)) {
            a09 a09Var = k09Var.b;
            a09Var.getClass();
            if (a09Var.h != -9223372036854775807L) {
                if (((s7c) this.X) == null) {
                    this.X = new s7c(context, (ue4) this.d);
                }
                return ((s7c) this.X).h(g95Var, looper, ztVar, ym3Var);
            }
        }
        if (((ywf) this.Y) == null) {
            this.Y = new ywf(context, (fl4) this.b, (mwf) this.c, (LogSessionId) this.o);
        }
        return ((ywf) this.Y).h(g95Var, looper, ztVar, ym3Var);
    }

    public sl i() {
        if (((kob) this.o) == null) {
            if (((h97) this.c) == null) {
                this.c = new tlf();
            }
            kob kobVar = new kob((h97) this.c);
            this.d = kobVar;
            this.o = kobVar;
        }
        return (kob) this.o;
    }

    public void j(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            cl3 cl3Var = (cl3) entry.getKey();
            rpc rpcVar = (rpc) entry.getValue();
            int i = cl3Var.d;
            if (i == 1 || (i == 2 && z)) {
                rpcVar.get();
            }
        }
        ai5 ai5Var = (ai5) this.o;
        synchronized (ai5Var) {
            try {
                arrayDeque = ai5Var.b;
                if (arrayDeque != null) {
                    ai5Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw ctd.h(it);
            }
        }
    }

    public Pair n(lo8 lo8Var) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < lo8Var.a; i3++) {
            if (lo8Var.c[i3].a != 0) {
                j1f j1fVar = (j1f) this.b;
                j1fVar.L0();
                dm5 dm5Var = j1fVar.c;
                dm5Var.d1();
                int i4 = dm5Var.Z[i3].a;
                if (i4 == 1) {
                    i2 = i3;
                } else if (i4 == 2) {
                    i = i3;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void o(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.X;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.a);
        }
        j(map, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl3.p():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Iterable, java.lang.Object] */
    public ArrayList q(mfg mfgVar, int i) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < mfgVar.a; i2++) {
            kfg kfgVarA = mfgVar.a(i2);
            for (int i3 = 0; i3 < kfgVarA.a; i3++) {
                gf6 gf6Var = kfgVarA.c[i3];
                fde fdeVar = (fde) this.Y;
                fdeVar.getClass();
                String str = gf6Var.v0;
                if (wz9.g(str) == 1) {
                    ?? r4 = fdeVar.c;
                    arrayList = new ArrayList();
                    for (Object obj : r4) {
                        if (obj instanceof lw8) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    if (wz9.g(str) == 2) {
                        ?? r42 = fdeVar.d;
                        arrayList = new ArrayList();
                        for (Object obj2 : r42) {
                            if (obj2 instanceof ix8) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    arrayList2.add(new ffg(gf6Var.a, gf6Var.b, gf6Var.c, gf6Var.A0, gf6Var.B0, gf6Var.Z, i, i2, i3));
                    break;
                }
                if (arrayList.isEmpty()) {
                    arrayList2.add(new ffg(gf6Var.a, gf6Var.b, gf6Var.c, gf6Var.A0, gf6Var.B0, gf6Var.Z, i, i2, i3));
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if ((((sw8) it.next()).x(gf6Var) & 7) == 4) {
                        arrayList2.add(new ffg(gf6Var.a, gf6Var.b, gf6Var.c, gf6Var.A0, gf6Var.B0, gf6Var.Z, i, i2, i3));
                        break;
                        break;
                    }
                }
                wqi.c("vl3", "mapTracks: Skip format %s", gf6Var);
            }
        }
        Collections.sort(arrayList2, new n7f(2));
        return arrayList2;
    }

    public void u() {
        for (cl3 cl3Var : ((HashMap) this.a).keySet()) {
            for (vt4 vt4Var : cl3Var.c) {
                if (vt4Var.b == 2 && !((HashMap) this.c).containsKey(vt4Var.a)) {
                    HashMap map = (HashMap) this.c;
                    fsc fscVar = vt4Var.a;
                    Set set = Collections.EMPTY_SET;
                    p18 p18Var = new p18();
                    p18Var.b = null;
                    p18Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    p18Var.a.addAll(set);
                    map.put(fscVar, p18Var);
                } else if (((HashMap) this.b).containsKey(vt4Var.a)) {
                    continue;
                } else {
                    int i = vt4Var.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + cl3Var + ": " + vt4Var.a);
                    }
                    if (i != 2) {
                        HashMap map2 = (HashMap) this.b;
                        fsc fscVar2 = vt4Var.a;
                        iqa iqaVar = djb.c;
                        tl3 tl3Var = djb.d;
                        djb djbVar = new djb();
                        djbVar.a = iqaVar;
                        djbVar.b = tl3Var;
                        map2.put(fscVar2, djbVar);
                    }
                }
            }
        }
    }

    public ArrayList v(ArrayList arrayList) {
        HashMap map = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cl3 cl3Var = (cl3) it.next();
            if (cl3Var.e == 0) {
                rpc rpcVar = (rpc) ((HashMap) this.a).get(cl3Var);
                for (fsc fscVar : cl3Var.b) {
                    if (map.containsKey(fscVar)) {
                        arrayList2.add(new my1((djb) ((rpc) map.get(fscVar)), 13, rpcVar));
                    } else {
                        map.put(fscVar, rpcVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList w() {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            cl3 cl3Var = (cl3) entry.getKey();
            if (cl3Var.e != 0) {
                rpc rpcVar = (rpc) entry.getValue();
                for (fsc fscVar : cl3Var.b) {
                    if (!map2.containsKey(fscVar)) {
                        map2.put(fscVar, new HashSet());
                    }
                    ((Set) map2.get(fscVar)).add(rpcVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                p18 p18Var = (p18) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new my1(p18Var, 14, (rpc) it.next()));
                }
            } else {
                fsc fscVar2 = (fsc) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                p18 p18Var2 = new p18();
                p18Var2.b = null;
                p18Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                p18Var2.a.addAll(set);
                map.put(fscVar2, p18Var2);
            }
        }
        return arrayList;
    }
}
