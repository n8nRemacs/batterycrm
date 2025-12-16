package defpackage;

import android.content.Context;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.vendor.StoreServicesInfo$ServicesException;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes2.dex */
public final class vxf implements ui8 {
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final Context a;
    public final String b = vxf.class.getName();
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final ContextScope u0;
    public final k18 v0;

    public vxf(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3, ms7 ms7Var, k18 k18Var4, k18 k18Var5, a84 a84Var, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9) {
        this.a = context;
        this.c = k18Var;
        this.d = k18Var2;
        this.o = k18Var8;
        this.X = k18Var3;
        this.Y = k18Var4;
        this.Z = k18Var6;
        this.s0 = k18Var7;
        this.t0 = k18Var9;
        this.u0 = d7j.a(ms7Var.a.limitedParallelism(1, "vendor").plus(a84Var));
        this.v0 = k18Var5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.q44 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.mxf
            if (r0 == 0) goto L13
            r0 = r9
            mxf r0 = (defpackage.mxf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mxf r0 = new mxf
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            qqg r2 = defpackage.qqg.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            vxf r0 = r0.d
            defpackage.g8j.b(r9)
            goto L91
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.g8j.b(r9)
            alf r9 = r8.h()
            r0.d = r8
            r0.Y = r3
            vw6 r9 = (defpackage.vw6) r9
            boolean r1 = r9.a()
            if (r1 == 0) goto Lac
            lwd r1 = new lwd
            kotlin.coroutines.Continuation r0 = defpackage.hni.f(r0)
            r1.<init>(r0)
            com.google.firebase.messaging.FirebaseMessaging r0 = com.google.firebase.messaging.FirebaseMessaging.c()
            zkf r3 = r0.f()
            if (r3 != 0) goto L5d
            ybj r0 = defpackage.n5e.f(r4)
            goto L79
        L5d:
            n2g r3 = new n2g
            r3.<init>()
            pc4 r5 = new pc4
            java.lang.String r6 = "Firebase-Messaging-Network-Io"
            r7 = 2
            r5.<init>(r6, r7)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor(r5)
            p06 r6 = new p06
            r7 = 1
            r6.<init>(r0, r3, r7)
            r5.execute(r6)
            ybj r0 = r3.a
        L79:
            h79 r3 = new h79
            r5 = 20
            r3.<init>(r1, r5, r9)
            r0.i(r3)
            java.lang.Object r9 = r1.a()
            g84 r0 = defpackage.g84.a
            if (r9 != r0) goto L8c
            goto L8d
        L8c:
            r9 = r2
        L8d:
            if (r9 != r0) goto L90
            return r0
        L90:
            r0 = r8
        L91:
            pb3 r9 = r0.b()
            w4e r9 = (defpackage.w4e) r9
            r9.B(r4)
            pb3 r9 = r0.b()
            w4e r9 = (defpackage.w4e) r9
            fde r0 = r9.H
            yy7[] r1 = defpackage.w4e.m0
            r3 = 25
            r1 = r1[r3]
            r0.O(r9, r1, r4)
            return r2
        Lac:
            one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException r9 = new one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxf.a(q44):java.lang.Object");
    }

    public final pb3 b() {
        return (pb3) this.d.getValue();
    }

    @Override // defpackage.ui8
    public final void c() throws Throwable {
        d7j.c(this.u0, null);
        svi.g(bd5.a, new uxf(this, null));
    }

    public final j94 d() {
        return (j94) this.v0.getValue();
    }

    public final String e() {
        w4e w4eVar = (w4e) b();
        fde fdeVar = w4eVar.G;
        yy7[] yy7VarArr = w4e.m0;
        String str = (String) fdeVar.D(w4eVar, yy7VarArr[24]);
        if (str != null && str.length() != 0) {
            h().getClass();
            w4e w4eVar2 = (w4e) b();
            if ("GCM".equals((String) w4eVar2.H.D(w4eVar2, yy7VarArr[25]))) {
                return str;
            }
        }
        svi.e(this.u0, null, null, new nxf(this, (SystemServicesManager$PushTokenGeneratedListener) this.Y.getValue(), null), 3);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r7, defpackage.q44 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "getPushToken: got "
            boolean r1 = r8 instanceof defpackage.oxf
            if (r1 == 0) goto L15
            r1 = r8
            oxf r1 = (defpackage.oxf) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            oxf r1 = new oxf
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.X
            int r2 = r1.Z
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r7 = r1.o
            vxf r1 = r1.d
            defpackage.g8j.b(r8)     // Catch: java.lang.Exception -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto La9
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.g8j.b(r8)
            alf r8 = r6.h()     // Catch: java.lang.Exception -> La7
            r1.d = r6     // Catch: java.lang.Exception -> La7
            r1.o = r7     // Catch: java.lang.Exception -> La7
            r1.Z = r3     // Catch: java.lang.Exception -> La7
            vw6 r8 = (defpackage.vw6) r8     // Catch: java.lang.Exception -> La7
            java.lang.Object r8 = r8.b(r1)     // Catch: java.lang.Exception -> La7
            g84 r1 = defpackage.g84.a
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r1 = r6
        L4f:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r1.b     // Catch: java.lang.Exception -> L2b
            if (r8 == 0) goto L5f
            int r3 = r8.length()     // Catch: java.lang.Exception -> L2b
            if (r3 != 0) goto L5c
            goto L5f
        L5c:
            java.lang.String r3 = "normal"
            goto L61
        L5f:
            java.lang.String r3 = "empty"
        L61:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r4.<init>(r0)     // Catch: java.lang.Exception -> L2b
            r4.append(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = " token"
            r4.append(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L2b
            defpackage.wqi.d(r2, r0)     // Catch: java.lang.Exception -> L2b
            pb3 r0 = r1.b()     // Catch: java.lang.Exception -> L2b
            w4e r0 = (defpackage.w4e) r0     // Catch: java.lang.Exception -> L2b
            r0.B(r8)     // Catch: java.lang.Exception -> L2b
            pb3 r0 = r1.b()     // Catch: java.lang.Exception -> L2b
            alf r2 = r1.h()     // Catch: java.lang.Exception -> L2b
            r2.getClass()     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = "GCM"
            w4e r0 = (defpackage.w4e) r0     // Catch: java.lang.Exception -> L2b
            fde r3 = r0.H     // Catch: java.lang.Exception -> L2b
            yy7[] r4 = defpackage.w4e.m0     // Catch: java.lang.Exception -> L2b
            r5 = 25
            r4 = r4[r5]     // Catch: java.lang.Exception -> L2b
            r3.O(r0, r4, r2)     // Catch: java.lang.Exception -> L2b
            if (r8 == 0) goto Lb0
            int r0 = r8.length()     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto La1
            goto Lb0
        La1:
            r7.onPushTokenGenerated(r8)     // Catch: java.lang.Exception -> L2b
            goto Lb0
        La5:
            r1 = r6
            goto La9
        La7:
            r7 = move-exception
            goto La5
        La9:
            java.lang.String r8 = r1.b
            java.lang.String r0 = "getPushToken: failed"
            defpackage.wqi.e(r8, r0, r7)
        Lb0:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxf.f(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener, q44):java.lang.Object");
    }

    public final String g() {
        h06 h06Var;
        vw6 vw6Var = (vw6) h();
        if (!vw6Var.a()) {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
        bwf bwfVar = vw6Var.c;
        ybj ybjVarC = null;
        if (bwfVar.e() && (h06Var = (h06) bwfVar.getValue()) != null) {
            try {
                Object obj = k06.m;
                h06Var.a();
                ybjVarC = ((k06) h06Var.d.a(l06.class)).c();
            } catch (Exception e) {
                wqi.e(vw6Var.b, "getInstanceIdTask: failed to get FirebaseInstanceId", e);
            }
        }
        if (ybjVarC == null) {
            throw new StoreServicesInfo$ServicesException("failed to get instance id task");
        }
        try {
            return (String) n5e.a(ybjVarC);
        } catch (Exception e2) {
            throw new StoreServicesInfo$ServicesException("getServiceInstanceId: getInstanceId failed", e2);
        }
    }

    public final alf h() {
        return (alf) this.c.getValue();
    }
}
