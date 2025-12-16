package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class i0 extends u08 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, Object obj) {
        super(1);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return obj == ((j0) this.b) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                o2 o2Var = (o2) this.b;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == o2Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != o2Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                ((ArrayList) this.b).add((String) obj);
                return qqg.a;
            case 3:
                Throwable th = (Throwable) obj;
                cu7 cu7Var = (cu7) this.b;
                if (th == null) {
                    if (!cu7Var.a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    cu7Var.a.cancel(true);
                } else {
                    ike ikeVar = cu7Var.a;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    ikeVar.j(th);
                }
                return qqg.a;
            case 4:
                yg1 yg1Var = (yg1) obj;
                EGLSurface eGLSurface = ((kt1) this.b).a;
                if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGLDisplay eGLDisplay = yg1Var.e;
                    if (eGLDisplay == null) {
                        throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                    }
                    yg1Var.b(eGLSurface);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
                    yg1.a("clearImage()");
                }
                return qqg.a;
            case 5:
                return obj == ((w8a) this.b) ? "(this)" : String.valueOf(obj);
            case 6:
                return Boolean.valueOf(((Collection) this.b).contains(obj));
            case 7:
                w9c w9cVar = w9c.f;
                w9cVar.d = (q32) obj;
                i6j.a((Context) this.b);
                return w9cVar;
            case 8:
                return ((q32) this.b).j;
            case 9:
                return obj == ((d9a) this.b) ? "(this)" : String.valueOf(obj);
            case 10:
                ((em6) this.b).invoke(obj);
                return obj;
            case 11:
                to7 to7Var = (to7) obj;
                return ((CharSequence) this.b).subSequence(to7Var.a, to7Var.b + 1).toString();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                u61 u61Var = (u61) obj;
                nt1 nt1Var = u61Var.a;
                d3h d3hVar = u61Var.b;
                return Boolean.valueOf(d3hVar.a != 0 && d3hVar.b != 0 && nt1Var.a == cdh.c && ((Boolean) ((ej) this.b).e.invoke(nt1Var.b)).booleanValue());
            default:
                u61 u61Var2 = (u61) obj;
                Point point = (Point) this.b;
                int i = point.x;
                d3h d3hVar2 = u61Var2.b;
                point.x = Integer.max(i, d3hVar2.a);
                point.y = Integer.max(point.y, d3hVar2.b);
                return u61Var2;
        }
    }
}
