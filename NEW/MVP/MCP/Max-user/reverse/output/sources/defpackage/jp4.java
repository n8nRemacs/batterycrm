package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class jp4 extends tj0 {
    public static final zjd w;
    public static final float[] x;
    public static final float[] y;
    public final dy h;
    public final wg7 i;
    public final wg7 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final int q;
    public zjd r;
    public Gainmap s;
    public int t;
    public boolean u;
    public boolean v;

    static {
        t76 t76Var = wg7.b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        pyi.a(4, objArr);
        w = wg7.h(4, objArr);
        x = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
        y = new float[]{1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    }

    public jp4(dy dyVar, wg7 wg7Var, wg7 wg7Var2, boolean z) {
        super(z, 1);
        this.h = dyVar;
        this.i = wg7Var;
        this.j = wg7Var2;
        this.k = z;
        int[] iArr = {wg7Var.size(), 16};
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.m = (float[][]) Array.newInstance((Class<?>) cls, wg7Var2.size(), 16);
        this.n = guf.g();
        this.o = guf.g();
        this.p = new float[16];
        this.r = w;
        this.t = -1;
        int iMax = 9729;
        for (int i = 0; i < wg7Var.size(); i++) {
            iMax = Math.max(iMax, ((fr8) wg7Var.get(i)).c());
        }
        this.q = iMax;
    }

    public static jp4 j(Context context, zjd zjdVar, zjd zjdVar2, boolean z) {
        return new jp4(l(context, "shaders/vertex_shader_transformation_es2.glsl", zjdVar2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), wg7.j(zjdVar), wg7.j(zjdVar2), z);
    }

    public static jp4 k(Context context, zjd zjdVar, List list, gf3 gf3Var, int i) throws VideoFrameProcessingException {
        boolean zH = gf3.h(gf3Var);
        boolean z = i == 2;
        dy dyVarL = l(context, zH ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", zH ? "shaders/fragment_shader_oetf_es3.glsl" : z ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i2 = gf3Var.c;
        if (zH) {
            hsi.b(i2 == 7 || i2 == 6);
            dyVarL.B(i2, "uOutputColorTransfer");
        } else if (z) {
            hsi.b(i2 == 3 || i2 == 10);
            dyVarL.B(i2, "uOutputColorTransfer");
        }
        return new jp4(dyVarL, wg7.j(zjdVar), wg7.j(list), zH);
    }

    public static dy l(Context context, String str, String str2) throws VideoFrameProcessingException {
        try {
            dy dyVar = new dy(context, str, str2);
            dyVar.z("uTexTransformationMatrix", guf.g());
            return dyVar;
        } catch (GlUtil$GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static jp4 m(dy dyVar, gf3 gf3Var, gf3 gf3Var2, wg7 wg7Var) {
        boolean zH = gf3.h(gf3Var);
        int i = gf3Var.a;
        boolean z = (i == 1 || i == 2) && gf3Var2.a == 6;
        int i2 = gf3Var2.c;
        if (zH) {
            if (i2 == 3) {
                i2 = 10;
            }
            hsi.b(i2 == 1 || i2 == 10 || i2 == 6 || i2 == 7);
            dyVar.B(i2, "uOutputColorTransfer");
        } else if (z) {
            hsi.b(i2 == 1 || i2 == 6 || i2 == 7);
            dyVar.B(i2, "uOutputColorTransfer");
        } else {
            dyVar.B(0, "uSdrWorkingColorSpace");
            hsi.b(i2 == 3 || i2 == 1);
            dyVar.B(i2, "uOutputColorTransfer");
        }
        return new jp4(dyVar, wg7Var, zjd.o, zH || z);
    }

    public static boolean p(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                hsi.f("A 4x4 transformation matrix must have 16 elements", fArr4.length == 16);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.tj0
    public final c4f a(int i, int i2) {
        return pei.f(this.i, i, i2);
    }

    @Override // defpackage.tj0
    public final void b(int i, long j) throws VideoFrameProcessingException {
        boolean z;
        int i2;
        int i3;
        dy dyVar = this.h;
        wg7 wg7Var = this.j;
        int[] iArr = {wg7Var.size(), 16};
        int i4 = 0;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        if (wg7Var.size() > 0) {
            wg7Var.get(0).getClass();
            throw new ClassCastException();
        }
        boolean zP = p(this.m, fArr);
        float[] fArr2 = this.o;
        if (zP) {
            Matrix.setIdentityM(fArr2, 0);
            if (wg7Var.size() > 0) {
                wg7Var.get(0).getClass();
                throw new ClassCastException();
            }
            z = true;
        } else {
            z = false;
        }
        wg7 wg7Var2 = this.i;
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, wg7Var2.size(), 16);
        int i5 = 0;
        while (true) {
            i2 = 4;
            if (i5 >= wg7Var2.size()) {
                break;
            }
            float[] fArr4 = new float[9];
            ((fr8) wg7Var2.get(i5)).b().getValues(fArr4);
            float[] fArr5 = new float[16];
            fArr5[10] = 1.0f;
            int i6 = 0;
            while (i6 < 3) {
                int i7 = 0;
                while (i7 < 3) {
                    fArr5[((i6 == 2 ? 3 : i6) * 4) + (i7 == 2 ? 3 : i7)] = fArr4[(i6 * 3) + i7];
                    i7++;
                }
                i6++;
            }
            float[] fArr6 = new float[16];
            Matrix.transposeM(fArr6, 0, fArr5, 0);
            fArr3[i5] = fArr6;
            i5++;
        }
        float[][] fArr7 = this.l;
        boolean zP2 = p(fArr7, fArr3);
        float[] fArr8 = this.n;
        if (zP2) {
            Matrix.setIdentityM(fArr8, 0);
            this.r = w;
            int length = fArr7.length;
            int i8 = 0;
            while (true) {
                float[] fArr9 = this.p;
                if (i8 >= length) {
                    int i9 = i4;
                    i3 = i2;
                    Matrix.invertM(fArr9, i9, fArr8, i9);
                    this.r = pei.k(fArr9, this.r);
                    break;
                }
                float[] fArr10 = fArr7[i8];
                Matrix.multiplyMM(this.p, 0, fArr10, 0, this.n, 0);
                System.arraycopy(fArr9, i4, fArr8, i4, fArr9.length);
                zjd zjdVarK = pei.k(fArr10, this.r);
                hsi.a("A polygon must have at least 3 vertices.", zjdVarK.d >= 3);
                int i10 = 4;
                tg7 tg7Var = new tg7(4);
                tg7Var.d(zjdVarK);
                int i11 = 0;
                while (i11 < 6) {
                    float[] fArr11 = pei.a[i11];
                    zjd zjdVarI = tg7Var.i();
                    tg7 tg7Var2 = new tg7(i10);
                    int i12 = i2;
                    for (int i13 = 0; i13 < zjdVarI.d; i13++) {
                        float[] fArr12 = (float[]) zjdVarI.get(i13);
                        float[] fArr13 = (float[]) zjdVarI.get(((r8 + i13) - 1) % zjdVarI.d);
                        if (pei.i(fArr12, fArr11)) {
                            if (!pei.i(fArr13, fArr11)) {
                                float[] fArrE = pei.e(fArr11, fArr11, fArr13, fArr12);
                                if (!Arrays.equals(fArr12, fArrE)) {
                                    tg7Var2.a(fArrE);
                                }
                            }
                            tg7Var2.a(fArr12);
                        } else if (pei.i(fArr13, fArr11)) {
                            float[] fArrE2 = pei.e(fArr11, fArr11, fArr13, fArr12);
                            if (!Arrays.equals(fArr13, fArrE2)) {
                                tg7Var2.a(fArrE2);
                            }
                        }
                    }
                    i11++;
                    tg7Var = tg7Var2;
                    i2 = i12;
                    i10 = 4;
                }
                i3 = i2;
                zjd zjdVarI2 = tg7Var.i();
                this.r = zjdVarI2;
                if (zjdVarI2.d < 3) {
                    break;
                }
                i8++;
                i2 = i3;
                i4 = 0;
            }
            i4 = 1;
        } else {
            i3 = 4;
        }
        boolean z2 = z || i4 != 0;
        if (this.r.d < 3) {
            return;
        }
        if (this.u && !z2 && this.v) {
            return;
        }
        try {
            int i14 = dyVar.b;
            HashMap map = (HashMap) dyVar.Y;
            GLES20.glUseProgram(i14);
            guf.d();
            o();
            int i15 = this.q;
            ou6 ou6Var = (ou6) map.get("uTexSampler");
            ou6Var.getClass();
            ou6Var.e = i;
            ou6Var.f = 0;
            ou6Var.g = i15;
            dyVar.z("uTransformationMatrix", fArr8);
            ou6 ou6Var2 = (ou6) map.get("uRgbMatrix");
            if (ou6Var2 != null) {
                System.arraycopy(fArr2, 0, ou6Var2.c, 0, fArr2.length);
            }
            zjd zjdVar = this.r;
            float[] fArr14 = new float[zjdVar.d * 4];
            int i16 = 0;
            while (i16 < zjdVar.d) {
                int i17 = i3;
                System.arraycopy(zjdVar.get(i16), 0, fArr14, i16 * 4, i17);
                i16++;
                i3 = i17;
            }
            dyVar.x(fArr14);
            dyVar.q();
            GLES20.glDrawArrays(6, 0, this.r.d);
            guf.d();
            this.v = true;
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    @Override // defpackage.tj0
    public final boolean i() {
        return (this.v && this.u) ? false : true;
    }

    public final void n(Gainmap gainmap) throws GlUtil$GlException {
        if (this.k) {
            Gainmap gainmap2 = this.s;
            if (gainmap2 != null && gainmap2.getGamma() == gainmap.getGamma() && gainmap2.getRatioMax() == gainmap.getRatioMax() && gainmap2.getRatioMin() == gainmap.getRatioMin() && gainmap2.getEpsilonHdr() == gainmap.getEpsilonHdr() && gainmap2.getEpsilonSdr() == gainmap.getEpsilonSdr() && gainmap2.getDisplayRatioForFullHdr() == gainmap.getDisplayRatioForFullHdr() && gainmap2.getMinDisplayRatioForHdrTransition() == gainmap.getMinDisplayRatioForHdrTransition() && gainmap2.getGainmapContents() == gainmap.getGainmapContents() && gainmap2.getGainmapContents().getGenerationId() == gainmap.getGainmapContents().getGenerationId()) {
                return;
            }
            this.v = false;
            this.s = gainmap;
            int i = this.t;
            if (i != -1) {
                Bitmap gainmapContents = gainmap.getGainmapContents();
                guf.a(gainmapContents.getWidth(), gainmapContents.getHeight());
                guf.b(3553, i, 9729);
                GLUtils.texImage2D(3553, 0, gainmapContents, 0);
                guf.d();
                return;
            }
            Bitmap gainmapContents2 = gainmap.getGainmapContents();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            guf.d();
            int i2 = iArr[0];
            guf.a(gainmapContents2.getWidth(), gainmapContents2.getHeight());
            guf.b(3553, i2, 9729);
            GLUtils.texImage2D(3553, 0, gainmapContents2, 0);
            guf.d();
            this.t = i2;
        }
    }

    public final void o() throws GlUtil$GlException {
        if (this.s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
        int i = this.t;
        dy dyVar = this.h;
        dyVar.C(i, 1, "uGainmapTexSampler");
        Gainmap gainmap = this.s;
        int i2 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
        float[] gamma = gainmap.getGamma();
        int i3 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) ? 1 : 0;
        int i4 = (uga.a(gamma) && uga.a(gainmap.getRatioMax()) && uga.a(gainmap.getRatioMin())) ? 1 : 0;
        dyVar.B(i2, "uGainmapIsAlpha");
        dyVar.B(i3, "uNoGamma");
        dyVar.B(i4, "uSingleChannel");
        float[] ratioMin = gainmap.getRatioMin();
        dyVar.z("uLogRatioMin", new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
        float[] ratioMax = gainmap.getRatioMax();
        dyVar.z("uLogRatioMax", new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
        dyVar.z("uEpsilonSdr", gainmap.getEpsilonSdr());
        dyVar.z("uEpsilonHdr", gainmap.getEpsilonHdr());
        dyVar.z("uGainmapGamma", gamma);
        dyVar.y("uDisplayRatioHdr", gainmap.getDisplayRatioForFullHdr());
        dyVar.y("uDisplayRatioSdr", gainmap.getMinDisplayRatioForHdrTransition());
        guf.d();
    }

    @Override // defpackage.su6
    public final void release() throws VideoFrameProcessingException {
        try {
            this.a.h();
            try {
                GLES20.glDeleteProgram(this.h.b);
                guf.d();
                int i = this.t;
                if (i != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    guf.d();
                }
            } catch (GlUtil$GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
