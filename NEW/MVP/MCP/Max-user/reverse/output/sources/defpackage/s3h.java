package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class s3h {
    public final Context a;
    public final pb3 b;
    public final hwa c;
    public final qx5 d;
    public final i2h e;
    public final String f = s3h.class.getName();
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final jve j;
    public final gbd k;
    public final Set l;
    public final ContextScope m;

    public s3h(Context context, k18 k18Var, pb3 pb3Var, hwa hwaVar, qx5 qx5Var, i2h i2hVar, lzf lzfVar, k18 k18Var2, k18 k18Var3, a84 a84Var) {
        this.a = context;
        this.b = pb3Var;
        this.c = hwaVar;
        this.d = qx5Var;
        this.e = i2hVar;
        this.g = k18Var;
        this.h = k18Var2;
        this.i = k18Var3;
        jve jveVarB = kve.b(1, 0, 2);
        this.j = jveVarB;
        this.k = new gbd(jveVarB);
        this.l = Collections.newSetFromMap(new ConcurrentHashMap());
        this.m = d7j.a(((q2b) lzfVar).b().plus(zk6.a()).plus(a84Var.plus(new c84("Video Fetch scope"))));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.s3h r10, defpackage.si9 r11, long r12, defpackage.q44 r14) throws java.lang.Exception {
        /*
            boolean r0 = r14 instanceof defpackage.r3h
            if (r0 == 0) goto L14
            r0 = r14
            r3h r0 = (defpackage.r3h) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            r3h r0 = new r3h
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.X
            int r0 = r8.Z
            qqg r9 = defpackage.qqg.a
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            si9 r11 = r8.o
            s3h r10 = r8.d
            defpackage.g8j.b(r14)
            goto L6f
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.g8j.b(r14)
            s10 r14 = defpackage.s10.d
            boolean r0 = r11.s(r14)
            if (r0 == 0) goto L7b
            w10 r2 = r11.d(r14)
            if (r2 != 0) goto L4e
            java.lang.String r10 = r10.f
            java.lang.String r11 = "Fetch video. Can't start fetch because attach not exist"
            defpackage.wqi.d(r10, r11)
            return r9
        L4e:
            java.util.Set r14 = r10.l
            long r3 = r11.a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            r14.add(r0)
            long r5 = r11.b
            r8.d = r10
            r8.o = r11
            r8.Z = r1
            r7 = 0
            r1 = r10
            r3 = r12
            java.lang.Object r10 = r1.c(r2, r3, r5, r7, r8)
            g84 r12 = defpackage.g84.a
            if (r10 != r12) goto L6e
            return r12
        L6e:
            r10 = r1
        L6f:
            java.util.Set r10 = r10.l
            long r11 = r11.a
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r10.remove(r13)
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3h.a(s3h, si9, long, q44):java.lang.Object");
    }

    public static int e(int i) {
        int iV = az1.v(i);
        if (iV == 0) {
            return 1;
        }
        if (iV == 1) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.w10 r21, long r22, long r24, defpackage.q44 r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3h.b(w10, long, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.w10 r28, long r29, long r31, boolean r33, defpackage.q44 r34) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3h.c(w10, long, long, boolean, q44):java.lang.Object");
    }

    public final String d(w10 w10Var) {
        long j;
        File fileR;
        boolean zH = ssi.h(w10Var);
        boolean zH2 = w10Var.h();
        v10 v10Var = w10Var.d;
        String str = w10Var.s;
        if (zH2) {
            j = v10Var.a;
        } else {
            if (!zH) {
                str = "";
            }
            j = 0;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        if (b6a.P(new File(str))) {
            return str;
        }
        if (j == 0) {
            return null;
        }
        qx5 qx5Var = this.d;
        if (v10Var == null || v10Var.b != 2) {
            fileR = ((iz5) qx5Var).r(j);
        } else {
            iz5 iz5Var = (iz5) qx5Var;
            iz5Var.getClass();
            fileR = new File(iz5.g(iz5.b(iz5Var.c), "videoCache"), a9h.d(j, "video_", ".mp4"));
        }
        if (b6a.P(fileR)) {
            return fileR.getAbsolutePath();
        }
        return null;
    }
}
