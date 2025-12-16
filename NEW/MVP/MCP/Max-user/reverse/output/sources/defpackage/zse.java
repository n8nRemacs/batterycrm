package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zse extends fte {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public zse(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.fte
    public final void a(Matrix matrix, vse vseVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((fte) it.next()).a(this.d, vseVar, i, canvas);
        }
    }
}
