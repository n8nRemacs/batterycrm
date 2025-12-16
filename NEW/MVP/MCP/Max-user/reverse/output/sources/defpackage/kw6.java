package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Size;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* loaded from: classes2.dex */
public final class kw6 implements tm6 {
    public Object a;
    public Object d;
    public Object o = new LinkedHashMap();
    public Object b = HttpGet.METHOD_NAME;
    public Object c = new i17();

    public zmd a() {
        ga7 ga7Var = (ga7) this.a;
        if (ga7Var == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.b;
        j17 j17VarC = ((i17) this.c).c();
        vfi vfiVar = (vfi) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.o;
        byte[] bArr = yxg.a;
        return new zmd(ga7Var, str, j17VarC, vfiVar, linkedHashMap.isEmpty() ? id5.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.tm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.b
            dg0 r0 = (defpackage.dg0) r0
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r1 = r14.a
            em6 r1 = (defpackage.em6) r1
            java.lang.Object r1 = r1.invoke(r15)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1b
            vk3 r15 = defpackage.vqa.e(r15)
            return r15
        L1b:
            int r1 = r0.c
            r2 = 1
            int r1 = r1 + r2
            r0.c = r1
            r3 = 3
            r4 = 0
            if (r1 <= r3) goto L28
        L26:
            r8 = r4
            goto L7c
        L28:
            ln5 r3 = r0.a
            long r6 = r3.a
            float r6 = (float) r6
            float r3 = r3.b
            double r7 = (double) r3
            float r1 = (float) r1
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r3
            double r9 = (double) r1
            double r7 = java.lang.Math.pow(r7, r9)
            float r1 = (float) r7
            float r6 = r6 * r1
            r7 = 30000(0x7530, double:1.4822E-319)
            float r1 = (float) r7
            float r6 = java.lang.Math.min(r6, r1)
            long r6 = (long) r6
            float r6 = (float) r6
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            float r7 = r7 * r6
            float r8 = r6 - r7
            float r3 = java.lang.Math.max(r8, r3)
            long r8 = (long) r3
            float r7 = r7 + r6
            float r1 = java.lang.Math.min(r7, r1)
            long r6 = (long) r1
            double r10 = java.lang.Math.random()
            long r6 = r6 - r8
            r12 = 1
            long r6 = r6 + r12
            double r6 = (double) r6
            double r10 = r10 * r6
            int r1 = (int) r10
            long r6 = (long) r1
            long r8 = r8 + r6
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 != 0) goto L67
            goto L26
        L67:
            if (r1 < 0) goto Laa
            long r6 = r0.d
            long r6 = r6 + r8
            r0.d = r6
            long r10 = r0.b
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 <= 0) goto L76
            r1 = r2
            goto L77
        L76:
            r1 = 0
        L77:
            if (r1 != r2) goto L7a
            goto L26
        L7a:
            if (r1 != 0) goto La4
        L7c:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto L98
            java.lang.Object r1 = r14.c
            sm6 r1 = (defpackage.sm6) r1
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r15, r0)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r0 = r14.d
            j0e r0 = (defpackage.j0e) r0
            tta r15 = defpackage.vqa.r(r8, r15, r0)
            return r15
        L98:
            java.lang.Object r0 = r14.o
            em6 r0 = (defpackage.em6) r0
            r0.invoke(r15)
            vk3 r15 = defpackage.vqa.e(r15)
            return r15
        La4:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        Laa:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Interval is invalid. Must be greater than 0."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw6.apply(java.lang.Object):java.lang.Object");
    }

    public int b() {
        int iM;
        jei.b();
        z5j.f("The ImageReader is not initialized.", ((ov8) this.b) != null);
        ov8 ov8Var = (ov8) this.b;
        synchronized (ov8Var.a) {
            iM = ((lf7) ov8Var.d).m() - ov8Var.b;
        }
        return iM;
    }

    public void c(String str, String str2) {
        ((i17) this.c).h(str, str2);
    }

    public void d(em6 em6Var) {
        int i;
        int i2;
        EGLDisplay eGLDisplay = (EGLDisplay) this.b;
        if (fni.a((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) this.d;
        boolean zEglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.c);
        gke.b("eglMakeCurrent", 12291, 12297, 12299);
        if (zEglMakeCurrent) {
            if (fni.a((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
                i = 0;
            } else {
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, (EGLSurface) this.d, 12375, iArr, 0);
                gke.b("eglQuerySurface", new int[0]);
                i = iArr[0];
            }
            if (fni.a((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
                i2 = 0;
            } else {
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, (EGLSurface) this.d, 12374, iArr2, 0);
                gke.b("eglQuerySurface", new int[0]);
                i2 = iArr2[0];
            }
            if (i != ((Size) this.o).getWidth() || i2 != ((Size) this.o).getHeight()) {
                this.o = new Size(i, i2);
            }
            try {
                em6Var.invoke((Size) this.o);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                gke.b("eglMakeCurrent", new int[0]);
            } catch (Throwable th) {
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                gke.b("eglMakeCurrent", new int[0]);
                throw th;
            }
        }
    }

    public void e(String str, vfi vfiVar) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (vfiVar == null) {
            if (str.equals(HttpPost.METHOD_NAME) || str.equals(HttpPut.METHOD_NAME) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(ho7.i("method ", str, " must have a request body.").toString());
            }
        } else if (!uei.a(str)) {
            throw new IllegalArgumentException(ho7.i("method ", str, " must not have a request body.").toString());
        }
        this.b = str;
        this.d = vfiVar;
    }

    public void f(jf7 jf7Var) throws Exception {
        jei.b();
        if (((iac) this.a) == null) {
            gri.i("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + jf7Var);
            jf7Var.close();
            return;
        }
        if (((Integer) jf7Var.getImageInfo().e().a.get(((iac) this.a).g)) == null) {
            gri.i("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            jf7Var.close();
            return;
        }
        jei.b();
        bb0 bb0Var = (bb0) this.c;
        Objects.requireNonNull(bb0Var);
        bb0Var.a.accept(new cb0((iac) this.a, jf7Var));
        iac iacVar = (iac) this.a;
        this.a = null;
        knd kndVar = iacVar.f;
        int i = iacVar.j;
        if (i != -1 && i != 100) {
            iacVar.j = 100;
            jei.b();
            if (!kndVar.g) {
                yb0 yb0Var = kndVar.a;
                yb0Var.b.execute(new azf(yb0Var));
            }
        }
        jei.b();
        if (kndVar.g) {
            return;
        }
        if (!kndVar.h) {
            kndVar.b();
        }
        kndVar.e.b(null);
    }

    public void g(iac iacVar) {
        jei.b();
        z5j.f("only one capture stage is supported.", iacVar.h.size() == 1);
        z5j.f("Too many acquire images. Close image to be able to process next.", b() > 0);
        this.a = iacVar;
        wsf.b(iacVar.i, new xt4(this, iacVar, false, 11), ayi.a());
    }

    public void h() {
        if (fni.a((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface((EGLDisplay) this.b, (EGLSurface) this.d);
        gke.b("eglDestroySurface", new int[0]);
        this.d = EGL14.EGL_NO_SURFACE;
    }

    public void i(String str) {
        ((i17) this.c).g(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106 A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111 A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115 A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128 A[Catch: FileNotFoundException -> 0x0095, TryCatch #3 {FileNotFoundException -> 0x0095, blocks: (B:21:0x0075, B:23:0x007b, B:25:0x0087, B:54:0x00e0, B:55:0x00f5, B:66:0x0128, B:68:0x0132, B:57:0x00fb, B:58:0x00ff, B:59:0x0106, B:60:0x010a, B:61:0x0111, B:62:0x0115, B:64:0x011d, B:53:0x00da, B:50:0x00ca, B:91:0x01f6, B:92:0x01fd), top: B:102:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(android.net.Uri r20, defpackage.q44 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw6.j(android.net.Uri, q44):java.lang.Object");
    }

    public boolean k() {
        if (fni.a((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return false;
        }
        boolean zEglSwapBuffers = EGL14.eglSwapBuffers((EGLDisplay) this.b, (EGLSurface) this.d);
        gke.b("eglSwapBuffers", 12299, 12301, 12291);
        return zEglSwapBuffers;
    }

    public void l(String str) {
        if (str == null) {
            ((LinkedHashMap) this.o).remove(Object.class);
            return;
        }
        if (((LinkedHashMap) this.o).isEmpty()) {
            this.o = new LinkedHashMap();
        }
        ((LinkedHashMap) this.o).put(Object.class, Object.class.cast(str));
    }

    public void m(String str) throws NumberFormatException {
        if (dnf.r(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (dnf.r(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        an3 an3Var = new an3();
        an3Var.j(null, str);
        this.a = an3Var.b();
    }
}
