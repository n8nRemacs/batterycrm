package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class hzd implements w3h, y22 {
    public int s0;
    public SurfaceTexture t0;
    public byte[] w0;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final poc c = new poc();
    public final dl6 d = new dl6(5, false);
    public final i9g o = new i9g(0);
    public final i9g X = new i9g(0);
    public final float[] Y = new float[16];
    public final float[] Z = new float[16];
    public volatile int u0 = 0;
    public int v0 = -1;

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        t6d.b();
        poc pocVar = this.c;
        pocVar.getClass();
        ggg gggVar = new ggg();
        pocVar.h = gggVar;
        pocVar.b = GLES20.glGetUniformLocation(gggVar.b, "uMvpMatrix");
        pocVar.c = GLES20.glGetUniformLocation(((ggg) pocVar.h).b, "uTexMatrix");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(((ggg) pocVar.h).b, "aPosition");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        t6d.b();
        pocVar.d = iGlGetAttribLocation;
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(((ggg) pocVar.h).b, "aTexCoords");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        t6d.b();
        pocVar.e = iGlGetAttribLocation2;
        pocVar.f = GLES20.glGetUniformLocation(((ggg) pocVar.h).b, "uTexture");
        t6d.b();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        t6d.b();
        this.s0 = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.s0);
        this.t0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new bo6(1, this));
        return this.t0;
    }

    @Override // defpackage.y22
    public final void b(long j, float[] fArr) {
        ((i9g) this.d.d).a(j, fArr);
    }

    @Override // defpackage.y22
    public final void c() {
        this.o.b();
        dl6 dl6Var = this.d;
        ((i9g) dl6Var.d).b();
        dl6Var.a = false;
        this.b.set(true);
    }

    @Override // defpackage.w3h
    public final void d(long j, long j2, gf6 gf6Var, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListC;
        int iF;
        this.o.a(j2, Long.valueOf(j));
        byte[] bArr = gf6Var.F0;
        int i2 = gf6Var.G0;
        byte[] bArr2 = this.w0;
        int i3 = this.v0;
        this.w0 = bArr;
        if (i2 == -1) {
            i2 = this.u0;
        }
        this.v0 = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.w0)) {
            return;
        }
        byte[] bArr3 = this.w0;
        ooc oocVar = null;
        if (bArr3 != null) {
            int i4 = this.v0;
            qyg qygVar = new qyg(bArr3);
            try {
                qygVar.F(4);
                iF = qygVar.f();
                qygVar.E(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iF == 1886547818) {
                qygVar.F(8);
                int i5 = qygVar.b;
                int i6 = qygVar.c;
                while (i5 < i6) {
                    int iF2 = qygVar.f() + i5;
                    if (iF2 > i5 && iF2 <= i6) {
                        int iF3 = qygVar.f();
                        if (iF3 != 2037673328 && iF3 != 1836279920) {
                            qygVar.E(iF2);
                            i5 = iF2;
                        }
                        qygVar.D(iF2);
                        arrayListC = y6j.c(qygVar);
                        break;
                    }
                    break;
                }
                arrayListC = null;
            } else {
                arrayListC = y6j.c(qygVar);
            }
            if (arrayListC != null) {
                int size = arrayListC.size();
                if (size == 1) {
                    noc nocVar = (noc) arrayListC.get(0);
                    oocVar = new ooc(nocVar, nocVar, i4);
                } else if (size == 2) {
                    oocVar = new ooc((noc) arrayListC.get(0), (noc) arrayListC.get(1), i4);
                }
            }
        }
        if (oocVar == null || !poc.b(oocVar)) {
            int i7 = this.v0;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 36; i8 < i11; i11 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i12 = i8 + 1;
                float f5 = (i12 * f) - f3;
                int i13 = 0;
                while (i13 < 73) {
                    int i14 = i12;
                    float f6 = f5;
                    float f7 = radians;
                    int i15 = i9;
                    int i16 = i10;
                    int i17 = 0;
                    int i18 = 2;
                    while (i17 < i18) {
                        float f8 = i17 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i13 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double d3 = f8;
                        fArr[i15] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr[i15 + 1] = (float) (Math.sin(d3) * d);
                        int i19 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr2[i16] = f10 / f9;
                        int i20 = i16 + 2;
                        fArr2[i16 + 1] = ((i8 + i17) * f12) / f7;
                        if ((i13 == 0 && i17 == 0) || (i13 == 72 && i17 == 1)) {
                            System.arraycopy(fArr, i15, fArr, i19, 3);
                            i15 += 6;
                            i = 2;
                            System.arraycopy(fArr2, i16, fArr2, i20, 2);
                            i16 += 4;
                        } else {
                            i = 2;
                            i15 = i19;
                            i16 = i20;
                        }
                        i17++;
                        i18 = i;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i13++;
                    i9 = i15;
                    i10 = i16;
                    i12 = i14;
                    f5 = f6;
                    radians = f7;
                    radians2 = radians2;
                    f = f;
                }
                i8 = i12;
            }
            noc nocVar2 = new noc(new ft0(0, 1, fArr, fArr2));
            oocVar = new ooc(nocVar2, nocVar2, i7);
        }
        this.X.a(j2, oocVar);
    }
}
