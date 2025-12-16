package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.Size;
import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class lz9 implements qpf {
    public Object X;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public /* synthetic */ lz9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.o = obj5;
        this.X = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.kpf
            if (r0 == 0) goto L13
            r0 = r5
            kpf r0 = (defpackage.kpf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kpf r0 = new kpf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            lz9 r0 = r0.d
            defpackage.g8j.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.g8j.b(r5)
            java.lang.Object r5 = r4.X
            jpf r5 = (defpackage.jpf) r5
            r0.d = r4
            r0.Y = r2
            java.lang.Object r5 = r5.k(r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L43
            return r0
        L43:
            r0 = r4
        L44:
            java.util.List r5 = (java.util.List) r5
            at r1 = new at
            r2 = 2
            r1.<init>(r2, r5)
            hpf r5 = new hpf
            r2 = 1
            r5.<init>(r0, r2)
            oz5 r5 = defpackage.lee.g(r1, r5)
            hpf r1 = new hpf
            r2 = 2
            r1.<init>(r0, r2)
            nhg r0 = new nhg
            r0.<init>(r5, r1)
            llc r5 = new llc
            r1 = 23
            r5.<init>(r1)
            oz5 r5 = defpackage.lee.g(r0, r5)
            java.util.List r5 = defpackage.lee.o(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz9.a(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.util.LinkedHashSet r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lpf
            if (r0 == 0) goto L13
            r0 = r6
            lpf r0 = (defpackage.lpf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            lpf r0 = new lpf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.util.LinkedHashSet r5 = r0.o
            lz9 r0 = r0.d
            defpackage.g8j.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r4.X
            jpf r6 = (defpackage.jpf) r6
            r0.d = r4
            r0.o = r5
            r0.Z = r2
            java.lang.Object r6 = r6.k(r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L47
            return r0
        L47:
            r0 = r4
        L48:
            java.util.List r6 = (java.util.List) r6
            at r1 = new at
            r2 = 2
            r1.<init>(r2, r6)
            a7c r6 = new a7c
            r2 = 9
            r6.<init>(r5, r2, r0)
            oz5 r5 = defpackage.lee.g(r1, r6)
            hpf r6 = new hpf
            r1 = 3
            r6.<init>(r0, r1)
            nhg r0 = new nhg
            r0.<init>(r5, r6)
            java.util.List r5 = defpackage.lee.o(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz9.b(java.util.LinkedHashSet, q44):java.lang.Object");
    }

    public e90 c() {
        String strI = ((String) this.a) == null ? " mimeType" : "";
        if (((f9g) this.c) == null) {
            strI = az1.i(strI, " inputTimebase");
        }
        if (((Integer) this.d) == null) {
            strI = az1.i(strI, " bitrate");
        }
        if (((Integer) this.o) == null) {
            strI = az1.i(strI, " sampleRate");
        }
        if (((Integer) this.X) == null) {
            strI = az1.i(strI, " channelCount");
        }
        if (!strI.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }
        String str = (String) this.a;
        int iIntValue = ((Integer) this.b).intValue();
        e90 e90Var = new e90(str, iIntValue, (f9g) this.c, ((Integer) this.d).intValue(), ((Integer) this.o).intValue(), ((Integer) this.X).intValue());
        if (Objects.equals(str, "audio/mp4a-latm") && iIntValue == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return e90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(final java.lang.String r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mpf
            if (r0 == 0) goto L13
            r0 = r6
            mpf r0 = (defpackage.mpf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            mpf r0 = new mpf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.String r5 = r0.o
            lz9 r0 = r0.d
            defpackage.g8j.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r4.X
            jpf r6 = (defpackage.jpf) r6
            r0.d = r4
            r0.o = r5
            r0.Z = r2
            java.lang.Object r6 = r6.k(r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L47
            return r0
        L47:
            r0 = r4
        L48:
            java.util.List r6 = (java.util.List) r6
            at r1 = new at
            r2 = 2
            r1.<init>(r2, r6)
            hpf r6 = new hpf
            r2 = 0
            r6.<init>(r0, r2)
            oz5 r6 = defpackage.lee.g(r1, r6)
            ipf r1 = new ipf
            r1.<init>(r0)
            oz5 r6 = defpackage.lee.g(r6, r1)
            ipf r1 = new ipf
            r2 = 1
            r1.<init>(r0)
            nhg r2 = new nhg
            r2.<init>(r6, r1)
            llc r6 = new llc
            r1 = 22
            r6.<init>(r1)
            oz5 r6 = defpackage.lee.k(r2, r6)
            ipf r1 = new ipf
            r2 = 2
            r1.<init>(r0)
            nhg r5 = new nhg
            r5.<init>(r6, r1)
            java.util.List r5 = defpackage.lee.o(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz9.d(java.lang.String, q44):java.lang.Object");
    }

    public hie e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        die dieVarI = die.i((kz9) this.c, size);
        ((w30) dieVarI.b).c = 1;
        cg7 cg7Var = new cg7(surface);
        this.a = cg7Var;
        wsf.b(wsf.g(cg7Var.e), new s7c(surface, surfaceTexture), ayi.a());
        dieVarI.g((cg7) this.a, u75.d, -1);
        eie eieVar = (eie) this.X;
        if (eieVar != null) {
            eieVar.b();
        }
        eie eieVar2 = new eie(new xc7(2, this));
        this.X = eieVar2;
        dieVarI.f = eieVar2;
        return dieVarI.h();
    }

    public ybj f(ybj ybjVar) {
        return ybjVar.k(new es(2), new os5(17, this));
    }

    public ArrayList g() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList((LinkedHashSet) this.c);
        }
        return arrayList;
    }

    public ArrayList h() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(g());
            synchronized (this.b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.o);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz9.i(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public ybj j(String str, String str2, Bundle bundle) {
        int i;
        try {
            i(str, str2, bundle);
            fud fudVar = (fud) this.c;
            ex4 ex4Var = ex4.d;
            fua fuaVar = fudVar.c;
            if (fuaVar.h() < 12000000) {
                if (fuaVar.i() == 0) {
                    return n5e.e(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
                return fudVar.a(bundle).l(ex4Var, new wib(fudVar, bundle, false, 22));
            }
            uaj uajVarE = uaj.e(fudVar.b);
            synchronized (uajVarE) {
                i = uajVarE.b;
                uajVarE.b = i + 1;
            }
            return uajVarE.f(new m6j(i, 1, bundle, 1)).k(ex4Var, v17.B0);
        } catch (InterruptedException | ExecutionException e) {
            return n5e.e(e);
        }
    }

    public gpf k(ku3 ku3Var, String str) {
        String strL = ku3Var.l();
        ArrayList arrayList = new ArrayList(1);
        tv3 tv3VarJ = ku3Var.j();
        String strA = tv3VarJ != null ? tv3VarJ.a() : null;
        if (strA != null) {
            arrayList.add(strA);
        }
        return ((ssb) this.b).m(ku3Var.p(), arrayList, strL, str, ku3Var.s(((z7c) this.c).a.n(), il0.c), ((f8c) this.d).a(ku3Var.p()), ((mce) ((k18) this.o).getValue()).a(ku3Var.p()));
    }
}
