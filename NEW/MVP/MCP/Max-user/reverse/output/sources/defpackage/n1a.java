package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class n1a implements yc7 {
    public static final Size X = new Size(480, 360);
    public final ArrayList a;
    public final int b;
    public final s32 c;
    public final ExecutorService d;
    public Matrix o;

    public n1a(List list, ExecutorService executorService, s32 s32Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ni0) it.next()).getClass();
        }
        this.a = new ArrayList(list);
        this.b = 1;
        this.c = s32Var;
        this.d = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final jke jkeVar, final int i, final Matrix matrix, final HashMap map, final HashMap map2) throws Exception {
        Image imageV = jkeVar.b.V();
        if (imageV == null) {
            gri.b("MlKitAnalyzer", "Image is null.");
            jkeVar.close();
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        ExecutorService executorService = this.d;
        if (i > size) {
            jkeVar.close();
            executorService.execute(new u02(this, map, jkeVar, map2, 15));
            return;
        }
        final ni0 ni0Var = (ni0) arrayList.get(i);
        try {
            ((u1a) ni0Var).c(imageV, jkeVar.o.a(), matrix).b(executorService, new lva() { // from class: l1a
                @Override // defpackage.lva
                public final void p(Task task) throws Exception {
                    n1a n1aVar = this.a;
                    HashMap map3 = map2;
                    ni0 ni0Var2 = ni0Var;
                    HashMap map4 = map;
                    jke jkeVar2 = jkeVar;
                    int i2 = i;
                    Matrix matrix2 = matrix;
                    if (((ybj) task).d) {
                        map3.put(ni0Var2, new CancellationException("The task is canceled."));
                    } else if (task.h()) {
                        map4.put(ni0Var2, task.f());
                    } else {
                        map3.put(ni0Var2, task.e());
                    }
                    n1aVar.a(jkeVar2, i2 + 1, matrix2, map4, map3);
                }
            });
        } catch (Exception e) {
            map2.put(ni0Var, new RuntimeException("Failed to process the image.", e));
            a(jkeVar, i + 1, matrix, map, map2);
        }
    }

    @Override // defpackage.yc7
    public final void d(Matrix matrix) {
        if (matrix == null) {
            this.o = null;
        } else {
            this.o = new Matrix(matrix);
        }
    }

    @Override // defpackage.yc7
    public final Size g() {
        Iterator it = this.a.iterator();
        Size size = X;
        while (it.hasNext()) {
            ((ni0) it.next()).getClass();
            Size size2 = new Size(1280, 720);
            if (size2.getWidth() * size2.getHeight() > size.getHeight() * size.getWidth()) {
                size = size2;
            }
        }
        return size;
    }

    @Override // defpackage.yc7
    public final int i() {
        return this.b;
    }

    @Override // defpackage.yc7
    public final void k(jke jkeVar) throws Exception {
        qe7 qe7Var = jkeVar.o;
        Matrix matrix = new Matrix();
        int i = this.b;
        if (i != 0) {
            Matrix matrix2 = this.o;
            if (i != 2 && matrix2 == null) {
                gri.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                jkeVar.close();
                return;
            }
            Matrix matrix3 = new Matrix(qe7Var.b());
            RectF rectF = new RectF(0.0f, 0.0f, jkeVar.X, jkeVar.Y);
            int iA = qe7Var.a();
            RectF rectF2 = bhg.a;
            z5j.a("Invalid rotation degrees: " + iA, iA % 90 == 0);
            matrix3.postConcat(bhg.a(rectF, bhg.b(bhg.h(iA)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF, qe7Var.a(), false));
            matrix3.invert(matrix);
            if (i != 2) {
                matrix.postConcat(matrix2);
            }
        }
        a(jkeVar, 0, matrix, new HashMap(), new HashMap());
    }
}
