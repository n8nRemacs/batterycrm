package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zsd extends OrientationEventListener {
    public int a;
    public final /* synthetic */ sa9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsd(sa9 sa9Var, Context context) {
        super(context);
        this.b = sa9Var;
        this.a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i == -1) {
            return;
        }
        int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
        if (this.a != i2) {
            this.a = i2;
            synchronized (this.b.a) {
                arrayList = new ArrayList(((HashMap) this.b.c).values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                atd atdVar = (atd) it.next();
                atdVar.b.execute(new l30(atdVar, i2, 16));
            }
        }
    }
}
