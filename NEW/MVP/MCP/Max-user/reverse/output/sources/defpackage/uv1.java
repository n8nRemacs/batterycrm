package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import java.nio.FloatBuffer;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes.dex */
public final /* synthetic */ class uv1 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uv1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        boolean z = false;
        int i = 1;
        switch (this.a) {
            case 0:
                hw1 hw1Var = (hw1) this.b;
                naf nafVar = (naf) this.c;
                uid uidVar = (uid) this.d;
                hw1Var.p().f = 2;
                cm6 cm6Var = nafVar.d;
                if (cm6Var != null) {
                    cm6Var.invoke();
                }
                o51 o51Var = (o51) uidVar.a;
                if (o51Var != null) {
                    hw1Var.h(o51Var);
                }
                return qqg.a;
            case 1:
                ((ge3) this.b).V0.invoke(new up9((ae3) this.c, ((MessageModel) this.d).a, (String) obj));
                return qqg.a;
            case 2:
                ((ge3) this.b).V0.invoke(new up9((ae3) this.c, ((MessageModel) this.d).a, (String) obj));
                return qqg.a;
            case 3:
                f7b f7bVar = (f7b) this.b;
                jqc jqcVar = (jqc) this.c;
                Context context = (Context) this.d;
                f7c f7cVarI = f7bVar.i((String) obj);
                return new f7c(uzi.h(a93.s0.x(context).k(), f7cVarI, uzi.f(f7cVarI.a.toString(), jqcVar.b)), f7cVarI.b);
            case 4:
                sa9 sa9Var = (sa9) this.b;
                pa9 pa9Var = (pa9) this.c;
                pm3 pm3Var = (pm3) this.d;
                mu4 mu4Var = (mu4) obj;
                lg8 lg8Var = lg8.d;
                String str = (String) sa9Var.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "executeWithDetachableLooper", null);
                }
                String str2 = ((ha9) sa9Var.a).c;
                hhg hhgVarT = sa9Var.t(sa9Var.q(pa9Var), new ra9(pa9Var, sa9Var, mu4Var, 0));
                bwf bwfVar = mu4.c;
                Handler handler = new Handler(mu4Var.b, null);
                ha9 ha9Var = (ha9) sa9Var.a;
                la9 la9Var = new la9(handler, hhgVarT, ha9Var.p, ha9Var.q, ha9Var.o);
                try {
                    hhgVarT.f(pm3Var, str2);
                    la9Var.b();
                    String str3 = (String) sa9Var.b;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, str3, "executeWithDetachableLooper, starting loop ...", null);
                    }
                } finally {
                    try {
                        return qqg.a;
                    } finally {
                    }
                }
                if (!fni.a(mu4Var.b.getThread(), Thread.currentThread())) {
                    throw new IllegalStateException("Illegal thread");
                }
                Looper.loop();
                String str4 = (String) sa9Var.b;
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                    l6bVar3.c(lg8Var, str4, "executeWithDetachableLooper, loop completed", null);
                }
                return qqg.a;
            case 5:
                List list = (List) this.b;
                uid uidVar2 = (uid) this.d;
                si9 si9Var = (si9) this.c;
                ku3 ku3Var = (ku3) obj;
                if (!ku3Var.B() && !list.contains(ku3Var) && ku3Var.p() != ((w4e) ((hf9) uidVar2.a).X).s() && ku3Var.p() == si9Var.o) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                wna wnaVar = (wna) this.b;
                wnaVar.getClass();
                return wna.a(wnaVar, (List) this.c, (List) this.d, (Continuation) obj);
            case 7:
                pb2 pb2Var = (pb2) this.b;
                si9 si9Var2 = (si9) this.c;
                d7c d7cVar = (d7c) this.d;
                fo8 fo8Var = (fo8) obj;
                fo8Var.a = pb2Var;
                fo8Var.c = si9Var2;
                fo8Var.e = d7cVar;
                return qqg.a;
            case 8:
                return ((e7c) ((c7c) this.b).b.getValue()).a((pb2) this.d, (si9) this.c);
            case 9:
                sld sldVar = (sld) this.b;
                Size size = (Size) this.c;
                kw6 kw6Var = (kw6) this.d;
                Size size2 = (Size) obj;
                GLES20.glViewport(0, 0, size2.getWidth(), size2.getHeight());
                jca.a("glViewport", new int[0]);
                m2c m2cVar = sldVar.h;
                lk6 lk6Var = sldVar.g;
                if (!size.equals(m2cVar.a)) {
                    m2cVar.a = size;
                }
                m2c m2cVar2 = sldVar.h;
                if (!size2.equals(m2cVar2.b)) {
                    m2cVar2.b = size2;
                }
                m2c m2cVar3 = sldVar.h;
                float[] fArr = m2cVar3.c;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                jca.a("glClearColor", new int[0]);
                GLES20.glClear(16384);
                jca.a("glClear", 1285);
                k1f k1fVar = m2cVar3.f;
                if (k1fVar != null) {
                    k1fVar.i = lk6Var.b;
                    SurfaceTexture surfaceTexture = (SurfaceTexture) lk6Var.c;
                    if (surfaceTexture != null) {
                        surfaceTexture.getTransformMatrix(fArr);
                    }
                    k1fVar.g = fArr;
                    k1fVar.f = m2cVar3.d;
                    i5i i5iVar = (i5i) m2cVar3.e.b;
                    i5iVar.getClass();
                    if (k1fVar.f == null) {
                        float[] fArr2 = new float[16];
                        k1fVar.f = fArr2;
                        Matrix.setIdentityM(fArr2, 0);
                    }
                    if (k1fVar.g == null) {
                        float[] fArr3 = new float[16];
                        k1fVar.g = fArr3;
                        Matrix.setIdentityM(fArr3, 0);
                    }
                    GLES20.glUseProgram(k1fVar.a);
                    jca.a("glUseProgram", new int[0]);
                    GLES20.glUniformMatrix4fv(k1fVar.d, 1, false, k1fVar.f, 0);
                    jca.a("glUniformMatrix4fv", new int[0]);
                    GLES20.glUniformMatrix4fv(k1fVar.e, 1, false, k1fVar.g, 0);
                    jca.a("glUniformMatrix4fv", new int[0]);
                    GLES20.glUniform1i(k1fVar.h, 0);
                    jca.a("glUniform1i", new int[0]);
                    GLES20.glActiveTexture(33984);
                    jca.a("glActiveTexture", new int[0]);
                    GLES20.glBindTexture(36197, k1fVar.i);
                    jca.a("glBindTexture", new int[0]);
                    FloatBuffer floatBuffer = (FloatBuffer) i5iVar.a;
                    int i2 = k1fVar.b;
                    jca.d(i2, floatBuffer);
                    FloatBuffer floatBuffer2 = (FloatBuffer) i5iVar.b;
                    int i3 = k1fVar.c;
                    jca.d(i3, floatBuffer2);
                    GLES20.glDrawArrays(5, 0, 4);
                    jca.a("glDrawArrays", 1285);
                    GLES20.glDisableVertexAttribArray(i2);
                    jca.a("glDisableVertexAttribArray", new int[0]);
                    GLES20.glDisableVertexAttribArray(i3);
                    jca.a("glDisableVertexAttribArray", new int[0]);
                    GLES20.glBindTexture(36197, 0);
                    jca.a("glBindTexture", new int[0]);
                    GLES20.glUseProgram(0);
                    jca.a("glUseProgram", new int[0]);
                }
                if (kw6Var.k()) {
                    a7c a7cVar = sldVar.d;
                    SurfaceTexture surfaceTexture2 = (SurfaceTexture) lk6Var.c;
                    a7cVar.invoke(Long.valueOf(surfaceTexture2 != null ? surfaceTexture2.getTimestamp() : 0L));
                    if (!sldVar.l) {
                        sldVar.l = true;
                        sldVar.c.invoke();
                    }
                }
                return qqg.a;
            case 10:
                View view = (View) this.b;
                d3e d3eVar = (d3e) this.c;
                x2e x2eVar = (x2e) this.d;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                float translationY = 1 - (view.getTranslationY() / (vw4.d().getDisplayMetrics().density * 4.0f));
                float translationY2 = view.getTranslationY() == 0.0f ? vw4.d().getDisplayMetrics().density * 4.0f : view.getTranslationY();
                float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY2, 0.0f);
                valueAnimatorOfFloat.setDuration((long) (200 * translationY));
                valueAnimatorOfFloat.setInterpolator(d3e.w0);
                valueAnimatorOfFloat.addListener(new c3e(d3eVar, x2eVar, view));
                valueAnimatorOfFloat.addUpdateListener(new msd(view, animatedFraction, i));
                valueAnimatorOfFloat.start();
                return valueAnimatorOfFloat;
            default:
                ((um6) this.b).invoke((View) obj, (fxg) this.c, Integer.valueOf(((hxg) this.d).g()));
                return qqg.a;
        }
    }

    public /* synthetic */ uv1(List list, uid uidVar, si9 si9Var) {
        this.a = 5;
        this.b = list;
        this.d = uidVar;
        this.c = si9Var;
    }
}
