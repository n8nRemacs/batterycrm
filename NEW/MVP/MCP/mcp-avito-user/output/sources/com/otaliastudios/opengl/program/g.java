package com.otaliastudios.opengl.program;

import X41.j;
import Y61.k;
import Y61.l;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.otaliastudios.opengl.draw.h;
import com.otaliastudios.opengl.program.c;
import com.otaliastudios.opengl.program.e;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t11.C48460a;
import t11.InterfaceC48462c;

/* compiled from: GlTextureProgram.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/program/g;", "Lcom/otaliastudios/opengl/program/c;", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class g extends c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final float[] f365949f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final e f365950g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public FloatBuffer f365951h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final e f365952i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final e f365953j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final e f365954k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final RectF f365955l;

    /* renamed from: m, reason: collision with root package name */
    public int f365956m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public com.otaliastudios.opengl.draw.a f365957n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public com.otaliastudios.opengl.texture.c f365958o;

    /* compiled from: GlTextureProgram.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/otaliastudios/opengl/program/g$a;", "", "<init>", "()V", "", "SIMPLE_FRAGMENT_SHADER", "Ljava/lang/String;", "SIMPLE_VERTEX_SHADER", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @j
    public g() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.otaliastudios.opengl.program.c
    public final void c() {
        GLES20.glDisableVertexAttribArray(this.f365953j.f365943b);
        e eVar = this.f365952i;
        if (eVar != null) {
            GLES20.glDisableVertexAttribArray(eVar.f365943b);
        }
        com.otaliastudios.opengl.texture.c cVar = this.f365958o;
        if (cVar != null) {
            cVar.b();
        }
        com.otaliastudios.opengl.core.f.b("onPostDraw end");
    }

    @Override // com.otaliastudios.opengl.program.c
    public final void d(@k h hVar, @k float[] fArr) {
        if (hVar == null) {
            throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
        }
        com.otaliastudios.opengl.texture.c cVar = this.f365958o;
        if (cVar != null) {
            cVar.a();
        }
        GLES20.glUniformMatrix4fv(this.f365954k.f365942a, 1, false, fArr, 0);
        com.otaliastudios.opengl.core.f.b("glUniformMatrix4fv");
        e eVar = this.f365950g;
        if (eVar != null) {
            GLES20.glUniformMatrix4fv(eVar.f365942a, 1, false, this.f365949f, 0);
            com.otaliastudios.opengl.core.f.b("glUniformMatrix4fv");
        }
        e eVar2 = this.f365953j;
        GLES20.glEnableVertexAttribArray(eVar2.f365943b);
        com.otaliastudios.opengl.core.f.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(eVar2.f365943b, 2, q11.g.f428978b, false, hVar.getF365918c() * 4, (Buffer) hVar.f365927d);
        com.otaliastudios.opengl.core.f.b("glVertexAttribPointer");
        e eVar3 = this.f365952i;
        if (eVar3 == null) {
            return;
        }
        if (!hVar.equals(this.f365957n) || hVar.f365921b != this.f365956m) {
            this.f365957n = hVar;
            this.f365956m = hVar.f365921b;
            RectF rectF = this.f365955l;
            float fMax = -3.4028235E38f;
            int i12 = 0;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            while (hVar.getF365928d().hasRemaining()) {
                float f12 = hVar.getF365928d().get();
                if (i12 % 2 == 0) {
                    fMin = Math.min(fMin, f12);
                    fMax2 = Math.max(fMax2, f12);
                } else {
                    fMax = Math.max(fMax, f12);
                    fMin2 = Math.min(fMin2, f12);
                }
                i12++;
            }
            hVar.getF365928d().rewind();
            rectF.set(fMin, fMax, fMax2, fMin2);
            int iLimit = (hVar.getF365928d().limit() / hVar.getF365918c()) * 2;
            if (this.f365951h.capacity() < iLimit) {
                Object obj = this.f365951h;
                if (obj instanceof InterfaceC48462c) {
                    ((InterfaceC48462c) obj).dispose();
                }
                this.f365951h = C48460a.a(iLimit);
            }
            this.f365951h.clear();
            this.f365951h.limit(iLimit);
            if (iLimit > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    boolean z12 = i13 % 2 == 0;
                    float f13 = hVar.f365927d.get(i13);
                    float f14 = z12 ? rectF.left : rectF.bottom;
                    this.f365951h.put((((f13 - f14) / ((z12 ? rectF.right : rectF.top) - f14)) * 1.0f) + 0.0f);
                    if (i14 >= iLimit) {
                        break;
                    } else {
                        i13 = i14;
                    }
                }
            }
        }
        this.f365951h.rewind();
        GLES20.glEnableVertexAttribArray(eVar3.f365943b);
        com.otaliastudios.opengl.core.f.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(eVar3.f365943b, 2, q11.g.f428978b, false, hVar.getF365918c() * 4, (Buffer) this.f365951h);
        com.otaliastudios.opengl.core.f.b("glVertexAttribPointer");
    }

    public g(int i12, @k String str, @k String str2, @l String str3, @l String str4, boolean z12) {
        e eVar;
        super(i12, z12, new f[0]);
        this.f365949f = q11.h.a(com.otaliastudios.opengl.core.f.f365917a);
        this.f365950g = str4 == null ? null : b(str4);
        this.f365951h = C48460a.a(8);
        e.b bVar = e.b.f365944b;
        if (str3 == null) {
            eVar = null;
        } else {
            e.f365941c.getClass();
            eVar = new e(i12, bVar, str3, null);
        }
        this.f365952i = eVar;
        e.f365941c.getClass();
        this.f365953j = new e(i12, bVar, str, null);
        this.f365954k = b(str2);
        this.f365955l = new RectF();
        this.f365956m = -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(String str, String str2, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n" : str;
        str2 = (i12 & 2) != 0 ? "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n" : str2;
        String str7 = (i12 & 4) != 0 ? "aPosition" : str3;
        String str8 = (i12 & 8) != 0 ? "uMVPMatrix" : str4;
        String str9 = (i12 & 16) != 0 ? "aTextureCoord" : str5;
        str6 = (i12 & 32) != 0 ? "uTexMatrix" : str6;
        c.f365933e.getClass();
        this(c.a.a(new f(q11.g.f428992p, str), new f(q11.g.f428993q, str2)), str7, str8, str9, str6, true);
    }

    public g(int i12, String str, String str2, String str3, String str4, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? "aPosition" : str, (i13 & 4) != 0 ? "uMVPMatrix" : str2, (i13 & 8) != 0 ? "aTextureCoord" : str3, (i13 & 16) != 0 ? "uTexMatrix" : str4, false);
    }
}
