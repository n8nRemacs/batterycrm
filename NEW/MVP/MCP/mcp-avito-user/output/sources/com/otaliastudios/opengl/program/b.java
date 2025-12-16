package com.otaliastudios.opengl.program;

import Y61.k;
import android.opengl.GLES20;
import com.otaliastudios.opengl.draw.h;
import com.otaliastudios.opengl.program.c;
import com.otaliastudios.opengl.program.e;
import java.nio.Buffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GlFlatProgram.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/opengl/program/b;", "Lcom/otaliastudios/opengl/program/c;", "<init>", "()V", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class b extends c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f365929f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final e f365930g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e f365931h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final float[] f365932i;

    /* compiled from: GlFlatProgram.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/otaliastudios/opengl/program/b$a;", "", "<init>", "()V", "", "FRAGMENT_SHADER", "Ljava/lang/String;", "VERTEX_SHADER", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        f[] fVarArr = {new f(q11.g.f428992p, "uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n}\n"), new f(q11.g.f428993q, "precision mediump float;\nuniform vec4 uColor;\nvoid main() {\n    gl_FragColor = uColor;\n}\n")};
        f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, 2);
        c.f365933e.getClass();
        int iA2 = c.a.a(fVarArr2);
        super(iA2, true, (f[]) Arrays.copyOf(fVarArr, 2));
        e.f365941c.getClass();
        this.f365929f = new e(iA2, e.b.f365944b, "aPosition", null);
        this.f365930g = b("uMVPMatrix");
        this.f365931h = b("uColor");
        this.f365932i = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    }

    @Override // com.otaliastudios.opengl.program.c
    public final void c() {
        GLES20.glDisableVertexAttribArray(this.f365929f.f365943b);
    }

    @Override // com.otaliastudios.opengl.program.c
    public final void d(@k h hVar, @k float[] fArr) {
        GLES20.glUniformMatrix4fv(this.f365930g.f365942a, 1, false, fArr, 0);
        com.otaliastudios.opengl.core.f.b("glUniformMatrix4fv");
        GLES20.glUniform4fv(this.f365931h.f365942a, 1, this.f365932i, 0);
        com.otaliastudios.opengl.core.f.b("glUniform4fv");
        e eVar = this.f365929f;
        GLES20.glEnableVertexAttribArray(eVar.f365943b);
        com.otaliastudios.opengl.core.f.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(eVar.f365943b, hVar.f365918c, q11.g.f428978b, false, hVar.getF365918c() * 4, (Buffer) hVar.f365927d);
        com.otaliastudios.opengl.core.f.b("glVertexAttribPointer");
    }
}
