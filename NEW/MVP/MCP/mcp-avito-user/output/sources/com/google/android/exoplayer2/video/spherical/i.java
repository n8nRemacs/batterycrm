package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.util.C36600p;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.N;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.spherical.e;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SceneRenderer.java */
/* loaded from: classes6.dex */
final class i implements com.google.android.exoplayer2.video.j, a {

    /* renamed from: j, reason: collision with root package name */
    public int f348374j;

    /* renamed from: k, reason: collision with root package name */
    public SurfaceTexture f348375k;

    /* renamed from: n, reason: collision with root package name */
    @P
    public byte[] f348378n;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f348366b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f348367c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    public final g f348368d = new g();

    /* renamed from: e, reason: collision with root package name */
    public final c f348369e = new c();

    /* renamed from: f, reason: collision with root package name */
    public final N<Long> f348370f = new N<>();

    /* renamed from: g, reason: collision with root package name */
    public final N<e> f348371g = new N<>();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f348372h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f348373i = new float[16];

    /* renamed from: l, reason: collision with root package name */
    public volatile int f348376l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f348377m = -1;

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.b();
        g gVar = this.f348368d;
        gVar.getClass();
        C36600p c36600p = new C36600p("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        gVar.f348355c = c36600p;
        gVar.f348356d = GLES20.glGetUniformLocation(c36600p.f348144a, "uMvpMatrix");
        gVar.f348357e = GLES20.glGetUniformLocation(gVar.f348355c.f348144a, "uTexMatrix");
        gVar.f348358f = gVar.f348355c.b("aPosition");
        gVar.f348359g = gVar.f348355c.b("aTexCoords");
        gVar.f348360h = GLES20.glGetUniformLocation(gVar.f348355c.f348144a, "uTexture");
        GlUtil.b();
        U.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.b();
        int i12 = iArr[0];
        GlUtil.a(36197, i12);
        this.f348374j = i12;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f348374j);
        this.f348375k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f348365b.f348366b.set(true);
            }
        });
        return this.f348375k;
    }

    @Override // com.google.android.exoplayer2.video.spherical.a
    public final void c() {
        this.f348370f.b();
        c cVar = this.f348369e;
        cVar.f348332c.b();
        cVar.f348333d = false;
        this.f348367c.set(true);
    }

    @Override // com.google.android.exoplayer2.video.spherical.a
    public final void d(long j12, float[] fArr) {
        this.f348369e.f348332c.a(j12, fArr);
    }

    @Override // com.google.android.exoplayer2.video.j
    public final void e(long j12, long j13, I i12, @P MediaFormat mediaFormat) {
        int i13;
        float[] fArr;
        int i14;
        ArrayList<e.b> arrayListA;
        int iD2;
        this.f348370f.a(j13, Long.valueOf(j12));
        byte[] bArr = i12.f343486w;
        int i15 = i12.f343487x;
        byte[] bArr2 = this.f348378n;
        int i16 = this.f348377m;
        this.f348378n = bArr;
        if (i15 == -1) {
            i15 = this.f348376l;
        }
        this.f348377m = i15;
        if (i16 == i15 && Arrays.equals(bArr2, this.f348378n)) {
            return;
        }
        byte[] bArr3 = this.f348378n;
        e eVar = null;
        if (bArr3 != null) {
            int i17 = this.f348377m;
            F f12 = new F(bArr3);
            try {
                f12.C(4);
                iD2 = f12.d();
                f12.B(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iD2 == 1886547818) {
                f12.C(8);
                int i18 = f12.f348071b;
                int i19 = f12.f348072c;
                while (i18 < i19) {
                    int iD3 = f12.d() + i18;
                    if (iD3 > i18 && iD3 <= i19) {
                        int iD4 = f12.d();
                        if (iD4 != 2037673328 && iD4 != 1836279920) {
                            f12.B(iD3);
                            i18 = iD3;
                        }
                        f12.A(iD3);
                        arrayListA = f.a(f12);
                        break;
                    }
                    break;
                }
                arrayListA = null;
            } else {
                arrayListA = f.a(f12);
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    e.b bVar = arrayListA.get(0);
                    eVar = new e(bVar, bVar, i17);
                } else if (size == 2) {
                    eVar = new e(arrayListA.get(0), arrayListA.get(1), i17);
                }
            }
        }
        if (eVar == null || !g.a(eVar)) {
            int i22 = this.f348377m;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f13 = radians / 36;
            float f14 = radians2 / 72;
            float[] fArr2 = new float[15984];
            float[] fArr3 = new float[10656];
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = 36; i23 < i26; i26 = 36) {
                float f15 = radians / 2.0f;
                float f16 = (i23 * f13) - f15;
                int i27 = i23 + 1;
                float f17 = (i27 * f13) - f15;
                int i28 = 0;
                while (i28 < 73) {
                    float f18 = f17;
                    int i29 = i27;
                    float f19 = f16;
                    int i32 = i24;
                    int i33 = i25;
                    int i34 = 2;
                    int i35 = 0;
                    while (i35 < i34) {
                        float f22 = i28 * f14;
                        float f23 = f14;
                        int i36 = i28;
                        double d12 = 50.0f;
                        int i37 = i22;
                        double d13 = (3.1415927f + f22) - (radians2 / 2.0f);
                        float f24 = radians;
                        double d14 = i35 == 0 ? f19 : f18;
                        int i38 = i35;
                        float f25 = f13;
                        fArr2[i32] = -((float) (Math.cos(d14) * Math.sin(d13) * d12));
                        float[] fArr4 = fArr3;
                        int i39 = i23;
                        fArr2[i32 + 1] = (float) (Math.sin(d14) * d12);
                        int i42 = i32 + 3;
                        fArr2[i32 + 2] = (float) (Math.cos(d14) * Math.cos(d13) * d12);
                        fArr4[i33] = f22 / radians2;
                        int i43 = i33 + 2;
                        fArr4[i33 + 1] = ((i39 + i38) * f25) / f24;
                        if (i36 == 0 && i38 == 0) {
                            i14 = i38;
                            i13 = i36;
                        } else {
                            i13 = i36;
                            if (i13 == 72) {
                                i14 = i38;
                                if (i14 != 1) {
                                    fArr = fArr4;
                                }
                            } else {
                                fArr = fArr4;
                                i14 = i38;
                            }
                            i34 = 2;
                            i33 = i43;
                            i32 = i42;
                            int i44 = i14 + 1;
                            i28 = i13;
                            fArr3 = fArr;
                            f14 = f23;
                            i22 = i37;
                            radians = f24;
                            i23 = i39;
                            f13 = f25;
                            i35 = i44;
                        }
                        System.arraycopy(fArr2, i32, fArr2, i42, 3);
                        i32 += 6;
                        fArr = fArr4;
                        i34 = 2;
                        System.arraycopy(fArr, i33, fArr, i43, 2);
                        i33 += 4;
                        int i442 = i14 + 1;
                        i28 = i13;
                        fArr3 = fArr;
                        f14 = f23;
                        i22 = i37;
                        radians = f24;
                        i23 = i39;
                        f13 = f25;
                        i35 = i442;
                    }
                    i28++;
                    i24 = i32;
                    i25 = i33;
                    f17 = f18;
                    i27 = i29;
                    f16 = f19;
                    i22 = i22;
                }
                i23 = i27;
            }
            e.b bVar2 = new e.b(new e.c(0, fArr2, fArr3, 1));
            eVar = new e(bVar2, bVar2, i22);
        }
        this.f348371g.a(j13, eVar);
    }
}
