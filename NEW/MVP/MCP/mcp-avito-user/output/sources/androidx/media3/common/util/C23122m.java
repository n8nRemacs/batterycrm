package androidx.media3.common.util;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.HashMap;

/* compiled from: GlProgram.java */
@J
/* renamed from: androidx.media3.common.util.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23122m {

    /* renamed from: a, reason: collision with root package name */
    public final int f47921a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f47922b;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f47923c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f47924d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f47925e;

    /* compiled from: GlProgram.java */
    /* renamed from: androidx.media3.common.util.m$a */
    public static final class a {
    }

    /* compiled from: GlProgram.java */
    /* renamed from: androidx.media3.common.util.m$b */
    public static final class b {
    }

    public C23122m(String str, String str2) throws GlUtil.GlException {
        byte[] bArr;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f47921a = iGlCreateProgram;
        GlUtil.b();
        a(iGlCreateProgram, 35633, str);
        a(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int i12 = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i13 = 1;
        GlUtil.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f47924d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f47922b = new a[iArr2[0]];
        int i14 = 0;
        while (i14 < iArr2[0]) {
            int i15 = this.f47921a;
            int[] iArr3 = new int[i13];
            GLES20.glGetProgramiv(i15, 35722, iArr3, 0);
            int i16 = iArr3[0];
            byte[] bArr2 = new byte[i16];
            GLES20.glGetActiveAttrib(i15, i14, i16, new int[i13], 0, new int[i13], 0, new int[i13], 0, bArr2, 0);
            int i17 = 0;
            while (true) {
                if (i17 >= i16) {
                    i17 = i16;
                    break;
                } else if (bArr2[i17] == 0) {
                    break;
                } else {
                    i17++;
                }
            }
            String str3 = new String(bArr2, 0, i17);
            GLES20.glGetAttribLocation(i15, str3);
            a aVar = new a();
            this.f47922b[i14] = aVar;
            this.f47924d.put(str3, aVar);
            i14++;
            i13 = 1;
        }
        this.f47925e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f47921a, 35718, iArr4, 0);
        this.f47923c = new b[iArr4[0]];
        for (int i18 = 0; i18 < iArr4[i12]; i18++) {
            int i19 = this.f47921a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i19, 35719, iArr5, i12);
            int i22 = iArr5[i12];
            byte[] bArr3 = new byte[i22];
            GLES20.glGetActiveUniform(i19, i18, i22, new int[1], 0, new int[1], 0, new int[1], 0, bArr3, 0);
            int i23 = 0;
            while (true) {
                if (i23 >= i22) {
                    bArr = bArr3;
                    i23 = i22;
                    break;
                } else {
                    if (bArr3[i23] == 0) {
                        bArr = bArr3;
                        break;
                    }
                    i23++;
                }
            }
            i12 = 0;
            String str4 = new String(bArr, 0, i23);
            GLES20.glGetUniformLocation(i19, str4);
            b bVar = new b();
            this.f47923c[i18] = bVar;
            this.f47925e.put(str4, bVar);
        }
        GlUtil.b();
    }

    public static void a(int i12, int i13, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i13);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i12, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }
}
