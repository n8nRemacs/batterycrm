package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class lkb implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture a;
    public Surface b;
    public final Object c = new Object();
    public boolean d;
    public p6g o;

    public lkb() {
        int iB;
        int iGlCreateProgram;
        p6g p6gVar = new p6g(1.0f, true);
        this.o = p6gVar;
        int iB2 = p6g.b(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (iB2 == 0 || (iB = p6g.b(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0) {
            iGlCreateProgram = 0;
        } else {
            iGlCreateProgram = GLES20.glCreateProgram();
            p6g.a("glCreateProgram");
            if (iGlCreateProgram == 0) {
                Log.e("TextureRender", "Could not create program");
            }
            GLES20.glAttachShader(iGlCreateProgram, iB2);
            p6g.a("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iB);
            p6g.a("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e("TextureRender", "Could not link program: ");
                Log.e("TextureRender", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
        }
        p6gVar.d = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            throw new RuntimeException("failed creating program");
        }
        p6gVar.h = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        p6g.a("glGetAttribLocation aPosition");
        if (p6gVar.h == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        p6gVar.i = GLES20.glGetAttribLocation(p6gVar.d, u9i.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        p6g.a("glGetAttribLocation aTextureCoord");
        if (p6gVar.i == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        p6gVar.f = GLES20.glGetUniformLocation(p6gVar.d, "uMVPMatrix");
        p6g.a("glGetUniformLocation uMVPMatrix");
        if (p6gVar.f == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        p6gVar.g = GLES20.glGetUniformLocation(p6gVar.d, "uSTMatrix");
        p6g.a("glGetUniformLocation uSTMatrix");
        if (p6gVar.g == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i = iArr2[0];
        p6gVar.e = i;
        GLES20.glBindTexture(36197, i);
        p6g.a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        p6g.a("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.o.e);
        this.a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.b = new Surface(this.a);
    }

    public final void a() {
        this.b.release();
        this.o = null;
        this.b = null;
        this.a = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.d = true;
                this.c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
