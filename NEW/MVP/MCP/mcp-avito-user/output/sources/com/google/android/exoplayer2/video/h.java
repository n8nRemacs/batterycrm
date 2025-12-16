package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.android.exoplayer2.util.C36600p;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: VideoDecoderGLSurfaceView.java */
/* loaded from: classes6.dex */
public final class h extends GLSurfaceView implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f348272c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f348273b;

    /* compiled from: VideoDecoderGLSurfaceView.java */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: k, reason: collision with root package name */
        public static final float[] f348274k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: l, reason: collision with root package name */
        public static final String[] f348275l = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: m, reason: collision with root package name */
        public static final FloatBuffer f348276m = GlUtil.c(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b, reason: collision with root package name */
        public final h f348277b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f348278c = new int[3];

        /* renamed from: d, reason: collision with root package name */
        public final int[] f348279d = new int[3];

        /* renamed from: e, reason: collision with root package name */
        public final int[] f348280e = new int[3];

        /* renamed from: f, reason: collision with root package name */
        public final int[] f348281f = new int[3];

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<com.google.android.exoplayer2.decoder.l> f348282g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        public C36600p f348283h;

        /* renamed from: i, reason: collision with root package name */
        public int f348284i;

        /* renamed from: j, reason: collision with root package name */
        public com.google.android.exoplayer2.decoder.l f348285j;

        public a(h hVar) {
            this.f348277b = hVar;
            for (int i12 = 0; i12 < 3; i12++) {
                int[] iArr = this.f348280e;
                this.f348281f[i12] = -1;
                iArr[i12] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            com.google.android.exoplayer2.decoder.l andSet = this.f348282g.getAndSet(null);
            if (andSet == null && this.f348285j == null) {
                return;
            }
            if (andSet != null) {
                com.google.android.exoplayer2.decoder.l lVar = this.f348285j;
                if (lVar != null) {
                    lVar.getClass();
                    throw null;
                }
                this.f348285j = andSet;
            }
            this.f348285j.getClass();
            GLES20.glUniformMatrix3fv(this.f348284i, 1, false, f348274k, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i12, int i13) {
            GLES20.glViewport(0, 0, i12, i13);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C36600p c36600p = new C36600p("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f348283h = c36600p;
            GLES20.glVertexAttribPointer(c36600p.b("in_pos"), 2, 5126, false, 0, (Buffer) f348276m);
            int iB2 = this.f348283h.b("in_tc_y");
            int[] iArr = this.f348279d;
            iArr[0] = iB2;
            iArr[1] = this.f348283h.b("in_tc_u");
            iArr[2] = this.f348283h.b("in_tc_v");
            this.f348284i = GLES20.glGetUniformLocation(this.f348283h.f348144a, "mColorConversion");
            GlUtil.b();
            int[] iArr2 = this.f348278c;
            GLES20.glGenTextures(3, iArr2, 0);
            for (int i12 = 0; i12 < 3; i12++) {
                C36600p c36600p2 = this.f348283h;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(c36600p2.f348144a, f348275l[i12]), i12);
                GLES20.glActiveTexture(33984 + i12);
                GlUtil.a(3553, iArr2[i12]);
            }
            GlUtil.b();
            GlUtil.b();
        }
    }

    public h(Context context) {
        super(context, null);
        a aVar = new a(this);
        this.f348273b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(com.google.android.exoplayer2.decoder.l lVar) {
        a aVar = this.f348273b;
        if (aVar.f348282g.getAndSet(lVar) != null) {
            throw null;
        }
        aVar.f348277b.requestRender();
    }

    @Deprecated
    public i getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
