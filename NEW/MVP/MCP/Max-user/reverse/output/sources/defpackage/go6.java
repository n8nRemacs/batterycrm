package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class go6 extends fo6 {
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    public go6(u75 u75Var, co6 co6Var) {
        String str;
        String str2 = u75Var.a() ? ho6.d : ho6.c;
        try {
            switch (co6Var.a) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains(u9i.SHADER_VAR_TEXTURE_COORDINATES) || !str.contains(u9i.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER)) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.e = -1;
            this.f = -1;
            this.g = -1;
            a();
            int i = this.a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, u9i.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
            this.e = iGlGetUniformLocation;
            ho6.e(iGlGetUniformLocation, u9i.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, u9i.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
            this.g = iGlGetAttribLocation;
            ho6.e(iGlGetAttribLocation, u9i.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.f = iGlGetUniformLocation2;
            ho6.e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // defpackage.fo6
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        ho6.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) ho6.i);
        ho6.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public go6(u75 u75Var, eo6 eo6Var) {
        co6 co6Var;
        if (u75Var.a()) {
            z5j.a("No default sampler shader available for" + eo6Var, eo6Var != eo6.a);
            if (eo6Var == eo6.c) {
                co6Var = ho6.g;
            } else {
                co6Var = ho6.f;
            }
        } else {
            co6Var = ho6.e;
        }
        this(u75Var, co6Var);
    }
}
