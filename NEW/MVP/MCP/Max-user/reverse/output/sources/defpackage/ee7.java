package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ee7 extends uwg {
    public static final ce7 A = new ce7();
    public final int p;
    public final AtomicReference q;
    public final int r;
    public int s;
    public Rational t;
    public p1e u;
    public die v;
    public b4 w;
    public zyf x;
    public eie y;
    public final ao6 z;

    public ee7(fe7 fe7Var) {
        super(fe7Var);
        this.q = new AtomicReference(null);
        this.s = -1;
        this.t = null;
        this.z = new ao6(19, this);
        fe7 fe7Var2 = (fe7) this.f;
        s90 s90Var = fe7.b;
        if (fe7Var2.i(s90Var)) {
            this.p = ((Integer) fe7Var2.f(s90Var)).intValue();
        } else {
            this.p = 1;
        }
        this.r = ((Integer) fe7Var2.d(fe7.s0, 0)).intValue();
        this.u = new p1e((de7) fe7Var2.d(fe7.u0, null));
    }

    public static boolean I(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void F(boolean z) {
        zyf zyfVar;
        Log.d("ImageCapture", "clearPipeline");
        jei.b();
        eie eieVar = this.y;
        if (eieVar != null) {
            eieVar.b();
            this.y = null;
        }
        b4 b4Var = this.w;
        if (b4Var != null) {
            b4Var.b();
            this.w = null;
        }
        if (z || (zyfVar = this.x) == null) {
            return;
        }
        zyfVar.b();
        this.x = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final die G(String str, fe7 fe7Var, ob0 ob0Var) {
        int iIntValue;
        ju3 ju3Var;
        xo8 xo8Var;
        final int i;
        k02 l02Var;
        jei.b();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + ob0Var + ")");
        Size size = ob0Var.a;
        n22 n22VarC = c();
        Objects.requireNonNull(n22VarC);
        boolean zL = n22VarC.l();
        boolean z = zL ^ true;
        if (this.w != null) {
            z5j.f(null, z);
            this.w.b();
        }
        if (((Boolean) this.f.d(fe7.v0, Boolean.FALSE)).booleanValue()) {
            c().g().y();
        }
        j5h j5hVar = this.m;
        b4 b4Var = new b4();
        jei.b();
        b4Var.a = fe7Var;
        kz1 kz1Var = (kz1) fe7Var.d(xwg.k0, null);
        if (kz1Var == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) fe7Var.d(a2g.e0, fe7Var.toString())));
        }
        w30 w30Var = new w30();
        kz1Var.a(fe7Var, w30Var);
        b4Var.b = w30Var.d();
        final kw6 kw6Var = new kw6();
        kw6Var.a = null;
        kw6Var.o = null;
        b4Var.c = kw6Var;
        Executor executor = (Executor) fe7Var.d(ks7.K, ayi.c());
        Objects.requireNonNull(executor);
        int i2 = 0;
        if (j5hVar != null) {
            z5j.b(j5hVar.a == 4);
            throw null;
        }
        final hac hacVar = new hac(executor);
        b4Var.d = hacVar;
        int inputFormat = fe7Var.getInputFormat();
        Integer num = (Integer) fe7Var.d(fe7.o, null);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer num2 = (Integer) fe7Var.d(re7.x, null);
            iIntValue = (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
        }
        if (fe7Var.d(fe7.Y, null) != null) {
            throw new ClassCastException();
        }
        i85 i85Var = new i85();
        i85 i85Var2 = new i85();
        q90 q90Var = new q90(size, inputFormat, iIntValue, z, i85Var, i85Var2);
        b4Var.o = q90Var;
        z5j.f("CaptureNode does not support recreation yet.", ((q90) kw6Var.d) == null && ((ov8) kw6Var.b) == null);
        kw6Var.d = q90Var;
        k02 l52Var = new l52(i2, kw6Var);
        if (zL) {
            wy9 wy9Var = new wy9(size.getWidth(), size.getHeight(), inputFormat, 4);
            List listAsList = Arrays.asList(l52Var, wy9Var.b);
            if (listAsList.isEmpty()) {
                l02Var = new m02();
                i = 0;
            } else if (listAsList.size() == 1) {
                i = 0;
                l02Var = (k02) listAsList.get(0);
            } else {
                i = 0;
                l02Var = new l02(listAsList);
            }
            ju3Var = new ju3() { // from class: j52
                @Override // defpackage.ju3
                public final void accept(Object obj) {
                    boolean z2;
                    switch (i) {
                        case 0:
                            kw6Var.g((iac) obj);
                            break;
                        case 1:
                            iac iacVar = (iac) obj;
                            kw6 kw6Var2 = kw6Var;
                            kw6Var2.g(iacVar);
                            xo8 xo8Var2 = (xo8) kw6Var2.o;
                            z5j.f("Pending request should be null", ((iac) xo8Var2.c) == null);
                            xo8Var2.c = iacVar;
                            break;
                        default:
                            xb0 xb0Var = (xb0) obj;
                            jei.b();
                            iac iacVar2 = (iac) kw6Var.a;
                            if (iacVar2 != null && iacVar2.a == xb0Var.a) {
                                ImageCaptureException imageCaptureException = xb0Var.b;
                                knd kndVar = iacVar2.f;
                                yb0 yb0Var = kndVar.a;
                                jei.b();
                                if (!kndVar.g) {
                                    jei.b();
                                    int i3 = yb0Var.a;
                                    if (i3 > 0) {
                                        z2 = true;
                                        yb0Var.a = i3 - 1;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        jei.b();
                                        yb0Var.b.execute(new aee(yb0Var, 22, imageCaptureException));
                                    }
                                    kndVar.a();
                                    kndVar.e.d(imageCaptureException);
                                    if (z2) {
                                        kndVar.b.d(yb0Var);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            l52Var = l02Var;
            xo8Var = wy9Var;
        } else {
            xo8 xo8Var2 = new xo8(27, ofi.c(size.getWidth(), size.getHeight(), inputFormat, 4));
            kw6Var.o = xo8Var2;
            final int i3 = 1;
            ju3Var = new ju3() { // from class: j52
                @Override // defpackage.ju3
                public final void accept(Object obj) {
                    boolean z2;
                    switch (i3) {
                        case 0:
                            kw6Var.g((iac) obj);
                            break;
                        case 1:
                            iac iacVar = (iac) obj;
                            kw6 kw6Var2 = kw6Var;
                            kw6Var2.g(iacVar);
                            xo8 xo8Var22 = (xo8) kw6Var2.o;
                            z5j.f("Pending request should be null", ((iac) xo8Var22.c) == null);
                            xo8Var22.c = iacVar;
                            break;
                        default:
                            xb0 xb0Var = (xb0) obj;
                            jei.b();
                            iac iacVar2 = (iac) kw6Var.a;
                            if (iacVar2 != null && iacVar2.a == xb0Var.a) {
                                ImageCaptureException imageCaptureException = xb0Var.b;
                                knd kndVar = iacVar2.f;
                                yb0 yb0Var = kndVar.a;
                                jei.b();
                                if (!kndVar.g) {
                                    jei.b();
                                    int i32 = yb0Var.a;
                                    if (i32 > 0) {
                                        z2 = true;
                                        yb0Var.a = i32 - 1;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        jei.b();
                                        yb0Var.b.execute(new aee(yb0Var, 22, imageCaptureException));
                                    }
                                    kndVar.a();
                                    kndVar.e.d(imageCaptureException);
                                    if (z2) {
                                        kndVar.b.d(yb0Var);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            xo8Var = xo8Var2;
        }
        q90Var.a = l52Var;
        Surface surface = xo8Var.getSurface();
        Objects.requireNonNull(surface);
        z5j.f("The surface is already set.", q90Var.b == null);
        q90Var.b = new cg7(surface, size, inputFormat);
        kw6Var.b = new ov8(xo8Var);
        xo8Var.i(new xtd(29, kw6Var), ayi.d());
        i85Var.b = ju3Var;
        final int i4 = 2;
        i85Var2.b = new ju3() { // from class: j52
            @Override // defpackage.ju3
            public final void accept(Object obj) {
                boolean z2;
                switch (i4) {
                    case 0:
                        kw6Var.g((iac) obj);
                        break;
                    case 1:
                        iac iacVar = (iac) obj;
                        kw6 kw6Var2 = kw6Var;
                        kw6Var2.g(iacVar);
                        xo8 xo8Var22 = (xo8) kw6Var2.o;
                        z5j.f("Pending request should be null", ((iac) xo8Var22.c) == null);
                        xo8Var22.c = iacVar;
                        break;
                    default:
                        xb0 xb0Var = (xb0) obj;
                        jei.b();
                        iac iacVar2 = (iac) kw6Var.a;
                        if (iacVar2 != null && iacVar2.a == xb0Var.a) {
                            ImageCaptureException imageCaptureException = xb0Var.b;
                            knd kndVar = iacVar2.f;
                            yb0 yb0Var = kndVar.a;
                            jei.b();
                            if (!kndVar.g) {
                                jei.b();
                                int i32 = yb0Var.a;
                                if (i32 > 0) {
                                    z2 = true;
                                    yb0Var.a = i32 - 1;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    jei.b();
                                    yb0Var.b.execute(new aee(yb0Var, 22, imageCaptureException));
                                }
                                kndVar.a();
                                kndVar.e.d(imageCaptureException);
                                if (z2) {
                                    kndVar.b.d(yb0Var);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        i85 i85Var3 = new i85();
        i85 i85Var4 = new i85();
        bb0 bb0Var = new bb0(i85Var3, i85Var4, inputFormat, iIntValue);
        kw6Var.c = bb0Var;
        hacVar.b = bb0Var;
        final int i5 = 0;
        i85Var3.b = new ju3() { // from class: fac
            @Override // defpackage.ju3
            public final void accept(Object obj) throws Exception {
                final cb0 cb0Var = (cb0) obj;
                switch (i5) {
                    case 0:
                        if (!cb0Var.a.f.g) {
                            final hac hacVar2 = hacVar;
                            final int i6 = 1;
                            hacVar2.a.execute(new Runnable() { // from class: gac
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i6) {
                                        case 0:
                                            hac hacVar3 = hacVar2;
                                            int i7 = hacVar3.b.d;
                                            z5j.a("Postview only support YUV and JPEG output formats. Output format: " + i7, i7 == 35 || i7 == 256);
                                            cb0 cb0Var2 = cb0Var;
                                            try {
                                                ayi.d().execute(new d8c(cb0Var2.a, 6, (Bitmap) hacVar3.i.apply((xa0) hacVar3.c.b(cb0Var2))));
                                                break;
                                            } catch (Exception e) {
                                                cb0Var2.b.close();
                                                gri.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                            break;
                                        default:
                                            hac hacVar4 = hacVar2;
                                            cb0 cb0Var3 = cb0Var;
                                            iac iacVar = cb0Var3.a;
                                            try {
                                                iacVar.getClass();
                                                ayi.d().execute(new d8c(iacVar, 5, hacVar4.a(cb0Var3)));
                                                break;
                                            } catch (ImageCaptureException e2) {
                                                ayi.d().execute(new d8c(iacVar, 7, e2));
                                            } catch (OutOfMemoryError e3) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed due to low memory.", e3)));
                                                return;
                                            } catch (RuntimeException e4) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed.", e4)));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            cb0Var.b.close();
                            break;
                        }
                    default:
                        if (!cb0Var.a.f.g) {
                            final hac hacVar3 = hacVar;
                            final int i7 = 0;
                            hacVar3.a.execute(new Runnable() { // from class: gac
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i7) {
                                        case 0:
                                            hac hacVar32 = hacVar3;
                                            int i72 = hacVar32.b.d;
                                            z5j.a("Postview only support YUV and JPEG output formats. Output format: " + i72, i72 == 35 || i72 == 256);
                                            cb0 cb0Var2 = cb0Var;
                                            try {
                                                ayi.d().execute(new d8c(cb0Var2.a, 6, (Bitmap) hacVar32.i.apply((xa0) hacVar32.c.b(cb0Var2))));
                                                break;
                                            } catch (Exception e) {
                                                cb0Var2.b.close();
                                                gri.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                            break;
                                        default:
                                            hac hacVar4 = hacVar3;
                                            cb0 cb0Var3 = cb0Var;
                                            iac iacVar = cb0Var3.a;
                                            try {
                                                iacVar.getClass();
                                                ayi.d().execute(new d8c(iacVar, 5, hacVar4.a(cb0Var3)));
                                                break;
                                            } catch (ImageCaptureException e2) {
                                                ayi.d().execute(new d8c(iacVar, 7, e2));
                                            } catch (OutOfMemoryError e3) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed due to low memory.", e3)));
                                                return;
                                            } catch (RuntimeException e4) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed.", e4)));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            gri.i("ProcessingNode", "The postview image is closed due to request aborted");
                            cb0Var.b.close();
                            break;
                        }
                }
            }
        };
        final int i6 = 1;
        i85Var4.b = new ju3() { // from class: fac
            @Override // defpackage.ju3
            public final void accept(Object obj) throws Exception {
                final cb0 cb0Var = (cb0) obj;
                switch (i6) {
                    case 0:
                        if (!cb0Var.a.f.g) {
                            final hac hacVar2 = hacVar;
                            final int i62 = 1;
                            hacVar2.a.execute(new Runnable() { // from class: gac
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i62) {
                                        case 0:
                                            hac hacVar32 = hacVar2;
                                            int i72 = hacVar32.b.d;
                                            z5j.a("Postview only support YUV and JPEG output formats. Output format: " + i72, i72 == 35 || i72 == 256);
                                            cb0 cb0Var2 = cb0Var;
                                            try {
                                                ayi.d().execute(new d8c(cb0Var2.a, 6, (Bitmap) hacVar32.i.apply((xa0) hacVar32.c.b(cb0Var2))));
                                                break;
                                            } catch (Exception e) {
                                                cb0Var2.b.close();
                                                gri.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                            break;
                                        default:
                                            hac hacVar4 = hacVar2;
                                            cb0 cb0Var3 = cb0Var;
                                            iac iacVar = cb0Var3.a;
                                            try {
                                                iacVar.getClass();
                                                ayi.d().execute(new d8c(iacVar, 5, hacVar4.a(cb0Var3)));
                                                break;
                                            } catch (ImageCaptureException e2) {
                                                ayi.d().execute(new d8c(iacVar, 7, e2));
                                            } catch (OutOfMemoryError e3) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed due to low memory.", e3)));
                                                return;
                                            } catch (RuntimeException e4) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed.", e4)));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            cb0Var.b.close();
                            break;
                        }
                    default:
                        if (!cb0Var.a.f.g) {
                            final hac hacVar3 = hacVar;
                            final int i7 = 0;
                            hacVar3.a.execute(new Runnable() { // from class: gac
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i7) {
                                        case 0:
                                            hac hacVar32 = hacVar3;
                                            int i72 = hacVar32.b.d;
                                            z5j.a("Postview only support YUV and JPEG output formats. Output format: " + i72, i72 == 35 || i72 == 256);
                                            cb0 cb0Var2 = cb0Var;
                                            try {
                                                ayi.d().execute(new d8c(cb0Var2.a, 6, (Bitmap) hacVar32.i.apply((xa0) hacVar32.c.b(cb0Var2))));
                                                break;
                                            } catch (Exception e) {
                                                cb0Var2.b.close();
                                                gri.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                            break;
                                        default:
                                            hac hacVar4 = hacVar3;
                                            cb0 cb0Var3 = cb0Var;
                                            iac iacVar = cb0Var3.a;
                                            try {
                                                iacVar.getClass();
                                                ayi.d().execute(new d8c(iacVar, 5, hacVar4.a(cb0Var3)));
                                                break;
                                            } catch (ImageCaptureException e2) {
                                                ayi.d().execute(new d8c(iacVar, 7, e2));
                                            } catch (OutOfMemoryError e3) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed due to low memory.", e3)));
                                                return;
                                            } catch (RuntimeException e4) {
                                                ayi.d().execute(new d8c(iacVar, 7, new ImageCaptureException("Processing failed.", e4)));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            gri.i("ProcessingNode", "The postview image is closed due to request aborted");
                            cb0Var.b.close();
                            break;
                        }
                }
            }
        };
        hacVar.c = new kk4(27);
        hacVar.d = new r5j(hacVar.j);
        int i7 = 22;
        hacVar.f = new v1a(i7);
        hacVar.e = new tha(14);
        hacVar.g = new rha(i7);
        hacVar.i = new u1j(21);
        if (inputFormat == 35 || hacVar.k) {
            hacVar.h = new qha(i7);
        }
        this.w = b4Var;
        if (this.x == null) {
            this.x = new zyf(this.z);
        }
        zyf zyfVar = this.x;
        b4 b4Var2 = this.w;
        zyfVar.getClass();
        jei.b();
        zyfVar.c = b4Var2;
        b4Var2.getClass();
        jei.b();
        kw6 kw6Var2 = (kw6) b4Var2.c;
        kw6Var2.getClass();
        jei.b();
        z5j.f("The ImageReader is not initialized.", ((ov8) kw6Var2.b) != null);
        ov8 ov8Var = (ov8) kw6Var2.b;
        synchronized (ov8Var.a) {
            ov8Var.X = zyfVar;
        }
        b4 b4Var3 = this.w;
        die dieVarI = die.i((fe7) b4Var3.a, ob0Var.a);
        q90 q90Var2 = (q90) b4Var3.o;
        cg7 cg7Var = q90Var2.b;
        Objects.requireNonNull(cg7Var);
        u75 u75Var = u75.d;
        w86 w86VarA = kb0.a(cg7Var);
        w86VarA.e = u75Var;
        ((LinkedHashSet) dieVarI.a).add(w86VarA.b());
        cg7 cg7Var2 = q90Var2.c;
        if (cg7Var2 != null) {
            dieVarI.h = kb0.a(cg7Var2).b();
        }
        if (this.p == 2 && !ob0Var.e) {
            d().j(dieVarI);
        }
        ao3 ao3Var = ob0Var.d;
        if (ao3Var != null) {
            ((w30) dieVarI.b).c(ao3Var);
        }
        eie eieVar = this.y;
        if (eieVar != null) {
            eieVar.b();
        }
        eie eieVar2 = new eie(new xc7(1, this));
        this.y = eieVar2;
        dieVarI.f = eieVar2;
        return dieVarI;
    }

    public final int H() {
        int iIntValue;
        synchronized (this.q) {
            iIntValue = this.s;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((fe7) this.f).d(fe7.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void J(Executor executor, v32 v32Var) {
        int iIntValue;
        int iRound;
        int i;
        int i2;
        int i3;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ayi.d().execute(new se5(this, executor, v32Var, 14));
            return;
        }
        jei.b();
        if (H() == 3 && this.u.a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        n22 n22VarC = c();
        Rect rect = null;
        if (n22VarC == null) {
            v32Var.b0(new ImageCaptureException("Not bound to a valid Camera [" + this + "]", null));
            return;
        }
        zyf zyfVar = this.x;
        Objects.requireNonNull(zyfVar);
        Rect rect2 = this.i;
        ob0 ob0Var = this.g;
        Size size = ob0Var != null ? ob0Var.a : null;
        Objects.requireNonNull(size);
        if (rect2 == null) {
            Rational rational = this.t;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                n22 n22VarC2 = c();
                Objects.requireNonNull(n22VarC2);
                int iH = h(n22VarC2, false);
                Rational rational2 = new Rational(this.t.getDenominator(), this.t.getNumerator());
                if (!bhg.b(iH)) {
                    rational2 = this.t;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    gri.i("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int iRound2 = Math.round((f / numerator) * denominator);
                        i3 = (height - iRound2) / 2;
                        i2 = iRound2;
                        iRound = width;
                        i = 0;
                    } else {
                        iRound = Math.round((f2 / denominator) * numerator);
                        i = (width - iRound) / 2;
                        i2 = height;
                        i3 = 0;
                    }
                    rect = new Rect(i, i3, iRound + i, i2 + i3);
                }
                Objects.requireNonNull(rect);
                rect2 = rect;
            }
        }
        Matrix matrix = this.j;
        int iH2 = h(n22VarC, false);
        fe7 fe7Var = (fe7) this.f;
        s90 s90Var = fe7.t0;
        if (fe7Var.i(s90Var)) {
            iIntValue = ((Integer) fe7Var.f(s90Var)).intValue();
        } else {
            int i4 = this.p;
            if (i4 == 0) {
                iIntValue = 100;
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException(wy1.e(i4, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        yb0 yb0Var = new yb0(executor, v32Var, rect2, matrix, iH2, iIntValue, this.p, Collections.unmodifiableList((ArrayList) this.v.e));
        jei.b();
        zyfVar.a.offer(yb0Var);
        zyfVar.c();
    }

    public final void K() {
        synchronized (this.q) {
            try {
                if (this.q.get() != null) {
                    return;
                }
                d().f(H());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uwg
    public final xwg f(boolean z, axg axgVar) {
        A.getClass();
        fe7 fe7Var = ce7.a;
        ao3 ao3VarA = axgVar.a(fe7Var.w(), this.p);
        if (z) {
            ao3VarA = ao3.s(ao3VarA, fe7Var);
        }
        if (ao3VarA == null) {
            return null;
        }
        return new fe7(fjb.a(((ad7) l(ao3VarA)).b));
    }

    @Override // defpackage.uwg
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.uwg
    public final wwg l(ao3 ao3Var) {
        return new ad7(x8a.k(ao3Var), 1);
    }

    @Override // defpackage.uwg
    public final void s() {
        z5j.e(c(), "Attached camera cannot be null");
        if (H() == 3) {
            n22 n22VarC = c();
            if ((n22VarC != null ? n22VarC.n().h() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // defpackage.uwg
    public final void t() {
        gri.a("ImageCapture", "onCameraControlReady");
        K();
        d().g(this.u);
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    @Override // defpackage.uwg
    public final xwg u(l22 l22Var, wwg wwgVar) {
        Object objF;
        Object objF2;
        Object objF3;
        if (l22Var.o().d(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            ao3 ao3VarO = wwgVar.o();
            s90 s90Var = fe7.Z;
            Object objF4 = Boolean.TRUE;
            fjb fjbVar = (fjb) ao3VarO;
            fjbVar.getClass();
            try {
                objF4 = fjbVar.f(s90Var);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objF4)) {
                gri.i("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                if (gri.d(4, "ImageCapture")) {
                    Log.i("ImageCapture", "Requesting software JPEG due to device quirk.");
                }
                ((x8a) wwgVar.o()).n(fe7.Z, Boolean.TRUE);
            }
        }
        ao3 ao3VarO2 = wwgVar.o();
        Boolean bool2 = Boolean.TRUE;
        s90 s90Var2 = fe7.Z;
        Object objF5 = Boolean.FALSE;
        fjb fjbVar2 = (fjb) ao3VarO2;
        fjbVar2.getClass();
        try {
            objF5 = fjbVar2.f(s90Var2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objF5);
        Object objF6 = null;
        boolean z = false;
        if (zEquals) {
            if (c() != null) {
                c().g().y();
            }
            try {
                objF3 = fjbVar2.f(fe7.o);
            } catch (IllegalArgumentException unused3) {
                objF3 = null;
            }
            Integer num = (Integer) objF3;
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                gri.i("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                gri.i("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((x8a) ao3VarO2).n(fe7.Z, Boolean.FALSE);
            }
        }
        ao3 ao3VarO3 = wwgVar.o();
        s90 s90Var3 = fe7.o;
        fjb fjbVar3 = (fjb) ao3VarO3;
        fjbVar3.getClass();
        try {
            objF = fjbVar3.f(s90Var3);
        } catch (IllegalArgumentException unused4) {
            objF = null;
        }
        Integer num2 = (Integer) objF;
        if (num2 != null) {
            if (c() != null) {
                c().g().y();
            }
            ((x8a) wwgVar.o()).n(re7.x, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            ao3 ao3VarO4 = wwgVar.o();
            s90 s90Var4 = fe7.X;
            fjb fjbVar4 = (fjb) ao3VarO4;
            fjbVar4.getClass();
            try {
                objF2 = fjbVar4.f(s90Var4);
            } catch (IllegalArgumentException unused5) {
                objF2 = null;
            }
            if (Objects.equals(objF2, 1)) {
                ((x8a) wwgVar.o()).n(re7.x, 4101);
                ((x8a) wwgVar.o()).n(re7.y, u75.c);
            } else if (z) {
                ((x8a) wwgVar.o()).n(re7.x, 35);
            } else {
                ao3 ao3VarO5 = wwgVar.o();
                s90 s90Var5 = bf7.G;
                fjb fjbVar5 = (fjb) ao3VarO5;
                fjbVar5.getClass();
                try {
                    objF6 = fjbVar5.f(s90Var5);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) objF6;
                if (list == null) {
                    ((x8a) wwgVar.o()).n(re7.x, 256);
                } else if (I(256, list)) {
                    ((x8a) wwgVar.o()).n(re7.x, 256);
                } else if (I(35, list)) {
                    ((x8a) wwgVar.o()).n(re7.x, 35);
                }
            }
        }
        return wwgVar.q();
    }

    @Override // defpackage.uwg
    public final void w() {
        p1e p1eVar = this.u;
        p1eVar.c();
        p1eVar.b();
        zyf zyfVar = this.x;
        if (zyfVar != null) {
            zyfVar.b();
        }
    }

    @Override // defpackage.uwg
    public final ob0 x(ao3 ao3Var) {
        this.v.f(ao3Var);
        Object[] objArr = {this.v.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        xa6 xa6VarA = this.g.a();
        xa6VarA.d = ao3Var;
        return xa6VarA.b();
    }

    @Override // defpackage.uwg
    public final ob0 y(ob0 ob0Var, ob0 ob0Var2) {
        die dieVarG = G(e(), (fe7) this.f, ob0Var);
        this.v = dieVarG;
        Object[] objArr = {dieVarG.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p();
        return ob0Var;
    }

    @Override // defpackage.uwg
    public final void z() {
        p1e p1eVar = this.u;
        p1eVar.c();
        p1eVar.b();
        zyf zyfVar = this.x;
        if (zyfVar != null) {
            zyfVar.b();
        }
        F(false);
        d().g(null);
    }
}
