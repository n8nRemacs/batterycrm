package androidx.media3.exoplayer.video;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.media3.common.util.C23122m;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.J;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: VideoDecoderGLSurfaceView.java */
@J
/* loaded from: classes.dex */
public final class e extends GLSurfaceView implements f {

    /* compiled from: VideoDecoderGLSurfaceView.java */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: c, reason: collision with root package name */
        public static final FloatBuffer f50283c;

        /* renamed from: b, reason: collision with root package name */
        public C23122m f50284b;

        static {
            float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
            f50283c = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i12, int i13) {
            GLES20.glViewport(0, 0, i12, i13);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C23122m c23122m = new C23122m("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f50284b = c23122m;
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(c23122m.f47921a, "in_pos");
                GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
                GlUtil.b();
                GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) f50283c);
                GLES20.glEnableVertexAttribArray(GLES20.glGetAttribLocation(this.f50284b.f47921a, "in_tc_y"));
                GlUtil.b();
                throw null;
            } catch (GlUtil.GlException unused) {
            }
        }
    }

    public void setOutputBuffer(androidx.media3.decoder.j jVar) {
        throw null;
    }

    @Deprecated
    public f getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
