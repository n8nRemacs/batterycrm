package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class wm2 implements wu, jkd {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public wm2(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, am2 am2Var, long j, Set set, r19 r19Var) {
        this.b = am2Var;
        this.a = j;
        this.c = set;
        this.d = r19Var;
        this.e = wm2.class.getName();
        this.f = k18Var;
        this.g = k18Var2;
        this.h = k18Var3;
        this.i = k18Var4;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r15, int r17, long r18, defpackage.q44 r20) {
        /*
            r14 = this;
            r1 = r20
            boolean r2 = r1 instanceof defpackage.vm2
            if (r2 == 0) goto L16
            r2 = r1
            vm2 r2 = (defpackage.vm2) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.t0 = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            vm2 r2 = new vm2
            r2.<init>(r14, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r9.Z
            int r2 = r9.t0
            r10 = 2
            r3 = 1
            g84 r11 = defpackage.g84.a
            if (r2 == 0) goto L47
            if (r2 == r3) goto L36
            if (r2 != r10) goto L2e
            defpackage.g8j.b(r1)
            return r1
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            long r2 = r9.X
            int r4 = r9.Y
            long r5 = r9.o
            wm2 r7 = r9.d
            defpackage.g8j.b(r1)
            r12 = r5
            r6 = r4
            r4 = r12
            r0 = r7
            r7 = r2
            goto L6a
        L47:
            defpackage.g8j.b(r1)
            r9.d = r14
            r1 = r15
            r9.o = r1
            r4 = r17
            r9.Y = r4
            r7 = r18
            r9.X = r7
            r9.t0 = r3
            r3 = 0
            r5 = 0
            r0 = r14
            java.lang.Object r3 = r0.e(r1, r3, r4, r5, r7, r9)
            if (r3 != r11) goto L64
            goto L7a
        L64:
            r0 = r14
            r4 = r15
            r6 = r17
            r7 = r18
        L6a:
            java.lang.Object r0 = r0.b
            r3 = r0
            am2 r3 = (defpackage.am2) r3
            r0 = 0
            r9.d = r0
            r9.t0 = r10
            java.lang.Object r0 = r3.a(r4, r6, r7, r9)
            if (r0 != r11) goto L7b
        L7a:
            return r11
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm2.a(long, int, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r12, int r14, long r15, defpackage.q44 r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.um2
            if (r1 == 0) goto L16
            r1 = r0
            um2 r1 = (defpackage.um2) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.t0 = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            um2 r1 = new um2
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.Z
            int r1 = r8.t0
            r9 = 2
            r2 = 1
            g84 r10 = defpackage.g84.a
            if (r1 == 0) goto L46
            if (r1 == r2) goto L36
            if (r1 != r9) goto L2e
            defpackage.g8j.b(r0)
            return r0
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            long r12 = r8.X
            int r1 = r8.Y
            long r2 = r8.o
            wm2 r4 = r8.d
            defpackage.g8j.b(r0)
            r6 = r12
            r5 = r1
            r12 = r4
            r3 = r2
            goto L62
        L46:
            defpackage.g8j.b(r0)
            r8.d = r11
            r8.o = r12
            r8.Y = r14
            r6 = r15
            r8.X = r6
            r8.t0 = r2
            r2 = r11
            r3 = r12
            r5 = r14
            java.lang.Object r0 = defpackage.jkd.f(r2, r3, r5, r6, r8)
            if (r0 != r10) goto L5e
            goto L72
        L5e:
            r3 = r12
            r5 = r14
            r6 = r15
            r12 = r11
        L62:
            java.lang.Object r12 = r12.b
            r2 = r12
            am2 r2 = (defpackage.am2) r2
            r12 = 0
            r8.d = r12
            r8.t0 = r9
            java.lang.Object r12 = r2.c(r3, r5, r6, r8)
            if (r12 != r10) goto L73
        L72:
            return r10
        L73:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm2.c(long, int, long, q44):java.lang.Object");
    }

    @Override // defpackage.wu
    public Object d(Collection collection, q44 q44Var) {
        return ((am2) this.b).d(collection, q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.jkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(long r26, int r28, int r29, long r30, long r32, defpackage.q44 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm2.e(long, int, int, long, long, q44):java.lang.Object");
    }

    public ez1 g(String str) throws CameraUnavailableException {
        if (!((ArrayList) this.g).contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        Context context = (Context) this.b;
        t22 t22Var = (t22) this.f;
        hz1 hz1VarH = h(str);
        ggg gggVar = (ggg) this.c;
        j32 j32Var = (j32) this.e;
        o90 o90Var = (o90) this.d;
        return new ez1(context, t22Var, str, hz1VarH, gggVar, j32Var, o90Var.a, o90Var.b, (ky4) this.h, this.a);
    }

    public hz1 h(String str) throws CameraUnavailableException {
        HashMap map = (HashMap) this.i;
        try {
            hz1 hz1Var = (hz1) map.get(str);
            if (hz1Var != null) {
                return hz1Var;
            }
            hz1 hz1Var2 = new hz1((t22) this.f, str);
            map.put(str, hz1Var2);
            return hz1Var2;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public wm2(Context context, o90 o90Var, f32 f32Var, long j) throws InitializationException, CameraAccessExceptionCompat {
        String strA;
        this.i = new HashMap();
        this.b = context;
        this.d = o90Var;
        t22 t22VarA = t22.a(context, o90Var.b);
        this.f = t22VarA;
        this.h = ky4.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            xo8 xo8Var = t22VarA.a;
            xo8Var.getClass();
            try {
                List<String> listAsList = Arrays.asList(((CameraManager) xo8Var.b).getCameraIdList());
                if (f32Var == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strA = wxi.a(t22VarA, f32Var.b(), listAsList);
                    } catch (IllegalStateException unused) {
                        strA = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strA)) {
                            arrayList2.add(h(str));
                        }
                    }
                    Iterator it2 = f32Var.a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((l22) it2.next()).d());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (!str2.equals("0") && !str2.equals("1")) {
                        if (qxi.a((t22) this.f, str2)) {
                            arrayList3.add(str2);
                        } else {
                            gri.a("Camera2CameraFactory", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                        }
                    } else {
                        arrayList3.add(str2);
                    }
                }
                this.g = arrayList3;
                ggg gggVar = new ggg((t22) this.f);
                this.c = gggVar;
                j32 j32Var = new j32(gggVar);
                this.e = j32Var;
                ((ArrayList) gggVar.d).add(j32Var);
                this.a = j;
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        } catch (CameraUnavailableException e3) {
            throw new InitializationException(e3);
        }
    }
}
