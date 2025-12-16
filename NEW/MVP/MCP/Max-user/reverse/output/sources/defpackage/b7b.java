package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final /* synthetic */ class b7b implements em6 {
    public final /* synthetic */ m7f X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ e7b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean o;

    public /* synthetic */ b7b(e7b e7bVar, int i, long j, int i2, boolean z, m7f m7fVar, int i3, int i4) {
        this.a = e7bVar;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.o = z;
        this.X = m7fVar;
        this.Y = i3;
        this.Z = i4;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Object ipdVar;
        m7f m7fVar = this.X;
        int i = this.Y;
        int i2 = this.Z;
        e7b e7bVar = this.a;
        Context context = e7bVar.a;
        x26 x26VarM = gw0.m(new zn1(new hbd(((wj) e7bVar.b.getValue()).i(this.c)), 7));
        int i3 = this.d;
        int iV = az1.v(i3);
        yi wiVar = xi.a;
        if (iV == 0) {
            try {
                ipdVar = ((wc5) e7bVar.d.getValue()).c(m7fVar.subSequence(i, i2).toString());
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            if (ipdVar instanceof ipd) {
                ipdVar = null;
            }
            Drawable drawable = (Drawable) ipdVar;
            if (drawable != null) {
                wiVar = new wi(drawable);
            }
        } else if (iV != 1) {
            throw new NoWhenBranchMatchedException();
        }
        pi piVar = e7bVar.i;
        boolean z = this.o && i3 == 1;
        wl8 wl8VarC = ((q2b) ((lzf) e7bVar.c.getValue())).c();
        int i4 = this.b;
        ok okVar = new ok(context, i4, x26VarM, wiVar, piVar, z, wl8VarC);
        okVar.setBounds(0, 0, i4, i4);
        return okVar;
    }
}
