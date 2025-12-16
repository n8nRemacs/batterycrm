package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class py {

    /* renamed from: a, reason: collision with root package name */
    private final int f389023a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f389024b;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f389025c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f389026d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f389027e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f389028a;

        private a(String str) {
            this.f389028a = str;
        }

        public static a a(int i12, int i13) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i12, 35722, iArr, 0);
            int i14 = iArr[0];
            byte[] bArr = new byte[i14];
            GLES20.glGetActiveAttrib(i12, i13, i14, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (bArr[i15] == 0) {
                    i14 = i15;
                    break;
                }
                i15++;
            }
            String str = new String(bArr, 0, i14);
            GLES20.glGetAttribLocation(i12, str);
            return new a(str);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f389029a;

        private b(String str) {
            this.f389029a = str;
        }

        public static b a(int i12, int i13) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i12, 35719, iArr, 0);
            int i14 = iArr[0];
            byte[] bArr = new byte[i14];
            GLES20.glGetActiveUniform(i12, i13, i14, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (bArr[i15] == 0) {
                    i14 = i15;
                    break;
                }
                i15++;
            }
            String str = new String(bArr, 0, i14);
            GLES20.glGetUniformLocation(i12, str);
            return new b(str);
        }
    }

    public py() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f389023a = iGlCreateProgram;
        qy.a();
        a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sbA = Cif.a("Unable to link shader program: \n");
            sbA.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            qy.a(sbA.toString());
        }
        GLES20.glUseProgram(iGlCreateProgram);
        this.f389026d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f389024b = new a[iArr2[0]];
        for (int i12 = 0; i12 < iArr2[0]; i12++) {
            a aVarA = a.a(this.f389023a, i12);
            this.f389024b[i12] = aVarA;
            this.f389026d.put(aVarA.f389028a, aVarA);
        }
        this.f389027e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f389023a, 35718, iArr3, 0);
        this.f389025c = new b[iArr3[0]];
        for (int i13 = 0; i13 < iArr3[0]; i13++) {
            b bVarA = b.a(this.f389023a, i13);
            this.f389025c[i13] = bVarA;
            this.f389027e.put(bVarA.f389029a, bVarA);
        }
        qy.a();
    }

    private static void a(int i12, int i13, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i13);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String str2 = GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str;
            int i14 = qy.f389332b;
            ka0.b("GlUtil", str2);
        }
        GLES20.glAttachShader(i12, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        qy.a();
    }

    public final int b(String str) {
        return GLES20.glGetUniformLocation(this.f389023a, str);
    }

    public final int a(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f389023a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        qy.a();
        return iGlGetAttribLocation;
    }
}
