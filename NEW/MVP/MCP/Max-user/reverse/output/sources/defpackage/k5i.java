package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.animated.gif.GifImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Inflater;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class k5i implements bbd, m99, e55, tof, ke5 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public /* synthetic */ k5i(Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
        this.o = obj3;
    }

    public static int e(List list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(((kl0) list.get(i)).c));
        }
        return hashSet.size();
    }

    public static void m(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    @Override // defpackage.m99
    public void B(int i, c99 c99Var, g19 g19Var) {
        if (j(i, c99Var)) {
            ((qr4) this.c).c(g19Var);
        }
    }

    @Override // defpackage.m99
    public void C(int i, c99 c99Var, g19 g19Var) {
        if (j(i, c99Var)) {
            ((qr4) this.c).m(g19Var);
        }
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        Object objB;
        Object ipdVar;
        gv4 gv4Var;
        gu5 gu5Var = (gu5) this.b;
        ConcurrentHashMap concurrentHashMap = gu5Var.i;
        PmsKey pmsKey = (PmsKey) this.c;
        Object obj2 = this.d;
        Object obj3 = concurrentHashMap.get(pmsKey);
        if (obj3 == null) {
            if (gu5Var.m(pmsKey)) {
                objB = kaj.b(gu5Var.g, pmsKey.name(), null, vid.a(String.class));
            } else {
                l5c l5cVar = gu5Var.h;
                boolean zContains = l5cVar.h.g.contains(pmsKey.name());
                c4 c4Var = l5cVar;
                if (zContains) {
                    c4Var = l5cVar.h;
                }
                objB = kaj.b(c4Var.g, pmsKey.name(), null, vid.a(String.class));
            }
            String str = (String) objB;
            if (str != null) {
                ((q85) this.o).getClass();
                if (str.length() == 0) {
                    gv4Var = gv4.d;
                } else {
                    try {
                        ipdVar = new JSONObject(str);
                    } catch (Throwable th) {
                        ipdVar = new ipd(th);
                    }
                    JSONObject jSONObject = (JSONObject) (ipdVar instanceof ipd ? null : ipdVar);
                    if (jSONObject == null) {
                        gv4Var = gv4.d;
                    } else {
                        et3 et3Var = new et3(new at(6, jSONObject.keys()));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = et3Var.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            linkedHashMap.put(next, Boolean.valueOf(jSONObject.getBoolean((String) next)));
                        }
                        gv4Var = new gv4(linkedHashMap);
                    }
                }
                if (gv4Var != null) {
                    obj2 = gv4Var;
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pmsKey, obj2);
            obj3 = objPutIfAbsent == null ? obj2 : objPutIfAbsent;
        }
        if (obj3 != null) {
            return (gv4) obj3;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.ok.tamtam.models.pms.DevNullServerConfig");
    }

    @Override // defpackage.m99
    public void H(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        if (j(i, c99Var)) {
            ((qr4) this.c).g(tb8Var, g19Var);
        }
    }

    @Override // defpackage.m99
    public void I(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        if (j(i, c99Var)) {
            ((qr4) this.c).l(tb8Var, g19Var);
        }
    }

    public ArrayList a(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.b;
        m(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.c;
        m(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            kl0 kl0Var = (kl0) list.get(i);
            if (!map.containsKey(kl0Var.b) && !map2.containsKey(Integer.valueOf(kl0Var.c))) {
                arrayList.add(kl0Var);
            }
        }
        return arrayList;
    }

    public void b(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        olh olhVar = (olh) this.d;
        vk6 vk6VarA = olhVar.a();
        if (str == null) {
            vk6VarA.S(1);
        } else {
            vk6VarA.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
        }
    }

    @Override // defpackage.m99
    public void c(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        if (j(i, c99Var)) {
            ((qr4) this.c).e(tb8Var, g19Var);
        }
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((z0f) this.c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.ke5
    public void f(EncodeException encodeException) {
        if (((bhd) this.o).V == null) {
            ((l32) this.c).accept(encodeException);
        }
    }

    @Override // defpackage.m99
    public void g(int i, c99 c99Var, tb8 tb8Var, g19 g19Var, IOException iOException, boolean z) {
        if (j(i, c99Var)) {
            ((qr4) this.c).j(tb8Var, g19Var, iOException, z);
        }
    }

    public int h(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayListA = a(list);
        for (int i = 0; i < arrayListA.size(); i++) {
            hashSet.add(Integer.valueOf(((kl0) arrayListA.get(i)).c));
        }
        return hashSet.size();
    }

    public boolean i() {
        ArrayList arrayList = (ArrayList) this.b;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ihg ihgVar = (ihg) arrayList.get(i2);
                    if (ihgVar.b == ihgVar.a.size()) {
                    }
                }
                return true;
            }
            if (((ihg) arrayList.get(i)).b == -1) {
                break;
            }
            i++;
        }
        return false;
    }

    public boolean j(int i, c99 c99Var) {
        y87 y87Var = (y87) this.o;
        y99 y99Var = (y99) this.b;
        c99 c99VarB = null;
        if (c99Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= y99Var.c.size()) {
                    break;
                }
                if (((c99) y99Var.c.get(i2)).d == c99Var.d) {
                    c99VarB = c99Var.b(Pair.create(y99Var.b, c99Var.a));
                    break;
                }
                i2++;
            }
            if (c99VarB == null) {
                return false;
            }
        }
        c99 c99Var2 = c99VarB;
        int i3 = i + y99Var.d;
        qr4 qr4Var = (qr4) this.c;
        if (qr4Var.a != i3 || !xxg.a((c99) qr4Var.c, c99Var2)) {
            this.c = new qr4((CopyOnWriteArrayList) ((qr4) y87Var.j).d, i3, c99Var2, 0L);
        }
        lk6 lk6Var = (lk6) this.d;
        if (lk6Var.b == i3 && xxg.a((c99) lk6Var.c, c99Var2)) {
            return true;
        }
        this.d = new lk6((CopyOnWriteArrayList) ((lk6) y87Var.k).d, i3, c99Var2, 10);
        return true;
    }

    public void k(int i, bxd bxdVar) {
        SparseArray sparseArray = (SparseArray) this.c;
        hsi.f("Exactly one SampleExporter can be added for each track type.", !zxg.k(sparseArray, i));
        sparseArray.put(i, bxdVar);
    }

    @Override // defpackage.ke5
    public void l() {
        ((tu1) this.b).b(null);
    }

    public kl0 n(List list) {
        kl0 kl0Var;
        HashMap map = (HashMap) this.d;
        ArrayList arrayListA = a(list);
        if (arrayListA.size() < 2) {
            return (kl0) uni.b(arrayListA, null);
        }
        Collections.sort(arrayListA, new o00(4));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((kl0) arrayListA.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListA.size()) {
                break;
            }
            kl0 kl0Var2 = (kl0) arrayListA.get(i3);
            if (i2 == kl0Var2.c) {
                arrayList.add(new Pair(kl0Var2.b, Integer.valueOf(kl0Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (kl0) arrayListA.get(0);
            }
        }
        kl0 kl0Var3 = (kl0) map.get(arrayList);
        if (kl0Var3 != null) {
            return kl0Var3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < listSubList.size(); i5++) {
            i4 += ((kl0) listSubList.get(i5)).d;
        }
        int iNextInt = ((Random) this.o).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                kl0Var = (kl0) uni.c(listSubList);
                break;
            }
            kl0Var = (kl0) listSubList.get(i);
            i6 += kl0Var.d;
            if (iNextInt < i6) {
                break;
            }
            i++;
        }
        map.put(arrayList, kl0Var);
        return kl0Var;
    }

    @Override // defpackage.tof
    public void r(byte[] bArr, int i, int i2, sof sofVar, fu3 fu3Var) {
        hb4 hb4Var;
        int i3;
        int i4;
        int iX;
        int i5;
        int i6;
        int iA;
        otb otbVar = (otb) this.d;
        umb umbVar = (umb) this.c;
        umb umbVar2 = (umb) this.b;
        umbVar2.H(i + i2, bArr);
        umbVar2.J(i);
        if (((Inflater) this.o) == null) {
            this.o = new Inflater();
        }
        if (zxg.S(umbVar2, umbVar, (Inflater) this.o)) {
            umbVar2.H(umbVar.c, umbVar.a);
        }
        int i7 = 0;
        otbVar.c = 0;
        int[] iArr = (int[]) otbVar.a;
        umb umbVar3 = (umb) otbVar.i;
        otbVar.d = 0;
        otbVar.e = 0;
        otbVar.f = 0;
        otbVar.g = 0;
        otbVar.h = 0;
        umbVar3.G(0);
        otbVar.b = false;
        ArrayList arrayList = new ArrayList();
        while (umbVar2.a() >= 3) {
            int i8 = umbVar2.c;
            int iX2 = umbVar2.x();
            int iD = umbVar2.D();
            int i9 = umbVar2.b + iD;
            if (i9 > i8) {
                umbVar2.J(i8);
                i3 = i7;
                hb4Var = null;
            } else {
                char c = 128;
                if (iX2 != 128) {
                    switch (iX2) {
                        case 20:
                            if (iD % 5 == 2) {
                                umbVar2.K(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iD / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iX3 = umbVar2.x();
                                    char c2 = c;
                                    double dX = umbVar2.x();
                                    double dX2 = umbVar2.x() - 128;
                                    double dX3 = umbVar2.x() - 128;
                                    iArr[iX3] = zxg.i((int) ((dX3 * 1.772d) + dX), 0, 255) | (umbVar2.x() << 24) | (zxg.i((int) ((1.402d * dX2) + dX), 0, 255) << 16) | (zxg.i((int) ((dX - (0.34414d * dX3)) - (dX2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    otbVar = otbVar;
                                }
                                otbVar.b = true;
                                break;
                            }
                            break;
                        case 21:
                            if (iD >= 4) {
                                umbVar2.K(3);
                                int i12 = iD - 4;
                                if (((128 & umbVar2.x()) != 0 ? 1 : i7) == 0) {
                                    i5 = umbVar3.b;
                                    i6 = umbVar3.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        umbVar2.h(i5, umbVar3.a, iMin);
                                        umbVar3.J(i5 + iMin);
                                        break;
                                    }
                                } else if (i12 >= 7 && (iA = umbVar2.A()) >= 4) {
                                    otbVar.g = umbVar2.D();
                                    otbVar.h = umbVar2.D();
                                    umbVar3.G(iA - 4);
                                    i12 = iD - 11;
                                    i5 = umbVar3.b;
                                    i6 = umbVar3.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        umbVar2.h(i5, umbVar3.a, iMin2);
                                        umbVar3.J(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iD >= 19) {
                                otbVar.c = umbVar2.D();
                                otbVar.d = umbVar2.D();
                                umbVar2.K(11);
                                otbVar.e = umbVar2.D();
                                otbVar.f = umbVar2.D();
                                break;
                            }
                            break;
                    }
                    i3 = 0;
                    hb4Var = null;
                } else {
                    if (otbVar.c == 0 || otbVar.d == 0 || otbVar.g == 0 || otbVar.h == 0 || (i4 = umbVar3.c) == 0 || umbVar3.b != i4 || !otbVar.b) {
                        hb4Var = null;
                    } else {
                        umbVar3.J(0);
                        int i13 = otbVar.g * otbVar.h;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iX4 = umbVar3.x();
                            if (iX4 != 0) {
                                iX = i14 + 1;
                                iArr2[i14] = iArr[iX4];
                            } else {
                                int iX5 = umbVar3.x();
                                if (iX5 != 0) {
                                    iX = ((iX5 & 64) == 0 ? iX5 & 63 : ((iX5 & 63) << 8) | umbVar3.x()) + i14;
                                    Arrays.fill(iArr2, i14, iX, (iX5 & 128) == 0 ? iArr[0] : iArr[umbVar3.x()]);
                                }
                            }
                            i14 = iX;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, otbVar.g, otbVar.h, Bitmap.Config.ARGB_8888);
                        float f = otbVar.e;
                        float f2 = otbVar.c;
                        float f3 = f / f2;
                        float f4 = otbVar.f;
                        float f5 = otbVar.d;
                        hb4Var = new hb4(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, otbVar.g / f2, otbVar.h / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    otbVar.c = 0;
                    otbVar.d = 0;
                    otbVar.e = 0;
                    otbVar.f = 0;
                    otbVar.g = 0;
                    otbVar.h = 0;
                    umbVar3.G(0);
                    otbVar.b = false;
                }
                umbVar2.J(i9);
            }
            if (hb4Var != null) {
                arrayList.add(hb4Var);
            }
            i7 = i3;
        }
        fu3Var.accept(new kb4(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.ke5
    public void s(zd5 zd5Var) throws Exception {
        gb0 gb0Var = (gb0) this.d;
        bhd bhdVar = (bhd) this.o;
        if (bhdVar.e0 == 3) {
            zd5Var.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        if (bhdVar.B != null) {
            try {
                bhdVar.M(zd5Var, gb0Var);
                zd5Var.close();
                return;
            } catch (Throwable th) {
                try {
                    zd5Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (bhdVar.q) {
            gri.a("Recorder", "Drop audio data since recording is stopping.");
        } else {
            bhdVar.U.d(new uu0(zd5Var));
            if (bhdVar.T != null) {
                gri.a("Recorder", "Received audio data. Starting muxer...");
                bhdVar.F(gb0Var);
            } else {
                gri.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
            }
        }
        zd5Var.close();
    }

    @Override // defpackage.ke5
    public void t(wo4 wo4Var) {
        ((bhd) this.o).H = wo4Var;
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return "Pack{incomingAudio=" + ((ArrayList) this.b) + ", incomingVideo=" + ((ArrayList) this.c) + ", outgoingAudio=" + ((ArrayList) this.d) + ", outgoingVideo=" + ((ArrayList) this.o) + '}';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.tof
    public int u() {
        return 2;
    }

    public k5i(ie8 ie8Var) {
        this.a = 11;
        this.o = ie8Var;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new thg(7, this);
    }

    public k5i(WorkDatabase_Impl workDatabase_Impl) {
        this.a = 0;
        this.b = workDatabase_Impl;
        this.c = new cwg(workDatabase_Impl, 4);
        this.d = new olh(workDatabase_Impl, 2);
        this.o = new olh(workDatabase_Impl, 3);
    }

    public k5i(GifImage gifImage) {
        this.a = 1;
        this.b = gifImage;
    }

    public k5i(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = ipi.b(3, new zb2(17));
                this.c = ipi.b(3, new zb2(18));
                this.d = ipi.b(3, new zb2(19));
                this.o = ipi.b(3, new zb2(20));
                break;
            case 4:
                this.b = new d6c(10);
                this.c = new z0f(0);
                this.d = new ArrayList();
                this.o = new HashSet();
                break;
            case 5:
            case 6:
            default:
                Random random = new Random();
                this.d = new HashMap();
                this.o = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 7:
                this.b = new umb();
                this.c = new umb();
                this.d = new otb(1);
                break;
        }
    }

    public k5i(y87 y87Var, y99 y99Var) {
        this.a = 6;
        this.o = y87Var;
        this.c = (qr4) y87Var.j;
        this.d = (lk6) y87Var.k;
        this.b = y99Var;
    }

    public k5i(pm3 pm3Var) {
        this.a = 10;
        this.b = new ArrayList();
        for (int i = 0; i < pm3Var.a.size(); i++) {
            ((ArrayList) this.b).add(new ihg());
        }
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.o = new SparseArray();
    }

    public k5i(bhd bhdVar, tu1 tu1Var, l32 l32Var, gb0 gb0Var) {
        this.a = 8;
        this.o = bhdVar;
        this.b = tu1Var;
        this.c = l32Var;
        this.d = gb0Var;
    }
}
