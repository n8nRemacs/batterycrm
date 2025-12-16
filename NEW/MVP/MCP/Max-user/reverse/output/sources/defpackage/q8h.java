package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Trace;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.CameraInfoUnavailableException;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$NoAvailableCameraException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class q8h implements xfd, i5h, c8h {
    public static final /* synthetic */ yy7[] M = {new z8a(q8h.class, "recordingJob", "getRecordingJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, q8h.class, "savePlaceholderJob", "getSavePlaceholderJob()Lkotlinx/coroutines/Job;")};
    public final tcf A;
    public final hbd B;
    public volatile dhd C;
    public final tcf D;
    public final hbd E;
    public float F;
    public ValueAnimator G;
    public p22 H;
    public final AtomicBoolean I;
    public final t9f J;
    public final t9f K;
    public final u8h L;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public tfd e;
    public w9c f;
    public final bwf g;
    public final String h;
    public final ContextScope i;
    public final und j;
    public final kue k;
    public r8c l;
    public j5h m;
    public bhd n;
    public s1h o;
    public n38 p;
    public final tcf q;
    public hfd r;
    public volatile long s;
    public volatile File t;
    public final bwf u;
    public final tcf v;
    public final hbd w;
    public final jve x;
    public final gbd y;
    public volatile boolean z;

    public q8h(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        Object ipdVar;
        cb8 cb8VarQ;
        q7i q7iVar;
        o6i o6iVar = o6i.a;
        g4b g4bVar = (g4b) o6iVar.getAccessor().c(56);
        bwf bwfVarD = o6iVar.getAccessor().d(8);
        bwf bwfVarD2 = o6iVar.getAccessor().d(48);
        this.a = k18Var;
        this.b = k18Var3;
        this.c = k18Var2;
        this.d = bwfVarD;
        this.g = new bwf(new d4b(g4bVar, 2));
        this.h = q8h.class.getName();
        ContextScope contextScopeA = d7j.a(((q2b) q()).c().plus(zk6.a()));
        this.i = contextScopeA;
        this.j = new und(new fq(bwfVarD, k18Var, k18Var3, bwfVarD2));
        this.k = new kue(bwfVarD);
        this.q = ucf.a(new f8h(new Size(0, 0), null, null));
        this.u = new bwf(new kvf(17, this));
        svi.e(contextScopeA, ((q2b) q()).b(), null, new e8h(this, null), 2);
        tcf tcfVarA = ucf.a(null);
        this.v = tcfVarA;
        this.w = new hbd(tcfVarA);
        jve jveVarB = kve.b(1, 0, 6);
        this.x = jveVarB;
        this.y = new gbd(jveVarB);
        tcf tcfVarA2 = ucf.a(new h5h(false, false));
        this.A = tcfVarA2;
        this.B = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(Boolean.FALSE);
        this.D = tcfVarA3;
        this.E = new hbd(tcfVarA3);
        l22 l22VarP = p();
        this.F = (l22VarP == null || (cb8VarQ = ((yod) l22VarP).b.q()) == null || (q7iVar = (q7i) cb8VarQ.d()) == null) ? 1.0f : q7iVar.c();
        this.I = new AtomicBoolean(false);
        this.J = c7j.c();
        this.K = c7j.c();
        gu5 gu5Var = (gu5) ((rt5) bwfVarD2.getValue());
        gu5Var.getClass();
        String strL = gu5Var.l(PmsKey.f153videomsgconfig, "");
        u8h u8hVar = u8h.e;
        if (strL != null && strL.length() != 0) {
            try {
                ipdVar = new JSONObject(strL);
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            JSONObject jSONObject = (JSONObject) (ipdVar instanceof ipd ? null : ipdVar);
            if (jSONObject != null) {
                u8hVar = new u8h(jSONObject.optLong("duration", 60L), jSONObject.optString("quality", "480"), jSONObject.optInt("min_frame_rate", 30), jSONObject.optInt("max_frame_rate", 30));
            }
        }
        this.L = u8hVar;
    }

    @Override // defpackage.xfd
    public final int a() {
        return 0;
    }

    @Override // defpackage.xfd
    public final boolean b() {
        return this.C != null;
    }

    @Override // defpackage.c8h
    public final void c() {
        lg8 lg8Var = lg8.d;
        String str = this.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "VideoMessage Recording. onFirstVideoFrameRendered", null);
        }
        j5h j5hVar = this.m;
        if (j5hVar != null) {
            dse dseVar = new dse(13, this);
            a8h a8hVar = j5hVar.e;
            if (a8hVar == null) {
                a8hVar = null;
            }
            if (a8hVar != null) {
                String str2 = a8hVar.a;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str2, "captureFrame", null);
                }
                a8h.d(a8hVar, new sue(a8hVar, 13, dseVar), new q8g(14), 2);
            }
        }
    }

    @Override // defpackage.xfd
    public final void d() {
        String str = this.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "VideoMessage Recording. Stop", null);
            }
        }
        p22 p22Var = this.H;
        if (p22Var != null) {
            p22Var.a(new o22(p22Var, 2));
        }
        dhd dhdVar = this.C;
        if (dhdVar != null) {
            dhdVar.close();
        }
        this.s = 0L;
        this.C = null;
        this.z = false;
    }

    @Override // defpackage.xfd
    public final void e() {
        String str = this.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "VideoMessage Recording. Resume", null);
            }
        }
        p22 p22Var = this.H;
        if (p22Var != null) {
            p22Var.a(new o22(p22Var, 0));
        }
        u(o(String.valueOf(System.currentTimeMillis())));
        this.z = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.xfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r5, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.h8h
            if (r0 == 0) goto L13
            r0 = r7
            h8h r0 = (defpackage.h8h) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            h8h r0 = new h8h
            q44 r7 = (defpackage.q44) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.g8j.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r7)
            j8h r7 = new j8h
            r1 = 0
            r7.<init>(r4, r5, r1)
            r0.X = r2
            r5 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r7 = defpackage.yei.g(r5, r7, r0)
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L45
            return r5
        L45:
            qqg r7 = (defpackage.qqg) r7
            if (r7 == 0) goto L4c
            qqg r5 = defpackage.qqg.a
            return r5
        L4c:
            one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException r5 = new one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException
            r6 = 0
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.f(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.xfd
    public final Object g(wfd wfdVar) {
        xt4 xt4Var = new xt4(18);
        k7h k7hVar = (k7h) this.j.getValue();
        this.j.reset();
        File file = this.t;
        if (file != null) {
            k7hVar.j = svi.e(k7hVar.e, ((q2b) ((lzf) k7hVar.a.getValue())).b(), null, new d7h(k7hVar, new r2h(this, xt4Var, file, 2), file, null), 2);
            k7hVar.f();
            String str = ((f8h) this.q.getValue()).b;
            if (str != null) {
                Size size = ((f8h) this.q.getValue()).a;
                long j = ((vfd) wfdVar).a;
                String str2 = this.h;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str2, ho7.i("VideoMessage Recording. VideoMessageMedia(path=", file.getPath(), ") is prepared successfully"), null);
                    }
                }
                return new x6h(file.getPath(), size.getWidth(), size.getHeight(), j, str, xt4Var);
            }
        }
        return null;
    }

    @Override // defpackage.xfd
    public final void h() {
        String str = this.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "VideoMessage Recording. Pause", null);
            }
        }
        p22 p22Var = this.H;
        if (p22Var != null) {
            p22Var.a(new o22(p22Var, 3));
        }
        dhd dhdVar = this.C;
        if (dhdVar != null) {
            dhdVar.close();
        }
        this.v.m(null, e5h.a);
        this.z = true;
    }

    @Override // defpackage.xfd
    public final boolean i() {
        return ((qsb) this.c.getValue()).c(qsb.q);
    }

    @Override // defpackage.xfd
    public final String j() {
        File file = this.t;
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    @Override // defpackage.xfd
    public final void k(zed zedVar) {
        this.e = zedVar;
    }

    public final void l(j48 j48Var, f32 f32Var) {
        r8c r8cVar;
        w9c w9cVar = this.f;
        if (w9cVar != null) {
            w9cVar.f();
        }
        n38 n38VarC = null;
        try {
            r8cVar = this.l;
        } catch (Throwable th) {
            wqi.e(this.h, "VideoMessage Recording. Fail to bindCameraToLifecycle", th);
        }
        if (r8cVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        s1h s1hVar = this.o;
        if (s1hVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        j5h j5hVar = this.m;
        if (j5hVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Rational rational = new Rational(1, 1);
        int iK = r8cVar.k();
        chh chhVar = new chh();
        chhVar.a = 1;
        chhVar.b = rational;
        chhVar.c = iK;
        chhVar.d = 0;
        w9c w9cVar2 = this.f;
        if (w9cVar2 != null) {
            bxg bxgVar = new bxg();
            bxgVar.a(r8cVar);
            bxgVar.a(s1hVar);
            bxgVar.a = chhVar;
            bxgVar.c.add(j5hVar);
            n38VarC = w9cVar2.c(j48Var, f32Var, bxgVar.b());
        }
        this.p = n38VarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3 A[Catch: CancellationException -> 0x004f, Exception -> 0x0070, ExecutionException -> 0x0074, TryCatch #2 {CancellationException -> 0x004f, blocks: (B:13:0x0041, B:73:0x01a1, B:75:0x01c3, B:77:0x01d8, B:79:0x01e2, B:81:0x01e8, B:83:0x01f2, B:86:0x01fb, B:90:0x0204, B:92:0x0210, B:93:0x0212, B:95:0x0224, B:97:0x0228, B:99:0x0232, B:100:0x0237, B:24:0x0064, B:63:0x010d, B:69:0x0133, B:66:0x011e, B:68:0x0124, B:31:0x007b, B:33:0x0083, B:43:0x00a8, B:45:0x00ac, B:47:0x00b2, B:50:0x00c4, B:49:0x00bc, B:51:0x00ca, B:52:0x00cf, B:36:0x008a, B:38:0x0090, B:53:0x00d0, B:59:0x00ec, B:56:0x00d7, B:58:0x00dd), top: B:121:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0232 A[Catch: CancellationException -> 0x004f, Exception -> 0x0070, ExecutionException -> 0x0074, TRY_ENTER, TryCatch #2 {CancellationException -> 0x004f, blocks: (B:13:0x0041, B:73:0x01a1, B:75:0x01c3, B:77:0x01d8, B:79:0x01e2, B:81:0x01e8, B:83:0x01f2, B:86:0x01fb, B:90:0x0204, B:92:0x0210, B:93:0x0212, B:95:0x0224, B:97:0x0228, B:99:0x0232, B:100:0x0237, B:24:0x0064, B:63:0x010d, B:69:0x0133, B:66:0x011e, B:68:0x0124, B:31:0x007b, B:33:0x0083, B:43:0x00a8, B:45:0x00ac, B:47:0x00b2, B:50:0x00c4, B:49:0x00bc, B:51:0x00ca, B:52:0x00cf, B:36:0x008a, B:38:0x0090, B:53:0x00d0, B:59:0x00ec, B:56:0x00d7, B:58:0x00dd), top: B:121:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(android.util.Size r19, defpackage.q8c r20, defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.m(android.util.Size, q8c, q44):java.lang.Object");
    }

    public final void n() {
        if (!((Context) this.a.getValue()).getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            throw new VideoMessageRecordDelegate$NoAvailableCameraException(0);
        }
    }

    public final File o(String str) {
        File fileL = ((iz5) ((qx5) this.b.getValue())).l(str);
        k7h k7hVar = (k7h) this.j.getValue();
        svi.e(k7hVar.e, null, null, new b7h(k7hVar, Uri.fromFile(fileL), null), 3);
        return fileL;
    }

    public final l22 p() {
        n38 n38Var = this.p;
        if (n38Var != null) {
            return n38Var.c.B0;
        }
        return null;
    }

    public final lzf q() {
        return (lzf) this.d.getValue();
    }

    public final boolean r(w9c w9cVar, f32 f32Var) {
        boolean z;
        try {
            w9cVar.getClass();
            Trace.beginSection(kfi.h("CX:hasCamera"));
            try {
                f32Var.c(w9cVar.d.a.B());
                z = true;
            } catch (IllegalArgumentException unused) {
                z = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
            return z;
        } catch (CameraInfoUnavailableException e) {
            wqi.e(this.h, "VideoMessage Recording. The phone doesn't have " + f32Var, e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.d8h r8, android.util.Size r9, defpackage.q44 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.k8h
            if (r0 == 0) goto L13
            r0 = r10
            k8h r0 = (defpackage.k8h) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            k8h r0 = new k8h
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.Y
            g84 r1 = defpackage.g84.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            a8h r8 = r0.X
            a8h r9 = r0.o
            q8h r0 = r0.d
            defpackage.g8j.b(r10)
            goto L63
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.g8j.b(r10)
            a8h r10 = new a8h
            r8.getClass()
            r10.<init>(r9)
            lzf r8 = r7.q()
            q2b r8 = (defpackage.q2b) r8
            z74 r8 = r8.b()
            l8h r2 = new l8h
            r4 = 0
            r2.<init>(r9, r4)
            r0.d = r7
            r0.o = r10
            r0.X = r10
            r0.s0 = r3
            java.lang.Object r8 = defpackage.svi.i(r8, r2, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r0 = r7
            r9 = r10
            r10 = r8
            r8 = r9
        L63:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto Lb3
            java.lang.String r1 = r8.a
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L6e
            goto L86
        L6e:
            lg8 r3 = defpackage.lg8.d
            boolean r4 = r2.b(r3)
            if (r4 == 0) goto L86
            java.lang.String r4 = defpackage.g4f.c(r10)
            java.lang.String r5 = "setStencil, "
            java.lang.String r6 = ", recycle_after_consume=true"
            java.lang.String r4 = defpackage.ho7.i(r5, r4, r6)
            r5 = 0
            r2.c(r3, r1, r4, r5)
        L86:
            sue r1 = new sue
            r2 = 15
            r1.<init>(r8, r2, r10)
            q8g r10 = new q8g
            r10.<init>(r2)
            r2 = 2
            defpackage.a8h.d(r8, r1, r10, r2)
            java.util.concurrent.CopyOnWriteArraySet r8 = r9.X
            b8h r10 = new b8h
            r10.<init>(r0)
            r8.add(r10)
            j5h r8 = new j5h
            a07 r10 = r9.o
            bba r1 = new bba
            r2 = 16
            r1.<init>(r2)
            r8.<init>(r10, r9, r1)
            r0.m = r8
            qqg r8 = defpackage.qqg.a
            return r8
        Lb3:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.s(d8h, android.util.Size, q44):java.lang.Object");
    }

    public final Object t(g8h g8hVar) {
        l42 l42Var = new l42(1, hni.f(g8hVar));
        l42Var.o();
        w9c w9cVar = w9c.f;
        k18 k18Var = this.a;
        q72 q72VarC = a6j.c((Context) k18Var.getValue());
        q72VarC.d(new nt3(l42Var, q72VarC, this, 10), z7.d((Context) k18Var.getValue()));
        return l42Var.n();
    }

    public final void u(File file) {
        dhd dhdVarF;
        k7h k7hVar = (k7h) this.j.getValue();
        bhd bhdVar = this.n;
        if (bhdVar != null) {
            iy1 iy1Var = new iy1((Context) this.a.getValue(), bhdVar, new r5j(file).s());
            iy1Var.b = true;
            iy1Var.j();
            dhdVarF = iy1Var.f((ExecutorService) this.g.getValue(), new l32(this, 5, k7hVar));
        } else {
            dhdVarF = null;
        }
        this.C = dhdVarF;
    }
}
